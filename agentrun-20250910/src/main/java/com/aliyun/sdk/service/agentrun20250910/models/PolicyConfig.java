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
 * {@link PolicyConfig} extends {@link TeaModel}
 *
 * <p>PolicyConfig</p>
 */
public class PolicyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aiFallbackConfig")
    private AiFallbackConfig aiFallbackConfig;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PolicyConfig(Builder builder) {
        this.aiFallbackConfig = builder.aiFallbackConfig;
        this.enable = builder.enable;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolicyConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiFallbackConfig
     */
    public AiFallbackConfig getAiFallbackConfig() {
        return this.aiFallbackConfig;
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
        private AiFallbackConfig aiFallbackConfig; 
        private Boolean enable; 
        private String type; 

        private Builder() {
        } 

        private Builder(PolicyConfig model) {
            this.aiFallbackConfig = model.aiFallbackConfig;
            this.enable = model.enable;
            this.type = model.type;
        } 

        /**
         * aiFallbackConfig.
         */
        public Builder aiFallbackConfig(AiFallbackConfig aiFallbackConfig) {
            this.aiFallbackConfig = aiFallbackConfig;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PolicyConfig build() {
            return new PolicyConfig(this);
        } 

    } 

}
