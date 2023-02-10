// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappSyncPhoneNumberResponseBody} extends {@link TeaModel}
 *
 * <p>ChatappSyncPhoneNumberResponseBody</p>
 */
public class ChatappSyncPhoneNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PhoneNumbers")
    private java.util.List < PhoneNumbers> phoneNumbers;

    @NameInMap("RequestId")
    private String requestId;

    private ChatappSyncPhoneNumberResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.phoneNumbers = builder.phoneNumbers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappSyncPhoneNumberResponseBody create() {
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
         * The HTTP status code returned.
         * <p>
         * 
         * *   A value of OK indicates that the call is successful.
         * *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The list of phone numbers.
         */
        public Builder phoneNumbers(java.util.List < PhoneNumbers> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChatappSyncPhoneNumberResponseBody build() {
            return new ChatappSyncPhoneNumberResponseBody(this);
        } 

    } 

    public static class PhoneNumbers extends TeaModel {
        @NameInMap("CodeVerificationStatus")
        private String codeVerificationStatus;

        @NameInMap("MessagingLimitTier")
        private String messagingLimitTier;

        @NameInMap("NameStatus")
        private String nameStatus;

        @NameInMap("NewNameStatus")
        private String newNameStatus;

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
             * The verification status.
             */
            public Builder codeVerificationStatus(String codeVerificationStatus) {
                this.codeVerificationStatus = codeVerificationStatus;
                return this;
            }

            /**
             * The quantity of phone numbers to which messages can be sent in a day.
             */
            public Builder messagingLimitTier(String messagingLimitTier) {
                this.messagingLimitTier = messagingLimitTier;
                return this;
            }

            /**
             * The review status of the business name.
             */
            public Builder nameStatus(String nameStatus) {
                this.nameStatus = nameStatus;
                return this;
            }

            /**
             * The review status of the new business name.
             */
            public Builder newNameStatus(String newNameStatus) {
                this.newNameStatus = newNameStatus;
                return this;
            }

            /**
             * The phone number.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * The quality of the phone number. Valid values: GREEN, YELLOW, and RED.
             */
            public Builder qualityRating(String qualityRating) {
                this.qualityRating = qualityRating;
                return this;
            }

            /**
             * The status of the phone number.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The callback URL to which status reports are sent via HTTP callbacks.
             */
            public Builder statusCallbackUrl(String statusCallbackUrl) {
                this.statusCallbackUrl = statusCallbackUrl;
                return this;
            }

            /**
             * The status report queue.
             */
            public Builder statusQueue(String statusQueue) {
                this.statusQueue = statusQueue;
                return this;
            }

            /**
             * The callback URL to which MO messages are sent via HTTP callbacks.
             */
            public Builder upCallbackUrl(String upCallbackUrl) {
                this.upCallbackUrl = upCallbackUrl;
                return this;
            }

            /**
             * The mobile originated (MO) message queue.
             */
            public Builder upQueue(String upQueue) {
                this.upQueue = upQueue;
                return this;
            }

            /**
             * The name of the business to which the phone number belongs.
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
