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
         * AlertContact.
         */
        public Builder alertContact(AlertContact alertContact) {
            this.alertContact = alertContact;
            return this;
        }

        /**
         * Id of the request
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

        @NameInMap("Email")
        private String email;

        @NameInMap("IsVerify")
        private Boolean isVerify;

        @NameInMap("Phone")
        private String phone;

        private AlertContact(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.email = builder.email;
            this.isVerify = builder.isVerify;
            this.phone = builder.phone;
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

        public static final class Builder {
            private Float contactId; 
            private String contactName; 
            private String email; 
            private Boolean isVerify; 
            private String phone; 

            /**
             * 告警联系人ID
             */
            public Builder contactId(Float contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * 告警联系人名称
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * 告警联系人邮箱
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 手机号码验证标识
             */
            public Builder isVerify(Boolean isVerify) {
                this.isVerify = isVerify;
                return this;
            }

            /**
             * 告警联系人手机号
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public AlertContact build() {
                return new AlertContact(this);
            } 

        } 

    }
}
