// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayVideoStatisRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayVideoStatisRequest</p>
 */
public class DescribePlayVideoStatisRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private DescribePlayVideoStatisRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayVideoStatisRequest create() {
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

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<DescribePlayVideoStatisRequest, Builder> {
        private String endTime; 
        private Long ownerId; 
        private String startTime; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayVideoStatisRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
            this.videoId = request.videoId;
        } 

        /**
         * The number of video views.
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
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The date when the statistics were generated. The date follows the *yyyy-MM-dd* format.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public DescribePlayVideoStatisRequest build() {
            return new DescribePlayVideoStatisRequest(this);
        } 

    } 

}
