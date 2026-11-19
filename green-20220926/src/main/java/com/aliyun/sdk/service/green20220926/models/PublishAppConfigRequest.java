// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link PublishAppConfigRequest} extends {@link RequestModel}
 *
 * <p>PublishAppConfigRequest</p>
 */
public class PublishAppConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private PublishAppConfigRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentName = builder.agentName;
        this.appId = builder.appId;
        this.config = builder.config;
        this.enable = builder.enable;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishAppConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<PublishAppConfigRequest, Builder> {
        private String agentId; 
        private String agentName; 
        private String appId; 
        private String config; 
        private Boolean enable; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(PublishAppConfigRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentName = request.agentName;
            this.appId = request.appId;
            this.config = request.config;
            this.enable = request.enable;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The agent ID. This parameter must be the AgentId returned by the AddAppAgent operation after the agent is added.</p>
         * 
         * <strong>example:</strong>
         * <p>ag.abcxxx</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent 1</p>
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>The application ID. This parameter must be the AppId returned by the AddAppConfig operation after the application is created.</p>
         * 
         * <strong>example:</strong>
         * <p>txt_check_agent_01</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The configuration details. The value is a JSON string. The outer object contains the agentItemConfigs field, and its value is a re-serialized JSON array string (a double-nested structure) represented as a sequence of characters. Each array element in agentItemConfigs is an agent configuration object. Supported fields include agentId (string, the agent ID. Use the actual value returned by AddAppAgent or a clear placeholder such as <your-agent-id>), name (string, the agent name), and enable (boolean, specifies whether to enable the agent). Differences and connections with the Config parameter of ModifyAppAgent: The Config parameter of ModifyAppAgent describes the runtime configuration of a single agent (model, scene, or labelConfig), and you must first configure the agent by calling ModifyAppAgent. The Config parameter of this operation aggregates all agent entries (agentItemConfigs) under the application for overall publishing.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentItemConfigs&quot;: &quot;[{\&quot;agentId\&quot;:\&quot;ag.abcxxx\&quot;,\&quot;enable\&quot;:true,\&quot;name\&quot;:\&quot;Agent 1\&quot;}]&quot;}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Specifies whether to enable the agent. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_text</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public PublishAppConfigRequest build() {
            return new PublishAppConfigRequest(this);
        } 

    } 

}
