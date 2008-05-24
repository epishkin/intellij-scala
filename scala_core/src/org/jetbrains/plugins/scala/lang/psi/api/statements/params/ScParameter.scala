package org.jetbrains.plugins.scala.lang.psi.api.statements.params

import org.jetbrains.plugins.scala.lang.psi.ScalaPsiElement
import org.jetbrains.plugins.scala.lang.psi.api.toplevel.ScNamedElement
import org.jetbrains.plugins.scala.lang.psi.api.base.types._
import com.intellij.psi._
import org.jetbrains.plugins.scala.lang.psi.api.statements.params._

/** 
* @author Alexander Podkhalyuzin
* Date: 22.02.2008
*/

trait ScParameter extends ScNamedElement with PsiParameter {

  def getTypeElement: PsiTypeElement

  def typeElement: Option[ScTypeElement]

  def paramType: Option[ScParameterType]

  //todo implement me!
  def hasModifierProperty(p: String) = false

}