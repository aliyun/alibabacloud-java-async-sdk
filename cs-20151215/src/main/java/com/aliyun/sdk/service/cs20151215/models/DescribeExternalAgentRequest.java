// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExternalAgentRequest} extends {@link RequestModel}
 *
 * <p>DescribeExternalAgentRequest</p>
 */
public class DescribeExternalAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentMode")
    private String agentMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    private DescribeExternalAgentRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.agentMode = builder.agentMode;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExternalAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return agentMode
     */
    public String getAgentMode() {
        return this.agentMode;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<DescribeExternalAgentRequest, Builder> {
        private String clusterId; 
        private String agentMode; 
        private String privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExternalAgentRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.agentMode = request.agentMode;
            this.privateIpAddress = request.privateIpAddress;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The permission mode of the agent. Valid values:
         * <p>
         * 
         * admin: the admin mode, which provides full permissions. restricted: the restricted mode, which provides partial permissions. Default value: admin.
         */
        public Builder agentMode(String agentMode) {
            this.putQueryParameter("AgentMode", agentMode);
            this.agentMode = agentMode;
            return this;
        }

        /**
         * Specifies whether to obtain the credentials that are used to access the cluster over the internal network.
         * <p>
         * 
         * *   `true`: obtains the credentials that are used to access the cluster over the internal network.
         * *   `false`: obtains the credentials that are used to access the cluster over the Internet.
         * 
         * Default value: `false`.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        @Override
        public DescribeExternalAgentRequest build() {
            return new DescribeExternalAgentRequest(this);
        } 

    } 

}
