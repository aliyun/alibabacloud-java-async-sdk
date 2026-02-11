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
 * {@link AgentEndpointConfig} extends {@link TeaModel}
 *
 * <p>AgentEndpointConfig</p>
 */
public class AgentEndpointConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentName")
    private String agentName;

    @com.aliyun.core.annotation.NameInMap("customDomainUrl")
    private String customDomainUrl;

    @com.aliyun.core.annotation.NameInMap("endpointUrl")
    private String endpointUrl;

    private AgentEndpointConfig(Builder builder) {
        this.agentName = builder.agentName;
        this.customDomainUrl = builder.customDomainUrl;
        this.endpointUrl = builder.endpointUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentEndpointConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return customDomainUrl
     */
    public String getCustomDomainUrl() {
        return this.customDomainUrl;
    }

    /**
     * @return endpointUrl
     */
    public String getEndpointUrl() {
        return this.endpointUrl;
    }

    public static final class Builder {
        private String agentName; 
        private String customDomainUrl; 
        private String endpointUrl; 

        private Builder() {
        } 

        private Builder(AgentEndpointConfig model) {
            this.agentName = model.agentName;
            this.customDomainUrl = model.customDomainUrl;
            this.endpointUrl = model.endpointUrl;
        } 

        /**
         * agentName.
         */
        public Builder agentName(String agentName) {
            this.agentName = agentName;
            return this;
        }

        /**
         * customDomainUrl.
         */
        public Builder customDomainUrl(String customDomainUrl) {
            this.customDomainUrl = customDomainUrl;
            return this;
        }

        /**
         * endpointUrl.
         */
        public Builder endpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        public AgentEndpointConfig build() {
            return new AgentEndpointConfig(this);
        } 

    } 

}
