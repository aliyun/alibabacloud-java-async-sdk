// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnOriginSiteHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnOriginSiteHealthStatusResponseBody</p>
 */
public class DescribeDcdnOriginSiteHealthStatusResponseBody extends TeaModel {
    @NameInMap("OriginSiteStatus")
    private java.util.List < OriginSiteStatus> originSiteStatus;

    @NameInMap("RequestId")
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
         * OriginSiteStatus.
         */
        public Builder originSiteStatus(java.util.List < OriginSiteStatus> originSiteStatus) {
            this.originSiteStatus = originSiteStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnOriginSiteHealthStatusResponseBody build() {
            return new DescribeDcdnOriginSiteHealthStatusResponseBody(this);
        } 

    } 

    public static class OriginSiteStatus extends TeaModel {
        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("Host")
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
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * Host.
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
