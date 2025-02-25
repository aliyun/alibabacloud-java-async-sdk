// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsUpsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsUpsResponseBody</p>
 */
public class QuerySmsUpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmsUps")
    private java.util.List < SmsUps> smsUps;

    @com.aliyun.core.annotation.NameInMap("TotalElements")
    private Long totalElements;

    private QuerySmsUpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.smsUps = builder.smsUps;
        this.totalElements = builder.totalElements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsUpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smsUps
     */
    public java.util.List < SmsUps> getSmsUps() {
        return this.smsUps;
    }

    /**
     * @return totalElements
     */
    public Long getTotalElements() {
        return this.totalElements;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SmsUps> smsUps; 
        private Long totalElements; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SmsUps.
         */
        public Builder smsUps(java.util.List < SmsUps> smsUps) {
            this.smsUps = smsUps;
            return this;
        }

        /**
         * TotalElements.
         */
        public Builder totalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        public QuerySmsUpsResponseBody build() {
            return new QuerySmsUpsResponseBody(this);
        } 

    } 

    public static class SmsUps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DestCode")
        private String destCode;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("SendTime")
        private String sendTime;

        @com.aliyun.core.annotation.NameInMap("SequenceId")
        private String sequenceId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private SmsUps(Builder builder) {
            this.content = builder.content;
            this.destCode = builder.destCode;
            this.phoneNumber = builder.phoneNumber;
            this.sendTime = builder.sendTime;
            this.sequenceId = builder.sequenceId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsUps create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return destCode
         */
        public String getDestCode() {
            return this.destCode;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return sendTime
         */
        public String getSendTime() {
            return this.sendTime;
        }

        /**
         * @return sequenceId
         */
        public String getSequenceId() {
            return this.sequenceId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String content; 
            private String destCode; 
            private String phoneNumber; 
            private String sendTime; 
            private String sequenceId; 
            private String tenantId; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DestCode.
             */
            public Builder destCode(String destCode) {
                this.destCode = destCode;
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
             * SendTime.
             */
            public Builder sendTime(String sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * SequenceId.
             */
            public Builder sequenceId(String sequenceId) {
                this.sequenceId = sequenceId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public SmsUps build() {
                return new SmsUps(this);
            } 

        } 

    }
}
