// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MeteringConfig} extends {@link TeaModel}
 *
 * <p>MeteringConfig</p>
 */
public class MeteringConfig extends TeaModel {
    @NameInMap("logConfig")
    private LogConfig logConfig;

    @NameInMap("payerId")
    private String payerId;

    @NameInMap("role")
    private String role;

    private MeteringConfig(Builder builder) {
        this.logConfig = builder.logConfig;
        this.payerId = builder.payerId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MeteringConfig create() {
        return builder().build();
    }

    /**
     * @return logConfig
     */
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * @return payerId
     */
    public String getPayerId() {
        return this.payerId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder {
        private LogConfig logConfig; 
        private String payerId; 
        private String role; 

        /**
         * logConfig.
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * payerId.
         */
        public Builder payerId(String payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public MeteringConfig build() {
            return new MeteringConfig(this);
        } 

    } 

}
