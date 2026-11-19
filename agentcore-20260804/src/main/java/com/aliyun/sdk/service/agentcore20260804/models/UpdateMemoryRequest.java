// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link UpdateMemoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemoryRequest</p>
 */
public class UpdateMemoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateMemoryRequestBody body;

    private UpdateMemoryRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.memoryId = builder.memoryId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemoryRequest create() {
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
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return memoryId
     */
    public String getMemoryId() {
        return this.memoryId;
    }

    /**
     * @return body
     */
    public UpdateMemoryRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateMemoryRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private String memoryId; 
        private UpdateMemoryRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemoryRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.memoryId = request.memoryId;
            this.body = request.body;
        } 

        /**
         * <p>The AgentCore workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the memory store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>The ID of the long-term memory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        public Builder memoryId(String memoryId) {
            this.putPathParameter("memoryId", memoryId);
            this.memoryId = memoryId;
            return this;
        }

        /**
         * <p>The request to update a memory.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateMemoryRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateMemoryRequest build() {
            return new UpdateMemoryRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMemoryRequest} extends {@link TeaModel}
     *
     * <p>UpdateMemoryRequest</p>
     */
    public static class UpdateMemoryRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private UpdateMemoryRequestBody(Builder builder) {
            this.metadata = builder.metadata;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateMemoryRequestBody create() {
            return builder().build();
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.Map<String, String> metadata; 
            private String text; 

            private Builder() {
            } 

            private Builder(UpdateMemoryRequestBody model) {
                this.metadata = model.metadata;
                this.text = model.text;
            } 

            /**
             * <p>The updated string key-value metadata. Provide at least one of Text or Metadata. A maximum of 16 keys are allowed. The maximum length is 64 characters for a key and 1,024 characters for a value.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The updated memory text. Provide at least one of Text or Metadata. The size cannot exceed 32,000 UTF-8 bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>The user enjoys hiking on weekends</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public UpdateMemoryRequestBody build() {
                return new UpdateMemoryRequestBody(this);
            } 

        } 

    }
}
