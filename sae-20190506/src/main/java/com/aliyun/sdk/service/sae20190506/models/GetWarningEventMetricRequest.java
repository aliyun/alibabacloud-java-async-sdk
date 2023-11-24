// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWarningEventMetricRequest} extends {@link RequestModel}
 *
 * <p>GetWarningEventMetricRequest</p>
 */
public class GetWarningEventMetricRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Limit")
    @Validation(required = true)
    private Long limit;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private GetWarningEventMetricRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWarningEventMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetWarningEventMetricRequest, Builder> {
        private Long endTime; 
        private Long limit; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetWarningEventMetricRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.limit = request.limit;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
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
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public GetWarningEventMetricRequest build() {
            return new GetWarningEventMetricRequest(this);
        } 

    } 

}
