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
 * {@link UpdateModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelRequest</p>
 */
public class UpdateModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateModelRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateModelRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.modelId = builder.modelId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelRequest create() {
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
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return body
     */
    public UpdateModelRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateModelRequest, Builder> {
        private String workspaceId; 
        private String modelId; 
        private UpdateModelRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.modelId = request.modelId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-1</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateModelRequestBody body) {
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
        public UpdateModelRequest build() {
            return new UpdateModelRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelRequest</p>
     */
    public static class UpdateModelRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        @com.aliyun.core.annotation.Validation(required = true)
        private String description;

        private UpdateModelRequestBody(Builder builder) {
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateModelRequestBody create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String description; 

            private Builder() {
            } 

            private Builder(UpdateModelRequestBody model) {
                this.description = model.description;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public UpdateModelRequestBody build() {
                return new UpdateModelRequestBody(this);
            } 

        } 

    }
}
