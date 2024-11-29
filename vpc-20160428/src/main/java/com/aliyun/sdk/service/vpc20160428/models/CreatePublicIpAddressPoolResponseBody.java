// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePublicIpAddressPoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePublicIpAddressPoolResponseBody</p>
 */
public class CreatePublicIpAddressPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolId")
    private String publicIpAddressPoolId;

    @com.aliyun.core.annotation.NameInMap("PulbicIpAddressPoolId")
    @Deprecated
    private String pulbicIpAddressPoolId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreatePublicIpAddressPoolResponseBody(Builder builder) {
        this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
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
     * @return publicIpAddressPoolId
     */
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
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
        private String publicIpAddressPoolId; 
        private String pulbicIpAddressPoolId; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * PublicIpAddressPoolId.
         */
        public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }

        /**
         * <p>The ID of the IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pippool-6wetvn6fumkgycssx****</p>
         */
        public Builder pulbicIpAddressPoolId(String pulbicIpAddressPoolId) {
            this.pulbicIpAddressPoolId = pulbicIpAddressPoolId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the IP address pool belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4pcdvf****</p>
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
