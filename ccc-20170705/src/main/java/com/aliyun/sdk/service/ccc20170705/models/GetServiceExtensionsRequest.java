// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link GetServiceExtensionsRequest} extends {@link RequestModel}
 *
 * <p>GetServiceExtensionsRequest</p>
 */
public class GetServiceExtensionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceType;

    private GetServiceExtensionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceExtensionsRequest create() {
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
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<GetServiceExtensionsRequest, Builder> {
        private String instanceId; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceExtensionsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.serviceType = request.serviceType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public GetServiceExtensionsRequest build() {
            return new GetServiceExtensionsRequest(this);
        } 

    } 

}
