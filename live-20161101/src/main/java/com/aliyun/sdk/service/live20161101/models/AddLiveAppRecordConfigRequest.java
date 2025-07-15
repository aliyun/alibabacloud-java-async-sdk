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
 * {@link AddLiveAppRecordConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLiveAppRecordConfigRequest</p>
 */
public class AddLiveAppRecordConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayTime")
    private Integer delayTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnDemand")
    private Integer onDemand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssEndpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordFormat")
    private java.util.List<RecordFormat> recordFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeRecordFormat")
    private java.util.List<TranscodeRecordFormat> transcodeRecordFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplates")
    private java.util.List<String> transcodeTemplates;

    private AddLiveAppRecordConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.delayTime = builder.delayTime;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.onDemand = builder.onDemand;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.ownerId = builder.ownerId;
        this.recordFormat = builder.recordFormat;
        this.securityToken = builder.securityToken;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
        this.transcodeRecordFormat = builder.transcodeRecordFormat;
        this.transcodeTemplates = builder.transcodeTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveAppRecordConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return delayTime
     */
    public Integer getDelayTime() {
        return this.delayTime;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return onDemand
     */
    public Integer getOnDemand() {
        return this.onDemand;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return recordFormat
     */
    public java.util.List<RecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return transcodeRecordFormat
     */
    public java.util.List<TranscodeRecordFormat> getTranscodeRecordFormat() {
        return this.transcodeRecordFormat;
    }

    /**
     * @return transcodeTemplates
     */
    public java.util.List<String> getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    public static final class Builder extends Request.Builder<AddLiveAppRecordConfigRequest, Builder> {
        private String appName; 
        private Integer delayTime; 
        private String domainName; 
        private String endTime; 
        private Integer onDemand; 
        private String ossBucket; 
        private String ossEndpoint; 
        private Long ownerId; 
        private java.util.List<RecordFormat> recordFormat; 
        private String securityToken; 
        private String startTime; 
        private String streamName; 
        private java.util.List<TranscodeRecordFormat> transcodeRecordFormat; 
        private java.util.List<String> transcodeTemplates; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveAppRecordConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.delayTime = request.delayTime;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.onDemand = request.onDemand;
            this.ossBucket = request.ossBucket;
            this.ossEndpoint = request.ossEndpoint;
            this.ownerId = request.ownerId;
            this.recordFormat = request.recordFormat;
            this.securityToken = request.securityToken;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
            this.transcodeRecordFormat = request.transcodeRecordFormat;
            this.transcodeTemplates = request.transcodeTemplates;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. The value of this parameter must be the same as the application name in the ingest URL. Otherwise, the configuration does not take effect. If you want to match all applications, specify an asterisk (*) as the value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Duration for stream concatenation. If the live streaming interruption exceeds the set concatenation duration, a new file will be generated. The concatenation duration can be set between 15 to 21600 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder delayTime(Integer delayTime) {
            this.putQueryParameter("DelayTime", delayTime);
            this.delayTime = delayTime;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Recording end time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
         * <blockquote>
         * <p>The difference between EndTime and StartTime should not exceed 7 days; if it does, it will be calculated as 7 days. This is only valid for stream-level recording (when StreamName is not empty).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2018-04-16T09:57:21Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable on-demand recording. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables on-demand recording.</li>
         * <li><strong>1</strong>: enables on-demand recording by using the HTTP callback method.</li>
         * <li><strong>2</strong>: enables on-demand recording by parsing the stream ingest parameters.</li>
         * <li><strong>7</strong>: By default, ApsaraVideo Live does not automatically record live streams. You can call the <a href="https://help.aliyun.com/document_detail/2847882.html">RealTimeRecordCommand</a> operation to manually start or stop recording.</li>
         * </ul>
         * <blockquote>
         * <p> If you set the OnDemand parameter to <strong>1</strong>, you need to call the <a href="https://help.aliyun.com/document_detail/2847891.html">AddLiveRecordNotifyConfig</a> operation to configure the OnDemandUrl parameter. Otherwise, ApsaraVideo Live does not perform on-demand recording.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder onDemand(Integer onDemand) {
            this.putQueryParameter("OnDemand", onDemand);
            this.onDemand = onDemand;
            return this;
        }

        /**
         * <p>The name of the OSS bucket where live streaming recording files are stored. To store recorded files in OSS, you need to create an OSS bucket in advance. For creation method, please refer to <a href="https://help.aliyun.com/document_detail/84932.html">Configure OSS</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveBucket****</p>
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * <p>The endpoint of the OSS bucket. 
         * To store live stream recordings in OSS, you need to create an OSS bucket in advance. For more information, see Configure OSS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>learn.developer.aliyundoc.com</p>
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
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
         * <p>The recording details.</p>
         */
        public Builder recordFormat(java.util.List<RecordFormat> recordFormat) {
            this.putQueryParameter("RecordFormat", recordFormat);
            this.recordFormat = recordFormat;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>Start time of the recording. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
         * <blockquote>
         * <p>The set time must be within 7 days of the actual streaming start time, and is only valid for stream-level recording (when StreamName is not empty).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2018-04-10T09:57:21Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Stream broadcast name.</p>
         * 
         * <strong>example:</strong>
         * <p>teststream</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * <p>The transcoded stream recording details.</p>
         */
        public Builder transcodeRecordFormat(java.util.List<TranscodeRecordFormat> transcodeRecordFormat) {
            this.putQueryParameter("TranscodeRecordFormat", transcodeRecordFormat);
            this.transcodeRecordFormat = transcodeRecordFormat;
            return this;
        }

        /**
         * <p>Transcoding stream recording template group.</p>
         * 
         * <strong>example:</strong>
         * <p>sd</p>
         */
        public Builder transcodeTemplates(java.util.List<String> transcodeTemplates) {
            this.putQueryParameter("TranscodeTemplates", transcodeTemplates);
            this.transcodeTemplates = transcodeTemplates;
            return this;
        }

        @Override
        public AddLiveAppRecordConfigRequest build() {
            return new AddLiveAppRecordConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddLiveAppRecordConfigRequest} extends {@link TeaModel}
     *
     * <p>AddLiveAppRecordConfigRequest</p>
     */
    public static class RecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        @com.aliyun.core.annotation.NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private RecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormat create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private Integer sliceDuration; 
            private String sliceOssObjectPrefix; 

            private Builder() {
            } 

            private Builder(RecordFormat model) {
                this.cycleDuration = model.cycleDuration;
                this.format = model.format;
                this.ossObjectPrefix = model.ossObjectPrefix;
                this.sliceDuration = model.sliceDuration;
                this.sliceOssObjectPrefix = model.sliceOssObjectPrefix;
            } 

            /**
             * <p>The recording cycle. Unit: seconds. If you do not specify this parameter, the default value 6 hours is used.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If a live stream is interrupted during a recording cycle but is resumed within the interruption duration threshold, the stream is recorded in the same recording before and after the interruption.</p>
             * </li>
             * <li><p>If a live stream is interrupted for longer than the interruption duration threshold, a new recording is generated.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * <p>The recording format. Supported formats include M3U8, FLV, MP4, and CMAF. Valid values:</p>
             * <blockquote>
             * <p> You need to specify at lease one of the RecordFormat and TranscodeRecordFormat parameters. If you set this parameter to m3u8 or cmaf, you must also specify the RecordFormat.N.SliceOssObjectPrefix and RecordFormat.N.SliceDuration parameters.</p>
             * </blockquote>
             * <ul>
             * <li>m3u8</li>
             * <li>flv</li>
             * <li>mp4</li>
             * <li>cmaf</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>m3u8</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The naming format of a recording to store in OSS.</p>
             * <ul>
             * <li>The name must be less than 256 bytes in length and can contain the {AppName}, {StreamName}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime} variables.</li>
             * <li>The name must contain the {StartTime} and {EndTime} variables or the {EscapedStartTime} and {EscapedEndTime} variables.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>record/{AppName}/{StreamName}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * <p>The duration of a single segment. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter takes effect only if you set the RecordFormat.N.Format parameter to m3u8 or cmaf.</p>
             * </blockquote>
             * <p>If you do not specify this parameter, the default value 30 seconds is used. Valid values: 5 to 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * <p>The naming format of a segment.</p>
             * <blockquote>
             * <p> This parameter is required only if you set the RecordFormat.N.Format parameter to m3u8 or cmaf.</p>
             * </blockquote>
             * <ul>
             * <li>By default, the duration of a segment is 30 seconds. The segment name must be less than 256 bytes in length and can contain the {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence} variables.</li>
             * <li>The segment name must contain the {UnixTimestamp} and {Sequence} variables.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>record/{AppName}/{StreamName}/{UnixTimestamp}_{Sequence}</p>
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public RecordFormat build() {
                return new RecordFormat(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddLiveAppRecordConfigRequest} extends {@link TeaModel}
     *
     * <p>AddLiveAppRecordConfigRequest</p>
     */
    public static class TranscodeRecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        @com.aliyun.core.annotation.NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private TranscodeRecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeRecordFormat create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private Integer sliceDuration; 
            private String sliceOssObjectPrefix; 

            private Builder() {
            } 

            private Builder(TranscodeRecordFormat model) {
                this.cycleDuration = model.cycleDuration;
                this.format = model.format;
                this.ossObjectPrefix = model.ossObjectPrefix;
                this.sliceDuration = model.sliceDuration;
                this.sliceOssObjectPrefix = model.sliceOssObjectPrefix;
            } 

            /**
             * <p>The transcoded stream recording cycle. Unit: seconds. If you do not specify this parameter, the default value 6 hours is used.</p>
             * 
             * <strong>example:</strong>
             * <p>21600</p>
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * <p>The transcoded stream recording format. Supported formats include M3U8, FLV, MP4, and CMAF. Valid values:</p>
             * <blockquote>
             * <p> If you set this parameter to m3u8 or cmaf, you must also specify the TranscodeRecordFormat.N.SliceOssObjectPrefix and TranscodeRecordFormat.N.SliceDuration parameters.</p>
             * </blockquote>
             * <ul>
             * <li>m3u8</li>
             * <li>flv</li>
             * <li>mp4</li>
             * <li>cmaf</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>m3u8</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The naming format of a transcoded stream recording to store in OSS.</p>
             * <ul>
             * <li>The name must be less than 256 bytes in length and can contain the {AppName}, {StreamName}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime} variables.</li>
             * <li>The name must contain the {StartTime} and {EndTime} variables or the {EscapedStartTime} and {EscapedEndTime} variables.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>record/{AppName}/{StreamName}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * <p>The duration of a single segment in a transcoded stream recording. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter takes effect only if you set the TranscodeRecordFormat.N.Format parameter to m3u8 or cmaf.</p>
             * </blockquote>
             * <p>If you do not specify this parameter, the default value 30 seconds is used. Valid values: 5 to 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * <p>The naming format of a segment in a transcoded stream recording.</p>
             * <blockquote>
             * <p> This parameter is required only if you set the TranscodeRecordFormat.N.Format parameter to m3u8 or cmaf.</p>
             * </blockquote>
             * <ul>
             * <li>By default, the duration of a segment is 30 seconds. The segment name must be less than 256 bytes in length and can contain the {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence} variables.</li>
             * <li>The segment name must contain the {UnixTimestamp} and {Sequence} variables.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>record/{AppName}/{StreamName}/{UnixTimestamp}_{Sequence}</p>
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public TranscodeRecordFormat build() {
                return new TranscodeRecordFormat(this);
            } 

        } 

    }
}
