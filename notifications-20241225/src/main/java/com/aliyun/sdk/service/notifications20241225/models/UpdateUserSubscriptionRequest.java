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
 * {@link UpdateUserSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserSubscriptionRequest</p>
 */
public class UpdateUserSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerProtocol")
    private String callerProtocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryCodes")
    private java.util.List<String> categoryCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelConfigs")
    private java.util.List<ChannelConfigs> channelConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelGroupCode")
    private String channelGroupCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientSource")
    private String clientSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommonContacts")
    private java.util.List<CommonContacts> commonContacts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cookies")
    private String cookies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperationItemCode")
    private String operationItemCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceiveTimeList")
    private java.util.List<Integer> receiveTimeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remarks")
    private String remarks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcUrl")
    private String srcUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UidType")
    private String uidType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebhookContacts")
    private java.util.List<WebhookContacts> webhookContacts;

    private UpdateUserSubscriptionRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.bizName = builder.bizName;
        this.callerProtocol = builder.callerProtocol;
        this.categoryCodes = builder.categoryCodes;
        this.channelConfigs = builder.channelConfigs;
        this.channelGroupCode = builder.channelGroupCode;
        this.clientSource = builder.clientSource;
        this.commonContacts = builder.commonContacts;
        this.cookies = builder.cookies;
        this.operationItemCode = builder.operationItemCode;
        this.receiveTimeList = builder.receiveTimeList;
        this.remarks = builder.remarks;
        this.srcUrl = builder.srcUrl;
        this.tenantCode = builder.tenantCode;
        this.uidType = builder.uidType;
        this.webhookContacts = builder.webhookContacts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserSubscriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return callerProtocol
     */
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    /**
     * @return categoryCodes
     */
    public java.util.List<String> getCategoryCodes() {
        return this.categoryCodes;
    }

    /**
     * @return channelConfigs
     */
    public java.util.List<ChannelConfigs> getChannelConfigs() {
        return this.channelConfigs;
    }

    /**
     * @return channelGroupCode
     */
    public String getChannelGroupCode() {
        return this.channelGroupCode;
    }

    /**
     * @return clientSource
     */
    public String getClientSource() {
        return this.clientSource;
    }

    /**
     * @return commonContacts
     */
    public java.util.List<CommonContacts> getCommonContacts() {
        return this.commonContacts;
    }

    /**
     * @return cookies
     */
    public String getCookies() {
        return this.cookies;
    }

    /**
     * @return operationItemCode
     */
    public String getOperationItemCode() {
        return this.operationItemCode;
    }

    /**
     * @return receiveTimeList
     */
    public java.util.List<Integer> getReceiveTimeList() {
        return this.receiveTimeList;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * @return srcUrl
     */
    public String getSrcUrl() {
        return this.srcUrl;
    }

    /**
     * @return tenantCode
     */
    public String getTenantCode() {
        return this.tenantCode;
    }

    /**
     * @return uidType
     */
    public String getUidType() {
        return this.uidType;
    }

    /**
     * @return webhookContacts
     */
    public java.util.List<WebhookContacts> getWebhookContacts() {
        return this.webhookContacts;
    }

    public static final class Builder extends Request.Builder<UpdateUserSubscriptionRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String bizName; 
        private String callerProtocol; 
        private java.util.List<String> categoryCodes; 
        private java.util.List<ChannelConfigs> channelConfigs; 
        private String channelGroupCode; 
        private String clientSource; 
        private java.util.List<CommonContacts> commonContacts; 
        private String cookies; 
        private String operationItemCode; 
        private java.util.List<Integer> receiveTimeList; 
        private String remarks; 
        private String srcUrl; 
        private String tenantCode; 
        private String uidType; 
        private java.util.List<WebhookContacts> webhookContacts; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserSubscriptionRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.bizName = request.bizName;
            this.callerProtocol = request.callerProtocol;
            this.categoryCodes = request.categoryCodes;
            this.channelConfigs = request.channelConfigs;
            this.channelGroupCode = request.channelGroupCode;
            this.clientSource = request.clientSource;
            this.commonContacts = request.commonContacts;
            this.cookies = request.cookies;
            this.operationItemCode = request.operationItemCode;
            this.receiveTimeList = request.receiveTimeList;
            this.remarks = request.remarks;
            this.srcUrl = request.srcUrl;
            this.tenantCode = request.tenantCode;
            this.uidType = request.uidType;
            this.webhookContacts = request.webhookContacts;
        } 

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putBodyParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The application name of the requester.</p>
         * 
         * <strong>example:</strong>
         * <p>yunge-user</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The business line of the requester.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * <p>The request protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder callerProtocol(String callerProtocol) {
            this.putBodyParameter("CallerProtocol", callerProtocol);
            this.callerProtocol = callerProtocol;
            return this;
        }

        /**
         * <p>The list of categories.</p>
         */
        public Builder categoryCodes(java.util.List<String> categoryCodes) {
            String categoryCodesShrink = shrink(categoryCodes, "CategoryCodes", "json");
            this.putBodyParameter("CategoryCodes", categoryCodesShrink);
            this.categoryCodes = categoryCodes;
            return this;
        }

        /**
         * <p>The list of channels.</p>
         */
        public Builder channelConfigs(java.util.List<ChannelConfigs> channelConfigs) {
            String channelConfigsShrink = shrink(channelConfigs, "ChannelConfigs", "json");
            this.putBodyParameter("ChannelConfigs", channelConfigsShrink);
            this.channelConfigs = channelConfigs;
            return this;
        }

        /**
         * <p>The channel group. Valid values:</p>
         * <ul>
         * <li>tts: Voice channel group.</li>
         * <li>webhook: Chatbot channel group.</li>
         * <li>base: Basic channel group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>base</p>
         */
        public Builder channelGroupCode(String channelGroupCode) {
            this.putBodyParameter("ChannelGroupCode", channelGroupCode);
            this.channelGroupCode = channelGroupCode;
            return this;
        }

        /**
         * <p>The source of the operation terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder clientSource(String clientSource) {
            this.putBodyParameter("ClientSource", clientSource);
            this.clientSource = clientSource;
            return this;
        }

        /**
         * <p>The common contacts.</p>
         */
        public Builder commonContacts(java.util.List<CommonContacts> commonContacts) {
            String commonContactsShrink = shrink(commonContacts, "CommonContacts", "json");
            this.putBodyParameter("CommonContacts", commonContactsShrink);
            this.commonContacts = commonContacts;
            return this;
        }

        /**
         * <p>The user cookies.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder cookies(String cookies) {
            this.putBodyParameter("Cookies", cookies);
            this.cookies = cookies;
            return this;
        }

        /**
         * <p>The revision type. Valid values:</p>
         * <ul>
         * <li>receive_contact: Receive contact.</li>
         * <li>receive_channel: Receive channel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>receive_channel</p>
         */
        public Builder operationItemCode(String operationItemCode) {
            this.putBodyParameter("OperationItemCode", operationItemCode);
            this.operationItemCode = operationItemCode;
            return this;
        }

        /**
         * <p>Not supported.</p>
         */
        public Builder receiveTimeList(java.util.List<Integer> receiveTimeList) {
            String receiveTimeListShrink = shrink(receiveTimeList, "ReceiveTimeList", "json");
            this.putBodyParameter("ReceiveTimeList", receiveTimeListShrink);
            this.receiveTimeList = receiveTimeList;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("Remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        /**
         * <p>The URL of the source page.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder srcUrl(String srcUrl) {
            this.putBodyParameter("SrcUrl", srcUrl);
            this.srcUrl = srcUrl;
            return this;
        }

        /**
         * <p>The tenant information.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder tenantCode(String tenantCode) {
            this.putBodyParameter("TenantCode", tenantCode);
            this.tenantCode = tenantCode;
            return this;
        }

        /**
         * <p>The user type.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder uidType(String uidType) {
            this.putBodyParameter("UidType", uidType);
            this.uidType = uidType;
            return this;
        }

        /**
         * <p>The list of chatbot contacts.</p>
         */
        public Builder webhookContacts(java.util.List<WebhookContacts> webhookContacts) {
            String webhookContactsShrink = shrink(webhookContacts, "WebhookContacts", "json");
            this.putBodyParameter("WebhookContacts", webhookContactsShrink);
            this.webhookContacts = webhookContacts;
            return this;
        }

        @Override
        public UpdateUserSubscriptionRequest build() {
            return new UpdateUserSubscriptionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUserSubscriptionRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserSubscriptionRequest</p>
     */
    public static class ChannelConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("CheckedState")
        private String checkedState;

        @com.aliyun.core.annotation.NameInMap("FatigueDayLimit")
        private Integer fatigueDayLimit;

        private ChannelConfigs(Builder builder) {
            this.channelType = builder.channelType;
            this.checkedState = builder.checkedState;
            this.fatigueDayLimit = builder.fatigueDayLimit;
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
         * @return fatigueDayLimit
         */
        public Integer getFatigueDayLimit() {
            return this.fatigueDayLimit;
        }

        public static final class Builder {
            private String channelType; 
            private String checkedState; 
            private Integer fatigueDayLimit; 

            private Builder() {
            } 

            private Builder(ChannelConfigs model) {
                this.channelType = model.channelType;
                this.checkedState = model.checkedState;
                this.fatigueDayLimit = model.fatigueDayLimit;
            } 

            /**
             * <p>The channel type.</p>
             * 
             * <strong>example:</strong>
             * <p>pmsg</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>Specifies whether the channel is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder checkedState(String checkedState) {
                this.checkedState = checkedState;
                return this;
            }

            /**
             * <p>The fatigue threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder fatigueDayLimit(Integer fatigueDayLimit) {
                this.fatigueDayLimit = fatigueDayLimit;
                return this;
            }

            public ChannelConfigs build() {
                return new ChannelConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateUserSubscriptionRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserSubscriptionRequest</p>
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
             * <p>The blacklist.</p>
             */
            public Builder keywordBlacklist(java.util.List<String> keywordBlacklist) {
                this.keywordBlacklist = keywordBlacklist;
                return this;
            }

            /**
             * <p>The whitelist.</p>
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
     * {@link UpdateUserSubscriptionRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserSubscriptionRequest</p>
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
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * <p>The contact ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder contactMobile(String contactMobile) {
                this.contactMobile = contactMobile;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder emailConfirmed(Boolean emailConfirmed) {
                this.emailConfirmed = emailConfirmed;
                return this;
            }

            /**
             * <p>The message source.</p>
             */
            public Builder messageSource(MessageSource messageSource) {
                this.messageSource = messageSource;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder mobileConfirmed(Boolean mobileConfirmed) {
                this.mobileConfirmed = mobileConfirmed;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
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
     * {@link UpdateUserSubscriptionRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserSubscriptionRequest</p>
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
             * <p>The blacklist.</p>
             */
            public Builder keywordBlacklist(java.util.List<String> keywordBlacklist) {
                this.keywordBlacklist = keywordBlacklist;
                return this;
            }

            /**
             * <p>The whitelist.</p>
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
     * {@link UpdateUserSubscriptionRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserSubscriptionRequest</p>
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
             * <p>webhook id</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The message source.</p>
             */
            public Builder messageSource(WebhookContactsMessageSource messageSource) {
                this.messageSource = messageSource;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder serverUrl(String serverUrl) {
                this.serverUrl = serverUrl;
                return this;
            }

            /**
             * <p>No input required.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
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
}
