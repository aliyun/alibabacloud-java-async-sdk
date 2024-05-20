// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opt20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderUsageRequest} extends {@link RequestModel}
 *
 * <p>GetOrderUsageRequest</p>
 */
public class GetOrderUsageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licenseKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelService")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1, minimum = 1)
    private Integer resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private Integer timeRange;

    private GetOrderUsageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.licenseKey = builder.licenseKey;
        this.relService = builder.relService;
        this.resourceType = builder.resourceType;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return licenseKey
     */
    public String getLicenseKey() {
        return this.licenseKey;
    }

    /**
     * @return relService
     */
    public String getRelService() {
        return this.relService;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    /**
     * @return timeRange
     */
    public Integer getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<GetOrderUsageRequest, Builder> {
        private String regionId; 
        private String licenseKey; 
        private String relService; 
        private Integer resourceType; 
        private Integer timeRange; 

        private Builder() {
            super();
        } 

        private Builder(GetOrderUsageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.licenseKey = request.licenseKey;
            this.relService = request.relService;
            this.resourceType = request.resourceType;
            this.timeRange = request.timeRange;
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
         * LicenseKey.
         */
        public Builder licenseKey(String licenseKey) {
            this.putQueryParameter("LicenseKey", licenseKey);
            this.licenseKey = licenseKey;
            return this;
        }

        /**
         * RelService.
         */
        public Builder relService(String relService) {
            this.putQueryParameter("RelService", relService);
            this.relService = relService;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TimeRange.
         */
        public Builder timeRange(Integer timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public GetOrderUsageRequest build() {
            return new GetOrderUsageRequest(this);
        } 

    } 

}
