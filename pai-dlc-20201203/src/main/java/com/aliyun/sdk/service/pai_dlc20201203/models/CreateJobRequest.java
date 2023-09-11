// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @Body
    @NameInMap("CodeSource")
    private CodeSource codeSource;

    @Body
    @NameInMap("DataSources")
    private java.util.List < DataSources> dataSources;

    @Body
    @NameInMap("DebuggerConfigContent")
    private String debuggerConfigContent;

    @Body
    @NameInMap("DisplayName")
    @Validation(required = true, maxLength = 1024, minLength = 1)
    private String displayName;

    @Body
    @NameInMap("ElasticSpec")
    private JobElasticSpec elasticSpec;

    @Body
    @NameInMap("Envs")
    private java.util.Map < String, String > envs;

    @Body
    @NameInMap("JobMaxRunningTimeMinutes")
    private Long jobMaxRunningTimeMinutes;

    @Body
    @NameInMap("JobSpecs")
    @Validation(required = true)
    private java.util.List < JobSpec > jobSpecs;

    @Body
    @NameInMap("JobType")
    @Validation(required = true, maxLength = 32, minLength = 1)
    private String jobType;

    @Body
    @NameInMap("Options")
    private String options;

    @Body
    @NameInMap("Priority")
    private Integer priority;

    @Body
    @NameInMap("ResourceId")
    private String resourceId;

    @Body
    @NameInMap("Settings")
    private JobSettings settings;

    @Body
    @NameInMap("SuccessPolicy")
    private String successPolicy;

    @Body
    @NameInMap("ThirdpartyLibDir")
    private String thirdpartyLibDir;

    @Body
    @NameInMap("ThirdpartyLibs")
    private java.util.List < String > thirdpartyLibs;

    @Body
    @NameInMap("UserCommand")
    @Validation(required = true)
    private String userCommand;

    @Body
    @NameInMap("UserVpc")
    private UserVpc userVpc;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.codeSource = builder.codeSource;
        this.dataSources = builder.dataSources;
        this.debuggerConfigContent = builder.debuggerConfigContent;
        this.displayName = builder.displayName;
        this.elasticSpec = builder.elasticSpec;
        this.envs = builder.envs;
        this.jobMaxRunningTimeMinutes = builder.jobMaxRunningTimeMinutes;
        this.jobSpecs = builder.jobSpecs;
        this.jobType = builder.jobType;
        this.options = builder.options;
        this.priority = builder.priority;
        this.resourceId = builder.resourceId;
        this.settings = builder.settings;
        this.successPolicy = builder.successPolicy;
        this.thirdpartyLibDir = builder.thirdpartyLibDir;
        this.thirdpartyLibs = builder.thirdpartyLibs;
        this.userCommand = builder.userCommand;
        this.userVpc = builder.userVpc;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeSource
     */
    public CodeSource getCodeSource() {
        return this.codeSource;
    }

    /**
     * @return dataSources
     */
    public java.util.List < DataSources> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return debuggerConfigContent
     */
    public String getDebuggerConfigContent() {
        return this.debuggerConfigContent;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return elasticSpec
     */
    public JobElasticSpec getElasticSpec() {
        return this.elasticSpec;
    }

    /**
     * @return envs
     */
    public java.util.Map < String, String > getEnvs() {
        return this.envs;
    }

    /**
     * @return jobMaxRunningTimeMinutes
     */
    public Long getJobMaxRunningTimeMinutes() {
        return this.jobMaxRunningTimeMinutes;
    }

    /**
     * @return jobSpecs
     */
    public java.util.List < JobSpec > getJobSpecs() {
        return this.jobSpecs;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return settings
     */
    public JobSettings getSettings() {
        return this.settings;
    }

    /**
     * @return successPolicy
     */
    public String getSuccessPolicy() {
        return this.successPolicy;
    }

    /**
     * @return thirdpartyLibDir
     */
    public String getThirdpartyLibDir() {
        return this.thirdpartyLibDir;
    }

    /**
     * @return thirdpartyLibs
     */
    public java.util.List < String > getThirdpartyLibs() {
        return this.thirdpartyLibs;
    }

    /**
     * @return userCommand
     */
    public String getUserCommand() {
        return this.userCommand;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private CodeSource codeSource; 
        private java.util.List < DataSources> dataSources; 
        private String debuggerConfigContent; 
        private String displayName; 
        private JobElasticSpec elasticSpec; 
        private java.util.Map < String, String > envs; 
        private Long jobMaxRunningTimeMinutes; 
        private java.util.List < JobSpec > jobSpecs; 
        private String jobType; 
        private String options; 
        private Integer priority; 
        private String resourceId; 
        private JobSettings settings; 
        private String successPolicy; 
        private String thirdpartyLibDir; 
        private java.util.List < String > thirdpartyLibs; 
        private String userCommand; 
        private UserVpc userVpc; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest request) {
            super(request);
            this.codeSource = request.codeSource;
            this.dataSources = request.dataSources;
            this.debuggerConfigContent = request.debuggerConfigContent;
            this.displayName = request.displayName;
            this.elasticSpec = request.elasticSpec;
            this.envs = request.envs;
            this.jobMaxRunningTimeMinutes = request.jobMaxRunningTimeMinutes;
            this.jobSpecs = request.jobSpecs;
            this.jobType = request.jobType;
            this.options = request.options;
            this.priority = request.priority;
            this.resourceId = request.resourceId;
            this.settings = request.settings;
            this.successPolicy = request.successPolicy;
            this.thirdpartyLibDir = request.thirdpartyLibDir;
            this.thirdpartyLibs = request.thirdpartyLibs;
            this.userCommand = request.userCommand;
            this.userVpc = request.userVpc;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * CodeSource.
         */
        public Builder codeSource(CodeSource codeSource) {
            this.putBodyParameter("CodeSource", codeSource);
            this.codeSource = codeSource;
            return this;
        }

        /**
         * DataSources.
         */
        public Builder dataSources(java.util.List < DataSources> dataSources) {
            this.putBodyParameter("DataSources", dataSources);
            this.dataSources = dataSources;
            return this;
        }

        /**
         * DebuggerConfigContent.
         */
        public Builder debuggerConfigContent(String debuggerConfigContent) {
            this.putBodyParameter("DebuggerConfigContent", debuggerConfigContent);
            this.debuggerConfigContent = debuggerConfigContent;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * ElasticSpec.
         */
        public Builder elasticSpec(JobElasticSpec elasticSpec) {
            this.putBodyParameter("ElasticSpec", elasticSpec);
            this.elasticSpec = elasticSpec;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(java.util.Map < String, String > envs) {
            this.putBodyParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * JobMaxRunningTimeMinutes.
         */
        public Builder jobMaxRunningTimeMinutes(Long jobMaxRunningTimeMinutes) {
            this.putBodyParameter("JobMaxRunningTimeMinutes", jobMaxRunningTimeMinutes);
            this.jobMaxRunningTimeMinutes = jobMaxRunningTimeMinutes;
            return this;
        }

        /**
         * JobSpecs.
         */
        public Builder jobSpecs(java.util.List < JobSpec > jobSpecs) {
            this.putBodyParameter("JobSpecs", jobSpecs);
            this.jobSpecs = jobSpecs;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.putBodyParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Settings.
         */
        public Builder settings(JobSettings settings) {
            this.putBodyParameter("Settings", settings);
            this.settings = settings;
            return this;
        }

        /**
         * SuccessPolicy.
         */
        public Builder successPolicy(String successPolicy) {
            this.putBodyParameter("SuccessPolicy", successPolicy);
            this.successPolicy = successPolicy;
            return this;
        }

        /**
         * ThirdpartyLibDir.
         */
        public Builder thirdpartyLibDir(String thirdpartyLibDir) {
            this.putBodyParameter("ThirdpartyLibDir", thirdpartyLibDir);
            this.thirdpartyLibDir = thirdpartyLibDir;
            return this;
        }

        /**
         * ThirdpartyLibs.
         */
        public Builder thirdpartyLibs(java.util.List < String > thirdpartyLibs) {
            this.putBodyParameter("ThirdpartyLibs", thirdpartyLibs);
            this.thirdpartyLibs = thirdpartyLibs;
            return this;
        }

        /**
         * UserCommand.
         */
        public Builder userCommand(String userCommand) {
            this.putBodyParameter("UserCommand", userCommand);
            this.userCommand = userCommand;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateJobRequest build() {
            return new CreateJobRequest(this);
        } 

    } 

    public static class CodeSource extends TeaModel {
        @NameInMap("Branch")
        private String branch;

        @NameInMap("CodeSourceId")
        private String codeSourceId;

        @NameInMap("Commit")
        private String commit;

        @NameInMap("MountPath")
        private String mountPath;

        private CodeSource(Builder builder) {
            this.branch = builder.branch;
            this.codeSourceId = builder.codeSourceId;
            this.commit = builder.commit;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeSource create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return codeSourceId
         */
        public String getCodeSourceId() {
            return this.codeSourceId;
        }

        /**
         * @return commit
         */
        public String getCommit() {
            return this.commit;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private String branch; 
            private String codeSourceId; 
            private String commit; 
            private String mountPath; 

            /**
             * Branch.
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * CodeSourceId.
             */
            public Builder codeSourceId(String codeSourceId) {
                this.codeSourceId = codeSourceId;
                return this;
            }

            /**
             * Commit.
             */
            public Builder commit(String commit) {
                this.commit = commit;
                return this;
            }

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public CodeSource build() {
                return new CodeSource(this);
            } 

        } 

    }
    public static class DataSources extends TeaModel {
        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("MountPath")
        private String mountPath;

        private DataSources(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private String dataSourceId; 
            private String mountPath; 

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    public static class UserVpc extends TeaModel {
        @NameInMap("DefaultRoute")
        private String defaultRoute;

        @NameInMap("ExtendedCIDRs")
        private java.util.List < String > extendedCIDRs;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SwitchId")
        private String switchId;

        @NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.defaultRoute = builder.defaultRoute;
            this.extendedCIDRs = builder.extendedCIDRs;
            this.securityGroupId = builder.securityGroupId;
            this.switchId = builder.switchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return defaultRoute
         */
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        /**
         * @return extendedCIDRs
         */
        public java.util.List < String > getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String defaultRoute; 
            private java.util.List < String > extendedCIDRs; 
            private String securityGroupId; 
            private String switchId; 
            private String vpcId; 

            /**
             * DefaultRoute.
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * ExtendedCIDRs.
             */
            public Builder extendedCIDRs(java.util.List < String > extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public UserVpc build() {
                return new UserVpc(this);
            } 

        } 

    }
}
