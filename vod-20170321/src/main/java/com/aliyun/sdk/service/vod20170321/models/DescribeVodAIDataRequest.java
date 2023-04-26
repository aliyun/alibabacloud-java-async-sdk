// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodAIDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodAIDataRequest</p>
 */
public class DescribeVodAIDataRequest extends Request {
    @Query
    @NameInMap("AIType")
    private String AIType;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeVodAIDataRequest(Builder builder) {
        super(builder);
        this.AIType = builder.AIType;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodAIDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIType
     */
    public String getAIType() {
        return this.AIType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeVodAIDataRequest, Builder> {
        private String AIType; 
        private String endTime; 
        private Long ownerId; 
        private String region; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodAIDataRequest request) {
            super(request);
            this.AIType = request.AIType;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.startTime = request.startTime;
        } 

        /**
         * The type of video AI. If you leave this parameter empty, statistics on video AI of all types are returned. Separate multiple types with commas (,). Valid values:
         * <p>
         * 
         * *   **AIVideoCensor**: automated review
         * *   **AIVideoFPShot**: media fingerprinting
         * *   **AIVideoTag**: smart tagging
         */
        public Builder AIType(String AIType) {
            this.putQueryParameter("AIType", AIType);
            this.AIType = AIType;
            return this;
        }

        /**
         * The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * The region in which you want to query data. If you leave this parameter empty, data in all regions is returned. Separate multiple regions with commas (,). Valid values:
         * <p>
         * 
         * *   **cn-shanghai**: China (Shanghai)
         * *   **cn-beijing**: China (Beijing)
         * *   **eu-central-1**: Germany (Frankfurt)
         * *   **ap-southeast-1**: Singapore
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeVodAIDataRequest build() {
            return new DescribeVodAIDataRequest(this);
        } 

    } 

}
