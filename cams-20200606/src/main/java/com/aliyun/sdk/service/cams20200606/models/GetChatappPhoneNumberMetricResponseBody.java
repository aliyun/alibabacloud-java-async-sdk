// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappPhoneNumberMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatappPhoneNumberMetricResponseBody</p>
 */
public class GetChatappPhoneNumberMetricResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("DeliveredCount")
        private Integer deliveredCount;

        @NameInMap("End")
        private Long end;

        @NameInMap("Granularity")
        private String granularity;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("SentCount")
        private Integer sentCount;

        @NameInMap("Start")
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
             * DeliveredCount.
             */
            public Builder deliveredCount(Integer deliveredCount) {
                this.deliveredCount = deliveredCount;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Granularity.
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * SentCount.
             */
            public Builder sentCount(Integer sentCount) {
                this.sentCount = sentCount;
                return this;
            }

            /**
             * Start.
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
