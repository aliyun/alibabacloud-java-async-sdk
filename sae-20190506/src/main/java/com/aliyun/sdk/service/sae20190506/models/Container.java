// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Container} extends {@link TeaModel}
 *
 * <p>Container</p>
 */
public class Container extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Args")
    private String args;

    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("EnvironmentVariables")
    private java.util.Map < String, String > environmentVariables;

    @com.aliyun.core.annotation.NameInMap("Image")
    @com.aliyun.core.annotation.Validation(required = true)
    private String image;

    @com.aliyun.core.annotation.NameInMap("MetricsCollectConfig")
    private MetricsCollectConfig metricsCollectConfig;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("RequestConcurrency")
    private Integer requestConcurrency;

    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private ContainerResources resources;

    @com.aliyun.core.annotation.NameInMap("SLSCollectConfigs")
    private SLSCollectConfigs SLSCollectConfigs;

    @com.aliyun.core.annotation.NameInMap("StartupProbe")
    private StartupProbe startupProbe;

    @com.aliyun.core.annotation.NameInMap("WebNASConfig")
    private WebNASConfig webNASConfig;

    @com.aliyun.core.annotation.NameInMap("WebOSSConfig")
    private WebOSSConfig webOSSConfig;

    private Container(Builder builder) {
        this.args = builder.args;
        this.command = builder.command;
        this.environmentVariables = builder.environmentVariables;
        this.image = builder.image;
        this.metricsCollectConfig = builder.metricsCollectConfig;
        this.port = builder.port;
        this.requestConcurrency = builder.requestConcurrency;
        this.requestTimeout = builder.requestTimeout;
        this.resources = builder.resources;
        this.SLSCollectConfigs = builder.SLSCollectConfigs;
        this.startupProbe = builder.startupProbe;
        this.webNASConfig = builder.webNASConfig;
        this.webOSSConfig = builder.webOSSConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Container create() {
        return builder().build();
    }

    /**
     * @return args
     */
    public String getArgs() {
        return this.args;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map < String, String > getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return metricsCollectConfig
     */
    public MetricsCollectConfig getMetricsCollectConfig() {
        return this.metricsCollectConfig;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return requestConcurrency
     */
    public Integer getRequestConcurrency() {
        return this.requestConcurrency;
    }

    /**
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return resources
     */
    public ContainerResources getResources() {
        return this.resources;
    }

    /**
     * @return SLSCollectConfigs
     */
    public SLSCollectConfigs getSLSCollectConfigs() {
        return this.SLSCollectConfigs;
    }

    /**
     * @return startupProbe
     */
    public StartupProbe getStartupProbe() {
        return this.startupProbe;
    }

    /**
     * @return webNASConfig
     */
    public WebNASConfig getWebNASConfig() {
        return this.webNASConfig;
    }

    /**
     * @return webOSSConfig
     */
    public WebOSSConfig getWebOSSConfig() {
        return this.webOSSConfig;
    }

    public static final class Builder {
        private String args; 
        private String command; 
        private java.util.Map < String, String > environmentVariables; 
        private String image; 
        private MetricsCollectConfig metricsCollectConfig; 
        private Integer port; 
        private Integer requestConcurrency; 
        private Integer requestTimeout; 
        private ContainerResources resources; 
        private SLSCollectConfigs SLSCollectConfigs; 
        private StartupProbe startupProbe; 
        private WebNASConfig webNASConfig; 
        private WebOSSConfig webOSSConfig; 

        /**
         * Args.
         */
        public Builder args(String args) {
            this.args = args;
            return this;
        }

        /**
         * Command.
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * EnvironmentVariables.
         */
        public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/serverless_devsxxxxx</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * MetricsCollectConfig.
         */
        public Builder metricsCollectConfig(MetricsCollectConfig metricsCollectConfig) {
            this.metricsCollectConfig = metricsCollectConfig;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * RequestConcurrency.
         */
        public Builder requestConcurrency(Integer requestConcurrency) {
            this.requestConcurrency = requestConcurrency;
            return this;
        }

        /**
         * RequestTimeout.
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resources(ContainerResources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * SLSCollectConfigs.
         */
        public Builder SLSCollectConfigs(SLSCollectConfigs SLSCollectConfigs) {
            this.SLSCollectConfigs = SLSCollectConfigs;
            return this;
        }

        /**
         * StartupProbe.
         */
        public Builder startupProbe(StartupProbe startupProbe) {
            this.startupProbe = startupProbe;
            return this;
        }

        /**
         * WebNASConfig.
         */
        public Builder webNASConfig(WebNASConfig webNASConfig) {
            this.webNASConfig = webNASConfig;
            return this;
        }

        /**
         * WebOSSConfig.
         */
        public Builder webOSSConfig(WebOSSConfig webOSSConfig) {
            this.webOSSConfig = webOSSConfig;
            return this;
        }

        public Container build() {
            return new Container(this);
        } 

    } 

}
