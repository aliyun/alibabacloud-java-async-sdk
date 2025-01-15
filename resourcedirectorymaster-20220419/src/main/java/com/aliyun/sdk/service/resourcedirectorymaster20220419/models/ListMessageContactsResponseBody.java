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
 * {@link ListMessageContactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageContactsResponseBody</p>
 */
public class ListMessageContactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Contacts")
    private java.util.List<Contacts> contacts;

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
    public java.util.List<Contacts> getContacts() {
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
        private java.util.List<Contacts> contacts; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The time when the contact was bound to the objects.</p>
         */
        public Builder contacts(java.util.List<Contacts> contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95060F1D-6990-4645-8920-A81D1BBFE992</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMessageContactsResponseBody build() {
            return new ListMessageContactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessageContactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageContactsResponseBody</p>
     */
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
            private String associatedDate; 
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
             * <p>The time when the contact was bound to the objects.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-27 17:19:21</p>
             */
            public Builder associatedDate(String associatedDate) {
                this.associatedDate = associatedDate;
                return this;
            }

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
             * <p>The time when the contact was added.</p>
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

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
}
