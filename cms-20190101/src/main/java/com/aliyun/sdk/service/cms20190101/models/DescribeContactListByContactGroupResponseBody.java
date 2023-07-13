// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactListByContactGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactListByContactGroupResponseBody</p>
 */
public class DescribeContactListByContactGroupResponseBody extends TeaModel {
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

    private DescribeContactListByContactGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.contacts = builder.contacts;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactListByContactGroupResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Contacts contacts; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error message.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The time when the alert contact was modified.
         */
        public Builder contacts(Contacts contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The alert group.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeContactListByContactGroupResponseBody build() {
            return new DescribeContactListByContactGroupResponseBody(this);
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
             * The webhook URL of the DingTalk chatbot.
             */
            public Builder aliIM(String aliIM) {
                this.aliIM = aliIM;
                return this;
            }

            /**
             * The phone number of the alert contact.
             * <p>
             * 
             * >  This parameter can be returned only on the China site (aliyun.com).
             */
            public Builder dingWebHook(String dingWebHook) {
                this.dingWebHook = dingWebHook;
                return this;
            }

            /**
             * The TradeManager ID of the alert contact.
             * <p>
             * 
             * >  This parameter can be returned only on the China site (aliyun.com).
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * Queries the alert contacts in an alert group.
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
    public static class Contact extends TeaModel {
        @NameInMap("Channels")
        private Channels channels;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("Name")
        private String name;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Contact(Builder builder) {
            this.channels = builder.channels;
            this.createTime = builder.createTime;
            this.desc = builder.desc;
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
            private Long createTime; 
            private String desc; 
            private String name; 
            private Long updateTime; 

            /**
             * The email address of the alert contact.
             */
            public Builder channels(Channels channels) {
                this.channels = channels;
                return this;
            }

            /**
             * The description of the alert contact.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The alert notification targets.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The time when the alert contact was created.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the alert contact.
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
