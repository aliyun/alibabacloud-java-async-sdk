// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>InitEnvironmentRequest</p>
 */
public class InitEnvironmentRequest extends Request {
    @Query
    @NameInMap("AliyunLang")
    private String aliyunLang;

    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("ManagedType")
    private String managedType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private InitEnvironmentRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.environmentId = builder.environmentId;
        this.managedType = builder.managedType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitEnvironmentRequest create() {
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
     * @return managedType
     */
    public String getManagedType() {
        return this.managedType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<InitEnvironmentRequest, Builder> {
        private String aliyunLang; 
        private String environmentId; 
        private String managedType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InitEnvironmentRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.environmentId = request.environmentId;
            this.managedType = request.managedType;
            this.regionId = request.regionId;
        } 

        /**
         * The language. Valid values: zh and en. Default value: zh.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * The ID of the environment instance.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * type of managed:
         * <p>
         * - none: not managed. default value of prometheus for ACK.
         * - agent: managed agent. default value of promehtues for ASK/ACS/AckOne.
         * - agent-exproter: maanged agent and exporter. default of prometheus for Cloud.
         */
        public Builder managedType(String managedType) {
            this.putQueryParameter("ManagedType", managedType);
            this.managedType = managedType;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public InitEnvironmentRequest build() {
            return new InitEnvironmentRequest(this);
        } 

    } 

}
