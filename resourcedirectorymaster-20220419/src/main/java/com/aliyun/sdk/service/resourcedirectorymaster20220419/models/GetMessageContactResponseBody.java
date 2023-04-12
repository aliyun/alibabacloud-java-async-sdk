// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageContactResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageContactResponseBody</p>
 */
public class GetMessageContactResponseBody extends TeaModel {
    @NameInMap("Contact")
    private Contact contact;

    @NameInMap("RequestId")
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
         * Contact.
         */
        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("EmailAddress")
        private String emailAddress;

        @NameInMap("Members")
        private java.util.List < String > members;

        @NameInMap("MessageTypes")
        private java.util.List < String > messageTypes;

        @NameInMap("Name")
        private String name;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
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
             * ContactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * EmailAddress.
             */
            public Builder emailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
                return this;
            }

            /**
             * Members.
             */
            public Builder members(java.util.List < String > members) {
                this.members = members;
                return this;
            }

            /**
             * MessageTypes.
             */
            public Builder messageTypes(java.util.List < String > messageTypes) {
                this.messageTypes = messageTypes;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
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
