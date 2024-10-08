// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappPhoneNumberMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatappPhoneNumberMetricResponseBody</p>
 */
public class GetChatappPhoneNumberMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetChatappPhoneNumberMetricResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatappPhoneNumberMetricResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * The details about the access denial.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The value OK indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatappPhoneNumberMetricResponseBody build() {
            return new GetChatappPhoneNumberMetricResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveredCount")
        private Integer deliveredCount;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("SentCount")
        private Integer sentCount;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Long start;

        private Data(Builder builder) {
            this.deliveredCount = builder.deliveredCount;
            this.end = builder.end;
            this.granularity = builder.granularity;
            this.phoneNumber = builder.phoneNumber;
            this.sentCount = builder.sentCount;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deliveredCount
         */
        public Integer getDeliveredCount() {
            return this.deliveredCount;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return sentCount
         */
        public Integer getSentCount() {
            return this.sentCount;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        public static final class Builder {
            private Integer deliveredCount; 
            private Long end; 
            private String granularity; 
            private String phoneNumber; 
            private Integer sentCount; 
            private Long start; 

            /**
             * The number of delivered messages.
             */
            public Builder deliveredCount(Integer deliveredCount) {
                this.deliveredCount = deliveredCount;
                return this;
            }

            /**
             * The end of the time range that you queried.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * The granularity of the metric.
             * <p>
             * 
             * Valid values:
             * 
             * *   DAILY
             * *   HALF_HOUR
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * The business phone number.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * The number of sent messages.
             */
            public Builder sentCount(Integer sentCount) {
                this.sentCount = sentCount;
                return this;
            }

            /**
             * The beginning of the time range that you queried.
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
