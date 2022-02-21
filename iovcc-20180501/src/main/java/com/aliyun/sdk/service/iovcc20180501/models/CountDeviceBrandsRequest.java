// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountDeviceBrandsRequest} extends {@link RequestModel}
 *
 * <p>CountDeviceBrandsRequest</p>
 */
public class CountDeviceBrandsRequest extends Request {
    @Query
    @NameInMap("DeviceBrand")
    private String deviceBrand;

    @Query
    @NameInMap("DeviceBrandId")
    private Long deviceBrandId;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CountDeviceBrandsRequest(Builder builder) {
        super(builder);
        this.deviceBrand = builder.deviceBrand;
        this.deviceBrandId = builder.deviceBrandId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountDeviceBrandsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceBrand
     */
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    /**
     * @return deviceBrandId
     */
    public Long getDeviceBrandId() {
        return this.deviceBrandId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CountDeviceBrandsRequest, Builder> {
        private String deviceBrand; 
        private Long deviceBrandId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CountDeviceBrandsRequest response) {
            super(response);
            this.deviceBrand = response.deviceBrand;
            this.deviceBrandId = response.deviceBrandId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
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
         * DeviceBrandId.
         */
        public Builder deviceBrandId(Long deviceBrandId) {
            this.putQueryParameter("DeviceBrandId", deviceBrandId);
            this.deviceBrandId = deviceBrandId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CountDeviceBrandsRequest build() {
            return new CountDeviceBrandsRequest(this);
        } 

    } 

}
