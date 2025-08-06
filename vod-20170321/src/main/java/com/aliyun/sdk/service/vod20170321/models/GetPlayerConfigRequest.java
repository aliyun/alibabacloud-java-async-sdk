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
 * {@link GetPlayerConfigRequest} extends {@link RequestModel}
 *
 * <p>GetPlayerConfigRequest</p>
 */
public class GetPlayerConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiVersion")
    private String apiVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthInfo")
    private String authInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimestamp")
    private Long authTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceBrand")
    private String deviceBrand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceModel")
    private String deviceModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsName")
    private String osName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reserved")
    private String reserved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    private GetPlayerConfigRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.authInfo = builder.authInfo;
        this.authTimestamp = builder.authTimestamp;
        this.deviceBrand = builder.deviceBrand;
        this.deviceModel = builder.deviceModel;
        this.osName = builder.osName;
        this.reserved = builder.reserved;
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlayerConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return authInfo
     */
    public String getAuthInfo() {
        return this.authInfo;
    }

    /**
     * @return authTimestamp
     */
    public Long getAuthTimestamp() {
        return this.authTimestamp;
    }

    /**
     * @return deviceBrand
     */
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    /**
     * @return deviceModel
     */
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * @return osName
     */
    public String getOsName() {
        return this.osName;
    }

    /**
     * @return reserved
     */
    public String getReserved() {
        return this.reserved;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    public static final class Builder extends Request.Builder<GetPlayerConfigRequest, Builder> {
        private String apiVersion; 
        private String authInfo; 
        private Long authTimestamp; 
        private String deviceBrand; 
        private String deviceModel; 
        private String osName; 
        private String reserved; 
        private String rule; 

        private Builder() {
            super();
        } 

        private Builder(GetPlayerConfigRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.authInfo = request.authInfo;
            this.authTimestamp = request.authTimestamp;
            this.deviceBrand = request.deviceBrand;
            this.deviceModel = request.deviceModel;
            this.osName = request.osName;
            this.reserved = request.reserved;
            this.rule = request.rule;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * AuthInfo.
         */
        public Builder authInfo(String authInfo) {
            this.putQueryParameter("AuthInfo", authInfo);
            this.authInfo = authInfo;
            return this;
        }

        /**
         * AuthTimestamp.
         */
        public Builder authTimestamp(Long authTimestamp) {
            this.putQueryParameter("AuthTimestamp", authTimestamp);
            this.authTimestamp = authTimestamp;
            return this;
        }

        /**
         * DeviceBrand.
         */
        public Builder deviceBrand(String deviceBrand) {
            this.putQueryParameter("DeviceBrand", deviceBrand);
            this.deviceBrand = deviceBrand;
            return this;
        }

        /**
         * DeviceModel.
         */
        public Builder deviceModel(String deviceModel) {
            this.putQueryParameter("DeviceModel", deviceModel);
            this.deviceModel = deviceModel;
            return this;
        }

        /**
         * OsName.
         */
        public Builder osName(String osName) {
            this.putQueryParameter("OsName", osName);
            this.osName = osName;
            return this;
        }

        /**
         * Reserved.
         */
        public Builder reserved(String reserved) {
            this.putQueryParameter("Reserved", reserved);
            this.reserved = reserved;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        @Override
        public GetPlayerConfigRequest build() {
            return new GetPlayerConfigRequest(this);
        } 

    } 

}
