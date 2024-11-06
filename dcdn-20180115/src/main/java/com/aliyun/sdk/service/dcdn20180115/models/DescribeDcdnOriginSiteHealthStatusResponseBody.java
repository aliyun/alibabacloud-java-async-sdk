// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnOriginSiteHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnOriginSiteHealthStatusResponseBody</p>
 */
public class DescribeDcdnOriginSiteHealthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OriginSiteStatus")
    private java.util.List < OriginSiteStatus> originSiteStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnOriginSiteHealthStatusResponseBody(Builder builder) {
        this.originSiteStatus = builder.originSiteStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnOriginSiteHealthStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return originSiteStatus
     */
    public java.util.List < OriginSiteStatus> getOriginSiteStatus() {
        return this.originSiteStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OriginSiteStatus> originSiteStatus; 
        private String requestId; 

        /**
         * <p>The information about the origin server of the accelerated domain name.</p>
         */
        public Builder originSiteStatus(java.util.List < OriginSiteStatus> originSiteStatus) {
            this.originSiteStatus = originSiteStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnOriginSiteHealthStatusResponseBody build() {
            return new DescribeDcdnOriginSiteHealthStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnOriginSiteHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnOriginSiteHealthStatusResponseBody</p>
     */
    public static class OriginSiteStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        private OriginSiteStatus(Builder builder) {
            this.healthStatus = builder.healthStatus;
            this.host = builder.host;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginSiteStatus create() {
            return builder().build();
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        public static final class Builder {
            private String healthStatus; 
            private String host; 

            /**
             * <p>The health status of the origin server. Each point of presence (POP) periodically initiates a probe request to the configured origin domain name. If the POP receives a response from the origin server in 5 seconds, the probe is considered successful. After the probe data for each POP is collected, the health status of the origin server is calculated based on the proportion of successful probes. Valid values:</p>
             * <ul>
             * <li>unknown: The probe data of the origin server is not obtained because the configurations of the origin server have been changed recently. Try again later.</li>
             * <li>healthy: The proportion of successful probes is higher than 80%.</li>
             * <li>degraded: The proportion of successful probes is higher than 0% and lower than or equal to 80%.</li>
             * <li>critical: All probing requests to the origin server failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The origin domain name that you configured in the DCDN console, which can be an IPv4 address, IPv6 address, common domain name, or Object Storage Service (OSS) domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>host.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            public OriginSiteStatus build() {
                return new OriginSiteStatus(this);
            } 

        } 

    }
}
