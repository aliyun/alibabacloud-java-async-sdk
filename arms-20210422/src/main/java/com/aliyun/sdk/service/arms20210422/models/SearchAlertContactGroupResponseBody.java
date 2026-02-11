// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link SearchAlertContactGroupResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAlertContactGroupResponseBody</p>
 */
public class SearchAlertContactGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    private java.util.List<ContactGroups> contactGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SearchAlertContactGroupResponseBody(Builder builder) {
        this.contactGroups = builder.contactGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertContactGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroups
     */
    public java.util.List<ContactGroups> getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ContactGroups> contactGroups; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SearchAlertContactGroupResponseBody model) {
            this.contactGroups = model.contactGroups;
            this.requestId = model.requestId;
        } 

        /**
         * ContactGroups.
         */
        public Builder contactGroups(java.util.List<ContactGroups> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchAlertContactGroupResponseBody build() {
            return new SearchAlertContactGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchAlertContactGroupResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertContactGroupResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DingRobot")
        private String dingRobot;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("SystemNoc")
        private Boolean systemNoc;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Contacts(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.createTime = builder.createTime;
            this.dingRobot = builder.dingRobot;
            this.email = builder.email;
            this.phone = builder.phone;
            this.systemNoc = builder.systemNoc;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
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
        public Long getContactId() {
            return this.contactId;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dingRobot
         */
        public String getDingRobot() {
            return this.dingRobot;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return systemNoc
         */
        public Boolean getSystemNoc() {
            return this.systemNoc;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long contactId; 
            private String contactName; 
            private Long createTime; 
            private String dingRobot; 
            private String email; 
            private String phone; 
            private Boolean systemNoc; 
            private Long updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Contacts model) {
                this.contactId = model.contactId;
                this.contactName = model.contactName;
                this.createTime = model.createTime;
                this.dingRobot = model.dingRobot;
                this.email = model.email;
                this.phone = model.phone;
                this.systemNoc = model.systemNoc;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * ContactId.
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DingRobot.
             */
            public Builder dingRobot(String dingRobot) {
                this.dingRobot = dingRobot;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * SystemNoc.
             */
            public Builder systemNoc(Boolean systemNoc) {
                this.systemNoc = systemNoc;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAlertContactGroupResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertContactGroupResponseBody</p>
     */
    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupId")
        private Long contactGroupId;

        @com.aliyun.core.annotation.NameInMap("ContactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("Contacts")
        private java.util.List<Contacts> contacts;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ContactGroups(Builder builder) {
            this.contactGroupId = builder.contactGroupId;
            this.contactGroupName = builder.contactGroupName;
            this.contacts = builder.contacts;
            this.createTime = builder.createTime;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroups create() {
            return builder().build();
        }

        /**
         * @return contactGroupId
         */
        public Long getContactGroupId() {
            return this.contactGroupId;
        }

        /**
         * @return contactGroupName
         */
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        /**
         * @return contacts
         */
        public java.util.List<Contacts> getContacts() {
            return this.contacts;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long contactGroupId; 
            private String contactGroupName; 
            private java.util.List<Contacts> contacts; 
            private Long createTime; 
            private Long updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ContactGroups model) {
                this.contactGroupId = model.contactGroupId;
                this.contactGroupName = model.contactGroupName;
                this.contacts = model.contacts;
                this.createTime = model.createTime;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * ContactGroupId.
             */
            public Builder contactGroupId(Long contactGroupId) {
                this.contactGroupId = contactGroupId;
                return this;
            }

            /**
             * ContactGroupName.
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * Contacts.
             */
            public Builder contacts(java.util.List<Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ContactGroups build() {
                return new ContactGroups(this);
            } 

        } 

    }
}
