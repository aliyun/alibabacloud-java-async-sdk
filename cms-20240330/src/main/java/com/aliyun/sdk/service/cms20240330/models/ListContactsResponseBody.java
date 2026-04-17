// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListContactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContactsResponseBody</p>
 */
public class ListContactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contacts")
    private java.util.List<Contacts> contacts;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListContactsResponseBody(Builder builder) {
        this.contacts = builder.contacts;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContactsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Contacts> contacts; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListContactsResponseBody model) {
            this.contacts = model.contacts;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * contacts.
         */
        public Builder contacts(java.util.List<Contacts> contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListContactsResponseBody build() {
            return new ListContactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactsResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("emailVerify")
        private Boolean emailVerify;

        @com.aliyun.core.annotation.NameInMap("groupList")
        private java.util.List<String> groupList;

        @com.aliyun.core.annotation.NameInMap("imUserIds")
        private java.util.Map<String, String> imUserIds;

        @com.aliyun.core.annotation.NameInMap("lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("phoneVerify")
        private Boolean phoneVerify;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Contacts(Builder builder) {
            this.contactId = builder.contactId;
            this.email = builder.email;
            this.emailVerify = builder.emailVerify;
            this.groupList = builder.groupList;
            this.imUserIds = builder.imUserIds;
            this.lang = builder.lang;
            this.name = builder.name;
            this.phone = builder.phone;
            this.phoneVerify = builder.phoneVerify;
            this.updateTime = builder.updateTime;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return emailVerify
         */
        public Boolean getEmailVerify() {
            return this.emailVerify;
        }

        /**
         * @return groupList
         */
        public java.util.List<String> getGroupList() {
            return this.groupList;
        }

        /**
         * @return imUserIds
         */
        public java.util.Map<String, String> getImUserIds() {
            return this.imUserIds;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return phoneVerify
         */
        public Boolean getPhoneVerify() {
            return this.phoneVerify;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String contactId; 
            private String email; 
            private Boolean emailVerify; 
            private java.util.List<String> groupList; 
            private java.util.Map<String, String> imUserIds; 
            private String lang; 
            private String name; 
            private String phone; 
            private Boolean phoneVerify; 
            private String updateTime; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Contacts model) {
                this.contactId = model.contactId;
                this.email = model.email;
                this.emailVerify = model.emailVerify;
                this.groupList = model.groupList;
                this.imUserIds = model.imUserIds;
                this.lang = model.lang;
                this.name = model.name;
                this.phone = model.phone;
                this.phoneVerify = model.phoneVerify;
                this.updateTime = model.updateTime;
                this.workspace = model.workspace;
            } 

            /**
             * contactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * emailVerify.
             */
            public Builder emailVerify(Boolean emailVerify) {
                this.emailVerify = emailVerify;
                return this;
            }

            /**
             * groupList.
             */
            public Builder groupList(java.util.List<String> groupList) {
                this.groupList = groupList;
                return this;
            }

            /**
             * imUserIds.
             */
            public Builder imUserIds(java.util.Map<String, String> imUserIds) {
                this.imUserIds = imUserIds;
                return this;
            }

            /**
             * lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * phoneVerify.
             */
            public Builder phoneVerify(Boolean phoneVerify) {
                this.phoneVerify = phoneVerify;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
}
