// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetRayJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetRayJobResponseBody</p>
 */
public class GetRayJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("activeDeadlineSeconds")
    private Integer activeDeadlineSeconds;

    @com.aliyun.core.annotation.NameInMap("backoffLimit")
    private Integer backoffLimit;

    @com.aliyun.core.annotation.NameInMap("clusterState")
    private String clusterState;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("cuHours")
    private Double cuHours;

    @com.aliyun.core.annotation.NameInMap("dashboardUrl")
    private String dashboardUrl;

    @com.aliyun.core.annotation.NameInMap("dashboardUrlExtra")
    private java.util.List<String> dashboardUrlExtra;

    @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
    private String displayReleaseVersion;

    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("entrypoint")
    private String entrypoint;

    @com.aliyun.core.annotation.NameInMap("entrypointMemory")
    private String entrypointMemory;

    @com.aliyun.core.annotation.NameInMap("entrypointNumCpus")
    private String entrypointNumCpus;

    @com.aliyun.core.annotation.NameInMap("entrypointNumGpus")
    private String entrypointNumGpus;

    @com.aliyun.core.annotation.NameInMap("entrypointResources")
    private String entrypointResources;

    @com.aliyun.core.annotation.NameInMap("extraParam")
    private String extraParam;

    @com.aliyun.core.annotation.NameInMap("guHours")
    private GuHours guHours;

    @com.aliyun.core.annotation.NameInMap("headSpec")
    private HeadSpec headSpec;

    @com.aliyun.core.annotation.NameInMap("logBucketName")
    private String logBucketName;

    @com.aliyun.core.annotation.NameInMap("logPath")
    private String logPath;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("metadataJson")
    private String metadataJson;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("networkServiceName")
    private String networkServiceName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("runtimeEnvJson")
    private String runtimeEnvJson;

    @com.aliyun.core.annotation.NameInMap("shutdownAfterJobFinishes")
    private Boolean shutdownAfterJobFinishes;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("submissionId")
    private String submissionId;

    @com.aliyun.core.annotation.NameInMap("submissionMode")
    private String submissionMode;

    @com.aliyun.core.annotation.NameInMap("submitTime")
    private Long submitTime;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tag> tags;

    @com.aliyun.core.annotation.NameInMap("taskBizId")
    private String taskBizId;

    @com.aliyun.core.annotation.NameInMap("ttlSecondsAfterFinished")
    private Integer ttlSecondsAfterFinished;

    @com.aliyun.core.annotation.NameInMap("volumeIds")
    private java.util.List<String> volumeIds;

    @com.aliyun.core.annotation.NameInMap("workerSpecs")
    private java.util.List<WorkerSpecs> workerSpecs;

    @com.aliyun.core.annotation.NameInMap("workingDir")
    private String workingDir;

    private GetRayJobResponseBody(Builder builder) {
        this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
        this.backoffLimit = builder.backoffLimit;
        this.clusterState = builder.clusterState;
        this.creatorName = builder.creatorName;
        this.cuHours = builder.cuHours;
        this.dashboardUrl = builder.dashboardUrl;
        this.dashboardUrlExtra = builder.dashboardUrlExtra;
        this.displayReleaseVersion = builder.displayReleaseVersion;
        this.duration = builder.duration;
        this.endTime = builder.endTime;
        this.entrypoint = builder.entrypoint;
        this.entrypointMemory = builder.entrypointMemory;
        this.entrypointNumCpus = builder.entrypointNumCpus;
        this.entrypointNumGpus = builder.entrypointNumGpus;
        this.entrypointResources = builder.entrypointResources;
        this.extraParam = builder.extraParam;
        this.guHours = builder.guHours;
        this.headSpec = builder.headSpec;
        this.logBucketName = builder.logBucketName;
        this.logPath = builder.logPath;
        this.message = builder.message;
        this.metadataJson = builder.metadataJson;
        this.name = builder.name;
        this.networkServiceName = builder.networkServiceName;
        this.requestId = builder.requestId;
        this.runtimeEnvJson = builder.runtimeEnvJson;
        this.shutdownAfterJobFinishes = builder.shutdownAfterJobFinishes;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.submissionId = builder.submissionId;
        this.submissionMode = builder.submissionMode;
        this.submitTime = builder.submitTime;
        this.tags = builder.tags;
        this.taskBizId = builder.taskBizId;
        this.ttlSecondsAfterFinished = builder.ttlSecondsAfterFinished;
        this.volumeIds = builder.volumeIds;
        this.workerSpecs = builder.workerSpecs;
        this.workingDir = builder.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRayJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeDeadlineSeconds
     */
    public Integer getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    /**
     * @return backoffLimit
     */
    public Integer getBackoffLimit() {
        return this.backoffLimit;
    }

    /**
     * @return clusterState
     */
    public String getClusterState() {
        return this.clusterState;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
    }

    /**
     * @return cuHours
     */
    public Double getCuHours() {
        return this.cuHours;
    }

    /**
     * @return dashboardUrl
     */
    public String getDashboardUrl() {
        return this.dashboardUrl;
    }

    /**
     * @return dashboardUrlExtra
     */
    public java.util.List<String> getDashboardUrlExtra() {
        return this.dashboardUrlExtra;
    }

    /**
     * @return displayReleaseVersion
     */
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return entrypoint
     */
    public String getEntrypoint() {
        return this.entrypoint;
    }

    /**
     * @return entrypointMemory
     */
    public String getEntrypointMemory() {
        return this.entrypointMemory;
    }

    /**
     * @return entrypointNumCpus
     */
    public String getEntrypointNumCpus() {
        return this.entrypointNumCpus;
    }

    /**
     * @return entrypointNumGpus
     */
    public String getEntrypointNumGpus() {
        return this.entrypointNumGpus;
    }

    /**
     * @return entrypointResources
     */
    public String getEntrypointResources() {
        return this.entrypointResources;
    }

    /**
     * @return extraParam
     */
    public String getExtraParam() {
        return this.extraParam;
    }

    /**
     * @return guHours
     */
    public GuHours getGuHours() {
        return this.guHours;
    }

    /**
     * @return headSpec
     */
    public HeadSpec getHeadSpec() {
        return this.headSpec;
    }

    /**
     * @return logBucketName
     */
    public String getLogBucketName() {
        return this.logBucketName;
    }

    /**
     * @return logPath
     */
    public String getLogPath() {
        return this.logPath;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metadataJson
     */
    public String getMetadataJson() {
        return this.metadataJson;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkServiceName
     */
    public String getNetworkServiceName() {
        return this.networkServiceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runtimeEnvJson
     */
    public String getRuntimeEnvJson() {
        return this.runtimeEnvJson;
    }

    /**
     * @return shutdownAfterJobFinishes
     */
    public Boolean getShutdownAfterJobFinishes() {
        return this.shutdownAfterJobFinishes;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return submissionId
     */
    public String getSubmissionId() {
        return this.submissionId;
    }

    /**
     * @return submissionMode
     */
    public String getSubmissionMode() {
        return this.submissionMode;
    }

    /**
     * @return submitTime
     */
    public Long getSubmitTime() {
        return this.submitTime;
    }

    /**
     * @return tags
     */
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    /**
     * @return taskBizId
     */
    public String getTaskBizId() {
        return this.taskBizId;
    }

    /**
     * @return ttlSecondsAfterFinished
     */
    public Integer getTtlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished;
    }

    /**
     * @return volumeIds
     */
    public java.util.List<String> getVolumeIds() {
        return this.volumeIds;
    }

    /**
     * @return workerSpecs
     */
    public java.util.List<WorkerSpecs> getWorkerSpecs() {
        return this.workerSpecs;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder {
        private Integer activeDeadlineSeconds; 
        private Integer backoffLimit; 
        private String clusterState; 
        private String creatorName; 
        private Double cuHours; 
        private String dashboardUrl; 
        private java.util.List<String> dashboardUrlExtra; 
        private String displayReleaseVersion; 
        private Long duration; 
        private Long endTime; 
        private String entrypoint; 
        private String entrypointMemory; 
        private String entrypointNumCpus; 
        private String entrypointNumGpus; 
        private String entrypointResources; 
        private String extraParam; 
        private GuHours guHours; 
        private HeadSpec headSpec; 
        private String logBucketName; 
        private String logPath; 
        private String message; 
        private String metadataJson; 
        private String name; 
        private String networkServiceName; 
        private String requestId; 
        private String runtimeEnvJson; 
        private Boolean shutdownAfterJobFinishes; 
        private Long startTime; 
        private String status; 
        private String submissionId; 
        private String submissionMode; 
        private Long submitTime; 
        private java.util.List<Tag> tags; 
        private String taskBizId; 
        private Integer ttlSecondsAfterFinished; 
        private java.util.List<String> volumeIds; 
        private java.util.List<WorkerSpecs> workerSpecs; 
        private String workingDir; 

        private Builder() {
        } 

        private Builder(GetRayJobResponseBody model) {
            this.activeDeadlineSeconds = model.activeDeadlineSeconds;
            this.backoffLimit = model.backoffLimit;
            this.clusterState = model.clusterState;
            this.creatorName = model.creatorName;
            this.cuHours = model.cuHours;
            this.dashboardUrl = model.dashboardUrl;
            this.dashboardUrlExtra = model.dashboardUrlExtra;
            this.displayReleaseVersion = model.displayReleaseVersion;
            this.duration = model.duration;
            this.endTime = model.endTime;
            this.entrypoint = model.entrypoint;
            this.entrypointMemory = model.entrypointMemory;
            this.entrypointNumCpus = model.entrypointNumCpus;
            this.entrypointNumGpus = model.entrypointNumGpus;
            this.entrypointResources = model.entrypointResources;
            this.extraParam = model.extraParam;
            this.guHours = model.guHours;
            this.headSpec = model.headSpec;
            this.logBucketName = model.logBucketName;
            this.logPath = model.logPath;
            this.message = model.message;
            this.metadataJson = model.metadataJson;
            this.name = model.name;
            this.networkServiceName = model.networkServiceName;
            this.requestId = model.requestId;
            this.runtimeEnvJson = model.runtimeEnvJson;
            this.shutdownAfterJobFinishes = model.shutdownAfterJobFinishes;
            this.startTime = model.startTime;
            this.status = model.status;
            this.submissionId = model.submissionId;
            this.submissionMode = model.submissionMode;
            this.submitTime = model.submitTime;
            this.tags = model.tags;
            this.taskBizId = model.taskBizId;
            this.ttlSecondsAfterFinished = model.ttlSecondsAfterFinished;
            this.volumeIds = model.volumeIds;
            this.workerSpecs = model.workerSpecs;
            this.workingDir = model.workingDir;
        } 

        /**
         * <p>The timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder activeDeadlineSeconds(Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * <p>The number of failure retries. Currently fixed at 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder backoffLimit(Integer backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }

        /**
         * <p>The status of the corresponding Ray cluster. Valid values:</p>
         * <ul>
         * <li>Deleted: Deleted.</li>
         * <li>Submitted: Submitted but creation has not started.</li>
         * <li>Pending: Being created.</li>
         * <li>Running: Running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder clusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        /**
         * <p>The nickname of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * <p>The consumed CU resources. This value is returned 10 minutes after the cluster is released.</p>
         * 
         * <strong>example:</strong>
         * <p>1899</p>
         */
        public Builder cuHours(Double cuHours) {
            this.cuHours = cuHours;
            return this;
        }

        /**
         * <p>The dashboard URL of the Ray cluster. When the Ray cluster is in the Running state, this is the Runtime UI. After the cluster enters the Deleted state, this is the History UI. History UI is supported only in err-1.2.0 and later versions.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://emr-ray-gateway-cn-hangzhou.aliyuncs.com/workspace/w-xxxxxxxx/raycluster/ray-xxxxxx/dashboard?token=xxxxxx">https://emr-ray-gateway-cn-hangzhou.aliyuncs.com/workspace/w-xxxxxxxx/raycluster/ray-xxxxxx/dashboard?token=xxxxxx</a></p>
         */
        public Builder dashboardUrl(String dashboardUrl) {
            this.dashboardUrl = dashboardUrl;
            return this;
        }

        /**
         * <p>The extra dashboard UI URLs. This field is currently empty.</p>
         */
        public Builder dashboardUrlExtra(java.util.List<String> dashboardUrlExtra) {
            this.dashboardUrlExtra = dashboardUrlExtra;
            return this;
        }

        /**
         * <p>The Ray DPI engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>err-1.2.0 (Ray 2.55.1, Python 3.12)</p>
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * <p>The task duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2459764</p>
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The task end time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1762949372000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>python main.py</p>
         */
        public Builder entrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        /**
         * <p>The memory size requested by the entrypoint task.</p>
         * 
         * <strong>example:</strong>
         * <p>4Gi</p>
         */
        public Builder entrypointMemory(String entrypointMemory) {
            this.entrypointMemory = entrypointMemory;
            return this;
        }

        /**
         * <p>The number of CPUs requested by the entrypoint task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder entrypointNumCpus(String entrypointNumCpus) {
            this.entrypointNumCpus = entrypointNumCpus;
            return this;
        }

        /**
         * <p>The number of GPUs requested by the entrypoint task.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder entrypointNumGpus(String entrypointNumGpus) {
            this.entrypointNumGpus = entrypointNumGpus;
            return this;
        }

        /**
         * <p>The custom resource request JSON string for the entrypoint task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fpu&quot;: 1}</p>
         */
        public Builder entrypointResources(String entrypointResources) {
            this.entrypointResources = entrypointResources;
            return this;
        }

        /**
         * <p>The extra parameters in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userDefinedFiles&quot;: &quot;oss://mybucket/artifact/config.json,oss://mybucket/artifact/config2.json&quot;, &quot;userRequirementsFile&quot;: &quot;oss://mybucket/requirements.txt&quot;}</p>
         */
        public Builder extraParam(String extraParam) {
            this.extraParam = extraParam;
            return this;
        }

        /**
         * <p>The consumed GPU hours. This field is currently empty.</p>
         */
        public Builder guHours(GuHours guHours) {
            this.guHours = guHours;
            return this;
        }

        /**
         * <p>The parameters of the Ray cluster head node.</p>
         */
        public Builder headSpec(HeadSpec headSpec) {
            this.headSpec = headSpec;
            return this;
        }

        /**
         * <p>The name of the bucket that stores logs.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-ray-cn-hangzhou</p>
         */
        public Builder logBucketName(String logBucketName) {
            this.logBucketName = logBucketName;
            return this;
        }

        /**
         * <p>The path where logs are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>w-xxxxxxx/ray/logs/xxxxxx/</p>
         */
        public Builder logPath(String logPath) {
            this.logPath = logPath;
            return this;
        }

        /**
         * <p>The execution information.</p>
         * 
         * <strong>example:</strong>
         * <p>Job finished successfully.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The task metadata JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;owner&quot;: &quot;alice&quot;}</p>
         */
        public Builder metadataJson(String metadataJson) {
            this.metadataJson = metadataJson;
            return this;
        }

        /**
         * <p>The name of the Ray cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>myRayCluster</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The network connectivity name.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkServiceName(String networkServiceName) {
            this.networkServiceName = networkServiceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Ray runtime environment JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pip&quot;:[&quot;requests==2.26.0&quot;,&quot;pendulum==2.1.2&quot;],&quot;env_vars&quot;:{&quot;KEY&quot;:&quot;VALUE&quot;}}</p>
         */
        public Builder runtimeEnvJson(String runtimeEnvJson) {
            this.runtimeEnvJson = runtimeEnvJson;
            return this;
        }

        /**
         * <p>Specifies whether to automatically destroy the temporary cluster after the task is completed. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder shutdownAfterJobFinishes(Boolean shutdownAfterJobFinishes) {
            this.shutdownAfterJobFinishes = shutdownAfterJobFinishes;
            return this;
        }

        /**
         * <p>The start time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1750327083303</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Submitted: The task is submitted.</li>
         * <li>Pending: The cluster is being created.</li>
         * <li>Running: The task is running.</li>
         * <li>Succeeded: The task succeeded.</li>
         * <li>Failed: The task failed.</li>
         * <li>Cancelling: The task is being canceled.</li>
         * <li>Cancelled: The task is canceled.</li>
         * <li>Timeout: The task timed out and was canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the Ray Job.</p>
         * 
         * <strong>example:</strong>
         * <p>rj-xxxxxxxxxx</p>
         */
        public Builder submissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }

        /**
         * <p>The job submission mode.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPMode</p>
         */
        public Builder submissionMode(String submissionMode) {
            this.submissionMode = submissionMode;
            return this;
        }

        /**
         * <p>The task submission time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1750327082303</p>
         */
        public Builder submitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the data development node.</p>
         * 
         * <strong>example:</strong>
         * <p>TSK-682e0112f6f24d9f9305b92174846985</p>
         */
        public Builder taskBizId(String taskBizId) {
            this.taskBizId = taskBizId;
            return this;
        }

        /**
         * <p>The number of seconds to wait before destroying the cluster. This parameter takes effect only when shutdownAfterJobFinishes is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }

        /**
         * <p>The list of managed file IDs.</p>
         */
        public Builder volumeIds(java.util.List<String> volumeIds) {
            this.volumeIds = volumeIds;
            return this;
        }

        /**
         * <p>The Ray cluster worker node information.</p>
         */
        public Builder workerSpecs(java.util.List<WorkerSpecs> workerSpecs) {
            this.workerSpecs = workerSpecs;
            return this;
        }

        /**
         * <p>The URL of the task code working directory.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket/hello.zip</p>
         */
        public Builder workingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        public GetRayJobResponseBody build() {
            return new GetRayJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRayJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetRayJobResponseBody</p>
     */
    public static class GuHours extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gpuHours")
        private Double gpuHours;

        @com.aliyun.core.annotation.NameInMap("gpuSpec")
        private String gpuSpec;

        private GuHours(Builder builder) {
            this.gpuHours = builder.gpuHours;
            this.gpuSpec = builder.gpuSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GuHours create() {
            return builder().build();
        }

        /**
         * @return gpuHours
         */
        public Double getGpuHours() {
            return this.gpuHours;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public static final class Builder {
            private Double gpuHours; 
            private String gpuSpec; 

            private Builder() {
            } 

            private Builder(GuHours model) {
                this.gpuHours = model.gpuHours;
                this.gpuSpec = model.gpuSpec;
            } 

            /**
             * <p>The consumed GPU hours.</p>
             * 
             * <strong>example:</strong>
             * <p>2.6</p>
             */
            public Builder gpuHours(Double gpuHours) {
                this.gpuHours = gpuHours;
                return this;
            }

            /**
             * <p>The GPU type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.gn6i-c4g1.xlarge</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            public GuHours build() {
                return new GuHours(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRayJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetRayJobResponseBody</p>
     */
    public static class HeadSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
        private String displayReleaseVersion;

        @com.aliyun.core.annotation.NameInMap("enableAutoScaling")
        private Boolean enableAutoScaling;

        @com.aliyun.core.annotation.NameInMap("gpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("idleTimeoutSeconds")
        private Integer idleTimeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        private HeadSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.enableAutoScaling = builder.enableAutoScaling;
            this.gpuSpec = builder.gpuSpec;
            this.idleTimeoutSeconds = builder.idleTimeoutSeconds;
            this.memory = builder.memory;
            this.queueName = builder.queueName;
            this.replica = builder.replica;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeadSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return displayReleaseVersion
         */
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        /**
         * @return enableAutoScaling
         */
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return idleTimeoutSeconds
         */
        public Integer getIdleTimeoutSeconds() {
            return this.idleTimeoutSeconds;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        public static final class Builder {
            private String cpu; 
            private String displayReleaseVersion; 
            private Boolean enableAutoScaling; 
            private String gpuSpec; 
            private Integer idleTimeoutSeconds; 
            private String memory; 
            private String queueName; 
            private Integer replica; 

            private Builder() {
            } 

            private Builder(HeadSpec model) {
                this.cpu = model.cpu;
                this.displayReleaseVersion = model.displayReleaseVersion;
                this.enableAutoScaling = model.enableAutoScaling;
                this.gpuSpec = model.gpuSpec;
                this.idleTimeoutSeconds = model.idleTimeoutSeconds;
                this.memory = model.memory;
                this.queueName = model.queueName;
                this.replica = model.replica;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The Ray DPI engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>err-1.3.0 (Ray 2.55.1, Python 3.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>Indicates whether automatic scaling is enabled for worker nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAutoScaling(Boolean enableAutoScaling) {
                this.enableAutoScaling = enableAutoScaling;
                return this;
            }

            /**
             * <p>The GPU type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.gn6i-c4g1.xlarge</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The idle timeout for worker nodes when automatic scaling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder idleTimeoutSeconds(Integer idleTimeoutSeconds) {
                this.idleTimeoutSeconds = idleTimeoutSeconds;
                return this;
            }

            /**
             * <p>The memory size, in GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>8Gi</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>root_queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            public HeadSpec build() {
                return new HeadSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRayJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetRayJobResponseBody</p>
     */
    public static class WorkerSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
        private String displayReleaseVersion;

        @com.aliyun.core.annotation.NameInMap("gpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("maxReplica")
        private Integer maxReplica;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("minReplica")
        private Integer minReplica;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        private WorkerSpecs(Builder builder) {
            this.cpu = builder.cpu;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.gpuSpec = builder.gpuSpec;
            this.groupName = builder.groupName;
            this.maxReplica = builder.maxReplica;
            this.memory = builder.memory;
            this.minReplica = builder.minReplica;
            this.queueName = builder.queueName;
            this.replica = builder.replica;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerSpecs create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return displayReleaseVersion
         */
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return maxReplica
         */
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return minReplica
         */
        public Integer getMinReplica() {
            return this.minReplica;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        public static final class Builder {
            private String cpu; 
            private String displayReleaseVersion; 
            private String gpuSpec; 
            private String groupName; 
            private Integer maxReplica; 
            private String memory; 
            private Integer minReplica; 
            private String queueName; 
            private Integer replica; 

            private Builder() {
            } 

            private Builder(WorkerSpecs model) {
                this.cpu = model.cpu;
                this.displayReleaseVersion = model.displayReleaseVersion;
                this.gpuSpec = model.gpuSpec;
                this.groupName = model.groupName;
                this.maxReplica = model.maxReplica;
                this.memory = model.memory;
                this.minReplica = model.minReplica;
                this.queueName = model.queueName;
                this.replica = model.replica;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The DPI engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>ray-1.2.0 (Ray 2.55.1, Python 3.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>The GPU type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.gn6i-c4g1.xlarge</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The worker node group name.</p>
             * 
             * <strong>example:</strong>
             * <p>WorkerGroup1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The maximum number of workers.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxReplica(Integer maxReplica) {
                this.maxReplica = maxReplica;
                return this;
            }

            /**
             * <p>The memory size, in GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>8Gi</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The minimum number of workers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReplica(Integer minReplica) {
                this.minReplica = minReplica;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>root_queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The number of worker nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            public WorkerSpecs build() {
                return new WorkerSpecs(this);
            } 

        } 

    }
}
