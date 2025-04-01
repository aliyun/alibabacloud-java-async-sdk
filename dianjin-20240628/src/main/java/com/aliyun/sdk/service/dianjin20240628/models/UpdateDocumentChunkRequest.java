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
 * {@link UpdateDocumentChunkRequest} extends {@link RequestModel}
 *
 * <p>UpdateDocumentChunkRequest</p>
 */
public class UpdateDocumentChunkRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chunks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Chunks> chunks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    private UpdateDocumentChunkRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.chunks = builder.chunks;
        this.libraryId = builder.libraryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDocumentChunkRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDocumentChunkRequest, Builder> {
        private String workspaceId; 
        private java.util.List<Chunks> chunks; 
        private String libraryId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDocumentChunkRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.chunks = request.chunks;
            this.libraryId = request.libraryId;
        } 

        /**
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
         * <p>This parameter is required.</p>
         */
        public Builder chunks(java.util.List<Chunks> chunks) {
            this.putBodyParameter("chunks", chunks);
            this.chunks = chunks;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sjdgdsfg</p>
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        @Override
        public UpdateDocumentChunkRequest build() {
            return new UpdateDocumentChunkRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDocumentChunkRequest} extends {@link TeaModel}
     *
     * <p>UpdateDocumentChunkRequest</p>
     */
    public static class Chunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("chunkText")
        @com.aliyun.core.annotation.Validation(required = true)
        private String chunkText;

        private Chunks(Builder builder) {
            this.chunkId = builder.chunkId;
            this.chunkText = builder.chunkText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chunks create() {
            return builder().build();
        }

        /**
         * @return chunkId
         */
        public String getChunkId() {
            return this.chunkId;
        }

        /**
         * @return chunkText
         */
        public String getChunkText() {
            return this.chunkText;
        }

        public static final class Builder {
            private String chunkId; 
            private String chunkText; 

            private Builder() {
            } 

            private Builder(Chunks model) {
                this.chunkId = model.chunkId;
                this.chunkText = model.chunkText;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1987834755763847</p>
             */
            public Builder chunkId(String chunkId) {
                this.chunkId = chunkId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder chunkText(String chunkText) {
                this.chunkText = chunkText;
                return this;
            }

            public Chunks build() {
                return new Chunks(this);
            } 

        } 

    }
}
