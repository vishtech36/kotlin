/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// This file was generated automatically. See compiler/fir/tree/tree-generator/Readme.md.
// DO NOT MODIFY IT MANUALLY.

package org.jetbrains.kotlin.fir.declarations

import org.jetbrains.kotlin.KtSourceElement
import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.FirPureAbstractElement
import org.jetbrains.kotlin.fir.symbols.impl.FirTypeParameterSymbol
import org.jetbrains.kotlin.fir.visitors.*

/**
 * Generated from: [org.jetbrains.kotlin.fir.tree.generator.FirTreeBuilder.constructedClassTypeParameterRef]
 */
abstract class FirConstructedClassTypeParameterRef : FirPureAbstractElement(), FirTypeParameterRef {
    abstract override val source: KtSourceElement?
    abstract override val symbol: FirTypeParameterSymbol

    override fun <R, D> accept(visitor: FirVisitor<R, D>, data: D): R =
        visitor.visitConstructedClassTypeParameterRef(this, data)

    @Suppress("UNCHECKED_CAST")
    override fun <E : FirElement, D> transform(transformer: FirTransformer<D>, data: D): E =
        transformer.transformConstructedClassTypeParameterRef(this, data) as E
}
