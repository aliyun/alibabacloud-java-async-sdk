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
 * {@link AgentPlatformJob} extends {@link TeaModel}
 *
 * <p>AgentPlatformJob</p>
 */
public class AgentPlatformJob extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentJobId")
    private String agentJobId;

    @com.aliyun.core.annotation.NameInMap("Attempt")
    private Long attempt;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("DurationMs")
    private Long durationMs;

    @com.aliyun.core.annotation.NameInMap("FinishedAt")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("SandboxId")
    private String sandboxId;

    @com.aliyun.core.annotation.NameInMap("SandboxInfo")
    private AgentSandboxInfo sandboxInfo;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.NameInMap("Template")
    private String template;

    private AgentPlatformJob(Builder builder) {
        this.agentJobId = builder.agentJobId;
        this.attempt = builder.attempt;
        this.createdAt = builder.createdAt;
        this.durationMs = builder.durationMs;
        this.finishedAt = builder.finishedAt;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.sandboxId = builder.sandboxId;
        this.sandboxInfo = builder.sandboxInfo;
        this.status = builder.status;
        this.tags = builder.tags;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentPlatformJob create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentJobId
     */
    public String getAgentJobId() {
        return this.agentJobId;
    }

    /**
     * @return attempt
     */
    public Long getAttempt() {
        return this.attempt;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return durationMs
     */
    public Long getDurationMs() {
        return this.durationMs;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return sandboxId
     */
    public String getSandboxId() {
        return this.sandboxId;
    }

    /**
     * @return sandboxInfo
     */
    public AgentSandboxInfo getSandboxInfo() {
        return this.sandboxInfo;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String agentJobId; 
        private Long attempt; 
        private String createdAt; 
        private Long durationMs; 
        private String finishedAt; 
        private String instanceId; 
        private String jobId; 
        private String sandboxId; 
        private AgentSandboxInfo sandboxInfo; 
        private String status; 
        private java.util.List<String> tags; 
        private String template; 

        private Builder() {
        } 

        private Builder(AgentPlatformJob model) {
            this.agentJobId = model.agentJobId;
            this.attempt = model.attempt;
            this.createdAt = model.createdAt;
            this.durationMs = model.durationMs;
            this.finishedAt = model.finishedAt;
            this.instanceId = model.instanceId;
            this.jobId = model.jobId;
            this.sandboxId = model.sandboxId;
            this.sandboxInfo = model.sandboxInfo;
            this.status = model.status;
            this.tags = model.tags;
            this.template = model.template;
        } 

        /**
         * <p>The ID of the AP task.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-job-example</p>
         */
        public Builder agentJobId(String agentJobId) {
            this.agentJobId = agentJobId;
            return this;
        }

        /**
         * <p>The attempt number of the current task.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder attempt(Long attempt) {
            this.attempt = attempt;
            return this;
        }

        /**
         * <p>The creation time in UTC RFC3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-30T06:00:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The execution duration of the current attempt in milliseconds. This value is returned only when the task is in a terminal state and both the completion time and execution duration are valid. Otherwise, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1250</p>
         */
        public Builder durationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }

        /**
         * <p>The completion time in UTC RFC3339 format. Returns null if the task is not in a terminal state or the completion time is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-30T06:00:01.250Z</p>
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * <p>The ID of the AP task instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sample-001</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the DLC job to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc5yfk7eyg95lac</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The sandbox ID of the current attempt. Returns null if no matching information is found.</p>
         * 
         * <strong>example:</strong>
         * <p>sandbox-example</p>
         */
        public Builder sandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            return this;
        }

        /**
         * <p>The sandbox resource summary of the current attempt. Returns null if no matching information is found.</p>
         */
        public Builder sandboxInfo(AgentSandboxInfo sandboxInfo) {
            this.sandboxInfo = sandboxInfo;
            return this;
        }

        /**
         * <p>The status of the AP task.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The AP task tags, returned in the original content and order. Returns [] if the value is missing, null, or an empty array.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;scenario:swe&quot;]</p>
         */
        public Builder tags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The name of the AP template.</p>
         * 
         * <strong>example:</strong>
         * <p>swe-bench</p>
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        public AgentPlatformJob build() {
            return new AgentPlatformJob(this);
        } 

    } 

}
