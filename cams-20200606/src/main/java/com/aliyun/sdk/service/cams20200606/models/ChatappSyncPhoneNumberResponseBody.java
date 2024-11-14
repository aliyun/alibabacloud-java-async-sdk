// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChatappSyncPhoneNumberResponseBody} extends {@link TeaModel}
 *
 * <p>ChatappSyncPhoneNumberResponseBody</p>
 */
public class ChatappSyncPhoneNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    private java.util.List < PhoneNumbers> phoneNumbers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ChatappSyncPhoneNumberResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.phoneNumbers = builder.phoneNumbers;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappSyncPhoneNumberResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private java.util.List < PhoneNumbers> phoneNumbers; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * <ul>
         * <li>A value of OK indicates that the call is successful.</li>
         * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>None.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Details of the phone numbers.</p>
         */
        public Builder phoneNumbers(java.util.List < PhoneNumbers> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ChatappSyncPhoneNumberResponseBody build() {
            return new ChatappSyncPhoneNumberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChatappSyncPhoneNumberResponseBody} extends {@link TeaModel}
     *
     * <p>ChatappSyncPhoneNumberResponseBody</p>
     */
    public static class PhoneNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeVerificationStatus")
        private String codeVerificationStatus;

        @com.aliyun.core.annotation.NameInMap("MessagingLimitTier")
        private String messagingLimitTier;

        @com.aliyun.core.annotation.NameInMap("NameStatus")
        private String nameStatus;

        @com.aliyun.core.annotation.NameInMap("NewNameStatus")
        private String newNameStatus;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("QualityRating")
        private String qualityRating;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCallbackUrl")
        private String statusCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("StatusQueue")
        private String statusQueue;

        @com.aliyun.core.annotation.NameInMap("UpCallbackUrl")
        private String upCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("UpQueue")
        private String upQueue;

        @com.aliyun.core.annotation.NameInMap("VerifiedName")
        private String verifiedName;

        private PhoneNumbers(Builder builder) {
            this.codeVerificationStatus = builder.codeVerificationStatus;
            this.messagingLimitTier = builder.messagingLimitTier;
            this.nameStatus = builder.nameStatus;
            this.newNameStatus = builder.newNameStatus;
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
         * @return codeVerificationStatus
         */
        public String getCodeVerificationStatus() {
            return this.codeVerificationStatus;
        }

        /**
         * @return messagingLimitTier
         */
        public String getMessagingLimitTier() {
            return this.messagingLimitTier;
        }

        /**
         * @return nameStatus
         */
        public String getNameStatus() {
            return this.nameStatus;
        }

        /**
         * @return newNameStatus
         */
        public String getNewNameStatus() {
            return this.newNameStatus;
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
            private String codeVerificationStatus; 
            private String messagingLimitTier; 
            private String nameStatus; 
            private String newNameStatus; 
            private String phoneNumber; 
            private String qualityRating; 
            private String status; 
            private String statusCallbackUrl; 
            private String statusQueue; 
            private String upCallbackUrl; 
            private String upQueue; 
            private String verifiedName; 

            /**
             * <p>The verification status.</p>
             * 
             * <strong>example:</strong>
             * <p>VERIFIED</p>
             */
            public Builder codeVerificationStatus(String codeVerificationStatus) {
                this.codeVerificationStatus = codeVerificationStatus;
                return this;
            }

            /**
             * <p>The number of phone numbers to which messages can be sent in a day.</p>
             * 
             * <strong>example:</strong>
             * <p>TIER_10</p>
             */
            public Builder messagingLimitTier(String messagingLimitTier) {
                this.messagingLimitTier = messagingLimitTier;
                return this;
            }

            /**
             * <p>The review status of the business display name.</p>
             * 
             * <strong>example:</strong>
             * <p>Approval</p>
             */
            public Builder nameStatus(String nameStatus) {
                this.nameStatus = nameStatus;
                return this;
            }

            /**
             * <p>The review status of the new business display name.</p>
             * 
             * <strong>example:</strong>
             * <p>Approval</p>
             */
            public Builder newNameStatus(String newNameStatus) {
                this.newNameStatus = newNameStatus;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>8613800001234</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The quality rating of the phone number. Valid values: GREEN, YELLOW, and RED.</p>
             * 
             * <strong>example:</strong>
             * <p>GREEN</p>
             */
            public Builder qualityRating(String qualityRating) {
                this.qualityRating = qualityRating;
                return this;
            }

            /**
             * <p>The status of the phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The callback URL to which status reports are sent by using HTTP callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.alibaba.com/status">https://www.alibaba.com/status</a></p>
             */
            public Builder statusCallbackUrl(String statusCallbackUrl) {
                this.statusCallbackUrl = statusCallbackUrl;
                return this;
            }

            /**
             * <p>The status report queue.</p>
             * 
             * <strong>example:</strong>
             * <p>alicom-09399200-queue</p>
             */
            public Builder statusQueue(String statusQueue) {
                this.statusQueue = statusQueue;
                return this;
            }

            /**
             * <p>The callback URL to which MO messages are sent by using HTTP callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.alibaba.com/inbound">https://www.alibaba.com/inbound</a></p>
             */
            public Builder upCallbackUrl(String upCallbackUrl) {
                this.upCallbackUrl = upCallbackUrl;
                return this;
            }

            /**
             * <p>The mobile originated (MO) message queue.</p>
             * 
             * <strong>example:</strong>
             * <p>alicom-09399200-queue</p>
             */
            public Builder upQueue(String upQueue) {
                this.upQueue = upQueue;
                return this;
            }

            /**
             * <p>The display name of the business to which the phone number belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
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
