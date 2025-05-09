// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DatasetJob} extends {@link TeaModel}
 *
 * <p>DatasetJob</p>
 */
public class DatasetJob extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompletedFileCount")
    private Long completedFileCount;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatasetJobId")
    private String datasetJobId;

    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("FailedFileCount")
    private Long failedFileCount;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("JobAction")
    private String jobAction;

    @com.aliyun.core.annotation.NameInMap("JobMode")
    private String jobMode;

    @com.aliyun.core.annotation.NameInMap("JobSpec")
    private String jobSpec;

    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<String> logs;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalFileCount")
    private Long totalFileCount;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DatasetJob(Builder builder) {
        this.completedFileCount = builder.completedFileCount;
        this.createTime = builder.createTime;
        this.datasetJobId = builder.datasetJobId;
        this.datasetVersion = builder.datasetVersion;
        this.description = builder.description;
        this.failedFileCount = builder.failedFileCount;
        this.finishTime = builder.finishTime;
        this.jobAction = builder.jobAction;
        this.jobMode = builder.jobMode;
        this.jobSpec = builder.jobSpec;
        this.logs = builder.logs;
        this.status = builder.status;
        this.totalFileCount = builder.totalFileCount;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetJob create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return completedFileCount
     */
    public Long getCompletedFileCount() {
        return this.completedFileCount;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return datasetJobId
     */
    public String getDatasetJobId() {
        return this.datasetJobId;
    }

    /**
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return failedFileCount
     */
    public Long getFailedFileCount() {
        return this.failedFileCount;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return jobAction
     */
    public String getJobAction() {
        return this.jobAction;
    }

    /**
     * @return jobMode
     */
    public String getJobMode() {
        return this.jobMode;
    }

    /**
     * @return jobSpec
     */
    public String getJobSpec() {
        return this.jobSpec;
    }

    /**
     * @return logs
     */
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalFileCount
     */
    public Long getTotalFileCount() {
        return this.totalFileCount;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private Long completedFileCount; 
        private String createTime; 
        private String datasetJobId; 
        private String datasetVersion; 
        private String description; 
        private Long failedFileCount; 
        private String finishTime; 
        private String jobAction; 
        private String jobMode; 
        private String jobSpec; 
        private java.util.List<String> logs; 
        private String status; 
        private Long totalFileCount; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(DatasetJob model) {
            this.completedFileCount = model.completedFileCount;
            this.createTime = model.createTime;
            this.datasetJobId = model.datasetJobId;
            this.datasetVersion = model.datasetVersion;
            this.description = model.description;
            this.failedFileCount = model.failedFileCount;
            this.finishTime = model.finishTime;
            this.jobAction = model.jobAction;
            this.jobMode = model.jobMode;
            this.jobSpec = model.jobSpec;
            this.logs = model.logs;
            this.status = model.status;
            this.totalFileCount = model.totalFileCount;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * CompletedFileCount.
         */
        public Builder completedFileCount(Long completedFileCount) {
            this.completedFileCount = completedFileCount;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DatasetJobId.
         */
        public Builder datasetJobId(String datasetJobId) {
            this.datasetJobId = datasetJobId;
            return this;
        }

        /**
         * DatasetVersion.
         */
        public Builder datasetVersion(String datasetVersion) {
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * FailedFileCount.
         */
        public Builder failedFileCount(Long failedFileCount) {
            this.failedFileCount = failedFileCount;
            return this;
        }

        /**
         * FinishTime.
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * JobAction.
         */
        public Builder jobAction(String jobAction) {
            this.jobAction = jobAction;
            return this;
        }

        /**
         * JobMode.
         */
        public Builder jobMode(String jobMode) {
            this.jobMode = jobMode;
            return this;
        }

        /**
         * JobSpec.
         */
        public Builder jobSpec(String jobSpec) {
            this.jobSpec = jobSpec;
            return this;
        }

        /**
         * Logs.
         */
        public Builder logs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TotalFileCount.
         */
        public Builder totalFileCount(Long totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public DatasetJob build() {
            return new DatasetJob(this);
        } 

    } 

}
