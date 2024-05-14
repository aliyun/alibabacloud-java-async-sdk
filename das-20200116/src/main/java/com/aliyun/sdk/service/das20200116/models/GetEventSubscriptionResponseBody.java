// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEventSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetEventSubscriptionResponseBody</p>
 */
public class GetEventSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetEventSubscriptionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventSubscriptionResponseBody create() {
        return builder().build();
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetEventSubscriptionResponseBody build() {
            return new GetEventSubscriptionResponseBody(this);
        } 

    } 

    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contacts")
        private String contacts;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private ContactGroups(Builder builder) {
            this.contacts = builder.contacts;
            this.description = builder.description;
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroups create() {
            return builder().build();
        }

        /**
         * @return contacts
         */
        public String getContacts() {
            return this.contacts;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String contacts; 
            private String description; 
            private String name; 
            private String userId; 

            /**
             * The members of the alert contact group.
             */
            public Builder contacts(String contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * The description of the alert contact group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the alert contact group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The user ID.
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
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dingtalkHook")
        private String dingtalkHook;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("groups")
        private java.util.List < String > groups;

        @com.aliyun.core.annotation.NameInMap("isCmsReduplicated")
        private Boolean isCmsReduplicated;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Contacts(Builder builder) {
            this.dingtalkHook = builder.dingtalkHook;
            this.email = builder.email;
            this.groups = builder.groups;
            this.isCmsReduplicated = builder.isCmsReduplicated;
            this.name = builder.name;
            this.phone = builder.phone;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return dingtalkHook
         */
        public String getDingtalkHook() {
            return this.dingtalkHook;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return groups
         */
        public java.util.List < String > getGroups() {
            return this.groups;
        }

        /**
         * @return isCmsReduplicated
         */
        public Boolean getIsCmsReduplicated() {
            return this.isCmsReduplicated;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String dingtalkHook; 
            private String email; 
            private java.util.List < String > groups; 
            private Boolean isCmsReduplicated; 
            private String name; 
            private String phone; 
            private String userId; 

            /**
             * The webhook URL of the DingTalk chatbot.
             */
            public Builder dingtalkHook(String dingtalkHook) {
                this.dingtalkHook = dingtalkHook;
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
             * The contact groups to which the alert contact belongs.
             */
            public Builder groups(java.util.List < String > groups) {
                this.groups = groups;
                return this;
            }

            /**
             * Indicates whether the alert contact name is the same as the contact name on CloudMonitor.
             * <p>
             * 
             * * **true**
             * * **false**
             */
            public Builder isCmsReduplicated(Boolean isCmsReduplicated) {
                this.isCmsReduplicated = isCmsReduplicated;
                return this;
            }

            /**
             * The name of the alert contact.
             */
            public Builder name(String name) {
                this.name = name;
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
             * The user ID.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Integer active;

        @com.aliyun.core.annotation.NameInMap("channelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("contactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("contactGroups")
        private java.util.List < ContactGroups> contactGroups;

        @com.aliyun.core.annotation.NameInMap("contactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("contacts")
        private java.util.List < Contacts> contacts;

        @com.aliyun.core.annotation.NameInMap("eventContext")
        private String eventContext;

        @com.aliyun.core.annotation.NameInMap("eventSendGroup")
        private java.util.List < String > eventSendGroup;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("minInterval")
        private String minInterval;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Data(Builder builder) {
            this.active = builder.active;
            this.channelType = builder.channelType;
            this.contactGroupName = builder.contactGroupName;
            this.contactGroups = builder.contactGroups;
            this.contactName = builder.contactName;
            this.contacts = builder.contacts;
            this.eventContext = builder.eventContext;
            this.eventSendGroup = builder.eventSendGroup;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.lang = builder.lang;
            this.level = builder.level;
            this.minInterval = builder.minInterval;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Integer getActive() {
            return this.active;
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return contactGroupName
         */
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        /**
         * @return contactGroups
         */
        public java.util.List < ContactGroups> getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return contacts
         */
        public java.util.List < Contacts> getContacts() {
            return this.contacts;
        }

        /**
         * @return eventContext
         */
        public String getEventContext() {
            return this.eventContext;
        }

        /**
         * @return eventSendGroup
         */
        public java.util.List < String > getEventSendGroup() {
            return this.eventSendGroup;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return minInterval
         */
        public String getMinInterval() {
            return this.minInterval;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer active; 
            private String channelType; 
            private String contactGroupName; 
            private java.util.List < ContactGroups> contactGroups; 
            private String contactName; 
            private java.util.List < Contacts> contacts; 
            private String eventContext; 
            private java.util.List < String > eventSendGroup; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String instanceId; 
            private String lang; 
            private String level; 
            private String minInterval; 
            private String userId; 

            /**
             * Indicates whether the event subscription feature is enabled. Valid values:
             * <p>
             * 
             * *   **0**: The event subscription feature is disabled.
             * *   **1**: The event subscription feature is enabled.
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * The notification method. Valid values:
             * <p>
             * 
             * *   **hdm_alarm_sms**: text message.
             * *   **dingtalk**: DingTalk chatbot.
             * *   **hdm_alarm_sms_and_email**: text message and email.
             * *   **hdm_alarm_sms,dingtalk**: text message and DingTalk chatbot.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * The name of the contact group that receives alert notifications. Multiple names are separated by commas (,).
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * The alert contact groups.
             */
            public Builder contactGroups(java.util.List < ContactGroups> contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * The name of the subscriber who receives alert notifications. Multiple names are separated by commas (,).
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder contacts(java.util.List < Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * The supported event scenarios. Only **AllContext** may be returned, which indicates that all scenarios are supported.
             */
            public Builder eventContext(String eventContext) {
                this.eventContext = eventContext;
                return this;
            }

            /**
             * The supported event scenarios in which event subscription can be sent.
             */
            public Builder eventSendGroup(java.util.List < String > eventSendGroup) {
                this.eventSendGroup = eventSendGroup;
                return this;
            }

            /**
             * The time when event subscription was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the event subscription settings were most recently modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The primary key ID of the database.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The language of event notifications. Only **zh-CN** may be returned, which indicates that event notifications are sent in Chinese.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * The risk level of the events that trigger notifications. Valid values:
             * <p>
             * 
             * *   **Notice**
             * *   **Optimization**
             * *   **Warn**
             * *   **Critical**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The minimum interval between event notifications. Unit: seconds.
             */
            public Builder minInterval(String minInterval) {
                this.minInterval = minInterval;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
