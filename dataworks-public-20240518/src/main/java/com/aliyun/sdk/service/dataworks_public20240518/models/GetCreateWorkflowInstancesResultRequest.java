// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetCreateWorkflowInstancesResultRequest} extends {@link RequestModel}
 *
 * <p>GetCreateWorkflowInstancesResultRequest</p>
 */
public class GetCreateWorkflowInstancesResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationId;

    private GetCreateWorkflowInstancesResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.operationId = builder.operationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreateWorkflowInstancesResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    public static final class Builder extends Request.Builder<GetCreateWorkflowInstancesResultRequest, Builder> {
        private String regionId; 
        private String operationId; 

        private Builder() {
            super();
        } 

        private Builder(GetCreateWorkflowInstancesResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.operationId = request.operationId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e15ad21c-b0e9-4792-8f55-b037xxxxxxxx</p>
         */
        public Builder operationId(String operationId) {
            this.putQueryParameter("OperationId", operationId);
            this.operationId = operationId;
            return this;
        }

        @Override
        public GetCreateWorkflowInstancesResultRequest build() {
            return new GetCreateWorkflowInstancesResultRequest(this);
        } 

    } 

}
