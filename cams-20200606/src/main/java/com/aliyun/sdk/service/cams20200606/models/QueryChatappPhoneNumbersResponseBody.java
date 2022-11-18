// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>QueryChatappPhoneNumbersResponseBody</p>
 */
public class QueryChatappPhoneNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PhoneNumbers")
    private java.util.List < PhoneNumbers> phoneNumbers;

    @NameInMap("RequestId")
    private String requestId;

    private QueryChatappPhoneNumbersResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.phoneNumbers = builder.phoneNumbers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChatappPhoneNumbersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return phoneNumbers
     */
    public java.util.List < PhoneNumbers> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < PhoneNumbers> phoneNumbers; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * 模板列表
         */
        public Builder phoneNumbers(java.util.List < PhoneNumbers> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryChatappPhoneNumbersResponseBody build() {
            return new QueryChatappPhoneNumbersResponseBody(this);
        } 

    } 

    public static class PhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("QualityRating")
        private String qualityRating;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusCallbackUrl")
        private String statusCallbackUrl;

        @NameInMap("StatusQueue")
        private String statusQueue;

        @NameInMap("UpCallbackUrl")
        private String upCallbackUrl;

        @NameInMap("UpQueue")
        private String upQueue;

        @NameInMap("VerifiedName")
        private String verifiedName;

        private PhoneNumbers(Builder builder) {
            this.phoneNumber = builder.phoneNumber;
            this.qualityRating = builder.qualityRating;
            this.status = builder.status;
            this.statusCallbackUrl = builder.statusCallbackUrl;
            this.statusQueue = builder.statusQueue;
            this.upCallbackUrl = builder.upCallbackUrl;
            this.upQueue = builder.upQueue;
            this.verifiedName = builder.verifiedName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return qualityRating
         */
        public String getQualityRating() {
            return this.qualityRating;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusCallbackUrl
         */
        public String getStatusCallbackUrl() {
            return this.statusCallbackUrl;
        }

        /**
         * @return statusQueue
         */
        public String getStatusQueue() {
            return this.statusQueue;
        }

        /**
         * @return upCallbackUrl
         */
        public String getUpCallbackUrl() {
            return this.upCallbackUrl;
        }

        /**
         * @return upQueue
         */
        public String getUpQueue() {
            return this.upQueue;
        }

        /**
         * @return verifiedName
         */
        public String getVerifiedName() {
            return this.verifiedName;
        }

        public static final class Builder {
            private String phoneNumber; 
            private String qualityRating; 
            private String status; 
            private String statusCallbackUrl; 
            private String statusQueue; 
            private String upCallbackUrl; 
            private String upQueue; 
            private String verifiedName; 

            /**
             * 模板编码
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * QualityRating.
             */
            public Builder qualityRating(String qualityRating) {
                this.qualityRating = qualityRating;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 模板分类
             */
            public Builder statusCallbackUrl(String statusCallbackUrl) {
                this.statusCallbackUrl = statusCallbackUrl;
                return this;
            }

            /**
             * 审核状态
             */
            public Builder statusQueue(String statusQueue) {
                this.statusQueue = statusQueue;
                return this;
            }

            /**
             * 模板分类
             */
            public Builder upCallbackUrl(String upCallbackUrl) {
                this.upCallbackUrl = upCallbackUrl;
                return this;
            }

            /**
             * 模板名称
             */
            public Builder upQueue(String upQueue) {
                this.upQueue = upQueue;
                return this;
            }

            /**
             * 语言
             */
            public Builder verifiedName(String verifiedName) {
                this.verifiedName = verifiedName;
                return this;
            }

            public PhoneNumbers build() {
                return new PhoneNumbers(this);
            } 

        } 

    }
}
