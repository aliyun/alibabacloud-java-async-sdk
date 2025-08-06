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
 * {@link AddFreeLicenseRequest} extends {@link RequestModel}
 *
 * <p>AddFreeLicenseRequest</p>
 */
public class AddFreeLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppItemId")
    private String appItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppPlatforms")
    private String appPlatforms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkModels")
    private String sdkModels;

    private AddFreeLicenseRequest(Builder builder) {
        super(builder);
        this.appItemId = builder.appItemId;
        this.appName = builder.appName;
        this.appPlatforms = builder.appPlatforms;
        this.sdkModels = builder.sdkModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFreeLicenseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appItemId
     */
    public String getAppItemId() {
        return this.appItemId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appPlatforms
     */
    public String getAppPlatforms() {
        return this.appPlatforms;
    }

    /**
     * @return sdkModels
     */
    public String getSdkModels() {
        return this.sdkModels;
    }

    public static final class Builder extends Request.Builder<AddFreeLicenseRequest, Builder> {
        private String appItemId; 
        private String appName; 
        private String appPlatforms; 
        private String sdkModels; 

        private Builder() {
            super();
        } 

        private Builder(AddFreeLicenseRequest request) {
            super(request);
            this.appItemId = request.appItemId;
            this.appName = request.appName;
            this.appPlatforms = request.appPlatforms;
            this.sdkModels = request.sdkModels;
        } 

        /**
         * AppItemId.
         */
        public Builder appItemId(String appItemId) {
            this.putQueryParameter("AppItemId", appItemId);
            this.appItemId = appItemId;
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
         * AppPlatforms.
         */
        public Builder appPlatforms(String appPlatforms) {
            this.putQueryParameter("AppPlatforms", appPlatforms);
            this.appPlatforms = appPlatforms;
            return this;
        }

        /**
         * SdkModels.
         */
        public Builder sdkModels(String sdkModels) {
            this.putQueryParameter("SdkModels", sdkModels);
            this.sdkModels = sdkModels;
            return this;
        }

        @Override
        public AddFreeLicenseRequest build() {
            return new AddFreeLicenseRequest(this);
        } 

    } 

}
