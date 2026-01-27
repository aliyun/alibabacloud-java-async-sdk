// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link OperateNodeRequest} extends {@link RequestModel}
 *
 * <p>OperateNodeRequest</p>
 */
public class OperateNodeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperationParameters")
    private NodeOperationParameters operationParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private OperateNodeRequest(Builder builder) {
        super(builder);
        this.nodeId = builder.nodeId;
        this.operation = builder.operation;
        this.operationParameters = builder.operationParameters;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return operationParameters
     */
    public NodeOperationParameters getOperationParameters() {
        return this.operationParameters;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<OperateNodeRequest, Builder> {
        private String nodeId; 
        private String operation; 
        private NodeOperationParameters operationParameters; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(OperateNodeRequest request) {
            super(request);
            this.nodeId = request.nodeId;
            this.operation = request.operation;
            this.operationParameters = request.operationParameters;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lingjunxxxx-mgxxx-xxxx</p>
         */
        public Builder nodeId(String nodeId) {
            this.putPathParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Cordon</p>
         */
        public Builder operation(String operation) {
            this.putBodyParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * OperationParameters.
         */
        public Builder operationParameters(NodeOperationParameters operationParameters) {
            this.putBodyParameter("OperationParameters", operationParameters);
            this.operationParameters = operationParameters;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public OperateNodeRequest build() {
            return new OperateNodeRequest(this);
        } 

    } 

}
