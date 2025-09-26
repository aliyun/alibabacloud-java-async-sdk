// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GatewayNetworkConfiguration} extends {@link TeaModel}
 *
 * <p>GatewayNetworkConfiguration</p>
 */
public class GatewayNetworkConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("networkMode")
    private String networkMode;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("vswitchIds")
    private java.util.List<String> vswitchIds;

    private GatewayNetworkConfiguration(Builder builder) {
        this.networkMode = builder.networkMode;
        this.vpcId = builder.vpcId;
        this.vswitchIds = builder.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayNetworkConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkMode
     */
    public String getNetworkMode() {
        return this.networkMode;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchIds
     */
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public static final class Builder {
        private String networkMode; 
        private String vpcId; 
        private java.util.List<String> vswitchIds; 

        private Builder() {
        } 

        private Builder(GatewayNetworkConfiguration model) {
            this.networkMode = model.networkMode;
            this.vpcId = model.vpcId;
            this.vswitchIds = model.vswitchIds;
        } 

        /**
         * networkMode.
         */
        public Builder networkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * vswitchIds.
         */
        public Builder vswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }

        public GatewayNetworkConfiguration build() {
            return new GatewayNetworkConfiguration(this);
        } 

    } 

}
