// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceExtensionsRequest} extends {@link RequestModel}
 *
 * <p>GetServiceExtensionsRequest</p>
 */
public class GetServiceExtensionsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ServiceType")
    @Validation(required = true)
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

        private Builder(GetServiceExtensionsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.serviceType = response.serviceType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ServiceType.
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
