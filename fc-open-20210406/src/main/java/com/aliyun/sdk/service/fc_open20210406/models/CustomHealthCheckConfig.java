// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CustomHealthCheckConfig} extends {@link TeaModel}
 *
 * <p>CustomHealthCheckConfig</p>
 */
public class CustomHealthCheckConfig extends TeaModel {
    @NameInMap("failureThreshold")
    private Integer failureThreshold;

    @NameInMap("httpGetUrl")
    @Validation(required = true)
    private String httpGetUrl;

    @NameInMap("initialDelaySeconds")
    private Integer initialDelaySeconds;

    @NameInMap("periodSeconds")
    private Integer periodSeconds;

    @NameInMap("successThreshold")
    private Integer successThreshold;

    @NameInMap("timeoutSeconds")
    private Integer timeoutSeconds;

    private CustomHealthCheckConfig(Builder builder) {
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

    public static CustomHealthCheckConfig create() {
        return builder().build();
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

        /**
         * 健康检查失败次数阈值，达到该值后系统认为检查失败
         */
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * 容器自定义健康检查URL地址
         */
        public Builder httpGetUrl(String httpGetUrl) {
            this.httpGetUrl = httpGetUrl;
            return this;
        }

        /**
         * 容器启动到发起健康检查的延迟
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * 健康检查周期
         */
        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * 健康检查成功次数阈值，达到该值后系统认为检查成功
         */
        public Builder successThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        /**
         * 健康检查超时时间
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public CustomHealthCheckConfig build() {
            return new CustomHealthCheckConfig(this);
        } 

    } 

}
