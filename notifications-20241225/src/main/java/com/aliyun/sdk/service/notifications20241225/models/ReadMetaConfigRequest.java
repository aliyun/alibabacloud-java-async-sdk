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
 * {@link ReadMetaConfigRequest} extends {@link RequestModel}
 *
 * <p>ReadMetaConfigRequest</p>
 */
public class ReadMetaConfigRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ClientSource")
    private String clientSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cookies")
    private String cookies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcUrl")
    private String srcUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UidType")
    private String uidType;

    private ReadMetaConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.bizName = builder.bizName;
        this.callerProtocol = builder.callerProtocol;
        this.clientSource = builder.clientSource;
        this.cookies = builder.cookies;
        this.srcUrl = builder.srcUrl;
        this.tenantCode = builder.tenantCode;
        this.uidType = builder.uidType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadMetaConfigRequest create() {
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

    public static final class Builder extends Request.Builder<ReadMetaConfigRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String bizName; 
        private String callerProtocol; 
        private String clientSource; 
        private String cookies; 
        private String srcUrl; 
        private String tenantCode; 
        private String uidType; 

        private Builder() {
            super();
        } 

        private Builder(ReadMetaConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.bizName = request.bizName;
            this.callerProtocol = request.callerProtocol;
            this.clientSource = request.clientSource;
            this.cookies = request.cookies;
            this.srcUrl = request.srcUrl;
            this.tenantCode = request.tenantCode;
            this.uidType = request.uidType;
        } 

        /**
         * <p>The language type of the returned information. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.</li>
         * </ul>
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
         * <p>The application project name of the requester.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxApp</p>
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
         * <p>SystemAlerts</p>
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
         * <p>https</p>
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
         * <p>h5</p>
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
         * <p>The URL of the source page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/notify,0">https://example.com/notify,0</a></p>
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
         * <p>T002</p>
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
         * <p>aliyunPk</p>
         */
        public Builder uidType(String uidType) {
            this.putBodyParameter("UidType", uidType);
            this.uidType = uidType;
            return this;
        }

        @Override
        public ReadMetaConfigRequest build() {
            return new ReadMetaConfigRequest(this);
        } 

    } 

}
