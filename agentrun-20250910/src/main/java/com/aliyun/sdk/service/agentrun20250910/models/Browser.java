// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link Browser} extends {@link TeaModel}
 *
 * <p>Browser</p>
 */
public class Browser extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("browserId")
    private String browserId;

    @com.aliyun.core.annotation.NameInMap("browserName")
    private String browserName;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("credentialId")
    private String credentialId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("recording")
    private BrowserRecordingConfiguration recording;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private Browser(Builder builder) {
        this.browserId = builder.browserId;
        this.browserName = builder.browserName;
        this.cpu = builder.cpu;
        this.createdAt = builder.createdAt;
        this.credentialId = builder.credentialId;
        this.description = builder.description;
        this.executionRoleArn = builder.executionRoleArn;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.memory = builder.memory;
        this.networkConfiguration = builder.networkConfiguration;
        this.recording = builder.recording;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Browser create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserId
     */
    public String getBrowserId() {
        return this.browserId;
    }

    /**
     * @return browserName
     */
    public String getBrowserName() {
        return this.browserName;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executionRoleArn
     */
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return networkConfiguration
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @return recording
     */
    public BrowserRecordingConfiguration getRecording() {
        return this.recording;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder {
        private String browserId; 
        private String browserName; 
        private Float cpu; 
        private String createdAt; 
        private String credentialId; 
        private String description; 
        private String executionRoleArn; 
        private String lastUpdatedAt; 
        private Integer memory; 
        private NetworkConfiguration networkConfiguration; 
        private BrowserRecordingConfiguration recording; 
        private String status; 
        private String statusReason; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(Browser model) {
            this.browserId = model.browserId;
            this.browserName = model.browserName;
            this.cpu = model.cpu;
            this.createdAt = model.createdAt;
            this.credentialId = model.credentialId;
            this.description = model.description;
            this.executionRoleArn = model.executionRoleArn;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.memory = model.memory;
            this.networkConfiguration = model.networkConfiguration;
            this.recording = model.recording;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.tenantId = model.tenantId;
        } 

        /**
         * browserId.
         */
        public Builder browserId(String browserId) {
            this.browserId = browserId;
            return this;
        }

        /**
         * browserName.
         */
        public Builder browserName(String browserName) {
            this.browserName = browserName;
            return this;
        }

        /**
         * cpu.
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * credentialId.
         */
        public Builder credentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * executionRoleArn.
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * lastUpdatedAt.
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * <p>内存资源配置（单位：MB）</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * networkConfiguration.
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * recording.
         */
        public Builder recording(BrowserRecordingConfiguration recording) {
            this.recording = recording;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>当前状态的原因说明（如适用）</p>
         * 
         * <strong>example:</strong>
         * <p>Browser is ready for use</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Browser build() {
            return new Browser(this);
        } 

    } 

}
