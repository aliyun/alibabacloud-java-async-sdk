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
 * {@link GetDatasetJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetJobResponseBody</p>
 */
public class GetDatasetJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompletedFileCount")
    private Long completedFileCount;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalFileCount")
    private Long totalFileCount;

    private GetDatasetJobResponseBody(Builder builder) {
        this.completedFileCount = builder.completedFileCount;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.failedFileCount = builder.failedFileCount;
        this.finishTime = builder.finishTime;
        this.jobAction = builder.jobAction;
        this.jobMode = builder.jobMode;
        this.jobSpec = builder.jobSpec;
        this.logs = builder.logs;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.totalFileCount = builder.totalFileCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetJobResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private Long completedFileCount; 
        private String createTime; 
        private String description; 
        private Long failedFileCount; 
        private String finishTime; 
        private String jobAction; 
        private String jobMode; 
        private String jobSpec; 
        private java.util.List<String> logs; 
        private String requestId; 
        private String status; 
        private Long totalFileCount; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetDatasetJobResponseBody build() {
            return new GetDatasetJobResponseBody(this);
        } 

    } 

}
