// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodTranscodeDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodTranscodeDataRequest</p>
 */
public class DescribeVodTranscodeDataRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Specification")
    private String specification;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Storage")
    private String storage;

    private DescribeVodTranscodeDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.specification = builder.specification;
        this.startTime = builder.startTime;
        this.storage = builder.storage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodTranscodeDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
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
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return storage
     */
    public String getStorage() {
        return this.storage;
    }

    public static final class Builder extends Request.Builder<DescribeVodTranscodeDataRequest, Builder> {
        private String endTime; 
        private String interval; 
        private Long ownerId; 
        private String region; 
        private String specification; 
        private String startTime; 
        private String storage; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodTranscodeDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.specification = request.specification;
            this.startTime = request.startTime;
            this.storage = request.storage;
        } 

        /**
         * The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The interval at which you want to query data. Valid values:
         * <p>
         * 
         * *   **day**: days
         * *   **hour**: hours
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
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
         * The transcoding specification. If you leave this parameter empty, data of all transcoding specifications is returned. Separate multiple transcoding specifications with commas (,). Valid values:
         * <p>
         * 
         * *   **Audio**: audio transcoding
         * *   **Segmentation**: container format conversion
         * *   **H264.LD**, **H264.SD**, **H264.HD**, **H264.2K**, **H264.4K**, and more
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The name of the Object Storage Service (OSS) bucket. If you leave this parameter empty, data of all buckets is returned. Separate multiple bucket names with commas (,).
         */
        public Builder storage(String storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        @Override
        public DescribeVodTranscodeDataRequest build() {
            return new DescribeVodTranscodeDataRequest(this);
        } 

    } 

}
