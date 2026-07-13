// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetServiceEndpointRequest} extends {@link RequestModel}
 *
 * <p>GetServiceEndpointRequest</p>
 */
public class GetServiceEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetServiceEndpointRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetServiceEndpointRequest, Builder> {
        private String endpointId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceEndpointRequest request) {
            super(request);
            this.endpointId = request.endpointId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p><strong>Endpoint ID</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mep-test0001</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-demo</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetServiceEndpointRequest build() {
            return new GetServiceEndpointRequest(this);
        } 

    } 

}
