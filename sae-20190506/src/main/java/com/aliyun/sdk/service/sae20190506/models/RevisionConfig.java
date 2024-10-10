// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RevisionConfig} extends {@link TeaModel}
 *
 * <p>RevisionConfig</p>
 */
public class RevisionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Containers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Container > containers;

    @com.aliyun.core.annotation.NameInMap("EnableArmsMetrics")
    private Boolean enableArmsMetrics;

    @com.aliyun.core.annotation.NameInMap("WebNetworkConfig")
    private WebNetworkConfig webNetworkConfig;

    private RevisionConfig(Builder builder) {
        this.containers = builder.containers;
        this.enableArmsMetrics = builder.enableArmsMetrics;
        this.webNetworkConfig = builder.webNetworkConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevisionConfig create() {
        return builder().build();
    }

    /**
     * @return containers
     */
    public java.util.List < Container > getContainers() {
        return this.containers;
    }

    /**
     * @return enableArmsMetrics
     */
    public Boolean getEnableArmsMetrics() {
        return this.enableArmsMetrics;
    }

    /**
     * @return webNetworkConfig
     */
    public WebNetworkConfig getWebNetworkConfig() {
        return this.webNetworkConfig;
    }

    public static final class Builder {
        private java.util.List < Container > containers; 
        private Boolean enableArmsMetrics; 
        private WebNetworkConfig webNetworkConfig; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder containers(java.util.List < Container > containers) {
            this.containers = containers;
            return this;
        }

        /**
         * EnableArmsMetrics.
         */
        public Builder enableArmsMetrics(Boolean enableArmsMetrics) {
            this.enableArmsMetrics = enableArmsMetrics;
            return this;
        }

        /**
         * WebNetworkConfig.
         */
        public Builder webNetworkConfig(WebNetworkConfig webNetworkConfig) {
            this.webNetworkConfig = webNetworkConfig;
            return this;
        }

        public RevisionConfig build() {
            return new RevisionConfig(this);
        } 

    } 

}
