// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225.models;

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
 * {@link ReadUserSubscriptionListResponseBody} extends {@link TeaModel}
 *
 * <p>ReadUserSubscriptionListResponseBody</p>
 */
public class ReadUserSubscriptionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadUserSubscriptionListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadUserSubscriptionListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadUserSubscriptionListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReadUserSubscriptionListResponseBody build() {
            return new ReadUserSubscriptionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadUserSubscriptionListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadUserSubscriptionListResponseBody</p>
     */
    public static class ChannelConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("CheckedState")
        private String checkedState;

        @com.aliyun.core.annotation.NameInMap("DefaultChecked")
        private String defaultChecked;

        @com.aliyun.core.annotation.NameInMap("FatigueDayLimit")
        private Integer fatigueDayLimit;

        @com.aliyun.core.annotation.NameInMap("Optional")
        private String optional;

        private ChannelConfigs(Builder builder) {
            this.channelType = builder.channelType;
            this.checkedState = builder.checkedState;
            this.defaultChecked = builder.defaultChecked;
            this.fatigueDayLimit = builder.fatigueDayLimit;
            this.optional = builder.optional;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelConfigs create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return checkedState
         */
        public String getCheckedState() {
            return this.checkedState;
        }

        /**
         * @return defaultChecked
         */
        public String getDefaultChecked() {
            return this.defaultChecked;
        }

        /**
         * @return fatigueDayLimit
         */
        public Integer getFatigueDayLimit() {
            return this.fatigueDayLimit;
        }

        /**
         * @return optional
         */
        public String getOptional() {
            return this.optional;
        }

        public static final class Builder {
            private String channelType; 
            private String checkedState; 
            private String defaultChecked; 
            private Integer fatigueDayLimit; 
            private String optional; 

            private Builder() {
            } 

            private Builder(ChannelConfigs model) {
                this.channelType = model.channelType;
                this.checkedState = model.checkedState;
                this.defaultChecked = model.defaultChecked;
                this.fatigueDayLimit = model.fatigueDayLimit;
                this.optional = model.optional;
            } 

            /**
             * ChannelType.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * CheckedState.
             */
            public Builder checkedState(String checkedState) {
                this.checkedState = checkedState;
                return this;
            }

            /**
             * DefaultChecked.
             */
            public Builder defaultChecked(String defaultChecked) {
                this.defaultChecked = defaultChecked;
                return this;
            }

            /**
             * FatigueDayLimit.
             */
            public Builder fatigueDayLimit(Integer fatigueDayLimit) {
                this.fatigueDayLimit = fatigueDayLimit;
                return this;
            }

            /**
             * Optional.
             */
            public Builder optional(String optional) {
                this.optional = optional;
                return this;
            }

            public ChannelConfigs build() {
                return new ChannelConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadUserSubscriptionListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadUserSubscriptionListResponseBody</p>
     */
    public static class MessageSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeywordBlacklist")
        private java.util.List<String> keywordBlacklist;

        @com.aliyun.core.annotation.NameInMap("KeywordWhitelist")
        private java.util.List<String> keywordWhitelist;

        private MessageSource(Builder builder) {
            this.keywordBlacklist = builder.keywordBlacklist;
            this.keywordWhitelist = builder.keywordWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageSource create() {
            return builder().build();
        }

        /**
         * @return keywordBlacklist
         */
        public java.util.List<String> getKeywordBlacklist() {
            return this.keywordBlacklist;
        }

        /**
         * @return keywordWhitelist
         */
        public java.util.List<String> getKeywordWhitelist() {
            return this.keywordWhitelist;
        }

        public static final class Builder {
            private java.util.List<String> keywordBlacklist; 
            private java.util.List<String> keywordWhitelist; 

            private Builder() {
            } 

            private Builder(MessageSource model) {
                this.keywordBlacklist = model.keywordBlacklist;
                this.keywordWhitelist = model.keywordWhitelist;
            } 

            /**
             * KeywordBlacklist.
             */
            public Builder keywordBlacklist(java.util.List<String> keywordBlacklist) {
                this.keywordBlacklist = keywordBlacklist;
                return this;
            }

            /**
             * KeywordWhitelist.
             */
            public Builder keywordWhitelist(java.util.List<String> keywordWhitelist) {
                this.keywordWhitelist = keywordWhitelist;
                return this;
            }

            public MessageSource build() {
                return new MessageSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadUserSubscriptionListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadUserSubscriptionListResponseBody</p>
     */
    public static class CommonContacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ContactEmail")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactMobile")
        private String contactMobile;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("EmailConfirmed")
        private Boolean emailConfirmed;

        @com.aliyun.core.annotation.NameInMap("MessageSource")
        private MessageSource messageSource;

        @com.aliyun.core.annotation.NameInMap("MobileConfirmed")
        private Boolean mobileConfirmed;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        private CommonContacts(Builder builder) {
            this.aliUid = builder.aliUid;
            this.contactEmail = builder.contactEmail;
            this.contactId = builder.contactId;
            this.contactMobile = builder.contactMobile;
            this.contactName = builder.contactName;
            this.emailConfirmed = builder.emailConfirmed;
            this.messageSource = builder.messageSource;
            this.mobileConfirmed = builder.mobileConfirmed;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonContacts create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
        }

        /**
         * @return contactId
         */
        public Long getContactId() {
            return this.contactId;
        }

        /**
         * @return contactMobile
         */
        public String getContactMobile() {
            return this.contactMobile;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return emailConfirmed
         */
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        /**
         * @return messageSource
         */
        public MessageSource getMessageSource() {
            return this.messageSource;
        }

        /**
         * @return mobileConfirmed
         */
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        public static final class Builder {
            private Long aliUid; 
            private String contactEmail; 
            private Long contactId; 
            private String contactMobile; 
            private String contactName; 
            private Boolean emailConfirmed; 
            private MessageSource messageSource; 
            private Boolean mobileConfirmed; 
            private String position; 

            private Builder() {
            } 

            private Builder(CommonContacts model) {
                this.aliUid = model.aliUid;
                this.contactEmail = model.contactEmail;
                this.contactId = model.contactId;
                this.contactMobile = model.contactMobile;
                this.contactName = model.contactName;
                this.emailConfirmed = model.emailConfirmed;
                this.messageSource = model.messageSource;
                this.mobileConfirmed = model.mobileConfirmed;
                this.position = model.position;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * ContactEmail.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ContactMobile.
             */
            public Builder contactMobile(String contactMobile) {
                this.contactMobile = contactMobile;
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
             * EmailConfirmed.
             */
            public Builder emailConfirmed(Boolean emailConfirmed) {
                this.emailConfirmed = emailConfirmed;
                return this;
            }

            /**
             * MessageSource.
             */
            public Builder messageSource(MessageSource messageSource) {
                this.messageSource = messageSource;
                return this;
            }

            /**
             * MobileConfirmed.
             */
            public Builder mobileConfirmed(Boolean mobileConfirmed) {
                this.mobileConfirmed = mobileConfirmed;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            public CommonContacts build() {
                return new CommonContacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadUserSubscriptionListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadUserSubscriptionListResponseBody</p>
     */
    public static class WebhookContactsMessageSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeywordBlacklist")
        private java.util.List<String> keywordBlacklist;

        @com.aliyun.core.annotation.NameInMap("KeywordWhitelist")
        private java.util.List<String> keywordWhitelist;

        private WebhookContactsMessageSource(Builder builder) {
            this.keywordBlacklist = builder.keywordBlacklist;
            this.keywordWhitelist = builder.keywordWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookContactsMessageSource create() {
            return builder().build();
        }

        /**
         * @return keywordBlacklist
         */
        public java.util.List<String> getKeywordBlacklist() {
            return this.keywordBlacklist;
        }

        /**
         * @return keywordWhitelist
         */
        public java.util.List<String> getKeywordWhitelist() {
            return this.keywordWhitelist;
        }

        public static final class Builder {
            private java.util.List<String> keywordBlacklist; 
            private java.util.List<String> keywordWhitelist; 

            private Builder() {
            } 

            private Builder(WebhookContactsMessageSource model) {
                this.keywordBlacklist = model.keywordBlacklist;
                this.keywordWhitelist = model.keywordWhitelist;
            } 

            /**
             * KeywordBlacklist.
             */
            public Builder keywordBlacklist(java.util.List<String> keywordBlacklist) {
                this.keywordBlacklist = keywordBlacklist;
                return this;
            }

            /**
             * KeywordWhitelist.
             */
            public Builder keywordWhitelist(java.util.List<String> keywordWhitelist) {
                this.keywordWhitelist = keywordWhitelist;
                return this;
            }

            public WebhookContactsMessageSource build() {
                return new WebhookContactsMessageSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadUserSubscriptionListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadUserSubscriptionListResponseBody</p>
     */
    public static class WebhookContacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("MessageSource")
        private WebhookContactsMessageSource messageSource;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("ServerUrl")
        private String serverUrl;

        @com.aliyun.core.annotation.NameInMap("WebhookType")
        private String webhookType;

        private WebhookContacts(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.messageSource = builder.messageSource;
            this.securityToken = builder.securityToken;
            this.serverUrl = builder.serverUrl;
            this.webhookType = builder.webhookType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookContacts create() {
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
         * @return messageSource
         */
        public WebhookContactsMessageSource getMessageSource() {
            return this.messageSource;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return serverUrl
         */
        public String getServerUrl() {
            return this.serverUrl;
        }

        /**
         * @return webhookType
         */
        public String getWebhookType() {
            return this.webhookType;
        }

        public static final class Builder {
            private Long contactId; 
            private String contactName; 
            private WebhookContactsMessageSource messageSource; 
            private String securityToken; 
            private String serverUrl; 
            private String webhookType; 

            private Builder() {
            } 

            private Builder(WebhookContacts model) {
                this.contactId = model.contactId;
                this.contactName = model.contactName;
                this.messageSource = model.messageSource;
                this.securityToken = model.securityToken;
                this.serverUrl = model.serverUrl;
                this.webhookType = model.webhookType;
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
             * MessageSource.
             */
            public Builder messageSource(WebhookContactsMessageSource messageSource) {
                this.messageSource = messageSource;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * ServerUrl.
             */
            public Builder serverUrl(String serverUrl) {
                this.serverUrl = serverUrl;
                return this;
            }

            /**
             * WebhookType.
             */
            public Builder webhookType(String webhookType) {
                this.webhookType = webhookType;
                return this;
            }

            public WebhookContacts build() {
                return new WebhookContacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadUserSubscriptionListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadUserSubscriptionListResponseBody</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonContacts")
        private java.util.List<CommonContacts> commonContacts;

        @com.aliyun.core.annotation.NameInMap("WebhookContacts")
        private java.util.List<WebhookContacts> webhookContacts;

        private Contact(Builder builder) {
            this.commonContacts = builder.commonContacts;
            this.webhookContacts = builder.webhookContacts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return commonContacts
         */
        public java.util.List<CommonContacts> getCommonContacts() {
            return this.commonContacts;
        }

        /**
         * @return webhookContacts
         */
        public java.util.List<WebhookContacts> getWebhookContacts() {
            return this.webhookContacts;
        }

        public static final class Builder {
            private java.util.List<CommonContacts> commonContacts; 
            private java.util.List<WebhookContacts> webhookContacts; 

            private Builder() {
            } 

            private Builder(Contact model) {
                this.commonContacts = model.commonContacts;
                this.webhookContacts = model.webhookContacts;
            } 

            /**
             * CommonContacts.
             */
            public Builder commonContacts(java.util.List<CommonContacts> commonContacts) {
                this.commonContacts = commonContacts;
                return this;
            }

            /**
             * WebhookContacts.
             */
            public Builder webhookContacts(java.util.List<WebhookContacts> webhookContacts) {
                this.webhookContacts = webhookContacts;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadUserSubscriptionListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadUserSubscriptionListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CategoryCode")
        private String categoryCode;

        @com.aliyun.core.annotation.NameInMap("CategoryDesc")
        private String categoryDesc;

        @com.aliyun.core.annotation.NameInMap("CategoryGroupCode")
        private String categoryGroupCode;

        @com.aliyun.core.annotation.NameInMap("CategoryGroupName")
        private String categoryGroupName;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("ChannelConfigs")
        private java.util.List<ChannelConfigs> channelConfigs;

        @com.aliyun.core.annotation.NameInMap("Contact")
        private Contact contact;

        @com.aliyun.core.annotation.NameInMap("ReceiveTimeList")
        private java.util.List<Integer> receiveTimeList;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.categoryCode = builder.categoryCode;
            this.categoryDesc = builder.categoryDesc;
            this.categoryGroupCode = builder.categoryGroupCode;
            this.categoryGroupName = builder.categoryGroupName;
            this.categoryName = builder.categoryName;
            this.channelConfigs = builder.channelConfigs;
            this.contact = builder.contact;
            this.receiveTimeList = builder.receiveTimeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return categoryCode
         */
        public String getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return categoryDesc
         */
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        /**
         * @return categoryGroupCode
         */
        public String getCategoryGroupCode() {
            return this.categoryGroupCode;
        }

        /**
         * @return categoryGroupName
         */
        public String getCategoryGroupName() {
            return this.categoryGroupName;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return channelConfigs
         */
        public java.util.List<ChannelConfigs> getChannelConfigs() {
            return this.channelConfigs;
        }

        /**
         * @return contact
         */
        public Contact getContact() {
            return this.contact;
        }

        /**
         * @return receiveTimeList
         */
        public java.util.List<Integer> getReceiveTimeList() {
            return this.receiveTimeList;
        }

        public static final class Builder {
            private Long aliUid; 
            private String categoryCode; 
            private String categoryDesc; 
            private String categoryGroupCode; 
            private String categoryGroupName; 
            private String categoryName; 
            private java.util.List<ChannelConfigs> channelConfigs; 
            private Contact contact; 
            private java.util.List<Integer> receiveTimeList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.categoryCode = model.categoryCode;
                this.categoryDesc = model.categoryDesc;
                this.categoryGroupCode = model.categoryGroupCode;
                this.categoryGroupName = model.categoryGroupName;
                this.categoryName = model.categoryName;
                this.channelConfigs = model.channelConfigs;
                this.contact = model.contact;
                this.receiveTimeList = model.receiveTimeList;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * CategoryCode.
             */
            public Builder categoryCode(String categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * CategoryDesc.
             */
            public Builder categoryDesc(String categoryDesc) {
                this.categoryDesc = categoryDesc;
                return this;
            }

            /**
             * CategoryGroupCode.
             */
            public Builder categoryGroupCode(String categoryGroupCode) {
                this.categoryGroupCode = categoryGroupCode;
                return this;
            }

            /**
             * CategoryGroupName.
             */
            public Builder categoryGroupName(String categoryGroupName) {
                this.categoryGroupName = categoryGroupName;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * ChannelConfigs.
             */
            public Builder channelConfigs(java.util.List<ChannelConfigs> channelConfigs) {
                this.channelConfigs = channelConfigs;
                return this;
            }

            /**
             * Contact.
             */
            public Builder contact(Contact contact) {
                this.contact = contact;
                return this;
            }

            /**
             * ReceiveTimeList.
             */
            public Builder receiveTimeList(java.util.List<Integer> receiveTimeList) {
                this.receiveTimeList = receiveTimeList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
