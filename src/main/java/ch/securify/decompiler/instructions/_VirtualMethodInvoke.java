/*
 *  Copyright 2018 Secure, Reliable, and Intelligent Systems Lab, ETH Zurich
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */


package ch.securify.decompiler.instructions;

import ch.securify.decompiler.Variable;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _VirtualMethodInvoke extends Jump implements _VirtualInstruction {

	private final String methodName;

	public _VirtualMethodInvoke(String methodName) {
		super(methodName);

		this.methodName = methodName;
	}

	@Override
	public String getStringRepresentation() {
		return "(" + Arrays.stream(getOutput()).map(Variable::toString).collect(Collectors.joining(", ")) + ") = " +
				methodName + "(" + Arrays.stream(getInput()).map(Variable::toString).collect(Collectors.joining(", ")) + ")";
	}

}
