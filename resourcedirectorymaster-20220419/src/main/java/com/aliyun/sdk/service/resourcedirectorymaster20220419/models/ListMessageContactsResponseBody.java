// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageContactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageContactsResponseBody</p>
 */
public class ListMessageContactsResponseBody extends TeaModel {
    @NameInMap("Contacts")
    private java.util.List < Contacts> contacts;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Contacts.
         */
        public Builder contacts(java.util.List < Contacts> contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("AssociatedDate")
        private String associatedDate;

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
             * AssociatedDate.
             */
            public Builder associatedDate(String associatedDate) {
                this.associatedDate = associatedDate;
                return this;
            }

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

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
}
