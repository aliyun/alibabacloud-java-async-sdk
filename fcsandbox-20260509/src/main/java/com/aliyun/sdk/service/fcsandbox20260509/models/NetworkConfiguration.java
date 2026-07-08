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
         * networkMode.
         */
        public Builder networkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        /**
         * securityGroupID.
         */
        public Builder securityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
            return this;
        }

        /**
         * vpcID.
         */
        public Builder vpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }

        /**
         * vswitchIDs.
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
