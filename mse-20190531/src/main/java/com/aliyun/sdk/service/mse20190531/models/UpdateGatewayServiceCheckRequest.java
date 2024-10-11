// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateGatewayServiceCheckRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayServiceCheckRequest</p>
 */
public class UpdateGatewayServiceCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Check")
    private Boolean check;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpectedStatuses")
    private java.util.List < Integer > expectedStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpHost")
    private String httpHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpPath")
    private String httpPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
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
         * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to enable the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder check(Boolean check) {
            this.putQueryParameter("Check", check);
            this.check = check;
            return this;
        }

        /**
         * <p>The expected status code, which is required if the health check protocol is HTTP.</p>
         */
        public Builder expectedStatuses(java.util.List < Integer > expectedStatuses) {
            String expectedStatusesShrink = shrink(expectedStatuses, "ExpectedStatuses", "json");
            this.putQueryParameter("ExpectedStatuses", expectedStatusesShrink);
            this.expectedStatuses = expectedStatuses;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-8d410698bd7f4628ab76b*****72dd1d</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The healthy threshold of the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>The health check domain name, which is optional if the health check protocol is HTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder httpHost(String httpHost) {
            this.putQueryParameter("HttpHost", httpHost);
            this.httpHost = httpHost;
            return this;
        }

        /**
         * <p>The health check path, which is required if the health check protocol is HTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthz</p>
         */
        public Builder httpPath(String httpPath) {
            this.putQueryParameter("HttpPath", httpPath);
            this.httpPath = httpPath;
            return this;
        }

        /**
         * <p>The interval at which the health check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The health check protocol. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>TCP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The timeout period of responses to the health check. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The unhealthy threshold of the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
