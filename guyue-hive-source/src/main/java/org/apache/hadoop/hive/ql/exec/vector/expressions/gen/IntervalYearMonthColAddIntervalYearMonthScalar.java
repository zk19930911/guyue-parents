/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package org.apache.hadoop.hive.ql.exec.vector.expressions.gen;


import org.apache.hadoop.hive.ql.exec.vector.VectorExpressionDescriptor;


/**
 * Generated from template DTIColumnArithmeticDTIScalarNoConvert.txt, which covers arithmetic
 * expressions between a datetime/interval column and a datetime/interval scalar.
 * No type conversion is needed, the operations can be performed using the vectorized long value
 */
public class IntervalYearMonthColAddIntervalYearMonthScalar extends LongColAddLongScalar {

  private static final long serialVersionUID = 1L;

  public IntervalYearMonthColAddIntervalYearMonthScalar(int colNum, long value, int outputColumn) {
    super(colNum, value, outputColumn);
  }

  public IntervalYearMonthColAddIntervalYearMonthScalar() {
    super();
  }

  @Override
  public VectorExpressionDescriptor.Descriptor getDescriptor() {
    return (new VectorExpressionDescriptor.Builder())
        .setMode(
            VectorExpressionDescriptor.Mode.PROJECTION)
        .setNumArguments(2)
        .setArgumentTypes(
            VectorExpressionDescriptor.ArgumentType.getType("interval_year_month"),
            VectorExpressionDescriptor.ArgumentType.getType("interval_year_month"))
        .setInputExpressionTypes(
            VectorExpressionDescriptor.InputExpressionType.COLUMN,
            VectorExpressionDescriptor.InputExpressionType.SCALAR).build();
  }
}

