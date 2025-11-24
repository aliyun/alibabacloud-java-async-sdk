// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link MultiClusterNetworksValue} extends {@link TeaModel}
 *
 * <p>MultiClusterNetworksValue</p>
 */
public class MultiClusterNetworksValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.NameInMap("EnableGateway")
    private Boolean enableGateway;

    @com.aliyun.core.annotation.NameInMap("CustomGatewayAddress")
    private String customGatewayAddress;

    @com.aliyun.core.annotation.NameInMap("GatewayName")
    private String gatewayName;

    private MultiClusterNetworksValue(Builder builder) {
        this.network = builder.network;
        this.enableGateway = builder.enableGateway;
        this.customGatewayAddress = builder.customGatewayAddress;
        this.gatewayName = builder.gatewayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiClusterNetworksValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return enableGateway
     */
    public Boolean getEnableGateway() {
        return this.enableGateway;
    }

    /**
     * @return customGatewayAddress
     */
    public String getCustomGatewayAddress() {
        return this.customGatewayAddress;
    }

    /**
     * @return gatewayName
     */
    public String getGatewayName() {
        return this.gatewayName;
    }

    public static final class Builder {
        private String network; 
        private Boolean enableGateway; 
        private String customGatewayAddress; 
        private String gatewayName; 

        private Builder() {
        } 

        private Builder(MultiClusterNetworksValue model) {
            this.network = model.network;
            this.enableGateway = model.enableGateway;
            this.customGatewayAddress = model.customGatewayAddress;
            this.gatewayName = model.gatewayName;
        } 

        /**
         * Network.
         */
        public Builder network(String network) {
            this.network = network;
            return this;
        }

        /**
         * EnableGateway.
         */
        public Builder enableGateway(Boolean enableGateway) {
            this.enableGateway = enableGateway;
            return this;
        }

        /**
         * CustomGatewayAddress.
         */
        public Builder customGatewayAddress(String customGatewayAddress) {
            this.customGatewayAddress = customGatewayAddress;
            return this;
        }

        /**
         * GatewayName.
         */
        public Builder gatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        public MultiClusterNetworksValue build() {
            return new MultiClusterNetworksValue(this);
        } 

    } 

}
