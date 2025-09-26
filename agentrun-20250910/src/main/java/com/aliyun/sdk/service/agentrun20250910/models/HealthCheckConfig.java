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
 * {@link HealthCheckConfig} extends {@link TeaModel}
 *
 * <p>HealthCheckConfig</p>
 */
public class HealthCheckConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("failureThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 120, minimum = 1)
    private Integer failureThreshold;

    @com.aliyun.core.annotation.NameInMap("httpGetUrl")
    @com.aliyun.core.annotation.Validation(maximum = 2048)
    private String httpGetUrl;

    @com.aliyun.core.annotation.NameInMap("initialDelaySeconds")
    @com.aliyun.core.annotation.Validation(maximum = 120)
    private Integer initialDelaySeconds;

    @com.aliyun.core.annotation.NameInMap("periodSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 120, minimum = 1)
    private Integer periodSeconds;

    @com.aliyun.core.annotation.NameInMap("successThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 120, minimum = 1)
    private Integer successThreshold;

    @com.aliyun.core.annotation.NameInMap("timeoutSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Integer timeoutSeconds;

    private HealthCheckConfig(Builder builder) {
        this.failureThreshold = builder.failureThreshold;
        this.httpGetUrl = builder.httpGetUrl;
        this.initialDelaySeconds = builder.initialDelaySeconds;
        this.periodSeconds = builder.periodSeconds;
        this.successThreshold = builder.successThreshold;
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
     * @return failureThreshold
     */
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * @return httpGetUrl
     */
    public String getHttpGetUrl() {
        return this.httpGetUrl;
    }

    /**
     * @return initialDelaySeconds
     */
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    /**
     * @return periodSeconds
     */
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    /**
     * @return successThreshold
     */
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static final class Builder {
        private Integer failureThreshold; 
        private String httpGetUrl; 
        private Integer initialDelaySeconds; 
        private Integer periodSeconds; 
        private Integer successThreshold; 
        private Integer timeoutSeconds; 

        private Builder() {
        } 

        private Builder(HealthCheckConfig model) {
            this.failureThreshold = model.failureThreshold;
            this.httpGetUrl = model.httpGetUrl;
            this.initialDelaySeconds = model.initialDelaySeconds;
            this.periodSeconds = model.periodSeconds;
            this.successThreshold = model.successThreshold;
            this.timeoutSeconds = model.timeoutSeconds;
        } 

        /**
         * <p>在将容器视为不健康之前，连续失败的健康检查次数</p>
         */
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * <p>用于健康检查的HTTP GET请求的URL地址</p>
         */
        public Builder httpGetUrl(String httpGetUrl) {
            this.httpGetUrl = httpGetUrl;
            return this;
        }

        /**
         * <p>在容器启动后，首次执行健康检查前的延迟时间（秒）</p>
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * <p>执行健康检查的时间间隔（秒）</p>
         */
        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * <p>在将容器视为健康之前，连续成功的健康检查次数</p>
         */
        public Builder successThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        /**
         * <p>健康检查的超时时间（秒）</p>
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
