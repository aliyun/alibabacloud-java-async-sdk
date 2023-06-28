// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HealthCheckConfig} extends {@link TeaModel}
 *
 * <p>HealthCheckConfig</p>
 */
public class HealthCheckConfig extends TeaModel {
    @NameInMap("failureThreshold")
    private Integer failureThreshold;

    @NameInMap("httpGetUrl")
    private String httpGetUrl;

    @NameInMap("initialDelaySeconds")
    private Integer initialDelaySeconds;

    @NameInMap("periodSeconds")
    private Integer periodSeconds;

    @NameInMap("successThreshold")
    private Integer successThreshold;

    @NameInMap("timeoutSeconds")
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
         * failureThreshold.
         */
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * httpGetUrl.
         */
        public Builder httpGetUrl(String httpGetUrl) {
            this.httpGetUrl = httpGetUrl;
            return this;
        }

        /**
         * initialDelaySeconds.
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * periodSeconds.
         */
        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * successThreshold.
         */
        public Builder successThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        /**
         * timeoutSeconds.
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
