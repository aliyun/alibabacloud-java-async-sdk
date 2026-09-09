// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePredefinedDocumentRequest} extends {@link RequestModel}
 *
 * <p>CreatePredefinedDocumentRequest</p>
 */
public class CreatePredefinedDocumentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chunks")
    private java.util.List<Chunks> chunks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    private String libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private CreatePredefinedDocumentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.chunks = builder.chunks;
        this.libraryId = builder.libraryId;
        this.metadata = builder.metadata;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePredefinedDocumentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return chunks
     */
    public java.util.List<Chunks> getChunks() {
        return this.chunks;
    }

    /**
     * @return libraryId
     */
    public String getLibraryId() {
        return this.libraryId;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreatePredefinedDocumentRequest, Builder> {
        private String workspaceId; 
        private java.util.List<Chunks> chunks; 
        private String libraryId; 
        private java.util.Map<String, ?> metadata; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreatePredefinedDocumentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.chunks = request.chunks;
            this.libraryId = request.libraryId;
            this.metadata = request.metadata;
            this.title = request.title;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>A list of document chunks.</p>
         */
        public Builder chunks(java.util.List<Chunks> chunks) {
            this.putBodyParameter("chunks", chunks);
            this.chunks = chunks;
            return this;
        }

        /**
         * <p>The ID of the document library.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3</p>
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;a&quot;: &quot;1&quot;}</p>
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The title of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>测试文档</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreatePredefinedDocumentRequest build() {
            return new CreatePredefinedDocumentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePredefinedDocumentRequest} extends {@link TeaModel}
     *
     * <p>CreatePredefinedDocumentRequest</p>
     */
    public static class Chunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkMeta")
        private java.util.Map<String, ?> chunkMeta;

        @com.aliyun.core.annotation.NameInMap("chunkOrder")
        private Integer chunkOrder;

        @com.aliyun.core.annotation.NameInMap("chunkText")
        private String chunkText;

        @com.aliyun.core.annotation.NameInMap("chunkType")
        private String chunkType;

        private Chunks(Builder builder) {
            this.chunkMeta = builder.chunkMeta;
            this.chunkOrder = builder.chunkOrder;
            this.chunkText = builder.chunkText;
            this.chunkType = builder.chunkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chunks create() {
            return builder().build();
        }

        /**
         * @return chunkMeta
         */
        public java.util.Map<String, ?> getChunkMeta() {
            return this.chunkMeta;
        }

        /**
         * @return chunkOrder
         */
        public Integer getChunkOrder() {
            return this.chunkOrder;
        }

        /**
         * @return chunkText
         */
        public String getChunkText() {
            return this.chunkText;
        }

        /**
         * @return chunkType
         */
        public String getChunkType() {
            return this.chunkType;
        }

        public static final class Builder {
            private java.util.Map<String, ?> chunkMeta; 
            private Integer chunkOrder; 
            private String chunkText; 
            private String chunkType; 

            private Builder() {
            } 

            private Builder(Chunks model) {
                this.chunkMeta = model.chunkMeta;
                this.chunkOrder = model.chunkOrder;
                this.chunkText = model.chunkText;
                this.chunkType = model.chunkType;
            } 

            /**
             * <p>The metadata for the document chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;a&quot;: &quot;1&quot;}</p>
             */
            public Builder chunkMeta(java.util.Map<String, ?> chunkMeta) {
                this.chunkMeta = chunkMeta;
                return this;
            }

            /**
             * <p>The order of the chunk. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chunkOrder(Integer chunkOrder) {
                this.chunkOrder = chunkOrder;
                return this;
            }

            /**
             * <p>The text content of the document chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一段测试文本</p>
             */
            public Builder chunkText(String chunkText) {
                this.chunkText = chunkText;
                return this;
            }

            /**
             * <p>The type of the document chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder chunkType(String chunkType) {
                this.chunkType = chunkType;
                return this;
            }

            public Chunks build() {
                return new Chunks(this);
            } 

        } 

    }
}
