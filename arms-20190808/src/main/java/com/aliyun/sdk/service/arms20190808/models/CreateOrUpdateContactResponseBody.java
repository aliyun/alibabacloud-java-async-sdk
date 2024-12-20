// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreateOrUpdateContactResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateContactResponseBody</p>
 */
public class CreateOrUpdateContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertContact")
    private AlertContact alertContact;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The object of the alert contact.</p>
         */
        public Builder alertContact(AlertContact alertContact) {
            this.alertContact = alertContact;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateContactResponseBody build() {
            return new CreateOrUpdateContactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrUpdateContactResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateContactResponseBody</p>
     */
    public static class AlertContact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Float contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("DingRobotUrl")
        private String dingRobotUrl;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("IsVerify")
        private Boolean isVerify;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("ReissueSendNotice")
        private Long reissueSendNotice;

        @com.aliyun.core.annotation.NameInMap("isEmailVerify")
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
             * <p>The ID of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder contactId(Float contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The name of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>JohnDoe</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The webhook URL of the DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test1.com">https://test1.com</a></p>
             */
            public Builder dingRobotUrl(String dingRobotUrl) {
                this.dingRobotUrl = dingRobotUrl;
                return this;
            }

            /**
             * <p>The email address of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Indicates whether the mobile number was verified. Valid values:</p>
             * <ul>
             * <li><code>false</code> (default value): No</li>
             * <li><code>true</code>: Yes</li>
             * </ul>
             * <p>You can call the <strong>SendTTSVerifyLink</strong> operation to verify the mobile number of an alert contact. Only verified mobile numbers can be specified in a notification policy to receive phone calls.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isVerify(Boolean isVerify) {
                this.isVerify = isVerify;
                return this;
            }

            /**
             * <p>The mobile number of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The operation that you want to perform if phone calls fail to be answered. Valid values: 0: No operation is performed. 1: A phone call is made again. 2: A text message is sent. 3 (default value): The global default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder reissueSendNotice(Long reissueSendNotice) {
                this.reissueSendNotice = reissueSendNotice;
                return this;
            }

            /**
             * <p>Indicates whether the email address was verified.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
