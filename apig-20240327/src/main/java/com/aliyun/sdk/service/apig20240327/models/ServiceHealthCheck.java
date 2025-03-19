// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ServiceHealthCheck} extends {@link TeaModel}
 *
 * <p>ServiceHealthCheck</p>
 */
public class ServiceHealthCheck extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("healthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.NameInMap("httpHost")
    private String httpHost;

    @com.aliyun.core.annotation.NameInMap("httpPath")
    private String httpPath;

    @com.aliyun.core.annotation.NameInMap("interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("unhealthyThreshold")
    private Integer unhealthyThreshold;

    private ServiceHealthCheck(Builder builder) {
        this.enable = builder.enable;
        this.healthyThreshold = builder.healthyThreshold;
        this.httpHost = builder.httpHost;
        this.httpPath = builder.httpPath;
        this.interval = builder.interval;
        this.protocol = builder.protocol;
        this.timeout = builder.timeout;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceHealthCheck create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return healthyThreshold
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * @return httpHost
     */
    public String getHttpHost() {
        return this.httpHost;
    }

    /**
     * @return httpPath
     */
    public String getHttpPath() {
        return this.httpPath;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static final class Builder {
        private Boolean enable; 
        private Integer healthyThreshold; 
        private String httpHost; 
        private String httpPath; 
        private Integer interval; 
        private String protocol; 
        private Integer timeout; 
        private Integer unhealthyThreshold; 

        private Builder() {
        } 

        private Builder(ServiceHealthCheck model) {
            this.enable = model.enable;
            this.healthyThreshold = model.healthyThreshold;
            this.httpHost = model.httpHost;
            this.httpPath = model.httpPath;
            this.interval = model.interval;
            this.protocol = model.protocol;
            this.timeout = model.timeout;
            this.unhealthyThreshold = model.unhealthyThreshold;
        } 

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * healthyThreshold.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * httpHost.
         */
        public Builder httpHost(String httpHost) {
            this.httpHost = httpHost;
            return this;
        }

        /**
         * httpPath.
         */
        public Builder httpPath(String httpPath) {
            this.httpPath = httpPath;
            return this;
        }

        /**
         * interval.
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * unhealthyThreshold.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public ServiceHealthCheck build() {
            return new ServiceHealthCheck(this);
        } 

    } 

}
