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
 * {@link CreateLivePullToPushRequest} extends {@link RequestModel}
 *
 * <p>CreateLivePullToPushRequest</p>
 */
public class CreateLivePullToPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dstUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIndex")
    private Integer fileIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatNumber")
    private Integer repeatNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryCount")
    private Integer retryCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryInterval")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 60)
    private Integer retryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceProtocol")
    private String sourceProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceUrls")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> sourceUrls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateLivePullToPushRequest(Builder builder) {
        super(builder);
        this.callbackUrl = builder.callbackUrl;
        this.dstUrl = builder.dstUrl;
        this.endTime = builder.endTime;
        this.fileIndex = builder.fileIndex;
        this.offset = builder.offset;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.repeatNumber = builder.repeatNumber;
        this.retryCount = builder.retryCount;
        this.retryInterval = builder.retryInterval;
        this.sourceProtocol = builder.sourceProtocol;
        this.sourceType = builder.sourceType;
        this.sourceUrls = builder.sourceUrls;
        this.startTime = builder.startTime;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLivePullToPushRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return dstUrl
     */
    public String getDstUrl() {
        return this.dstUrl;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fileIndex
     */
    public Integer getFileIndex() {
        return this.fileIndex;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeatNumber
     */
    public Integer getRepeatNumber() {
        return this.repeatNumber;
    }

    /**
     * @return retryCount
     */
    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return sourceProtocol
     */
    public String getSourceProtocol() {
        return this.sourceProtocol;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return sourceUrls
     */
    public java.util.List<String> getSourceUrls() {
        return this.sourceUrls;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateLivePullToPushRequest, Builder> {
        private String callbackUrl; 
        private String dstUrl; 
        private String endTime; 
        private Integer fileIndex; 
        private Integer offset; 
        private Long ownerId; 
        private String region; 
        private String regionId; 
        private Integer repeatNumber; 
        private Integer retryCount; 
        private Integer retryInterval; 
        private String sourceProtocol; 
        private String sourceType; 
        private java.util.List<String> sourceUrls; 
        private String startTime; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateLivePullToPushRequest request) {
            super(request);
            this.callbackUrl = request.callbackUrl;
            this.dstUrl = request.dstUrl;
            this.endTime = request.endTime;
            this.fileIndex = request.fileIndex;
            this.offset = request.offset;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.regionId = request.regionId;
            this.repeatNumber = request.repeatNumber;
            this.retryCount = request.retryCount;
            this.retryInterval = request.retryInterval;
            this.sourceProtocol = request.sourceProtocol;
            this.sourceType = request.sourceType;
            this.sourceUrls = request.sourceUrls;
            this.startTime = request.startTime;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The HTTP callback URL. By default, this parameter is left empty.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The URL is used to receive callbacks related to the task.</p>
         * </li>
         * <li><p>The URL can be up to 2,000 characters in length.</p>
         * </li>
         * <li><p>If you do not specify this parameter, no callbacks are returned for events related to the task.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://callback*****.com">https://callback*****.com</a></p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The destination URL to which the stream is relayed.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The supported protocol for the URL is RTMP.</p>
         * </li>
         * <li><p>The URL can be up to 2,000 characters in length.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://pushtest.********.aliyunlive.com/pulltest493/pulltest-w434</p>
         */
        public Builder dstUrl(String dstUrl) {
            this.putQueryParameter("DstUrl", dstUrl);
            this.dstUrl = dstUrl;
            return this;
        }

        /**
         * <p>The end time of the task.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * </li>
         * <li><p>The time range specified by the StartTime and EndTime parameters cannot exceed seven days.</p>
         * </li>
         * <li><p>The end time must be later than the start time.</p>
         * </li>
         * <li><p>The end time must be later than the current time.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-27T14:30:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The file index, which specifies the sequence of the file where the playback starts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder fileIndex(Integer fileIndex) {
            this.putQueryParameter("FileIndex", fileIndex);
            this.fileIndex = fileIndex;
            return this;
        }

        /**
         * <p>The offset of the position where the system starts to read the video resource. Unit: seconds. Valid values: positive numbers.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter indicates an offset from the first frame of the first video resource in the list.</p>
         * </li>
         * <li><p>This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
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
         * <p>The region where the task is started. Valid values:</p>
         * <ul>
         * <li>ap-southeast-1: Singapore</li>
         * <li>ap-southeast-5: Indonesia (Jakarta)</li>
         * <li>cn-beijing: China (Beijing)</li>
         * <li>cn-shanghai: China (Shanghai)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * <p>The number of playbacks after the first playback is complete. Valid values:</p>
         * <ul>
         * <li>0 (default): specifies that the video list is played only once.</li>
         * <li>-1: specifies that the video list is played in loop mode.</li>
         * <li>Positive integer: specifies the number of times the video list repeats after the first playback is complete.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder repeatNumber(Integer repeatNumber) {
            this.putQueryParameter("RepeatNumber", repeatNumber);
            this.repeatNumber = repeatNumber;
            return this;
        }

        /**
         * <p>The number of retries allowed. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder retryCount(Integer retryCount) {
            this.putQueryParameter("RetryCount", retryCount);
            this.retryCount = retryCount;
            return this;
        }

        /**
         * <p>The retry interval. Unit: seconds. Valid values: [60,300]. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * <p>The protocol of the source stream.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>rtmp</li>
         * <li>rtsp</li>
         * <li>srt</li>
         * <li>http-flv</li>
         * <li>flv</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if you set the <strong>SourceType</strong> parameter to live, but does not take effect if you set the SourceType parameter to vod or url.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
        public Builder sourceProtocol(String sourceProtocol) {
            this.putQueryParameter("SourceProtocol", sourceProtocol);
            this.sourceProtocol = sourceProtocol;
            return this;
        }

        /**
         * <p>The type of the source stream. Valid values:</p>
         * <ul>
         * <li>live: a live stream</li>
         * <li>vod: a list of ApsaraVideo VOD resources</li>
         * <li>url: a list of video resources from a third party</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The source URLs.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If SourceType is set to live, you can specify only one streaming URL.</p>
         * </li>
         * <li><p>If SourceType is set to vod or url, you can specify up to 30 IDs or URLs.</p>
         * </li>
         * <li><p>If SourceType is set to live, the supported protocols for URLs are Real-Time Messaging Protocol (RTMP), Real-Time Streaming Protocol (RTSP), Secure Reliable Transport Protocol (SRT), and HTTP-FLV.</p>
         * </li>
         * <li><p>If SourceType is set to vod, specify the IDs of media assets from ApsaraVideo VOD.</p>
         * </li>
         * <li><p>If SourceType is set to url, the supported protocols for URLs are MP4 and HTTP-FLV.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testurls</p>
         */
        public Builder sourceUrls(java.util.List<String> sourceUrls) {
            String sourceUrlsShrink = shrink(sourceUrls, "SourceUrls", "json");
            this.putQueryParameter("SourceUrls", sourceUrlsShrink);
            this.sourceUrls = sourceUrls;
            return this;
        }

        /**
         * <p>The start time of the task.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * </li>
         * <li><p>The time range specified by the StartTime and EndTime parameters cannot exceed seven days.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-26T10:30:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the task. Default value: &quot;&quot;. Fuzzy search for task names is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateLivePullToPushRequest build() {
            return new CreateLivePullToPushRequest(this);
        } 

    } 

}
