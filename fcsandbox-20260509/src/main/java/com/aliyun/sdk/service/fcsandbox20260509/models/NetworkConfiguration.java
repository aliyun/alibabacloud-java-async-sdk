// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link NetworkConfiguration} extends {@link TeaModel}
 *
 * <p>NetworkConfiguration</p>
 */
public class NetworkConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("networkMode")
    private String networkMode;

    @com.aliyun.core.annotation.NameInMap("securityGroupID")
    private String securityGroupID;

    @com.aliyun.core.annotation.NameInMap("vpcID")
    private String vpcID;

    @com.aliyun.core.annotation.NameInMap("vswitchIDs")
    private java.util.List<String> vswitchIDs;

    private NetworkConfiguration(Builder builder) {
        this.networkMode = builder.networkMode;
        this.securityGroupID = builder.securityGroupID;
        this.vpcID = builder.vpcID;
        this.vswitchIDs = builder.vswitchIDs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NetworkConfiguration create() {
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
     * @return securityGroupID
     */
    public String getSecurityGroupID() {
        return this.securityGroupID;
    }

    /**
     * @return vpcID
     */
    public String getVpcID() {
        return this.vpcID;
    }

    /**
     * @return vswitchIDs
     */
    public java.util.List<String> getVswitchIDs() {
        return this.vswitchIDs;
    }

    public static final class Builder {
        private String networkMode; 
        private String securityGroupID; 
        private String vpcID; 
        private java.util.List<String> vswitchIDs; 

        private Builder() {
        } 

        private Builder(NetworkConfiguration model) {
            this.networkMode = model.networkMode;
            this.securityGroupID = model.securityGroupID;
            this.vpcID = model.vpcID;
            this.vswitchIDs = model.vswitchIDs;
        } 

        /**
         * <p>The network mode.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1gx7yj8ud5mabcde</p>
         */
        public Builder securityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1mwrqm3wkq7abcde</p>
         */
        public Builder vpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }

        /**
         * <p>The list of vSwitch IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vsw-bp1s5fnlk4jl2abcde&quot;]</p>
         */
        public Builder vswitchIDs(java.util.List<String> vswitchIDs) {
            this.vswitchIDs = vswitchIDs;
            return this;
        }

        public NetworkConfiguration build() {
            return new NetworkConfiguration(this);
        } 

    } 

}
