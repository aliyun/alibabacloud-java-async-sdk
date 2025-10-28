// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupResponseBody</p>
 */
public class ListResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupList")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListResourceGroupResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resourceGroupList = model.resourceGroupList;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>For more information about how to define a resource group, see ResGroupEntity.</p>
         */
        public Builder resourceGroupList(ResourceGroupList resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }

        public ListResourceGroupResponseBody build() {
            return new ListResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupResponseBody</p>
     */
    public static class SlbEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbName")
        private String slbName;

        @com.aliyun.core.annotation.NameInMap("SlbStatus")
        private String slbStatus;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
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

            private Builder() {
            } 

            private Builder(SlbEntity model) {
                this.address = model.address;
                this.addressType = model.addressType;
                this.expired = model.expired;
                this.groupId = model.groupId;
                this.networkType = model.networkType;
                this.regionId = model.regionId;
                this.slbId = model.slbId;
                this.slbName = model.slbName;
                this.slbStatus = model.slbStatus;
                this.userId = model.userId;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The IP address of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xxx.xx</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The type of the IP address of the SLB instance. Valid values:</p>
             * <ul>
             * <li>Internet: Users can connect to the SLB instance over the Internet.</li>
             * <li>Intranet: Users can connect to the SLB instance over the internal network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Intranet</p>
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * <p>Indicates whether the SLB instance has expired. Valid values:</p>
             * <ul>
             * <li>true: The SLB instance has expired.</li>
             * <li>false: The SLB instance has not expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The ID of the group to which the SLB instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>64189****</p>
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The network type of the SLB instance. Valid values:</p>
             * <ul>
             * <li>Classic network</li>
             * <li>VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The unique ID of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zebf1fpbpkc7dnro****</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The name of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>a9315af59b4cd11e9a18c00163e1****</p>
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * <p>The status of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder slbStatus(String slbStatus) {
                this.slbStatus = slbStatus;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>****@aliyun.com</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m5e666n89m2bx8jar****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-mktkxkhah14****</p>
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
    /**
     * 
     * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupResponseBody</p>
     */
    public static class SlbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlbEntity")
        private java.util.List<SlbEntity> slbEntity;

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
        public java.util.List<SlbEntity> getSlbEntity() {
            return this.slbEntity;
        }

        public static final class Builder {
            private java.util.List<SlbEntity> slbEntity; 

            private Builder() {
            } 

            private Builder(SlbList model) {
                this.slbEntity = model.slbEntity;
            } 

            /**
             * SlbEntity.
             */
            public Builder slbEntity(java.util.List<SlbEntity> slbEntity) {
                this.slbEntity = slbEntity;
                return this;
            }

            public SlbList build() {
                return new SlbList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupResponseBody</p>
     */
    public static class EcuEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableCpu")
        private Integer availableCpu;

        @com.aliyun.core.annotation.NameInMap("AvailableMem")
        private Integer availableMem;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DockerEnv")
        private Boolean dockerEnv;

        @com.aliyun.core.annotation.NameInMap("EcuId")
        private String ecuId;

        @com.aliyun.core.annotation.NameInMap("HeartbeatTime")
        private Long heartbeatTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpAddr")
        private String ipAddr;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(EcuEntity model) {
                this.availableCpu = model.availableCpu;
                this.availableMem = model.availableMem;
                this.cpu = model.cpu;
                this.createTime = model.createTime;
                this.dockerEnv = model.dockerEnv;
                this.ecuId = model.ecuId;
                this.heartbeatTime = model.heartbeatTime;
                this.instanceId = model.instanceId;
                this.ipAddr = model.ipAddr;
                this.mem = model.mem;
                this.name = model.name;
                this.online = model.online;
                this.regionId = model.regionId;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of available CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder availableCpu(Integer availableCpu) {
                this.availableCpu = availableCpu;
                return this;
            }

            /**
             * <p>The size of the available memory.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder availableMem(Integer availableMem) {
                this.availableMem = availableMem;
                return this;
            }

            /**
             * <p>The total number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1557890594376</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether Docker is installed. Valid values:</p>
             * <ul>
             * <li>true: Docker is installed.</li>
             * <li>false: Docker is not installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dockerEnv(Boolean dockerEnv) {
                this.dockerEnv = dockerEnv;
                return this;
            }

            /**
             * <p>The unique ID of the elastic compute unit (ECU). You can run the <code>dmidecode</code> command on the ECS instance to query the ECU ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0de2ebdb-9490-4fc4-be41***************</p>
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * <p>The time when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573281040819</p>
             */
            public Builder heartbeatTime(Long heartbeatTime) {
                this.heartbeatTime = heartbeatTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zej4i2jdf*********</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The private IP address of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xxx.xx</p>
             */
            public Builder ipAddr(String ipAddr) {
                this.ipAddr = ipAddr;
                return this;
            }

            /**
             * <p>The total size of memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The name of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the ECU is online. Valid values:</p>
             * <ul>
             * <li>true: The ECU is online.</li>
             * <li>false: The ECU is offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the ECU was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573281040827</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user associated with the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>edas_****_test@aliyun-****.com</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze1ram356umxs598****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-b</p>
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
    /**
     * 
     * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupResponseBody</p>
     */
    public static class VpcEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidrblock")
        private String cidrblock;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EcsNum")
        private Integer ecsNum;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
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

            private Builder() {
            } 

            private Builder(VpcEntity model) {
                this.cidrblock = model.cidrblock;
                this.description = model.description;
                this.ecsNum = model.ecsNum;
                this.expired = model.expired;
                this.regionId = model.regionId;
                this.status = model.status;
                this.userId = model.userId;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The IPv4 CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xxx</p>
             */
            public Builder cidrblock(String cidrblock) {
                this.cidrblock = cidrblock;
                return this;
            }

            /**
             * <p>The description of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of ECS instances that run in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ecsNum(Integer ecsNum) {
                this.ecsNum = ecsNum;
                return this;
            }

            /**
             * <p>Indicates whether the VPC has expired. Valid values:</p>
             * <ul>
             * <li>true: The VPC has expired.</li>
             * <li>false: The VPC has not expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><em>common</em></strong></strong>@aliyun.com</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The unique ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp13evu42t1er****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupResponseBody</p>
     */
    public static class EcsEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EcuEntity")
        private EcuEntity ecuEntity;

        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("InnerIp")
        private String innerIp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SerialNum")
        private String serialNum;

        @com.aliyun.core.annotation.NameInMap("SgId")
        private String sgId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VpcEntity")
        private VpcEntity vpcEntity;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(EcsEntity model) {
                this.cpu = model.cpu;
                this.description = model.description;
                this.ecuEntity = model.ecuEntity;
                this.eip = model.eip;
                this.expired = model.expired;
                this.groupId = model.groupId;
                this.hostName = model.hostName;
                this.innerIp = model.innerIp;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.mem = model.mem;
                this.privateIp = model.privateIp;
                this.publicIp = model.publicIp;
                this.regionId = model.regionId;
                this.serialNum = model.serialNum;
                this.sgId = model.sgId;
                this.status = model.status;
                this.userId = model.userId;
                this.vpcEntity = model.vpcEntity;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The total number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The description of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The elastic compute unit (ECU) that corresponds to the ECS instance.</p>
             */
            public Builder ecuEntity(EcuEntity ecuEntity) {
                this.ecuEntity = ecuEntity;
                return this;
            }

            /**
             * <p>The elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xxx.xx</p>
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * <p>Indicates whether the ECS instance has expired. Valid values:</p>
             * <ul>
             * <li>true: The ECS instance has expired.</li>
             * <li>false: The ECS instance has not expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The ID of the resource group in Enterprise Distributed Application Service (EDAS).</p>
             * 
             * <strong>example:</strong>
             * <p>64189****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>iZm5e853hvvrodnvqus****</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xxx</p>
             */
            public Builder innerIp(String innerIp) {
                this.innerIp = innerIp;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5e853hvvrodnvqu****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>betabjmixcoud_01</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The total size of memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The private IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xxx</p>
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xxx</p>
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>ch-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The serial number of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>98b480b8-458b-4ff3-84b9-cf7097c5****</p>
             */
            public Builder serialNum(String serialNum) {
                this.serialNum = serialNum;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-m5eajgzn6b8sg9mv****</p>
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * <p>The status of the ECS instance. Valid values:</p>
             * <ul>
             * <li>Pending: The ECS instance is being created.</li>
             * <li>Running: The ECS instance is running.</li>
             * <li>Starting: The ECS instance is being started.</li>
             * <li>Stopping: The ECS instance is being stopped.</li>
             * <li>Stopped: The ECS instance is stopped.</li>
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
             * <p>The ID of the user account.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><em>common</em></strong></strong>@aliyun.com</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The VPCs.</p>
             */
            public Builder vpcEntity(VpcEntity vpcEntity) {
                this.vpcEntity = vpcEntity;
                return this;
            }

            /**
             * <p>The unique ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp13evu4aayj2t1er****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao-h</p>
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
    /**
     * 
     * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupResponseBody</p>
     */
    public static class EcsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsEntity")
        private java.util.List<EcsEntity> ecsEntity;

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
        public java.util.List<EcsEntity> getEcsEntity() {
            return this.ecsEntity;
        }

        public static final class Builder {
            private java.util.List<EcsEntity> ecsEntity; 

            private Builder() {
            } 

            private Builder(EcsList model) {
                this.ecsEntity = model.ecsEntity;
            } 

            /**
             * EcsEntity.
             */
            public Builder ecsEntity(java.util.List<EcsEntity> ecsEntity) {
                this.ecsEntity = ecsEntity;
                return this;
            }

            public EcsList build() {
                return new EcsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupResponseBody</p>
     */
    public static class ResGroupEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminUserId")
        private String adminUserId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SlbList")
        private SlbList slbList;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("ecsList")
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

            private Builder() {
            } 

            private Builder(ResGroupEntity model) {
                this.adminUserId = model.adminUserId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.regionId = model.regionId;
                this.slbList = model.slbList;
                this.updateTime = model.updateTime;
                this.ecsList = model.ecsList;
            } 

            /**
             * <p>The UID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>****@aliyun.com</p>
             */
            public Builder adminUserId(String adminUserId) {
                this.adminUserId = adminUserId;
                return this;
            }

            /**
             * <p>The time when the resource group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1557890594376</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>QqLZDA3pBZ</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>8592</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>TIa2LGixyD</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region where the resource group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The Server Load Balancer (SLB) instances.</p>
             */
            public Builder slbList(SlbList slbList) {
                this.slbList = slbList;
                return this;
            }

            /**
             * <p>The time when the resource group was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573281040827</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The Elastic Compute Service (ECS) instances.</p>
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
    /**
     * 
     * {@link ListResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupResponseBody</p>
     */
    public static class ResourceGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResGroupEntity")
        private java.util.List<ResGroupEntity> resGroupEntity;

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
        public java.util.List<ResGroupEntity> getResGroupEntity() {
            return this.resGroupEntity;
        }

        public static final class Builder {
            private java.util.List<ResGroupEntity> resGroupEntity; 

            private Builder() {
            } 

            private Builder(ResourceGroupList model) {
                this.resGroupEntity = model.resGroupEntity;
            } 

            /**
             * ResGroupEntity.
             */
            public Builder resGroupEntity(java.util.List<ResGroupEntity> resGroupEntity) {
                this.resGroupEntity = resGroupEntity;
                return this;
            }

            public ResourceGroupList build() {
                return new ResourceGroupList(this);
            } 

        } 

    }
}
