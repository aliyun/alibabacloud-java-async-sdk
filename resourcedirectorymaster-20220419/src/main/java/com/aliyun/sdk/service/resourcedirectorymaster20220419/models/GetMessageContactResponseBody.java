// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
         * <p>The information about the contact.</p>
         */
        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageContactResponseBody build() {
            return new GetMessageContactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageContactResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageContactResponseBody</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("EmailAddress")
        private String emailAddress;

        @com.aliyun.core.annotation.NameInMap("Members")
        private java.util.List<String> members;

        @com.aliyun.core.annotation.NameInMap("MessageTypes")
        private java.util.List<String> messageTypes;

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
        public java.util.List<String> getMembers() {
            return this.members;
        }

        /**
         * @return messageTypes
         */
        public java.util.List<String> getMessageTypes() {
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
            private java.util.List<String> members; 
            private java.util.List<String> messageTypes; 
            private String name; 
            private String phoneNumber; 
            private String status; 
            private String title; 

            /**
             * <p>The ID of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>c-qL4HqKONzOM7****</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The time when the contact was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-27 17:19:21</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The email address of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>someone***@example.com</p>
             */
            public Builder emailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
                return this;
            }

            /**
             * <p>The IDs of objects to which the contact is bound.</p>
             */
            public Builder members(java.util.List<String> members) {
                this.members = members;
                return this;
            }

            /**
             * <p>The types of messages received by the contact.</p>
             */
            public Builder messageTypes(java.util.List<String> messageTypes) {
                this.messageTypes = messageTypes;
                return this;
            }

            /**
             * <p>The name of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>tom</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The mobile phone number of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>86-139****1234</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The status of the contact. Valid values:</p>
             * <ul>
             * <li>Verifying</li>
             * <li>Active</li>
             * <li>Deleting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The job title of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>TechnicalDirector</p>
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
