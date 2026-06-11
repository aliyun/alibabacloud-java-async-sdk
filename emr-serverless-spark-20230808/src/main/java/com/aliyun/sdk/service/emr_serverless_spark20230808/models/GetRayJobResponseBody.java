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
         * activeDeadlineSeconds.
         */
        public Builder activeDeadlineSeconds(Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * backoffLimit.
         */
        public Builder backoffLimit(Integer backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }

        /**
         * clusterState.
         */
        public Builder clusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        /**
         * creatorName.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * cuHours.
         */
        public Builder cuHours(Double cuHours) {
            this.cuHours = cuHours;
            return this;
        }

        /**
         * dashboardUrl.
         */
        public Builder dashboardUrl(String dashboardUrl) {
            this.dashboardUrl = dashboardUrl;
            return this;
        }

        /**
         * dashboardUrlExtra.
         */
        public Builder dashboardUrlExtra(java.util.List<String> dashboardUrlExtra) {
            this.dashboardUrlExtra = dashboardUrlExtra;
            return this;
        }

        /**
         * displayReleaseVersion.
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * entrypoint.
         */
        public Builder entrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        /**
         * entrypointMemory.
         */
        public Builder entrypointMemory(String entrypointMemory) {
            this.entrypointMemory = entrypointMemory;
            return this;
        }

        /**
         * entrypointNumCpus.
         */
        public Builder entrypointNumCpus(String entrypointNumCpus) {
            this.entrypointNumCpus = entrypointNumCpus;
            return this;
        }

        /**
         * entrypointNumGpus.
         */
        public Builder entrypointNumGpus(String entrypointNumGpus) {
            this.entrypointNumGpus = entrypointNumGpus;
            return this;
        }

        /**
         * entrypointResources.
         */
        public Builder entrypointResources(String entrypointResources) {
            this.entrypointResources = entrypointResources;
            return this;
        }

        /**
         * extraParam.
         */
        public Builder extraParam(String extraParam) {
            this.extraParam = extraParam;
            return this;
        }

        /**
         * guHours.
         */
        public Builder guHours(GuHours guHours) {
            this.guHours = guHours;
            return this;
        }

        /**
         * headSpec.
         */
        public Builder headSpec(HeadSpec headSpec) {
            this.headSpec = headSpec;
            return this;
        }

        /**
         * logBucketName.
         */
        public Builder logBucketName(String logBucketName) {
            this.logBucketName = logBucketName;
            return this;
        }

        /**
         * logPath.
         */
        public Builder logPath(String logPath) {
            this.logPath = logPath;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * metadataJson.
         */
        public Builder metadataJson(String metadataJson) {
            this.metadataJson = metadataJson;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * networkServiceName.
         */
        public Builder networkServiceName(String networkServiceName) {
            this.networkServiceName = networkServiceName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * runtimeEnvJson.
         */
        public Builder runtimeEnvJson(String runtimeEnvJson) {
            this.runtimeEnvJson = runtimeEnvJson;
            return this;
        }

        /**
         * shutdownAfterJobFinishes.
         */
        public Builder shutdownAfterJobFinishes(Boolean shutdownAfterJobFinishes) {
            this.shutdownAfterJobFinishes = shutdownAfterJobFinishes;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
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
         * submissionId.
         */
        public Builder submissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }

        /**
         * submissionMode.
         */
        public Builder submissionMode(String submissionMode) {
            this.submissionMode = submissionMode;
            return this;
        }

        /**
         * submitTime.
         */
        public Builder submitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * taskBizId.
         */
        public Builder taskBizId(String taskBizId) {
            this.taskBizId = taskBizId;
            return this;
        }

        /**
         * ttlSecondsAfterFinished.
         */
        public Builder ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }

        /**
         * volumeIds.
         */
        public Builder volumeIds(java.util.List<String> volumeIds) {
            this.volumeIds = volumeIds;
            return this;
        }

        /**
         * workerSpecs.
         */
        public Builder workerSpecs(java.util.List<WorkerSpecs> workerSpecs) {
            this.workerSpecs = workerSpecs;
            return this;
        }

        /**
         * workingDir.
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
             * gpuHours.
             */
            public Builder gpuHours(Double gpuHours) {
                this.gpuHours = gpuHours;
                return this;
            }

            /**
             * gpuSpec.
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
                this.enableAutoScaling = model.enableAutoScaling;
                this.gpuSpec = model.gpuSpec;
                this.idleTimeoutSeconds = model.idleTimeoutSeconds;
                this.memory = model.memory;
                this.queueName = model.queueName;
                this.replica = model.replica;
            } 

            /**
             * cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * enableAutoScaling.
             */
            public Builder enableAutoScaling(Boolean enableAutoScaling) {
                this.enableAutoScaling = enableAutoScaling;
                return this;
            }

            /**
             * gpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * idleTimeoutSeconds.
             */
            public Builder idleTimeoutSeconds(Integer idleTimeoutSeconds) {
                this.idleTimeoutSeconds = idleTimeoutSeconds;
                return this;
            }

            /**
             * memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * queueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * replica.
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
                this.gpuSpec = model.gpuSpec;
                this.groupName = model.groupName;
                this.maxReplica = model.maxReplica;
                this.memory = model.memory;
                this.minReplica = model.minReplica;
                this.queueName = model.queueName;
                this.replica = model.replica;
            } 

            /**
             * cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * gpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * maxReplica.
             */
            public Builder maxReplica(Integer maxReplica) {
                this.maxReplica = maxReplica;
                return this;
            }

            /**
             * memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * minReplica.
             */
            public Builder minReplica(Integer minReplica) {
                this.minReplica = minReplica;
                return this;
            }

            /**
             * queueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * replica.
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
