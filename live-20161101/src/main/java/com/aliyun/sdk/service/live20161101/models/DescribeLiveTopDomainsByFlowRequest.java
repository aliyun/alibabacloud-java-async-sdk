// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveTopDomainsByFlowRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveTopDomainsByFlowRequest</p>
 */
public class DescribeLiveTopDomainsByFlowRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Limit")
    @Validation(maximum = 100, minimum = 1)
    private Long limit;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeLiveTopDomainsByFlowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveTopDomainsByFlowRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeLiveTopDomainsByFlowRequest, Builder> {
        private String regionId; 
        private String endTime; 
        private Long limit; 
        private Long ownerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveTopDomainsByFlowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.limit = request.limit;
            this.ownerId = request.ownerId;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeLiveTopDomainsByFlowRequest build() {
            return new DescribeLiveTopDomainsByFlowRequest(this);
        } 

    } 

}
