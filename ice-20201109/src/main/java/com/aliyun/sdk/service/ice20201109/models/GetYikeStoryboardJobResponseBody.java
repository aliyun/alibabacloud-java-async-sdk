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
 * {@link GetYikeStoryboardJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikeStoryboardJobResponseBody</p>
 */
public class GetYikeStoryboardJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobParams")
    private JobParams jobParams;

    @com.aliyun.core.annotation.NameInMap("JobResult")
    private JobResult jobResult;

    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetYikeStoryboardJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.jobParams = builder.jobParams;
        this.jobResult = builder.jobResult;
        this.jobStatus = builder.jobStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeStoryboardJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobParams
     */
    public JobParams getJobParams() {
        return this.jobParams;
    }

    /**
     * @return jobResult
     */
    public JobResult getJobResult() {
        return this.jobResult;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobId; 
        private JobParams jobParams; 
        private JobResult jobResult; 
        private String jobStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetYikeStoryboardJobResponseBody model) {
            this.jobId = model.jobId;
            this.jobParams = model.jobParams;
            this.jobResult = model.jobResult;
            this.jobStatus = model.jobStatus;
            this.requestId = model.requestId;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * JobParams.
         */
        public Builder jobParams(JobParams jobParams) {
            this.jobParams = jobParams;
            return this;
        }

        /**
         * JobResult.
         */
        public Builder jobResult(JobResult jobResult) {
            this.jobResult = jobResult;
            return this;
        }

        /**
         * JobStatus.
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetYikeStoryboardJobResponseBody build() {
            return new GetYikeStoryboardJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetYikeStoryboardJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeStoryboardJobResponseBody</p>
     */
    public static class JobParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AspectRatio")
        private String aspectRatio;

        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("ModelParams")
        private String modelParams;

        @com.aliyun.core.annotation.NameInMap("NarrationVoiceId")
        private String narrationVoiceId;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("ShotPromptMode")
        private String shotPromptMode;

        @com.aliyun.core.annotation.NameInMap("ShotSplitMode")
        private String shotSplitMode;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StyleId")
        private String styleId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("VideoModel")
        private String videoModel;

        private JobParams(Builder builder) {
            this.aspectRatio = builder.aspectRatio;
            this.fileURL = builder.fileURL;
            this.modelParams = builder.modelParams;
            this.narrationVoiceId = builder.narrationVoiceId;
            this.resolution = builder.resolution;
            this.shotPromptMode = builder.shotPromptMode;
            this.shotSplitMode = builder.shotSplitMode;
            this.sourceType = builder.sourceType;
            this.styleId = builder.styleId;
            this.title = builder.title;
            this.videoModel = builder.videoModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobParams create() {
            return builder().build();
        }

        /**
         * @return aspectRatio
         */
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        /**
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return modelParams
         */
        public String getModelParams() {
            return this.modelParams;
        }

        /**
         * @return narrationVoiceId
         */
        public String getNarrationVoiceId() {
            return this.narrationVoiceId;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return shotPromptMode
         */
        public String getShotPromptMode() {
            return this.shotPromptMode;
        }

        /**
         * @return shotSplitMode
         */
        public String getShotSplitMode() {
            return this.shotSplitMode;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return styleId
         */
        public String getStyleId() {
            return this.styleId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return videoModel
         */
        public String getVideoModel() {
            return this.videoModel;
        }

        public static final class Builder {
            private String aspectRatio; 
            private String fileURL; 
            private String modelParams; 
            private String narrationVoiceId; 
            private String resolution; 
            private String shotPromptMode; 
            private String shotSplitMode; 
            private String sourceType; 
            private String styleId; 
            private String title; 
            private String videoModel; 

            private Builder() {
            } 

            private Builder(JobParams model) {
                this.aspectRatio = model.aspectRatio;
                this.fileURL = model.fileURL;
                this.modelParams = model.modelParams;
                this.narrationVoiceId = model.narrationVoiceId;
                this.resolution = model.resolution;
                this.shotPromptMode = model.shotPromptMode;
                this.shotSplitMode = model.shotSplitMode;
                this.sourceType = model.sourceType;
                this.styleId = model.styleId;
                this.title = model.title;
                this.videoModel = model.videoModel;
            } 

            /**
             * AspectRatio.
             */
            public Builder aspectRatio(String aspectRatio) {
                this.aspectRatio = aspectRatio;
                return this;
            }

            /**
             * FileURL.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * ModelParams.
             */
            public Builder modelParams(String modelParams) {
                this.modelParams = modelParams;
                return this;
            }

            /**
             * NarrationVoiceId.
             */
            public Builder narrationVoiceId(String narrationVoiceId) {
                this.narrationVoiceId = narrationVoiceId;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * ShotPromptMode.
             */
            public Builder shotPromptMode(String shotPromptMode) {
                this.shotPromptMode = shotPromptMode;
                return this;
            }

            /**
             * ShotSplitMode.
             */
            public Builder shotSplitMode(String shotSplitMode) {
                this.shotSplitMode = shotSplitMode;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StyleId.
             */
            public Builder styleId(String styleId) {
                this.styleId = styleId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * VideoModel.
             */
            public Builder videoModel(String videoModel) {
                this.videoModel = videoModel;
                return this;
            }

            public JobParams build() {
                return new JobParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetYikeStoryboardJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeStoryboardJobResponseBody</p>
     */
    public static class JobResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceptionStoryboardIds")
        private String exceptionStoryboardIds;

        @com.aliyun.core.annotation.NameInMap("FailureShotList")
        private String failureShotList;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        @com.aliyun.core.annotation.NameInMap("StoryboardInfoList")
        private String storyboardInfoList;

        @com.aliyun.core.annotation.NameInMap("SuccessStoryboardIds")
        private String successStoryboardIds;

        @com.aliyun.core.annotation.NameInMap("SuccessStoryboardList")
        private String successStoryboardList;

        private JobResult(Builder builder) {
            this.exceptionStoryboardIds = builder.exceptionStoryboardIds;
            this.failureShotList = builder.failureShotList;
            this.outputUrl = builder.outputUrl;
            this.storyboardInfoList = builder.storyboardInfoList;
            this.successStoryboardIds = builder.successStoryboardIds;
            this.successStoryboardList = builder.successStoryboardList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResult create() {
            return builder().build();
        }

        /**
         * @return exceptionStoryboardIds
         */
        public String getExceptionStoryboardIds() {
            return this.exceptionStoryboardIds;
        }

        /**
         * @return failureShotList
         */
        public String getFailureShotList() {
            return this.failureShotList;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        /**
         * @return storyboardInfoList
         */
        public String getStoryboardInfoList() {
            return this.storyboardInfoList;
        }

        /**
         * @return successStoryboardIds
         */
        public String getSuccessStoryboardIds() {
            return this.successStoryboardIds;
        }

        /**
         * @return successStoryboardList
         */
        public String getSuccessStoryboardList() {
            return this.successStoryboardList;
        }

        public static final class Builder {
            private String exceptionStoryboardIds; 
            private String failureShotList; 
            private String outputUrl; 
            private String storyboardInfoList; 
            private String successStoryboardIds; 
            private String successStoryboardList; 

            private Builder() {
            } 

            private Builder(JobResult model) {
                this.exceptionStoryboardIds = model.exceptionStoryboardIds;
                this.failureShotList = model.failureShotList;
                this.outputUrl = model.outputUrl;
                this.storyboardInfoList = model.storyboardInfoList;
                this.successStoryboardIds = model.successStoryboardIds;
                this.successStoryboardList = model.successStoryboardList;
            } 

            /**
             * ExceptionStoryboardIds.
             */
            public Builder exceptionStoryboardIds(String exceptionStoryboardIds) {
                this.exceptionStoryboardIds = exceptionStoryboardIds;
                return this;
            }

            /**
             * FailureShotList.
             */
            public Builder failureShotList(String failureShotList) {
                this.failureShotList = failureShotList;
                return this;
            }

            /**
             * OutputUrl.
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * StoryboardInfoList.
             */
            public Builder storyboardInfoList(String storyboardInfoList) {
                this.storyboardInfoList = storyboardInfoList;
                return this;
            }

            /**
             * SuccessStoryboardIds.
             */
            public Builder successStoryboardIds(String successStoryboardIds) {
                this.successStoryboardIds = successStoryboardIds;
                return this;
            }

            /**
             * SuccessStoryboardList.
             */
            public Builder successStoryboardList(String successStoryboardList) {
                this.successStoryboardList = successStoryboardList;
                return this;
            }

            public JobResult build() {
                return new JobResult(this);
            } 

        } 

    }
}
