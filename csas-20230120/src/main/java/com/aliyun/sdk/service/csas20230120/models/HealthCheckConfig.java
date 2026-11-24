// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link HealthCheckConfig} extends {@link TeaModel}
 *
 * <p>HealthCheckConfig</p>
 */
public class HealthCheckConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckInterval")
    private Integer checkInterval;

    @com.aliyun.core.annotation.NameInMap("FailureCount")
    private Integer failureCount;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    private Integer timeoutSeconds;

    private HealthCheckConfig(Builder builder) {
        this.checkInterval = builder.checkInterval;
        this.failureCount = builder.failureCount;
        this.port = builder.port;
        this.protocol = builder.protocol;
        this.timeoutSeconds = builder.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HealthCheckConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkInterval
     */
    public Integer getCheckInterval() {
        return this.checkInterval;
    }

    /**
     * @return failureCount
     */
    public Integer getFailureCount() {
        return this.failureCount;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static final class Builder {
        private Integer checkInterval; 
        private Integer failureCount; 
        private Integer port; 
        private String protocol; 
        private Integer timeoutSeconds; 

        private Builder() {
        } 

        private Builder(HealthCheckConfig model) {
            this.checkInterval = model.checkInterval;
            this.failureCount = model.failureCount;
            this.port = model.port;
            this.protocol = model.protocol;
            this.timeoutSeconds = model.timeoutSeconds;
        } 

        /**
         * <p>The check interval in seconds. Default value: 30 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder checkInterval(Integer checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }

        /**
         * <p>The failure count. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder failureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }

        /**
         * <p>The port number. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The protocol type. Valid values: TCP and UDP. This parameter is required only in Continuous mode.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The timeout period for a single check in seconds. Default value: 5 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public HealthCheckConfig build() {
            return new HealthCheckConfig(this);
        } 

    } 

}
