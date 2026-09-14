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

    @com.aliyun.core.annotation.NameInMap("maxRetries")
    private String maxRetries;

    @com.aliyun.core.annotation.NameInMap("modelList")
    private String modelList;

    @com.aliyun.core.annotation.NameInMap("network")
    private String network;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("qpsLimit")
    private String qpsLimit;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("responseBodyPath")
    private String responseBodyPath;

    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("timeoutMs")
    private String timeoutMs;

    @com.aliyun.core.annotation.NameInMap("vSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    private ConnectorProperties(Builder builder) {
        this.channelType = builder.channelType;
        this.dryRunRequestBody = builder.dryRunRequestBody;
        this.maxRetries = builder.maxRetries;
        this.modelList = builder.modelList;
        this.network = builder.network;
        this.protocol = builder.protocol;
        this.qpsLimit = builder.qpsLimit;
        this.region = builder.region;
        this.responseBodyPath = builder.responseBodyPath;
        this.securityGroupId = builder.securityGroupId;
        this.timeoutMs = builder.timeoutMs;
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
     * @return maxRetries
     */
    public String getMaxRetries() {
        return this.maxRetries;
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
     * @return qpsLimit
     */
    public String getQpsLimit() {
        return this.qpsLimit;
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
     * @return timeoutMs
     */
    public String getTimeoutMs() {
        return this.timeoutMs;
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
        private String maxRetries; 
        private String modelList; 
        private String network; 
        private String protocol; 
        private String qpsLimit; 
        private String region; 
        private String responseBodyPath; 
        private String securityGroupId; 
        private String timeoutMs; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(ConnectorProperties model) {
            this.channelType = model.channelType;
            this.dryRunRequestBody = model.dryRunRequestBody;
            this.maxRetries = model.maxRetries;
            this.modelList = model.modelList;
            this.network = model.network;
            this.protocol = model.protocol;
            this.qpsLimit = model.qpsLimit;
            this.region = model.region;
            this.responseBodyPath = model.responseBodyPath;
            this.securityGroupId = model.securityGroupId;
            this.timeoutMs = model.timeoutMs;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The channel type: custom or apig. This parameter is optional for model_service and defaults to custom.</p>
         */
        public Builder channelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The sample request body provided by the user for verifying endpoint connectivity. This parameter is required when dryRun is set to All and type is set to agent_app. The value is not persisted.</p>
         */
        public Builder dryRunRequestBody(String dryRunRequestBody) {
            this.dryRunRequestBody = dryRunRequestBody;
            return this;
        }

        /**
         * <p>The number of retries after a failed invocation of the dial-test registration service. Valid values: 0 to 10. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder maxRetries(String maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * <p>The list of supported models in comma-separated format. This parameter is required for model_service.</p>
         */
        public Builder modelList(String modelList) {
            this.modelList = modelList;
            return this;
        }

        /**
         * <p>The network type: internet or aliyun-vpc.</p>
         */
        public Builder network(String network) {
            this.network = network;
            return this;
        }

        /**
         * <p>The protocol type: openai, openai-compatible, or anthropic. This parameter is required for model_service.</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The QPS limit for the dial-test registration service. A value of 0 indicates no throttling. Otherwise, valid values: 0.1 to 1000. Default value: 20 for agent_app, 100 for model_service.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder qpsLimit(String qpsLimit) {
            this.qpsLimit = qpsLimit;
            return this;
        }

        /**
         * <p>The region. This parameter is required when the network type is aliyun-vpc.</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The JSON Path extraction path for the response body. This parameter is optional for agent_app.</p>
         */
        public Builder responseBodyPath(String responseBodyPath) {
            this.responseBodyPath = responseBodyPath;
            return this;
        }

        /**
         * <p>The security group ID. This parameter is optional for agent_app.</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The timeout for a single call, in milliseconds. Valid values: 1000 to 1800000. Default value: 300000.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        public Builder timeoutMs(String timeoutMs) {
            this.timeoutMs = timeoutMs;
            return this;
        }

        /**
         * <p>The vSwitch ID. This parameter is optional for agent_app.</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID. This parameter is optional for agent_app.</p>
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
