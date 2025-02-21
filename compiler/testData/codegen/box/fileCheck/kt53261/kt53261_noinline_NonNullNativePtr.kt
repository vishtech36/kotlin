// TARGET_BACKEND: NATIVE
// FILECHECK_STAGE: CStubs

import kotlinx.cinterop.*

// CHECK-AAPCS-OPT-LABEL: define i1 @"kfun:kotlin.native.internal.NonNullNativePtr#equals(kotlin.Any?){}kotlin.Boolean"(i8* %0, %struct.ObjHeader* %1)
// CHECK-DEFAULTABI-OPT-LABEL: define zeroext i1 @"kfun:kotlin.native.internal.NonNullNativePtr#equals(kotlin.Any?){}kotlin.Boolean"(i8* %0, %struct.ObjHeader* %1)
// CHECK-WINDOWSX64-OPT-LABEL: define zeroext i1 @"kfun:kotlin.native.internal.NonNullNativePtr#equals(kotlin.Any?){}kotlin.Boolean"(i8* %0, %struct.ObjHeader* %1)
// CHECK-OPT: call i8* @"kfun:kotlin.native.internal#<NonNullNativePtr-unbox>(kotlin.Any?){}kotlin.native.internal.NonNullNativePtr?"

// CHECK-DEBUG-LABEL: define %struct.ObjHeader* @"kfun:#box(){}kotlin.String"
// CHECK-AAPCS-DEBUG: invoke i1 @"kfun:kotlin.Any#equals(kotlin.Any?){}kotlin.Boolean-trampoline"
// CHECK-DEFAULTABI-DEBUG: invoke zeroext i1 @"kfun:kotlin.Any#equals(kotlin.Any?){}kotlin.Boolean-trampoline"
// CHECK-WINDOWSX64-DEBUG: invoke zeroext i1 @"kfun:kotlin.Any#equals(kotlin.Any?){}kotlin.Boolean-trampoline"
// CHECK-DEBUG-LABEL: epilogue:

@kotlinx.cinterop.ExperimentalForeignApi
fun box(): String = memScoped {
    val var1: IntVar = alloc()
    val var2: IntVar = alloc()
    // The first one is K1, the second one is K2.
    @Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
    return if (var1.ptr.value as Any == var2.ptr.value as Any) "FAIL" else "OK"
}
