// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link Tensorboard} extends {@link TeaModel}
 *
 * <p>Tensorboard</p>
 */
public class Tensorboard extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Long cpu;

    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("MaxRunningTimeMinutes")
    private Long maxRunningTimeMinutes;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Long memory;

    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SummaryPath")
    private String summaryPath;

    @com.aliyun.core.annotation.NameInMap("SummaryRelativePath")
    private String summaryRelativePath;

    @com.aliyun.core.annotation.NameInMap("TensorboardDataSources")
    private java.util.List<TensorboardDataSourceSpec> tensorboardDataSources;

    @com.aliyun.core.annotation.NameInMap("TensorboardId")
    private String tensorboardId;

    @com.aliyun.core.annotation.NameInMap("TensorboardSpec")
    private TensorboardSpec tensorboardSpec;

    @com.aliyun.core.annotation.NameInMap("TensorboardUrl")
    private String tensorboardUrl;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private Tensorboard(Builder builder) {
        this.accessibility = builder.accessibility;
        this.cpu = builder.cpu;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceType = builder.dataSourceType;
        this.displayName = builder.displayName;
        this.duration = builder.duration;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.jobId = builder.jobId;
        this.maxRunningTimeMinutes = builder.maxRunningTimeMinutes;
        this.memory = builder.memory;
        this.options = builder.options;
        this.priority = builder.priority;
        this.quotaId = builder.quotaId;
        this.quotaName = builder.quotaName;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.summaryPath = builder.summaryPath;
        this.summaryRelativePath = builder.summaryRelativePath;
        this.tensorboardDataSources = builder.tensorboardDataSources;
        this.tensorboardId = builder.tensorboardId;
        this.tensorboardSpec = builder.tensorboardSpec;
        this.tensorboardUrl = builder.tensorboardUrl;
        this.token = builder.token;
        this.userId = builder.userId;
        this.username = builder.username;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Tensorboard create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return cpu
     */
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtFinishTime
     */
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return maxRunningTimeMinutes
     */
    public Long getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

    /**
     * @return memory
     */
    public Long getMemory() {
        return this.memory;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
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
     * @return summaryPath
     */
    public String getSummaryPath() {
        return this.summaryPath;
    }

    /**
     * @return summaryRelativePath
     */
    public String getSummaryRelativePath() {
        return this.summaryRelativePath;
    }

    /**
     * @return tensorboardDataSources
     */
    public java.util.List<TensorboardDataSourceSpec> getTensorboardDataSources() {
        return this.tensorboardDataSources;
    }

    /**
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    /**
     * @return tensorboardSpec
     */
    public TensorboardSpec getTensorboardSpec() {
        return this.tensorboardSpec;
    }

    /**
     * @return tensorboardUrl
     */
    public String getTensorboardUrl() {
        return this.tensorboardUrl;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private Long cpu; 
        private String dataSourceId; 
        private String dataSourceType; 
        private String displayName; 
        private String duration; 
        private String gmtCreateTime; 
        private String gmtFinishTime; 
        private String gmtModifyTime; 
        private String jobId; 
        private Long maxRunningTimeMinutes; 
        private Long memory; 
        private String options; 
        private String priority; 
        private String quotaId; 
        private String quotaName; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private String status; 
        private String summaryPath; 
        private String summaryRelativePath; 
        private java.util.List<TensorboardDataSourceSpec> tensorboardDataSources; 
        private String tensorboardId; 
        private TensorboardSpec tensorboardSpec; 
        private String tensorboardUrl; 
        private String token; 
        private String userId; 
        private String username; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Tensorboard model) {
            this.accessibility = model.accessibility;
            this.cpu = model.cpu;
            this.dataSourceId = model.dataSourceId;
            this.dataSourceType = model.dataSourceType;
            this.displayName = model.displayName;
            this.duration = model.duration;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtFinishTime = model.gmtFinishTime;
            this.gmtModifyTime = model.gmtModifyTime;
            this.jobId = model.jobId;
            this.maxRunningTimeMinutes = model.maxRunningTimeMinutes;
            this.memory = model.memory;
            this.options = model.options;
            this.priority = model.priority;
            this.quotaId = model.quotaId;
            this.quotaName = model.quotaName;
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.requestId = model.requestId;
            this.status = model.status;
            this.summaryPath = model.summaryPath;
            this.summaryRelativePath = model.summaryRelativePath;
            this.tensorboardDataSources = model.tensorboardDataSources;
            this.tensorboardId = model.tensorboardId;
            this.tensorboardSpec = model.tensorboardSpec;
            this.tensorboardUrl = model.tensorboardUrl;
            this.token = model.token;
            this.userId = model.userId;
            this.username = model.username;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Cpu.
         */
        public Builder cpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtFinishTime.
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * GmtModifyTime.
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * MaxRunningTimeMinutes.
         */
        public Builder maxRunningTimeMinutes(Long maxRunningTimeMinutes) {
            this.maxRunningTimeMinutes = maxRunningTimeMinutes;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Long memory) {
            this.memory = memory;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * QuotaName.
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        /**
         * ReasonCode.
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ReasonMessage.
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
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
         * SummaryPath.
         */
        public Builder summaryPath(String summaryPath) {
            this.summaryPath = summaryPath;
            return this;
        }

        /**
         * SummaryRelativePath.
         */
        public Builder summaryRelativePath(String summaryRelativePath) {
            this.summaryRelativePath = summaryRelativePath;
            return this;
        }

        /**
         * TensorboardDataSources.
         */
        public Builder tensorboardDataSources(java.util.List<TensorboardDataSourceSpec> tensorboardDataSources) {
            this.tensorboardDataSources = tensorboardDataSources;
            return this;
        }

        /**
         * TensorboardId.
         */
        public Builder tensorboardId(String tensorboardId) {
            this.tensorboardId = tensorboardId;
            return this;
        }

        /**
         * TensorboardSpec.
         */
        public Builder tensorboardSpec(TensorboardSpec tensorboardSpec) {
            this.tensorboardSpec = tensorboardSpec;
            return this;
        }

        /**
         * TensorboardUrl.
         */
        public Builder tensorboardUrl(String tensorboardUrl) {
            this.tensorboardUrl = tensorboardUrl;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Tensorboard build() {
            return new Tensorboard(this);
        } 

    } 

}
