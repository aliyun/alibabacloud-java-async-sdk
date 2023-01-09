// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
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

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.extraInfo = builder.extraInfo;
        this.language = builder.language;
        this.region = builder.region;
        this.sentinelEnable = builder.sentinelEnable;
        this.source = builder.source;
        this.switchEnable = builder.switchEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String extraInfo; 
        private String language; 
        private String region; 
        private String sentinelEnable; 
        private String source; 
        private String switchEnable; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.extraInfo = request.extraInfo;
            this.language = request.language;
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
         * The region to which the application belongs.
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
         * The service where the application is deployed. A value of ACK indicates Container Service for Kubernetes.
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
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

}
