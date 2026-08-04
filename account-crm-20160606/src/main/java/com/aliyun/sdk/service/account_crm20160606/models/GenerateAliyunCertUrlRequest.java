// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link GenerateAliyunCertUrlRequest} extends {@link RequestModel}
 *
 * <p>GenerateAliyunCertUrlRequest</p>
 */
public class GenerateAliyunCertUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunPk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliyunPk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyChannel")
    private String applyChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyType")
    private String applyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callback")
    private String callback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertWay")
    private String certWay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreAlreadyCert")
    private Boolean ignoreAlreadyCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsMobile")
    private Boolean isMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOpenApp")
    private Boolean isOpenApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subjectType;

    private GenerateAliyunCertUrlRequest(Builder builder) {
        super(builder);
        this.aliyunPk = builder.aliyunPk;
        this.appName = builder.appName;
        this.applyChannel = builder.applyChannel;
        this.applyType = builder.applyType;
        this.callback = builder.callback;
        this.certWay = builder.certWay;
        this.ignoreAlreadyCert = builder.ignoreAlreadyCert;
        this.isMobile = builder.isMobile;
        this.isOpenApp = builder.isOpenApp;
        this.platform = builder.platform;
        this.source = builder.source;
        this.subjectType = builder.subjectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAliyunCertUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunPk
     */
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return applyChannel
     */
    public String getApplyChannel() {
        return this.applyChannel;
    }

    /**
     * @return applyType
     */
    public String getApplyType() {
        return this.applyType;
    }

    /**
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return certWay
     */
    public String getCertWay() {
        return this.certWay;
    }

    /**
     * @return ignoreAlreadyCert
     */
    public Boolean getIgnoreAlreadyCert() {
        return this.ignoreAlreadyCert;
    }

    /**
     * @return isMobile
     */
    public Boolean getIsMobile() {
        return this.isMobile;
    }

    /**
     * @return isOpenApp
     */
    public Boolean getIsOpenApp() {
        return this.isOpenApp;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return subjectType
     */
    public String getSubjectType() {
        return this.subjectType;
    }

    public static final class Builder extends Request.Builder<GenerateAliyunCertUrlRequest, Builder> {
        private String aliyunPk; 
        private String appName; 
        private String applyChannel; 
        private String applyType; 
        private String callback; 
        private String certWay; 
        private Boolean ignoreAlreadyCert; 
        private Boolean isMobile; 
        private Boolean isOpenApp; 
        private String platform; 
        private String source; 
        private String subjectType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAliyunCertUrlRequest request) {
            super(request);
            this.aliyunPk = request.aliyunPk;
            this.appName = request.appName;
            this.applyChannel = request.applyChannel;
            this.applyType = request.applyType;
            this.callback = request.callback;
            this.certWay = request.certWay;
            this.ignoreAlreadyCert = request.ignoreAlreadyCert;
            this.isMobile = request.isMobile;
            this.isOpenApp = request.isOpenApp;
            this.platform = request.platform;
            this.source = request.source;
            this.subjectType = request.subjectType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aliyunPk(String aliyunPk) {
            this.putQueryParameter("AliyunPk", aliyunPk);
            this.aliyunPk = aliyunPk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * ApplyChannel.
         */
        public Builder applyChannel(String applyChannel) {
            this.putQueryParameter("ApplyChannel", applyChannel);
            this.applyChannel = applyChannel;
            return this;
        }

        /**
         * ApplyType.
         */
        public Builder applyType(String applyType) {
            this.putQueryParameter("ApplyType", applyType);
            this.applyType = applyType;
            return this;
        }

        /**
         * Callback.
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * CertWay.
         */
        public Builder certWay(String certWay) {
            this.putQueryParameter("CertWay", certWay);
            this.certWay = certWay;
            return this;
        }

        /**
         * IgnoreAlreadyCert.
         */
        public Builder ignoreAlreadyCert(Boolean ignoreAlreadyCert) {
            this.putQueryParameter("IgnoreAlreadyCert", ignoreAlreadyCert);
            this.ignoreAlreadyCert = ignoreAlreadyCert;
            return this;
        }

        /**
         * IsMobile.
         */
        public Builder isMobile(Boolean isMobile) {
            this.putQueryParameter("IsMobile", isMobile);
            this.isMobile = isMobile;
            return this;
        }

        /**
         * IsOpenApp.
         */
        public Builder isOpenApp(Boolean isOpenApp) {
            this.putQueryParameter("IsOpenApp", isOpenApp);
            this.isOpenApp = isOpenApp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder subjectType(String subjectType) {
            this.putQueryParameter("SubjectType", subjectType);
            this.subjectType = subjectType;
            return this;
        }

        @Override
        public GenerateAliyunCertUrlRequest build() {
            return new GenerateAliyunCertUrlRequest(this);
        } 

    } 

}
