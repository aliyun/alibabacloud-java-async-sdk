// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c106f377e16f34eb1808d6b9362c9****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The permission mode of the agent. Valid values:</p>
         * <p>admin: the admin mode, which provides full permissions. restricted: the restricted mode, which provides partial permissions. Default value: admin.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder agentMode(String agentMode) {
            this.putQueryParameter("AgentMode", agentMode);
            this.agentMode = agentMode;
            return this;
        }

        /**
         * <p>Specifies whether to obtain the credentials that are used to access the cluster over the internal network.</p>
         * <ul>
         * <li><code>true</code>: obtains the credentials that are used to access the cluster over the internal network.</li>
         * <li><code>false</code>: obtains the credentials that are used to access the cluster over the Internet.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
