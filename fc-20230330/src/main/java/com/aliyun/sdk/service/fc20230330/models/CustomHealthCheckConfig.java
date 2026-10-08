// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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

        private Builder(CustomHealthCheckConfig model) {
            this.failureThreshold = model.failureThreshold;
            this.httpGetUrl = model.httpGetUrl;
            this.initialDelaySeconds = model.initialDelaySeconds;
            this.periodSeconds = model.periodSeconds;
            this.successThreshold = model.successThreshold;
            this.timeoutSeconds = model.timeoutSeconds;
        } 

        /**
         * <p>The threshold for health check failures. When this value is reached, the system considers the health check failed. Valid values: 1 to 120. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * <p>The health check URL of the custom container. The URL can be up to 2,048 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>/ready</p>
         */
        public Builder httpGetUrl(String httpGetUrl) {
            this.httpGetUrl = httpGetUrl;
            return this;
        }

        /**
         * <p>The delay between the container startup and the health check. Valid values: 0 to 120. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * <p>The health check period. Valid values: 1 to 120. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * <p>The threshold for health check successes. When this value is reached, the system considers the health check successful. Valid values: 1 to 120. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder successThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        /**
         * <p>The timeout period of the health check. Unit: seconds. Valid values: 1 to 3. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
