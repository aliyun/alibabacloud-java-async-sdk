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
 * {@link AiFallbackConfig} extends {@link TeaModel}
 *
 * <p>AiFallbackConfig</p>
 */
public class AiFallbackConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("serviceConfigs")
    private java.util.List<AiFallbackServiceConfig> serviceConfigs;

    private AiFallbackConfig(Builder builder) {
        this.serviceConfigs = builder.serviceConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiFallbackConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceConfigs
     */
    public java.util.List<AiFallbackServiceConfig> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public static final class Builder {
        private java.util.List<AiFallbackServiceConfig> serviceConfigs; 

        private Builder() {
        } 

        private Builder(AiFallbackConfig model) {
            this.serviceConfigs = model.serviceConfigs;
        } 

        /**
         * serviceConfigs.
         */
        public Builder serviceConfigs(java.util.List<AiFallbackServiceConfig> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }

        public AiFallbackConfig build() {
            return new AiFallbackConfig(this);
        } 

    } 

}
