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
 * {@link ResetUserSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>ResetUserSubscriptionRequest</p>
 */
public class ResetUserSubscriptionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ChannelGroupCode")
    private String channelGroupCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientSource")
    private String clientSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cookies")
    private String cookies;

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

    private ResetUserSubscriptionRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.bizName = builder.bizName;
        this.callerProtocol = builder.callerProtocol;
        this.categoryCodes = builder.categoryCodes;
        this.channelGroupCode = builder.channelGroupCode;
        this.clientSource = builder.clientSource;
        this.cookies = builder.cookies;
        this.remarks = builder.remarks;
        this.srcUrl = builder.srcUrl;
        this.tenantCode = builder.tenantCode;
        this.uidType = builder.uidType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetUserSubscriptionRequest create() {
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
     * @return cookies
     */
    public String getCookies() {
        return this.cookies;
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

    public static final class Builder extends Request.Builder<ResetUserSubscriptionRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String bizName; 
        private String callerProtocol; 
        private java.util.List<String> categoryCodes; 
        private String channelGroupCode; 
        private String clientSource; 
        private String cookies; 
        private String remarks; 
        private String srcUrl; 
        private String tenantCode; 
        private String uidType; 

        private Builder() {
            super();
        } 

        private Builder(ResetUserSubscriptionRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.bizName = request.bizName;
            this.callerProtocol = request.callerProtocol;
            this.categoryCodes = request.categoryCodes;
            this.channelGroupCode = request.channelGroupCode;
            this.clientSource = request.clientSource;
            this.cookies = request.cookies;
            this.remarks = request.remarks;
            this.srcUrl = request.srcUrl;
            this.tenantCode = request.tenantCode;
            this.uidType = request.uidType;
        } 

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
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
         * <p>The list of category codes.</p>
         */
        public Builder categoryCodes(java.util.List<String> categoryCodes) {
            String categoryCodesShrink = shrink(categoryCodes, "CategoryCodes", "json");
            this.putBodyParameter("CategoryCodes", categoryCodesShrink);
            this.categoryCodes = categoryCodes;
            return this;
        }

        /**
         * <p>The channel group. Valid values:</p>
         * <ul>
         * <li>tts: Voice reception management.</li>
         * <li>webhook: Bot reception management.</li>
         * <li>base: Basic reception management.</li>
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

        @Override
        public ResetUserSubscriptionRequest build() {
            return new ResetUserSubscriptionRequest(this);
        } 

    } 

}
