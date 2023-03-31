// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExecuteOperationResultRequest} extends {@link RequestModel}
 *
 * <p>GetExecuteOperationResultRequest</p>
 */
public class GetExecuteOperationResultRequest extends Request {
    @Body
    @NameInMap("OperationId")
    @Validation(required = true)
    private String operationId;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private GetExecuteOperationResultRequest(Builder builder) {
        super(builder);
        this.operationId = builder.operationId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExecuteOperationResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<GetExecuteOperationResultRequest, Builder> {
        private String operationId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetExecuteOperationResultRequest request) {
            super(request);
            this.operationId = request.operationId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the operation.
         */
        public Builder operationId(String operationId) {
            this.putBodyParameter("OperationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * The ID of the resource group. This parameter is specified to verify the permissions on the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public GetExecuteOperationResultRequest build() {
            return new GetExecuteOperationResultRequest(this);
        } 

    } 

}
