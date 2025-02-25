// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link CreateMseServiceApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateMseServiceApplicationRequest</p>
 */
public class CreateMseServiceApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MseVersion")
    private String mseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SentinelEnable")
    private String sentinelEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchEnable")
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bsd-xxyp-open-goods-server</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The programming language of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>JAVA</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The edition of the MSE instance that you want to purchase.</p>
         * <ul>
         * <li>mse_pro: Professional Edition.</li>
         * <li>mse_dev: Developer Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mse_pro</p>
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        /**
         * <p>The ID of the region where the instance resides. Examples:</p>
         * <ul>
         * <li>cn-hangzhou: China (Hangzhou)</li>
         * <li>cn-beijing: China (Beijing)</li>
         * <li>cn-shanghai: China (Shanghai)</li>
         * <li>cn-zhangjiakou: China (Zhangjiakou)</li>
         * <li>cn-shenzhen: China (Shenzhen)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Sentinel-compatible mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sentinelEnable(String sentinelEnable) {
            this.putQueryParameter("SentinelEnable", sentinelEnable);
            this.sentinelEnable = sentinelEnable;
            return this;
        }

        /**
         * <p>The service source.</p>
         * 
         * <strong>example:</strong>
         * <p>edasmsc</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>Specifies whether to enable switching.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
