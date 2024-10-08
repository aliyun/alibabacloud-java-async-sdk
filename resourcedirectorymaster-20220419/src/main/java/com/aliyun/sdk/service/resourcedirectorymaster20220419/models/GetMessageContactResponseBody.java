// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageContactResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageContactResponseBody</p>
 */
public class GetMessageContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Contact")
    private Contact contact;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMessageContactResponseBody(Builder builder) {
        this.contact = builder.contact;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageContactResponseBody create() {
        return builder().build();
    }

    /**
     * @return contact
     */
    public Contact getContact() {
        return this.contact;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Contact contact; 
        private String requestId; 

        /**
         * The information about the contact.
         */
        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageContactResponseBody build() {
            return new GetMessageContactResponseBody(this);
        } 

    } 

    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("EmailAddress")
        private String emailAddress;

        @com.aliyun.core.annotation.NameInMap("Members")
        private java.util.List < String > members;

        @com.aliyun.core.annotation.NameInMap("MessageTypes")
        private java.util.List < String > messageTypes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Contact(Builder builder) {
            this.contactId = builder.contactId;
            this.createDate = builder.createDate;
            this.emailAddress = builder.emailAddress;
            this.members = builder.members;
            this.messageTypes = builder.messageTypes;
            this.name = builder.name;
            this.phoneNumber = builder.phoneNumber;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return emailAddress
         */
        public String getEmailAddress() {
            return this.emailAddress;
        }

        /**
         * @return members
         */
        public java.util.List < String > getMembers() {
            return this.members;
        }

        /**
         * @return messageTypes
         */
        public java.util.List < String > getMessageTypes() {
            return this.messageTypes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String contactId; 
            private String createDate; 
            private String emailAddress; 
            private java.util.List < String > members; 
            private java.util.List < String > messageTypes; 
            private String name; 
            private String phoneNumber; 
            private String status; 
            private String title; 

            /**
             * The ID of the contact.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * The time when the contact was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The email address of the contact.
             */
            public Builder emailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
                return this;
            }

            /**
             * The IDs of objects to which the contact is bound.
             */
            public Builder members(java.util.List < String > members) {
                this.members = members;
                return this;
            }

            /**
             * The types of messages received by the contact.
             */
            public Builder messageTypes(java.util.List < String > messageTypes) {
                this.messageTypes = messageTypes;
                return this;
            }

            /**
             * The name of the contact.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The mobile phone number of the contact.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * The status of the contact. Valid values:
             * <p>
             * 
             * *   Verifying
             * *   Active
             * *   Deleting
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The job title of the contact.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
}
