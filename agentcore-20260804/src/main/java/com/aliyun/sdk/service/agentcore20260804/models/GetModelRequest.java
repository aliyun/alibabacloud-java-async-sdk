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
 * {@link GetModelRequest} extends {@link RequestModel}
 *
 * <p>GetModelRequest</p>
 */
public class GetModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    private GetModelRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.modelId = builder.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelRequest create() {
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

    public static final class Builder extends Request.Builder<GetModelRequest, Builder> {
        private String workspaceId; 
        private String modelId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.modelId = request.modelId;
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

        @Override
        public GetModelRequest build() {
            return new GetModelRequest(this);
        } 

    } 

}
