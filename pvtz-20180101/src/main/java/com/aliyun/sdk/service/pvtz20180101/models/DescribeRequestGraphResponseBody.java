// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRequestGraphResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRequestGraphResponseBody</p>
 */
public class DescribeRequestGraphResponseBody extends TeaModel {
    @NameInMap("RequestDetails")
    private RequestDetails requestDetails;

    @NameInMap("RequestId")
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
         * RequestDetails.
         */
        public Builder requestDetails(RequestDetails requestDetails) {
            this.requestDetails = requestDetails;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRequestGraphResponseBody build() {
            return new DescribeRequestGraphResponseBody(this);
        } 

    } 

    public static class ZoneRequestTop extends TeaModel {
        @NameInMap("RequestCount")
        private Long requestCount;

        @NameInMap("Time")
        private String time;

        @NameInMap("Timestamp")
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
             * RequestCount.
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Timestamp.
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
    public static class RequestDetails extends TeaModel {
        @NameInMap("ZoneRequestTop")
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
