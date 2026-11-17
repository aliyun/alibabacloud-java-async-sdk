// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetLogicalModelDeploymentRequest} extends {@link RequestModel}
 *
 * <p>GetLogicalModelDeploymentRequest</p>
 */
public class GetLogicalModelDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("operationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationId;

    private GetLogicalModelDeploymentRequest(Builder builder) {
        super(builder);
        this.operationId = builder.operationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogicalModelDeploymentRequest create() {
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

    public static final class Builder extends Request.Builder<GetLogicalModelDeploymentRequest, Builder> {
        private String operationId; 

        private Builder() {
            super();
        } 

        private Builder(GetLogicalModelDeploymentRequest request) {
            super(request);
            this.operationId = request.operationId;
        } 

        /**
         * <p>The ID of the configuration delivery operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>op-d00000000000000000000</p>
         */
        public Builder operationId(String operationId) {
            this.putPathParameter("operationId", operationId);
            this.operationId = operationId;
            return this;
        }

        @Override
        public GetLogicalModelDeploymentRequest build() {
            return new GetLogicalModelDeploymentRequest(this);
        } 

    } 

}
