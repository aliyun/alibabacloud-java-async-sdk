// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuildPipeline} extends {@link TeaModel}
 *
 * <p>BuildPipeline</p>
 */
public class BuildPipeline extends TeaModel {
    @NameInMap("ApplicationId")
    @Validation(required = true)
    private String applicationId;

    @NameInMap("ApplicationName")
    @Validation(required = true)
    private String applicationName;

    @NameInMap("BuildConfig")
    @Validation(required = true)
    private BuildConfig buildConfig;

    @NameInMap("CodeConfig")
    @Validation(required = true)
    private CodeConfig codeConfig;

    @NameInMap("DeployConfig")
    private DeployConfig deployConfig;

    @NameInMap("Enabled")
    private Boolean enabled;

    @NameInMap("ImageConfig")
    private ImageConfig imageConfig;

    @NameInMap("PackageConfig")
    private PackageConfig packageConfig;

    @NameInMap("TriggerConfig")
    @Validation(required = true)
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
    public static class TriggerConfig extends TeaModel {
        @NameInMap("BranchName")
        @Validation(required = true)
        private String branchName;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private TriggerConfig(Builder builder) {
            this.branchName = builder.branchName;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String branchName; 
            private String type; 

            /**
             * BranchName.
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
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
