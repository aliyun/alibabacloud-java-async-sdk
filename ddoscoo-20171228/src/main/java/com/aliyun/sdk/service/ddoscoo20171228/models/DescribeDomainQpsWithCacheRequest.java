// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainQpsWithCacheRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainQpsWithCacheRequest</p>
 */
public class DescribeDomainQpsWithCacheRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private DescribeDomainQpsWithCacheRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainQpsWithCacheRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDomainQpsWithCacheRequest, Builder> {
        private String regionId; 
        private String domain; 
        private Long endTime; 
        private String resourceGroupId; 
        private String sourceIp; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainQpsWithCacheRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
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

        @Override
        public DescribeDomainQpsWithCacheRequest build() {
            return new DescribeDomainQpsWithCacheRequest(this);
        } 

    } 

}
