// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryClusterDetailResponseBody</p>
 */
public class QueryClusterDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private QueryClusterDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryClusterDetailResponseBody build() {
            return new QueryClusterDetailResponseBody(this);
        } 

    } 

    public static class BasicInfo extends TeaModel {
        @NameInMap("BusinessCode")
        private String businessCode;

        @NameInMap("ClusterId")
        private Long clusterId;

        @NameInMap("ClusterInstanceId")
        private String clusterInstanceId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("EcsIds")
        private java.util.List < String > ecsIds;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("HasInstallArmsPilot")
        private Boolean hasInstallArmsPilot;

        @NameInMap("HasInstallLogController")
        private Boolean hasInstallLogController;

        @NameInMap("InstallArmsInProcess")
        private Boolean installArmsInProcess;

        @NameInMap("InstallLogInProcess")
        private Boolean installLogInProcess;

        @NameInMap("MainUserId")
        private String mainUserId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("UserNick")
        private String userNick;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("Vswitchs")
        private java.util.List < String > vswitchs;

        private BasicInfo(Builder builder) {
            this.businessCode = builder.businessCode;
            this.clusterId = builder.clusterId;
            this.clusterInstanceId = builder.clusterInstanceId;
            this.clusterName = builder.clusterName;
            this.ecsIds = builder.ecsIds;
            this.envType = builder.envType;
            this.hasInstallArmsPilot = builder.hasInstallArmsPilot;
            this.hasInstallLogController = builder.hasInstallLogController;
            this.installArmsInProcess = builder.installArmsInProcess;
            this.installLogInProcess = builder.installLogInProcess;
            this.mainUserId = builder.mainUserId;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.userNick = builder.userNick;
            this.vpcId = builder.vpcId;
            this.vswitchs = builder.vswitchs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicInfo create() {
            return builder().build();
        }

        /**
         * @return businessCode
         */
        public String getBusinessCode() {
            return this.businessCode;
        }

        /**
         * @return clusterId
         */
        public Long getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterInstanceId
         */
        public String getClusterInstanceId() {
            return this.clusterInstanceId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return ecsIds
         */
        public java.util.List < String > getEcsIds() {
            return this.ecsIds;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return hasInstallArmsPilot
         */
        public Boolean getHasInstallArmsPilot() {
            return this.hasInstallArmsPilot;
        }

        /**
         * @return hasInstallLogController
         */
        public Boolean getHasInstallLogController() {
            return this.hasInstallLogController;
        }

        /**
         * @return installArmsInProcess
         */
        public Boolean getInstallArmsInProcess() {
            return this.installArmsInProcess;
        }

        /**
         * @return installLogInProcess
         */
        public Boolean getInstallLogInProcess() {
            return this.installLogInProcess;
        }

        /**
         * @return mainUserId
         */
        public String getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchs
         */
        public java.util.List < String > getVswitchs() {
            return this.vswitchs;
        }

        public static final class Builder {
            private String businessCode; 
            private Long clusterId; 
            private String clusterInstanceId; 
            private String clusterName; 
            private java.util.List < String > ecsIds; 
            private String envType; 
            private Boolean hasInstallArmsPilot; 
            private Boolean hasInstallLogController; 
            private Boolean installArmsInProcess; 
            private Boolean installLogInProcess; 
            private String mainUserId; 
            private String regionId; 
            private String regionName; 
            private String userNick; 
            private String vpcId; 
            private java.util.List < String > vswitchs; 

            /**
             * BusinessCode.
             */
            public Builder businessCode(String businessCode) {
                this.businessCode = businessCode;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(Long clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterInstanceId.
             */
            public Builder clusterInstanceId(String clusterInstanceId) {
                this.clusterInstanceId = clusterInstanceId;
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
             * EcsIds.
             */
            public Builder ecsIds(java.util.List < String > ecsIds) {
                this.ecsIds = ecsIds;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * HasInstallArmsPilot.
             */
            public Builder hasInstallArmsPilot(Boolean hasInstallArmsPilot) {
                this.hasInstallArmsPilot = hasInstallArmsPilot;
                return this;
            }

            /**
             * HasInstallLogController.
             */
            public Builder hasInstallLogController(Boolean hasInstallLogController) {
                this.hasInstallLogController = hasInstallLogController;
                return this;
            }

            /**
             * InstallArmsInProcess.
             */
            public Builder installArmsInProcess(Boolean installArmsInProcess) {
                this.installArmsInProcess = installArmsInProcess;
                return this;
            }

            /**
             * InstallLogInProcess.
             */
            public Builder installLogInProcess(Boolean installLogInProcess) {
                this.installLogInProcess = installLogInProcess;
                return this;
            }

            /**
             * MainUserId.
             */
            public Builder mainUserId(String mainUserId) {
                this.mainUserId = mainUserId;
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
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
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
             * Vswitchs.
             */
            public Builder vswitchs(java.util.List < String > vswitchs) {
                this.vswitchs = vswitchs;
                return this;
            }

            public BasicInfo build() {
                return new BasicInfo(this);
            } 

        } 

    }
    public static class InstanceInfo extends TeaModel {
        @NameInMap("AllocatePodCount")
        private Integer allocatePodCount;

        @NameInMap("AllocatedPodInfoList")
        private java.util.List < String > allocatedPodInfoList;

        @NameInMap("AppCount")
        private Integer appCount;

        @NameInMap("AvailablePodInfoList")
        private java.util.List < String > availablePodInfoList;

        private InstanceInfo(Builder builder) {
            this.allocatePodCount = builder.allocatePodCount;
            this.allocatedPodInfoList = builder.allocatedPodInfoList;
            this.appCount = builder.appCount;
            this.availablePodInfoList = builder.availablePodInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return allocatePodCount
         */
        public Integer getAllocatePodCount() {
            return this.allocatePodCount;
        }

        /**
         * @return allocatedPodInfoList
         */
        public java.util.List < String > getAllocatedPodInfoList() {
            return this.allocatedPodInfoList;
        }

        /**
         * @return appCount
         */
        public Integer getAppCount() {
            return this.appCount;
        }

        /**
         * @return availablePodInfoList
         */
        public java.util.List < String > getAvailablePodInfoList() {
            return this.availablePodInfoList;
        }

        public static final class Builder {
            private Integer allocatePodCount; 
            private java.util.List < String > allocatedPodInfoList; 
            private Integer appCount; 
            private java.util.List < String > availablePodInfoList; 

            /**
             * AllocatePodCount.
             */
            public Builder allocatePodCount(Integer allocatePodCount) {
                this.allocatePodCount = allocatePodCount;
                return this;
            }

            /**
             * AllocatedPodInfoList.
             */
            public Builder allocatedPodInfoList(java.util.List < String > allocatedPodInfoList) {
                this.allocatedPodInfoList = allocatedPodInfoList;
                return this;
            }

            /**
             * AppCount.
             */
            public Builder appCount(Integer appCount) {
                this.appCount = appCount;
                return this;
            }

            /**
             * AvailablePodInfoList.
             */
            public Builder availablePodInfoList(java.util.List < String > availablePodInfoList) {
                this.availablePodInfoList = availablePodInfoList;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
    public static class NetInfo extends TeaModel {
        @NameInMap("NetPlugType")
        private String netPlugType;

        @NameInMap("ProdCIDR")
        private String prodCIDR;

        @NameInMap("ServiceCIDR")
        private String serviceCIDR;

        private NetInfo(Builder builder) {
            this.netPlugType = builder.netPlugType;
            this.prodCIDR = builder.prodCIDR;
            this.serviceCIDR = builder.serviceCIDR;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfo create() {
            return builder().build();
        }

        /**
         * @return netPlugType
         */
        public String getNetPlugType() {
            return this.netPlugType;
        }

        /**
         * @return prodCIDR
         */
        public String getProdCIDR() {
            return this.prodCIDR;
        }

        /**
         * @return serviceCIDR
         */
        public String getServiceCIDR() {
            return this.serviceCIDR;
        }

        public static final class Builder {
            private String netPlugType; 
            private String prodCIDR; 
            private String serviceCIDR; 

            /**
             * NetPlugType.
             */
            public Builder netPlugType(String netPlugType) {
                this.netPlugType = netPlugType;
                return this;
            }

            /**
             * ProdCIDR.
             */
            public Builder prodCIDR(String prodCIDR) {
                this.prodCIDR = prodCIDR;
                return this;
            }

            /**
             * ServiceCIDR.
             */
            public Builder serviceCIDR(String serviceCIDR) {
                this.serviceCIDR = serviceCIDR;
                return this;
            }

            public NetInfo build() {
                return new NetInfo(this);
            } 

        } 

    }
    public static class WorkLoad extends TeaModel {
        @NameInMap("AllNodeCount")
        private Integer allNodeCount;

        @NameInMap("AllocateAllPodCount")
        private Integer allocateAllPodCount;

        @NameInMap("AllocateAppPodCount")
        private Integer allocateAppPodCount;

        @NameInMap("CpuCapacityTotal")
        private String cpuCapacityTotal;

        @NameInMap("CpuLevel")
        private String cpuLevel;

        @NameInMap("CpuRequest")
        private String cpuRequest;

        @NameInMap("CpuRequestPercent")
        private String cpuRequestPercent;

        @NameInMap("CpuTotal")
        private String cpuTotal;

        @NameInMap("CpuUse")
        private String cpuUse;

        @NameInMap("CpuUsePercent")
        private String cpuUsePercent;

        @NameInMap("MemCapacityTotal")
        private String memCapacityTotal;

        @NameInMap("MemLevel")
        private String memLevel;

        @NameInMap("MemRequest")
        private String memRequest;

        @NameInMap("MemRequestPercent")
        private String memRequestPercent;

        @NameInMap("MemTotal")
        private String memTotal;

        @NameInMap("MemUse")
        private String memUse;

        @NameInMap("MemUsePercent")
        private String memUsePercent;

        private WorkLoad(Builder builder) {
            this.allNodeCount = builder.allNodeCount;
            this.allocateAllPodCount = builder.allocateAllPodCount;
            this.allocateAppPodCount = builder.allocateAppPodCount;
            this.cpuCapacityTotal = builder.cpuCapacityTotal;
            this.cpuLevel = builder.cpuLevel;
            this.cpuRequest = builder.cpuRequest;
            this.cpuRequestPercent = builder.cpuRequestPercent;
            this.cpuTotal = builder.cpuTotal;
            this.cpuUse = builder.cpuUse;
            this.cpuUsePercent = builder.cpuUsePercent;
            this.memCapacityTotal = builder.memCapacityTotal;
            this.memLevel = builder.memLevel;
            this.memRequest = builder.memRequest;
            this.memRequestPercent = builder.memRequestPercent;
            this.memTotal = builder.memTotal;
            this.memUse = builder.memUse;
            this.memUsePercent = builder.memUsePercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkLoad create() {
            return builder().build();
        }

        /**
         * @return allNodeCount
         */
        public Integer getAllNodeCount() {
            return this.allNodeCount;
        }

        /**
         * @return allocateAllPodCount
         */
        public Integer getAllocateAllPodCount() {
            return this.allocateAllPodCount;
        }

        /**
         * @return allocateAppPodCount
         */
        public Integer getAllocateAppPodCount() {
            return this.allocateAppPodCount;
        }

        /**
         * @return cpuCapacityTotal
         */
        public String getCpuCapacityTotal() {
            return this.cpuCapacityTotal;
        }

        /**
         * @return cpuLevel
         */
        public String getCpuLevel() {
            return this.cpuLevel;
        }

        /**
         * @return cpuRequest
         */
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        /**
         * @return cpuRequestPercent
         */
        public String getCpuRequestPercent() {
            return this.cpuRequestPercent;
        }

        /**
         * @return cpuTotal
         */
        public String getCpuTotal() {
            return this.cpuTotal;
        }

        /**
         * @return cpuUse
         */
        public String getCpuUse() {
            return this.cpuUse;
        }

        /**
         * @return cpuUsePercent
         */
        public String getCpuUsePercent() {
            return this.cpuUsePercent;
        }

        /**
         * @return memCapacityTotal
         */
        public String getMemCapacityTotal() {
            return this.memCapacityTotal;
        }

        /**
         * @return memLevel
         */
        public String getMemLevel() {
            return this.memLevel;
        }

        /**
         * @return memRequest
         */
        public String getMemRequest() {
            return this.memRequest;
        }

        /**
         * @return memRequestPercent
         */
        public String getMemRequestPercent() {
            return this.memRequestPercent;
        }

        /**
         * @return memTotal
         */
        public String getMemTotal() {
            return this.memTotal;
        }

        /**
         * @return memUse
         */
        public String getMemUse() {
            return this.memUse;
        }

        /**
         * @return memUsePercent
         */
        public String getMemUsePercent() {
            return this.memUsePercent;
        }

        public static final class Builder {
            private Integer allNodeCount; 
            private Integer allocateAllPodCount; 
            private Integer allocateAppPodCount; 
            private String cpuCapacityTotal; 
            private String cpuLevel; 
            private String cpuRequest; 
            private String cpuRequestPercent; 
            private String cpuTotal; 
            private String cpuUse; 
            private String cpuUsePercent; 
            private String memCapacityTotal; 
            private String memLevel; 
            private String memRequest; 
            private String memRequestPercent; 
            private String memTotal; 
            private String memUse; 
            private String memUsePercent; 

            /**
             * AllNodeCount.
             */
            public Builder allNodeCount(Integer allNodeCount) {
                this.allNodeCount = allNodeCount;
                return this;
            }

            /**
             * AllocateAllPodCount.
             */
            public Builder allocateAllPodCount(Integer allocateAllPodCount) {
                this.allocateAllPodCount = allocateAllPodCount;
                return this;
            }

            /**
             * AllocateAppPodCount.
             */
            public Builder allocateAppPodCount(Integer allocateAppPodCount) {
                this.allocateAppPodCount = allocateAppPodCount;
                return this;
            }

            /**
             * CpuCapacityTotal.
             */
            public Builder cpuCapacityTotal(String cpuCapacityTotal) {
                this.cpuCapacityTotal = cpuCapacityTotal;
                return this;
            }

            /**
             * CpuLevel.
             */
            public Builder cpuLevel(String cpuLevel) {
                this.cpuLevel = cpuLevel;
                return this;
            }

            /**
             * CpuRequest.
             */
            public Builder cpuRequest(String cpuRequest) {
                this.cpuRequest = cpuRequest;
                return this;
            }

            /**
             * CpuRequestPercent.
             */
            public Builder cpuRequestPercent(String cpuRequestPercent) {
                this.cpuRequestPercent = cpuRequestPercent;
                return this;
            }

            /**
             * CpuTotal.
             */
            public Builder cpuTotal(String cpuTotal) {
                this.cpuTotal = cpuTotal;
                return this;
            }

            /**
             * CpuUse.
             */
            public Builder cpuUse(String cpuUse) {
                this.cpuUse = cpuUse;
                return this;
            }

            /**
             * CpuUsePercent.
             */
            public Builder cpuUsePercent(String cpuUsePercent) {
                this.cpuUsePercent = cpuUsePercent;
                return this;
            }

            /**
             * MemCapacityTotal.
             */
            public Builder memCapacityTotal(String memCapacityTotal) {
                this.memCapacityTotal = memCapacityTotal;
                return this;
            }

            /**
             * MemLevel.
             */
            public Builder memLevel(String memLevel) {
                this.memLevel = memLevel;
                return this;
            }

            /**
             * MemRequest.
             */
            public Builder memRequest(String memRequest) {
                this.memRequest = memRequest;
                return this;
            }

            /**
             * MemRequestPercent.
             */
            public Builder memRequestPercent(String memRequestPercent) {
                this.memRequestPercent = memRequestPercent;
                return this;
            }

            /**
             * MemTotal.
             */
            public Builder memTotal(String memTotal) {
                this.memTotal = memTotal;
                return this;
            }

            /**
             * MemUse.
             */
            public Builder memUse(String memUse) {
                this.memUse = memUse;
                return this;
            }

            /**
             * MemUsePercent.
             */
            public Builder memUsePercent(String memUsePercent) {
                this.memUsePercent = memUsePercent;
                return this;
            }

            public WorkLoad build() {
                return new WorkLoad(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("BasicInfo")
        private BasicInfo basicInfo;

        @NameInMap("InstanceInfo")
        private InstanceInfo instanceInfo;

        @NameInMap("NetInfo")
        private NetInfo netInfo;

        @NameInMap("NodeWorkLoadList")
        private java.util.List < String > nodeWorkLoadList;

        @NameInMap("WorkLoad")
        private WorkLoad workLoad;

        private Result(Builder builder) {
            this.basicInfo = builder.basicInfo;
            this.instanceInfo = builder.instanceInfo;
            this.netInfo = builder.netInfo;
            this.nodeWorkLoadList = builder.nodeWorkLoadList;
            this.workLoad = builder.workLoad;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return basicInfo
         */
        public BasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        /**
         * @return instanceInfo
         */
        public InstanceInfo getInstanceInfo() {
            return this.instanceInfo;
        }

        /**
         * @return netInfo
         */
        public NetInfo getNetInfo() {
            return this.netInfo;
        }

        /**
         * @return nodeWorkLoadList
         */
        public java.util.List < String > getNodeWorkLoadList() {
            return this.nodeWorkLoadList;
        }

        /**
         * @return workLoad
         */
        public WorkLoad getWorkLoad() {
            return this.workLoad;
        }

        public static final class Builder {
            private BasicInfo basicInfo; 
            private InstanceInfo instanceInfo; 
            private NetInfo netInfo; 
            private java.util.List < String > nodeWorkLoadList; 
            private WorkLoad workLoad; 

            /**
             * BasicInfo.
             */
            public Builder basicInfo(BasicInfo basicInfo) {
                this.basicInfo = basicInfo;
                return this;
            }

            /**
             * InstanceInfo.
             */
            public Builder instanceInfo(InstanceInfo instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            /**
             * NetInfo.
             */
            public Builder netInfo(NetInfo netInfo) {
                this.netInfo = netInfo;
                return this;
            }

            /**
             * NodeWorkLoadList.
             */
            public Builder nodeWorkLoadList(java.util.List < String > nodeWorkLoadList) {
                this.nodeWorkLoadList = nodeWorkLoadList;
                return this;
            }

            /**
             * WorkLoad.
             */
            public Builder workLoad(WorkLoad workLoad) {
                this.workLoad = workLoad;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
