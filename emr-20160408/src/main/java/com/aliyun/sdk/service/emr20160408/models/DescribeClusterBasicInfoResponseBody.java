// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterBasicInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterBasicInfoResponseBody</p>
 */
public class DescribeClusterBasicInfoResponseBody extends TeaModel {
    @NameInMap("ClusterInfo")
    private ClusterInfo clusterInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterBasicInfoResponseBody(Builder builder) {
        this.clusterInfo = builder.clusterInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterBasicInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterInfo
     */
    public ClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterInfo clusterInfo; 
        private String requestId; 

        /**
         * ClusterInfo.
         */
        public Builder clusterInfo(ClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterBasicInfoResponseBody build() {
            return new DescribeClusterBasicInfoResponseBody(this);
        } 

    } 

    public static class ZKLink extends TeaModel {
        @NameInMap("Link")
        private String link;

        @NameInMap("Port")
        private String port;

        private ZKLink(Builder builder) {
            this.link = builder.link;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZKLink create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String link; 
            private String port; 

            /**
             * Link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public ZKLink build() {
                return new ZKLink(this);
            } 

        } 

    }
    public static class ZKLinks extends TeaModel {
        @NameInMap("ZKLink")
        private java.util.List < ZKLink> ZKLink;

        private ZKLinks(Builder builder) {
            this.ZKLink = builder.ZKLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZKLinks create() {
            return builder().build();
        }

        /**
         * @return ZKLink
         */
        public java.util.List < ZKLink> getZKLink() {
            return this.ZKLink;
        }

        public static final class Builder {
            private java.util.List < ZKLink> ZKLink; 

            /**
             * ZKLink.
             */
            public Builder ZKLink(java.util.List < ZKLink> ZKLink) {
                this.ZKLink = ZKLink;
                return this;
            }

            public ZKLinks build() {
                return new ZKLinks(this);
            } 

        } 

    }
    public static class AccessInfo extends TeaModel {
        @NameInMap("ZKLinks")
        private ZKLinks ZKLinks;

        private AccessInfo(Builder builder) {
            this.ZKLinks = builder.ZKLinks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessInfo create() {
            return builder().build();
        }

        /**
         * @return ZKLinks
         */
        public ZKLinks getZKLinks() {
            return this.ZKLinks;
        }

        public static final class Builder {
            private ZKLinks ZKLinks; 

            /**
             * ZKLinks.
             */
            public Builder ZKLinks(ZKLinks ZKLinks) {
                this.ZKLinks = ZKLinks;
                return this;
            }

            public AccessInfo build() {
                return new AccessInfo(this);
            } 

        } 

    }
    public static class BootstrapAction extends TeaModel {
        @NameInMap("Arg")
        private String arg;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        private BootstrapAction(Builder builder) {
            this.arg = builder.arg;
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BootstrapAction create() {
            return builder().build();
        }

        /**
         * @return arg
         */
        public String getArg() {
            return this.arg;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String arg; 
            private String name; 
            private String path; 

            /**
             * Arg.
             */
            public Builder arg(String arg) {
                this.arg = arg;
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
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public BootstrapAction build() {
                return new BootstrapAction(this);
            } 

        } 

    }
    public static class BootstrapActionList extends TeaModel {
        @NameInMap("BootstrapAction")
        private java.util.List < BootstrapAction> bootstrapAction;

        private BootstrapActionList(Builder builder) {
            this.bootstrapAction = builder.bootstrapAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BootstrapActionList create() {
            return builder().build();
        }

        /**
         * @return bootstrapAction
         */
        public java.util.List < BootstrapAction> getBootstrapAction() {
            return this.bootstrapAction;
        }

        public static final class Builder {
            private java.util.List < BootstrapAction> bootstrapAction; 

            /**
             * BootstrapAction.
             */
            public Builder bootstrapAction(java.util.List < BootstrapAction> bootstrapAction) {
                this.bootstrapAction = bootstrapAction;
                return this;
            }

            public BootstrapActionList build() {
                return new BootstrapActionList(this);
            } 

        } 

    }
    public static class FailReason extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("RequestId")
        private String requestId;

        private FailReason(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailReason create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private String requestId; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public FailReason build() {
                return new FailReason(this);
            } 

        } 

    }
    public static class GatewayClusterInfo extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("Status")
        private String status;

        private GatewayClusterInfo(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayClusterInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String status; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public GatewayClusterInfo build() {
                return new GatewayClusterInfo(this);
            } 

        } 

    }
    public static class GatewayClusterInfoList extends TeaModel {
        @NameInMap("GatewayClusterInfo")
        private java.util.List < GatewayClusterInfo> gatewayClusterInfo;

        private GatewayClusterInfoList(Builder builder) {
            this.gatewayClusterInfo = builder.gatewayClusterInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayClusterInfoList create() {
            return builder().build();
        }

        /**
         * @return gatewayClusterInfo
         */
        public java.util.List < GatewayClusterInfo> getGatewayClusterInfo() {
            return this.gatewayClusterInfo;
        }

        public static final class Builder {
            private java.util.List < GatewayClusterInfo> gatewayClusterInfo; 

            /**
             * GatewayClusterInfo.
             */
            public Builder gatewayClusterInfo(java.util.List < GatewayClusterInfo> gatewayClusterInfo) {
                this.gatewayClusterInfo = gatewayClusterInfo;
                return this;
            }

            public GatewayClusterInfoList build() {
                return new GatewayClusterInfoList(this);
            } 

        } 

    }
    public static class HostPoolInfo extends TeaModel {
        @NameInMap("HpBizId")
        private String hpBizId;

        @NameInMap("HpName")
        private String hpName;

        private HostPoolInfo(Builder builder) {
            this.hpBizId = builder.hpBizId;
            this.hpName = builder.hpName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostPoolInfo create() {
            return builder().build();
        }

        /**
         * @return hpBizId
         */
        public String getHpBizId() {
            return this.hpBizId;
        }

        /**
         * @return hpName
         */
        public String getHpName() {
            return this.hpName;
        }

        public static final class Builder {
            private String hpBizId; 
            private String hpName; 

            /**
             * HpBizId.
             */
            public Builder hpBizId(String hpBizId) {
                this.hpBizId = hpBizId;
                return this;
            }

            /**
             * HpName.
             */
            public Builder hpName(String hpName) {
                this.hpName = hpName;
                return this;
            }

            public HostPoolInfo build() {
                return new HostPoolInfo(this);
            } 

        } 

    }
    public static class RelateClusterInfo extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("Status")
        private String status;

        private RelateClusterInfo(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelateClusterInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private String status; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RelateClusterInfo build() {
                return new RelateClusterInfo(this);
            } 

        } 

    }
    public static class Software extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Name")
        private String name;

        @NameInMap("OnlyDisplay")
        private Boolean onlyDisplay;

        @NameInMap("StartTpe")
        private Integer startTpe;

        @NameInMap("Version")
        private String version;

        private Software(Builder builder) {
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.onlyDisplay = builder.onlyDisplay;
            this.startTpe = builder.startTpe;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Software create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onlyDisplay
         */
        public Boolean getOnlyDisplay() {
            return this.onlyDisplay;
        }

        /**
         * @return startTpe
         */
        public Integer getStartTpe() {
            return this.startTpe;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String displayName; 
            private String name; 
            private Boolean onlyDisplay; 
            private Integer startTpe; 
            private String version; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
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
             * OnlyDisplay.
             */
            public Builder onlyDisplay(Boolean onlyDisplay) {
                this.onlyDisplay = onlyDisplay;
                return this;
            }

            /**
             * StartTpe.
             */
            public Builder startTpe(Integer startTpe) {
                this.startTpe = startTpe;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Software build() {
                return new Software(this);
            } 

        } 

    }
    public static class Softwares extends TeaModel {
        @NameInMap("Software")
        private java.util.List < Software> software;

        private Softwares(Builder builder) {
            this.software = builder.software;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Softwares create() {
            return builder().build();
        }

        /**
         * @return software
         */
        public java.util.List < Software> getSoftware() {
            return this.software;
        }

        public static final class Builder {
            private java.util.List < Software> software; 

            /**
             * Software.
             */
            public Builder software(java.util.List < Software> software) {
                this.software = software;
                return this;
            }

            public Softwares build() {
                return new Softwares(this);
            } 

        } 

    }
    public static class SoftwareInfo extends TeaModel {
        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("EmrVer")
        private String emrVer;

        @NameInMap("Softwares")
        private Softwares softwares;

        private SoftwareInfo(Builder builder) {
            this.clusterType = builder.clusterType;
            this.emrVer = builder.emrVer;
            this.softwares = builder.softwares;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareInfo create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return emrVer
         */
        public String getEmrVer() {
            return this.emrVer;
        }

        /**
         * @return softwares
         */
        public Softwares getSoftwares() {
            return this.softwares;
        }

        public static final class Builder {
            private String clusterType; 
            private String emrVer; 
            private Softwares softwares; 

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * EmrVer.
             */
            public Builder emrVer(String emrVer) {
                this.emrVer = emrVer;
                return this;
            }

            /**
             * Softwares.
             */
            public Builder softwares(Softwares softwares) {
                this.softwares = softwares;
                return this;
            }

            public SoftwareInfo build() {
                return new SoftwareInfo(this);
            } 

        } 

    }
    public static class ClusterInfo extends TeaModel {
        @NameInMap("AccessInfo")
        private AccessInfo accessInfo;

        @NameInMap("AutoScalingAllowed")
        private Boolean autoScalingAllowed;

        @NameInMap("AutoScalingByLoadAllowed")
        private Boolean autoScalingByLoadAllowed;

        @NameInMap("AutoScalingEnable")
        private Boolean autoScalingEnable;

        @NameInMap("AutoScalingSpotWithLimitAllowed")
        private Boolean autoScalingSpotWithLimitAllowed;

        @NameInMap("AutoScalingVersion")
        private String autoScalingVersion;

        @NameInMap("AutoScalingWithGraceAllowed")
        private Boolean autoScalingWithGraceAllowed;

        @NameInMap("BootstrapActionList")
        private BootstrapActionList bootstrapActionList;

        @NameInMap("BootstrapFailed")
        private Boolean bootstrapFailed;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ClickhouseConf")
        private String clickhouseConf;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Configurations")
        private String configurations;

        @NameInMap("CoreNodeInService")
        private Integer coreNodeInService;

        @NameInMap("CoreNodeTotal")
        private Integer coreNodeTotal;

        @NameInMap("CreateResource")
        private String createResource;

        @NameInMap("CreateType")
        private String createType;

        @NameInMap("DataDiskEncrypted")
        private Boolean dataDiskEncrypted;

        @NameInMap("DataDiskKMSKeyId")
        private String dataDiskKMSKeyId;

        @NameInMap("DepositType")
        private String depositType;

        @NameInMap("EasEnable")
        private Boolean easEnable;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("ExtraInfo")
        private String extraInfo;

        @NameInMap("FailReason")
        private FailReason failReason;

        @NameInMap("GatewayClusterIds")
        private String gatewayClusterIds;

        @NameInMap("GatewayClusterInfoList")
        private GatewayClusterInfoList gatewayClusterInfoList;

        @NameInMap("HighAvailabilityEnable")
        private Boolean highAvailabilityEnable;

        @NameInMap("HostPoolInfo")
        private HostPoolInfo hostPoolInfo;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InstanceGeneration")
        private String instanceGeneration;

        @NameInMap("IoOptimized")
        private Boolean ioOptimized;

        @NameInMap("K8sClusterId")
        private String k8sClusterId;

        @NameInMap("LocalMetaDb")
        private Boolean localMetaDb;

        @NameInMap("LogEnable")
        private Boolean logEnable;

        @NameInMap("LogPath")
        private String logPath;

        @NameInMap("MachineType")
        private String machineType;

        @NameInMap("MasterNodeInService")
        private Integer masterNodeInService;

        @NameInMap("MasterNodeTotal")
        private Integer masterNodeTotal;

        @NameInMap("MetaStoreType")
        private String metaStoreType;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("OperationId")
        private String operationId;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RelateClusterId")
        private String relateClusterId;

        @NameInMap("RelateClusterInfo")
        private RelateClusterInfo relateClusterInfo;

        @NameInMap("ResizeClusterEnable")
        private Boolean resizeClusterEnable;

        @NameInMap("ResizeDiskEnable")
        private Boolean resizeDiskEnable;

        @NameInMap("RunningTime")
        private Integer runningTime;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupName")
        private String securityGroupName;

        @NameInMap("ShowSoftwareInterface")
        private Boolean showSoftwareInterface;

        @NameInMap("SoftwareInfo")
        private SoftwareInfo softwareInfo;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StopTime")
        private Long stopTime;

        @NameInMap("TaskNodeInService")
        private Integer taskNodeInService;

        @NameInMap("TaskNodeTotal")
        private Integer taskNodeTotal;

        @NameInMap("UserDefinedEmrEcsRole")
        private String userDefinedEmrEcsRole;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ClusterInfo(Builder builder) {
            this.accessInfo = builder.accessInfo;
            this.autoScalingAllowed = builder.autoScalingAllowed;
            this.autoScalingByLoadAllowed = builder.autoScalingByLoadAllowed;
            this.autoScalingEnable = builder.autoScalingEnable;
            this.autoScalingSpotWithLimitAllowed = builder.autoScalingSpotWithLimitAllowed;
            this.autoScalingVersion = builder.autoScalingVersion;
            this.autoScalingWithGraceAllowed = builder.autoScalingWithGraceAllowed;
            this.bootstrapActionList = builder.bootstrapActionList;
            this.bootstrapFailed = builder.bootstrapFailed;
            this.chargeType = builder.chargeType;
            this.clickhouseConf = builder.clickhouseConf;
            this.clusterId = builder.clusterId;
            this.configurations = builder.configurations;
            this.coreNodeInService = builder.coreNodeInService;
            this.coreNodeTotal = builder.coreNodeTotal;
            this.createResource = builder.createResource;
            this.createType = builder.createType;
            this.dataDiskEncrypted = builder.dataDiskEncrypted;
            this.dataDiskKMSKeyId = builder.dataDiskKMSKeyId;
            this.depositType = builder.depositType;
            this.easEnable = builder.easEnable;
            this.expiredTime = builder.expiredTime;
            this.extraInfo = builder.extraInfo;
            this.failReason = builder.failReason;
            this.gatewayClusterIds = builder.gatewayClusterIds;
            this.gatewayClusterInfoList = builder.gatewayClusterInfoList;
            this.highAvailabilityEnable = builder.highAvailabilityEnable;
            this.hostPoolInfo = builder.hostPoolInfo;
            this.imageId = builder.imageId;
            this.instanceGeneration = builder.instanceGeneration;
            this.ioOptimized = builder.ioOptimized;
            this.k8sClusterId = builder.k8sClusterId;
            this.localMetaDb = builder.localMetaDb;
            this.logEnable = builder.logEnable;
            this.logPath = builder.logPath;
            this.machineType = builder.machineType;
            this.masterNodeInService = builder.masterNodeInService;
            this.masterNodeTotal = builder.masterNodeTotal;
            this.metaStoreType = builder.metaStoreType;
            this.name = builder.name;
            this.netType = builder.netType;
            this.operationId = builder.operationId;
            this.period = builder.period;
            this.regionId = builder.regionId;
            this.relateClusterId = builder.relateClusterId;
            this.relateClusterInfo = builder.relateClusterInfo;
            this.resizeClusterEnable = builder.resizeClusterEnable;
            this.resizeDiskEnable = builder.resizeDiskEnable;
            this.runningTime = builder.runningTime;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
            this.showSoftwareInterface = builder.showSoftwareInterface;
            this.softwareInfo = builder.softwareInfo;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.stopTime = builder.stopTime;
            this.taskNodeInService = builder.taskNodeInService;
            this.taskNodeTotal = builder.taskNodeTotal;
            this.userDefinedEmrEcsRole = builder.userDefinedEmrEcsRole;
            this.userId = builder.userId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfo create() {
            return builder().build();
        }

        /**
         * @return accessInfo
         */
        public AccessInfo getAccessInfo() {
            return this.accessInfo;
        }

        /**
         * @return autoScalingAllowed
         */
        public Boolean getAutoScalingAllowed() {
            return this.autoScalingAllowed;
        }

        /**
         * @return autoScalingByLoadAllowed
         */
        public Boolean getAutoScalingByLoadAllowed() {
            return this.autoScalingByLoadAllowed;
        }

        /**
         * @return autoScalingEnable
         */
        public Boolean getAutoScalingEnable() {
            return this.autoScalingEnable;
        }

        /**
         * @return autoScalingSpotWithLimitAllowed
         */
        public Boolean getAutoScalingSpotWithLimitAllowed() {
            return this.autoScalingSpotWithLimitAllowed;
        }

        /**
         * @return autoScalingVersion
         */
        public String getAutoScalingVersion() {
            return this.autoScalingVersion;
        }

        /**
         * @return autoScalingWithGraceAllowed
         */
        public Boolean getAutoScalingWithGraceAllowed() {
            return this.autoScalingWithGraceAllowed;
        }

        /**
         * @return bootstrapActionList
         */
        public BootstrapActionList getBootstrapActionList() {
            return this.bootstrapActionList;
        }

        /**
         * @return bootstrapFailed
         */
        public Boolean getBootstrapFailed() {
            return this.bootstrapFailed;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clickhouseConf
         */
        public String getClickhouseConf() {
            return this.clickhouseConf;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return configurations
         */
        public String getConfigurations() {
            return this.configurations;
        }

        /**
         * @return coreNodeInService
         */
        public Integer getCoreNodeInService() {
            return this.coreNodeInService;
        }

        /**
         * @return coreNodeTotal
         */
        public Integer getCoreNodeTotal() {
            return this.coreNodeTotal;
        }

        /**
         * @return createResource
         */
        public String getCreateResource() {
            return this.createResource;
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
        }

        /**
         * @return dataDiskEncrypted
         */
        public Boolean getDataDiskEncrypted() {
            return this.dataDiskEncrypted;
        }

        /**
         * @return dataDiskKMSKeyId
         */
        public String getDataDiskKMSKeyId() {
            return this.dataDiskKMSKeyId;
        }

        /**
         * @return depositType
         */
        public String getDepositType() {
            return this.depositType;
        }

        /**
         * @return easEnable
         */
        public Boolean getEasEnable() {
            return this.easEnable;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return failReason
         */
        public FailReason getFailReason() {
            return this.failReason;
        }

        /**
         * @return gatewayClusterIds
         */
        public String getGatewayClusterIds() {
            return this.gatewayClusterIds;
        }

        /**
         * @return gatewayClusterInfoList
         */
        public GatewayClusterInfoList getGatewayClusterInfoList() {
            return this.gatewayClusterInfoList;
        }

        /**
         * @return highAvailabilityEnable
         */
        public Boolean getHighAvailabilityEnable() {
            return this.highAvailabilityEnable;
        }

        /**
         * @return hostPoolInfo
         */
        public HostPoolInfo getHostPoolInfo() {
            return this.hostPoolInfo;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceGeneration
         */
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        /**
         * @return ioOptimized
         */
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return k8sClusterId
         */
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        /**
         * @return localMetaDb
         */
        public Boolean getLocalMetaDb() {
            return this.localMetaDb;
        }

        /**
         * @return logEnable
         */
        public Boolean getLogEnable() {
            return this.logEnable;
        }

        /**
         * @return logPath
         */
        public String getLogPath() {
            return this.logPath;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return masterNodeInService
         */
        public Integer getMasterNodeInService() {
            return this.masterNodeInService;
        }

        /**
         * @return masterNodeTotal
         */
        public Integer getMasterNodeTotal() {
            return this.masterNodeTotal;
        }

        /**
         * @return metaStoreType
         */
        public String getMetaStoreType() {
            return this.metaStoreType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relateClusterId
         */
        public String getRelateClusterId() {
            return this.relateClusterId;
        }

        /**
         * @return relateClusterInfo
         */
        public RelateClusterInfo getRelateClusterInfo() {
            return this.relateClusterInfo;
        }

        /**
         * @return resizeClusterEnable
         */
        public Boolean getResizeClusterEnable() {
            return this.resizeClusterEnable;
        }

        /**
         * @return resizeDiskEnable
         */
        public Boolean getResizeDiskEnable() {
            return this.resizeDiskEnable;
        }

        /**
         * @return runningTime
         */
        public Integer getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        /**
         * @return showSoftwareInterface
         */
        public Boolean getShowSoftwareInterface() {
            return this.showSoftwareInterface;
        }

        /**
         * @return softwareInfo
         */
        public SoftwareInfo getSoftwareInfo() {
            return this.softwareInfo;
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
         * @return stopTime
         */
        public Long getStopTime() {
            return this.stopTime;
        }

        /**
         * @return taskNodeInService
         */
        public Integer getTaskNodeInService() {
            return this.taskNodeInService;
        }

        /**
         * @return taskNodeTotal
         */
        public Integer getTaskNodeTotal() {
            return this.taskNodeTotal;
        }

        /**
         * @return userDefinedEmrEcsRole
         */
        public String getUserDefinedEmrEcsRole() {
            return this.userDefinedEmrEcsRole;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
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

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private AccessInfo accessInfo; 
            private Boolean autoScalingAllowed; 
            private Boolean autoScalingByLoadAllowed; 
            private Boolean autoScalingEnable; 
            private Boolean autoScalingSpotWithLimitAllowed; 
            private String autoScalingVersion; 
            private Boolean autoScalingWithGraceAllowed; 
            private BootstrapActionList bootstrapActionList; 
            private Boolean bootstrapFailed; 
            private String chargeType; 
            private String clickhouseConf; 
            private String clusterId; 
            private String configurations; 
            private Integer coreNodeInService; 
            private Integer coreNodeTotal; 
            private String createResource; 
            private String createType; 
            private Boolean dataDiskEncrypted; 
            private String dataDiskKMSKeyId; 
            private String depositType; 
            private Boolean easEnable; 
            private Long expiredTime; 
            private String extraInfo; 
            private FailReason failReason; 
            private String gatewayClusterIds; 
            private GatewayClusterInfoList gatewayClusterInfoList; 
            private Boolean highAvailabilityEnable; 
            private HostPoolInfo hostPoolInfo; 
            private String imageId; 
            private String instanceGeneration; 
            private Boolean ioOptimized; 
            private String k8sClusterId; 
            private Boolean localMetaDb; 
            private Boolean logEnable; 
            private String logPath; 
            private String machineType; 
            private Integer masterNodeInService; 
            private Integer masterNodeTotal; 
            private String metaStoreType; 
            private String name; 
            private String netType; 
            private String operationId; 
            private Integer period; 
            private String regionId; 
            private String relateClusterId; 
            private RelateClusterInfo relateClusterInfo; 
            private Boolean resizeClusterEnable; 
            private Boolean resizeDiskEnable; 
            private Integer runningTime; 
            private String securityGroupId; 
            private String securityGroupName; 
            private Boolean showSoftwareInterface; 
            private SoftwareInfo softwareInfo; 
            private Long startTime; 
            private String status; 
            private Long stopTime; 
            private Integer taskNodeInService; 
            private Integer taskNodeTotal; 
            private String userDefinedEmrEcsRole; 
            private String userId; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AccessInfo.
             */
            public Builder accessInfo(AccessInfo accessInfo) {
                this.accessInfo = accessInfo;
                return this;
            }

            /**
             * AutoScalingAllowed.
             */
            public Builder autoScalingAllowed(Boolean autoScalingAllowed) {
                this.autoScalingAllowed = autoScalingAllowed;
                return this;
            }

            /**
             * AutoScalingByLoadAllowed.
             */
            public Builder autoScalingByLoadAllowed(Boolean autoScalingByLoadAllowed) {
                this.autoScalingByLoadAllowed = autoScalingByLoadAllowed;
                return this;
            }

            /**
             * AutoScalingEnable.
             */
            public Builder autoScalingEnable(Boolean autoScalingEnable) {
                this.autoScalingEnable = autoScalingEnable;
                return this;
            }

            /**
             * AutoScalingSpotWithLimitAllowed.
             */
            public Builder autoScalingSpotWithLimitAllowed(Boolean autoScalingSpotWithLimitAllowed) {
                this.autoScalingSpotWithLimitAllowed = autoScalingSpotWithLimitAllowed;
                return this;
            }

            /**
             * AutoScalingVersion.
             */
            public Builder autoScalingVersion(String autoScalingVersion) {
                this.autoScalingVersion = autoScalingVersion;
                return this;
            }

            /**
             * AutoScalingWithGraceAllowed.
             */
            public Builder autoScalingWithGraceAllowed(Boolean autoScalingWithGraceAllowed) {
                this.autoScalingWithGraceAllowed = autoScalingWithGraceAllowed;
                return this;
            }

            /**
             * BootstrapActionList.
             */
            public Builder bootstrapActionList(BootstrapActionList bootstrapActionList) {
                this.bootstrapActionList = bootstrapActionList;
                return this;
            }

            /**
             * BootstrapFailed.
             */
            public Builder bootstrapFailed(Boolean bootstrapFailed) {
                this.bootstrapFailed = bootstrapFailed;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ClickhouseConf.
             */
            public Builder clickhouseConf(String clickhouseConf) {
                this.clickhouseConf = clickhouseConf;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Configurations.
             */
            public Builder configurations(String configurations) {
                this.configurations = configurations;
                return this;
            }

            /**
             * CoreNodeInService.
             */
            public Builder coreNodeInService(Integer coreNodeInService) {
                this.coreNodeInService = coreNodeInService;
                return this;
            }

            /**
             * CoreNodeTotal.
             */
            public Builder coreNodeTotal(Integer coreNodeTotal) {
                this.coreNodeTotal = coreNodeTotal;
                return this;
            }

            /**
             * CreateResource.
             */
            public Builder createResource(String createResource) {
                this.createResource = createResource;
                return this;
            }

            /**
             * CreateType.
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

            /**
             * DataDiskEncrypted.
             */
            public Builder dataDiskEncrypted(Boolean dataDiskEncrypted) {
                this.dataDiskEncrypted = dataDiskEncrypted;
                return this;
            }

            /**
             * DataDiskKMSKeyId.
             */
            public Builder dataDiskKMSKeyId(String dataDiskKMSKeyId) {
                this.dataDiskKMSKeyId = dataDiskKMSKeyId;
                return this;
            }

            /**
             * DepositType.
             */
            public Builder depositType(String depositType) {
                this.depositType = depositType;
                return this;
            }

            /**
             * EasEnable.
             */
            public Builder easEnable(Boolean easEnable) {
                this.easEnable = easEnable;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(FailReason failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * GatewayClusterIds.
             */
            public Builder gatewayClusterIds(String gatewayClusterIds) {
                this.gatewayClusterIds = gatewayClusterIds;
                return this;
            }

            /**
             * GatewayClusterInfoList.
             */
            public Builder gatewayClusterInfoList(GatewayClusterInfoList gatewayClusterInfoList) {
                this.gatewayClusterInfoList = gatewayClusterInfoList;
                return this;
            }

            /**
             * HighAvailabilityEnable.
             */
            public Builder highAvailabilityEnable(Boolean highAvailabilityEnable) {
                this.highAvailabilityEnable = highAvailabilityEnable;
                return this;
            }

            /**
             * HostPoolInfo.
             */
            public Builder hostPoolInfo(HostPoolInfo hostPoolInfo) {
                this.hostPoolInfo = hostPoolInfo;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InstanceGeneration.
             */
            public Builder instanceGeneration(String instanceGeneration) {
                this.instanceGeneration = instanceGeneration;
                return this;
            }

            /**
             * IoOptimized.
             */
            public Builder ioOptimized(Boolean ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * K8sClusterId.
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * LocalMetaDb.
             */
            public Builder localMetaDb(Boolean localMetaDb) {
                this.localMetaDb = localMetaDb;
                return this;
            }

            /**
             * LogEnable.
             */
            public Builder logEnable(Boolean logEnable) {
                this.logEnable = logEnable;
                return this;
            }

            /**
             * LogPath.
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            /**
             * MachineType.
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * MasterNodeInService.
             */
            public Builder masterNodeInService(Integer masterNodeInService) {
                this.masterNodeInService = masterNodeInService;
                return this;
            }

            /**
             * MasterNodeTotal.
             */
            public Builder masterNodeTotal(Integer masterNodeTotal) {
                this.masterNodeTotal = masterNodeTotal;
                return this;
            }

            /**
             * MetaStoreType.
             */
            public Builder metaStoreType(String metaStoreType) {
                this.metaStoreType = metaStoreType;
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
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * OperationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RelateClusterId.
             */
            public Builder relateClusterId(String relateClusterId) {
                this.relateClusterId = relateClusterId;
                return this;
            }

            /**
             * RelateClusterInfo.
             */
            public Builder relateClusterInfo(RelateClusterInfo relateClusterInfo) {
                this.relateClusterInfo = relateClusterInfo;
                return this;
            }

            /**
             * ResizeClusterEnable.
             */
            public Builder resizeClusterEnable(Boolean resizeClusterEnable) {
                this.resizeClusterEnable = resizeClusterEnable;
                return this;
            }

            /**
             * ResizeDiskEnable.
             */
            public Builder resizeDiskEnable(Boolean resizeDiskEnable) {
                this.resizeDiskEnable = resizeDiskEnable;
                return this;
            }

            /**
             * RunningTime.
             */
            public Builder runningTime(Integer runningTime) {
                this.runningTime = runningTime;
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
             * SecurityGroupName.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            /**
             * ShowSoftwareInterface.
             */
            public Builder showSoftwareInterface(Boolean showSoftwareInterface) {
                this.showSoftwareInterface = showSoftwareInterface;
                return this;
            }

            /**
             * SoftwareInfo.
             */
            public Builder softwareInfo(SoftwareInfo softwareInfo) {
                this.softwareInfo = softwareInfo;
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
             * StopTime.
             */
            public Builder stopTime(Long stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * TaskNodeInService.
             */
            public Builder taskNodeInService(Integer taskNodeInService) {
                this.taskNodeInService = taskNodeInService;
                return this;
            }

            /**
             * TaskNodeTotal.
             */
            public Builder taskNodeTotal(Integer taskNodeTotal) {
                this.taskNodeTotal = taskNodeTotal;
                return this;
            }

            /**
             * UserDefinedEmrEcsRole.
             */
            public Builder userDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
                this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
}
