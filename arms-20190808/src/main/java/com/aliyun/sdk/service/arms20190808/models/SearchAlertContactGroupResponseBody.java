// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertContactGroupResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAlertContactGroupResponseBody</p>
 */
public class SearchAlertContactGroupResponseBody extends TeaModel {
    @NameInMap("ContactGroups")
    private java.util.List < ContactGroups> contactGroups;

    @NameInMap("RequestId")
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

    /**
     * @return contactGroups
     */
    public java.util.List < ContactGroups> getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ContactGroups> contactGroups; 
        private String requestId; 

        /**
         * The information about the alert contact groups.
         */
        public Builder contactGroups(java.util.List < ContactGroups> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchAlertContactGroupResponseBody build() {
            return new SearchAlertContactGroupResponseBody(this);
        } 

    } 

    public static class Contacts extends TeaModel {
        @NameInMap("ContactId")
        private Long contactId;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DingRobot")
        private String dingRobot;

        @NameInMap("Email")
        private String email;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("SystemNoc")
        private Boolean systemNoc;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
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

            /**
             * The ID of the alert contact.
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * The name of the alert contact.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * The time when the alert contact group list was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The webhook URL of the DingTalk chatbot.
             */
            public Builder dingRobot(String dingRobot) {
                this.dingRobot = dingRobot;
                return this;
            }

            /**
             * The email address of the alert contact.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The mobile number of the alert contact.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * Indicates whether the alert contact receives system notifications. Valid values:
             * <p>
             * 
             * *   true: receives system notifications.
             * *   false: does not receive system notifications.
             */
            public Builder systemNoc(Boolean systemNoc) {
                this.systemNoc = systemNoc;
                return this;
            }

            /**
             * The time when the alert contact group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user.
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
    public static class ContactGroups extends TeaModel {
        @NameInMap("ContactGroupId")
        private Long contactGroupId;

        @NameInMap("ContactGroupName")
        private String contactGroupName;

        @NameInMap("Contacts")
        private java.util.List < Contacts> contacts;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
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
        public java.util.List < Contacts> getContacts() {
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
            private java.util.List < Contacts> contacts; 
            private Long createTime; 
            private Long updateTime; 
            private String userId; 

            /**
             * The ID of the alert contact group.
             */
            public Builder contactGroupId(Long contactGroupId) {
                this.contactGroupId = contactGroupId;
                return this;
            }

            /**
             * The name of the alert contact group.
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * The alert contact list.
             */
            public Builder contacts(java.util.List < Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * The time when the alert contact group list was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the alert contact group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user.
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
