// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeSource")
    private CodeSource codeSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebuggerConfigContent")
    private String debuggerConfigContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElasticSpec")
    private JobElasticSpec elasticSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.Map<String, String> envs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobMaxRunningTimeMinutes")
    private Long jobMaxRunningTimeMinutes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobSpecs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<JobSpec> jobSpecs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 1)
    private String jobType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Settings")
    private JobSettings settings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SuccessPolicy")
    private String successPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdpartyLibDir")
    private String thirdpartyLibDir;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdpartyLibs")
    private java.util.List<String> thirdpartyLibs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userCommand;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.codeSource = builder.codeSource;
        this.credentialConfig = builder.credentialConfig;
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return codeSource
     */
    public CodeSource getCodeSource() {
        return this.codeSource;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSources> getDataSources() {
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
    public java.util.Map<String, String> getEnvs() {
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
    public java.util.List<JobSpec> getJobSpecs() {
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
    public java.util.List<String> getThirdpartyLibs() {
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
        private String accessibility; 
        private CodeSource codeSource; 
        private CredentialConfig credentialConfig; 
        private java.util.List<DataSources> dataSources; 
        private String debuggerConfigContent; 
        private String displayName; 
        private JobElasticSpec elasticSpec; 
        private java.util.Map<String, String> envs; 
        private Long jobMaxRunningTimeMinutes; 
        private java.util.List<JobSpec> jobSpecs; 
        private String jobType; 
        private String options; 
        private Integer priority; 
        private String resourceId; 
        private JobSettings settings; 
        private String successPolicy; 
        private String thirdpartyLibDir; 
        private java.util.List<String> thirdpartyLibs; 
        private String userCommand; 
        private UserVpc userVpc; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.codeSource = request.codeSource;
            this.credentialConfig = request.credentialConfig;
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
         * <p>The job visibility. Valid values:</p>
         * <ul>
         * <li>PUBLIC: The job is visible to all members in the workspace.</li>
         * <li>PRIVATE: The job is visible only to you and the administrator of the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The code source of the job. Before the node of the job runs, DLC automatically downloads the configured code from the code source and mounts the code to the local path of the container.</p>
         */
        public Builder codeSource(CodeSource codeSource) {
            this.putBodyParameter("CodeSource", codeSource);
            this.codeSource = codeSource;
            return this;
        }

        /**
         * <p>The access credential configuration.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            this.putBodyParameter("CredentialConfig", credentialConfig);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The data sources for job running.</p>
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.putBodyParameter("DataSources", dataSources);
            this.dataSources = dataSources;
            return this;
        }

        /**
         * <p>This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder debuggerConfigContent(String debuggerConfigContent) {
            this.putBodyParameter("DebuggerConfigContent", debuggerConfigContent);
            this.debuggerConfigContent = debuggerConfigContent;
            return this;
        }

        /**
         * <p>The job name. The name must be in the following format:</p>
         * <ul>
         * <li>The name must be 1 to 256 characters in length.</li>
         * <li>The name can contain digits, letters, underscores (_), periods (.), and hyphens (-).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-mnist-test</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is not supported.</p>
         */
        public Builder elasticSpec(JobElasticSpec elasticSpec) {
            this.putBodyParameter("ElasticSpec", elasticSpec);
            this.elasticSpec = elasticSpec;
            return this;
        }

        /**
         * <p>The environment variables.</p>
         */
        public Builder envs(java.util.Map<String, String> envs) {
            this.putBodyParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * <p>The maximum running duration of the job. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder jobMaxRunningTimeMinutes(Long jobMaxRunningTimeMinutes) {
            this.putBodyParameter("JobMaxRunningTimeMinutes", jobMaxRunningTimeMinutes);
            this.jobMaxRunningTimeMinutes = jobMaxRunningTimeMinutes;
            return this;
        }

        /**
         * <p>The configurations for job running, such as the image address, startup command, node resource declaration, and number of replicas.****</p>
         * <p>A DLC job consists of different types of nodes. If nodes of the same type have exactly the same configuration, the configuration is called JobSpec. <strong>JobSpecs</strong> specifies the configurations of all types of nodes. The value is of the array type.</p>
         * <p>This parameter is required.</p>
         */
        public Builder jobSpecs(java.util.List<JobSpec> jobSpecs) {
            this.putBodyParameter("JobSpecs", jobSpecs);
            this.jobSpecs = jobSpecs;
            return this;
        }

        /**
         * <p>The job type. The value is case-sensitive. The following job types are supported:</p>
         * <ul>
         * <li>TFJob</li>
         * <li>PyTorchJob</li>
         * <li>MPIJob</li>
         * <li>XGBoostJob</li>
         * <li>OneFlowJob</li>
         * <li>ElasticBatchJob</li>
         * <li>SlurmJob</li>
         * <li>RayJob</li>
         * </ul>
         * <p>Valid values for each job type:</p>
         * <ul>
         * <li>OneFlowJob: OneFlow.</li>
         * <li>PyTorchJob: PyTorch.</li>
         * <li>SlurmJob: Slurm.</li>
         * <li>XGBoostJob: XGBoost.</li>
         * <li>ElasticBatchJob: ElasticBatch.</li>
         * <li>MPIJob: MPIJob.</li>
         * <li>TFJob: Tensorflow.</li>
         * <li>RayJob: Ray.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TFJob</p>
         */
        public Builder jobType(String jobType) {
            this.putBodyParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The additional configuration of the job. You can use this parameter to adjust the behavior of the attached data source. For example, if the attached data source of the job is of the OSS type, you can use this parameter to add the following configurations to override the default parameters of JindoFS: <code>fs.oss.download.thread.concurrency=4,fs.oss.download.queue.size=16</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>key1=value1,key2=value2</p>
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>The priority of the job. Default value: 1. Valid values: 1 to 9.</p>
         * <ul>
         * <li>1: the lowest priority.</li>
         * <li>9: the highest priority.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the resource group. This parameter is optional.</p>
         * <ul>
         * <li>If you leave this parameter empty, the job is submitted to a public resource group.</li>
         * <li>If a resource quota is bound to the current workspace, you can specify the resource quota ID. For more information about how to query the resource quota ID, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rs-xxx</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The additional parameter configurations of the job.</p>
         */
        public Builder settings(JobSettings settings) {
            this.putBodyParameter("Settings", settings);
            this.settings = settings;
            return this;
        }

        /**
         * <p>The policy that is used to check whether a distributed multi-node job is successful. Only TensorFlow distributed multi-node jobs are supported.</p>
         * <ul>
         * <li>ChiefWorker: If you use this policy, the job is considered successful when the pod on the chief node completes operations.</li>
         * <li>AllWorkers (default): If you use this policy, the job is considered successful when all worker nodes complete operations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllWorkers</p>
         */
        public Builder successPolicy(String successPolicy) {
            this.putBodyParameter("SuccessPolicy", successPolicy);
            this.successPolicy = successPolicy;
            return this;
        }

        /**
         * <p>The folder in which the third-party Python library file requirements.txt is stored. Before the startup command specified by the UserCommand parameter is run on each node, DLC fetches the requirements.txt file from the folder and runs <code>pip install -r</code> to install the required package and library.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/code/</p>
         */
        public Builder thirdpartyLibDir(String thirdpartyLibDir) {
            this.putBodyParameter("ThirdpartyLibDir", thirdpartyLibDir);
            this.thirdpartyLibDir = thirdpartyLibDir;
            return this;
        }

        /**
         * <p>The third-party Python libraries to be installed.</p>
         */
        public Builder thirdpartyLibs(java.util.List<String> thirdpartyLibs) {
            this.putBodyParameter("ThirdpartyLibs", thirdpartyLibs);
            this.thirdpartyLibs = thirdpartyLibs;
            return this;
        }

        /**
         * <p>The startup command for all nodes of the job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python /root/code/mnist.py</p>
         */
        public Builder userCommand(String userCommand) {
            this.putBodyParameter("UserCommand", userCommand);
            this.userCommand = userCommand;
            return this;
        }

        /**
         * <p>The VPC settings.</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-20210126170216-xxxxxxx</p>
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

    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class CodeSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Branch")
        private String branch;

        @com.aliyun.core.annotation.NameInMap("CodeSourceId")
        private String codeSourceId;

        @com.aliyun.core.annotation.NameInMap("Commit")
        private String commit;

        @com.aliyun.core.annotation.NameInMap("MountPath")
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

            private Builder() {
            } 

            private Builder(CodeSource model) {
                this.branch = model.branch;
                this.codeSourceId = model.codeSourceId;
                this.commit = model.commit;
                this.mountPath = model.mountPath;
            } 

            /**
             * <p>The branch of the referenced code repository. By default, the branch configured in the code source is used. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * <p>The ID of the code source.</p>
             * 
             * <strong>example:</strong>
             * <p>code-20210111103721-xxxxxxx</p>
             */
            public Builder codeSourceId(String codeSourceId) {
                this.codeSourceId = codeSourceId;
                return this;
            }

            /**
             * <p>The commit ID of the code to be downloaded. By default, the commit ID configured in the code source is used. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>44da109b5******</p>
             */
            public Builder commit(String commit) {
                this.commit = commit;
                return this;
            }

            /**
             * <p>The path to which the job is mounted. By default, the mount path configured in the data source is used. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/data</p>
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
    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceVersion")
        private String dataSourceVersion;

        @com.aliyun.core.annotation.NameInMap("MountAccess")
        private String mountAccess;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private DataSources(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceVersion = builder.dataSourceVersion;
            this.mountAccess = builder.mountAccess;
            this.mountPath = builder.mountPath;
            this.options = builder.options;
            this.uri = builder.uri;
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
         * @return dataSourceVersion
         */
        public String getDataSourceVersion() {
            return this.dataSourceVersion;
        }

        /**
         * @return mountAccess
         */
        public String getMountAccess() {
            return this.mountAccess;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String dataSourceId; 
            private String dataSourceVersion; 
            private String mountAccess; 
            private String mountPath; 
            private String options; 
            private String uri; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.dataSourceId = model.dataSourceId;
                this.dataSourceVersion = model.dataSourceVersion;
                this.mountAccess = model.mountAccess;
                this.mountPath = model.mountPath;
                this.options = model.options;
                this.uri = model.uri;
            } 

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-cn9dl*******</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DataSourceVersion.
             */
            public Builder dataSourceVersion(String dataSourceVersion) {
                this.dataSourceVersion = dataSourceVersion;
                return this;
            }

            /**
             * MountAccess.
             */
            public Builder mountAccess(String mountAccess) {
                this.mountAccess = mountAccess;
                return this;
            }

            /**
             * <p>The path to which the job is mounted. By default, the mount path in the data source configuration is used. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount attribute of the custom dataset. Set the value to OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;fs.oss.download.thread.concurrency&quot;: &quot;10&quot;,
             *   &quot;fs.oss.upload.thread.concurrency&quot;: &quot;10&quot;,
             *   &quot;fs.jindo.args&quot;: &quot;-oattr_timeout=3 -oentry_timeout=0 -onegative_timeout=0 -oauto_cache -ono_symlink&quot;
             * }</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The data source path.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRoute")
        private String defaultRoute;

        @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
        private java.util.List<String> extendedCIDRs;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
        public java.util.List<String> getExtendedCIDRs() {
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
            private java.util.List<String> extendedCIDRs; 
            private String securityGroupId; 
            private String switchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.defaultRoute = model.defaultRoute;
                this.extendedCIDRs = model.extendedCIDRs;
                this.securityGroupId = model.securityGroupId;
                this.switchId = model.switchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The default route. Default value: false. Valid values:</p>
             * <ul>
             * <li>eth0: The default network interface is used to access the Internet through the public gateway.</li>
             * <li>eth1: The user&quot;s Elastic Network Interface is used to access the Internet through the private gateway. For more information about the configuration method, see <a href="https://help.aliyun.com/document_detail/2525343.html">Enable Internet access for a DSW instance by using a private Internet NAT gateway</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eth0</p>
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * <p>The extended CIDR block.</p>
             * <ul>
             * <li>If you leave the SwitchId and ExtendedCIDRs parameters empty, the system automatically obtains all CIDR blocks in a VPC.</li>
             * <li>If you configure the SwitchId and ExtendedCIDRs parameters, we recommend that you specify all CIDR blocks in a VPC.</li>
             * </ul>
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-abcdef****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID. This parameter is optional.</p>
             * <ul>
             * <li>If you leave this parameter empty, the system automatically selects a vSwitch based on the inventory status.</li>
             * <li>You can also specify a vSwitch ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vs-abcdef****</p>
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-abcdef****</p>
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
