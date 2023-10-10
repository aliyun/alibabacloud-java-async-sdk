// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupResponseBody</p>
 */
public class ListResourceGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupList")
    private ResourceGroupList resourceGroupList;

    private ListResourceGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resourceGroupList = builder.resourceGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupList
     */
    public ResourceGroupList getResourceGroupList() {
        return this.resourceGroupList;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private ResourceGroupList resourceGroupList; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * For more information about how to define a resource group, see ResGroupEntity.
         */
        public Builder resourceGroupList(ResourceGroupList resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }

        public ListResourceGroupResponseBody build() {
            return new ListResourceGroupResponseBody(this);
        } 

    } 

    public static class SlbEntity extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("AddressType")
        private String addressType;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("GroupId")
        private Integer groupId;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbName")
        private String slbName;

        @NameInMap("SlbStatus")
        private String slbStatus;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        private SlbEntity(Builder builder) {
            this.address = builder.address;
            this.addressType = builder.addressType;
            this.expired = builder.expired;
            this.groupId = builder.groupId;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.slbId = builder.slbId;
            this.slbName = builder.slbName;
            this.slbStatus = builder.slbStatus;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbEntity create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbName
         */
        public String getSlbName() {
            return this.slbName;
        }

        /**
         * @return slbStatus
         */
        public String getSlbStatus() {
            return this.slbStatus;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String address; 
            private String addressType; 
            private Boolean expired; 
            private Integer groupId; 
            private String networkType; 
            private String regionId; 
            private String slbId; 
            private String slbName; 
            private String slbStatus; 
            private String userId; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * The IP address of the SLB instance.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The type of the IP address of the SLB instance. Valid values:
             * <p>
             * 
             * *   Internet: Users can connect to the SLB instance over the Internet.
             * *   Intranet: Users can connect to the SLB instance over the internal network.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * Indicates whether the SLB instance has expired. Valid values:
             * <p>
             * 
             * *   true: The SLB instance has expired.
             * *   false: The SLB instance has not expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The ID of the group to which the SLB instance belongs.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The network type of the SLB instance. Valid values:
             * <p>
             * 
             * *   Classic network
             * *   VPC
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The unique ID of the SLB instance.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * The name of the SLB instance.
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * The status of the SLB instance.
             */
            public Builder slbStatus(String slbStatus) {
                this.slbStatus = slbStatus;
                return this;
            }

            /**
             * The UID of the Alibaba Cloud account.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public SlbEntity build() {
                return new SlbEntity(this);
            } 

        } 

    }
    public static class SlbList extends TeaModel {
        @NameInMap("SlbEntity")
        private java.util.List < SlbEntity> slbEntity;

        private SlbList(Builder builder) {
            this.slbEntity = builder.slbEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbList create() {
            return builder().build();
        }

        /**
         * @return slbEntity
         */
        public java.util.List < SlbEntity> getSlbEntity() {
            return this.slbEntity;
        }

        public static final class Builder {
            private java.util.List < SlbEntity> slbEntity; 

            /**
             * SlbEntity.
             */
            public Builder slbEntity(java.util.List < SlbEntity> slbEntity) {
                this.slbEntity = slbEntity;
                return this;
            }

            public SlbList build() {
                return new SlbList(this);
            } 

        } 

    }
    public static class EcuEntity extends TeaModel {
        @NameInMap("AvailableCpu")
        private Integer availableCpu;

        @NameInMap("AvailableMem")
        private Integer availableMem;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DockerEnv")
        private Boolean dockerEnv;

        @NameInMap("EcuId")
        private String ecuId;

        @NameInMap("HeartbeatTime")
        private Long heartbeatTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IpAddr")
        private String ipAddr;

        @NameInMap("Mem")
        private Integer mem;

        @NameInMap("Name")
        private String name;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private EcuEntity(Builder builder) {
            this.availableCpu = builder.availableCpu;
            this.availableMem = builder.availableMem;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.dockerEnv = builder.dockerEnv;
            this.ecuId = builder.ecuId;
            this.heartbeatTime = builder.heartbeatTime;
            this.instanceId = builder.instanceId;
            this.ipAddr = builder.ipAddr;
            this.mem = builder.mem;
            this.name = builder.name;
            this.online = builder.online;
            this.regionId = builder.regionId;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcuEntity create() {
            return builder().build();
        }

        /**
         * @return availableCpu
         */
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        /**
         * @return availableMem
         */
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dockerEnv
         */
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        /**
         * @return ecuId
         */
        public String getEcuId() {
            return this.ecuId;
        }

        /**
         * @return heartbeatTime
         */
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipAddr
         */
        public String getIpAddr() {
            return this.ipAddr;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
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
            private Integer availableCpu; 
            private Integer availableMem; 
            private Integer cpu; 
            private Long createTime; 
            private Boolean dockerEnv; 
            private String ecuId; 
            private Long heartbeatTime; 
            private String instanceId; 
            private String ipAddr; 
            private Integer mem; 
            private String name; 
            private Boolean online; 
            private String regionId; 
            private Long updateTime; 
            private String userId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The number of available CPUs.
             */
            public Builder availableCpu(Integer availableCpu) {
                this.availableCpu = availableCpu;
                return this;
            }

            /**
             * The size of the available memory.
             */
            public Builder availableMem(Integer availableMem) {
                this.availableMem = availableMem;
                return this;
            }

            /**
             * The total number of CPU cores.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether Docker is installed. Valid values:
             * <p>
             * 
             * *   true: Docker is installed.
             * *   false: Docker is not installed.
             */
            public Builder dockerEnv(Boolean dockerEnv) {
                this.dockerEnv = dockerEnv;
                return this;
            }

            /**
             * The unique ID of the elastic compute unit (ECU). You can run the `dmidecode` command on the ECS instance to query the ECU ID.
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * The time when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder heartbeatTime(Long heartbeatTime) {
                this.heartbeatTime = heartbeatTime;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The private IP address of the ECU.
             */
            public Builder ipAddr(String ipAddr) {
                this.ipAddr = ipAddr;
                return this;
            }

            /**
             * The total size of memory. Unit: MB.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The name of the ECU.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the ECU is online. Valid values:
             * <p>
             * 
             * *   true: The ECU is online.
             * *   false: The ECU is offline.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the ECU was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user associated with the ECU.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public EcuEntity build() {
                return new EcuEntity(this);
            } 

        } 

    }
    public static class VpcEntity extends TeaModel {
        @NameInMap("Cidrblock")
        private String cidrblock;

        @NameInMap("Description")
        private String description;

        @NameInMap("EcsNum")
        private Integer ecsNum;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private VpcEntity(Builder builder) {
            this.cidrblock = builder.cidrblock;
            this.description = builder.description;
            this.ecsNum = builder.ecsNum;
            this.expired = builder.expired;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcEntity create() {
            return builder().build();
        }

        /**
         * @return cidrblock
         */
        public String getCidrblock() {
            return this.cidrblock;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsNum
         */
        public Integer getEcsNum() {
            return this.ecsNum;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
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
            private String cidrblock; 
            private String description; 
            private Integer ecsNum; 
            private Boolean expired; 
            private String regionId; 
            private String status; 
            private String userId; 
            private String vpcId; 
            private String vpcName; 

            /**
             * The IPv4 CIDR block of the vSwitch.
             */
            public Builder cidrblock(String cidrblock) {
                this.cidrblock = cidrblock;
                return this;
            }

            /**
             * The description of the VPC.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The number of ECS instances that run in the VPC.
             */
            public Builder ecsNum(Integer ecsNum) {
                this.ecsNum = ecsNum;
                return this;
            }

            /**
             * Indicates whether the VPC has expired. Valid values:
             * <p>
             * 
             * *   true: The VPC has expired.
             * *   false: The VPC has not expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the VPC.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The unique ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public VpcEntity build() {
                return new VpcEntity(this);
            } 

        } 

    }
    public static class EcsEntity extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("Description")
        private String description;

        @NameInMap("EcuEntity")
        private EcuEntity ecuEntity;

        @NameInMap("Eip")
        private String eip;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InnerIp")
        private String innerIp;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Mem")
        private Integer mem;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("PublicIp")
        private String publicIp;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SerialNum")
        private String serialNum;

        @NameInMap("SgId")
        private String sgId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcEntity")
        private VpcEntity vpcEntity;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private EcsEntity(Builder builder) {
            this.cpu = builder.cpu;
            this.description = builder.description;
            this.ecuEntity = builder.ecuEntity;
            this.eip = builder.eip;
            this.expired = builder.expired;
            this.groupId = builder.groupId;
            this.hostName = builder.hostName;
            this.innerIp = builder.innerIp;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.mem = builder.mem;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.regionId = builder.regionId;
            this.serialNum = builder.serialNum;
            this.sgId = builder.sgId;
            this.status = builder.status;
            this.userId = builder.userId;
            this.vpcEntity = builder.vpcEntity;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsEntity create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecuEntity
         */
        public EcuEntity getEcuEntity() {
            return this.ecuEntity;
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return innerIp
         */
        public String getInnerIp() {
            return this.innerIp;
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
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serialNum
         */
        public String getSerialNum() {
            return this.serialNum;
        }

        /**
         * @return sgId
         */
        public String getSgId() {
            return this.sgId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vpcEntity
         */
        public VpcEntity getVpcEntity() {
            return this.vpcEntity;
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
            private Integer cpu; 
            private String description; 
            private EcuEntity ecuEntity; 
            private String eip; 
            private Boolean expired; 
            private String groupId; 
            private String hostName; 
            private String innerIp; 
            private String instanceId; 
            private String instanceName; 
            private Integer mem; 
            private String privateIp; 
            private String publicIp; 
            private String regionId; 
            private String serialNum; 
            private String sgId; 
            private String status; 
            private String userId; 
            private VpcEntity vpcEntity; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The total number of CPU cores.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The description of the ECS instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The elastic compute unit (ECU) that corresponds to the ECS instance.
             */
            public Builder ecuEntity(EcuEntity ecuEntity) {
                this.ecuEntity = ecuEntity;
                return this;
            }

            /**
             * The elastic IP address (EIP).
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * Indicates whether the ECS instance has expired. Valid values:
             * <p>
             * 
             * *   true: The ECS instance has expired.
             * *   false: The ECS instance has not expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The ID of the resource group in Enterprise Distributed Application Service (EDAS).
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the host.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The private IP address.
             */
            public Builder innerIp(String innerIp) {
                this.innerIp = innerIp;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the ECS instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The total size of memory. Unit: MB.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The private IP address of the ECS instance.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The serial number of the ECS instance.
             */
            public Builder serialNum(String serialNum) {
                this.serialNum = serialNum;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * The status of the ECS instance. Valid values:
             * <p>
             * 
             * *   Pending: The ECS instance is being created.
             * *   Running: The ECS instance is running.
             * *   Starting: The ECS instance is being started.
             * *   Stopping: The ECS instance is being stopped.
             * *   Stopped: The ECS instance is stopped.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the user account.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The VPCs.
             */
            public Builder vpcEntity(VpcEntity vpcEntity) {
                this.vpcEntity = vpcEntity;
                return this;
            }

            /**
             * The unique ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public EcsEntity build() {
                return new EcsEntity(this);
            } 

        } 

    }
    public static class EcsList extends TeaModel {
        @NameInMap("EcsEntity")
        private java.util.List < EcsEntity> ecsEntity;

        private EcsList(Builder builder) {
            this.ecsEntity = builder.ecsEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsList create() {
            return builder().build();
        }

        /**
         * @return ecsEntity
         */
        public java.util.List < EcsEntity> getEcsEntity() {
            return this.ecsEntity;
        }

        public static final class Builder {
            private java.util.List < EcsEntity> ecsEntity; 

            /**
             * EcsEntity.
             */
            public Builder ecsEntity(java.util.List < EcsEntity> ecsEntity) {
                this.ecsEntity = ecsEntity;
                return this;
            }

            public EcsList build() {
                return new EcsList(this);
            } 

        } 

    }
    public static class ResGroupEntity extends TeaModel {
        @NameInMap("AdminUserId")
        private String adminUserId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SlbList")
        private SlbList slbList;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("ecsList")
        private EcsList ecsList;

        private ResGroupEntity(Builder builder) {
            this.adminUserId = builder.adminUserId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.slbList = builder.slbList;
            this.updateTime = builder.updateTime;
            this.ecsList = builder.ecsList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResGroupEntity create() {
            return builder().build();
        }

        /**
         * @return adminUserId
         */
        public String getAdminUserId() {
            return this.adminUserId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return slbList
         */
        public SlbList getSlbList() {
            return this.slbList;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return ecsList
         */
        public EcsList getEcsList() {
            return this.ecsList;
        }

        public static final class Builder {
            private String adminUserId; 
            private Long createTime; 
            private String description; 
            private Long id; 
            private String name; 
            private String regionId; 
            private SlbList slbList; 
            private Long updateTime; 
            private EcsList ecsList; 

            /**
             * The UID of the Alibaba Cloud account.
             */
            public Builder adminUserId(String adminUserId) {
                this.adminUserId = adminUserId;
                return this;
            }

            /**
             * The time when the resource group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the resource group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the region where the resource group belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The Server Load Balancer (SLB) instances.
             */
            public Builder slbList(SlbList slbList) {
                this.slbList = slbList;
                return this;
            }

            /**
             * The time when the resource group was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The Elastic Compute Service (ECS) instances.
             */
            public Builder ecsList(EcsList ecsList) {
                this.ecsList = ecsList;
                return this;
            }

            public ResGroupEntity build() {
                return new ResGroupEntity(this);
            } 

        } 

    }
    public static class ResourceGroupList extends TeaModel {
        @NameInMap("ResGroupEntity")
        private java.util.List < ResGroupEntity> resGroupEntity;

        private ResourceGroupList(Builder builder) {
            this.resGroupEntity = builder.resGroupEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroupList create() {
            return builder().build();
        }

        /**
         * @return resGroupEntity
         */
        public java.util.List < ResGroupEntity> getResGroupEntity() {
            return this.resGroupEntity;
        }

        public static final class Builder {
            private java.util.List < ResGroupEntity> resGroupEntity; 

            /**
             * ResGroupEntity.
             */
            public Builder resGroupEntity(java.util.List < ResGroupEntity> resGroupEntity) {
                this.resGroupEntity = resGroupEntity;
                return this;
            }

            public ResourceGroupList build() {
                return new ResourceGroupList(this);
            } 

        } 

    }
}
