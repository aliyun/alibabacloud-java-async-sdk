// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuildPipeline} extends {@link TeaModel}
 *
 * <p>BuildPipeline</p>
 */
public class BuildPipeline extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("BuildConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private BuildConfig buildConfig;

    @com.aliyun.core.annotation.NameInMap("CodeConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private CodeConfig codeConfig;

    @com.aliyun.core.annotation.NameInMap("DeployConfig")
    private DeployConfig deployConfig;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("ImageConfig")
    private ImageConfig imageConfig;

    @com.aliyun.core.annotation.NameInMap("PackageConfig")
    private PackageConfig packageConfig;

    @com.aliyun.core.annotation.NameInMap("TriggerConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private TriggerConfig triggerConfig;

    private BuildPipeline(Builder builder) {
        this.applicationId = builder.applicationId;
        this.applicationName = builder.applicationName;
        this.buildConfig = builder.buildConfig;
        this.codeConfig = builder.codeConfig;
        this.deployConfig = builder.deployConfig;
        this.enabled = builder.enabled;
        this.imageConfig = builder.imageConfig;
        this.packageConfig = builder.packageConfig;
        this.triggerConfig = builder.triggerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildPipeline create() {
        return builder().build();
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return buildConfig
     */
    public BuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    /**
     * @return codeConfig
     */
    public CodeConfig getCodeConfig() {
        return this.codeConfig;
    }

    /**
     * @return deployConfig
     */
    public DeployConfig getDeployConfig() {
        return this.deployConfig;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
     * @return triggerConfig
     */
    public TriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public static final class Builder {
        private String applicationId; 
        private String applicationName; 
        private BuildConfig buildConfig; 
        private CodeConfig codeConfig; 
        private DeployConfig deployConfig; 
        private Boolean enabled; 
        private ImageConfig imageConfig; 
        private PackageConfig packageConfig; 
        private TriggerConfig triggerConfig; 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ApplicationName.
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * BuildConfig.
         */
        public Builder buildConfig(BuildConfig buildConfig) {
            this.buildConfig = buildConfig;
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
         * DeployConfig.
         */
        public Builder deployConfig(DeployConfig deployConfig) {
            this.deployConfig = deployConfig;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
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
         * TriggerConfig.
         */
        public Builder triggerConfig(TriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }

        public BuildPipeline build() {
            return new BuildPipeline(this);
        } 

    } 

    public static class BuildConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeforeBuildCommand")
        private String beforeBuildCommand;

        @com.aliyun.core.annotation.NameInMap("BuildType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String buildType;

        @com.aliyun.core.annotation.NameInMap("DockerfilePath")
        private String dockerfilePath;

        @com.aliyun.core.annotation.NameInMap("RunCommand")
        private String runCommand;

        @com.aliyun.core.annotation.NameInMap("RuntimeType")
        private String runtimeType;

        @com.aliyun.core.annotation.NameInMap("RuntimeVersion")
        private String runtimeVersion;

        @com.aliyun.core.annotation.NameInMap("TomcatConfig")
        private TomcatConfig tomcatConfig;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
        private String workingDir;

        private BuildConfig(Builder builder) {
            this.beforeBuildCommand = builder.beforeBuildCommand;
            this.buildType = builder.buildType;
            this.dockerfilePath = builder.dockerfilePath;
            this.runCommand = builder.runCommand;
            this.runtimeType = builder.runtimeType;
            this.runtimeVersion = builder.runtimeVersion;
            this.tomcatConfig = builder.tomcatConfig;
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
        @com.aliyun.core.annotation.NameInMap("AccountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("BranchName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("CommitId")
        private String commitId;

        @com.aliyun.core.annotation.NameInMap("CommitUrl")
        private String commitUrl;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("Provider")
        @com.aliyun.core.annotation.Validation(required = true)
        private String provider;

        @com.aliyun.core.annotation.NameInMap("RepoFullName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String repoFullName;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        @com.aliyun.core.annotation.Validation(required = true)
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
        @com.aliyun.core.annotation.NameInMap("AlwaysAllocateCPU")
        private Boolean alwaysAllocateCPU;

        @com.aliyun.core.annotation.NameInMap("MaximumInstanceCount")
        private Integer maximumInstanceCount;

        @com.aliyun.core.annotation.NameInMap("MinimumInstanceCount")
        private Integer minimumInstanceCount;

        @com.aliyun.core.annotation.NameInMap("UpdateApplicationInput")
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
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Repository")
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
        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PackageUrl")
        private String packageUrl;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
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
    public static class TriggerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
