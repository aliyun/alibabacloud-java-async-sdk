// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("AcceleratorType")
    private String acceleratorType;

    @NameInMap("Accessibility")
    private String accessibility;

    @NameInMap("AccumulatedRunningTimeInMs")
    private Long accumulatedRunningTimeInMs;

    @NameInMap("Code")
    private String code;

    @NameInMap("Datasets")
    private java.util.List < Datasets> datasets;

    @NameInMap("EcsSpec")
    private String ecsSpec;

    @NameInMap("EnvironmentVariables")
    private java.util.Map < String, String > environmentVariables;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("ImageName")
    private String imageName;

    @NameInMap("ImageUrl")
    private String imageUrl;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("InstanceShutdownTimer")
    private InstanceShutdownTimer instanceShutdownTimer;

    @NameInMap("InstanceUrl")
    private String instanceUrl;

    @NameInMap("JupyterlabUrl")
    private String jupyterlabUrl;

    @NameInMap("LatestSnapshot")
    private LatestSnapshot latestSnapshot;

    @NameInMap("Message")
    private String message;

    @NameInMap("PaymentType")
    private String paymentType;

    @NameInMap("Priority")
    private Long priority;

    @NameInMap("ReasonCode")
    private String reasonCode;

    @NameInMap("ReasonMessage")
    private String reasonMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestedResource")
    private RequestedResource requestedResource;

    @NameInMap("ResourceId")
    private String resourceId;

    @NameInMap("ResourceName")
    private String resourceName;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TerminalUrl")
    private String terminalUrl;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("UserName")
    private String userName;

    @NameInMap("UserVpc")
    private UserVpc userVpc;

    @NameInMap("WebIDEUrl")
    private String webIDEUrl;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    @NameInMap("WorkspaceName")
    private String workspaceName;

    private GetInstanceResponseBody(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.accessibility = builder.accessibility;
        this.accumulatedRunningTimeInMs = builder.accumulatedRunningTimeInMs;
        this.code = builder.code;
        this.datasets = builder.datasets;
        this.ecsSpec = builder.ecsSpec;
        this.environmentVariables = builder.environmentVariables;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.httpStatusCode = builder.httpStatusCode;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.imageUrl = builder.imageUrl;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceShutdownTimer = builder.instanceShutdownTimer;
        this.instanceUrl = builder.instanceUrl;
        this.jupyterlabUrl = builder.jupyterlabUrl;
        this.latestSnapshot = builder.latestSnapshot;
        this.message = builder.message;
        this.paymentType = builder.paymentType;
        this.priority = builder.priority;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.requestedResource = builder.requestedResource;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.status = builder.status;
        this.success = builder.success;
        this.terminalUrl = builder.terminalUrl;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userVpc = builder.userVpc;
        this.webIDEUrl = builder.webIDEUrl;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return datasets
     */
    public java.util.List < Datasets> getDatasets() {
        return this.datasets;
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
    public java.util.Map < String, String > getEnvironmentVariables() {
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

    public static final class Builder {
        private String acceleratorType; 
        private String accessibility; 
        private Long accumulatedRunningTimeInMs; 
        private String code; 
        private java.util.List < Datasets> datasets; 
        private String ecsSpec; 
        private java.util.Map < String, String > environmentVariables; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Integer httpStatusCode; 
        private String imageId; 
        private String imageName; 
        private String imageUrl; 
        private String instanceId; 
        private String instanceName; 
        private InstanceShutdownTimer instanceShutdownTimer; 
        private String instanceUrl; 
        private String jupyterlabUrl; 
        private LatestSnapshot latestSnapshot; 
        private String message; 
        private String paymentType; 
        private Long priority; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private RequestedResource requestedResource; 
        private String resourceId; 
        private String resourceName; 
        private String status; 
        private Boolean success; 
        private String terminalUrl; 
        private String userId; 
        private String userName; 
        private UserVpc userVpc; 
        private String webIDEUrl; 
        private String workspaceId; 
        private String workspaceName; 

        /**
         * ??????????????????
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * ?????????????????????????????????
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * ?????????????????????ms???
         */
        public Builder accumulatedRunningTimeInMs(Long accumulatedRunningTimeInMs) {
            this.accumulatedRunningTimeInMs = accumulatedRunningTimeInMs;
            return this;
        }

        /**
         * ?????????
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder datasets(java.util.List < Datasets> datasets) {
            this.datasets = datasets;
            return this;
        }

        /**
         * ???????????????Ecs??????
         */
        public Builder ecsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * ????????????
         */
        public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * http?????????
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * ??????Id
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        /**
         * ????????????
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * ??????Id
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder instanceShutdownTimer(InstanceShutdownTimer instanceShutdownTimer) {
            this.instanceShutdownTimer = instanceShutdownTimer;
            return this;
        }

        /**
         * ??????Url
         */
        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }

        /**
         * Jupyterlab Url
         */
        public Builder jupyterlabUrl(String jupyterlabUrl) {
            this.jupyterlabUrl = jupyterlabUrl;
            return this;
        }

        /**
         * ???????????????????????????
         */
        public Builder latestSnapshot(LatestSnapshot latestSnapshot) {
            this.latestSnapshot = latestSnapshot;
            return this;
        }

        /**
         * ??????
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ????????????
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * ???????????????????????????????????????????????????????????????????????????
         */
        public Builder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * ??????Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ?????????????????????????????????????????????
         */
        public Builder requestedResource(RequestedResource requestedResource) {
            this.requestedResource = requestedResource;
            return this;
        }

        /**
         * ??????Id,??????????????????
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ????????????
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ????????????
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * ??????url
         */
        public Builder terminalUrl(String terminalUrl) {
            this.terminalUrl = terminalUrl;
            return this;
        }

        /**
         * ??????Id
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * user vpc??????
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        /**
         * Web IDE url
         */
        public Builder webIDEUrl(String webIDEUrl) {
            this.webIDEUrl = webIDEUrl;
            return this;
        }

        /**
         * ????????????Id
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class Datasets extends TeaModel {
        @NameInMap("DatasetId")
        private String datasetId;

        @NameInMap("MountPath")
        private String mountPath;

        private Datasets(Builder builder) {
            this.datasetId = builder.datasetId;
            this.mountPath = builder.mountPath;
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
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private String datasetId; 
            private String mountPath; 

            /**
             * ?????????Id
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * ?????????????????????
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
    public static class InstanceShutdownTimer extends TeaModel {
        @NameInMap("DueTime")
        private String dueTime;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RemainingTimeInMs")
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

            /**
             * ??????????????????
             */
            public Builder dueTime(String dueTime) {
                this.dueTime = dueTime;
                return this;
            }

            /**
             * ????????????
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * ????????????
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * ??????Id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ?????????????????????ms???
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
    public static class LatestSnapshot extends TeaModel {
        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("RepositoryUrl")
        private String repositoryUrl;

        private LatestSnapshot(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageUrl = builder.imageUrl;
            this.repositoryUrl = builder.repositoryUrl;
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
         * @return repositoryUrl
         */
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String imageId; 
            private String imageName; 
            private String imageUrl; 
            private String repositoryUrl; 

            /**
             * ??????????????????
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * ??????Id
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ????????????
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ??????Url
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * ????????????Url
             */
            public Builder repositoryUrl(String repositoryUrl) {
                this.repositoryUrl = repositoryUrl;
                return this;
            }

            public LatestSnapshot build() {
                return new LatestSnapshot(this);
            } 

        } 

    }
    public static class RequestedResource extends TeaModel {
        @NameInMap("CPU")
        private String CPU;

        @NameInMap("GPU")
        private String GPU;

        @NameInMap("GPUType")
        private String GPUType;

        @NameInMap("Memory")
        private String memory;

        @NameInMap("SharedMemory")
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

            /**
             * cpu??????
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * gpu??????
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * gpu????????????
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * memory??????
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * shared memory??????
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
    public static class UserVpc extends TeaModel {
        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
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
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * Security Group Id
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VSwitch Id
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * Vpc Id
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
