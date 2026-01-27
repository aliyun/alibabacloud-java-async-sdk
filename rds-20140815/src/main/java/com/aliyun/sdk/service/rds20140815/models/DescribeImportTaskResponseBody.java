// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeImportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImportTaskResponseBody</p>
 */
public class DescribeImportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.NameInMap("DbVersion")
    private String dbVersion;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceCategory")
    private String sourceCategory;

    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.NameInMap("SourcePort")
    private String sourcePort;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TargetInstanceName")
    private String targetInstanceName;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private DescribeImportTaskResponseBody(Builder builder) {
        this.account = builder.account;
        this.dbVersion = builder.dbVersion;
        this.detail = builder.detail;
        this.requestId = builder.requestId;
        this.sourceCategory = builder.sourceCategory;
        this.sourceIp = builder.sourceIp;
        this.sourcePort = builder.sourcePort;
        this.status = builder.status;
        this.targetInstanceName = builder.targetInstanceName;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImportTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return dbVersion
     */
    public String getDbVersion() {
        return this.dbVersion;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceCategory
     */
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return sourcePort
     */
    public String getSourcePort() {
        return this.sourcePort;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return targetInstanceName
     */
    public String getTargetInstanceName() {
        return this.targetInstanceName;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private String account; 
        private String dbVersion; 
        private String detail; 
        private String requestId; 
        private String sourceCategory; 
        private String sourceIp; 
        private String sourcePort; 
        private String status; 
        private String targetInstanceName; 
        private Long taskId; 
        private String taskName; 
        private String taskType; 

        private Builder() {
        } 

        private Builder(DescribeImportTaskResponseBody model) {
            this.account = model.account;
            this.dbVersion = model.dbVersion;
            this.detail = model.detail;
            this.requestId = model.requestId;
            this.sourceCategory = model.sourceCategory;
            this.sourceIp = model.sourceIp;
            this.sourcePort = model.sourcePort;
            this.status = model.status;
            this.targetInstanceName = model.targetInstanceName;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
            this.taskType = model.taskType;
        } 

        /**
         * Account.
         */
        public Builder account(String account) {
            this.account = account;
            return this;
        }

        /**
         * DbVersion.
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.detail = detail;
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
         * SourceCategory.
         */
        public Builder sourceCategory(String sourceCategory) {
            this.sourceCategory = sourceCategory;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * SourcePort.
         */
        public Builder sourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
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
         * TargetInstanceName.
         */
        public Builder targetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public DescribeImportTaskResponseBody build() {
            return new DescribeImportTaskResponseBody(this);
        } 

    } 

}
