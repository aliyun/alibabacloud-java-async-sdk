// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallPromClusterRequest} extends {@link RequestModel}
 *
 * <p>UninstallPromClusterRequest</p>
 */
public class UninstallPromClusterRequest extends Request {
    @Query
    @NameInMap("AliyunLang")
    private String aliyunLang;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UninstallPromClusterRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallPromClusterRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UninstallPromClusterRequest, Builder> {
        private String aliyunLang; 
        private String clusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallPromClusterRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
        } 

        /**
         * AliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The region ID. Default value: cn-hangzhou.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UninstallPromClusterRequest build() {
            return new UninstallPromClusterRequest(this);
        } 

    } 

}
