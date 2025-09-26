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
 * {@link TargetConfiguration} extends {@link TeaModel}
 *
 * <p>TargetConfiguration</p>
 */
public class TargetConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("llmAPIConfig")
    private LLMAPIConfiguration llmAPIConfig;

    @com.aliyun.core.annotation.NameInMap("mcpAPIConfig")
    private MCPAPIConfiguration mcpAPIConfig;

    @com.aliyun.core.annotation.NameInMap("targetType")
    private String targetType;

    private TargetConfiguration(Builder builder) {
        this.llmAPIConfig = builder.llmAPIConfig;
        this.mcpAPIConfig = builder.mcpAPIConfig;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TargetConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return llmAPIConfig
     */
    public LLMAPIConfiguration getLlmAPIConfig() {
        return this.llmAPIConfig;
    }

    /**
     * @return mcpAPIConfig
     */
    public MCPAPIConfiguration getMcpAPIConfig() {
        return this.mcpAPIConfig;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder {
        private LLMAPIConfiguration llmAPIConfig; 
        private MCPAPIConfiguration mcpAPIConfig; 
        private String targetType; 

        private Builder() {
        } 

        private Builder(TargetConfiguration model) {
            this.llmAPIConfig = model.llmAPIConfig;
            this.mcpAPIConfig = model.mcpAPIConfig;
            this.targetType = model.targetType;
        } 

        /**
         * llmAPIConfig.
         */
        public Builder llmAPIConfig(LLMAPIConfiguration llmAPIConfig) {
            this.llmAPIConfig = llmAPIConfig;
            return this;
        }

        /**
         * mcpAPIConfig.
         */
        public Builder mcpAPIConfig(MCPAPIConfiguration mcpAPIConfig) {
            this.mcpAPIConfig = mcpAPIConfig;
            return this;
        }

        /**
         * targetType.
         */
        public Builder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        public TargetConfiguration build() {
            return new TargetConfiguration(this);
        } 

    } 

}
