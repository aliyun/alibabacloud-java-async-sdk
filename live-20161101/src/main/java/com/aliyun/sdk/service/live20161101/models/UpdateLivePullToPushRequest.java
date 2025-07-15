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
 * {@link UpdateLivePullToPushRequest} extends {@link RequestModel}
 *
 * <p>UpdateLivePullToPushRequest</p>
 */
public class UpdateLivePullToPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
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
    @com.aliyun.core.annotation.NameInMap("SourceUrls")
    private java.util.List<String> sourceUrls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private UpdateLivePullToPushRequest(Builder builder) {
        super(builder);
        this.callbackUrl = builder.callbackUrl;
        this.endTime = builder.endTime;
        this.fileIndex = builder.fileIndex;
        this.offset = builder.offset;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.repeatNumber = builder.repeatNumber;
        this.sourceUrls = builder.sourceUrls;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLivePullToPushRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateLivePullToPushRequest, Builder> {
        private String callbackUrl; 
        private String endTime; 
        private Integer fileIndex; 
        private Integer offset; 
        private Long ownerId; 
        private String region; 
        private String regionId; 
        private Integer repeatNumber; 
        private java.util.List<String> sourceUrls; 
        private String startTime; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLivePullToPushRequest request) {
            super(request);
            this.callbackUrl = request.callbackUrl;
            this.endTime = request.endTime;
            this.fileIndex = request.fileIndex;
            this.offset = request.offset;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.regionId = request.regionId;
            this.repeatNumber = request.repeatNumber;
            this.sourceUrls = request.sourceUrls;
            this.startTime = request.startTime;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The callback URL. By default, this parameter is left empty.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The URL is used to receive callbacks related to the task.</p>
         * </li>
         * <li><p>The URL can be up to 2,000 characters in length.</p>
         * </li>
         * <li><p>If you do not specify this parameter, no callbacks are returned for events related to the task.</p>
         * </li>
         * <li><p>The update takes effect for subsequent events that occur.</p>
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
         * <li><p>If the task has ended, the update does not take effect.</p>
         * </li>
         * </ul>
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
         * <p>The file index. Default value: 0.</p>
         * <blockquote>
         * <p> You can modify this parameter only if the task is stopped. The update takes effect after you restart the task.</p>
         * </blockquote>
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
         * <li><p>This parameter indicates an offset from the first frame.</p>
         * </li>
         * <li><p>This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
         * </li>
         * <li><p>The update takes effect only for the first video in a video list.</p>
         * </li>
         * <li><p>You can modify this parameter only if the task is stopped. The update takes effect immediately.</p>
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
         * </blockquote>
         * <ul>
         * <li><p>This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
         * </li>
         * <li><p>The update can take effect immediately.</p>
         * </li>
         * </ul>
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
         * <li><p>If the source is a live stream, the update takes effect immediately. If the source is a list of video resources from ApsaraVideo VOD or a third party, the update does not take effect until the playback of the current video ends. After the update takes effect, the video list starts to play from the beginning.</p>
         * </li>
         * <li><p>You can modify this parameter only if the task is stopped. The update takes effect immediately.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>changedtesturl</p>
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
         * <li><p>If the task has already started, the update does not take effect.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2024-08-23T15:30:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fd245384-4067-4f91-9d75-9666a6bc****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateLivePullToPushRequest build() {
            return new UpdateLivePullToPushRequest(this);
        } 

    } 

}
