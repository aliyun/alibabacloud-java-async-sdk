// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link NetworkConfig} extends {@link TeaModel}
 *
 * <p>NetworkConfig</p>
 */
public class NetworkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("vsArea")
    private String vsArea;

    @com.aliyun.core.annotation.NameInMap("vswitchId")
    private String vswitchId;

    @com.aliyun.core.annotation.NameInMap("whiteIpGroupList")
    private java.util.List<WhiteIpGroup> whiteIpGroupList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<WhiteIpGroup> getWhiteIpGroupList() {
        return this.whiteIpGroupList;
    }

    public static final class Builder {
        private String type; 
        private String vpcId; 
        private String vsArea; 
        private String vswitchId; 
        private java.util.List<WhiteIpGroup> whiteIpGroupList; 

        private Builder() {
        } 

        private Builder(NetworkConfig model) {
            this.type = model.type;
            this.vpcId = model.vpcId;
            this.vsArea = model.vsArea;
            this.vswitchId = model.vswitchId;
            this.whiteIpGroupList = model.whiteIpGroupList;
        } 

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
        public Builder whiteIpGroupList(java.util.List<WhiteIpGroup> whiteIpGroupList) {
            this.whiteIpGroupList = whiteIpGroupList;
            return this;
        }

        public NetworkConfig build() {
            return new NetworkConfig(this);
        } 

    } 

}
