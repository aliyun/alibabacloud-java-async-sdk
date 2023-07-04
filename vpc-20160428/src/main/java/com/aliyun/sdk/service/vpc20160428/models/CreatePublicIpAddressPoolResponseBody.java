// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublicIpAddressPoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePublicIpAddressPoolResponseBody</p>
 */
public class CreatePublicIpAddressPoolResponseBody extends TeaModel {
    @NameInMap("PulbicIpAddressPoolId")
    private String pulbicIpAddressPoolId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreatePublicIpAddressPoolResponseBody(Builder builder) {
        this.pulbicIpAddressPoolId = builder.pulbicIpAddressPoolId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublicIpAddressPoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return pulbicIpAddressPoolId
     */
    public String getPulbicIpAddressPoolId() {
        return this.pulbicIpAddressPoolId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private String pulbicIpAddressPoolId; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * The ID of the IP address pool.
         */
        public Builder pulbicIpAddressPoolId(String pulbicIpAddressPoolId) {
            this.pulbicIpAddressPoolId = pulbicIpAddressPoolId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group to which the IP address pool belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public CreatePublicIpAddressPoolResponseBody build() {
            return new CreatePublicIpAddressPoolResponseBody(this);
        } 

    } 

}
