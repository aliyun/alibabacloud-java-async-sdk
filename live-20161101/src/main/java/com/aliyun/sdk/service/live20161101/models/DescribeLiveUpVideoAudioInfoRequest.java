// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLiveUpVideoAudioInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveUpVideoAudioInfoRequest</p>
 */
public class DescribeLiveUpVideoAudioInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stream;

    private DescribeLiveUpVideoAudioInfoRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveUpVideoAudioInfoRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<DescribeLiveUpVideoAudioInfoRequest, Builder> {
        private String endTime; 
        private Long ownerId; 
        private String regionId; 
        private String startTime; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveUpVideoAudioInfoRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.stream = request.stream;
        } 

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T15:10:00Z</p>
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the stream that you want to query. Specify this parameter in the following format: <code>rtmp://Ingest domain/Application name/Stream name</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T15:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The operation that you want to perform. Set the value to <strong>DescribeLiveUpVideoAudioInfo</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/AppName/StreamName</p>
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public DescribeLiveUpVideoAudioInfoRequest build() {
            return new DescribeLiveUpVideoAudioInfoRequest(this);
        } 

    } 

}
