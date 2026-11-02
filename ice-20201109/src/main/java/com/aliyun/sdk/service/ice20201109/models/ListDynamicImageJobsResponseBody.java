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
 * {@link ListDynamicImageJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDynamicImageJobsResponseBody</p>
 */
public class ListDynamicImageJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List<Jobs> jobs;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDynamicImageJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDynamicImageJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobs
     */
    public java.util.List<Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Jobs> jobs; 
        private String nextPageToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDynamicImageJobsResponseBody model) {
            this.jobs = model.jobs;
            this.nextPageToken = model.nextPageToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of tasks.</p>
         */
        public Builder jobs(java.util.List<Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDynamicImageJobsResponseBody build() {
            return new ListDynamicImageJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDynamicImageJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDynamicImageJobsResponseBody</p>
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
             * <p>The input media. OSS URLs and media asset IDs are supported. OSS URL formats:</p>
             * <ul>
             * <li>OSS://bucket/object</li>
             * <li>http(s)://bucket.oss-[regionId].aliyuncs.com/object
             * In the URLs, bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</li>
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
             * <li>OSS: the OSS file URL.</li>
             * <li>Media: the media asset ID.</li>
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
     * {@link ListDynamicImageJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDynamicImageJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Output model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The output media. If Type is set to OSS, enter an OSS URL. If Type is set to Media, enter a media asset ID. OSS URL formats:</p>
             * <ul>
             * <li>OSS://bucket/object</li>
             * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object
             * In the URLs, bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The output type. Valid values:</p>
             * <ul>
             * <li>OSS: the OSS file URL.</li>
             * <li>Media: the media asset ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Media</p>
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
     * {@link ListDynamicImageJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDynamicImageJobsResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TriggerSource")
        private String triggerSource;

        private Jobs(Builder builder) {
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.output = builder.output;
            this.pipelineId = builder.pipelineId;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.templateId = builder.templateId;
            this.triggerSource = builder.triggerSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
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
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return triggerSource
         */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public static final class Builder {
            private String createTime; 
            private String finishTime; 
            private Input input; 
            private String jobId; 
            private String modifiedTime; 
            private String name; 
            private Output output; 
            private String pipelineId; 
            private String status; 
            private String submitTime; 
            private String templateId; 
            private String triggerSource; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.createTime = model.createTime;
                this.finishTime = model.finishTime;
                this.input = model.input;
                this.jobId = model.jobId;
                this.modifiedTime = model.modifiedTime;
                this.name = model.name;
                this.output = model.output;
                this.pipelineId = model.pipelineId;
                this.status = model.status;
                this.submitTime = model.submitTime;
                this.templateId = model.templateId;
                this.triggerSource = model.triggerSource;
            } 

            /**
             * <p>The creation time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:17:54Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The task completion time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:30:54Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The task input.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The animated image task ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The last modification time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:30:54Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleJob</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The task output.</p>
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The pipeline ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The task status.</p>
             * <ul>
             * <li><p><strong>Success</strong>: Succeeded.</p>
             * </li>
             * <li><p><strong>Fail</strong>: Failed.</p>
             * </li>
             * <li><p><strong>Init</strong>: Submitted.</p>
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

            /**
             * <p>The task submission time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:17:54Z</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The request trigger source.</p>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder triggerSource(String triggerSource) {
                this.triggerSource = triggerSource;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
