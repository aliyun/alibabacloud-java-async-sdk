// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ConnectorProperties} extends {@link TeaModel}
 *
 * <p>ConnectorProperties</p>
 */
public class ConnectorProperties extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channelType")
    private String channelType;

    @com.aliyun.core.annotation.NameInMap("dryRunRequestBody")
    private String dryRunRequestBody;

    @com.aliyun.core.annotation.NameInMap("modelList")
    private String modelList;

    @com.aliyun.core.annotation.NameInMap("network")
    private String network;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("responseBodyPath")
    private String responseBodyPath;

    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("vSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    private ConnectorProperties(Builder builder) {
        this.channelType = builder.channelType;
        this.dryRunRequestBody = builder.dryRunRequestBody;
        this.modelList = builder.modelList;
        this.network = builder.network;
        this.protocol = builder.protocol;
        this.region = builder.region;
        this.responseBodyPath = builder.responseBodyPath;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectorProperties create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return dryRunRequestBody
     */
    public String getDryRunRequestBody() {
        return this.dryRunRequestBody;
    }

    /**
     * @return modelList
     */
    public String getModelList() {
        return this.modelList;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return responseBodyPath
     */
    public String getResponseBodyPath() {
        return this.responseBodyPath;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String channelType; 
        private String dryRunRequestBody; 
        private String modelList; 
        private String network; 
        private String protocol; 
        private String region; 
        private String responseBodyPath; 
        private String securityGroupId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(ConnectorProperties model) {
            this.channelType = model.channelType;
            this.dryRunRequestBody = model.dryRunRequestBody;
            this.modelList = model.modelList;
            this.network = model.network;
            this.protocol = model.protocol;
            this.region = model.region;
            this.responseBodyPath = model.responseBodyPath;
            this.securityGroupId = model.securityGroupId;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
        } 

        /**
         * channelType.
         */
        public Builder channelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        /**
         * dryRunRequestBody.
         */
        public Builder dryRunRequestBody(String dryRunRequestBody) {
            this.dryRunRequestBody = dryRunRequestBody;
            return this;
        }

        /**
         * modelList.
         */
        public Builder modelList(String modelList) {
            this.modelList = modelList;
            return this;
        }

        /**
         * network.
         */
        public Builder network(String network) {
            this.network = network;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * responseBodyPath.
         */
        public Builder responseBodyPath(String responseBodyPath) {
            this.responseBodyPath = responseBodyPath;
            return this;
        }

        /**
         * securityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * vSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public ConnectorProperties build() {
            return new ConnectorProperties(this);
        } 

    } 

}
