// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEndpointGroupIpAddressCidrBlocksResponseBody} extends {@link TeaModel}
 *
 * <p>ListEndpointGroupIpAddressCidrBlocksResponseBody</p>
 */
public class ListEndpointGroupIpAddressCidrBlocksResponseBody extends TeaModel {
    @NameInMap("EndpointGroupRegion")
    private String endpointGroupRegion;

    @NameInMap("IpAddressCidrBlocks")
    private java.util.List < String > ipAddressCidrBlocks;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("State")
    private String state;

    private ListEndpointGroupIpAddressCidrBlocksResponseBody(Builder builder) {
        this.endpointGroupRegion = builder.endpointGroupRegion;
        this.ipAddressCidrBlocks = builder.ipAddressCidrBlocks;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEndpointGroupIpAddressCidrBlocksResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointGroupRegion
     */
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    /**
     * @return ipAddressCidrBlocks
     */
    public java.util.List < String > getIpAddressCidrBlocks() {
        return this.ipAddressCidrBlocks;
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

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String endpointGroupRegion; 
        private java.util.List < String > ipAddressCidrBlocks; 
        private String requestId; 
        private String resourceGroupId; 
        private String state; 

        /**
         * EndpointGroupRegion.
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * IpAddressCidrBlocks.
         */
        public Builder ipAddressCidrBlocks(java.util.List < String > ipAddressCidrBlocks) {
            this.ipAddressCidrBlocks = ipAddressCidrBlocks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public ListEndpointGroupIpAddressCidrBlocksResponseBody build() {
            return new ListEndpointGroupIpAddressCidrBlocksResponseBody(this);
        } 

    } 

}
