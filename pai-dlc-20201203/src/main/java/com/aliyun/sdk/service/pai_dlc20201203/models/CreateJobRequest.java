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
    @com.aliyun.core.annotation.NameInMap("CustomEnvs")
    private java.util.List<CustomEnvs> customEnvs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebuggerConfigContent")
    private String debuggerConfigContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
    @com.aliyun.core.annotation.NameInMap("SchedulingStrategy")
    private String schedulingStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Settings")
    private JobSettings settings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SuccessPolicy")
    private String successPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private Integer templateVersion;

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
        this.customEnvs = builder.customEnvs;
        this.dataSources = builder.dataSources;
        this.debuggerConfigContent = builder.debuggerConfigContent;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.dryRun = builder.dryRun;
        this.elasticSpec = builder.elasticSpec;
        this.envs = builder.envs;
        this.jobMaxRunningTimeMinutes = builder.jobMaxRunningTimeMinutes;
        this.jobSpecs = builder.jobSpecs;
        this.jobType = builder.jobType;
        this.options = builder.options;
        this.priority = builder.priority;
        this.resourceId = builder.resourceId;
        this.schedulingStrategy = builder.schedulingStrategy;
        this.settings = builder.settings;
        this.successPolicy = builder.successPolicy;
        this.templateId = builder.templateId;
        this.templateVersion = builder.templateVersion;
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
     * @return customEnvs
     */
    public java.util.List<CustomEnvs> getCustomEnvs() {
        return this.customEnvs;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return schedulingStrategy
     */
    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateVersion
     */
    public Integer getTemplateVersion() {
        return this.templateVersion;
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
        private java.util.List<CustomEnvs> customEnvs; 
        private java.util.List<DataSources> dataSources; 
        private String debuggerConfigContent; 
        private String description; 
        private String displayName; 
        private Boolean dryRun; 
        private JobElasticSpec elasticSpec; 
        private java.util.Map<String, String> envs; 
        private Long jobMaxRunningTimeMinutes; 
        private java.util.List<JobSpec> jobSpecs; 
        private String jobType; 
        private String options; 
        private Integer priority; 
        private String resourceId; 
        private String schedulingStrategy; 
        private JobSettings settings; 
        private String successPolicy; 
        private String templateId; 
        private Integer templateVersion; 
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
            this.customEnvs = request.customEnvs;
            this.dataSources = request.dataSources;
            this.debuggerConfigContent = request.debuggerConfigContent;
            this.description = request.description;
            this.displayName = request.displayName;
            this.dryRun = request.dryRun;
            this.elasticSpec = request.elasticSpec;
            this.envs = request.envs;
            this.jobMaxRunningTimeMinutes = request.jobMaxRunningTimeMinutes;
            this.jobSpecs = request.jobSpecs;
            this.jobType = request.jobType;
            this.options = request.options;
            this.priority = request.priority;
            this.resourceId = request.resourceId;
            this.schedulingStrategy = request.schedulingStrategy;
            this.settings = request.settings;
            this.successPolicy = request.successPolicy;
            this.templateId = request.templateId;
            this.templateVersion = request.templateVersion;
            this.thirdpartyLibDir = request.thirdpartyLibDir;
            this.thirdpartyLibs = request.thirdpartyLibs;
            this.userCommand = request.userCommand;
            this.userVpc = request.userVpc;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The visibility of the job. Valid values:</p>
         * <ul>
         * <li>PUBLIC: Visible to all users in the workspace.</li>
         * <li>PRIVATE: Visible only to you and administrators in the workspace.</li>
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
         * <p>The code source used by the job. Before the nodes of the job start, DLC automatically downloads the code configured in the code source and mounts it to a local directory in the container.</p>
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
         * <p>The list of custom environment variables.</p>
         */
        public Builder customEnvs(java.util.List<CustomEnvs> customEnvs) {
            this.putBodyParameter("CustomEnvs", customEnvs);
            this.customEnvs = customEnvs;
            return this;
        }

        /**
         * <p>The list of data sources used to run the job.</p>
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.putBodyParameter("DataSources", dataSources);
            this.dataSources = dataSources;
            return this;
        }

        /**
         * <p>This parameter is not supported. You can ignore it.</p>
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
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a training job</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the job. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name can be up to 256 characters in length.</li>
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
         * <p>Specifies whether to enable the dry run mode.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>This parameter is not supported. You can ignore it.</p>
         */
        public Builder elasticSpec(JobElasticSpec elasticSpec) {
            this.putBodyParameter("ElasticSpec", elasticSpec);
            this.elasticSpec = elasticSpec;
            return this;
        }

        /**
         * <p>The environment variable configuration.</p>
         */
        public Builder envs(java.util.Map<String, String> envs) {
            this.putBodyParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * <p>The maximum running duration of the job, in minutes.</p>
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
         * <p><strong>JobSpecs</strong> describes various configurations when the job runs, such as the image address, startup command, node resource declaration, and number of replicas.</p>
         * <p>A DLC job consists of different types of nodes. Nodes of the same type have identical configurations, which are called a JobSpec. <strong>JobSpecs</strong> describes the configurations of all types of nodes and is an array of JobSpecs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder jobSpecs(java.util.List<JobSpec> jobSpecs) {
            this.putBodyParameter("JobSpecs", jobSpecs);
            this.jobSpecs = jobSpecs;
            return this;
        }

        /**
         * <p>The type of the job. This parameter is case-sensitive. Valid values:</p>
         * <ul>
         * <li>TFJob</li>
         * <li>PyTorchJob</li>
         * <li>MPIJob</li>
         * <li>XGBoostJob</li>
         * <li>OneFlowJob</li>
         * <li>ElasticBatchJob</li>
         * <li>SlurmJob</li>
         * <li>RayJob</li>
         * <li>DataJuicerJob</li>
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
         * <p>The additional configurations for the job. You can use this parameter to adjust the behavior of mounted data sources. For example, if the node has an OSS data source mounted, you can set this parameter to <code>fs.oss.download.thread.concurrency=4,fs.oss.download.queue.size=16</code> to overwrite the default parameter settings of JindoFS.</p>
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
         * <p>The priority of the job. This parameter is optional. Default value: 1. Valid values: 1 to 9.</p>
         * <ul>
         * <li>1: The lowest priority.</li>
         * <li>9: The highest priority.</li>
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
         * <li>If this parameter is left empty, the job is submitted to a public resource group.</li>
         * <li>If you attach a resource quota to the current workspace, you can specify the corresponding resource quota ID here. For details about how to query the resource quota ID, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</li>
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
         * <p>The scheduling strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder schedulingStrategy(String schedulingStrategy) {
            this.putBodyParameter("SchedulingStrategy", schedulingStrategy);
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        /**
         * <p>The additional parameter settings for the job.</p>
         */
        public Builder settings(JobSettings settings) {
            this.putBodyParameter("Settings", settings);
            this.settings = settings;
            return this;
        }

        /**
         * <p>The success policy for distributed multi-node jobs. Currently, only multi-node TensorFlow jobs are supported. Valid values:</p>
         * <ul>
         * <li>ChiefWorker: If this value is specified, the entire job is considered successful as long as the chief pod ends successfully.</li>
         * <li>AllWorkers: This is the default value. The entire job is considered successful only when all worker pods end successfully.</li>
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
         * <p>The ID of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>tplabc1234567</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The version of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateVersion(Integer templateVersion) {
            this.putBodyParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * <p>The name of the folder where the Python third-party library (requirements.txt) file is located. Before each node runs the specified user command, PAI-DLC retrieves the requirements.txt file from the specified folder and runs the <code>pip install -r</code> command to install the libraries.</p>
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
         * <p>The list of Python third-party libraries to be installed.</p>
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
         * <p>The user VPC configuration.</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>The workspace ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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

        @com.aliyun.core.annotation.NameInMap("IsSharedMountPath")
        private Boolean isSharedMountPath;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        private CodeSource(Builder builder) {
            this.branch = builder.branch;
            this.codeSourceId = builder.codeSourceId;
            this.commit = builder.commit;
            this.isSharedMountPath = builder.isSharedMountPath;
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
         * @return isSharedMountPath
         */
        public Boolean getIsSharedMountPath() {
            return this.isSharedMountPath;
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
            private Boolean isSharedMountPath; 
            private String mountPath; 

            private Builder() {
            } 

            private Builder(CodeSource model) {
                this.branch = model.branch;
                this.codeSourceId = model.codeSourceId;
                this.commit = model.commit;
                this.isSharedMountPath = model.isSharedMountPath;
                this.mountPath = model.mountPath;
            } 

            /**
             * <p>The branch of the code repository referenced when the job runs. This parameter is optional. By default, the branch configured in the code source is used.</p>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * <p>The ID of the code source. &lt;props=&quot;china&quot;&gt;For more information about how to obtain the code source ID, see <a href="https://help.aliyun.com/document_detail/459922.html">ListCodeSources</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>code-20210111103721-xxxxxxx</p>
             */
            public Builder codeSourceId(String codeSourceId) {
                this.codeSourceId = codeSourceId;
                return this;
            }

            /**
             * <p>The commit ID of the code to be downloaded for the job. This parameter is optional. By default, the commit ID configured in the code source is used.</p>
             * 
             * <strong>example:</strong>
             * <p>44da109b5******</p>
             */
            public Builder commit(String commit) {
                this.commit = commit;
                return this;
            }

            /**
             * <p>Specifies whether the mount path configured for access code source is a shared cloud storage path. If this parameter is set to true, the system enables code clone optimization. In a multi-node job scenario, the clone operation is performed on only one node, and other nodes can directly access access code through the shared cloud storage path.</p>
             */
            public Builder isSharedMountPath(Boolean isSharedMountPath) {
                this.isSharedMountPath = isSharedMountPath;
                return this;
            }

            /**
             * <p>The path to be mounted for the job. This parameter is optional. By default, the mount path configured in the code source is used.</p>
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
    public static class CustomEnvs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private String visible;

        private CustomEnvs(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEnvs create() {
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

        /**
         * @return visible
         */
        public String getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private String key; 
            private String value; 
            private String visible; 

            private Builder() {
            } 

            private Builder(CustomEnvs model) {
                this.key = model.key;
                this.value = model.value;
                this.visible = model.visible;
            } 

            /**
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>PUB</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>keep</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The visibility of the environment variable. A value of public indicates that the variable is public, and a value of private indicates that the variable is private.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder visible(String visible) {
                this.visible = visible;
                return this;
            }

            public CustomEnvs build() {
                return new CustomEnvs(this);
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
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceVersion")
        private String dataSourceVersion;

        @com.aliyun.core.annotation.NameInMap("EnableCache")
        private Boolean enableCache;

        @com.aliyun.core.annotation.NameInMap("MountAccess")
        private String mountAccess;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("RoleChain")
        private String roleChain;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private DataSources(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceVersion = builder.dataSourceVersion;
            this.enableCache = builder.enableCache;
            this.mountAccess = builder.mountAccess;
            this.mountPath = builder.mountPath;
            this.options = builder.options;
            this.roleArn = builder.roleArn;
            this.roleChain = builder.roleChain;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
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
         * @return enableCache
         */
        public Boolean getEnableCache() {
            return this.enableCache;
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
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleChain
         */
        public String getRoleChain() {
            return this.roleChain;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String accessPointId; 
            private String dataSourceId; 
            private String dataSourceVersion; 
            private Boolean enableCache; 
            private String mountAccess; 
            private String mountPath; 
            private String options; 
            private String roleArn; 
            private String roleChain; 
            private String uri; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.accessPointId = model.accessPointId;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceVersion = model.dataSourceVersion;
                this.enableCache = model.enableCache;
                this.mountAccess = model.mountAccess;
                this.mountPath = model.mountPath;
                this.options = model.options;
                this.roleArn = model.roleArn;
                this.roleChain = model.roleChain;
                this.uri = model.uri;
            } 

            /**
             * <p>The ID of the access point. Currently, only access points of AI CPFS are supported.</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The ID of the data source. &lt;props=&quot;china&quot;&gt;For more information about how to view the data source ID, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>d-cn9dl*******</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The version of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder dataSourceVersion(String dataSourceVersion) {
                this.dataSourceVersion = dataSourceVersion;
                return this;
            }

            /**
             * <p>Specifies whether to enable the cache service for the data source. This parameter takes effect only when the cluster supports the cache service and a resource group is configured.</p>
             */
            public Builder enableCache(Boolean enableCache) {
                this.enableCache = enableCache;
                return this;
            }

            /**
             * <p>The permissions when the dataset is mounted. Valid values:</p>
             * <ul>
             * <li>RO: Read-only mount.</li>
             * <li>RW: Read/write mount.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RO</p>
             */
            public Builder mountAccess(String mountAccess) {
                this.mountAccess = mountAccess;
                return this;
            }

            /**
             * <p>The path to be mounted for the job. This parameter is optional. By default, the mount path configured in the data source is used.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount property of the custom dataset. Currently, only OSS is supported.</p>
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
             * <p>The ARN of the data source role. This parameter is required when OSS and CPFS access point authentication are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1872xxxxxxxxx:role/account-pai-prod</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The role chain, which is a JSON-formatted string. Example: [{&quot;roleType&quot;:&quot;service&quot;,&quot;roleArn&quot;:&quot;acs:ram::cloud_product_resource_account_uid:role/xxxtodlcrole&quot;,&quot;assumeRoleFor&quot;:&quot;cloud_product_resource_account_uid&quot;},{&quot;roleType&quot;:&quot;user&quot;,&quot;roleArn&quot;:&quot;acs:ram::cloud_product_service_account_uid:role/roletoassumecustomerrole&quot;},{&quot;roleType&quot;:&quot;service&quot;,&quot;roleArn&quot;:&quot;acs:ram::end_user_uid:role/use-bmcpfs-access-ap-role&quot;,&quot;assumeRoleFor&quot;:&quot;end_user_uid&quot;}].</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;roleType&quot;:&quot;service&quot;,&quot;roleArn&quot;:&quot;acs:ram::cloud_product_resource_account_uid:role/xxxtodlcrole&quot;,&quot;assumeRoleFor&quot;:&quot;cloud_product_resource_account_uid&quot;},{&quot;roleType&quot;:&quot;user&quot;,&quot;roleArn&quot;:&quot;acs:ram::cloud_product_service_account_uid:role/roletoassumecustomerrole&quot;},{&quot;roleType&quot;:&quot;service&quot;,&quot;roleArn&quot;:&quot;acs:ram::end_user_uid:role/use-bmcpfs-access-ap-role&quot;,&quot;assumeRoleFor&quot;:&quot;end_user_uid&quot;}]</p>
             */
            public Builder roleChain(String roleChain) {
                this.roleChain = roleChain;
                return this;
            }

            /**
             * <p>The path of the data source.</p>
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
             * <p>The default routing. Valid values:</p>
             * <ul>
             * <li>eth0: Uses the default network interface controller (NIC) to access external networks through the public gateway.</li>
             * <li>eth1: Uses the user elastic network interfaces (ENIs) to access external networks through the private gateway. For the specific configuration method, see <a href="https://help.aliyun.com/document_detail/2525343.html">Configure a DSW instance to access the Internet through a dedicated public gateway</a>.</li>
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
             * <p>The extended CIDR blocks.</p>
             * <ul>
             * <li>If the vSwitch ID is empty, this parameter is optional. The system automatically retrieves all CIDR blocks in the VPC.</li>
             * <li>If the vSwitch ID is not empty, this parameter is required. Specify all CIDR blocks in the VPC.</li>
             * </ul>
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * <p>The ID of the user security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-abcdef****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The ID of the user vSwitch. This parameter is optional.</p>
             * <ul>
             * <li>If this parameter is empty, the system automatically selects an appropriate vSwitch based on inventory.</li>
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
             * <p>The ID of the user VPC.</p>
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
