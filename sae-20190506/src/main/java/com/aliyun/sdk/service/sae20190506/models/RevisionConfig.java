// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link RevisionConfig} extends {@link TeaModel}
 *
 * <p>RevisionConfig</p>
 */
public class RevisionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Containers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Container> containers;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containers
     */
    public java.util.List<Container> getContainers() {
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
        private java.util.List<Container> containers; 
        private Boolean enableArmsMetrics; 
        private WebNetworkConfig webNetworkConfig; 

        private Builder() {
        } 

        private Builder(RevisionConfig model) {
            this.containers = model.containers;
            this.enableArmsMetrics = model.enableArmsMetrics;
            this.webNetworkConfig = model.webNetworkConfig;
        } 

        /**
         * <p>The container configurations. You can deploy only one container for each application. The maximum length of this array is 1.</p>
         * <p>This parameter is required.</p>
         */
        public Builder containers(java.util.List<Container> containers) {
            this.containers = containers;
            return this;
        }

        /**
         * <p>Specifies whether to enable Application Real-Time Monitoring Service (ARMS) monitoring. Valid values:</p>
         * <ul>
         * <li><strong><code>true</code></strong>: Enables the ARMS monitoring.</li>
         * <li><strong><code>false</code></strong>: Disables the ARMS monitoring.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableArmsMetrics(Boolean enableArmsMetrics) {
            this.enableArmsMetrics = enableArmsMetrics;
            return this;
        }

        /**
         * <p>The network configurations.</p>
         * <blockquote>
         * <p> This parameter is used to configure network settings for a version of the application.</p>
         * </blockquote>
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
