// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContactListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactListResponseBody</p>
 */
public class DescribeContactListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Contacts")
    private Contacts contacts;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The alert contacts.</p>
         */
        public Builder contacts(Contacts contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06D5ECC2-B9BE-42A4-8FA3-1A610FB08B83</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeContactListResponseBody build() {
            return new DescribeContactListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContactListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactListResponseBody</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliIM")
        private String aliIM;

        @com.aliyun.core.annotation.NameInMap("DingWebHook")
        private String dingWebHook;

        @com.aliyun.core.annotation.NameInMap("Mail")
        private String mail;

        @com.aliyun.core.annotation.NameInMap("SMS")
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
             * <p>The TradeManager ID of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder aliIM(String aliIM) {
                this.aliIM = aliIM;
                return this;
            }

            /**
             * <p>The webhook URL of the DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=9bf44f8189597d07dfdd7a123455ffc112">https://oapi.dingtalk.com/robot/send?access_token=9bf44f8189597d07dfdd7a123455ffc112</a>****</p>
             */
            public Builder dingWebHook(String dingWebHook) {
                this.dingWebHook = dingWebHook;
                return this;
            }

            /**
             * <p>The email address of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * <p>The phone number of the alert contac.</p>
             * 
             * <strong>example:</strong>
             * <p>1333333****</p>
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
    /**
     * 
     * {@link DescribeContactListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactListResponseBody</p>
     */
    public static class ChannelsState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliIM")
        private String aliIM;

        @com.aliyun.core.annotation.NameInMap("DingWebHook")
        private String dingWebHook;

        @com.aliyun.core.annotation.NameInMap("Mail")
        private String mail;

        @com.aliyun.core.annotation.NameInMap("SMS")
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
             * <p>The status of the TradeManager ID.</p>
             * <p>Valid value: OK. The value OK indicates that the TradeManager ID is valid and can receive alert notifications.</p>
             * <blockquote>
             * <p> This parameter applies only to the Alibaba Cloud China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder aliIM(String aliIM) {
                this.aliIM = aliIM;
                return this;
            }

            /**
             * <p>The status of the DingTalk chatbot.</p>
             * <p>Valid value: OK. The value OK indicates that the DingTalk chatbot is normal and alert notifications can be received in a DingTalk group.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder dingWebHook(String dingWebHook) {
                this.dingWebHook = dingWebHook;
                return this;
            }

            /**
             * <p>The status of the email address. Valid values:</p>
             * <ul>
             * <li>PENDING: The phone number is not activated. Alert notifications can be sent to the phone number by using text messages only after the phone number is activated.</li>
             * <li>OK: The phone number is activated and can receive alert notifications.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * <p>The status of the phone number. Valid values:</p>
             * <ul>
             * <li>PENDING: The phone number is not activated. Alert notifications can be sent to the phone number by using text messages only after the phone number is activated.</li>
             * <li>OK: The phone number is activated and can receive alert notifications.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter applies only to the Alibaba Cloud China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
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
    /**
     * 
     * {@link DescribeContactListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactListResponseBody</p>
     */
    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroup")
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
    /**
     * 
     * {@link DescribeContactListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactListResponseBody</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private Channels channels;

        @com.aliyun.core.annotation.NameInMap("ChannelsState")
        private ChannelsState channelsState;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private ContactGroups contactGroups;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The alert notification method.</p>
             */
            public Builder channels(Channels channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The status of the alert notification method. Valid values: PENDING and OK.</p>
             * <p>The email address must be activated after it is added as the value specified for the alert notification method. The value PENDING indicates that the email address is not activated. The value OK indicates that the email address is activated.</p>
             */
            public Builder channelsState(ChannelsState channelsState) {
                this.channelsState = channelsState;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder contactGroups(ContactGroups contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * <p>The timestamp when the alert contact was created.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1552356159000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The language in which the alert information is displayed. Valid values:</p>
             * <ul>
             * <li>zh-cn: simplified Chinese</li>
             * <li>en: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh-cn</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The name of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The timestamp when the alert contact was updated.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1552356159000</p>
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
    /**
     * 
     * {@link DescribeContactListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactListResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contact")
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
