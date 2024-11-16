/*
 * Copyright 2023-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.embedding;

import org.springframework.ai.model.ModelOptions;
import org.springframework.lang.Nullable;

/**
 * Options for embedding models.
 *
 * @author Christian Tzolov
 * @author Thomas Vitale
 */
public interface EmbeddingOptions extends ModelOptions {

	/**
	 * Use the {@link EmbeddingOptionsBuilder} instead.
	 */
	@Deprecated(since = "1.0.0", forRemoval = true)
	EmbeddingOptions EMPTY = EmbeddingOptionsBuilder.builder().build();

	@Nullable
	String getModel();

	@Nullable
	Integer getDimensions();

}
