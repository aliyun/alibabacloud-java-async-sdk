// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetWorkflowInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetWorkflowInstanceRequest</p>
 */
public class GetWorkflowInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetWorkflowInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetWorkflowInstanceRequest, Builder> {
        private String instanceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkflowInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The stable logical instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wfi_20261016_abc123</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If you use winnexo-cli, pass this parameter explicitly by using --tenant-id.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetWorkflowInstanceRequest build() {
            return new GetWorkflowInstanceRequest(this);
        } 

    } 

}
