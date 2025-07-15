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
 * {@link ListEdgeTranscodeJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListEdgeTranscodeJobResponseBody</p>
 */
public class ListEdgeTranscodeJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobList")
    private JobList jobList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEdgeTranscodeJobResponseBody(Builder builder) {
        this.jobList = builder.jobList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeTranscodeJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobList
     */
    public JobList getJobList() {
        return this.jobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private JobList jobList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListEdgeTranscodeJobResponseBody model) {
            this.jobList = model.jobList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The edge transcoding tasks.</p>
         */
        public Builder jobList(JobList jobList) {
            this.jobList = jobList;
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

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEdgeTranscodeJobResponseBody build() {
            return new ListEdgeTranscodeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEdgeTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListEdgeTranscodeJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("LastStartAt")
        private String lastStartAt;

        @com.aliyun.core.annotation.NameInMap("LastStopAt")
        private String lastStopAt;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StreamInput")
        private String streamInput;

        @com.aliyun.core.annotation.NameInMap("StreamOutput")
        private String streamOutput;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Job(Builder builder) {
            this.createTime = builder.createTime;
            this.jobId = builder.jobId;
            this.lastStartAt = builder.lastStartAt;
            this.lastStopAt = builder.lastStopAt;
            this.name = builder.name;
            this.status = builder.status;
            this.streamInput = builder.streamInput;
            this.streamOutput = builder.streamOutput;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return lastStartAt
         */
        public String getLastStartAt() {
            return this.lastStartAt;
        }

        /**
         * @return lastStopAt
         */
        public String getLastStopAt() {
            return this.lastStopAt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return streamInput
         */
        public String getStreamInput() {
            return this.streamInput;
        }

        /**
         * @return streamOutput
         */
        public String getStreamOutput() {
            return this.streamOutput;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String jobId; 
            private String lastStartAt; 
            private String lastStopAt; 
            private String name; 
            private String status; 
            private String streamInput; 
            private String streamOutput; 
            private String templateId; 
            private String templateName; 
            private String type; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.createTime = model.createTime;
                this.jobId = model.jobId;
                this.lastStartAt = model.lastStartAt;
                this.lastStopAt = model.lastStopAt;
                this.name = model.name;
                this.status = model.status;
                this.streamInput = model.streamInput;
                this.streamOutput = model.streamOutput;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.type = model.type;
            } 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-24T16:44:55Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The time when the task was last started.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-25T02:48:58Z</p>
             */
            public Builder lastStartAt(String lastStartAt) {
                this.lastStartAt = lastStartAt;
                return this;
            }

            /**
             * <p>The time when the task was last stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-25T05:48:58Z</p>
             */
            public Builder lastStopAt(String lastStopAt) {
                this.lastStopAt = lastStopAt;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>my_job</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li>0: not started</li>
             * <li>1: in progress</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The URL of the input stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://mydomain/app/stream1</p>
             */
            public Builder streamInput(String streamInput) {
                this.streamInput = streamInput;
                return this;
            }

            /**
             * <p>The URL of the output stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://testdomain/app/stream2</p>
             */
            public Builder streamOutput(String streamOutput) {
                this.streamOutput = streamOutput;
                return this;
            }

            /**
             * <p>The ID of the edge transcoding template used by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>9b1571b513cb44f7a1ba6ae561ff****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the edge transcoding template used by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>my_template</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type of edge transcoding. Valid values:</p>
             * <ul>
             * <li>common: standard transcoding and Narrowband HD™ 1.0 transcoding.</li>
             * <li>nbhd-2: Narrowband HD™ 2.0 transcoding</li>
             * <li>ultra-hd: ultra-high definition transcoding</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEdgeTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListEdgeTranscodeJobResponseBody</p>
     */
    public static class JobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Job")
        private java.util.List<Job> job;

        private JobList(Builder builder) {
            this.job = builder.job;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return job
         */
        public java.util.List<Job> getJob() {
            return this.job;
        }

        public static final class Builder {
            private java.util.List<Job> job; 

            private Builder() {
            } 

            private Builder(JobList model) {
                this.job = model.job;
            } 

            /**
             * Job.
             */
            public Builder job(java.util.List<Job> job) {
                this.job = job;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
}
