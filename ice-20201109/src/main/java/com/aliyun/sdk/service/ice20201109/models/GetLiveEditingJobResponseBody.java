// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveEditingJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveEditingJobResponseBody</p>
 */
public class GetLiveEditingJobResponseBody extends TeaModel {
    @NameInMap("LiveEditingJob")
    private LiveEditingJob liveEditingJob;

    @NameInMap("RequestId")
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
         * LiveEditingJob.
         */
        public Builder liveEditingJob(LiveEditingJob liveEditingJob) {
            this.liveEditingJob = liveEditingJob;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLiveEditingJobResponseBody build() {
            return new GetLiveEditingJobResponseBody(this);
        } 

    } 

    public static class LiveStreamConfig extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("StreamName")
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
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * StreamName.
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
    public static class MediaProduceConfig extends TeaModel {
        @NameInMap("Mode")
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
             * Mode.
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
    public static class OutputMediaConfig extends TeaModel {
        @NameInMap("Bitrate")
        private Long bitrate;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("MediaURL")
        private String mediaURL;

        @NameInMap("StorageLocation")
        private String storageLocation;

        @NameInMap("VodTemplateGroupId")
        private String vodTemplateGroupId;

        @NameInMap("Width")
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
             * Bitrate.
             */
            public Builder bitrate(Long bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * MediaURL.
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * StorageLocation.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * VodTemplateGroupId.
             */
            public Builder vodTemplateGroupId(String vodTemplateGroupId) {
                this.vodTemplateGroupId = vodTemplateGroupId;
                return this;
            }

            /**
             * Width.
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
    public static class LiveEditingJob extends TeaModel {
        @NameInMap("Clips")
        private String clips;

        @NameInMap("Code")
        private String code;

        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("LiveStreamConfig")
        private LiveStreamConfig liveStreamConfig;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("MediaProduceConfig")
        private MediaProduceConfig mediaProduceConfig;

        @NameInMap("MediaURL")
        private String mediaURL;

        @NameInMap("Message")
        private String message;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OutputMediaConfig")
        private OutputMediaConfig outputMediaConfig;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserData")
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
             * Clips.
             */
            public Builder clips(String clips) {
                this.clips = clips;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * LiveStreamConfig.
             */
            public Builder liveStreamConfig(LiveStreamConfig liveStreamConfig) {
                this.liveStreamConfig = liveStreamConfig;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaProduceConfig.
             */
            public Builder mediaProduceConfig(MediaProduceConfig mediaProduceConfig) {
                this.mediaProduceConfig = mediaProduceConfig;
                return this;
            }

            /**
             * MediaURL.
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OutputMediaConfig.
             */
            public Builder outputMediaConfig(OutputMediaConfig outputMediaConfig) {
                this.outputMediaConfig = outputMediaConfig;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserData.
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
