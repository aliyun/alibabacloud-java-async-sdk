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
 * {@link CustomHealthCheckConfig} extends {@link TeaModel}
 *
 * <p>CustomHealthCheckConfig</p>
 */
public class CustomHealthCheckConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("failureThreshold")
    private Integer failureThreshold;

    @com.aliyun.core.annotation.NameInMap("httpGetUrl")
    private String httpGetUrl;

    @com.aliyun.core.annotation.NameInMap("initialDelaySeconds")
    private Integer initialDelaySeconds;

    @com.aliyun.core.annotation.NameInMap("periodSeconds")
    private Integer periodSeconds;

    @com.aliyun.core.annotation.NameInMap("successThreshold")
    private Integer successThreshold;

    @com.aliyun.core.annotation.NameInMap("timeoutSeconds")
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

        public CustomHealthCheckConfig build() {
            return new CustomHealthCheckConfig(this);
        } 

    } 

}
