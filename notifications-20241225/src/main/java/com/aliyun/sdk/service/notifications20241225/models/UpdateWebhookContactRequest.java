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
 * {@link UpdateWebhookContactRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebhookContactRequest</p>
 */
public class UpdateWebhookContactRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("BotSecurityToken")
    private String botSecurityToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerProtocol")
    private String callerProtocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientSource")
    private String clientSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private Long contactId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cookies")
    private String cookies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    @Deprecated
    private String securityToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerUrl")
    private String serverUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcUrl")
    private String srcUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UidType")
    private String uidType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VerificationCode")
    private String verificationCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebhookType")
    private String webhookType;

    private UpdateWebhookContactRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.bizName = builder.bizName;
        this.botSecurityToken = builder.botSecurityToken;
        this.callerProtocol = builder.callerProtocol;
        this.clientSource = builder.clientSource;
        this.contactId = builder.contactId;
        this.contactName = builder.contactName;
        this.cookies = builder.cookies;
        this.securityToken = builder.securityToken;
        this.serverUrl = builder.serverUrl;
        this.srcUrl = builder.srcUrl;
        this.templateCode = builder.templateCode;
        this.tenantCode = builder.tenantCode;
        this.uidType = builder.uidType;
        this.verificationCode = builder.verificationCode;
        this.webhookType = builder.webhookType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebhookContactRequest create() {
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
     * @return botSecurityToken
     */
    public String getBotSecurityToken() {
        return this.botSecurityToken;
    }

    /**
     * @return callerProtocol
     */
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    /**
     * @return clientSource
     */
    public String getClientSource() {
        return this.clientSource;
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
     * @return cookies
     */
    public String getCookies() {
        return this.cookies;
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
     * @return srcUrl
     */
    public String getSrcUrl() {
        return this.srcUrl;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
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
     * @return verificationCode
     */
    public String getVerificationCode() {
        return this.verificationCode;
    }

    /**
     * @return webhookType
     */
    public String getWebhookType() {
        return this.webhookType;
    }

    public static final class Builder extends Request.Builder<UpdateWebhookContactRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String bizName; 
        private String botSecurityToken; 
        private String callerProtocol; 
        private String clientSource; 
        private Long contactId; 
        private String contactName; 
        private String cookies; 
        private String securityToken; 
        private String serverUrl; 
        private String srcUrl; 
        private String templateCode; 
        private String tenantCode; 
        private String uidType; 
        private String verificationCode; 
        private String webhookType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWebhookContactRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.bizName = request.bizName;
            this.botSecurityToken = request.botSecurityToken;
            this.callerProtocol = request.callerProtocol;
            this.clientSource = request.clientSource;
            this.contactId = request.contactId;
            this.contactName = request.contactName;
            this.cookies = request.cookies;
            this.securityToken = request.securityToken;
            this.serverUrl = request.serverUrl;
            this.srcUrl = request.srcUrl;
            this.templateCode = request.templateCode;
            this.tenantCode = request.tenantCode;
            this.uidType = request.uidType;
            this.verificationCode = request.verificationCode;
            this.webhookType = request.webhookType;
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
         * <p>The application name of the caller.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The business line of the caller.</p>
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
         * <p>The security signature.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder botSecurityToken(String botSecurityToken) {
            this.putBodyParameter("BotSecurityToken", botSecurityToken);
            this.botSecurityToken = botSecurityToken;
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
         * <p>webhook id</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder contactId(Long contactId) {
            this.putBodyParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The webhook name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder contactName(String contactName) {
            this.putBodyParameter("ContactName", contactName);
            this.contactName = contactName;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putBodyParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The webhook server URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=xxxxx">https://oapi.dingtalk.com/robot/send?access_token=xxxxx</a></p>
         */
        public Builder serverUrl(String serverUrl) {
            this.putBodyParameter("ServerUrl", serverUrl);
            this.serverUrl = serverUrl;
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
         * <p>The template code. This parameter is required only for custom webhooks.</p>
         * 
         * <strong>example:</strong>
         * <p>lark</p>
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
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
         * <p>The verification code.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder verificationCode(String verificationCode) {
            this.putBodyParameter("VerificationCode", verificationCode);
            this.verificationCode = verificationCode;
            return this;
        }

        /**
         * <p>The webhook type.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        public Builder webhookType(String webhookType) {
            this.putBodyParameter("WebhookType", webhookType);
            this.webhookType = webhookType;
            return this;
        }

        @Override
        public UpdateWebhookContactRequest build() {
            return new UpdateWebhookContactRequest(this);
        } 

    } 

}
