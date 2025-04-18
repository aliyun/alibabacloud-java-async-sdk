// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("AccumulatedRunningTimeInMs")
    private Long accumulatedRunningTimeInMs;

    @com.aliyun.core.annotation.NameInMap("Affinity")
    private Affinity affinity;

    @com.aliyun.core.annotation.NameInMap("CloudDisks")
    private java.util.List<CloudDisks> cloudDisks;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.NameInMap("Datasets")
    private java.util.List<Datasets> datasets;

    @com.aliyun.core.annotation.NameInMap("Driver")
    private String driver;

    @com.aliyun.core.annotation.NameInMap("DynamicMount")
    private DynamicMount dynamicMount;

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.NameInMap("EnvironmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("IdleInstanceCuller")
    private IdleInstanceCuller idleInstanceCuller;

    @com.aliyun.core.annotation.NameInMap("ImageAuth")
    private String imageAuth;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstanceShutdownTimer")
    private InstanceShutdownTimer instanceShutdownTimer;

    @com.aliyun.core.annotation.NameInMap("InstanceSnapshotList")
    private java.util.List<InstanceSnapshotList> instanceSnapshotList;

    @com.aliyun.core.annotation.NameInMap("InstanceUrl")
    private String instanceUrl;

    @com.aliyun.core.annotation.NameInMap("JupyterlabUrl")
    private String jupyterlabUrl;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("LatestSnapshot")
    private LatestSnapshot latestSnapshot;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NodeErrorRecovery")
    private NodeErrorRecovery nodeErrorRecovery;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.NameInMap("ProxyPath")
    private String proxyPath;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestedResource")
    private RequestedResource requestedResource;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TerminalUrl")
    private String terminalUrl;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("WebIDEUrl")
    private String webIDEUrl;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.NameInMap("WorkspaceSource")
    private String workspaceSource;

    private GetInstanceResponseBody(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.accessibility = builder.accessibility;
        this.accumulatedRunningTimeInMs = builder.accumulatedRunningTimeInMs;
        this.affinity = builder.affinity;
        this.cloudDisks = builder.cloudDisks;
        this.code = builder.code;
        this.credentialConfig = builder.credentialConfig;
        this.datasets = builder.datasets;
        this.driver = builder.driver;
        this.dynamicMount = builder.dynamicMount;
        this.ecsSpec = builder.ecsSpec;
        this.environmentVariables = builder.environmentVariables;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.httpStatusCode = builder.httpStatusCode;
        this.idleInstanceCuller = builder.idleInstanceCuller;
        this.imageAuth = builder.imageAuth;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.imageUrl = builder.imageUrl;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceShutdownTimer = builder.instanceShutdownTimer;
        this.instanceSnapshotList = builder.instanceSnapshotList;
        this.instanceUrl = builder.instanceUrl;
        this.jupyterlabUrl = builder.jupyterlabUrl;
        this.labels = builder.labels;
        this.latestSnapshot = builder.latestSnapshot;
        this.message = builder.message;
        this.nodeErrorRecovery = builder.nodeErrorRecovery;
        this.paymentType = builder.paymentType;
        this.priority = builder.priority;
        this.proxyPath = builder.proxyPath;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.requestedResource = builder.requestedResource;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.status = builder.status;
        this.success = builder.success;
        this.tags = builder.tags;
        this.terminalUrl = builder.terminalUrl;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userVpc = builder.userVpc;
        this.webIDEUrl = builder.webIDEUrl;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
        this.workspaceSource = builder.workspaceSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return accumulatedRunningTimeInMs
     */
    public Long getAccumulatedRunningTimeInMs() {
        return this.accumulatedRunningTimeInMs;
    }

    /**
     * @return affinity
     */
    public Affinity getAffinity() {
        return this.affinity;
    }

    /**
     * @return cloudDisks
     */
    public java.util.List<CloudDisks> getCloudDisks() {
        return this.cloudDisks;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return datasets
     */
    public java.util.List<Datasets> getDatasets() {
        return this.datasets;
    }

    /**
     * @return driver
     */
    public String getDriver() {
        return this.driver;
    }

    /**
     * @return dynamicMount
     */
    public DynamicMount getDynamicMount() {
        return this.dynamicMount;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return idleInstanceCuller
     */
    public IdleInstanceCuller getIdleInstanceCuller() {
        return this.idleInstanceCuller;
    }

    /**
     * @return imageAuth
     */
    public String getImageAuth() {
        return this.imageAuth;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceShutdownTimer
     */
    public InstanceShutdownTimer getInstanceShutdownTimer() {
        return this.instanceShutdownTimer;
    }

    /**
     * @return instanceSnapshotList
     */
    public java.util.List<InstanceSnapshotList> getInstanceSnapshotList() {
        return this.instanceSnapshotList;
    }

    /**
     * @return instanceUrl
     */
    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    /**
     * @return jupyterlabUrl
     */
    public String getJupyterlabUrl() {
        return this.jupyterlabUrl;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return latestSnapshot
     */
    public LatestSnapshot getLatestSnapshot() {
        return this.latestSnapshot;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeErrorRecovery
     */
    public NodeErrorRecovery getNodeErrorRecovery() {
        return this.nodeErrorRecovery;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * @return proxyPath
     */
    public String getProxyPath() {
        return this.proxyPath;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestedResource
     */
    public RequestedResource getRequestedResource() {
        return this.requestedResource;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return terminalUrl
     */
    public String getTerminalUrl() {
        return this.terminalUrl;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return webIDEUrl
     */
    public String getWebIDEUrl() {
        return this.webIDEUrl;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return workspaceSource
     */
    public String getWorkspaceSource() {
        return this.workspaceSource;
    }

    public static final class Builder {
        private String acceleratorType; 
        private String accessibility; 
        private Long accumulatedRunningTimeInMs; 
        private Affinity affinity; 
        private java.util.List<CloudDisks> cloudDisks; 
        private String code; 
        private CredentialConfig credentialConfig; 
        private java.util.List<Datasets> datasets; 
        private String driver; 
        private DynamicMount dynamicMount; 
        private String ecsSpec; 
        private java.util.Map<String, String> environmentVariables; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Integer httpStatusCode; 
        private IdleInstanceCuller idleInstanceCuller; 
        private String imageAuth; 
        private String imageId; 
        private String imageName; 
        private String imageUrl; 
        private String instanceId; 
        private String instanceName; 
        private InstanceShutdownTimer instanceShutdownTimer; 
        private java.util.List<InstanceSnapshotList> instanceSnapshotList; 
        private String instanceUrl; 
        private String jupyterlabUrl; 
        private java.util.List<Labels> labels; 
        private LatestSnapshot latestSnapshot; 
        private String message; 
        private NodeErrorRecovery nodeErrorRecovery; 
        private String paymentType; 
        private Long priority; 
        private String proxyPath; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private RequestedResource requestedResource; 
        private String resourceId; 
        private String resourceName; 
        private String status; 
        private Boolean success; 
        private java.util.List<Tags> tags; 
        private String terminalUrl; 
        private String userId; 
        private String userName; 
        private UserVpc userVpc; 
        private String webIDEUrl; 
        private String workspaceId; 
        private String workspaceName; 
        private String workspaceSource; 

        private Builder() {
        } 

        private Builder(GetInstanceResponseBody model) {
            this.acceleratorType = model.acceleratorType;
            this.accessibility = model.accessibility;
            this.accumulatedRunningTimeInMs = model.accumulatedRunningTimeInMs;
            this.affinity = model.affinity;
            this.cloudDisks = model.cloudDisks;
            this.code = model.code;
            this.credentialConfig = model.credentialConfig;
            this.datasets = model.datasets;
            this.driver = model.driver;
            this.dynamicMount = model.dynamicMount;
            this.ecsSpec = model.ecsSpec;
            this.environmentVariables = model.environmentVariables;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.httpStatusCode = model.httpStatusCode;
            this.idleInstanceCuller = model.idleInstanceCuller;
            this.imageAuth = model.imageAuth;
            this.imageId = model.imageId;
            this.imageName = model.imageName;
            this.imageUrl = model.imageUrl;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.instanceShutdownTimer = model.instanceShutdownTimer;
            this.instanceSnapshotList = model.instanceSnapshotList;
            this.instanceUrl = model.instanceUrl;
            this.jupyterlabUrl = model.jupyterlabUrl;
            this.labels = model.labels;
            this.latestSnapshot = model.latestSnapshot;
            this.message = model.message;
            this.nodeErrorRecovery = model.nodeErrorRecovery;
            this.paymentType = model.paymentType;
            this.priority = model.priority;
            this.proxyPath = model.proxyPath;
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.requestId = model.requestId;
            this.requestedResource = model.requestedResource;
            this.resourceId = model.resourceId;
            this.resourceName = model.resourceName;
            this.status = model.status;
            this.success = model.success;
            this.tags = model.tags;
            this.terminalUrl = model.terminalUrl;
            this.userId = model.userId;
            this.userName = model.userName;
            this.userVpc = model.userVpc;
            this.webIDEUrl = model.webIDEUrl;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
            this.workspaceSource = model.workspaceSource;
        } 

        /**
         * <p>The accelerator type of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CPU</li>
         * <li>GPU</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * <p>The accessibility. Valid values:</p>
         * <ul>
         * <li>PRIVATE: Accessible only to you and the administrator of the workspace.</li>
         * <li>PUBLIC: Accessible to all members in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The accumulated running duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        public Builder accumulatedRunningTimeInMs(Long accumulatedRunningTimeInMs) {
            this.accumulatedRunningTimeInMs = accumulatedRunningTimeInMs;
            return this;
        }

        /**
         * <p>The affinity configuration.</p>
         */
        public Builder affinity(Affinity affinity) {
            this.affinity = affinity;
            return this;
        }

        /**
         * <p>The cloud disks of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder cloudDisks(java.util.List<CloudDisks> cloudDisks) {
            this.cloudDisks = cloudDisks;
            return this;
        }

        /**
         * <p>The status code. Valid values:</p>
         * <ul>
         * <li>InternalError: All errors, except for parameter validation errors, are internal errors.</li>
         * <li>ValidationError: A parameter validation error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The credential injection configuration.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The datasets.</p>
         */
        public Builder datasets(java.util.List<Datasets> datasets) {
            this.datasets = datasets;
            return this;
        }

        /**
         * <p>The NVIDIA driver configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>535.54.03</p>
         */
        public Builder driver(String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * <p>The dynamic mount configuration.</p>
         */
        public Builder dynamicMount(DynamicMount dynamicMount) {
            this.dynamicMount = dynamicMount;
            return this;
        }

        /**
         * <p>The ECS instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        public Builder ecsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * <p>The environment variables.</p>
         * 
         * <strong>example:</strong>
         * <p>{userName: &quot;Chris&quot;}</p>
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>The creation time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The last modified time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li>400</li>
         * <li>404</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The automatic shutdown settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;InstanceId&quot;:&quot;dsw-05cefd0be2e5a278&quot;,&quot;CpuPercentThreshold&quot;:20,&quot;GpuPercentThreshold&quot;:10,&quot;MaxIdleTimeInMinutes&quot;:120,&quot;IdleTimeInMinutes&quot;:30}</p>
         */
        public Builder idleInstanceCuller(IdleInstanceCuller idleInstanceCuller) {
            this.idleInstanceCuller = idleInstanceCuller;
            return this;
        }

        /**
         * <p>The Base64-encoded account and password for the user‘s private image. The password will be hidden.</p>
         * 
         * <strong>example:</strong>
         * <p>YWxpeXVuNjUzMzM5MjIwMzoqKioqKio=</p>
         */
        public Builder imageAuth(String imageAuth) {
            this.imageAuth = imageAuth;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>image-05cefd0be2exxxx</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>py36_cpu_tf1.12_ubuntu</p>
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The image address.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>training_data</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The scheduled stop tasks.</p>
         */
        public Builder instanceShutdownTimer(InstanceShutdownTimer instanceShutdownTimer) {
            this.instanceShutdownTimer = instanceShutdownTimer;
            return this;
        }

        /**
         * <p>The instance snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder instanceSnapshotList(java.util.List<InstanceSnapshotList> instanceSnapshotList) {
            this.instanceSnapshotList = instanceSnapshotList;
            return this;
        }

        /**
         * <p>The instance URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dsw-cn-shanghai.data.aliyun.com/notebook.htm?instance=39772#/">https://dsw-cn-shanghai.data.aliyun.com/notebook.htm?instance=39772#/</a></p>
         */
        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }

        /**
         * <p>The JupyterLab URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/lab/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/lab/</a></p>
         */
        public Builder jupyterlabUrl(String jupyterlabUrl) {
            this.jupyterlabUrl = jupyterlabUrl;
            return this;
        }

        /**
         * <p>The custom tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;foo&quot;: &quot;bar&quot;}</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The latest user image saved.</p>
         */
        public Builder latestSnapshot(LatestSnapshot latestSnapshot) {
            this.latestSnapshot = latestSnapshot;
            return this;
        }

        /**
         * <p>The error message. Valid values:</p>
         * <ul>
         * <li>If the request is successful, null is returned.</li>
         * <li>If the request fails, the cause for the failure is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;XXX&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The error recovery configuration of the node.</p>
         */
        public Builder nodeErrorRecovery(NodeErrorRecovery nodeErrorRecovery) {
            this.nodeErrorRecovery = nodeErrorRecovery;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PayAsYouGo</li>
         * <li>Subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The priority based on which resources are allocated to instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The proxy path.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-170197/proxy/</p>
         */
        public Builder proxyPath(String proxyPath) {
            this.proxyPath = proxyPath;
            return this;
        }

        /**
         * <p>The error code of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * <p>The cause of the instance error.</p>
         * 
         * <strong>example:</strong>
         * <p>ImagePullBackOff</p>
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource configurations in subscription scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;SharedMemory&quot;:&quot;4Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;Tesla-V100-16G&quot;}</p>
         */
        public Builder requestedResource(RequestedResource requestedResource) {
            this.requestedResource = requestedResource;
            return this;
        }

        /**
         * <p>The resource ID. This parameter is available if the billing method is subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-123456789</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The specification type.</p>
         * <ul>
         * <li>For subscription, this is the requested CPU and memory size.</li>
         * <li>For pay-as-you-go, this is the selected ECS instance type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs.g7.xlarge</p>
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The instance status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>SaveFailed</li>
         * <li>Stopped</li>
         * <li>Failed</li>
         * <li>ResourceAllocating</li>
         * <li>Stopping</li>
         * <li>Updating</li>
         * <li>Saving</li>
         * <li>Queuing</li>
         * <li>Recovering</li>
         * <li>Starting</li>
         * <li>Running</li>
         * <li>Saved</li>
         * <li>Deleting</li>
         * <li>EnvPreparing</li>
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
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The terminal URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/tty/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/tty/</a></p>
         */
        public Builder terminalUrl(String terminalUrl) {
            this.terminalUrl = terminalUrl;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1612285282502324</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>测试用户</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) configurations.</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>The Web IDE URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/ide/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/ide/</a></p>
         */
        public Builder webIDEUrl(String webIDEUrl) {
            this.webIDEUrl = webIDEUrl;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40823</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>training_data</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>The storage for the workspace. If you leave this parameter empty, the workspace uses File Storage NAS (NAS) storage, cloud disks, or local disks in sequence.</p>
         * 
         * <strong>example:</strong>
         * <p>d-123456789</p>
         */
        public Builder workspaceSource(String workspaceSource) {
            this.workspaceSource = workspaceSource;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class CPU extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private CPU(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CPU create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(CPU model) {
                this.enable = model.enable;
            } 

            /**
             * <p>Indicates whether CPU affinity is enabled.</p>
             * <p>true false</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public CPU build() {
                return new CPU(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Affinity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private CPU CPU;

        private Affinity(Builder builder) {
            this.CPU = builder.CPU;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Affinity create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public CPU getCPU() {
            return this.CPU;
        }

        public static final class Builder {
            private CPU CPU; 

            private Builder() {
            } 

            private Builder(Affinity model) {
                this.CPU = model.CPU;
            } 

            /**
             * <p>The CPU affinity configuration. Only subscription instances that use general-purpose computing resources support CPU affinity configuration.</p>
             */
            public Builder CPU(CPU CPU) {
                this.CPU = CPU;
                return this;
            }

            public Affinity build() {
                return new Affinity(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class CloudDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        private CloudDisks(Builder builder) {
            this.capacity = builder.capacity;
            this.mountPath = builder.mountPath;
            this.path = builder.path;
            this.subType = builder.subType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudDisks create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        public static final class Builder {
            private String capacity; 
            private String mountPath; 
            private String path; 
            private String subType; 

            private Builder() {
            } 

            private Builder(CloudDisks model) {
                this.capacity = model.capacity;
                this.mountPath = model.mountPath;
                this.path = model.path;
                this.subType = model.subType;
            } 

            /**
             * <p>Disk Capacity</p>
             * 
             * <strong>example:</strong>
             * <p>30Gi</p>
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The mount path of the cloud disk in the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/mmt/workspace</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The directory on the cloud disk that is mounted to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/workspace</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The usage mode of the cloud disk. The value rootfs indicates that the cloud disk is used as the root file system.</p>
             * 
             * <strong>example:</strong>
             * <p>rootfs</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            public CloudDisks build() {
                return new CloudDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Datasets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetVersion")
        private String datasetVersion;

        @com.aliyun.core.annotation.NameInMap("Dynamic")
        private Boolean dynamic;

        @com.aliyun.core.annotation.NameInMap("MountAccess")
        private String mountAccess;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("OptionType")
        private String optionType;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Datasets(Builder builder) {
            this.datasetId = builder.datasetId;
            this.datasetVersion = builder.datasetVersion;
            this.dynamic = builder.dynamic;
            this.mountAccess = builder.mountAccess;
            this.mountPath = builder.mountPath;
            this.optionType = builder.optionType;
            this.options = builder.options;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasets create() {
            return builder().build();
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetVersion
         */
        public String getDatasetVersion() {
            return this.datasetVersion;
        }

        /**
         * @return dynamic
         */
        public Boolean getDynamic() {
            return this.dynamic;
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
         * @return optionType
         */
        public String getOptionType() {
            return this.optionType;
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
            private String datasetId; 
            private String datasetVersion; 
            private Boolean dynamic; 
            private String mountAccess; 
            private String mountPath; 
            private String optionType; 
            private String options; 
            private String uri; 

            private Builder() {
            } 

            private Builder(Datasets model) {
                this.datasetId = model.datasetId;
                this.datasetVersion = model.datasetVersion;
                this.dynamic = model.dynamic;
                this.mountAccess = model.mountAccess;
                this.mountPath = model.mountPath;
                this.optionType = model.optionType;
                this.options = model.options;
                this.uri = model.uri;
            } 

            /**
             * <p>The dataset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-vsqjvsjp4orp5l206u</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The dataset version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder datasetVersion(String datasetVersion) {
                this.datasetVersion = datasetVersion;
                return this;
            }

            /**
             * <p>Indicates whether dynamic mounting is enabled. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dynamic(Boolean dynamic) {
                this.dynamic = dynamic;
                return this;
            }

            /**
             * <p>The read and write permissions. Valid values: RW and RO.</p>
             * 
             * <strong>example:</strong>
             * <p>RW</p>
             */
            public Builder mountAccess(String mountAccess) {
                this.mountAccess = mountAccess;
                return this;
            }

            /**
             * <p>The mount path in the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount type of the dataset (deprecated).</p>
             * 
             * <strong>example:</strong>
             * <p>FastReadWrite</p>
             */
            public Builder optionType(String optionType) {
                this.optionType = optionType;
                return this;
            }

            /**
             * <p>The mount type of the dataset.</p>
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
             * <p>The dataset URI.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket-name.oss-cn-shanghai-internal.aliyuncs.com/data/path/</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class IdleInstanceCuller extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuPercentThreshold")
        private Integer cpuPercentThreshold;

        @com.aliyun.core.annotation.NameInMap("GpuPercentThreshold")
        private Integer gpuPercentThreshold;

        @com.aliyun.core.annotation.NameInMap("IdleTimeInMinutes")
        private Integer idleTimeInMinutes;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTimeInMinutes")
        private Integer maxIdleTimeInMinutes;

        private IdleInstanceCuller(Builder builder) {
            this.cpuPercentThreshold = builder.cpuPercentThreshold;
            this.gpuPercentThreshold = builder.gpuPercentThreshold;
            this.idleTimeInMinutes = builder.idleTimeInMinutes;
            this.instanceId = builder.instanceId;
            this.maxIdleTimeInMinutes = builder.maxIdleTimeInMinutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdleInstanceCuller create() {
            return builder().build();
        }

        /**
         * @return cpuPercentThreshold
         */
        public Integer getCpuPercentThreshold() {
            return this.cpuPercentThreshold;
        }

        /**
         * @return gpuPercentThreshold
         */
        public Integer getGpuPercentThreshold() {
            return this.gpuPercentThreshold;
        }

        /**
         * @return idleTimeInMinutes
         */
        public Integer getIdleTimeInMinutes() {
            return this.idleTimeInMinutes;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxIdleTimeInMinutes
         */
        public Integer getMaxIdleTimeInMinutes() {
            return this.maxIdleTimeInMinutes;
        }

        public static final class Builder {
            private Integer cpuPercentThreshold; 
            private Integer gpuPercentThreshold; 
            private Integer idleTimeInMinutes; 
            private String instanceId; 
            private Integer maxIdleTimeInMinutes; 

            private Builder() {
            } 

            private Builder(IdleInstanceCuller model) {
                this.cpuPercentThreshold = model.cpuPercentThreshold;
                this.gpuPercentThreshold = model.gpuPercentThreshold;
                this.idleTimeInMinutes = model.idleTimeInMinutes;
                this.instanceId = model.instanceId;
                this.maxIdleTimeInMinutes = model.maxIdleTimeInMinutes;
            } 

            /**
             * <p>The CPU utilization threshold. Unit: percentage. Valid values: 1 to 100. If the CPU utilization of the instance is lower than this threshold, the instance is considered idle.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder cpuPercentThreshold(Integer cpuPercentThreshold) {
                this.cpuPercentThreshold = cpuPercentThreshold;
                return this;
            }

            /**
             * <p>The GPU utilization threshold. Unit: percentage. Valid values: 1 to 100. This parameter takes effect only if the instance is of the GPU instance type. If both CPU and GPU utilization is lower than the thresholds, the instance is considered idle.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder gpuPercentThreshold(Integer gpuPercentThreshold) {
                this.gpuPercentThreshold = gpuPercentThreshold;
                return this;
            }

            /**
             * <p>The current time duration for which the instance is idle. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder idleTimeInMinutes(Integer idleTimeInMinutes) {
                this.idleTimeInMinutes = idleTimeInMinutes;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dsw-730xxxxxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The maximum time duration for which the instance is idle. Unit: minutes. If the time duration for which the instance is idle exceeds this value, the system automatically stops the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder maxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
                this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
                return this;
            }

            public IdleInstanceCuller build() {
                return new IdleInstanceCuller(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class InstanceShutdownTimer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DueTime")
        private String dueTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RemainingTimeInMs")
        private Long remainingTimeInMs;

        private InstanceShutdownTimer(Builder builder) {
            this.dueTime = builder.dueTime;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.instanceId = builder.instanceId;
            this.remainingTimeInMs = builder.remainingTimeInMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceShutdownTimer create() {
            return builder().build();
        }

        /**
         * @return dueTime
         */
        public String getDueTime() {
            return this.dueTime;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return remainingTimeInMs
         */
        public Long getRemainingTimeInMs() {
            return this.remainingTimeInMs;
        }

        public static final class Builder {
            private String dueTime; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String instanceId; 
            private Long remainingTimeInMs; 

            private Builder() {
            } 

            private Builder(InstanceShutdownTimer model) {
                this.dueTime = model.dueTime;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.instanceId = model.instanceId;
                this.remainingTimeInMs = model.remainingTimeInMs;
            } 

            /**
             * <p>The scheduled stop time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder dueTime(String dueTime) {
                this.dueTime = dueTime;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The modified time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dsw-730xxxxxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The remaining time before the instance is stopped. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600000</p>
             */
            public Builder remainingTimeInMs(Long remainingTimeInMs) {
                this.remainingTimeInMs = remainingTimeInMs;
                return this;
            }

            public InstanceShutdownTimer build() {
                return new InstanceShutdownTimer(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class InstanceSnapshotList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("RepositoryUrl")
        private String repositoryUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceSnapshotList(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageUrl = builder.imageUrl;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.repositoryUrl = builder.repositoryUrl;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSnapshotList create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return repositoryUrl
         */
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String imageId; 
            private String imageName; 
            private String imageUrl; 
            private String reasonCode; 
            private String reasonMessage; 
            private String repositoryUrl; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstanceSnapshotList model) {
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageUrl = model.imageUrl;
                this.reasonCode = model.reasonCode;
                this.reasonMessage = model.reasonMessage;
                this.repositoryUrl = model.repositoryUrl;
                this.status = model.status;
            } 

            /**
             * <p>The time when the snapshot was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The time when the snapshot was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>image-05cefd0be2exxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>py36_cpu_tf1.12_ubuntu</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The image URL.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The error code of the instance snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>Internal Error</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The error message of the instance snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>ImagePullBackOff</p>
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * <p>The image repository URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images">https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images</a></p>
             */
            public Builder repositoryUrl(String repositoryUrl) {
                this.repositoryUrl = repositoryUrl;
                return this;
            }

            /**
             * <p>The instance snapshot status.</p>
             * 
             * <strong>example:</strong>
             * <p>Pushing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceSnapshotList build() {
                return new InstanceSnapshotList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
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

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>stsTokenOwner</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxxx</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class LatestSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("RepositoryUrl")
        private String repositoryUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private LatestSnapshot(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageUrl = builder.imageUrl;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.repositoryUrl = builder.repositoryUrl;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestSnapshot create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return repositoryUrl
         */
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String imageId; 
            private String imageName; 
            private String imageUrl; 
            private String reasonCode; 
            private String reasonMessage; 
            private String repositoryUrl; 
            private String status; 

            private Builder() {
            } 

            private Builder(LatestSnapshot model) {
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageUrl = model.imageUrl;
                this.reasonCode = model.reasonCode;
                this.reasonMessage = model.reasonMessage;
                this.repositoryUrl = model.repositoryUrl;
                this.status = model.status;
            } 

            /**
             * <p>The time when the snapshot was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The time when the snapshot was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-12T14:36:01Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>image-05cefd0be2exxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>py36_cpu_tf1.12_ubuntu</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The image URL.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The error code of the instance snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>Internal Error</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The error message of the instance snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>ImagePullBackOff</p>
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * <p>The image repository URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images">https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images</a></p>
             */
            public Builder repositoryUrl(String repositoryUrl) {
                this.repositoryUrl = repositoryUrl;
                return this;
            }

            /**
             * <p>The instance snapshot status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Committing</li>
             * <li>Pushing</li>
             * <li>Failed</li>
             * <li>Saved</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pushing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LatestSnapshot build() {
                return new LatestSnapshot(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class NodeErrorRecovery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoSwitchCountdownSeconds")
        private Long autoSwitchCountdownSeconds;

        @com.aliyun.core.annotation.NameInMap("enableAutoSwitchOnNodeError")
        private Boolean enableAutoSwitchOnNodeError;

        @com.aliyun.core.annotation.NameInMap("hasNodeError")
        private Boolean hasNodeError;

        private NodeErrorRecovery(Builder builder) {
            this.autoSwitchCountdownSeconds = builder.autoSwitchCountdownSeconds;
            this.enableAutoSwitchOnNodeError = builder.enableAutoSwitchOnNodeError;
            this.hasNodeError = builder.hasNodeError;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeErrorRecovery create() {
            return builder().build();
        }

        /**
         * @return autoSwitchCountdownSeconds
         */
        public Long getAutoSwitchCountdownSeconds() {
            return this.autoSwitchCountdownSeconds;
        }

        /**
         * @return enableAutoSwitchOnNodeError
         */
        public Boolean getEnableAutoSwitchOnNodeError() {
            return this.enableAutoSwitchOnNodeError;
        }

        /**
         * @return hasNodeError
         */
        public Boolean getHasNodeError() {
            return this.hasNodeError;
        }

        public static final class Builder {
            private Long autoSwitchCountdownSeconds; 
            private Boolean enableAutoSwitchOnNodeError; 
            private Boolean hasNodeError; 

            private Builder() {
            } 

            private Builder(NodeErrorRecovery model) {
                this.autoSwitchCountdownSeconds = model.autoSwitchCountdownSeconds;
                this.enableAutoSwitchOnNodeError = model.enableAutoSwitchOnNodeError;
                this.hasNodeError = model.hasNodeError;
            } 

            /**
             * <p>The number of seconds to wait before automatic switchover.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder autoSwitchCountdownSeconds(Long autoSwitchCountdownSeconds) {
                this.autoSwitchCountdownSeconds = autoSwitchCountdownSeconds;
                return this;
            }

            /**
             * <p>Indicates whether to enable automatic switchover when a node error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAutoSwitchOnNodeError(Boolean enableAutoSwitchOnNodeError) {
                this.enableAutoSwitchOnNodeError = enableAutoSwitchOnNodeError;
                return this;
            }

            /**
             * <p>Indicates whether the node has an error.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasNodeError(Boolean hasNodeError) {
                this.hasNodeError = hasNodeError;
                return this;
            }

            public NodeErrorRecovery build() {
                return new NodeErrorRecovery(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class RequestedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private String GPU;

        @com.aliyun.core.annotation.NameInMap("GPUType")
        private String GPUType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("SharedMemory")
        private String sharedMemory;

        private RequestedResource(Builder builder) {
            this.CPU = builder.CPU;
            this.GPU = builder.GPU;
            this.GPUType = builder.GPUType;
            this.memory = builder.memory;
            this.sharedMemory = builder.sharedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestedResource create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return GPU
         */
        public String getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUType
         */
        public String getGPUType() {
            return this.GPUType;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return sharedMemory
         */
        public String getSharedMemory() {
            return this.sharedMemory;
        }

        public static final class Builder {
            private String CPU; 
            private String GPU; 
            private String GPUType; 
            private String memory; 
            private String sharedMemory; 

            private Builder() {
            } 

            private Builder(RequestedResource model) {
                this.CPU = model.CPU;
                this.GPU = model.GPU;
                this.GPUType = model.GPUType;
                this.memory = model.memory;
                this.sharedMemory = model.sharedMemory;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>The GPU type. Valid values:</p>
             * <ul>
             * <li>V100</li>
             * <li>A100</li>
             * <li>T4</li>
             * <li>A10</li>
             * <li>P100</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>v100</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The shared memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder sharedMemory(String sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            public RequestedResource build() {
                return new RequestedResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
        private BandwidthLimit bandwidthLimit;

        @com.aliyun.core.annotation.NameInMap("DefaultRoute")
        private String defaultRoute;

        @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
        private java.util.List<String> extendedCIDRs;

        @com.aliyun.core.annotation.NameInMap("ForwardInfos")
        private java.util.List<ForwardInfoResponse> forwardInfos;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.bandwidthLimit = builder.bandwidthLimit;
            this.defaultRoute = builder.defaultRoute;
            this.extendedCIDRs = builder.extendedCIDRs;
            this.forwardInfos = builder.forwardInfos;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return bandwidthLimit
         */
        public BandwidthLimit getBandwidthLimit() {
            return this.bandwidthLimit;
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
         * @return forwardInfos
         */
        public java.util.List<ForwardInfoResponse> getForwardInfos() {
            return this.forwardInfos;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private BandwidthLimit bandwidthLimit; 
            private String defaultRoute; 
            private java.util.List<String> extendedCIDRs; 
            private java.util.List<ForwardInfoResponse> forwardInfos; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.bandwidthLimit = model.bandwidthLimit;
                this.defaultRoute = model.defaultRoute;
                this.extendedCIDRs = model.extendedCIDRs;
                this.forwardInfos = model.forwardInfos;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * BandwidthLimit.
             */
            public Builder bandwidthLimit(BandwidthLimit bandwidthLimit) {
                this.bandwidthLimit = bandwidthLimit;
                return this;
            }

            /**
             * <p>Default Route</p>
             * 
             * <strong>example:</strong>
             * <p>eth0 | eth1</p>
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * <p>The extended CIDR block.</p>
             * <ul>
             * <li>If you leave VSwitchId empty, this parameter is not required and the system automatically obtains all CIDR blocks in the VPC.</li>
             * <li>If VSwitchId is not empty, this parameter is required. Specify all CIDR blocks in the VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;192.168.0.1/24&quot;, &quot;192.168.1.1/24&quot;]</p>
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * <p>The forward information.</p>
             */
            public Builder forwardInfos(java.util.List<ForwardInfoResponse> forwardInfos) {
                this.forwardInfos = forwardInfos;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxxxxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxx</p>
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
