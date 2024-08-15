// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageContactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageContactsResponseBody</p>
 */
public class ListMessageContactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Contacts")
    private java.util.List < Contacts> contacts;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListMessageContactsResponseBody(Builder builder) {
        this.contacts = builder.contacts;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageContactsResponseBody create() {
        return builder().build();
    }

    /**
     * @return contacts
     */
    public java.util.List < Contacts> getContacts() {
        return this.contacts;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Contacts> contacts; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The time when the contact was bound to the objects.
         */
        public Builder contacts(java.util.List < Contacts> contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMessageContactsResponseBody build() {
            return new ListMessageContactsResponseBody(this);
        } 

    } 

    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedDate")
        private String associatedDate;

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

        private Contacts(Builder builder) {
            this.associatedDate = builder.associatedDate;
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

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return associatedDate
         */
        public String getAssociatedDate() {
            return this.associatedDate;
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
            private String associatedDate; 
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
             * The time when the contact was bound to the objects.
             */
            public Builder associatedDate(String associatedDate) {
                this.associatedDate = associatedDate;
                return this;
            }

            /**
             * The ID of the contact.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * The time when the contact was added.
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
             * - Verifying
             * - Active
             * - Deleting
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

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
}
