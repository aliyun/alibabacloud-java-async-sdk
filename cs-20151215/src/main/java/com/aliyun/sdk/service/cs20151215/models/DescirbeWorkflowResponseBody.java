// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescirbeWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>DescirbeWorkflowResponseBody</p>
 */
public class DescirbeWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("create_time")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("duration")
    private String duration;

    @com.aliyun.core.annotation.NameInMap("finish_time")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("input_data_size")
    private String inputDataSize;

    @com.aliyun.core.annotation.NameInMap("job_name")
    private String jobName;

    @com.aliyun.core.annotation.NameInMap("job_namespace")
    private String jobNamespace;

    @com.aliyun.core.annotation.NameInMap("output_data_size")
    private String outputDataSize;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("total_bases")
    private String totalBases;

    @com.aliyun.core.annotation.NameInMap("total_reads")
    private String totalReads;

    @com.aliyun.core.annotation.NameInMap("user_input_data")
    private String userInputData;

    private DescirbeWorkflowResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.duration = builder.duration;
        this.finishTime = builder.finishTime;
        this.inputDataSize = builder.inputDataSize;
        this.jobName = builder.jobName;
        this.jobNamespace = builder.jobNamespace;
        this.outputDataSize = builder.outputDataSize;
        this.status = builder.status;
        this.totalBases = builder.totalBases;
        this.totalReads = builder.totalReads;
        this.userInputData = builder.userInputData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescirbeWorkflowResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return inputDataSize
     */
    public String getInputDataSize() {
        return this.inputDataSize;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return jobNamespace
     */
    public String getJobNamespace() {
        return this.jobNamespace;
    }

    /**
     * @return outputDataSize
     */
    public String getOutputDataSize() {
        return this.outputDataSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalBases
     */
    public String getTotalBases() {
        return this.totalBases;
    }

    /**
     * @return totalReads
     */
    public String getTotalReads() {
        return this.totalReads;
    }

    /**
     * @return userInputData
     */
    public String getUserInputData() {
        return this.userInputData;
    }

    public static final class Builder {
        private String createTime; 
        private String duration; 
        private String finishTime; 
        private String inputDataSize; 
        private String jobName; 
        private String jobNamespace; 
        private String outputDataSize; 
        private String status; 
        private String totalBases; 
        private String totalReads; 
        private String userInputData; 

        /**
         * The time when the workflow was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The duration of the workflow.
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * The end time of the task.
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * The size of the input data.
         */
        public Builder inputDataSize(String inputDataSize) {
            this.inputDataSize = inputDataSize;
            return this;
        }

        /**
         * The name of the workflow.
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * The namespace to which the workflow belongs.
         */
        public Builder jobNamespace(String jobNamespace) {
            this.jobNamespace = jobNamespace;
            return this;
        }

        /**
         * The size of the output data.
         */
        public Builder outputDataSize(String outputDataSize) {
            this.outputDataSize = outputDataSize;
            return this;
        }

        /**
         * The current state of the workflow.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The number of base pairs.
         */
        public Builder totalBases(String totalBases) {
            this.totalBases = totalBases;
            return this;
        }

        /**
         * The number of reads.
         */
        public Builder totalReads(String totalReads) {
            this.totalReads = totalReads;
            return this;
        }

        /**
         * The user input parameters.
         */
        public Builder userInputData(String userInputData) {
            this.userInputData = userInputData;
            return this;
        }

        public DescirbeWorkflowResponseBody build() {
            return new DescirbeWorkflowResponseBody(this);
        } 

    } 

}
