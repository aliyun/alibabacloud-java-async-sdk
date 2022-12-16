// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMseServiceApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateMseServiceApplicationRequest</p>
 */
public class CreateMseServiceApplicationRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("ExtraInfo")
    private String extraInfo;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("MseVersion")
    private String mseVersion;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("SentinelEnable")
    private String sentinelEnable;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SwitchEnable")
    private String switchEnable;

    private CreateMseServiceApplicationRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.extraInfo = builder.extraInfo;
        this.language = builder.language;
        this.mseVersion = builder.mseVersion;
        this.region = builder.region;
        this.sentinelEnable = builder.sentinelEnable;
        this.source = builder.source;
        this.switchEnable = builder.switchEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMseServiceApplicationRequest create() {
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
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return mseVersion
     */
    public String getMseVersion() {
        return this.mseVersion;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return sentinelEnable
     */
    public String getSentinelEnable() {
        return this.sentinelEnable;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return switchEnable
     */
    public String getSwitchEnable() {
        return this.switchEnable;
    }

    public static final class Builder extends Request.Builder<CreateMseServiceApplicationRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String extraInfo; 
        private String language; 
        private String mseVersion; 
        private String region; 
        private String sentinelEnable; 
        private String source; 
        private String switchEnable; 

        private Builder() {
            super();
        } 

        private Builder(CreateMseServiceApplicationRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.extraInfo = request.extraInfo;
            this.language = request.language;
            this.mseVersion = request.mseVersion;
            this.region = request.region;
            this.sentinelEnable = request.sentinelEnable;
            this.source = request.source;
            this.switchEnable = request.switchEnable;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The name of the application.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The additional information.
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * The programming language of the application.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The edition of the MSE instance that you want to purchase.
         * <p>
         * 
         * *   mse_pro: Professional Edition
         * *   mse_dev: Developer Edition
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        /**
         * The ID of the region where the Microservices Engine (MSE) instance resides. Examples:
         * <p>
         * 
         * *   cn-hangzhou: China (Hangzhou)
         * *   cn-beijing: China (Beijing)
         * *   cn-shanghai: China (Shanghai)
         * *   cn-zhangjiakou: China (Zhangjiakou)
         * *   cn-shenzhen: China (Shenzhen)
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Specifies whether to enable the Sentinel-compatible mode.
         */
        public Builder sentinelEnable(String sentinelEnable) {
            this.putQueryParameter("SentinelEnable", sentinelEnable);
            this.sentinelEnable = sentinelEnable;
            return this;
        }

        /**
         * The service source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Specifies whether to enable switching.
         */
        public Builder switchEnable(String switchEnable) {
            this.putQueryParameter("SwitchEnable", switchEnable);
            this.switchEnable = switchEnable;
            return this;
        }

        @Override
        public CreateMseServiceApplicationRequest build() {
            return new CreateMseServiceApplicationRequest(this);
        } 

    } 

}
