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
 * {@link GatewayLogConfig} extends {@link TeaModel}
 *
 * <p>GatewayLogConfig</p>
 */
public class GatewayLogConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("slsConfig")
    private SlsConfig slsConfig;

    private GatewayLogConfig(Builder builder) {
        this.slsConfig = builder.slsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayLogConfig create() {
        return builder().build();
    }

    /**
     * @return slsConfig
     */
    public SlsConfig getSlsConfig() {
        return this.slsConfig;
    }

    public static final class Builder {
        private SlsConfig slsConfig; 

        /**
         * slsConfig.
         */
        public Builder slsConfig(SlsConfig slsConfig) {
            this.slsConfig = slsConfig;
            return this;
        }

        public GatewayLogConfig build() {
            return new GatewayLogConfig(this);
        } 

    } 

    /**
     * 
     * {@link GatewayLogConfig} extends {@link TeaModel}
     *
     * <p>GatewayLogConfig</p>
     */
    public static class SlsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        private SlsConfig(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsConfig create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public SlsConfig build() {
                return new SlsConfig(this);
            } 

        } 

    }
}
