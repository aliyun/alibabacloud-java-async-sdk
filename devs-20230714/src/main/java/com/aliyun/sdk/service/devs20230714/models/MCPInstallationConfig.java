// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link MCPInstallationConfig} extends {@link TeaModel}
 *
 * <p>MCPInstallationConfig</p>
 */
public class MCPInstallationConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mcpServers")
    private MCPServerInstallationConfig mcpServers;

    private MCPInstallationConfig(Builder builder) {
        this.mcpServers = builder.mcpServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPInstallationConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mcpServers
     */
    public MCPServerInstallationConfig getMcpServers() {
        return this.mcpServers;
    }

    public static final class Builder {
        private MCPServerInstallationConfig mcpServers; 

        private Builder() {
        } 

        private Builder(MCPInstallationConfig model) {
            this.mcpServers = model.mcpServers;
        } 

        /**
         * mcpServers.
         */
        public Builder mcpServers(MCPServerInstallationConfig mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }

        public MCPInstallationConfig build() {
            return new MCPInstallationConfig(this);
        } 

    } 

}
