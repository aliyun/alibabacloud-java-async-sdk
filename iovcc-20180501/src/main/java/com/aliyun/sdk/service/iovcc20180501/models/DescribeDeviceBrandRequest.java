// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceBrandRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceBrandRequest</p>
 */
public class DescribeDeviceBrandRequest extends Request {
    @Query
    @NameInMap("DeviceBrand")
    private String deviceBrand;

    @Query
    @NameInMap("DeviceBrandId")
    private Long deviceBrandId;

    @Query
    @NameInMap("Length")
    private String length;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Start")
    private String start;

    private DescribeDeviceBrandRequest(Builder builder) {
        super(builder);
        this.deviceBrand = builder.deviceBrand;
        this.deviceBrandId = builder.deviceBrandId;
        this.length = builder.length;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceBrandRequest create() {
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
     * @return length
     */
    public String getLength() {
        return this.length;
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

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceBrandRequest, Builder> {
        private String deviceBrand; 
        private Long deviceBrandId; 
        private String length; 
        private String projectId; 
        private String regionId; 
        private String start; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceBrandRequest response) {
            super(response);
            this.deviceBrand = response.deviceBrand;
            this.deviceBrandId = response.deviceBrandId;
            this.length = response.length;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.start = response.start;
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
         * Length.
         */
        public Builder length(String length) {
            this.putQueryParameter("Length", length);
            this.length = length;
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

        /**
         * Start.
         */
        public Builder start(String start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public DescribeDeviceBrandRequest build() {
            return new DescribeDeviceBrandRequest(this);
        } 

    } 

}
