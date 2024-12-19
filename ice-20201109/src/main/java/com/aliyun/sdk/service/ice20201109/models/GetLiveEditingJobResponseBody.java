// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetLiveEditingJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveEditingJobResponseBody</p>
 */
public class GetLiveEditingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveEditingJob")
    private LiveEditingJob liveEditingJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLiveEditingJobResponseBody(Builder builder) {
        this.liveEditingJob = builder.liveEditingJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveEditingJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveEditingJob
     */
    public LiveEditingJob getLiveEditingJob() {
        return this.liveEditingJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveEditingJob liveEditingJob; 
        private String requestId; 

        /**
         * <p>The information about the live editing job.</p>
         */
        public Builder liveEditingJob(LiveEditingJob liveEditingJob) {
            this.liveEditingJob = liveEditingJob;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLiveEditingJobResponseBody build() {
            return new GetLiveEditingJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLiveEditingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveEditingJobResponseBody</p>
     */
    public static class LiveStreamConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private LiveStreamConfig(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamConfig create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private String streamName; 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The domain name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>domain.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>streamName</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public LiveStreamConfig build() {
                return new LiveStreamConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLiveEditingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveEditingJobResponseBody</p>
     */
    public static class MediaProduceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private MediaProduceConfig(Builder builder) {
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaProduceConfig create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private String mode; 

            /**
             * <p>The editing mode. Default value: Accurate.</p>
             * 
             * <strong>example:</strong>
             * <p>Accurate</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public MediaProduceConfig build() {
                return new MediaProduceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLiveEditingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveEditingJobResponseBody</p>
     */
    public static class OutputMediaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private Long bitrate;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("MediaURL")
        private String mediaURL;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("VodTemplateGroupId")
        private String vodTemplateGroupId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private OutputMediaConfig(Builder builder) {
            this.bitrate = builder.bitrate;
            this.fileName = builder.fileName;
            this.height = builder.height;
            this.mediaURL = builder.mediaURL;
            this.storageLocation = builder.storageLocation;
            this.vodTemplateGroupId = builder.vodTemplateGroupId;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputMediaConfig create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public Long getBitrate() {
            return this.bitrate;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return mediaURL
         */
        public String getMediaURL() {
            return this.mediaURL;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return vodTemplateGroupId
         */
        public String getVodTemplateGroupId() {
            return this.vodTemplateGroupId;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Long bitrate; 
            private String fileName; 
            private Integer height; 
            private String mediaURL; 
            private String storageLocation; 
            private String vodTemplateGroupId; 
            private Integer width; 

            /**
             * <p>The bitrate of the output file. Unit: Kbit/s. You can leave this parameter empty. The default value is the maximum bitrate of the input materials.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bitrate(Long bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>If OutputMediaTarget is set to vod-media, this parameter indicates the file name of the output file. The value contains the file name extension but not the path.</p>
             * 
             * <strong>example:</strong>
             * <p>test.mp4</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The height of the output file. You can leave this parameter empty. The default value is the maximum height of the input materials.</p>
             * 
             * <strong>example:</strong>
             * <p>480</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The URL of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://testice-testbucket.oss-cn-shanghai.aliyuncs.com/test.mp4">https://testice-testbucket.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * <p>If OutputMediaTarget is set to vod-media, this parameter indicates the storage location of the media asset in ApsaraVideo VOD. The storage location is the path of the file in ApsaraVideo VOD, excluding the prefix http://. Example: outin-xxxxxx.oss-cn-shanghai.aliyuncs.com.</p>
             * 
             * <strong>example:</strong>
             * <p>outin-xxxxxx.oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The ID of the VOD transcoding template group. If VOD transcoding is not required, set the value to VOD_NO_TRANSCODE.</p>
             * 
             * <strong>example:</strong>
             * <p>VOD_NO_TRANSCODE</p>
             */
            public Builder vodTemplateGroupId(String vodTemplateGroupId) {
                this.vodTemplateGroupId = vodTemplateGroupId;
                return this;
            }

            /**
             * <p>The width of the output file. You can leave this parameter empty. The default value is the maximum width of the input materials.</p>
             * 
             * <strong>example:</strong>
             * <p>640</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public OutputMediaConfig build() {
                return new OutputMediaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLiveEditingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveEditingJobResponseBody</p>
     */
    public static class LiveEditingJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clips")
        private String clips;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("LiveStreamConfig")
        private LiveStreamConfig liveStreamConfig;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaProduceConfig")
        private MediaProduceConfig mediaProduceConfig;

        @com.aliyun.core.annotation.NameInMap("MediaURL")
        private String mediaURL;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OutputMediaConfig")
        private OutputMediaConfig outputMediaConfig;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private LiveEditingJob(Builder builder) {
            this.clips = builder.clips;
            this.code = builder.code;
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.jobId = builder.jobId;
            this.liveStreamConfig = builder.liveStreamConfig;
            this.mediaId = builder.mediaId;
            this.mediaProduceConfig = builder.mediaProduceConfig;
            this.mediaURL = builder.mediaURL;
            this.message = builder.message;
            this.modifiedTime = builder.modifiedTime;
            this.outputMediaConfig = builder.outputMediaConfig;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveEditingJob create() {
            return builder().build();
        }

        /**
         * @return clips
         */
        public String getClips() {
            return this.clips;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return liveStreamConfig
         */
        public LiveStreamConfig getLiveStreamConfig() {
            return this.liveStreamConfig;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaProduceConfig
         */
        public MediaProduceConfig getMediaProduceConfig() {
            return this.mediaProduceConfig;
        }

        /**
         * @return mediaURL
         */
        public String getMediaURL() {
            return this.mediaURL;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return outputMediaConfig
         */
        public OutputMediaConfig getOutputMediaConfig() {
            return this.outputMediaConfig;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String clips; 
            private String code; 
            private String completeTime; 
            private String creationTime; 
            private String jobId; 
            private LiveStreamConfig liveStreamConfig; 
            private String mediaId; 
            private MediaProduceConfig mediaProduceConfig; 
            private String mediaURL; 
            private String message; 
            private String modifiedTime; 
            private OutputMediaConfig outputMediaConfig; 
            private String projectId; 
            private String status; 
            private String userData; 

            /**
             * <p>The clips.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;StartTime&quot;: &quot; 2021-06-21T08:01:00Z&quot;,  &quot;EndTime&quot;: &quot; 2021-06-21T08:03:00Z&quot; }]</p>
             */
            public Builder clips(String clips) {
                this.clips = clips;
                return this;
            }

            /**
             * <p>The response code. Note: Pay attention to this parameter if the job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the live editing job was completed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:52Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the live editing job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:40Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the live editing job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The live editing configurations.</p>
             */
            public Builder liveStreamConfig(LiveStreamConfig liveStreamConfig) {
                this.liveStreamConfig = liveStreamConfig;
                return this;
            }

            /**
             * <p>The media asset ID of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>0cc6ba49eab379332c5b</strong></strong></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The production configurations.</p>
             */
            public Builder mediaProduceConfig(MediaProduceConfig mediaProduceConfig) {
                this.mediaProduceConfig = mediaProduceConfig;
                return this;
            }

            /**
             * <p>The URL of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4</a></p>
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * <p>The returned message. Note: Pay attention to this parameter if the job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The specific parameter LiveStreamConfig is not valid.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The time when the live editing job was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:49Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The storage configurations of the output file.</p>
             */
            public Builder outputMediaConfig(OutputMediaConfig outputMediaConfig) {
                this.outputMediaConfig = outputMediaConfig;
                return this;
            }

            /**
             * <p>The ID of the live editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The state of the live editing job. Valid values: Init, Queuing, Processing, Success, and Failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user-defined data.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key&quot;: &quot;value&quot;}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public LiveEditingJob build() {
                return new LiveEditingJob(this);
            } 

        } 

    }
}
