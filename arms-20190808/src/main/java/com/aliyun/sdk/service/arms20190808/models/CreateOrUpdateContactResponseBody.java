// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateContactResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateContactResponseBody</p>
 */
public class CreateOrUpdateContactResponseBody extends TeaModel {
    @NameInMap("AlertContact")
    private AlertContact alertContact;

    @NameInMap("RequestId")
    private String requestId;

    private CreateOrUpdateContactResponseBody(Builder builder) {
        this.alertContact = builder.alertContact;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateContactResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertContact
     */
    public AlertContact getAlertContact() {
        return this.alertContact;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AlertContact alertContact; 
        private String requestId; 

        /**
         * The object of the alert contact.
         */
        public Builder alertContact(AlertContact alertContact) {
            this.alertContact = alertContact;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateContactResponseBody build() {
            return new CreateOrUpdateContactResponseBody(this);
        } 

    } 

    public static class AlertContact extends TeaModel {
        @NameInMap("ContactId")
        private Float contactId;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("DingRobotUrl")
        private String dingRobotUrl;

        @NameInMap("Email")
        private String email;

        @NameInMap("IsVerify")
        private Boolean isVerify;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("ReissueSendNotice")
        private Long reissueSendNotice;

        @NameInMap("isEmailVerify")
        private Boolean isEmailVerify;

        private AlertContact(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.dingRobotUrl = builder.dingRobotUrl;
            this.email = builder.email;
            this.isVerify = builder.isVerify;
            this.phone = builder.phone;
            this.reissueSendNotice = builder.reissueSendNotice;
            this.isEmailVerify = builder.isEmailVerify;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertContact create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public Float getContactId() {
            return this.contactId;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return dingRobotUrl
         */
        public String getDingRobotUrl() {
            return this.dingRobotUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return isVerify
         */
        public Boolean getIsVerify() {
            return this.isVerify;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return reissueSendNotice
         */
        public Long getReissueSendNotice() {
            return this.reissueSendNotice;
        }

        /**
         * @return isEmailVerify
         */
        public Boolean getIsEmailVerify() {
            return this.isEmailVerify;
        }

        public static final class Builder {
            private Float contactId; 
            private String contactName; 
            private String dingRobotUrl; 
            private String email; 
            private Boolean isVerify; 
            private String phone; 
            private Long reissueSendNotice; 
            private Boolean isEmailVerify; 

            /**
             * The ID of the alert contact.
             */
            public Builder contactId(Float contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * The name of the alert contact.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * The webhook URL of the DingTalk chatbot.
             */
            public Builder dingRobotUrl(String dingRobotUrl) {
                this.dingRobotUrl = dingRobotUrl;
                return this;
            }

            /**
             * The email address of the alert contact.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Indicates whether the mobile number was verified. Valid values:
             * <p>
             * 
             * *   `false` (default value): No
             * *   `true`: Yes
             * 
             * You can call the **SendTTSVerifyLink** operation to verify the mobile number of an alert contact. Only verified mobile numbers can be specified in a notification policy to receive phone calls.
             */
            public Builder isVerify(Boolean isVerify) {
                this.isVerify = isVerify;
                return this;
            }

            /**
             * The mobile number of the alert contact.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * The operation that you want to perform if phone calls fail to be answered. Valid values: 0: No operation is performed. 1: A phone call is made again. 2: A text message is sent. 3 (default value): The global default value is used.
             */
            public Builder reissueSendNotice(Long reissueSendNotice) {
                this.reissueSendNotice = reissueSendNotice;
                return this;
            }

            /**
             * Indicates whether the email address was verified.
             */
            public Builder isEmailVerify(Boolean isEmailVerify) {
                this.isEmailVerify = isEmailVerify;
                return this;
            }

            public AlertContact build() {
                return new AlertContact(this);
            } 

        } 

    }
}
