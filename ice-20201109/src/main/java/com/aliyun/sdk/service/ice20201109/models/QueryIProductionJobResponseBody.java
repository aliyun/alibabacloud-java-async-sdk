// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    private java.util.List < String > outputFiles;

    @com.aliyun.core.annotation.NameInMap("OutputUrls")
    private java.util.List < String > outputUrls;

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
    public java.util.List < String > getOutputFiles() {
        return this.outputFiles;
    }

    /**
     * @return outputUrls
     */
    public java.util.List < String > getOutputUrls() {
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
        private java.util.List < String > outputFiles; 
        private java.util.List < String > outputUrls; 
        private String requestId; 
        private String result; 
        private ScheduleConfig scheduleConfig; 
        private String status; 
        private String templateId; 
        private String userData; 

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-07T07:16:11Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the job was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-26T14:50:25Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The name of the algorithm that you want to use for the job. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong>: This algorithm intelligently generates a thumbnail image for a video.</li>
         * <li><strong>VideoClip</strong>: This algorithm intelligently generates a summary for a video.</li>
         * <li><strong>VideoDelogo</strong>: This algorithm removes logos from a video.</li>
         * <li><strong>VideoDetext</strong>: This algorithm removes captions from a video.</li>
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
         * <p>The input file.</p>
         */
        public Builder input(Input input) {
            this.input = input;
            return this;
        }

        /**
         * <p>The ID of the intelligent production job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The algorithm-specific parameters. The parameters are specified as JSON objects and vary based on the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
         */
        public Builder jobParams(String jobParams) {
            this.jobParams = jobParams;
            return this;
        }

        /**
         * <p>The name of the intelligent production job.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The output file.</p>
         */
        public Builder output(Output output) {
            this.output = output;
            return this;
        }

        /**
         * <p>The output files.</p>
         */
        public Builder outputFiles(java.util.List < String > outputFiles) {
            this.outputFiles = outputFiles;
            return this;
        }

        /**
         * <p>The URLs of the output files.</p>
         */
        public Builder outputUrls(java.util.List < String > outputUrls) {
            this.outputUrls = outputUrls;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The output of the algorithm. The output is in JSON format and varies based on the algorithm. For more information, see the &quot;Parameters of Result&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The scheduling configuration.</p>
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li>Queuing: The job is waiting in the queue.</li>
         * <li>Analysing: The job is in progress.</li>
         * <li>Fail: The job failed.</li>
         * <li>Success: The job was successful.</li>
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
         * <p>The user-defined data that is returned in the response.</p>
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

            /**
             * <p>The input file. If Type is set to OSS, set this parameter to the path of an OSS object. If Type is set to Media, set this parameter to the ID of a media asset. You can specify the path of an OSS object in one of the following formats:</p>
             * <ol>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object bucket in the path specifies an OSS bucket that resides in the same region as the intelligent production job. object in the path specifies the object path in OSS.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/object</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The media type. Valid values:</p>
             * <ol>
             * <li>OSS: Object Storage Service (OSS) object</li>
             * <li>Media: media asset</li>
             * </ol>
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
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
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

            /**
             * <p>The output file. If Type is set to OSS, set this parameter to the path of an OSS object. If Type is set to Media, set this parameter to the ID of a media asset. You can specify the path of an OSS object in one of the following formats:</p>
             * <ol>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object bucket in the path specifies an OSS bucket that resides in the same region as the intelligent production job. object in the path specifies the object path in OSS.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/object</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The media type. Valid values:</p>
             * <ul>
             * <li>OSS: OSS object</li>
             * <li>Media: media asset</li>
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

            /**
             * <p>The ID of the ApsaraVideo Media Processing (MPS) queue.</p>
             * 
             * <strong>example:</strong>
             * <p>a54fdc9c9aab413caef0d1150f565e86</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority of the job in the MPS queue to which the job is added.</p>
             * <ul>
             * <li>A value of 10 indicates the highest priority.</li>
             * <li>Default value: <strong>6</strong>.</li>
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
