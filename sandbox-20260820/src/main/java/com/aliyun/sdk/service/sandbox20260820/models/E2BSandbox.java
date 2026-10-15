// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link E2BSandbox} extends {@link TeaModel}
 *
 * <p>E2BSandbox</p>
 */
public class E2BSandbox extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessEndpoint")
    private String accessEndpoint;

    @com.aliyun.core.annotation.NameInMap("allowInternetAccess")
    private Boolean allowInternetAccess;

    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("diskSizeMB")
    private Integer diskSizeMB;

    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("endAt")
    private String endAt;

    @com.aliyun.core.annotation.NameInMap("envVars")
    private java.util.Map<String, String> envVars;

    @com.aliyun.core.annotation.NameInMap("envdAccessToken")
    private String envdAccessToken;

    @com.aliyun.core.annotation.NameInMap("fcFunctionName")
    private String fcFunctionName;

    @com.aliyun.core.annotation.NameInMap("fcInstanceID")
    private String fcInstanceID;

    @com.aliyun.core.annotation.NameInMap("fcSessionID")
    private String fcSessionID;

    @com.aliyun.core.annotation.NameInMap("generation")
    private Integer generation;

    @com.aliyun.core.annotation.NameInMap("memoryMB")
    private Integer memoryMB;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, String> metadata;

    @com.aliyun.core.annotation.NameInMap("network")
    private E2BNetwork network;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("runtime")
    private InnerSandboxRuntimeConfig runtime;

    @com.aliyun.core.annotation.NameInMap("sandboxID")
    private String sandboxID;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    @com.aliyun.core.annotation.NameInMap("teamPlan")
    private String teamPlan;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    @com.aliyun.core.annotation.NameInMap("volumeMounts")
    private InnerSandboxVolumeMount volumeMounts;

    private E2BSandbox(Builder builder) {
        this.accessEndpoint = builder.accessEndpoint;
        this.allowInternetAccess = builder.allowInternetAccess;
        this.cpuCount = builder.cpuCount;
        this.diskSizeMB = builder.diskSizeMB;
        this.domain = builder.domain;
        this.endAt = builder.endAt;
        this.envVars = builder.envVars;
        this.envdAccessToken = builder.envdAccessToken;
        this.fcFunctionName = builder.fcFunctionName;
        this.fcInstanceID = builder.fcInstanceID;
        this.fcSessionID = builder.fcSessionID;
        this.generation = builder.generation;
        this.memoryMB = builder.memoryMB;
        this.metadata = builder.metadata;
        this.network = builder.network;
        this.resourceGroupID = builder.resourceGroupID;
        this.runtime = builder.runtime;
        this.sandboxID = builder.sandboxID;
        this.startedAt = builder.startedAt;
        this.state = builder.state;
        this.teamID = builder.teamID;
        this.teamName = builder.teamName;
        this.teamPlan = builder.teamPlan;
        this.templateID = builder.templateID;
        this.templateName = builder.templateName;
        this.userID = builder.userID;
        this.volumeMounts = builder.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BSandbox create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessEndpoint
     */
    public String getAccessEndpoint() {
        return this.accessEndpoint;
    }

    /**
     * @return allowInternetAccess
     */
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return diskSizeMB
     */
    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endAt
     */
    public String getEndAt() {
        return this.endAt;
    }

    /**
     * @return envVars
     */
    public java.util.Map<String, String> getEnvVars() {
        return this.envVars;
    }

    /**
     * @return envdAccessToken
     */
    public String getEnvdAccessToken() {
        return this.envdAccessToken;
    }

    /**
     * @return fcFunctionName
     */
    public String getFcFunctionName() {
        return this.fcFunctionName;
    }

    /**
     * @return fcInstanceID
     */
    public String getFcInstanceID() {
        return this.fcInstanceID;
    }

    /**
     * @return fcSessionID
     */
    public String getFcSessionID() {
        return this.fcSessionID;
    }

    /**
     * @return generation
     */
    public Integer getGeneration() {
        return this.generation;
    }

    /**
     * @return memoryMB
     */
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * @return network
     */
    public E2BNetwork getNetwork() {
        return this.network;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return runtime
     */
    public InnerSandboxRuntimeConfig getRuntime() {
        return this.runtime;
    }

    /**
     * @return sandboxID
     */
    public String getSandboxID() {
        return this.sandboxID;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return teamName
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * @return teamPlan
     */
    public String getTeamPlan() {
        return this.teamPlan;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    /**
     * @return volumeMounts
     */
    public InnerSandboxVolumeMount getVolumeMounts() {
        return this.volumeMounts;
    }

    public static final class Builder {
        private String accessEndpoint; 
        private Boolean allowInternetAccess; 
        private Integer cpuCount; 
        private Integer diskSizeMB; 
        private String domain; 
        private String endAt; 
        private java.util.Map<String, String> envVars; 
        private String envdAccessToken; 
        private String fcFunctionName; 
        private String fcInstanceID; 
        private String fcSessionID; 
        private Integer generation; 
        private Integer memoryMB; 
        private java.util.Map<String, String> metadata; 
        private E2BNetwork network; 
        private String resourceGroupID; 
        private InnerSandboxRuntimeConfig runtime; 
        private String sandboxID; 
        private String startedAt; 
        private String state; 
        private String teamID; 
        private String teamName; 
        private String teamPlan; 
        private String templateID; 
        private String templateName; 
        private String userID; 
        private InnerSandboxVolumeMount volumeMounts; 

        private Builder() {
        } 

        private Builder(E2BSandbox model) {
            this.accessEndpoint = model.accessEndpoint;
            this.allowInternetAccess = model.allowInternetAccess;
            this.cpuCount = model.cpuCount;
            this.diskSizeMB = model.diskSizeMB;
            this.domain = model.domain;
            this.endAt = model.endAt;
            this.envVars = model.envVars;
            this.envdAccessToken = model.envdAccessToken;
            this.fcFunctionName = model.fcFunctionName;
            this.fcInstanceID = model.fcInstanceID;
            this.fcSessionID = model.fcSessionID;
            this.generation = model.generation;
            this.memoryMB = model.memoryMB;
            this.metadata = model.metadata;
            this.network = model.network;
            this.resourceGroupID = model.resourceGroupID;
            this.runtime = model.runtime;
            this.sandboxID = model.sandboxID;
            this.startedAt = model.startedAt;
            this.state = model.state;
            this.teamID = model.teamID;
            this.teamName = model.teamName;
            this.teamPlan = model.teamPlan;
            this.templateID = model.templateID;
            this.templateName = model.templateName;
            this.userID = model.userID;
            this.volumeMounts = model.volumeMounts;
        } 

        /**
         * <p>The access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>sbx-xxxx.ap-southeast-1.sandbox.aliyun.com</p>
         */
        public Builder accessEndpoint(String accessEndpoint) {
            this.accessEndpoint = accessEndpoint;
            return this;
        }

        /**
         * <p>Specifies whether the sandbox is allowed to access external networks.</p>
         */
        public Builder allowInternetAccess(Boolean allowInternetAccess) {
            this.allowInternetAccess = allowInternetAccess;
            return this;
        }

        /**
         * <p>The vCPU specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * <p>The ephemeral disk specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder diskSizeMB(Integer diskSizeMB) {
            this.diskSizeMB = diskSizeMB;
            return this;
        }

        /**
         * <p>The access domain name of the sandbox.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1.sandbox.aliyun.com</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-04T02:03:43.826Z</p>
         */
        public Builder endAt(String endAt) {
            this.endAt = endAt;
            return this;
        }

        /**
         * <p>The environment variables.</p>
         */
        public Builder envVars(java.util.Map<String, String> envVars) {
            this.envVars = envVars;
            return this;
        }

        /**
         * <p>The authentication credential for accessing the envd daemon process inside the sandbox, in UUID format. Automatically generated only when secure is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>4b1e9d07-****</p>
         */
        public Builder envdAccessToken(String envdAccessToken) {
            this.envdAccessToken = envdAccessToken;
            return this;
        }

        /**
         * <p>The Function Compute function name.</p>
         * 
         * <strong>example:</strong>
         * <p>template-d391c80b5d1527de</p>
         */
        public Builder fcFunctionName(String fcFunctionName) {
            this.fcFunctionName = fcFunctionName;
            return this;
        }

        /**
         * <p>The Function Compute instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-6a9d1501-133e6f48-b3f07782dd47</p>
         */
        public Builder fcInstanceID(String fcInstanceID) {
            this.fcInstanceID = fcInstanceID;
            return this;
        }

        /**
         * <p>The Function Compute session ID corresponding to the sandbox, in UUID format. Used to locate the underlying session when pausing, resuming, or deleting the sandbox.</p>
         * 
         * <strong>example:</strong>
         * <p>3a7ecd09-****</p>
         */
        public Builder fcSessionID(String fcSessionID) {
            this.fcSessionID = fcSessionID;
            return this;
        }

        /**
         * <p>The sandbox version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder generation(Integer generation) {
            this.generation = generation;
            return this;
        }

        /**
         * <p>The memory specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder memoryMB(Integer memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        /**
         * <p>The metadata configuration.</p>
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The network configuration.</p>
         */
        public Builder network(E2BNetwork network) {
            this.network = network;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-****</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The runtime configuration.</p>
         */
        public Builder runtime(InnerSandboxRuntimeConfig runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The unique identifier of the sandbox.</p>
         * 
         * <strong>example:</strong>
         * <p>sbx-xxxx</p>
         */
        public Builder sandboxID(String sandboxID) {
            this.sandboxID = sandboxID;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-04T02:02:43.826Z</p>
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * <p>The sandbox status. Valid values:</p>
         * <ul>
         * <li>running: Running.</li>
         * <li>pausing: Pausing.</li>
         * <li>paused: Paused.</li>
         * <li>resuming: Resuming.</li>
         * <li>pause_fail: Pause failed.</li>
         * <li>resume_fail: Resume failed.</li>
         * <li>snapshotting: Creating a snapshot.</li>
         * <li>snapshot_failed: Snapshot creation failed.</li>
         * <li>terminated: Terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The unique identifier of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>eea033af-****</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * <p>The QoS version.</p>
         * 
         * <strong>example:</strong>
         * <p>eco</p>
         */
        public Builder teamPlan(String teamPlan) {
            this.teamPlan = teamPlan;
            return this;
        }

        /**
         * <p>The unique identifier of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>v9vjyzw64bsu83vw0dgs</p>
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>base</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>2000****</p>
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        /**
         * <p>The mount configuration.</p>
         */
        public Builder volumeMounts(InnerSandboxVolumeMount volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public E2BSandbox build() {
            return new E2BSandbox(this);
        } 

    } 

}
