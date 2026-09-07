// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link Detail} extends {@link TeaModel}
 *
 * <p>Detail</p>
 */
public class Detail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("DurationInMillis")
    private Long durationInMillis;

    @com.aliyun.core.annotation.NameInMap("EstimateExecutionCpuTimeInSeconds")
    private Long estimateExecutionCpuTimeInSeconds;

    @com.aliyun.core.annotation.NameInMap("ExecutionDurationInMillis")
    private Long executionDurationInMillis;

    @com.aliyun.core.annotation.NameInMap("LastAttemptId")
    private String lastAttemptId;

    @com.aliyun.core.annotation.NameInMap("LastUpdatedTimeInMillis")
    private Long lastUpdatedTimeInMillis;

    @com.aliyun.core.annotation.NameInMap("LogRootPath")
    private String logRootPath;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @com.aliyun.core.annotation.NameInMap("ResourceProvisioningDurationInMillis")
    private Long resourceProvisioningDurationInMillis;

    @com.aliyun.core.annotation.NameInMap("RunningStartTimeInMillis")
    private Long runningStartTimeInMillis;

    @com.aliyun.core.annotation.NameInMap("StartedTimeInMillis")
    private Long startedTimeInMillis;

    @com.aliyun.core.annotation.NameInMap("SubmittedTimeInMillis")
    private Long submittedTimeInMillis;

    @com.aliyun.core.annotation.NameInMap("TerminatedTimeInMillis")
    private Long terminatedTimeInMillis;

    @com.aliyun.core.annotation.NameInMap("WebUiAddress")
    private String webUiAddress;

    private Detail(Builder builder) {
        this.appType = builder.appType;
        this.DBClusterId = builder.DBClusterId;
        this.data = builder.data;
        this.durationInMillis = builder.durationInMillis;
        this.estimateExecutionCpuTimeInSeconds = builder.estimateExecutionCpuTimeInSeconds;
        this.executionDurationInMillis = builder.executionDurationInMillis;
        this.lastAttemptId = builder.lastAttemptId;
        this.lastUpdatedTimeInMillis = builder.lastUpdatedTimeInMillis;
        this.logRootPath = builder.logRootPath;
        this.resourceGroupName = builder.resourceGroupName;
        this.resourceProvisioningDurationInMillis = builder.resourceProvisioningDurationInMillis;
        this.runningStartTimeInMillis = builder.runningStartTimeInMillis;
        this.startedTimeInMillis = builder.startedTimeInMillis;
        this.submittedTimeInMillis = builder.submittedTimeInMillis;
        this.terminatedTimeInMillis = builder.terminatedTimeInMillis;
        this.webUiAddress = builder.webUiAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Detail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return durationInMillis
     */
    public Long getDurationInMillis() {
        return this.durationInMillis;
    }

    /**
     * @return estimateExecutionCpuTimeInSeconds
     */
    public Long getEstimateExecutionCpuTimeInSeconds() {
        return this.estimateExecutionCpuTimeInSeconds;
    }

    /**
     * @return executionDurationInMillis
     */
    public Long getExecutionDurationInMillis() {
        return this.executionDurationInMillis;
    }

    /**
     * @return lastAttemptId
     */
    public String getLastAttemptId() {
        return this.lastAttemptId;
    }

    /**
     * @return lastUpdatedTimeInMillis
     */
    public Long getLastUpdatedTimeInMillis() {
        return this.lastUpdatedTimeInMillis;
    }

    /**
     * @return logRootPath
     */
    public String getLogRootPath() {
        return this.logRootPath;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return resourceProvisioningDurationInMillis
     */
    public Long getResourceProvisioningDurationInMillis() {
        return this.resourceProvisioningDurationInMillis;
    }

    /**
     * @return runningStartTimeInMillis
     */
    public Long getRunningStartTimeInMillis() {
        return this.runningStartTimeInMillis;
    }

    /**
     * @return startedTimeInMillis
     */
    public Long getStartedTimeInMillis() {
        return this.startedTimeInMillis;
    }

    /**
     * @return submittedTimeInMillis
     */
    public Long getSubmittedTimeInMillis() {
        return this.submittedTimeInMillis;
    }

    /**
     * @return terminatedTimeInMillis
     */
    public Long getTerminatedTimeInMillis() {
        return this.terminatedTimeInMillis;
    }

    /**
     * @return webUiAddress
     */
    public String getWebUiAddress() {
        return this.webUiAddress;
    }

    public static final class Builder {
        private String appType; 
        private String DBClusterId; 
        private String data; 
        private Long durationInMillis; 
        private Long estimateExecutionCpuTimeInSeconds; 
        private Long executionDurationInMillis; 
        private String lastAttemptId; 
        private Long lastUpdatedTimeInMillis; 
        private String logRootPath; 
        private String resourceGroupName; 
        private Long resourceProvisioningDurationInMillis; 
        private Long runningStartTimeInMillis; 
        private Long startedTimeInMillis; 
        private Long submittedTimeInMillis; 
        private Long terminatedTimeInMillis; 
        private String webUiAddress; 

        private Builder() {
        } 

        private Builder(Detail model) {
            this.appType = model.appType;
            this.DBClusterId = model.DBClusterId;
            this.data = model.data;
            this.durationInMillis = model.durationInMillis;
            this.estimateExecutionCpuTimeInSeconds = model.estimateExecutionCpuTimeInSeconds;
            this.executionDurationInMillis = model.executionDurationInMillis;
            this.lastAttemptId = model.lastAttemptId;
            this.lastUpdatedTimeInMillis = model.lastUpdatedTimeInMillis;
            this.logRootPath = model.logRootPath;
            this.resourceGroupName = model.resourceGroupName;
            this.resourceProvisioningDurationInMillis = model.resourceProvisioningDurationInMillis;
            this.runningStartTimeInMillis = model.runningStartTimeInMillis;
            this.startedTimeInMillis = model.startedTimeInMillis;
            this.submittedTimeInMillis = model.submittedTimeInMillis;
            this.terminatedTimeInMillis = model.terminatedTimeInMillis;
            this.webUiAddress = model.webUiAddress;
        } 

        /**
         * <p>The type of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>BATCH</p>
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * <p>The ID of the cluster that runs the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The configuration content of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;name&quot;: &quot;SparkPi&quot;,     &quot;file&quot;: &quot;local:///tmp/spark-examples.jar&quot;,     &quot;className&quot;: &quot;org.apache.spark.examples.SparkPi&quot;,     &quot;args&quot;: [         &quot;1000000&quot;     ],     &quot;conf&quot;: {         &quot;spark.driver.resourceSpec&quot;: &quot;small&quot;,         &quot;spark.executor.instances&quot;: 1,         &quot;spark.executor.resourceSpec&quot;: &quot;small&quot;     } }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The execution duration of the Spark application, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder durationInMillis(Long durationInMillis) {
            this.durationInMillis = durationInMillis;
            return this;
        }

        /**
         * <p>The CPU time consumed by the Spark application, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder estimateExecutionCpuTimeInSeconds(Long estimateExecutionCpuTimeInSeconds) {
            this.estimateExecutionCpuTimeInSeconds = estimateExecutionCpuTimeInSeconds;
            return this;
        }

        /**
         * <p>The execution duration.</p>
         * 
         * <strong>example:</strong>
         * <p>36000</p>
         */
        public Builder executionDurationInMillis(Long executionDurationInMillis) {
            this.executionDurationInMillis = executionDurationInMillis;
            return this;
        }

        /**
         * <p>The ID of the last retry of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202204291426hzpre60****-0003</p>
         */
        public Builder lastAttemptId(String lastAttemptId) {
            this.lastAttemptId = lastAttemptId;
            return this;
        }

        /**
         * <p>The time when the Spark application was last updated. This value is a UNIX timestamp, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1651213645200</p>
         */
        public Builder lastUpdatedTimeInMillis(Long lastUpdatedTimeInMillis) {
            this.lastUpdatedTimeInMillis = lastUpdatedTimeInMillis;
            return this;
        }

        /**
         * <p>The storage path of the log file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://<bucket-name>/logs/driver</p>
         */
        public Builder logRootPath(String logRootPath) {
            this.logRootPath = logRootPath;
            return this;
        }

        /**
         * <p>The name of the job resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-rg</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * <p>The duration of resource provisioning for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>36000</p>
         */
        public Builder resourceProvisioningDurationInMillis(Long resourceProvisioningDurationInMillis) {
            this.resourceProvisioningDurationInMillis = resourceProvisioningDurationInMillis;
            return this;
        }

        /**
         * <p>The timestamp when the job started running.</p>
         * 
         * <strong>example:</strong>
         * <p>36000</p>
         */
        public Builder runningStartTimeInMillis(Long runningStartTimeInMillis) {
            this.runningStartTimeInMillis = runningStartTimeInMillis;
            return this;
        }

        /**
         * <p>The time when the Spark application was created. This value is a UNIX timestamp, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1651213645010</p>
         */
        public Builder startedTimeInMillis(Long startedTimeInMillis) {
            this.startedTimeInMillis = startedTimeInMillis;
            return this;
        }

        /**
         * <p>The time when the Spark application was submitted. This value is a UNIX timestamp, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1651213645000</p>
         */
        public Builder submittedTimeInMillis(Long submittedTimeInMillis) {
            this.submittedTimeInMillis = submittedTimeInMillis;
            return this;
        }

        /**
         * <p>The time when the Spark application was terminated. This value is a UNIX timestamp, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1651213645300</p>
         */
        public Builder terminatedTimeInMillis(Long terminatedTimeInMillis) {
            this.terminatedTimeInMillis = terminatedTimeInMillis;
            return this;
        }

        /**
         * <p>The Web UI address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=">https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=</a>****</p>
         */
        public Builder webUiAddress(String webUiAddress) {
            this.webUiAddress = webUiAddress;
            return this;
        }

        public Detail build() {
            return new Detail(this);
        } 

    } 

}
