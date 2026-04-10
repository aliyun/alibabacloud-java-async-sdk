// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ArmsIntegrationConfig} extends {@link TeaModel}
 *
 * <p>ArmsIntegrationConfig</p>
 */
public class ArmsIntegrationConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    private ArmsIntegrationConfig(Builder builder) {
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArmsIntegrationConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder {
        private Boolean enabled; 

        private Builder() {
        } 

        private Builder(ArmsIntegrationConfig model) {
            this.enabled = model.enabled;
        } 

        /**
         * <p>是否启用 ARMS 集成</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public ArmsIntegrationConfig build() {
            return new ArmsIntegrationConfig(this);
        } 

    } 

}
