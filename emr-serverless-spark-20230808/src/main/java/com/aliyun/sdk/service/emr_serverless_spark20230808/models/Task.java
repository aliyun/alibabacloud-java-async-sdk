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
 * {@link Task} extends {@link TeaModel}
 *
 * <p>Task</p>
 */
public class Task extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("archives")
    private java.util.List<String> archives;

    @com.aliyun.core.annotation.NameInMap("artifactUrl")
    private String artifactUrl;

    @com.aliyun.core.annotation.NameInMap("bizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("categoryBizId")
    private String categoryBizId;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("creator")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long creator;

    @com.aliyun.core.annotation.NameInMap("credential")
    private Credential credential;

    @com.aliyun.core.annotation.NameInMap("defaultCatalogId")
    private String defaultCatalogId;

    @com.aliyun.core.annotation.NameInMap("defaultDatabase")
    private String defaultDatabase;

    @com.aliyun.core.annotation.NameInMap("defaultResourceQueueId")
    private String defaultResourceQueueId;

    @com.aliyun.core.annotation.NameInMap("defaultSqlComputeId")
    private String defaultSqlComputeId;

    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.NameInMap("extraArtifactIds")
    private java.util.List<String> extraArtifactIds;

    @com.aliyun.core.annotation.NameInMap("extraSparkSubmitParams")
    private String extraSparkSubmitParams;

    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List<String> files;

    @com.aliyun.core.annotation.NameInMap("fusion")
    private Boolean fusion;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("hasChanged")
    private Boolean hasChanged;

    @com.aliyun.core.annotation.NameInMap("hasCommited")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean hasCommited;

    @com.aliyun.core.annotation.NameInMap("isStreaming")
    private Boolean isStreaming;

    @com.aliyun.core.annotation.NameInMap("jars")
    private java.util.List<String> jars;

    @com.aliyun.core.annotation.NameInMap("kernelId")
    private String kernelId;

    @com.aliyun.core.annotation.NameInMap("lastRunResourceQueueId")
    private String lastRunResourceQueueId;

    @com.aliyun.core.annotation.NameInMap("modifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long modifier;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("params")
    private java.util.Map<String, String> params;

    @com.aliyun.core.annotation.NameInMap("pyFiles")
    private java.util.List<String> pyFiles;

    @com.aliyun.core.annotation.NameInMap("rayActiveDeadlineSeconds")
    private Long rayActiveDeadlineSeconds;

    @com.aliyun.core.annotation.NameInMap("rayBackoffLimit")
    private Integer rayBackoffLimit;

    @com.aliyun.core.annotation.NameInMap("rayEntrypoint")
    private String rayEntrypoint;

    @com.aliyun.core.annotation.NameInMap("rayEntrypointMemory")
    private String rayEntrypointMemory;

    @com.aliyun.core.annotation.NameInMap("rayEntrypointNumCpus")
    private String rayEntrypointNumCpus;

    @com.aliyun.core.annotation.NameInMap("rayEntrypointNumGpus")
    private String rayEntrypointNumGpus;

    @com.aliyun.core.annotation.NameInMap("rayEntrypointResources")
    private String rayEntrypointResources;

    @com.aliyun.core.annotation.NameInMap("rayExtraParam")
    private String rayExtraParam;

    @com.aliyun.core.annotation.NameInMap("rayHeadSpec")
    private RayHeadSpec rayHeadSpec;

    @com.aliyun.core.annotation.NameInMap("rayMetadataJson")
    private String rayMetadataJson;

    @com.aliyun.core.annotation.NameInMap("rayNetworkServiceName")
    private String rayNetworkServiceName;

    @com.aliyun.core.annotation.NameInMap("rayRuntimeEnvJson")
    private String rayRuntimeEnvJson;

    @com.aliyun.core.annotation.NameInMap("rayShutdownAfterJobFinishes")
    private Boolean rayShutdownAfterJobFinishes;

    @com.aliyun.core.annotation.NameInMap("raySubmissionMode")
    private String raySubmissionMode;

    @com.aliyun.core.annotation.NameInMap("rayTtlSecondsAfterFinished")
    private Long rayTtlSecondsAfterFinished;

    @com.aliyun.core.annotation.NameInMap("rayVersion")
    private String rayVersion;

    @com.aliyun.core.annotation.NameInMap("rayVolumeIds")
    private java.util.List<String> rayVolumeIds;

    @com.aliyun.core.annotation.NameInMap("rayWorkerSpec")
    private java.util.List<RayWorkerSpec> rayWorkerSpec;

    @com.aliyun.core.annotation.NameInMap("rayWorkingDir")
    private String rayWorkingDir;

    @com.aliyun.core.annotation.NameInMap("sessionClusterId")
    private String sessionClusterId;

    @com.aliyun.core.annotation.NameInMap("sparkArgs")
    private String sparkArgs;

    @com.aliyun.core.annotation.NameInMap("sparkConf")
    private java.util.List<SparkConf> sparkConf;

    @com.aliyun.core.annotation.NameInMap("sparkDriverCores")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer sparkDriverCores;

    @com.aliyun.core.annotation.NameInMap("sparkDriverMemory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sparkDriverMemory;

    @com.aliyun.core.annotation.NameInMap("sparkEntrypoint")
    private String sparkEntrypoint;

    @com.aliyun.core.annotation.NameInMap("sparkExecutorCores")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer sparkExecutorCores;

    @com.aliyun.core.annotation.NameInMap("sparkExecutorMemory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sparkExecutorMemory;

    @com.aliyun.core.annotation.NameInMap("sparkLogLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sparkLogLevel;

    @com.aliyun.core.annotation.NameInMap("sparkLogPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sparkLogPath;

    @com.aliyun.core.annotation.NameInMap("sparkSubmitClause")
    private String sparkSubmitClause;

    @com.aliyun.core.annotation.NameInMap("sparkVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sparkVersion;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private Task(Builder builder) {
        this.archives = builder.archives;
        this.artifactUrl = builder.artifactUrl;
        this.bizId = builder.bizId;
        this.categoryBizId = builder.categoryBizId;
        this.content = builder.content;
        this.creator = builder.creator;
        this.credential = builder.credential;
        this.defaultCatalogId = builder.defaultCatalogId;
        this.defaultDatabase = builder.defaultDatabase;
        this.defaultResourceQueueId = builder.defaultResourceQueueId;
        this.defaultSqlComputeId = builder.defaultSqlComputeId;
        this.deploymentId = builder.deploymentId;
        this.environmentId = builder.environmentId;
        this.extraArtifactIds = builder.extraArtifactIds;
        this.extraSparkSubmitParams = builder.extraSparkSubmitParams;
        this.files = builder.files;
        this.fusion = builder.fusion;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.hasChanged = builder.hasChanged;
        this.hasCommited = builder.hasCommited;
        this.isStreaming = builder.isStreaming;
        this.jars = builder.jars;
        this.kernelId = builder.kernelId;
        this.lastRunResourceQueueId = builder.lastRunResourceQueueId;
        this.modifier = builder.modifier;
        this.name = builder.name;
        this.params = builder.params;
        this.pyFiles = builder.pyFiles;
        this.rayActiveDeadlineSeconds = builder.rayActiveDeadlineSeconds;
        this.rayBackoffLimit = builder.rayBackoffLimit;
        this.rayEntrypoint = builder.rayEntrypoint;
        this.rayEntrypointMemory = builder.rayEntrypointMemory;
        this.rayEntrypointNumCpus = builder.rayEntrypointNumCpus;
        this.rayEntrypointNumGpus = builder.rayEntrypointNumGpus;
        this.rayEntrypointResources = builder.rayEntrypointResources;
        this.rayExtraParam = builder.rayExtraParam;
        this.rayHeadSpec = builder.rayHeadSpec;
        this.rayMetadataJson = builder.rayMetadataJson;
        this.rayNetworkServiceName = builder.rayNetworkServiceName;
        this.rayRuntimeEnvJson = builder.rayRuntimeEnvJson;
        this.rayShutdownAfterJobFinishes = builder.rayShutdownAfterJobFinishes;
        this.raySubmissionMode = builder.raySubmissionMode;
        this.rayTtlSecondsAfterFinished = builder.rayTtlSecondsAfterFinished;
        this.rayVersion = builder.rayVersion;
        this.rayVolumeIds = builder.rayVolumeIds;
        this.rayWorkerSpec = builder.rayWorkerSpec;
        this.rayWorkingDir = builder.rayWorkingDir;
        this.sessionClusterId = builder.sessionClusterId;
        this.sparkArgs = builder.sparkArgs;
        this.sparkConf = builder.sparkConf;
        this.sparkDriverCores = builder.sparkDriverCores;
        this.sparkDriverMemory = builder.sparkDriverMemory;
        this.sparkEntrypoint = builder.sparkEntrypoint;
        this.sparkExecutorCores = builder.sparkExecutorCores;
        this.sparkExecutorMemory = builder.sparkExecutorMemory;
        this.sparkLogLevel = builder.sparkLogLevel;
        this.sparkLogPath = builder.sparkLogPath;
        this.sparkSubmitClause = builder.sparkSubmitClause;
        this.sparkVersion = builder.sparkVersion;
        this.tags = builder.tags;
        this.timeout = builder.timeout;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Task create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return archives
     */
    public java.util.List<String> getArchives() {
        return this.archives;
    }

    /**
     * @return artifactUrl
     */
    public String getArtifactUrl() {
        return this.artifactUrl;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return categoryBizId
     */
    public String getCategoryBizId() {
        return this.categoryBizId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return creator
     */
    public Long getCreator() {
        return this.creator;
    }

    /**
     * @return credential
     */
    public Credential getCredential() {
        return this.credential;
    }

    /**
     * @return defaultCatalogId
     */
    public String getDefaultCatalogId() {
        return this.defaultCatalogId;
    }

    /**
     * @return defaultDatabase
     */
    public String getDefaultDatabase() {
        return this.defaultDatabase;
    }

    /**
     * @return defaultResourceQueueId
     */
    public String getDefaultResourceQueueId() {
        return this.defaultResourceQueueId;
    }

    /**
     * @return defaultSqlComputeId
     */
    public String getDefaultSqlComputeId() {
        return this.defaultSqlComputeId;
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return extraArtifactIds
     */
    public java.util.List<String> getExtraArtifactIds() {
        return this.extraArtifactIds;
    }

    /**
     * @return extraSparkSubmitParams
     */
    public String getExtraSparkSubmitParams() {
        return this.extraSparkSubmitParams;
    }

    /**
     * @return files
     */
    public java.util.List<String> getFiles() {
        return this.files;
    }

    /**
     * @return fusion
     */
    public Boolean getFusion() {
        return this.fusion;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return hasChanged
     */
    public Boolean getHasChanged() {
        return this.hasChanged;
    }

    /**
     * @return hasCommited
     */
    public Boolean getHasCommited() {
        return this.hasCommited;
    }

    /**
     * @return isStreaming
     */
    public Boolean getIsStreaming() {
        return this.isStreaming;
    }

    /**
     * @return jars
     */
    public java.util.List<String> getJars() {
        return this.jars;
    }

    /**
     * @return kernelId
     */
    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * @return lastRunResourceQueueId
     */
    public String getLastRunResourceQueueId() {
        return this.lastRunResourceQueueId;
    }

    /**
     * @return modifier
     */
    public Long getModifier() {
        return this.modifier;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return params
     */
    public java.util.Map<String, String> getParams() {
        return this.params;
    }

    /**
     * @return pyFiles
     */
    public java.util.List<String> getPyFiles() {
        return this.pyFiles;
    }

    /**
     * @return rayActiveDeadlineSeconds
     */
    public Long getRayActiveDeadlineSeconds() {
        return this.rayActiveDeadlineSeconds;
    }

    /**
     * @return rayBackoffLimit
     */
    public Integer getRayBackoffLimit() {
        return this.rayBackoffLimit;
    }

    /**
     * @return rayEntrypoint
     */
    public String getRayEntrypoint() {
        return this.rayEntrypoint;
    }

    /**
     * @return rayEntrypointMemory
     */
    public String getRayEntrypointMemory() {
        return this.rayEntrypointMemory;
    }

    /**
     * @return rayEntrypointNumCpus
     */
    public String getRayEntrypointNumCpus() {
        return this.rayEntrypointNumCpus;
    }

    /**
     * @return rayEntrypointNumGpus
     */
    public String getRayEntrypointNumGpus() {
        return this.rayEntrypointNumGpus;
    }

    /**
     * @return rayEntrypointResources
     */
    public String getRayEntrypointResources() {
        return this.rayEntrypointResources;
    }

    /**
     * @return rayExtraParam
     */
    public String getRayExtraParam() {
        return this.rayExtraParam;
    }

    /**
     * @return rayHeadSpec
     */
    public RayHeadSpec getRayHeadSpec() {
        return this.rayHeadSpec;
    }

    /**
     * @return rayMetadataJson
     */
    public String getRayMetadataJson() {
        return this.rayMetadataJson;
    }

    /**
     * @return rayNetworkServiceName
     */
    public String getRayNetworkServiceName() {
        return this.rayNetworkServiceName;
    }

    /**
     * @return rayRuntimeEnvJson
     */
    public String getRayRuntimeEnvJson() {
        return this.rayRuntimeEnvJson;
    }

    /**
     * @return rayShutdownAfterJobFinishes
     */
    public Boolean getRayShutdownAfterJobFinishes() {
        return this.rayShutdownAfterJobFinishes;
    }

    /**
     * @return raySubmissionMode
     */
    public String getRaySubmissionMode() {
        return this.raySubmissionMode;
    }

    /**
     * @return rayTtlSecondsAfterFinished
     */
    public Long getRayTtlSecondsAfterFinished() {
        return this.rayTtlSecondsAfterFinished;
    }

    /**
     * @return rayVersion
     */
    public String getRayVersion() {
        return this.rayVersion;
    }

    /**
     * @return rayVolumeIds
     */
    public java.util.List<String> getRayVolumeIds() {
        return this.rayVolumeIds;
    }

    /**
     * @return rayWorkerSpec
     */
    public java.util.List<RayWorkerSpec> getRayWorkerSpec() {
        return this.rayWorkerSpec;
    }

    /**
     * @return rayWorkingDir
     */
    public String getRayWorkingDir() {
        return this.rayWorkingDir;
    }

    /**
     * @return sessionClusterId
     */
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

    /**
     * @return sparkArgs
     */
    public String getSparkArgs() {
        return this.sparkArgs;
    }

    /**
     * @return sparkConf
     */
    public java.util.List<SparkConf> getSparkConf() {
        return this.sparkConf;
    }

    /**
     * @return sparkDriverCores
     */
    public Integer getSparkDriverCores() {
        return this.sparkDriverCores;
    }

    /**
     * @return sparkDriverMemory
     */
    public Long getSparkDriverMemory() {
        return this.sparkDriverMemory;
    }

    /**
     * @return sparkEntrypoint
     */
    public String getSparkEntrypoint() {
        return this.sparkEntrypoint;
    }

    /**
     * @return sparkExecutorCores
     */
    public Integer getSparkExecutorCores() {
        return this.sparkExecutorCores;
    }

    /**
     * @return sparkExecutorMemory
     */
    public Long getSparkExecutorMemory() {
        return this.sparkExecutorMemory;
    }

    /**
     * @return sparkLogLevel
     */
    public String getSparkLogLevel() {
        return this.sparkLogLevel;
    }

    /**
     * @return sparkLogPath
     */
    public String getSparkLogPath() {
        return this.sparkLogPath;
    }

    /**
     * @return sparkSubmitClause
     */
    public String getSparkSubmitClause() {
        return this.sparkSubmitClause;
    }

    /**
     * @return sparkVersion
     */
    public String getSparkVersion() {
        return this.sparkVersion;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<String> archives; 
        private String artifactUrl; 
        private String bizId; 
        private String categoryBizId; 
        private String content; 
        private Long creator; 
        private Credential credential; 
        private String defaultCatalogId; 
        private String defaultDatabase; 
        private String defaultResourceQueueId; 
        private String defaultSqlComputeId; 
        private String deploymentId; 
        private String environmentId; 
        private java.util.List<String> extraArtifactIds; 
        private String extraSparkSubmitParams; 
        private java.util.List<String> files; 
        private Boolean fusion; 
        private String gmtCreated; 
        private String gmtModified; 
        private Boolean hasChanged; 
        private Boolean hasCommited; 
        private Boolean isStreaming; 
        private java.util.List<String> jars; 
        private String kernelId; 
        private String lastRunResourceQueueId; 
        private Long modifier; 
        private String name; 
        private java.util.Map<String, String> params; 
        private java.util.List<String> pyFiles; 
        private Long rayActiveDeadlineSeconds; 
        private Integer rayBackoffLimit; 
        private String rayEntrypoint; 
        private String rayEntrypointMemory; 
        private String rayEntrypointNumCpus; 
        private String rayEntrypointNumGpus; 
        private String rayEntrypointResources; 
        private String rayExtraParam; 
        private RayHeadSpec rayHeadSpec; 
        private String rayMetadataJson; 
        private String rayNetworkServiceName; 
        private String rayRuntimeEnvJson; 
        private Boolean rayShutdownAfterJobFinishes; 
        private String raySubmissionMode; 
        private Long rayTtlSecondsAfterFinished; 
        private String rayVersion; 
        private java.util.List<String> rayVolumeIds; 
        private java.util.List<RayWorkerSpec> rayWorkerSpec; 
        private String rayWorkingDir; 
        private String sessionClusterId; 
        private String sparkArgs; 
        private java.util.List<SparkConf> sparkConf; 
        private Integer sparkDriverCores; 
        private Long sparkDriverMemory; 
        private String sparkEntrypoint; 
        private Integer sparkExecutorCores; 
        private Long sparkExecutorMemory; 
        private String sparkLogLevel; 
        private String sparkLogPath; 
        private String sparkSubmitClause; 
        private String sparkVersion; 
        private java.util.Map<String, String> tags; 
        private Integer timeout; 
        private String type; 

        private Builder() {
        } 

        private Builder(Task model) {
            this.archives = model.archives;
            this.artifactUrl = model.artifactUrl;
            this.bizId = model.bizId;
            this.categoryBizId = model.categoryBizId;
            this.content = model.content;
            this.creator = model.creator;
            this.credential = model.credential;
            this.defaultCatalogId = model.defaultCatalogId;
            this.defaultDatabase = model.defaultDatabase;
            this.defaultResourceQueueId = model.defaultResourceQueueId;
            this.defaultSqlComputeId = model.defaultSqlComputeId;
            this.deploymentId = model.deploymentId;
            this.environmentId = model.environmentId;
            this.extraArtifactIds = model.extraArtifactIds;
            this.extraSparkSubmitParams = model.extraSparkSubmitParams;
            this.files = model.files;
            this.fusion = model.fusion;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.hasChanged = model.hasChanged;
            this.hasCommited = model.hasCommited;
            this.isStreaming = model.isStreaming;
            this.jars = model.jars;
            this.kernelId = model.kernelId;
            this.lastRunResourceQueueId = model.lastRunResourceQueueId;
            this.modifier = model.modifier;
            this.name = model.name;
            this.params = model.params;
            this.pyFiles = model.pyFiles;
            this.rayActiveDeadlineSeconds = model.rayActiveDeadlineSeconds;
            this.rayBackoffLimit = model.rayBackoffLimit;
            this.rayEntrypoint = model.rayEntrypoint;
            this.rayEntrypointMemory = model.rayEntrypointMemory;
            this.rayEntrypointNumCpus = model.rayEntrypointNumCpus;
            this.rayEntrypointNumGpus = model.rayEntrypointNumGpus;
            this.rayEntrypointResources = model.rayEntrypointResources;
            this.rayExtraParam = model.rayExtraParam;
            this.rayHeadSpec = model.rayHeadSpec;
            this.rayMetadataJson = model.rayMetadataJson;
            this.rayNetworkServiceName = model.rayNetworkServiceName;
            this.rayRuntimeEnvJson = model.rayRuntimeEnvJson;
            this.rayShutdownAfterJobFinishes = model.rayShutdownAfterJobFinishes;
            this.raySubmissionMode = model.raySubmissionMode;
            this.rayTtlSecondsAfterFinished = model.rayTtlSecondsAfterFinished;
            this.rayVersion = model.rayVersion;
            this.rayVolumeIds = model.rayVolumeIds;
            this.rayWorkerSpec = model.rayWorkerSpec;
            this.rayWorkingDir = model.rayWorkingDir;
            this.sessionClusterId = model.sessionClusterId;
            this.sparkArgs = model.sparkArgs;
            this.sparkConf = model.sparkConf;
            this.sparkDriverCores = model.sparkDriverCores;
            this.sparkDriverMemory = model.sparkDriverMemory;
            this.sparkEntrypoint = model.sparkEntrypoint;
            this.sparkExecutorCores = model.sparkExecutorCores;
            this.sparkExecutorMemory = model.sparkExecutorMemory;
            this.sparkLogLevel = model.sparkLogLevel;
            this.sparkLogPath = model.sparkLogPath;
            this.sparkSubmitClause = model.sparkSubmitClause;
            this.sparkVersion = model.sparkVersion;
            this.tags = model.tags;
            this.timeout = model.timeout;
            this.type = model.type;
        } 

        /**
         * archives.
         */
        public Builder archives(java.util.List<String> archives) {
            this.archives = archives;
            return this;
        }

        /**
         * artifactUrl.
         */
        public Builder artifactUrl(String artifactUrl) {
            this.artifactUrl = artifactUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * categoryBizId.
         */
        public Builder categoryBizId(String categoryBizId) {
            this.categoryBizId = categoryBizId;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder creator(Long creator) {
            this.creator = creator;
            return this;
        }

        /**
         * credential.
         */
        public Builder credential(Credential credential) {
            this.credential = credential;
            return this;
        }

        /**
         * defaultCatalogId.
         */
        public Builder defaultCatalogId(String defaultCatalogId) {
            this.defaultCatalogId = defaultCatalogId;
            return this;
        }

        /**
         * defaultDatabase.
         */
        public Builder defaultDatabase(String defaultDatabase) {
            this.defaultDatabase = defaultDatabase;
            return this;
        }

        /**
         * defaultResourceQueueId.
         */
        public Builder defaultResourceQueueId(String defaultResourceQueueId) {
            this.defaultResourceQueueId = defaultResourceQueueId;
            return this;
        }

        /**
         * defaultSqlComputeId.
         */
        public Builder defaultSqlComputeId(String defaultSqlComputeId) {
            this.defaultSqlComputeId = defaultSqlComputeId;
            return this;
        }

        /**
         * deploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * extraArtifactIds.
         */
        public Builder extraArtifactIds(java.util.List<String> extraArtifactIds) {
            this.extraArtifactIds = extraArtifactIds;
            return this;
        }

        /**
         * extraSparkSubmitParams.
         */
        public Builder extraSparkSubmitParams(String extraSparkSubmitParams) {
            this.extraSparkSubmitParams = extraSparkSubmitParams;
            return this;
        }

        /**
         * files.
         */
        public Builder files(java.util.List<String> files) {
            this.files = files;
            return this;
        }

        /**
         * fusion.
         */
        public Builder fusion(Boolean fusion) {
            this.fusion = fusion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * hasChanged.
         */
        public Builder hasChanged(Boolean hasChanged) {
            this.hasChanged = hasChanged;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hasCommited(Boolean hasCommited) {
            this.hasCommited = hasCommited;
            return this;
        }

        /**
         * isStreaming.
         */
        public Builder isStreaming(Boolean isStreaming) {
            this.isStreaming = isStreaming;
            return this;
        }

        /**
         * jars.
         */
        public Builder jars(java.util.List<String> jars) {
            this.jars = jars;
            return this;
        }

        /**
         * kernelId.
         */
        public Builder kernelId(String kernelId) {
            this.kernelId = kernelId;
            return this;
        }

        /**
         * lastRunResourceQueueId.
         */
        public Builder lastRunResourceQueueId(String lastRunResourceQueueId) {
            this.lastRunResourceQueueId = lastRunResourceQueueId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modifier(Long modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * params.
         */
        public Builder params(java.util.Map<String, String> params) {
            this.params = params;
            return this;
        }

        /**
         * pyFiles.
         */
        public Builder pyFiles(java.util.List<String> pyFiles) {
            this.pyFiles = pyFiles;
            return this;
        }

        /**
         * rayActiveDeadlineSeconds.
         */
        public Builder rayActiveDeadlineSeconds(Long rayActiveDeadlineSeconds) {
            this.rayActiveDeadlineSeconds = rayActiveDeadlineSeconds;
            return this;
        }

        /**
         * rayBackoffLimit.
         */
        public Builder rayBackoffLimit(Integer rayBackoffLimit) {
            this.rayBackoffLimit = rayBackoffLimit;
            return this;
        }

        /**
         * rayEntrypoint.
         */
        public Builder rayEntrypoint(String rayEntrypoint) {
            this.rayEntrypoint = rayEntrypoint;
            return this;
        }

        /**
         * rayEntrypointMemory.
         */
        public Builder rayEntrypointMemory(String rayEntrypointMemory) {
            this.rayEntrypointMemory = rayEntrypointMemory;
            return this;
        }

        /**
         * rayEntrypointNumCpus.
         */
        public Builder rayEntrypointNumCpus(String rayEntrypointNumCpus) {
            this.rayEntrypointNumCpus = rayEntrypointNumCpus;
            return this;
        }

        /**
         * rayEntrypointNumGpus.
         */
        public Builder rayEntrypointNumGpus(String rayEntrypointNumGpus) {
            this.rayEntrypointNumGpus = rayEntrypointNumGpus;
            return this;
        }

        /**
         * rayEntrypointResources.
         */
        public Builder rayEntrypointResources(String rayEntrypointResources) {
            this.rayEntrypointResources = rayEntrypointResources;
            return this;
        }

        /**
         * rayExtraParam.
         */
        public Builder rayExtraParam(String rayExtraParam) {
            this.rayExtraParam = rayExtraParam;
            return this;
        }

        /**
         * rayHeadSpec.
         */
        public Builder rayHeadSpec(RayHeadSpec rayHeadSpec) {
            this.rayHeadSpec = rayHeadSpec;
            return this;
        }

        /**
         * rayMetadataJson.
         */
        public Builder rayMetadataJson(String rayMetadataJson) {
            this.rayMetadataJson = rayMetadataJson;
            return this;
        }

        /**
         * rayNetworkServiceName.
         */
        public Builder rayNetworkServiceName(String rayNetworkServiceName) {
            this.rayNetworkServiceName = rayNetworkServiceName;
            return this;
        }

        /**
         * rayRuntimeEnvJson.
         */
        public Builder rayRuntimeEnvJson(String rayRuntimeEnvJson) {
            this.rayRuntimeEnvJson = rayRuntimeEnvJson;
            return this;
        }

        /**
         * rayShutdownAfterJobFinishes.
         */
        public Builder rayShutdownAfterJobFinishes(Boolean rayShutdownAfterJobFinishes) {
            this.rayShutdownAfterJobFinishes = rayShutdownAfterJobFinishes;
            return this;
        }

        /**
         * raySubmissionMode.
         */
        public Builder raySubmissionMode(String raySubmissionMode) {
            this.raySubmissionMode = raySubmissionMode;
            return this;
        }

        /**
         * rayTtlSecondsAfterFinished.
         */
        public Builder rayTtlSecondsAfterFinished(Long rayTtlSecondsAfterFinished) {
            this.rayTtlSecondsAfterFinished = rayTtlSecondsAfterFinished;
            return this;
        }

        /**
         * rayVersion.
         */
        public Builder rayVersion(String rayVersion) {
            this.rayVersion = rayVersion;
            return this;
        }

        /**
         * rayVolumeIds.
         */
        public Builder rayVolumeIds(java.util.List<String> rayVolumeIds) {
            this.rayVolumeIds = rayVolumeIds;
            return this;
        }

        /**
         * rayWorkerSpec.
         */
        public Builder rayWorkerSpec(java.util.List<RayWorkerSpec> rayWorkerSpec) {
            this.rayWorkerSpec = rayWorkerSpec;
            return this;
        }

        /**
         * rayWorkingDir.
         */
        public Builder rayWorkingDir(String rayWorkingDir) {
            this.rayWorkingDir = rayWorkingDir;
            return this;
        }

        /**
         * sessionClusterId.
         */
        public Builder sessionClusterId(String sessionClusterId) {
            this.sessionClusterId = sessionClusterId;
            return this;
        }

        /**
         * sparkArgs.
         */
        public Builder sparkArgs(String sparkArgs) {
            this.sparkArgs = sparkArgs;
            return this;
        }

        /**
         * sparkConf.
         */
        public Builder sparkConf(java.util.List<SparkConf> sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkDriverCores(Integer sparkDriverCores) {
            this.sparkDriverCores = sparkDriverCores;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkDriverMemory(Long sparkDriverMemory) {
            this.sparkDriverMemory = sparkDriverMemory;
            return this;
        }

        /**
         * sparkEntrypoint.
         */
        public Builder sparkEntrypoint(String sparkEntrypoint) {
            this.sparkEntrypoint = sparkEntrypoint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkExecutorCores(Integer sparkExecutorCores) {
            this.sparkExecutorCores = sparkExecutorCores;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkExecutorMemory(Long sparkExecutorMemory) {
            this.sparkExecutorMemory = sparkExecutorMemory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkLogLevel(String sparkLogLevel) {
            this.sparkLogLevel = sparkLogLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkLogPath(String sparkLogPath) {
            this.sparkLogPath = sparkLogPath;
            return this;
        }

        /**
         * sparkSubmitClause.
         */
        public Builder sparkSubmitClause(String sparkSubmitClause) {
            this.sparkSubmitClause = sparkSubmitClause;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Task build() {
            return new Task(this);
        } 

    } 

    /**
     * 
     * {@link Task} extends {@link TeaModel}
     *
     * <p>Task</p>
     */
    public static class Credential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("accessUrl")
        private String accessUrl;

        @com.aliyun.core.annotation.NameInMap("expire")
        private Long expire;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("securityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        private Credential(Builder builder) {
            this.accessId = builder.accessId;
            this.accessUrl = builder.accessUrl;
            this.expire = builder.expire;
            this.host = builder.host;
            this.path = builder.path;
            this.policy = builder.policy;
            this.securityToken = builder.securityToken;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credential create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return accessUrl
         */
        public String getAccessUrl() {
            return this.accessUrl;
        }

        /**
         * @return expire
         */
        public Long getExpire() {
            return this.expire;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String accessId; 
            private String accessUrl; 
            private Long expire; 
            private String host; 
            private String path; 
            private String policy; 
            private String securityToken; 
            private String signature; 

            private Builder() {
            } 

            private Builder(Credential model) {
                this.accessId = model.accessId;
                this.accessUrl = model.accessUrl;
                this.expire = model.expire;
                this.host = model.host;
                this.path = model.path;
                this.policy = model.policy;
                this.securityToken = model.securityToken;
                this.signature = model.signature;
            } 

            /**
             * accessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * accessUrl.
             */
            public Builder accessUrl(String accessUrl) {
                this.accessUrl = accessUrl;
                return this;
            }

            /**
             * expire.
             */
            public Builder expire(Long expire) {
                this.expire = expire;
                return this;
            }

            /**
             * host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * securityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Credential build() {
                return new Credential(this);
            } 

        } 

    }
    /**
     * 
     * {@link Task} extends {@link TeaModel}
     *
     * <p>Task</p>
     */
    public static class RayHeadSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("enableAutoScaling")
        private Boolean enableAutoScaling;

        @com.aliyun.core.annotation.NameInMap("gpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("idleTimeoutSeconds")
        private Long idleTimeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        private RayHeadSpec(Builder builder) {
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

        public static RayHeadSpec create() {
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
        public Long getIdleTimeoutSeconds() {
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
            private Long idleTimeoutSeconds; 
            private String memory; 
            private String queueName; 
            private Integer replica; 

            private Builder() {
            } 

            private Builder(RayHeadSpec model) {
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
            public Builder idleTimeoutSeconds(Long idleTimeoutSeconds) {
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

            public RayHeadSpec build() {
                return new RayHeadSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link Task} extends {@link TeaModel}
     *
     * <p>Task</p>
     */
    public static class RayWorkerSpec extends TeaModel {
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

        private RayWorkerSpec(Builder builder) {
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

        public static RayWorkerSpec create() {
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

            private Builder(RayWorkerSpec model) {
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

            public RayWorkerSpec build() {
                return new RayWorkerSpec(this);
            } 

        } 

    }
}
