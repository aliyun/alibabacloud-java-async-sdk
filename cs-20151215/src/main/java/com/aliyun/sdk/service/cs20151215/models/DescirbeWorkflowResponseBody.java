// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescirbeWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>DescirbeWorkflowResponseBody</p>
 */
public class DescirbeWorkflowResponseBody extends TeaModel {
    @NameInMap("create_time")
    private String createTime;

    @NameInMap("duration")
    private String duration;

    @NameInMap("finish_time")
    private String finishTime;

    @NameInMap("input_data_size")
    private String inputDataSize;

    @NameInMap("job_name")
    private String jobName;

    @NameInMap("job_namespace")
    private String jobNamespace;

    @NameInMap("output_data_size")
    private String outputDataSize;

    @NameInMap("status")
    private String status;

    @NameInMap("total_bases")
    private String totalBases;

    @NameInMap("total_reads")
    private String totalReads;

    @NameInMap("user_input_data")
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
         * 工作流创建时间。
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 工作流经过时长。
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * 任务结束时间。
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * 输入数据大小。
         */
        public Builder inputDataSize(String inputDataSize) {
            this.inputDataSize = inputDataSize;
            return this;
        }

        /**
         * 工作流名称。
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * 工作流所在命名空间。
         */
        public Builder jobNamespace(String jobNamespace) {
            this.jobNamespace = jobNamespace;
            return this;
        }

        /**
         * 输出数据大小。
         */
        public Builder outputDataSize(String outputDataSize) {
            this.outputDataSize = outputDataSize;
            return this;
        }

        /**
         * 工作流当前状态。
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 碱基对个数。
         */
        public Builder totalBases(String totalBases) {
            this.totalBases = totalBases;
            return this;
        }

        /**
         * Reads个数。
         */
        public Builder totalReads(String totalReads) {
            this.totalReads = totalReads;
            return this;
        }

        /**
         * 用户输入参数。
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
