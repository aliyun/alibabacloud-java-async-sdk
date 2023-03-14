// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDoSTrafficRequest} extends {@link RequestModel}
 *
 * <p>DescribeDDoSTrafficRequest</p>
 */
public class DescribeDDoSTrafficRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Eip")
    @Validation(required = true)
    private String eip;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Interval")
    @Validation(required = true)
    private Integer interval;

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

    private DescribeDDoSTrafficRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.eip = builder.eip;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSTrafficRequest create() {
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
     * @return eip
     */
    public String getEip() {
        return this.eip;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
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

    public static final class Builder extends Request.Builder<DescribeDDoSTrafficRequest, Builder> {
        private String regionId; 
        private String eip; 
        private Long endTime; 
        private Integer interval; 
        private String resourceGroupId; 
        private String sourceIp; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDDoSTrafficRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.eip = request.eip;
            this.endTime = request.endTime;
            this.interval = request.interval;
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
         * Eip.
         */
        public Builder eip(String eip) {
            this.putQueryParameter("Eip", eip);
            this.eip = eip;
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
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
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
        public DescribeDDoSTrafficRequest build() {
            return new DescribeDDoSTrafficRequest(this);
        } 

    } 

}
