// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRequestGraphResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRequestGraphResponseBody</p>
 */
public class DescribeRequestGraphResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestDetails")
    private RequestDetails requestDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRequestGraphResponseBody(Builder builder) {
        this.requestDetails = builder.requestDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRequestGraphResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestDetails
     */
    public RequestDetails getRequestDetails() {
        return this.requestDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RequestDetails requestDetails; 
        private String requestId; 

        /**
         * <p>The details of the DNS requests.</p>
         */
        public Builder requestDetails(RequestDetails requestDetails) {
            this.requestDetails = requestDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EB71815-A421-4E51-8E8D-667F44ABE633</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRequestGraphResponseBody build() {
            return new DescribeRequestGraphResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRequestGraphResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRequestGraphResponseBody</p>
     */
    public static class ZoneRequestTop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestCount")
        private Long requestCount;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private ZoneRequestTop(Builder builder) {
            this.requestCount = builder.requestCount;
            this.time = builder.time;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneRequestTop create() {
            return builder().build();
        }

        /**
         * @return requestCount
         */
        public Long getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long requestCount; 
            private String time; 
            private Long timestamp; 

            /**
             * <p>The number of DNS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>103</p>
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * <p>The time when the data was collected. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-21T10:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The time when the data was collected. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1571652000000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public ZoneRequestTop build() {
                return new ZoneRequestTop(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRequestGraphResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRequestGraphResponseBody</p>
     */
    public static class RequestDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneRequestTop")
        private java.util.List < ZoneRequestTop> zoneRequestTop;

        private RequestDetails(Builder builder) {
            this.zoneRequestTop = builder.zoneRequestTop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestDetails create() {
            return builder().build();
        }

        /**
         * @return zoneRequestTop
         */
        public java.util.List < ZoneRequestTop> getZoneRequestTop() {
            return this.zoneRequestTop;
        }

        public static final class Builder {
            private java.util.List < ZoneRequestTop> zoneRequestTop; 

            /**
             * ZoneRequestTop.
             */
            public Builder zoneRequestTop(java.util.List < ZoneRequestTop> zoneRequestTop) {
                this.zoneRequestTop = zoneRequestTop;
                return this;
            }

            public RequestDetails build() {
                return new RequestDetails(this);
            } 

        } 

    }
}
