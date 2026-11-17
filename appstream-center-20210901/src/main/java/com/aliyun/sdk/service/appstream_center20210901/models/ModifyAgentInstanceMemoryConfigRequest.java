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
 * {@link ModifyAgentInstanceMemoryConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAgentInstanceMemoryConfigRequest</p>
 */
public class ModifyAgentInstanceMemoryConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentInstanceIds")
    private java.util.List<String> agentInstanceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    private ModifyAgentInstanceMemoryConfigRequest(Builder builder) {
        super(builder);
        this.agentInstanceIds = builder.agentInstanceIds;
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAgentInstanceMemoryConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentInstanceIds
     */
    public java.util.List<String> getAgentInstanceIds() {
        return this.agentInstanceIds;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder extends Request.Builder<ModifyAgentInstanceMemoryConfigRequest, Builder> {
        private java.util.List<String> agentInstanceIds; 
        private Boolean enabled; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAgentInstanceMemoryConfigRequest request) {
            super(request);
            this.agentInstanceIds = request.agentInstanceIds;
            this.enabled = request.enabled;
        } 

        /**
         * <p>The list of agent instance IDs. You can specify 1 to 100 IDs, and the IDs must be unique. Each instance must belong to the current account, support memory management, and have the memory feature configured.</p>
         */
        public Builder agentInstanceIds(java.util.List<String> agentInstanceIds) {
            this.putBodyParameter("AgentInstanceIds", agentInstanceIds);
            this.agentInstanceIds = agentInstanceIds;
            return this;
        }

        /**
         * <p>Required. Specifies whether to enable the memory feature. Valid values:</p>
         * <ul>
         * <li>true: Enables the memory feature.</li>
         * <li>false: Disables the memory feature.
         * Before you enable the feature, ensure that the tenant-level memory store is enabled.</li>
         * </ul>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        @Override
        public ModifyAgentInstanceMemoryConfigRequest build() {
            return new ModifyAgentInstanceMemoryConfigRequest(this);
        } 

    } 

}
