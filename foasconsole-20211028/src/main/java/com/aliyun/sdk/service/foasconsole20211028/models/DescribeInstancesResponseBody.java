// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private Integer totalPage; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class TotalStageWithWeight extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StepIndex")
        private Integer stepIndex;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private TotalStageWithWeight(Builder builder) {
            this.stepIndex = builder.stepIndex;
            this.stepName = builder.stepName;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalStageWithWeight create() {
            return builder().build();
        }

        /**
         * @return stepIndex
         */
        public Integer getStepIndex() {
            return this.stepIndex;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer stepIndex; 
            private String stepName; 
            private Integer weight; 

            /**
             * StepIndex.
             */
            public Builder stepIndex(Integer stepIndex) {
                this.stepIndex = stepIndex;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public TotalStageWithWeight build() {
                return new TotalStageWithWeight(this);
            } 

        } 

    }
    public static class ClusterStage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CurrentStage")
        private Integer currentStage;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalStageWithWeight")
        private java.util.List < TotalStageWithWeight> totalStageWithWeight;

        private ClusterStage(Builder builder) {
            this.clusterId = builder.clusterId;
            this.currentStage = builder.currentStage;
            this.message = builder.message;
            this.status = builder.status;
            this.totalStageWithWeight = builder.totalStageWithWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStage create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return currentStage
         */
        public Integer getCurrentStage() {
            return this.currentStage;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalStageWithWeight
         */
        public java.util.List < TotalStageWithWeight> getTotalStageWithWeight() {
            return this.totalStageWithWeight;
        }

        public static final class Builder {
            private String clusterId; 
            private Integer currentStage; 
            private String message; 
            private String status; 
            private java.util.List < TotalStageWithWeight> totalStageWithWeight; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CurrentStage.
             */
            public Builder currentStage(Integer currentStage) {
                this.currentStage = currentStage;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * TotalStageWithWeight.
             */
            public Builder totalStageWithWeight(java.util.List < TotalStageWithWeight> totalStageWithWeight) {
                this.totalStageWithWeight = totalStageWithWeight;
                return this;
            }

            public ClusterStage build() {
                return new ClusterStage(this);
            } 

        } 

    }
    public static class UserSlbListeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenersStatus")
        private String listenersStatus;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private UserSlbListeners(Builder builder) {
            this.listenersStatus = builder.listenersStatus;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSlbListeners create() {
            return builder().build();
        }

        /**
         * @return listenersStatus
         */
        public String getListenersStatus() {
            return this.listenersStatus;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String listenersStatus; 
            private String port; 

            /**
             * ListenersStatus.
             */
            public Builder listenersStatus(String listenersStatus) {
                this.listenersStatus = listenersStatus;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public UserSlbListeners build() {
                return new UserSlbListeners(this);
            } 

        } 

    }
    public static class UserSlbDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExistSlb")
        private Boolean existSlb;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbIp")
        private String slbIp;

        @com.aliyun.core.annotation.NameInMap("SlbStatus")
        private String slbStatus;

        @com.aliyun.core.annotation.NameInMap("UserSlbListeners")
        private java.util.List < UserSlbListeners> userSlbListeners;

        private UserSlbDto(Builder builder) {
            this.existSlb = builder.existSlb;
            this.slbId = builder.slbId;
            this.slbIp = builder.slbIp;
            this.slbStatus = builder.slbStatus;
            this.userSlbListeners = builder.userSlbListeners;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSlbDto create() {
            return builder().build();
        }

        /**
         * @return existSlb
         */
        public Boolean getExistSlb() {
            return this.existSlb;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbIp
         */
        public String getSlbIp() {
            return this.slbIp;
        }

        /**
         * @return slbStatus
         */
        public String getSlbStatus() {
            return this.slbStatus;
        }

        /**
         * @return userSlbListeners
         */
        public java.util.List < UserSlbListeners> getUserSlbListeners() {
            return this.userSlbListeners;
        }

        public static final class Builder {
            private Boolean existSlb; 
            private String slbId; 
            private String slbIp; 
            private String slbStatus; 
            private java.util.List < UserSlbListeners> userSlbListeners; 

            /**
             * ExistSlb.
             */
            public Builder existSlb(Boolean existSlb) {
                this.existSlb = existSlb;
                return this;
            }

            /**
             * SlbId.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * SlbIp.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * SlbStatus.
             */
            public Builder slbStatus(String slbStatus) {
                this.slbStatus = slbStatus;
                return this;
            }

            /**
             * UserSlbListeners.
             */
            public Builder userSlbListeners(java.util.List < UserSlbListeners> userSlbListeners) {
                this.userSlbListeners = userSlbListeners;
                return this;
            }

            public UserSlbDto build() {
                return new UserSlbDto(this);
            } 

        } 

    }
    public static class ClusterState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterStage")
        private ClusterStage clusterStage;

        @com.aliyun.core.annotation.NameInMap("CreateTimeout")
        private Boolean createTimeout;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubStatus")
        private String subStatus;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("UserSlbDto")
        private UserSlbDto userSlbDto;

        @com.aliyun.core.annotation.NameInMap("VpcCidr")
        private String vpcCidr;

        private ClusterState(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterStage = builder.clusterStage;
            this.createTimeout = builder.createTimeout;
            this.status = builder.status;
            this.subStatus = builder.subStatus;
            this.url = builder.url;
            this.userSlbDto = builder.userSlbDto;
            this.vpcCidr = builder.vpcCidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterState create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterStage
         */
        public ClusterStage getClusterStage() {
            return this.clusterStage;
        }

        /**
         * @return createTimeout
         */
        public Boolean getCreateTimeout() {
            return this.createTimeout;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subStatus
         */
        public String getSubStatus() {
            return this.subStatus;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return userSlbDto
         */
        public UserSlbDto getUserSlbDto() {
            return this.userSlbDto;
        }

        /**
         * @return vpcCidr
         */
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        public static final class Builder {
            private String clusterId; 
            private ClusterStage clusterStage; 
            private Boolean createTimeout; 
            private String status; 
            private String subStatus; 
            private String url; 
            private UserSlbDto userSlbDto; 
            private String vpcCidr; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterStage.
             */
            public Builder clusterStage(ClusterStage clusterStage) {
                this.clusterStage = clusterStage;
                return this;
            }

            /**
             * CreateTimeout.
             */
            public Builder createTimeout(Boolean createTimeout) {
                this.createTimeout = createTimeout;
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
             * SubStatus.
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * UserSlbDto.
             */
            public Builder userSlbDto(UserSlbDto userSlbDto) {
                this.userSlbDto = userSlbDto;
                return this;
            }

            /**
             * VpcCidr.
             */
            public Builder vpcCidr(String vpcCidr) {
                this.vpcCidr = vpcCidr;
                return this;
            }

            public ClusterState build() {
                return new ClusterState(this);
            } 

        } 

    }
    public static class ClusterUsedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Ha")
        private Boolean ha;

        @com.aliyun.core.annotation.NameInMap("HaUsedCpu")
        private Float haUsedCpu;

        @com.aliyun.core.annotation.NameInMap("HaUsedMemory")
        private Float haUsedMemory;

        @com.aliyun.core.annotation.NameInMap("HaUsedResource")
        private Float haUsedResource;

        @com.aliyun.core.annotation.NameInMap("UsedCpu")
        private Float usedCpu;

        @com.aliyun.core.annotation.NameInMap("UsedMemory")
        private Float usedMemory;

        @com.aliyun.core.annotation.NameInMap("UsedResource")
        private Float usedResource;

        private ClusterUsedResources(Builder builder) {
            this.clusterId = builder.clusterId;
            this.ha = builder.ha;
            this.haUsedCpu = builder.haUsedCpu;
            this.haUsedMemory = builder.haUsedMemory;
            this.haUsedResource = builder.haUsedResource;
            this.usedCpu = builder.usedCpu;
            this.usedMemory = builder.usedMemory;
            this.usedResource = builder.usedResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterUsedResources create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return ha
         */
        public Boolean getHa() {
            return this.ha;
        }

        /**
         * @return haUsedCpu
         */
        public Float getHaUsedCpu() {
            return this.haUsedCpu;
        }

        /**
         * @return haUsedMemory
         */
        public Float getHaUsedMemory() {
            return this.haUsedMemory;
        }

        /**
         * @return haUsedResource
         */
        public Float getHaUsedResource() {
            return this.haUsedResource;
        }

        /**
         * @return usedCpu
         */
        public Float getUsedCpu() {
            return this.usedCpu;
        }

        /**
         * @return usedMemory
         */
        public Float getUsedMemory() {
            return this.usedMemory;
        }

        /**
         * @return usedResource
         */
        public Float getUsedResource() {
            return this.usedResource;
        }

        public static final class Builder {
            private String clusterId; 
            private Boolean ha; 
            private Float haUsedCpu; 
            private Float haUsedMemory; 
            private Float haUsedResource; 
            private Float usedCpu; 
            private Float usedMemory; 
            private Float usedResource; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Ha.
             */
            public Builder ha(Boolean ha) {
                this.ha = ha;
                return this;
            }

            /**
             * HaUsedCpu.
             */
            public Builder haUsedCpu(Float haUsedCpu) {
                this.haUsedCpu = haUsedCpu;
                return this;
            }

            /**
             * HaUsedMemory.
             */
            public Builder haUsedMemory(Float haUsedMemory) {
                this.haUsedMemory = haUsedMemory;
                return this;
            }

            /**
             * HaUsedResource.
             */
            public Builder haUsedResource(Float haUsedResource) {
                this.haUsedResource = haUsedResource;
                return this;
            }

            /**
             * UsedCpu.
             */
            public Builder usedCpu(Float usedCpu) {
                this.usedCpu = usedCpu;
                return this;
            }

            /**
             * UsedMemory.
             */
            public Builder usedMemory(Float usedMemory) {
                this.usedMemory = usedMemory;
                return this;
            }

            /**
             * UsedResource.
             */
            public Builder usedResource(Float usedResource) {
                this.usedResource = usedResource;
                return this;
            }

            public ClusterUsedResources build() {
                return new ClusterUsedResources(this);
            } 

        } 

    }
    public static class ClusterUsedStorage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("UsedStorage")
        private Float usedStorage;

        private ClusterUsedStorage(Builder builder) {
            this.clusterId = builder.clusterId;
            this.usedStorage = builder.usedStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterUsedStorage create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return usedStorage
         */
        public Float getUsedStorage() {
            return this.usedStorage;
        }

        public static final class Builder {
            private String clusterId; 
            private Float usedStorage; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * UsedStorage.
             */
            public Builder usedStorage(Float usedStorage) {
                this.usedStorage = usedStorage;
                return this;
            }

            public ClusterUsedStorage build() {
                return new ClusterUsedStorage(this);
            } 

        } 

    }
    public static class HaResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        private HaResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public HaResourceSpec build() {
                return new HaResourceSpec(this);
            } 

        } 

    }
    public static class HaVSwitchInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableIpAddressCount")
        private Long availableIpAddressCount;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VSwitchCidr")
        private String vSwitchCidr;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private HaVSwitchInfo(Builder builder) {
            this.availableIpAddressCount = builder.availableIpAddressCount;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.vSwitchCidr = builder.vSwitchCidr;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaVSwitchInfo create() {
            return builder().build();
        }

        /**
         * @return availableIpAddressCount
         */
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vSwitchCidr
         */
        public String getVSwitchCidr() {
            return this.vSwitchCidr;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
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
            private Long availableIpAddressCount; 
            private String description; 
            private String regionId; 
            private String vSwitchCidr; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AvailableIpAddressCount.
             */
            public Builder availableIpAddressCount(Long availableIpAddressCount) {
                this.availableIpAddressCount = availableIpAddressCount;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * VSwitchCidr.
             */
            public Builder vSwitchCidr(String vSwitchCidr) {
                this.vSwitchCidr = vSwitchCidr;
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
             * VSwitchName.
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
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

            public HaVSwitchInfo build() {
                return new HaVSwitchInfo(this);
            } 

        } 

    }
    public static class HostAliases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostNames")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > hostNames;

        @com.aliyun.core.annotation.NameInMap("Ip")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ip;

        private HostAliases(Builder builder) {
            this.hostNames = builder.hostNames;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAliases create() {
            return builder().build();
        }

        /**
         * @return hostNames
         */
        public java.util.List < String > getHostNames() {
            return this.hostNames;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > hostNames; 
            private String ip; 

            /**
             * HostNames.
             */
            public Builder hostNames(java.util.List < String > hostNames) {
                this.hostNames = hostNames;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public HostAliases build() {
                return new HostAliases(this);
            } 

        } 

    }
    public static class OssInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("BucketVersioningStatus")
        private String bucketVersioningStatus;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        private OssInfo(Builder builder) {
            this.accessId = builder.accessId;
            this.accessKey = builder.accessKey;
            this.bucket = builder.bucket;
            this.bucketVersioningStatus = builder.bucketVersioningStatus;
            this.endpoint = builder.endpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssInfo create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return bucketVersioningStatus
         */
        public String getBucketVersioningStatus() {
            return this.bucketVersioningStatus;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        public static final class Builder {
            private String accessId; 
            private String accessKey; 
            private String bucket; 
            private String bucketVersioningStatus; 
            private String endpoint; 

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * BucketVersioningStatus.
             */
            public Builder bucketVersioningStatus(String bucketVersioningStatus) {
                this.bucketVersioningStatus = bucketVersioningStatus;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            public OssInfo build() {
                return new OssInfo(this);
            } 

        } 

    }
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        private ResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    public static class Oss extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        private Oss(Builder builder) {
            this.bucket = builder.bucket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oss create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        public static final class Builder {
            private String bucket; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            public Oss build() {
                return new Oss(this);
            } 

        } 

    }
    public static class Storage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullyManaged")
        private Boolean fullyManaged;

        @com.aliyun.core.annotation.NameInMap("OrderState")
        private String orderState;

        @com.aliyun.core.annotation.NameInMap("Oss")
        private Oss oss;

        private Storage(Builder builder) {
            this.fullyManaged = builder.fullyManaged;
            this.orderState = builder.orderState;
            this.oss = builder.oss;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return fullyManaged
         */
        public Boolean getFullyManaged() {
            return this.fullyManaged;
        }

        /**
         * @return orderState
         */
        public String getOrderState() {
            return this.orderState;
        }

        /**
         * @return oss
         */
        public Oss getOss() {
            return this.oss;
        }

        public static final class Builder {
            private Boolean fullyManaged; 
            private String orderState; 
            private Oss oss; 

            /**
             * FullyManaged.
             */
            public Builder fullyManaged(Boolean fullyManaged) {
                this.fullyManaged = fullyManaged;
                return this;
            }

            /**
             * OrderState.
             */
            public Builder orderState(String orderState) {
                this.orderState = orderState;
                return this;
            }

            /**
             * Oss.
             */
            public Builder oss(Oss oss) {
                this.oss = oss;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class VSwitchInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableIpAddressCount")
        private String availableIpAddressCount;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VSwitchCidr")
        private String vSwitchCidr;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VSwitchInfo(Builder builder) {
            this.availableIpAddressCount = builder.availableIpAddressCount;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.vSwitchCidr = builder.vSwitchCidr;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchInfo create() {
            return builder().build();
        }

        /**
         * @return availableIpAddressCount
         */
        public String getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vSwitchCidr
         */
        public String getVSwitchCidr() {
            return this.vSwitchCidr;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
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
            private String availableIpAddressCount; 
            private String description; 
            private String regionId; 
            private String vSwitchCidr; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AvailableIpAddressCount.
             */
            public Builder availableIpAddressCount(String availableIpAddressCount) {
                this.availableIpAddressCount = availableIpAddressCount;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * VSwitchCidr.
             */
            public Builder vSwitchCidr(String vSwitchCidr) {
                this.vSwitchCidr = vSwitchCidr;
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
             * VSwitchName.
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
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

            public VSwitchInfo build() {
                return new VSwitchInfo(this);
            } 

        } 

    }
    public static class VpcInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private VpcInfo(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfo create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String description; 
            private String regionId; 
            private String status; 
            private String vpcId; 
            private String vpcName; 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public VpcInfo build() {
                return new VpcInfo(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchitectureType")
        private String architectureType;

        @com.aliyun.core.annotation.NameInMap("AskClusterId")
        private String askClusterId;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ClusterState")
        private ClusterState clusterState;

        @com.aliyun.core.annotation.NameInMap("ClusterStatus")
        private String clusterStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterUsedResources")
        private java.util.List < ClusterUsedResources> clusterUsedResources;

        @com.aliyun.core.annotation.NameInMap("ClusterUsedStorage")
        private ClusterUsedStorage clusterUsedStorage;

        @com.aliyun.core.annotation.NameInMap("Ha")
        private Boolean ha;

        @com.aliyun.core.annotation.NameInMap("HaResourceSpec")
        private HaResourceSpec haResourceSpec;

        @com.aliyun.core.annotation.NameInMap("HaVSwitchIds")
        private java.util.List < String > haVSwitchIds;

        @com.aliyun.core.annotation.NameInMap("HaVSwitchInfo")
        private java.util.List < HaVSwitchInfo> haVSwitchInfo;

        @com.aliyun.core.annotation.NameInMap("HaZoneId")
        private String haZoneId;

        @com.aliyun.core.annotation.NameInMap("HostAliases")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < HostAliases> hostAliases;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MonitorType")
        private String monitorType;

        @com.aliyun.core.annotation.NameInMap("OrderState")
        private String orderState;

        @com.aliyun.core.annotation.NameInMap("OssInfo")
        private OssInfo ossInfo;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceCreateTime")
        private Long resourceCreateTime;

        @com.aliyun.core.annotation.NameInMap("ResourceExpiredTime")
        private Long resourceExpiredTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceSpec")
        private ResourceSpec resourceSpec;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private Storage storage;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VSwitchInfo")
        private java.util.List < VSwitchInfo> vSwitchInfo;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcInfo")
        private VpcInfo vpcInfo;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Instances(Builder builder) {
            this.architectureType = builder.architectureType;
            this.askClusterId = builder.askClusterId;
            this.chargeType = builder.chargeType;
            this.clusterState = builder.clusterState;
            this.clusterStatus = builder.clusterStatus;
            this.clusterUsedResources = builder.clusterUsedResources;
            this.clusterUsedStorage = builder.clusterUsedStorage;
            this.ha = builder.ha;
            this.haResourceSpec = builder.haResourceSpec;
            this.haVSwitchIds = builder.haVSwitchIds;
            this.haVSwitchInfo = builder.haVSwitchInfo;
            this.haZoneId = builder.haZoneId;
            this.hostAliases = builder.hostAliases;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.monitorType = builder.monitorType;
            this.orderState = builder.orderState;
            this.ossInfo = builder.ossInfo;
            this.region = builder.region;
            this.resourceCreateTime = builder.resourceCreateTime;
            this.resourceExpiredTime = builder.resourceExpiredTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
            this.resourceSpec = builder.resourceSpec;
            this.storage = builder.storage;
            this.tags = builder.tags;
            this.uid = builder.uid;
            this.vSwitchIds = builder.vSwitchIds;
            this.vSwitchInfo = builder.vSwitchInfo;
            this.vpcId = builder.vpcId;
            this.vpcInfo = builder.vpcInfo;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return architectureType
         */
        public String getArchitectureType() {
            return this.architectureType;
        }

        /**
         * @return askClusterId
         */
        public String getAskClusterId() {
            return this.askClusterId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterState
         */
        public ClusterState getClusterState() {
            return this.clusterState;
        }

        /**
         * @return clusterStatus
         */
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        /**
         * @return clusterUsedResources
         */
        public java.util.List < ClusterUsedResources> getClusterUsedResources() {
            return this.clusterUsedResources;
        }

        /**
         * @return clusterUsedStorage
         */
        public ClusterUsedStorage getClusterUsedStorage() {
            return this.clusterUsedStorage;
        }

        /**
         * @return ha
         */
        public Boolean getHa() {
            return this.ha;
        }

        /**
         * @return haResourceSpec
         */
        public HaResourceSpec getHaResourceSpec() {
            return this.haResourceSpec;
        }

        /**
         * @return haVSwitchIds
         */
        public java.util.List < String > getHaVSwitchIds() {
            return this.haVSwitchIds;
        }

        /**
         * @return haVSwitchInfo
         */
        public java.util.List < HaVSwitchInfo> getHaVSwitchInfo() {
            return this.haVSwitchInfo;
        }

        /**
         * @return haZoneId
         */
        public String getHaZoneId() {
            return this.haZoneId;
        }

        /**
         * @return hostAliases
         */
        public java.util.List < HostAliases> getHostAliases() {
            return this.hostAliases;
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
         * @return monitorType
         */
        public String getMonitorType() {
            return this.monitorType;
        }

        /**
         * @return orderState
         */
        public String getOrderState() {
            return this.orderState;
        }

        /**
         * @return ossInfo
         */
        public OssInfo getOssInfo() {
            return this.ossInfo;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceCreateTime
         */
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        /**
         * @return resourceExpiredTime
         */
        public Long getResourceExpiredTime() {
            return this.resourceExpiredTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceSpec
         */
        public ResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        /**
         * @return storage
         */
        public Storage getStorage() {
            return this.storage;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vSwitchInfo
         */
        public java.util.List < VSwitchInfo> getVSwitchInfo() {
            return this.vSwitchInfo;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcInfo
         */
        public VpcInfo getVpcInfo() {
            return this.vpcInfo;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String architectureType; 
            private String askClusterId; 
            private String chargeType; 
            private ClusterState clusterState; 
            private String clusterStatus; 
            private java.util.List < ClusterUsedResources> clusterUsedResources; 
            private ClusterUsedStorage clusterUsedStorage; 
            private Boolean ha; 
            private HaResourceSpec haResourceSpec; 
            private java.util.List < String > haVSwitchIds; 
            private java.util.List < HaVSwitchInfo> haVSwitchInfo; 
            private String haZoneId; 
            private java.util.List < HostAliases> hostAliases; 
            private String instanceId; 
            private String instanceName; 
            private String monitorType; 
            private String orderState; 
            private OssInfo ossInfo; 
            private String region; 
            private Long resourceCreateTime; 
            private Long resourceExpiredTime; 
            private String resourceGroupId; 
            private String resourceId; 
            private ResourceSpec resourceSpec; 
            private Storage storage; 
            private java.util.List < Tags> tags; 
            private String uid; 
            private java.util.List < String > vSwitchIds; 
            private java.util.List < VSwitchInfo> vSwitchInfo; 
            private String vpcId; 
            private VpcInfo vpcInfo; 
            private String zoneId; 

            /**
             * ArchitectureType.
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * AskClusterId.
             */
            public Builder askClusterId(String askClusterId) {
                this.askClusterId = askClusterId;
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
             * ClusterState.
             */
            public Builder clusterState(ClusterState clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            /**
             * ClusterStatus.
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * ClusterUsedResources.
             */
            public Builder clusterUsedResources(java.util.List < ClusterUsedResources> clusterUsedResources) {
                this.clusterUsedResources = clusterUsedResources;
                return this;
            }

            /**
             * ClusterUsedStorage.
             */
            public Builder clusterUsedStorage(ClusterUsedStorage clusterUsedStorage) {
                this.clusterUsedStorage = clusterUsedStorage;
                return this;
            }

            /**
             * Ha.
             */
            public Builder ha(Boolean ha) {
                this.ha = ha;
                return this;
            }

            /**
             * HaResourceSpec.
             */
            public Builder haResourceSpec(HaResourceSpec haResourceSpec) {
                this.haResourceSpec = haResourceSpec;
                return this;
            }

            /**
             * HaVSwitchIds.
             */
            public Builder haVSwitchIds(java.util.List < String > haVSwitchIds) {
                this.haVSwitchIds = haVSwitchIds;
                return this;
            }

            /**
             * HaVSwitchInfo.
             */
            public Builder haVSwitchInfo(java.util.List < HaVSwitchInfo> haVSwitchInfo) {
                this.haVSwitchInfo = haVSwitchInfo;
                return this;
            }

            /**
             * HaZoneId.
             */
            public Builder haZoneId(String haZoneId) {
                this.haZoneId = haZoneId;
                return this;
            }

            /**
             * HostAliases.
             */
            public Builder hostAliases(java.util.List < HostAliases> hostAliases) {
                this.hostAliases = hostAliases;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * MonitorType.
             */
            public Builder monitorType(String monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * OrderState.
             */
            public Builder orderState(String orderState) {
                this.orderState = orderState;
                return this;
            }

            /**
             * OssInfo.
             */
            public Builder ossInfo(OssInfo ossInfo) {
                this.ossInfo = ossInfo;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceCreateTime.
             */
            public Builder resourceCreateTime(Long resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
                return this;
            }

            /**
             * ResourceExpiredTime.
             */
            public Builder resourceExpiredTime(Long resourceExpiredTime) {
                this.resourceExpiredTime = resourceExpiredTime;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * Storage.
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VSwitchInfo.
             */
            public Builder vSwitchInfo(java.util.List < VSwitchInfo> vSwitchInfo) {
                this.vSwitchInfo = vSwitchInfo;
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
             * VpcInfo.
             */
            public Builder vpcInfo(VpcInfo vpcInfo) {
                this.vpcInfo = vpcInfo;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
