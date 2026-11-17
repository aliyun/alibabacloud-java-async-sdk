// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyTenantMemoryConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantMemoryConfigRequest</p>
 */
public class ModifyTenantMemoryConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentPlatform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProvider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    private ModifyTenantMemoryConfigRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.bizType = builder.bizType;
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantMemoryConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentPlatform
     */
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder extends Request.Builder<ModifyTenantMemoryConfigRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private Integer bizType; 
        private Boolean enabled; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantMemoryConfigRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.bizType = request.bizType;
            this.enabled = request.enabled;
        } 

        /**
         * <p>The business platform to which the agent belongs. Specify the platform that corresponds to the tenant memory configuration, such as the enterprise platform <code>ENTERPRISE</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putBodyParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>The agent provider. Used together with AgentPlatform and BizType to locate the memory configuration. A configured business combination must be used.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putBodyParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>The business type code. Used together with the provider and business platform. Common values include <code>1</code> (Enterprise Edition), <code>10</code> (Personal Edition), and <code>20</code> (Commercial Edition).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>Specifies whether to enable the memory feature for the business combination. A value of <code>true</code> enables the feature, and <code>false</code> disables it. If this parameter is omitted, the current status is retained.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        @Override
        public ModifyTenantMemoryConfigRequest build() {
            return new ModifyTenantMemoryConfigRequest(this);
        } 

    } 

}
