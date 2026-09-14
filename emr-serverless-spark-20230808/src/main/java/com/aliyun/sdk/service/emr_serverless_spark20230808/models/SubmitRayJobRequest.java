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
 * {@link SubmitRayJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitRayJobRequest</p>
 */
public class SubmitRayJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("activeDeadlineSeconds")
    private Integer activeDeadlineSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
    private String displayReleaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entrypoint")
    private String entrypoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entrypointMemory")
    private String entrypointMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entrypointNumCpus")
    private String entrypointNumCpus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entrypointNumGpus")
    private String entrypointNumGpus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entrypointResources")
    private String entrypointResources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extraParam")
    private String extraParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("headSpec")
    private HeadSpec headSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metadataJson")
    private String metadataJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkServiceName")
    private String networkServiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runtimeEnvJson")
    private String runtimeEnvJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shutdownAfterJobFinishes")
    private Boolean shutdownAfterJobFinishes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("submissionMode")
    private String submissionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ttlSecondsAfterFinished")
    private Integer ttlSecondsAfterFinished;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("volumeIds")
    private java.util.List<String> volumeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workerSpec")
    private java.util.List<WorkerSpec> workerSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workingDir")
    private String workingDir;

    private SubmitRayJobRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
        this.clusterId = builder.clusterId;
        this.displayReleaseVersion = builder.displayReleaseVersion;
        this.entrypoint = builder.entrypoint;
        this.entrypointMemory = builder.entrypointMemory;
        this.entrypointNumCpus = builder.entrypointNumCpus;
        this.entrypointNumGpus = builder.entrypointNumGpus;
        this.entrypointResources = builder.entrypointResources;
        this.extraParam = builder.extraParam;
        this.headSpec = builder.headSpec;
        this.metadataJson = builder.metadataJson;
        this.name = builder.name;
        this.networkServiceName = builder.networkServiceName;
        this.runtimeEnvJson = builder.runtimeEnvJson;
        this.shutdownAfterJobFinishes = builder.shutdownAfterJobFinishes;
        this.submissionMode = builder.submissionMode;
        this.tags = builder.tags;
        this.ttlSecondsAfterFinished = builder.ttlSecondsAfterFinished;
        this.volumeIds = builder.volumeIds;
        this.workerSpec = builder.workerSpec;
        this.workingDir = builder.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitRayJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return activeDeadlineSeconds
     */
    public Integer getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return displayReleaseVersion
     */
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
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
     * @return headSpec
     */
    public HeadSpec getHeadSpec() {
        return this.headSpec;
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
     * @return submissionMode
     */
    public String getSubmissionMode() {
        return this.submissionMode;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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
     * @return workerSpec
     */
    public java.util.List<WorkerSpec> getWorkerSpec() {
        return this.workerSpec;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder extends Request.Builder<SubmitRayJobRequest, Builder> {
        private String workspaceId; 
        private Integer activeDeadlineSeconds; 
        private String clusterId; 
        private String displayReleaseVersion; 
        private String entrypoint; 
        private String entrypointMemory; 
        private String entrypointNumCpus; 
        private String entrypointNumGpus; 
        private String entrypointResources; 
        private String extraParam; 
        private HeadSpec headSpec; 
        private String metadataJson; 
        private String name; 
        private String networkServiceName; 
        private String runtimeEnvJson; 
        private Boolean shutdownAfterJobFinishes; 
        private String submissionMode; 
        private java.util.List<Tags> tags; 
        private Integer ttlSecondsAfterFinished; 
        private java.util.List<String> volumeIds; 
        private java.util.List<WorkerSpec> workerSpec; 
        private String workingDir; 

        private Builder() {
            super();
        } 

        private Builder(SubmitRayJobRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.activeDeadlineSeconds = request.activeDeadlineSeconds;
            this.clusterId = request.clusterId;
            this.displayReleaseVersion = request.displayReleaseVersion;
            this.entrypoint = request.entrypoint;
            this.entrypointMemory = request.entrypointMemory;
            this.entrypointNumCpus = request.entrypointNumCpus;
            this.entrypointNumGpus = request.entrypointNumGpus;
            this.entrypointResources = request.entrypointResources;
            this.extraParam = request.extraParam;
            this.headSpec = request.headSpec;
            this.metadataJson = request.metadataJson;
            this.name = request.name;
            this.networkServiceName = request.networkServiceName;
            this.runtimeEnvJson = request.runtimeEnvJson;
            this.shutdownAfterJobFinishes = request.shutdownAfterJobFinishes;
            this.submissionMode = request.submissionMode;
            this.tags = request.tags;
            this.ttlSecondsAfterFinished = request.ttlSecondsAfterFinished;
            this.volumeIds = request.volumeIds;
            this.workerSpec = request.workerSpec;
            this.workingDir = request.workingDir;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The timeout period of the job, which includes the cluster creation time and job runtime. The job is canceled if this period is exceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder activeDeadlineSeconds(Integer activeDeadlineSeconds) {
            this.putBodyParameter("activeDeadlineSeconds", activeDeadlineSeconds);
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * <p>The ID of an existing Ray cluster to which the job is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-xxxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The Ray DPI engine version number.</p>
         * 
         * <strong>example:</strong>
         * <p>err-1.2.0 (Ray 2.55.1, Python 3.12)</p>
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.putBodyParameter("displayReleaseVersion", displayReleaseVersion);
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * <p>The startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>python -c &quot;print(\&quot;hello ray job\&quot;)&quot;</p>
         */
        public Builder entrypoint(String entrypoint) {
            this.putBodyParameter("entrypoint", entrypoint);
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
            this.putBodyParameter("entrypointMemory", entrypointMemory);
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
            this.putBodyParameter("entrypointNumCpus", entrypointNumCpus);
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
            this.putBodyParameter("entrypointNumGpus", entrypointNumGpus);
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
            this.putBodyParameter("entrypointResources", entrypointResources);
            this.entrypointResources = entrypointResources;
            return this;
        }

        /**
         * <p>The extra parameters in a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userDefinedFiles&quot;: &quot;oss://mybucket/artifact/config.json,oss://mybucket/artifact/config2.json&quot;, &quot;userRequirementsFile&quot;: &quot;oss://mybucket/requirements.txt&quot;}</p>
         */
        public Builder extraParam(String extraParam) {
            this.putBodyParameter("extraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * <p>The Ray cluster head node parameters.</p>
         */
        public Builder headSpec(HeadSpec headSpec) {
            this.putBodyParameter("headSpec", headSpec);
            this.headSpec = headSpec;
            return this;
        }

        /**
         * <p>The job metadata JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;resourceName&quot;: &quot;test&quot;}</p>
         */
        public Builder metadataJson(String metadataJson) {
            this.putBodyParameter("metadataJson", metadataJson);
            this.metadataJson = metadataJson;
            return this;
        }

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-job</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
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
            this.putBodyParameter("networkServiceName", networkServiceName);
            this.networkServiceName = networkServiceName;
            return this;
        }

        /**
         * <p>The Ray runtime environment JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pip&quot;:[&quot;requests==2.26.0&quot;,&quot;pendulum==2.1.2&quot;],&quot;env_vars&quot;:{&quot;KEY&quot;:&quot;VALUE&quot;}}</p>
         */
        public Builder runtimeEnvJson(String runtimeEnvJson) {
            this.putBodyParameter("runtimeEnvJson", runtimeEnvJson);
            this.runtimeEnvJson = runtimeEnvJson;
            return this;
        }

        /**
         * <p>Specifies whether to automatically destroy the temporary cluster after the job finishes. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder shutdownAfterJobFinishes(Boolean shutdownAfterJobFinishes) {
            this.putBodyParameter("shutdownAfterJobFinishes", shutdownAfterJobFinishes);
            this.shutdownAfterJobFinishes = shutdownAfterJobFinishes;
            return this;
        }

        /**
         * <p>The job submission mode.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPMode</p>
         */
        public Builder submissionMode(String submissionMode) {
            this.putBodyParameter("submissionMode", submissionMode);
            this.submissionMode = submissionMode;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The number of seconds to wait before destroying the cluster. This parameter takes effect only when shutdownAfterJobFinishes is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
            this.putBodyParameter("ttlSecondsAfterFinished", ttlSecondsAfterFinished);
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }

        /**
         * <p>The list of mounted volume IDs.</p>
         */
        public Builder volumeIds(java.util.List<String> volumeIds) {
            this.putBodyParameter("volumeIds", volumeIds);
            this.volumeIds = volumeIds;
            return this;
        }

        /**
         * <p>The parameters of the worker nodes in the Ray cluster.</p>
         */
        public Builder workerSpec(java.util.List<WorkerSpec> workerSpec) {
            this.putBodyParameter("workerSpec", workerSpec);
            this.workerSpec = workerSpec;
            return this;
        }

        /**
         * <p>The URL of the job code working directory.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket/rayjob.zip</p>
         */
        public Builder workingDir(String workingDir) {
            this.putBodyParameter("workingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        @Override
        public SubmitRayJobRequest build() {
            return new SubmitRayJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitRayJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitRayJobRequest</p>
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

        private HeadSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.enableAutoScaling = builder.enableAutoScaling;
            this.gpuSpec = builder.gpuSpec;
            this.idleTimeoutSeconds = builder.idleTimeoutSeconds;
            this.memory = builder.memory;
            this.queueName = builder.queueName;
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

        public static final class Builder {
            private String cpu; 
            private String displayReleaseVersion; 
            private Boolean enableAutoScaling; 
            private String gpuSpec; 
            private Integer idleTimeoutSeconds; 
            private String memory; 
            private String queueName; 

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
             * <p>Specifies whether to enable automatic scaling for workers.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAutoScaling(Boolean enableAutoScaling) {
                this.enableAutoScaling = enableAutoScaling;
                return this;
            }

            /**
             * <p>The GPU instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.gn6i-c4g1.xlarge</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The worker idle timeout period after automatic scaling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder idleTimeoutSeconds(Integer idleTimeoutSeconds) {
                this.idleTimeoutSeconds = idleTimeoutSeconds;
                return this;
            }

            /**
             * <p>The memory size. Unit: GiB.</p>
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

            public HeadSpec build() {
                return new HeadSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitRayJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitRayJobRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key.</p>
             * 
             * <strong>example:</strong>
             * <p>jobname</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitRayJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitRayJobRequest</p>
     */
    public static class WorkerSpec extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("workerType")
        private String workerType;

        private WorkerSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.gpuSpec = builder.gpuSpec;
            this.groupName = builder.groupName;
            this.maxReplica = builder.maxReplica;
            this.memory = builder.memory;
            this.minReplica = builder.minReplica;
            this.queueName = builder.queueName;
            this.replica = builder.replica;
            this.workerType = builder.workerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerSpec create() {
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

        /**
         * @return workerType
         */
        public String getWorkerType() {
            return this.workerType;
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
            private String workerType; 

            private Builder() {
            } 

            private Builder(WorkerSpec model) {
                this.cpu = model.cpu;
                this.displayReleaseVersion = model.displayReleaseVersion;
                this.gpuSpec = model.gpuSpec;
                this.groupName = model.groupName;
                this.maxReplica = model.maxReplica;
                this.memory = model.memory;
                this.minReplica = model.minReplica;
                this.queueName = model.queueName;
                this.replica = model.replica;
                this.workerType = model.workerType;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>ray-1.2.0 (Ray 2.55.1, Python 3.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>The GPU instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.gn6i-c4g1.xlarge</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The worker group name.</p>
             * 
             * <strong>example:</strong>
             * <p>WorkerGroup1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The maximum number of workers after automatic scaling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxReplica(Integer maxReplica) {
                this.maxReplica = maxReplica;
                return this;
            }

            /**
             * <p>The memory size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>16Gi</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The minimum number of workers after automatic scaling is enabled.</p>
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
             * <p>The number of workers.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>The worker type.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder workerType(String workerType) {
                this.workerType = workerType;
                return this;
            }

            public WorkerSpec build() {
                return new WorkerSpec(this);
            } 

        } 

    }
}
