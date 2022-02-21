// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainViewTopCostTimeRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainViewTopCostTimeRequest</p>
 */
public class DescribeDomainViewTopCostTimeRequest extends Request {
    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Top")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer top;

    private DescribeDomainViewTopCostTimeRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.startTime = builder.startTime;
        this.top = builder.top;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainViewTopCostTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return top
     */
    public Integer getTop() {
        return this.top;
    }

    public static final class Builder extends Request.Builder<DescribeDomainViewTopCostTimeRequest, Builder> {
        private String domain; 
        private Long endTime; 
        private String regionId; 
        private String resourceGroupId; 
        private Long startTime; 
        private Integer top; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainViewTopCostTimeRequest response) {
            super(response);
            this.domain = response.domain;
            this.endTime = response.endTime;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.startTime = response.startTime;
            this.top = response.top;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Top.
         */
        public Builder top(Integer top) {
            this.putQueryParameter("Top", top);
            this.top = top;
            return this;
        }

        @Override
        public DescribeDomainViewTopCostTimeRequest build() {
            return new DescribeDomainViewTopCostTimeRequest(this);
        } 

    } 

}
