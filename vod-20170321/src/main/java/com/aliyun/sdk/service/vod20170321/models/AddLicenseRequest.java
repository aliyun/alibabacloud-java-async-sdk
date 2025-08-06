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
 * {@link AddLicenseRequest} extends {@link RequestModel}
 *
 * <p>AddLicenseRequest</p>
 */
public class AddLicenseRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ContractNo")
    private String contractNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkModels")
    private String sdkModels;

    private AddLicenseRequest(Builder builder) {
        super(builder);
        this.appItemId = builder.appItemId;
        this.appName = builder.appName;
        this.appPlatforms = builder.appPlatforms;
        this.contractNo = builder.contractNo;
        this.instanceId = builder.instanceId;
        this.sdkModels = builder.sdkModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLicenseRequest create() {
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
     * @return contractNo
     */
    public String getContractNo() {
        return this.contractNo;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sdkModels
     */
    public String getSdkModels() {
        return this.sdkModels;
    }

    public static final class Builder extends Request.Builder<AddLicenseRequest, Builder> {
        private String appItemId; 
        private String appName; 
        private String appPlatforms; 
        private String contractNo; 
        private String instanceId; 
        private String sdkModels; 

        private Builder() {
            super();
        } 

        private Builder(AddLicenseRequest request) {
            super(request);
            this.appItemId = request.appItemId;
            this.appName = request.appName;
            this.appPlatforms = request.appPlatforms;
            this.contractNo = request.contractNo;
            this.instanceId = request.instanceId;
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
         * ContractNo.
         */
        public Builder contractNo(String contractNo) {
            this.putQueryParameter("ContractNo", contractNo);
            this.contractNo = contractNo;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public AddLicenseRequest build() {
            return new AddLicenseRequest(this);
        } 

    } 

}
