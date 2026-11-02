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
 * {@link QueryIProductionJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIProductionJobResponseBody</p>
 */
public class QueryIProductionJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("FunctionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobParams")
    private String jobParams;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Output")
    private Output output;

    @com.aliyun.core.annotation.NameInMap("OutputFiles")
    private java.util.List<String> outputFiles;

    @com.aliyun.core.annotation.NameInMap("OutputMediaIds")
    private java.util.List<String> outputMediaIds;

    @com.aliyun.core.annotation.NameInMap("OutputUrls")
    private java.util.List<String> outputUrls;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private QueryIProductionJobResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.finishTime = builder.finishTime;
        this.functionName = builder.functionName;
        this.input = builder.input;
        this.jobId = builder.jobId;
        this.jobParams = builder.jobParams;
        this.name = builder.name;
        this.output = builder.output;
        this.outputFiles = builder.outputFiles;
        this.outputMediaIds = builder.outputMediaIds;
        this.outputUrls = builder.outputUrls;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.scheduleConfig = builder.scheduleConfig;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIProductionJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
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
    public String getJobParams() {
        return this.jobParams;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * @return outputFiles
     */
    public java.util.List<String> getOutputFiles() {
        return this.outputFiles;
    }

    /**
     * @return outputMediaIds
     */
    public java.util.List<String> getOutputMediaIds() {
        return this.outputMediaIds;
    }

    /**
     * @return outputUrls
     */
    public java.util.List<String> getOutputUrls() {
        return this.outputUrls;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String createTime; 
        private String finishTime; 
        private String functionName; 
        private Input input; 
        private String jobId; 
        private String jobParams; 
        private String name; 
        private Output output; 
        private java.util.List<String> outputFiles; 
        private java.util.List<String> outputMediaIds; 
        private java.util.List<String> outputUrls; 
        private String requestId; 
        private String result; 
        private ScheduleConfig scheduleConfig; 
        private String status; 
        private String templateId; 
        private String userData; 

        private Builder() {
        } 

        private Builder(QueryIProductionJobResponseBody model) {
            this.createTime = model.createTime;
            this.finishTime = model.finishTime;
            this.functionName = model.functionName;
            this.input = model.input;
            this.jobId = model.jobId;
            this.jobParams = model.jobParams;
            this.name = model.name;
            this.output = model.output;
            this.outputFiles = model.outputFiles;
            this.outputMediaIds = model.outputMediaIds;
            this.outputUrls = model.outputUrls;
            this.requestId = model.requestId;
            this.result = model.result;
            this.scheduleConfig = model.scheduleConfig;
            this.status = model.status;
            this.templateId = model.templateId;
            this.userData = model.userData;
        } 

        /**
         * <p>The creation time in GMT.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-07T07:16:11Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The completion time in GMT.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-26T14:50:25Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The name of the algorithm feature to use. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong>: Intelligent cover</li>
         * <li><strong>VideoClip</strong>: Video synopsis</li>
         * <li><strong>VideoDelogo</strong>: Video icon removal</li>
         * <li><strong>VideoDetext</strong>: Video subtitle removal</li>
         * <li><strong>CaptionExtraction</strong>: Subtitle fetch</li>
         * <li><strong>VideoGreenScreenMatting</strong>: Image matting</li>
         * <li><strong>FaceBeauty</strong>: Video face beautification</li>
         * <li><strong>VideoH2V</strong>: Video landscape-to-portrait conversion</li>
         * <li><strong>MusicSegmentDetect</strong>: Chorus detection</li>
         * <li><strong>AudioBeatDetection</strong>: Beat detection</li>
         * <li><strong>AudioQualityAssessment</strong>: Audio quality assessment</li>
         * <li><strong>SpeechDenoise</strong>: Speech noise reduction</li>
         * <li><strong>AudioMixing</strong>: Audio mixing</li>
         * <li><strong>MusicDemix</strong>: Vocal and accompaniment separation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The input media.</p>
         */
        public Builder input(Input input) {
            this.input = input;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The algorithm job parameters. This is a JSON object. The parameters vary based on the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
         */
        public Builder jobParams(String jobParams) {
            this.jobParams = jobParams;
            return this;
        }

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test task</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The output media.</p>
         */
        public Builder output(Output output) {
            this.output = output;
            return this;
        }

        /**
         * <p>The output file array.</p>
         */
        public Builder outputFiles(java.util.List<String> outputFiles) {
            this.outputFiles = outputFiles;
            return this;
        }

        /**
         * <p>The list of media asset IDs output by the job.</p>
         */
        public Builder outputMediaIds(java.util.List<String> outputMediaIds) {
            this.outputMediaIds = outputMediaIds;
            return this;
        }

        /**
         * <p>The output file URL array.</p>
         */
        public Builder outputUrls(java.util.List<String> outputUrls) {
            this.outputUrls = outputUrls;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A0E5D1-4B3C-599D-8017-2DA186EA1053</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result information output by the algorithm. The output varies based on FunctionName and is in JSON format. For more information, see the following sections.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The job configuration information.</p>
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Queuing: The job is queued.</li>
         * <li>Analysing: The job is being analyzed.</li>
         * <li>Fail: The job failed.</li>
         * <li>Success: The job succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The user-defined data. This data is returned as-is when the result is retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;:1}</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public QueryIProductionJobResponseBody build() {
            return new QueryIProductionJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryIProductionJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIProductionJobResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The input media. If Type is set to OSS, enter the OSS URL. If Type is set to Media, enter the media asset ID.
             * The OSS URL must be in one of the following formats:</p>
             * <ul>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object
             * where bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/object</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The input type. Valid values:</p>
             * <ul>
             * <li>OSS: OSS file URL.</li>
             * <li>Media: media asset ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryIProductionJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIProductionJobResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Biz")
        private String biz;

        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.biz = builder.biz;
            this.media = builder.media;
            this.outputUrl = builder.outputUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return biz
         */
        public String getBiz() {
            return this.biz;
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String biz; 
            private String media; 
            private String outputUrl; 
            private String type; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.biz = model.biz;
                this.media = model.media;
                this.outputUrl = model.outputUrl;
                this.type = model.type;
            } 

            /**
             * <p>The business to which the media asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>IMS</p>
             */
            public Builder biz(String biz) {
                this.biz = biz;
                return this;
            }

            /**
             * <p>The output media. If Type is set to OSS, the OSS URL is returned. If Type is set to Media, the specified media asset ID or a newly generated media asset ID is returned.</p>
             * <p>The OSS URL must be in one of the following formats:</p>
             * <ul>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object
             * where bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/object</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The OSS URL of the specified output file when Type is set to Media.</p>
             * 
             * <strong>example:</strong>
             * <p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</p>
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * <p>The media type. Valid values:</p>
             * <ul>
             * <li>OSS: OSS path.</li>
             * <li>Media: media asset ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryIProductionJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIProductionJobResponseBody</p>
     */
    public static class ScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private ScheduleConfig(Builder builder) {
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String pipelineId; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(ScheduleConfig model) {
                this.pipelineId = model.pipelineId;
                this.priority = model.priority;
            } 

            /**
             * <p>The pipeline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a54fdc9c9aab413caef0d1150f565e86</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority of the job in its corresponding pipeline.</p>
             * <ul>
             * <li><p>Highest priority: 10.</p>
             * </li>
             * <li><p>Default value: <strong>6</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
}
