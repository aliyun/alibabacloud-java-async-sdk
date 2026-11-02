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
 * {@link GetBatchMediaProducingJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchMediaProducingJobResponseBody</p>
 */
public class GetBatchMediaProducingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EditingBatchJob")
    private EditingBatchJob editingBatchJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBatchMediaProducingJobResponseBody(Builder builder) {
        this.editingBatchJob = builder.editingBatchJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchMediaProducingJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return editingBatchJob
     */
    public EditingBatchJob getEditingBatchJob() {
        return this.editingBatchJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EditingBatchJob editingBatchJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetBatchMediaProducingJobResponseBody model) {
            this.editingBatchJob = model.editingBatchJob;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The batch intelligent one-click video production task information.</p>
         */
        public Builder editingBatchJob(EditingBatchJob editingBatchJob) {
            this.editingBatchJob = editingBatchJob;
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

        public GetBatchMediaProducingJobResponseBody build() {
            return new GetBatchMediaProducingJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBatchMediaProducingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchMediaProducingJobResponseBody</p>
     */
    public static class SubJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaURL")
        private String mediaURL;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SubJobList(Builder builder) {
            this.duration = builder.duration;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.mediaURL = builder.mediaURL;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubJobList create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaURL
         */
        public String getMediaURL() {
            return this.mediaURL;
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

        public static final class Builder {
            private Float duration; 
            private String errorCode; 
            private String errorMessage; 
            private String jobId; 
            private String mediaId; 
            private String mediaURL; 
            private String projectId; 
            private String status; 

            private Builder() {
            } 

            private Builder(SubJobList model) {
                this.duration = model.duration;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.jobId = model.jobId;
                this.mediaId = model.mediaId;
                this.mediaURL = model.mediaURL;
                this.projectId = model.projectId;
                this.status = model.status;
            } 

            /**
             * <p>The duration of the produced video. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>24.5</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The error code returned when the subtask fails. This parameter is not returned if the subtask is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidMaterial.NotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when the subtask fails. This parameter is not returned if the subtask is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified clips id not found:[&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>&quot;]</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The subtask ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>8e81933d44e3ae69e2f81485</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the produced media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>1470b11171ee9d19e7e6c66a</strong></strong></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The URL of the output video file.</p>
             * 
             * <strong>example:</strong>
             * <p>http:/xxx.oss-cn-shanghai.aliyuncs.com/xxx_0.mp4</p>
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * <p>The ID of the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>7cc47fe04eaa81bd853acb6a</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The subtask status. Valid values:</p>
             * <ul>
             * <li><p>Init: initialized</p>
             * </li>
             * <li><p>Processing: processing</p>
             * </li>
             * <li><p>Success: successful</p>
             * </li>
             * <li><p>Failed: failed</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubJobList build() {
                return new SubJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchMediaProducingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchMediaProducingJobResponseBody</p>
     */
    public static class EditingBatchJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EditingConfig")
        private String editingConfig;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("ExtendInput")
        private String extendInput;

        @com.aliyun.core.annotation.NameInMap("ExtendOutput")
        private String extendOutput;

        @com.aliyun.core.annotation.NameInMap("InputConfig")
        private String inputConfig;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OutputConfig")
        private String outputConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubJobList")
        private java.util.List<SubJobList> subJobList;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private EditingBatchJob(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.editingConfig = builder.editingConfig;
            this.extend = builder.extend;
            this.extendInput = builder.extendInput;
            this.extendOutput = builder.extendOutput;
            this.inputConfig = builder.inputConfig;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.modifiedTime = builder.modifiedTime;
            this.outputConfig = builder.outputConfig;
            this.status = builder.status;
            this.subJobList = builder.subJobList;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditingBatchJob create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return editingConfig
         */
        public String getEditingConfig() {
            return this.editingConfig;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return extendInput
         */
        public String getExtendInput() {
            return this.extendInput;
        }

        /**
         * @return extendOutput
         */
        public String getExtendOutput() {
            return this.extendOutput;
        }

        /**
         * @return inputConfig
         */
        public String getInputConfig() {
            return this.inputConfig;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return outputConfig
         */
        public String getOutputConfig() {
            return this.outputConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subJobList
         */
        public java.util.List<SubJobList> getSubJobList() {
            return this.subJobList;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String completeTime; 
            private String createTime; 
            private String editingConfig; 
            private String extend; 
            private String extendInput; 
            private String extendOutput; 
            private String inputConfig; 
            private String jobId; 
            private String jobType; 
            private String modifiedTime; 
            private String outputConfig; 
            private String status; 
            private java.util.List<SubJobList> subJobList; 
            private String userData; 

            private Builder() {
            } 

            private Builder(EditingBatchJob model) {
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.editingConfig = model.editingConfig;
                this.extend = model.extend;
                this.extendInput = model.extendInput;
                this.extendOutput = model.extendOutput;
                this.inputConfig = model.inputConfig;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.modifiedTime = model.modifiedTime;
                this.outputConfig = model.outputConfig;
                this.status = model.status;
                this.subJobList = model.subJobList;
                this.userData = model.userData;
            } 

            /**
             * <p>The time when the task was completed. The time is displayed in UTC.</p>
             * <p>Format: &quot;YYYY-MM-DD\&quot;T\&quot;hh:mm:ss\&quot;Z\&quot;&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-13T08:57:07Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the task was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-13T08:47:07Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The editing-related configuration. For more information about the structure, see <a href="~~2692547#1be9bba03b7qu~~">EditingConfig</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;MediaConfig&quot;: {
             *       &quot;Volume&quot;: 0
             *   },
             *   &quot;SpeechConfig&quot;: {
             *       &quot;Volume&quot;: 1
             *   },
             *  &quot;BackgroundMusicConfig&quot;: {
             *       &quot;Volume&quot;: 0.3
             *   }
             * }</p>
             */
            public Builder editingConfig(String editingConfig) {
                this.editingConfig = editingConfig;
                return this;
            }

            /**
             * <p>The extended information. Field details:</p>
             * <ul>
             * <li><p>ErrorCode: the error code of the main task</p>
             * </li>
             * <li><p>ErrorMessage: the error message of the main task</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;ErrorCode&quot;: &quot;InvalidMaterial.NotFound&quot;,
             *     &quot;ErrorMessage&quot;: &quot;The specified clips id not found:[\&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>\&quot;]&quot;
             * }</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The additional input.</p>
             * <ul>
             * <li>If JobType is set to Smart_Mix_Timeline_Organize or Screen_Media_Highlights_Timeline_Organize, the additional input is the media selection result.</li>
             * <li>If JobType is set to Scene_Batch_Editing, the additional input is the list of editing project IDs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;<strong><strong>7cc47fe04eaa81bd853acb6a</strong></strong>&quot;, &quot;<strong><strong>04eaa7cc47fe81bd853acb6a</strong></strong>&quot;]</p>
             */
            public Builder extendInput(String extendInput) {
                this.extendInput = extendInput;
                return this;
            }

            /**
             * <p>The additional output.</p>
             * <ul>
             * <li>If JobType is set to Smart_Mix_Media_Select or Screen_Media_Highlights_Media_Select, the media selection result is additionally returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;textMatchMediaOutputList&quot;: [{
             *         &quot;textMatchMediaSentenceOutputList&quot;: [{
             *                 &quot;duration&quot;: 3.366667,
             *                 &quot;matchClipList&quot;: [{
             *                     &quot;clipId&quot;: &quot;null-2&quot;,
             *                     &quot;endTime&quot;: 11.16,
             *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
             *                     &quot;score&quot;: -0.253,
             *                     &quot;startTime&quot;: 8.04
             *                 }],
             *                 &quot;text&quot;: &quot;A new box of fresh horses has been opened in the nearby shopping mall.&quot;,
             *                 &quot;textId&quot;: &quot;0&quot;
             *             },
             *             {
             *                 &quot;duration&quot;: 1.566667,
             *                 &quot;matchClipList&quot;: [{
             *                     &quot;clipId&quot;: &quot;null-1&quot;,
             *                     &quot;endTime&quot;: 1.54,
             *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
             *                     &quot;score&quot;: -0.2326,
             *                     &quot;startTime&quot;: 0
             *                 }],
             *                 &quot;text&quot;: &quot;Today is the first day of opening&quot;,
             *                 &quot;textId&quot;: &quot;0&quot;
             *             }
             *         ]
             *     }]
             * }</p>
             */
            public Builder extendOutput(String extendOutput) {
                this.extendOutput = extendOutput;
                return this;
            }

            /**
             * <p>The user synthesis output configuration. For more information about the structure, see <a href="~~2692547#2faed1559549n~~">InputConfig</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;MediaGroupArray&quot;: [{
             *       &quot;GroupName&quot;: &quot;MediaGroup1&quot;,
             *       &quot;MediaArray&quot;: [
             *         &quot;<strong><strong>9d46c886b45481030f6e</strong></strong>&quot;,
             *         &quot;<strong><strong>6c886b4549d481030f6e</strong></strong>&quot; ]
             *     }, {
             *       &quot;GroupName&quot;: &quot;MediaGroup2&quot;,
             *       &quot;MediaArray&quot;: [
             *         &quot;<strong><strong>d46c886810b454930f6e</strong></strong>&quot;,
             *         &quot;<strong><strong>4549d886810b46c30f6e</strong></strong>&quot; ]
             *   }],
             *   &quot;TitleArray&quot;: [
             *       &quot;Huilongguan Box Ma Xiansheng Opened&quot;,
             *       &quot;Box of Ma Xiansheng has opened&quot; ],
             *   &quot;SpeechTextArray&quot;: [
             *       &quot;A new box of fresh horses has been opened in a nearby shopping mall. Today is the first day of opening.&quot;
             *       &quot;There are a lot of people in the shopping mall. Snacks and drinks are relatively cheap. Come and have a look.&quot; ]
             * }</p>
             */
            public Builder inputConfig(String inputConfig) {
                this.inputConfig = inputConfig;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>b6b2750d4308892ac3330238</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li>Script: scripted automatic video production</li>
             * <li>Smart_Mix: intelligent image and text matching video production</li>
             * <li>Sports_Highlights: sports event highlights video production</li>
             * <li>Screen_Media_Highlights: high-energy mashup video production</li>
             * <li>Smart_Mix_Media_Select: intelligent matching - media selection</li>
             * <li>Smart_Mix_Timeline_Organize: intelligent matching - timeline arrangement</li>
             * <li>Screen_Media_Highlights_Media_Select: high-energy mashup - media selection</li>
             * <li>Screen_Media_Highlights_Timeline_Organize: high-energy mashup - timeline arrangement</li>
             * <li>Scene_Batch_Editing: multi-timeline batch synthesis</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Script</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The time when the task was modified. The time is displayed in UTC.</p>
             * <p>Format: &quot;YYYY-MM-DD\&quot;T\&quot;hh:mm:ss\&quot;Z\&quot;&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-13T08:57:07Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The output configuration. For more information about the structure, see <a href="~~2692547#447b928fcbuoa~~">OutputConfig</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
             *   &quot;Count&quot;: 20,
             *   &quot;MaxDuration&quot;: 15,
             *   &quot;Width&quot;: 1080,
             *   &quot;Height&quot;: 1920,
             *   &quot;Video&quot;: {&quot;Crf&quot;: 27}
             * }</p>
             */
            public Builder outputConfig(String outputConfig) {
                this.outputConfig = outputConfig;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><p>Init: initialized</p>
             * </li>
             * <li><p>Processing: processing</p>
             * </li>
             * <li><p>Finished: finished</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of one-click video production subtasks.</p>
             */
            public Builder subJobList(java.util.List<SubJobList> subJobList) {
                this.subJobList = subJobList;
                return this;
            }

            /**
             * <p>The user business and callback configurations. For more information about the structure, see <a href="~~357745#section-urj-v3f-0s1~~">UserData</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public EditingBatchJob build() {
                return new EditingBatchJob(this);
            } 

        } 

    }
}
