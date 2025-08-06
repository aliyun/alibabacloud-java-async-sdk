// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetPlayConfigRequest} extends {@link RequestModel}
 *
 * <p>GetPlayConfigRequest</p>
 */
public class GetPlayConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("HttpMethod")
    private String httpMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OS")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSVersion")
    private String OSVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDKVersion")
    private String SDKVersion;

    private GetPlayConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.brand = builder.brand;
        this.configType = builder.configType;
        this.httpMethod = builder.httpMethod;
        this.os = builder.os;
        this.OSVersion = builder.OSVersion;
        this.SDKVersion = builder.SDKVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlayConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return httpMethod
     */
    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return OSVersion
     */
    public String getOSVersion() {
        return this.OSVersion;
    }

    /**
     * @return SDKVersion
     */
    public String getSDKVersion() {
        return this.SDKVersion;
    }

    public static final class Builder extends Request.Builder<GetPlayConfigRequest, Builder> {
        private String appId; 
        private String appName; 
        private String brand; 
        private String configType; 
        private String httpMethod; 
        private String os; 
        private String OSVersion; 
        private String SDKVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetPlayConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.brand = request.brand;
            this.configType = request.configType;
            this.httpMethod = request.httpMethod;
            this.os = request.os;
            this.OSVersion = request.OSVersion;
            this.SDKVersion = request.SDKVersion;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Brand.
         */
        public Builder brand(String brand) {
            this.putQueryParameter("Brand", brand);
            this.brand = brand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * HttpMethod.
         */
        public Builder httpMethod(String httpMethod) {
            this.putHeaderParameter("HttpMethod", httpMethod);
            this.httpMethod = httpMethod;
            return this;
        }

        /**
         * OS.
         */
        public Builder os(String os) {
            this.putQueryParameter("OS", os);
            this.os = os;
            return this;
        }

        /**
         * OSVersion.
         */
        public Builder OSVersion(String OSVersion) {
            this.putQueryParameter("OSVersion", OSVersion);
            this.OSVersion = OSVersion;
            return this;
        }

        /**
         * SDKVersion.
         */
        public Builder SDKVersion(String SDKVersion) {
            this.putQueryParameter("SDKVersion", SDKVersion);
            this.SDKVersion = SDKVersion;
            return this;
        }

        @Override
        public GetPlayConfigRequest build() {
            return new GetPlayConfigRequest(this);
        } 

    } 

}
