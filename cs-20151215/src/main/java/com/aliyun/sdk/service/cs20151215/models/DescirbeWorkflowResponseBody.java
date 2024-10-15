// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The time when the workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-15 16:30:25 +0800 CST</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The duration of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>1h15m33.529968361s</p>
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>0001-01-01 00:00:00 +0000 UTC</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The size of the input data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder inputDataSize(String inputDataSize) {
            this.inputDataSize = inputDataSize;
            return this;
        }

        /**
         * <p>The name of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>wgs-gpu-97xfn</p>
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The namespace to which the workflow belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1171330362041663</p>
         */
        public Builder jobNamespace(String jobNamespace) {
            this.jobNamespace = jobNamespace;
            return this;
        }

        /**
         * <p>The size of the output data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder outputDataSize(String outputDataSize) {
            this.outputDataSize = outputDataSize;
            return this;
        }

        /**
         * <p>The current state of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The number of base pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalBases(String totalBases) {
            this.totalBases = totalBases;
            return this;
        }

        /**
         * <p>The number of reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalReads(String totalReads) {
            this.totalReads = totalReads;
            return this;
        }

        /**
         * <p>The user input parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;wgs_oss_region&quot;:&quot;cn-shenzhen&quot;,&quot;wgs_fastq_first_name&quot;:&quot;fastq/huada/MGISEQ-200019SZ0002402&quot;,&quot;wgs_fastq_second_name&quot;:&quot;fastq/huada/MGISEQ-200019SZ0002402&quot;,&quot;wgs_bucket_name&quot;:&quot;gene-shenzhen&quot;,&quot;wgs_vcf_file_name&quot;:&quot;output/vcf/huada.vcf&quot;,&quot;wgs_bam_file_name&quot;:&quot;output/bam/huada.bam&quot;,&quot;wgs_reference_file&quot;:&quot;hg19&quot;,&quot;wgs_service&quot;:&quot;g&quot;}</p>
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
