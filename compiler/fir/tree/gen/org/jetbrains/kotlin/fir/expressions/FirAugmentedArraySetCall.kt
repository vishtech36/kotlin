/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// This file was generated automatically. See compiler/fir/tree/tree-generator/Readme.md.
// DO NOT MODIFY IT MANUALLY.

package org.jetbrains.kotlin.fir.expressions

import org.jetbrains.kotlin.KtSourceElement
import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.FirPureAbstractElement
import org.jetbrains.kotlin.fir.references.FirReference
import org.jetbrains.kotlin.fir.visitors.*

/**
 * Generated from: [org.jetbrains.kotlin.fir.tree.generator.FirTreeBuilder.augmentedArraySetCall]
 */
abstract class FirAugmentedArraySetCall : FirPureAbstractElement(), FirStatement {
    abstract override val source: KtSourceElement?
    abstract override val annotations: List<FirAnnotation>
    abstract val lhsGetCall: FirFunctionCall
    abstract val rhs: FirExpression
    abstract val operation: FirOperation
    abstract val calleeReference: FirReference
    abstract val arrayAccessSource: KtSourceElement?

    override fun <R, D> accept(visitor: FirVisitor<R, D>, data: D): R =
        visitor.visitAugmentedArraySetCall(this, data)

    @Suppress("UNCHECKED_CAST")
    override fun <E : FirElement, D> transform(transformer: FirTransformer<D>, data: D): E =
        transformer.transformAugmentedArraySetCall(this, data) as E

    abstract override fun replaceAnnotations(newAnnotations: List<FirAnnotation>)

    abstract fun replaceCalleeReference(newCalleeReference: FirReference)

    abstract override fun <D> transformAnnotations(transformer: FirTransformer<D>, data: D): FirAugmentedArraySetCall
}
