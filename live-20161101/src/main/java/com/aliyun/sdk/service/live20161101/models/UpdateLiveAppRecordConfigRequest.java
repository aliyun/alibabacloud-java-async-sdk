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
 * {@link UpdateLiveAppRecordConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveAppRecordConfigRequest</p>
 */
public class UpdateLiveAppRecordConfigRequest extends Request {
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

    private UpdateLiveAppRecordConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.delayTime = builder.delayTime;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.onDemand = builder.onDemand;
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

    public static UpdateLiveAppRecordConfigRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateLiveAppRecordConfigRequest, Builder> {
        private String appName; 
        private Integer delayTime; 
        private String domainName; 
        private String endTime; 
        private Integer onDemand; 
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

        private Builder(UpdateLiveAppRecordConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.delayTime = request.delayTime;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.onDemand = request.onDemand;
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
         * <p>The name of the application to which the live stream belongs.</p>
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
         * <p>The interruption duration for merge. If the stream interruption duration exceeds the specified duration, a new recording is generated. The value of this parameter ranges from 15 to 21600 seconds.</p>
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
         * <p>The recording end time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The time range that is specified by the EndTime and StartTime parameters must be less than or equal to seven days. If the value exceeds seven days, ApsaraVideo Live considers seven days as the time range. This parameter takes effect only for the live stream specified by the StreamName parameter. If the StreamName parameter is not specified, this parameter does not take effect.</p>
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
         * <p>The endpoint of the Object Storage Service (OSS) bucket.</p>
         * <p>To store live stream recordings in OSS, you need to create an OSS bucket in advance. For more information, see <a href="https://help.aliyun.com/document_detail/84932.html">Configure OSS</a>.</p>
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
         * <p>The recording start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The start time must be within seven days after the stream ingest starts. This parameter takes effect only for the live stream specified by the StreamName parameter. If the StreamName parameter is not specified, this parameter does not take effect.</p>
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
         * <p>The name of the live stream.</p>
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
         * <p>The transcoding template group details.</p>
         */
        public Builder transcodeTemplates(java.util.List<String> transcodeTemplates) {
            this.putQueryParameter("TranscodeTemplates", transcodeTemplates);
            this.transcodeTemplates = transcodeTemplates;
            return this;
        }

        @Override
        public UpdateLiveAppRecordConfigRequest build() {
            return new UpdateLiveAppRecordConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLiveAppRecordConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateLiveAppRecordConfigRequest</p>
     */
    public static class RecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        private RecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.sliceDuration = builder.sliceDuration;
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
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private Integer sliceDuration; 

            private Builder() {
            } 

            private Builder(RecordFormat model) {
                this.cycleDuration = model.cycleDuration;
                this.format = model.format;
                this.sliceDuration = model.sliceDuration;
            } 

            /**
             * <p>The recording cycle. Unit: seconds If you do not specify this parameter, the default value 6 hours is used.</p>
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
             * <p>The recording format. Supported formats include M3U8, Flash Video (FLV), MP4, and Common Media Application Format (CMAF). Valid values:</p>
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
             * <p>The duration of a single segment. Unit: seconds</p>
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

            public RecordFormat build() {
                return new RecordFormat(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateLiveAppRecordConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateLiveAppRecordConfigRequest</p>
     */
    public static class TranscodeRecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        private TranscodeRecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.sliceDuration = builder.sliceDuration;
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
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private Integer sliceDuration; 

            private Builder() {
            } 

            private Builder(TranscodeRecordFormat model) {
                this.cycleDuration = model.cycleDuration;
                this.format = model.format;
                this.sliceDuration = model.sliceDuration;
            } 

            /**
             * <p>The transcoded stream recording cycle. Unit: seconds If you do not specify this parameter, the default value 6 hours is used.</p>
             * 
             * <strong>example:</strong>
             * <p>21600</p>
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * <p>The format of the transcoded stream recording. Supported formats include M3U8, FLV, MP4, and CMAF. Valid values:</p>
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
             * <p>The duration of a single segment in the transcoded stream recording. Unit: seconds.</p>
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

            public TranscodeRecordFormat build() {
                return new TranscodeRecordFormat(this);
            } 

        } 

    }
}
