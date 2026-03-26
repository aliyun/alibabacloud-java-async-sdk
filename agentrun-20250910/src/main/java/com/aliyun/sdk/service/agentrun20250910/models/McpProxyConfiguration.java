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
 * {@link McpProxyConfiguration} extends {@link TeaModel}
 *
 * <p>McpProxyConfiguration</p>
 */
public class McpProxyConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hooks")
    private java.util.List<Hook> hooks;

    private McpProxyConfiguration(Builder builder) {
        this.hooks = builder.hooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static McpProxyConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hooks
     */
    public java.util.List<Hook> getHooks() {
        return this.hooks;
    }

    public static final class Builder {
        private java.util.List<Hook> hooks; 

        private Builder() {
        } 

        private Builder(McpProxyConfiguration model) {
            this.hooks = model.hooks;
        } 

        /**
         * <p>MCP 代理的钩子函数配置列表，每个钩子可以在请求处理的不同阶段执行自定义逻辑</p>
         */
        public Builder hooks(java.util.List<Hook> hooks) {
            this.hooks = hooks;
            return this;
        }

        public McpProxyConfiguration build() {
            return new McpProxyConfiguration(this);
        } 

    } 

}
