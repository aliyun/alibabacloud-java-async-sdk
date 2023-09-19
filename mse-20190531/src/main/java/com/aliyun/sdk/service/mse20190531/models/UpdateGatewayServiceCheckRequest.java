// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayServiceCheckRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayServiceCheckRequest</p>
 */
public class UpdateGatewayServiceCheckRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Check")
    private Boolean check;

    @Query
    @NameInMap("ExpectedStatuses")
    private java.util.List < Integer > expectedStatuses;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @Query
    @NameInMap("HttpHost")
    private String httpHost;

    @Query
    @NameInMap("HttpPath")
    private String httpPath;

    @Query
    @NameInMap("Interval")
    private Integer interval;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("ServiceId")
    private String serviceId;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    @Query
    @NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    private UpdateGatewayServiceCheckRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.check = builder.check;
        this.expectedStatuses = builder.expectedStatuses;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.healthyThreshold = builder.healthyThreshold;
        this.httpHost = builder.httpHost;
        this.httpPath = builder.httpPath;
        this.interval = builder.interval;
        this.protocol = builder.protocol;
        this.serviceId = builder.serviceId;
        this.timeout = builder.timeout;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayServiceCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return check
     */
    public Boolean getCheck() {
        return this.check;
    }

    /**
     * @return expectedStatuses
     */
    public java.util.List < Integer > getExpectedStatuses() {
        return this.expectedStatuses;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
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

    public static final class Builder extends Request.Builder<UpdateGatewayServiceCheckRequest, Builder> {
        private String acceptLanguage; 
        private Boolean check; 
        private java.util.List < Integer > expectedStatuses; 
        private String gatewayUniqueId; 
        private Integer healthyThreshold; 
        private String httpHost; 
        private String httpPath; 
        private Integer interval; 
        private String protocol; 
        private String serviceId; 
        private Integer timeout; 
        private Integer unhealthyThreshold; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayServiceCheckRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.check = request.check;
            this.expectedStatuses = request.expectedStatuses;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.healthyThreshold = request.healthyThreshold;
            this.httpHost = request.httpHost;
            this.httpPath = request.httpPath;
            this.interval = request.interval;
            this.protocol = request.protocol;
            this.serviceId = request.serviceId;
            this.timeout = request.timeout;
            this.unhealthyThreshold = request.unhealthyThreshold;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Check.
         */
        public Builder check(Boolean check) {
            this.putQueryParameter("Check", check);
            this.check = check;
            return this;
        }

        /**
         * ExpectedStatuses.
         */
        public Builder expectedStatuses(java.util.List < Integer > expectedStatuses) {
            String expectedStatusesShrink = shrink(expectedStatuses, "ExpectedStatuses", "json");
            this.putQueryParameter("ExpectedStatuses", expectedStatusesShrink);
            this.expectedStatuses = expectedStatuses;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * HealthyThreshold.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * HttpHost.
         */
        public Builder httpHost(String httpHost) {
            this.putQueryParameter("HttpHost", httpHost);
            this.httpHost = httpHost;
            return this;
        }

        /**
         * HttpPath.
         */
        public Builder httpPath(String httpPath) {
            this.putQueryParameter("HttpPath", httpPath);
            this.httpPath = httpPath;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * UnhealthyThreshold.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        @Override
        public UpdateGatewayServiceCheckRequest build() {
            return new UpdateGatewayServiceCheckRequest(this);
        } 

    } 

}
