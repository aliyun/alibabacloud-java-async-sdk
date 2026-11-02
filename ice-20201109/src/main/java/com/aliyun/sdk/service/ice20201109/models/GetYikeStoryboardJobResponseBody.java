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
         * <p>The job ID. You can obtain this value from the response parameters of <a href="https://help.aliyun.com/document_detail/461964.html">Submit a packaging job</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The algorithm job parameters. This is a JSON object whose content varies depending on the algorithm.</p>
         */
        public Builder jobParams(JobParams jobParams) {
            this.jobParams = jobParams;
            return this;
        }

        /**
         * <p>The job result.</p>
         */
        public Builder jobResult(JobResult jobResult) {
            this.jobResult = jobResult;
            return this;
        }

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li><p><strong>Succeeded</strong>: The job is processed.</p>
         * </li>
         * <li><p><strong>Failed</strong>: The job failed.</p>
         * </li>
         * <li><p><strong>Running</strong>: The job is being processed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
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
             * <p>The aspect ratio of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>16:9</p>
             */
            public Builder aspectRatio(String aspectRatio) {
                this.aspectRatio = aspectRatio;
                return this;
            }

            /**
             * <p>The OSS URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * <p>The random seed.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;AudioEnable&quot;: false
             * }</p>
             */
            public Builder modelParams(String modelParams) {
                this.modelParams = modelParams;
                return this;
            }

            /**
             * <p>The narration voice ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sys_YoungGracefulWoman</p>
             */
            public Builder narrationVoiceId(String narrationVoiceId) {
                this.narrationVoiceId = narrationVoiceId;
                return this;
            }

            /**
             * <p>The resolution of the generated video.</p>
             * 
             * <strong>example:</strong>
             * <p>1K</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>The shot prompt generation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>multi</p>
             */
            public Builder shotPromptMode(String shotPromptMode) {
                this.shotPromptMode = shotPromptMode;
                return this;
            }

            /**
             * <p>The shot split mode.</p>
             * 
             * <strong>example:</strong>
             * <p>firstPersonNarration</p>
             */
            public Builder shotSplitMode(String shotSplitMode) {
                this.shotSplitMode = shotSplitMode;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>Novel</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The style ID.</p>
             * 
             * <strong>example:</strong>
             * <p>RealisticPhotography</p>
             */
            public Builder styleId(String styleId) {
                this.styleId = styleId;
                return this;
            }

            /**
             * <p>The job title.</p>
             * <p>\- Maximum length: 128 bytes.</p>
             * <p>\- UTF-8 encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>test-title</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The video model.</p>
             * 
             * <strong>example:</strong>
             * <p>wan2.6-r2v-flash</p>
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
             * <p>The list of exception storyboard IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>[\&quot;st_2053348871\&quot;]</p>
             */
            public Builder exceptionStoryboardIds(String exceptionStoryboardIds) {
                this.exceptionStoryboardIds = exceptionStoryboardIds;
                return this;
            }

            /**
             * <p>The list of failed shots.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;errorCode\&quot;:\&quot;NoMediaData\&quot;,\&quot;storyboardId\&quot;:\&quot;st_2118280473\&quot;,\&quot;shotId\&quot;:\&quot;54\&quot;}]</p>
             */
            public Builder failureShotList(String failureShotList) {
                this.failureShotList = failureShotList;
                return this;
            }

            /**
             * <p>The downloadable OSS URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * <p>The detailed storyboard information for the storyboard generation task.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;storyboardId\&quot;:\&quot;st_1541525214\&quot;,\&quot;title\&quot;:\&quot;test_1\&quot;,\&quot;status\&quot;:\&quot;Produced\&quot;,\&quot;subStatus\&quot;:\&quot;ProduceSucc\&quot;},{\&quot;storyboardId\&quot;:\&quot;st_1633435355\&quot;,\&quot;title\&quot;:\&quot;test_2\&quot;,\&quot;status\&quot;:\&quot;Produced\&quot;,\&quot;subStatus\&quot;:\&quot;ProduceSucc\&quot;}]</p>
             */
            public Builder storyboardInfoList(String storyboardInfoList) {
                this.storyboardInfoList = storyboardInfoList;
                return this;
            }

            /**
             * <p>The list of successful storyboard IDs, separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>st_2118280473, st_2118280471</p>
             */
            public Builder successStoryboardIds(String successStoryboardIds) {
                this.successStoryboardIds = successStoryboardIds;
                return this;
            }

            /**
             * <p>The list of successful storyboards.</p>
             * 
             * <strong>example:</strong>
             * <p>[\&quot;st_2118280473\&quot;]</p>
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
