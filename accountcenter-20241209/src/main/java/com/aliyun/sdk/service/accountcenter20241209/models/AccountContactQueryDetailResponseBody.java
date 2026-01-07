// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link AccountContactQueryDetailResponseBody} extends {@link TeaModel}
 *
 * <p>AccountContactQueryDetailResponseBody</p>
 */
public class AccountContactQueryDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AccountContactQueryDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccountContactQueryDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AccountContactQueryDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
        public Builder data(Data data) {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AccountContactQueryDetailResponseBody build() {
            return new AccountContactQueryDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AccountContactQueryDetailResponseBody} extends {@link TeaModel}
     *
     * <p>AccountContactQueryDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactEmail")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactMobile")
        private String contactMobile;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("ContactPosition")
        private String contactPosition;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("EmailConfirmed")
        private Boolean emailConfirmed;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("HasSubscription")
        private Boolean hasSubscription;

        @com.aliyun.core.annotation.NameInMap("MobileConfirmed")
        private Boolean mobileConfirmed;

        @com.aliyun.core.annotation.NameInMap("SharedContact")
        private Boolean sharedContact;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private Long updateDate;

        @com.aliyun.core.annotation.NameInMap("UpdateUser")
        private String updateUser;

        private Data(Builder builder) {
            this.contactEmail = builder.contactEmail;
            this.contactId = builder.contactId;
            this.contactMobile = builder.contactMobile;
            this.contactName = builder.contactName;
            this.contactPosition = builder.contactPosition;
            this.customerId = builder.customerId;
            this.emailConfirmed = builder.emailConfirmed;
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.hasSubscription = builder.hasSubscription;
            this.mobileConfirmed = builder.mobileConfirmed;
            this.sharedContact = builder.sharedContact;
            this.uid = builder.uid;
            this.updateDate = builder.updateDate;
            this.updateUser = builder.updateUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
        }

        /**
         * @return contactId
         */
        public Long getContactId() {
            return this.contactId;
        }

        /**
         * @return contactMobile
         */
        public String getContactMobile() {
            return this.contactMobile;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return contactPosition
         */
        public String getContactPosition() {
            return this.contactPosition;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return emailConfirmed
         */
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return hasSubscription
         */
        public Boolean getHasSubscription() {
            return this.hasSubscription;
        }

        /**
         * @return mobileConfirmed
         */
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        /**
         * @return sharedContact
         */
        public Boolean getSharedContact() {
            return this.sharedContact;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return updateDate
         */
        public Long getUpdateDate() {
            return this.updateDate;
        }

        /**
         * @return updateUser
         */
        public String getUpdateUser() {
            return this.updateUser;
        }

        public static final class Builder {
            private String contactEmail; 
            private Long contactId; 
            private String contactMobile; 
            private String contactName; 
            private String contactPosition; 
            private String customerId; 
            private Boolean emailConfirmed; 
            private String entityId; 
            private String entityType; 
            private Boolean hasSubscription; 
            private Boolean mobileConfirmed; 
            private Boolean sharedContact; 
            private String uid; 
            private Long updateDate; 
            private String updateUser; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contactEmail = model.contactEmail;
                this.contactId = model.contactId;
                this.contactMobile = model.contactMobile;
                this.contactName = model.contactName;
                this.contactPosition = model.contactPosition;
                this.customerId = model.customerId;
                this.emailConfirmed = model.emailConfirmed;
                this.entityId = model.entityId;
                this.entityType = model.entityType;
                this.hasSubscription = model.hasSubscription;
                this.mobileConfirmed = model.mobileConfirmed;
                this.sharedContact = model.sharedContact;
                this.uid = model.uid;
                this.updateDate = model.updateDate;
                this.updateUser = model.updateUser;
            } 

            /**
             * ContactEmail.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ContactMobile.
             */
            public Builder contactMobile(String contactMobile) {
                this.contactMobile = contactMobile;
                return this;
            }

            /**
             * ContactName.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * ContactPosition.
             */
            public Builder contactPosition(String contactPosition) {
                this.contactPosition = contactPosition;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * EmailConfirmed.
             */
            public Builder emailConfirmed(Boolean emailConfirmed) {
                this.emailConfirmed = emailConfirmed;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>leId/customerId</p>
             * 
             * <strong>example:</strong>
             * <p>customerId</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * HasSubscription.
             */
            public Builder hasSubscription(Boolean hasSubscription) {
                this.hasSubscription = hasSubscription;
                return this;
            }

            /**
             * MobileConfirmed.
             */
            public Builder mobileConfirmed(Boolean mobileConfirmed) {
                this.mobileConfirmed = mobileConfirmed;
                return this;
            }

            /**
             * SharedContact.
             */
            public Builder sharedContact(Boolean sharedContact) {
                this.sharedContact = sharedContact;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UpdateDate.
             */
            public Builder updateDate(Long updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * UpdateUser.
             */
            public Builder updateUser(String updateUser) {
                this.updateUser = updateUser;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
