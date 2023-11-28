// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NetworkConfig} extends {@link TeaModel}
 *
 * <p>NetworkConfig</p>
 */
public class NetworkConfig extends TeaModel {
    @NameInMap("type")
    private String type;

    @NameInMap("vpcId")
    private String vpcId;

    @NameInMap("vsArea")
    private String vsArea;

    @NameInMap("vswitchId")
    private String vswitchId;

    @NameInMap("whiteIpGroupList")
    private java.util.List < WhiteIpGroup > whiteIpGroupList;

    private NetworkConfig(Builder builder) {
        this.type = builder.type;
        this.vpcId = builder.vpcId;
        this.vsArea = builder.vsArea;
        this.vswitchId = builder.vswitchId;
        this.whiteIpGroupList = builder.whiteIpGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NetworkConfig create() {
        return builder().build();
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vsArea
     */
    public String getVsArea() {
        return this.vsArea;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    /**
     * @return whiteIpGroupList
     */
    public java.util.List < WhiteIpGroup > getWhiteIpGroupList() {
        return this.whiteIpGroupList;
    }

    public static final class Builder {
        private String type; 
        private String vpcId; 
        private String vsArea; 
        private String vswitchId; 
        private java.util.List < WhiteIpGroup > whiteIpGroupList; 

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
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
         * vsArea.
         */
        public Builder vsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }

        /**
         * vswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * whiteIpGroupList.
         */
        public Builder whiteIpGroupList(java.util.List < WhiteIpGroup > whiteIpGroupList) {
            this.whiteIpGroupList = whiteIpGroupList;
            return this;
        }

        public NetworkConfig build() {
            return new NetworkConfig(this);
        } 

    } 

}
