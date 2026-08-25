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
 * {@link BatchDeleteModelsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteModelsRequest</p>
 */
public class BatchDeleteModelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private BatchDeleteModelsRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private BatchDeleteModelsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteModelsRequest create() {
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
     * @return body
     */
    public BatchDeleteModelsRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<BatchDeleteModelsRequest, Builder> {
        private String workspaceId; 
        private BatchDeleteModelsRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteModelsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(BatchDeleteModelsRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public BatchDeleteModelsRequest build() {
            return new BatchDeleteModelsRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchDeleteModelsRequest} extends {@link TeaModel}
     *
     * <p>BatchDeleteModelsRequest</p>
     */
    public static class BatchDeleteModelsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> modelIds;

        private BatchDeleteModelsRequestBody(Builder builder) {
            this.modelIds = builder.modelIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchDeleteModelsRequestBody create() {
            return builder().build();
        }

        /**
         * @return modelIds
         */
        public java.util.List<String> getModelIds() {
            return this.modelIds;
        }

        public static final class Builder {
            private java.util.List<String> modelIds; 

            private Builder() {
            } 

            private Builder(BatchDeleteModelsRequestBody model) {
                this.modelIds = model.modelIds;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder modelIds(java.util.List<String> modelIds) {
                this.modelIds = modelIds;
                return this;
            }

            public BatchDeleteModelsRequestBody build() {
                return new BatchDeleteModelsRequestBody(this);
            } 

        } 

    }
}
