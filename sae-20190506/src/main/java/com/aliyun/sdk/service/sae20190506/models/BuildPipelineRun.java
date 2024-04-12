// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuildPipelineRun} extends {@link TeaModel}
 *
 * <p>BuildPipelineRun</p>
 */
public class BuildPipelineRun extends TeaModel {
    @NameInMap("BuildConfig")
    private BuildConfig buildConfig;

    @NameInMap("BuildDuration")
    private Long buildDuration;

    @NameInMap("CodeConfig")
    private CodeConfig codeConfig;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("DeployConfig")
    private DeployConfig deployConfig;

    @NameInMap("DeployDuration")
    private Long deployDuration;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("ImageConfig")
    private ImageConfig imageConfig;

    @NameInMap("PackageConfig")
    private PackageConfig packageConfig;

    @NameInMap("PipelineId")
    private String pipelineId;

    @NameInMap("PipelineRunId")
    private String pipelineRunId;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("Steps")
    private java.util.List < Steps> steps;

    @NameInMap("TriggerConfig")
    private TriggerConfig triggerConfig;

    @NameInMap("VersionId")
    private String versionId;

    @NameInMap("WaitDuration")
    private Long waitDuration;

    private BuildPipelineRun(Builder builder) {
        this.buildConfig = builder.buildConfig;
        this.buildDuration = builder.buildDuration;
        this.codeConfig = builder.codeConfig;
        this.createTime = builder.createTime;
        this.deployConfig = builder.deployConfig;
        this.deployDuration = builder.deployDuration;
        this.endTime = builder.endTime;
        this.imageConfig = builder.imageConfig;
        this.packageConfig = builder.packageConfig;
        this.pipelineId = builder.pipelineId;
        this.pipelineRunId = builder.pipelineRunId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.steps = builder.steps;
        this.triggerConfig = builder.triggerConfig;
        this.versionId = builder.versionId;
        this.waitDuration = builder.waitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildPipelineRun create() {
        return builder().build();
    }

    /**
     * @return buildConfig
     */
    public BuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    /**
     * @return buildDuration
     */
    public Long getBuildDuration() {
        return this.buildDuration;
    }

    /**
     * @return codeConfig
     */
    public CodeConfig getCodeConfig() {
        return this.codeConfig;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return deployConfig
     */
    public DeployConfig getDeployConfig() {
        return this.deployConfig;
    }

    /**
     * @return deployDuration
     */
    public Long getDeployDuration() {
        return this.deployDuration;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return imageConfig
     */
    public ImageConfig getImageConfig() {
        return this.imageConfig;
    }

    /**
     * @return packageConfig
     */
    public PackageConfig getPackageConfig() {
        return this.packageConfig;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return pipelineRunId
     */
    public String getPipelineRunId() {
        return this.pipelineRunId;
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
     * @return steps
     */
    public java.util.List < Steps> getSteps() {
        return this.steps;
    }

    /**
     * @return triggerConfig
     */
    public TriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return waitDuration
     */
    public Long getWaitDuration() {
        return this.waitDuration;
    }

    public static final class Builder {
        private BuildConfig buildConfig; 
        private Long buildDuration; 
        private CodeConfig codeConfig; 
        private Long createTime; 
        private DeployConfig deployConfig; 
        private Long deployDuration; 
        private Long endTime; 
        private ImageConfig imageConfig; 
        private PackageConfig packageConfig; 
        private String pipelineId; 
        private String pipelineRunId; 
        private Long startTime; 
        private String status; 
        private java.util.List < Steps> steps; 
        private TriggerConfig triggerConfig; 
        private String versionId; 
        private Long waitDuration; 

        /**
         * BuildConfig.
         */
        public Builder buildConfig(BuildConfig buildConfig) {
            this.buildConfig = buildConfig;
            return this;
        }

        /**
         * BuildDuration.
         */
        public Builder buildDuration(Long buildDuration) {
            this.buildDuration = buildDuration;
            return this;
        }

        /**
         * CodeConfig.
         */
        public Builder codeConfig(CodeConfig codeConfig) {
            this.codeConfig = codeConfig;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DeployConfig.
         */
        public Builder deployConfig(DeployConfig deployConfig) {
            this.deployConfig = deployConfig;
            return this;
        }

        /**
         * DeployDuration.
         */
        public Builder deployDuration(Long deployDuration) {
            this.deployDuration = deployDuration;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ImageConfig.
         */
        public Builder imageConfig(ImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        /**
         * PackageConfig.
         */
        public Builder packageConfig(PackageConfig packageConfig) {
            this.packageConfig = packageConfig;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * PipelineRunId.
         */
        public Builder pipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
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
         * Steps.
         */
        public Builder steps(java.util.List < Steps> steps) {
            this.steps = steps;
            return this;
        }

        /**
         * TriggerConfig.
         */
        public Builder triggerConfig(TriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * WaitDuration.
         */
        public Builder waitDuration(Long waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }

        public BuildPipelineRun build() {
            return new BuildPipelineRun(this);
        } 

    } 

    public static class Trigger extends TeaModel {
        @NameInMap("BranchName")
        private String branchName;

        @NameInMap("TagName")
        private String tagName;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Trigger(Builder builder) {
            this.branchName = builder.branchName;
            this.tagName = builder.tagName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return branchName
         */
        public String getBranchName() {
            return this.branchName;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String branchName; 
            private String tagName; 
            private String type; 

            /**
             * BranchName.
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
    public static class BuildConfig extends TeaModel {
        @NameInMap("BeforeBuildCommand")
        private String beforeBuildCommand;

        @NameInMap("BuildType")
        @Validation(required = true)
        private String buildType;

        @NameInMap("DockerfilePath")
        private String dockerfilePath;

        @NameInMap("RunCommand")
        private String runCommand;

        @NameInMap("RuntimeType")
        private String runtimeType;

        @NameInMap("RuntimeVersion")
        private String runtimeVersion;

        @NameInMap("TomcatConfig")
        private TomcatConfig tomcatConfig;

        @NameInMap("Trigger")
        @Validation(required = true)
        private Trigger trigger;

        @NameInMap("WorkingDir")
        private String workingDir;

        private BuildConfig(Builder builder) {
            this.beforeBuildCommand = builder.beforeBuildCommand;
            this.buildType = builder.buildType;
            this.dockerfilePath = builder.dockerfilePath;
            this.runCommand = builder.runCommand;
            this.runtimeType = builder.runtimeType;
            this.runtimeVersion = builder.runtimeVersion;
            this.tomcatConfig = builder.tomcatConfig;
            this.trigger = builder.trigger;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildConfig create() {
            return builder().build();
        }

        /**
         * @return beforeBuildCommand
         */
        public String getBeforeBuildCommand() {
            return this.beforeBuildCommand;
        }

        /**
         * @return buildType
         */
        public String getBuildType() {
            return this.buildType;
        }

        /**
         * @return dockerfilePath
         */
        public String getDockerfilePath() {
            return this.dockerfilePath;
        }

        /**
         * @return runCommand
         */
        public String getRunCommand() {
            return this.runCommand;
        }

        /**
         * @return runtimeType
         */
        public String getRuntimeType() {
            return this.runtimeType;
        }

        /**
         * @return runtimeVersion
         */
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        /**
         * @return tomcatConfig
         */
        public TomcatConfig getTomcatConfig() {
            return this.tomcatConfig;
        }

        /**
         * @return trigger
         */
        public Trigger getTrigger() {
            return this.trigger;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private String beforeBuildCommand; 
            private String buildType; 
            private String dockerfilePath; 
            private String runCommand; 
            private String runtimeType; 
            private String runtimeVersion; 
            private TomcatConfig tomcatConfig; 
            private Trigger trigger; 
            private String workingDir; 

            /**
             * BeforeBuildCommand.
             */
            public Builder beforeBuildCommand(String beforeBuildCommand) {
                this.beforeBuildCommand = beforeBuildCommand;
                return this;
            }

            /**
             * BuildType.
             */
            public Builder buildType(String buildType) {
                this.buildType = buildType;
                return this;
            }

            /**
             * DockerfilePath.
             */
            public Builder dockerfilePath(String dockerfilePath) {
                this.dockerfilePath = dockerfilePath;
                return this;
            }

            /**
             * RunCommand.
             */
            public Builder runCommand(String runCommand) {
                this.runCommand = runCommand;
                return this;
            }

            /**
             * RuntimeType.
             */
            public Builder runtimeType(String runtimeType) {
                this.runtimeType = runtimeType;
                return this;
            }

            /**
             * RuntimeVersion.
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * TomcatConfig.
             */
            public Builder tomcatConfig(TomcatConfig tomcatConfig) {
                this.tomcatConfig = tomcatConfig;
                return this;
            }

            /**
             * Trigger.
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * WorkingDir.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public BuildConfig build() {
                return new BuildConfig(this);
            } 

        } 

    }
    public static class CodeConfig extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        private String accountId;

        @NameInMap("BranchName")
        @Validation(required = true)
        private String branchName;

        @NameInMap("CommitId")
        private String commitId;

        @NameInMap("CommitUrl")
        private String commitUrl;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("Provider")
        @Validation(required = true)
        private String provider;

        @NameInMap("RepoFullName")
        @Validation(required = true)
        private String repoFullName;

        @NameInMap("RepoId")
        @Validation(required = true)
        private String repoId;

        private CodeConfig(Builder builder) {
            this.accountId = builder.accountId;
            this.branchName = builder.branchName;
            this.commitId = builder.commitId;
            this.commitUrl = builder.commitUrl;
            this.organizationId = builder.organizationId;
            this.provider = builder.provider;
            this.repoFullName = builder.repoFullName;
            this.repoId = builder.repoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeConfig create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return branchName
         */
        public String getBranchName() {
            return this.branchName;
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
        }

        /**
         * @return commitUrl
         */
        public String getCommitUrl() {
            return this.commitUrl;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return repoFullName
         */
        public String getRepoFullName() {
            return this.repoFullName;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        public static final class Builder {
            private String accountId; 
            private String branchName; 
            private String commitId; 
            private String commitUrl; 
            private String organizationId; 
            private String provider; 
            private String repoFullName; 
            private String repoId; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * BranchName.
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * CommitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * CommitUrl.
             */
            public Builder commitUrl(String commitUrl) {
                this.commitUrl = commitUrl;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * Provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * RepoFullName.
             */
            public Builder repoFullName(String repoFullName) {
                this.repoFullName = repoFullName;
                return this;
            }

            /**
             * RepoId.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            public CodeConfig build() {
                return new CodeConfig(this);
            } 

        } 

    }
    public static class DeployConfig extends TeaModel {
        @NameInMap("AlwaysAllocateCPU")
        private Boolean alwaysAllocateCPU;

        @NameInMap("MaximumInstanceCount")
        private Integer maximumInstanceCount;

        @NameInMap("MinimumInstanceCount")
        private Integer minimumInstanceCount;

        @NameInMap("UpdateApplicationInput")
        private String updateApplicationInput;

        private DeployConfig(Builder builder) {
            this.alwaysAllocateCPU = builder.alwaysAllocateCPU;
            this.maximumInstanceCount = builder.maximumInstanceCount;
            this.minimumInstanceCount = builder.minimumInstanceCount;
            this.updateApplicationInput = builder.updateApplicationInput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployConfig create() {
            return builder().build();
        }

        /**
         * @return alwaysAllocateCPU
         */
        public Boolean getAlwaysAllocateCPU() {
            return this.alwaysAllocateCPU;
        }

        /**
         * @return maximumInstanceCount
         */
        public Integer getMaximumInstanceCount() {
            return this.maximumInstanceCount;
        }

        /**
         * @return minimumInstanceCount
         */
        public Integer getMinimumInstanceCount() {
            return this.minimumInstanceCount;
        }

        /**
         * @return updateApplicationInput
         */
        public String getUpdateApplicationInput() {
            return this.updateApplicationInput;
        }

        public static final class Builder {
            private Boolean alwaysAllocateCPU; 
            private Integer maximumInstanceCount; 
            private Integer minimumInstanceCount; 
            private String updateApplicationInput; 

            /**
             * AlwaysAllocateCPU.
             */
            public Builder alwaysAllocateCPU(Boolean alwaysAllocateCPU) {
                this.alwaysAllocateCPU = alwaysAllocateCPU;
                return this;
            }

            /**
             * MaximumInstanceCount.
             */
            public Builder maximumInstanceCount(Integer maximumInstanceCount) {
                this.maximumInstanceCount = maximumInstanceCount;
                return this;
            }

            /**
             * MinimumInstanceCount.
             */
            public Builder minimumInstanceCount(Integer minimumInstanceCount) {
                this.minimumInstanceCount = minimumInstanceCount;
                return this;
            }

            /**
             * UpdateApplicationInput.
             */
            public Builder updateApplicationInput(String updateApplicationInput) {
                this.updateApplicationInput = updateApplicationInput;
                return this;
            }

            public DeployConfig build() {
                return new DeployConfig(this);
            } 

        } 

    }
    public static class ImageConfig extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Repository")
        private String repository;

        private ImageConfig(Builder builder) {
            this.instanceType = builder.instanceType;
            this.namespace = builder.namespace;
            this.repository = builder.repository;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageConfig create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return repository
         */
        public String getRepository() {
            return this.repository;
        }

        public static final class Builder {
            private String instanceType; 
            private String namespace; 
            private String repository; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Repository.
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            public ImageConfig build() {
                return new ImageConfig(this);
            } 

        } 

    }
    public static class PackageConfig extends TeaModel {
        @NameInMap("PackageName")
        private String packageName;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("PackageUrl")
        private String packageUrl;

        @NameInMap("PackageVersion")
        private String packageVersion;

        private PackageConfig(Builder builder) {
            this.packageName = builder.packageName;
            this.packageType = builder.packageType;
            this.packageUrl = builder.packageUrl;
            this.packageVersion = builder.packageVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageConfig create() {
            return builder().build();
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return packageUrl
         */
        public String getPackageUrl() {
            return this.packageUrl;
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public static final class Builder {
            private String packageName; 
            private String packageType; 
            private String packageUrl; 
            private String packageVersion; 

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PackageUrl.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * PackageVersion.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            public PackageConfig build() {
                return new PackageConfig(this);
            } 

        } 

    }
    public static class Steps extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Result")
        private String result;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private Steps(Builder builder) {
            this.description = builder.description;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.name = builder.name;
            this.result = builder.result;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
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

        public static final class Builder {
            private String description; 
            private Long duration; 
            private Long endTime; 
            private String id; 
            private String name; 
            private String result; 
            private Long startTime; 
            private String status; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
    public static class TriggerConfig extends TeaModel {
        @NameInMap("BranchName")
        private String branchName;

        @NameInMap("TagName")
        private String tagName;

        @NameInMap("Type")
        private String type;

        private TriggerConfig(Builder builder) {
            this.branchName = builder.branchName;
            this.tagName = builder.tagName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerConfig create() {
            return builder().build();
        }

        /**
         * @return branchName
         */
        public String getBranchName() {
            return this.branchName;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String branchName; 
            private String tagName; 
            private String type; 

            /**
             * BranchName.
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TriggerConfig build() {
                return new TriggerConfig(this);
            } 

        } 

    }
}
