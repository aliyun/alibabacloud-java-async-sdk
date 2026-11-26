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
 * {@link RLJobItem} extends {@link TeaModel}
 *
 * <p>RLJobItem</p>
 */
public class RLJobItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @com.aliyun.core.annotation.NameInMap("GmtRunningTime")
    private String gmtRunningTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("Models")
    private java.util.List<RLJobModelConfig> models;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("Settings")
    private RLJobSettings settings;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubStatus")
    private String subStatus;

    @com.aliyun.core.annotation.NameInMap("TrainerMode")
    private String trainerMode;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private RLJobItem(Builder builder) {
        this.algorithm = builder.algorithm;
        this.displayName = builder.displayName;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtRunningTime = builder.gmtRunningTime;
        this.jobId = builder.jobId;
        this.jobType = builder.jobType;
        this.models = builder.models;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.resourceId = builder.resourceId;
        this.settings = builder.settings;
        this.status = builder.status;
        this.subStatus = builder.subStatus;
        this.trainerMode = builder.trainerMode;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
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
     * @return gmtRunningTime
     */
    public String getGmtRunningTime() {
        return this.gmtRunningTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return models
     */
    public java.util.List<RLJobModelConfig> getModels() {
        return this.models;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return settings
     */
    public RLJobSettings getSettings() {
        return this.settings;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subStatus
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    /**
     * @return trainerMode
     */
    public String getTrainerMode() {
        return this.trainerMode;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String algorithm; 
        private String displayName; 
        private String gmtCreateTime; 
        private String gmtFinishTime; 
        private String gmtRunningTime; 
        private String jobId; 
        private String jobType; 
        private java.util.List<RLJobModelConfig> models; 
        private String reasonCode; 
        private String reasonMessage; 
        private String resourceId; 
        private RLJobSettings settings; 
        private String status; 
        private String subStatus; 
        private String trainerMode; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(RLJobItem model) {
            this.algorithm = model.algorithm;
            this.displayName = model.displayName;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtFinishTime = model.gmtFinishTime;
            this.gmtRunningTime = model.gmtRunningTime;
            this.jobId = model.jobId;
            this.jobType = model.jobType;
            this.models = model.models;
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.resourceId = model.resourceId;
            this.settings = model.settings;
            this.status = model.status;
            this.subStatus = model.subStatus;
            this.trainerMode = model.trainerMode;
            this.userId = model.userId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>grpo</p>
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>swebench-lite-grpo-qwen27b</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The creation time in UTC RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T07:00:00Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The end time in the UTC RFC 3339 format. This is consistent with the DLC GetJob operation. The job end time is used first. If the job end time is missing, the stop time is used. If both are missing, this field is not returned. The same value rule applies to sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T09:30:00Z</p>
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * <p>The start time in UTC RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T07:05:00Z</p>
         */
        public Builder gmtRunningTime(String gmtRunningTime) {
            this.gmtRunningTime = gmtRunningTime;
            return this;
        }

        /**
         * <p>The RLJob ID. This field is required and always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc5yfk7eyg95lac</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The job type. Valid value: Train.</p>
         * 
         * <strong>example:</strong>
         * <p>Train</p>
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The model names and in-container paths associated with the job.</p>
         */
        public Builder models(java.util.List<RLJobModelConfig> models) {
            this.models = models;
            return this;
        }

        /**
         * <p>The reason code. This is an independent field and must not be parsed from the ReasonMessage text.</p>
         * 
         * <strong>example:</strong>
         * <p>JobStoppedByUser</p>
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * <p>The reason description.</p>
         * 
         * <strong>example:</strong>
         * <p>Job is stopped by user.</p>
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * <p>The job-level resource group or quota ID persisted in the current job record. This is consistent with DLC GetJob and GetRLJob, and is not the original request value. It is returned from the job record even if the execution snapshot is unreadable.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-quota</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The job configuration summary. Uses a supported subset of DLC JobSettings fields. The list returns only the current job tags in Settings.Tags. For the complete configuration, call GetRLJob.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Tags&quot;:{&quot;rls.scene&quot;:&quot;code-rl&quot;}}</p>
         */
        public Builder settings(RLJobSettings settings) {
            this.settings = settings;
            return this;
        }

        /**
         * <p>The job status. Uses the same vocabulary as DLC ValidJobStatus: Creating, Queuing, Running, Stopping, Succeeded, Failed, or Stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The substatus. Examples include Evaluating, WritingResults, EarlyStopped, Validating, Deleting, and Archived.</p>
         * 
         * <strong>example:</strong>
         * <p>Evaluating</p>
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        /**
         * <p>The training and sampling execution mode that takes effect for the job. Valid values: ColocateSync and DisaggregateAsync.</p>
         * 
         * <strong>example:</strong>
         * <p>ColocateSync</p>
         */
        public Builder trainerMode(String trainerMode) {
            this.trainerMode = trainerMode;
            return this;
        }

        /**
         * <p>The ID of the user who submitted the job. This has the same meaning as UserId in DLC.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-20210126170216-mtl37ge7gkvdz</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public RLJobItem build() {
            return new RLJobItem(this);
        } 

    } 

}
