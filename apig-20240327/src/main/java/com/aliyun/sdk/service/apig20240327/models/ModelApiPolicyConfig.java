// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ModelApiPolicyConfig} extends {@link TeaModel}
 *
 * <p>ModelApiPolicyConfig</p>
 */
public class ModelApiPolicyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aiSecurityGuardConfig")
    private AiSecurityGuardConfig aiSecurityGuardConfig;

    @com.aliyun.core.annotation.NameInMap("aiStatisticsConfig")
    private AiStatisticsConfig aiStatisticsConfig;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ModelApiPolicyConfig(Builder builder) {
        this.aiSecurityGuardConfig = builder.aiSecurityGuardConfig;
        this.aiStatisticsConfig = builder.aiStatisticsConfig;
        this.enable = builder.enable;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelApiPolicyConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiSecurityGuardConfig
     */
    public AiSecurityGuardConfig getAiSecurityGuardConfig() {
        return this.aiSecurityGuardConfig;
    }

    /**
     * @return aiStatisticsConfig
     */
    public AiStatisticsConfig getAiStatisticsConfig() {
        return this.aiStatisticsConfig;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private AiSecurityGuardConfig aiSecurityGuardConfig; 
        private AiStatisticsConfig aiStatisticsConfig; 
        private Boolean enable; 
        private String type; 

        private Builder() {
        } 

        private Builder(ModelApiPolicyConfig model) {
            this.aiSecurityGuardConfig = model.aiSecurityGuardConfig;
            this.aiStatisticsConfig = model.aiStatisticsConfig;
            this.enable = model.enable;
            this.type = model.type;
        } 

        /**
         * <p>The AI security protection settings.</p>
         */
        public Builder aiSecurityGuardConfig(AiSecurityGuardConfig aiSecurityGuardConfig) {
            this.aiSecurityGuardConfig = aiSecurityGuardConfig;
            return this;
        }

        /**
         * <p>The AI observability and request log configuration.</p>
         */
        public Builder aiStatisticsConfig(AiStatisticsConfig aiStatisticsConfig) {
            this.aiStatisticsConfig = aiStatisticsConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The policy type. Only AiStatistics and AiSecurityGuard are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>AiStatistics</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ModelApiPolicyConfig build() {
            return new ModelApiPolicyConfig(this);
        } 

    } 

}
