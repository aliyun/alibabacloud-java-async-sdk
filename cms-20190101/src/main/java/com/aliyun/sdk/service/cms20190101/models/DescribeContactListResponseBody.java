// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactListResponseBody</p>
 */
public class DescribeContactListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Contacts")
    private Contacts contacts;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private DescribeContactListResponseBody(Builder builder) {
        this.code = builder.code;
        this.contacts = builder.contacts;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contacts
     */
    public Contacts getContacts() {
        return this.contacts;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Contacts contacts; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The alert contacts.
         */
        public Builder contacts(Contacts contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeContactListResponseBody build() {
            return new DescribeContactListResponseBody(this);
        } 

    } 

    public static class Channels extends TeaModel {
        @NameInMap("AliIM")
        private String aliIM;

        @NameInMap("DingWebHook")
        private String dingWebHook;

        @NameInMap("Mail")
        private String mail;

        @NameInMap("SMS")
        private String SMS;

        private Channels(Builder builder) {
            this.aliIM = builder.aliIM;
            this.dingWebHook = builder.dingWebHook;
            this.mail = builder.mail;
            this.SMS = builder.SMS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return aliIM
         */
        public String getAliIM() {
            return this.aliIM;
        }

        /**
         * @return dingWebHook
         */
        public String getDingWebHook() {
            return this.dingWebHook;
        }

        /**
         * @return mail
         */
        public String getMail() {
            return this.mail;
        }

        /**
         * @return SMS
         */
        public String getSMS() {
            return this.SMS;
        }

        public static final class Builder {
            private String aliIM; 
            private String dingWebHook; 
            private String mail; 
            private String SMS; 

            /**
             * The TradeManager ID of the alert contact.
             */
            public Builder aliIM(String aliIM) {
                this.aliIM = aliIM;
                return this;
            }

            /**
             * The webhook URL of the DingTalk chatbot.
             */
            public Builder dingWebHook(String dingWebHook) {
                this.dingWebHook = dingWebHook;
                return this;
            }

            /**
             * The email address of the alert contact.
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * The phone number of the alert contact.
             */
            public Builder SMS(String SMS) {
                this.SMS = SMS;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    public static class ChannelsState extends TeaModel {
        @NameInMap("AliIM")
        private String aliIM;

        @NameInMap("DingWebHook")
        private String dingWebHook;

        @NameInMap("Mail")
        private String mail;

        @NameInMap("SMS")
        private String SMS;

        private ChannelsState(Builder builder) {
            this.aliIM = builder.aliIM;
            this.dingWebHook = builder.dingWebHook;
            this.mail = builder.mail;
            this.SMS = builder.SMS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelsState create() {
            return builder().build();
        }

        /**
         * @return aliIM
         */
        public String getAliIM() {
            return this.aliIM;
        }

        /**
         * @return dingWebHook
         */
        public String getDingWebHook() {
            return this.dingWebHook;
        }

        /**
         * @return mail
         */
        public String getMail() {
            return this.mail;
        }

        /**
         * @return SMS
         */
        public String getSMS() {
            return this.SMS;
        }

        public static final class Builder {
            private String aliIM; 
            private String dingWebHook; 
            private String mail; 
            private String SMS; 

            /**
             * The status of the TradeManager ID.
             * <p>
             * 
             * Valid value: OK. The value OK indicates that the TradeManager ID is valid and can receive alert notifications.
             * 
             * >  This parameter can be returned only on the China site (aliyun.com).
             */
            public Builder aliIM(String aliIM) {
                this.aliIM = aliIM;
                return this;
            }

            /**
             * The status of the DingTalk chatbot.
             * <p>
             * 
             * Valid value: OK. The value OK indicates that the DingTalk chatbot is normal and alert notifications can be received in a DingTalk group.
             */
            public Builder dingWebHook(String dingWebHook) {
                this.dingWebHook = dingWebHook;
                return this;
            }

            /**
             * The status of the email address. Valid values:
             * <p>
             * 
             * *   PENDING: The email address is not activated. Alert notifications can be sent to the email address only after the email address is activated.
             * *   OK: The email address is activated and can receive alert notifications.
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * The status of the phone number. Valid values:
             * <p>
             * 
             * *   PENDING: The phone number is not activated. Alert notifications can be sent to the phone number by using text messages only after the phone number is activated.
             * *   OK: The phone number is activated and can receive alert notifications.
             * 
             * >  This parameter can be returned only on the China site (aliyun.com).
             */
            public Builder SMS(String SMS) {
                this.SMS = SMS;
                return this;
            }

            public ChannelsState build() {
                return new ChannelsState(this);
            } 

        } 

    }
    public static class ContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        private java.util.List < String > contactGroup;

        private ContactGroups(Builder builder) {
            this.contactGroup = builder.contactGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroups create() {
            return builder().build();
        }

        /**
         * @return contactGroup
         */
        public java.util.List < String > getContactGroup() {
            return this.contactGroup;
        }

        public static final class Builder {
            private java.util.List < String > contactGroup; 

            /**
             * ContactGroup.
             */
            public Builder contactGroup(java.util.List < String > contactGroup) {
                this.contactGroup = contactGroup;
                return this;
            }

            public ContactGroups build() {
                return new ContactGroups(this);
            } 

        } 

    }
    public static class Contact extends TeaModel {
        @NameInMap("Channels")
        private Channels channels;

        @NameInMap("ChannelsState")
        private ChannelsState channelsState;

        @NameInMap("ContactGroups")
        private ContactGroups contactGroups;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("Lang")
        private String lang;

        @NameInMap("Name")
        private String name;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Contact(Builder builder) {
            this.channels = builder.channels;
            this.channelsState = builder.channelsState;
            this.contactGroups = builder.contactGroups;
            this.createTime = builder.createTime;
            this.desc = builder.desc;
            this.lang = builder.lang;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public Channels getChannels() {
            return this.channels;
        }

        /**
         * @return channelsState
         */
        public ChannelsState getChannelsState() {
            return this.channelsState;
        }

        /**
         * @return contactGroups
         */
        public ContactGroups getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
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
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Channels channels; 
            private ChannelsState channelsState; 
            private ContactGroups contactGroups; 
            private Long createTime; 
            private String desc; 
            private String lang; 
            private String name; 
            private Long updateTime; 

            /**
             * The alert notification method.
             */
            public Builder channels(Channels channels) {
                this.channels = channels;
                return this;
            }

            /**
             * The status of the alert notification method. Valid values: PENDING and OK.
             * <p>
             * 
             * The email address must be activated after it is added as the value specified for the alert notification method. The value PENDING indicates that the email address is not activated. The value OK indicates that the email address is activated.
             */
            public Builder channelsState(ChannelsState channelsState) {
                this.channelsState = channelsState;
                return this;
            }

            /**
             * The alert contact groups.
             */
            public Builder contactGroups(ContactGroups contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * The timestamp when the alert contact was created.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the alert contact.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The language in which the alert information is displayed. Valid values:
             * <p>
             * 
             * *   zh-cn: simplified Chinese
             * *   en: English
             */
            public Builder lang(String lang) {
                this.lang = lang;
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
             * The timestamp when the alert contact was updated.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    public static class Contacts extends TeaModel {
        @NameInMap("Contact")
        private java.util.List < Contact> contact;

        private Contacts(Builder builder) {
            this.contact = builder.contact;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return contact
         */
        public java.util.List < Contact> getContact() {
            return this.contact;
        }

        public static final class Builder {
            private java.util.List < Contact> contact; 

            /**
             * Contact.
             */
            public Builder contact(java.util.List < Contact> contact) {
                this.contact = contact;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
}
