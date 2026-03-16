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
 * {@link DiscoveryEndpoint} extends {@link TeaModel}
 *
 * <p>DiscoveryEndpoint</p>
 */
public class DiscoveryEndpoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentEndpointConfigs")
    private java.util.List<AgentEndpointConfig> agentEndpointConfigs;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("returnAgentCredentialContent")
    private Boolean returnAgentCredentialContent;

    private DiscoveryEndpoint(Builder builder) {
        this.agentEndpointConfigs = builder.agentEndpointConfigs;
        this.credentialName = builder.credentialName;
        this.name = builder.name;
        this.returnAgentCredentialContent = builder.returnAgentCredentialContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiscoveryEndpoint create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentEndpointConfigs
     */
    public java.util.List<AgentEndpointConfig> getAgentEndpointConfigs() {
        return this.agentEndpointConfigs;
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return returnAgentCredentialContent
     */
    public Boolean getReturnAgentCredentialContent() {
        return this.returnAgentCredentialContent;
    }

    public static final class Builder {
        private java.util.List<AgentEndpointConfig> agentEndpointConfigs; 
        private String credentialName; 
        private String name; 
        private Boolean returnAgentCredentialContent; 

        private Builder() {
        } 

        private Builder(DiscoveryEndpoint model) {
            this.agentEndpointConfigs = model.agentEndpointConfigs;
            this.credentialName = model.credentialName;
            this.name = model.name;
            this.returnAgentCredentialContent = model.returnAgentCredentialContent;
        } 

        /**
         * agentEndpointConfigs.
         */
        public Builder agentEndpointConfigs(java.util.List<AgentEndpointConfig> agentEndpointConfigs) {
            this.agentEndpointConfigs = agentEndpointConfigs;
            return this;
        }

        /**
         * <p>该发现端点使用的凭证名称</p>
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>是否在发现结果中返回 agent 的凭证内容</p>
         */
        public Builder returnAgentCredentialContent(Boolean returnAgentCredentialContent) {
            this.returnAgentCredentialContent = returnAgentCredentialContent;
            return this;
        }

        public DiscoveryEndpoint build() {
            return new DiscoveryEndpoint(this);
        } 

    } 

}
