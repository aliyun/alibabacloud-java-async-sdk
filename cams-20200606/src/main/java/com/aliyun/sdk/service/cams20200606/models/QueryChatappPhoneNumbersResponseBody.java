// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>QueryChatappPhoneNumbersResponseBody</p>
 */
public class QueryChatappPhoneNumbersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    private java.util.List<PhoneNumbers> phoneNumbers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryChatappPhoneNumbersResponseBody(Builder builder) {
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

    public static QueryChatappPhoneNumbersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PhoneNumbers> getPhoneNumbers() {
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
        private java.util.List<PhoneNumbers> phoneNumbers; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryChatappPhoneNumbersResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.phoneNumbers = model.phoneNumbers;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The phone numbers.</p>
         */
        public Builder phoneNumbers(java.util.List<PhoneNumbers> phoneNumbers) {
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

        public QueryChatappPhoneNumbersResponseBody build() {
            return new QueryChatappPhoneNumbersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChatappPhoneNumbersResponseBody</p>
     */
    public static class PhoneNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeVerificationStatus")
        private String codeVerificationStatus;

        @com.aliyun.core.annotation.NameInMap("IsOfficial")
        private String isOfficial;

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
            this.isOfficial = builder.isOfficial;
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
         * @return isOfficial
         */
        public String getIsOfficial() {
            return this.isOfficial;
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
            private String isOfficial; 
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

            private Builder() {
            } 

            private Builder(PhoneNumbers model) {
                this.codeVerificationStatus = model.codeVerificationStatus;
                this.isOfficial = model.isOfficial;
                this.messagingLimitTier = model.messagingLimitTier;
                this.nameStatus = model.nameStatus;
                this.newNameStatus = model.newNameStatus;
                this.phoneNumber = model.phoneNumber;
                this.qualityRating = model.qualityRating;
                this.status = model.status;
                this.statusCallbackUrl = model.statusCallbackUrl;
                this.statusQueue = model.statusQueue;
                this.upCallbackUrl = model.upCallbackUrl;
                this.upQueue = model.upQueue;
                this.verifiedName = model.verifiedName;
            } 

            /**
             * <p>The verification status of the phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>VERIFIED</p>
             */
            public Builder codeVerificationStatus(String codeVerificationStatus) {
                this.codeVerificationStatus = codeVerificationStatus;
                return this;
            }

            /**
             * IsOfficial.
             */
            public Builder isOfficial(String isOfficial) {
                this.isOfficial = isOfficial;
                return this;
            }

            /**
             * <p>The number of phone numbers to which messages can be sent in a day.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>TIER_100K: 100,000</li>
             * <li>TIER_UNLIMITED: unlimited</li>
             * <li>TIER_250: 250</li>
             * <li>TIER_1K: 1,000</li>
             * <li>TIER_50: 50</li>
             * <li>TIER_10K: 10,000</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TIER_10</p>
             */
            public Builder messagingLimitTier(String messagingLimitTier) {
                this.messagingLimitTier = messagingLimitTier;
                return this;
            }

            /**
             * <p>The status of the business name.</p>
             * 
             * <strong>example:</strong>
             * <p>Approval</p>
             */
            public Builder nameStatus(String nameStatus) {
                this.nameStatus = nameStatus;
                return this;
            }

            /**
             * <p>The review status of the new business name.</p>
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
             * <p>8613800000</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The quality rating of the phone number.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RED</li>
             * <li>YELLOW</li>
             * <li>UNKNOWN</li>
             * <li>GREEN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GREEN</p>
             */
            public Builder qualityRating(String qualityRating) {
                this.qualityRating = qualityRating;
                return this;
            }

            /**
             * <p>The state of the phone number.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>MIGRATED</li>
             * <li>FLAGGED</li>
             * <li>DISCONNECTED</li>
             * <li>UNVERIFIED</li>
             * <li>BANNED</li>
             * <li>RATE_LIMITED</li>
             * <li>PENDING</li>
             * <li>CONNECTED</li>
             * <li>UNKNOWN</li>
             * <li>DELETED</li>
             * <li>RESTRICTED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONNECTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The callback URL to which status reports are sent by using HTTP callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ali.com/status">https://ali.com/status</a></p>
             */
            public Builder statusCallbackUrl(String statusCallbackUrl) {
                this.statusCallbackUrl = statusCallbackUrl;
                return this;
            }

            /**
             * <p>The status report queue.</p>
             * 
             * <strong>example:</strong>
             * <p>Alicom-Queue-****-ChatAppStatus</p>
             */
            public Builder statusQueue(String statusQueue) {
                this.statusQueue = statusQueue;
                return this;
            }

            /**
             * <p>The callback URL to which MO messages are sent by using HTTP callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ali.com/inbound">https://ali.com/inbound</a></p>
             */
            public Builder upCallbackUrl(String upCallbackUrl) {
                this.upCallbackUrl = upCallbackUrl;
                return this;
            }

            /**
             * <p>The mobile originated (MO) message notification queue.</p>
             * 
             * <strong>example:</strong>
             * <p>Alicom-Queue-****-ChatAppInbound</p>
             */
            public Builder upQueue(String upQueue) {
                this.upQueue = upQueue;
                return this;
            }

            /**
             * <p>The name of the company with which the phone number is associated.</p>
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
