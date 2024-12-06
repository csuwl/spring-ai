package org.springframework.ai.vectorstore.mariadb;

import org.junit.Test;
import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MariaDBStoreAddDocuments {

	@Test
	public void testAdd() {
		// Given
		var jdbcTemplate = mock(JdbcTemplate.class);
		var embeddingModel = mock(EmbeddingModel.class);
		var mariadbVectorStore = new MariaDBVectorStore.Builder(jdbcTemplate, embeddingModel)
			.withMaxDocumentBatchSize(1000)
			.build();

		// Testing with 9989 documents
		var documents = Collections.nCopies(9989, new Document("foo"));
		var embeddings = Collections.nCopies(9989, new float[10]);

		when(embeddingModel.embed(eq(documents), any(), any())).thenReturn(embeddings);
		// When
		mariadbVectorStore.doAdd(documents);
	}

}
