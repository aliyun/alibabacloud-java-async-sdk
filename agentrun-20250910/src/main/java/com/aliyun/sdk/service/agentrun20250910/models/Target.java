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
 * {@link Target} extends {@link TeaModel}
 *
 * <p>Target</p>
 */
public class Target extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("llmConfig")
    private LLMAPIConfiguration llmConfig;

    @com.aliyun.core.annotation.NameInMap("mcpAPI")
    private MCPAPI mcpAPI;

    @com.aliyun.core.annotation.NameInMap("targetType")
    private String targetType;

    private Target(Builder builder) {
        this.llmConfig = builder.llmConfig;
        this.mcpAPI = builder.mcpAPI;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Target create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return llmConfig
     */
    public LLMAPIConfiguration getLlmConfig() {
        return this.llmConfig;
    }

    /**
     * @return mcpAPI
     */
    public MCPAPI getMcpAPI() {
        return this.mcpAPI;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder {
        private LLMAPIConfiguration llmConfig; 
        private MCPAPI mcpAPI; 
        private String targetType; 

        private Builder() {
        } 

        private Builder(Target model) {
            this.llmConfig = model.llmConfig;
            this.mcpAPI = model.mcpAPI;
            this.targetType = model.targetType;
        } 

        /**
         * llmConfig.
         */
        public Builder llmConfig(LLMAPIConfiguration llmConfig) {
            this.llmConfig = llmConfig;
            return this;
        }

        /**
         * mcpAPI.
         */
        public Builder mcpAPI(MCPAPI mcpAPI) {
            this.mcpAPI = mcpAPI;
            return this;
        }

        /**
         * targetType.
         */
        public Builder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        public Target build() {
            return new Target(this);
        } 

    } 

}
