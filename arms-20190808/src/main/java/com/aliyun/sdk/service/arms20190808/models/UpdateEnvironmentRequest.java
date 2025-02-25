// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvironmentRequest</p>
 */
public class UpdateEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentName")
    private String environmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeePackage")
    private String feePackage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateEnvironmentRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.environmentId = builder.environmentId;
        this.environmentName = builder.environmentName;
        this.feePackage = builder.feePackage;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return environmentName
     */
    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * @return feePackage
     */
    public String getFeePackage() {
        return this.feePackage;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateEnvironmentRequest, Builder> {
        private String aliyunLang; 
        private String environmentId; 
        private String environmentName; 
        private String feePackage; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvironmentRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.environmentId = request.environmentId;
            this.environmentName = request.environmentName;
            this.feePackage = request.feePackage;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The language. Valid values: zh and en. Default value: zh.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxxx</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The name of the environment instance.</p>
         * 
         * <strong>example:</strong>
         * <p>env1</p>
         */
        public Builder environmentName(String environmentName) {
            this.putQueryParameter("EnvironmentName", environmentName);
            this.environmentName = environmentName;
            return this;
        }

        /**
         * <p>The payable resource plan. Valid values:</p>
         * <ul>
         * <li>If the EnvironmentType parameter is set to CS, set the value to CS_Basic or CS_Pro. Default value: CS_Basic.</li>
         * <li>Otherwise, leave the parameter empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CS_Basic</p>
         */
        public Builder feePackage(String feePackage) {
            this.putQueryParameter("FeePackage", feePackage);
            this.feePackage = feePackage;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateEnvironmentRequest build() {
            return new UpdateEnvironmentRequest(this);
        } 

    } 

}
