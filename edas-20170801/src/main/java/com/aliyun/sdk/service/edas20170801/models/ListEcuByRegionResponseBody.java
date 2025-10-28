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
 * {@link ListEcuByRegionResponseBody} extends {@link TeaModel}
 *
 * <p>ListEcuByRegionResponseBody</p>
 */
public class ListEcuByRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("EcuEntityList")
    private EcuEntityList ecuEntityList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEcuByRegionResponseBody(Builder builder) {
        this.code = builder.code;
        this.ecuEntityList = builder.ecuEntityList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcuByRegionResponseBody create() {
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
     * @return ecuEntityList
     */
    public EcuEntityList getEcuEntityList() {
        return this.ecuEntityList;
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

    public static final class Builder {
        private Integer code; 
        private EcuEntityList ecuEntityList; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListEcuByRegionResponseBody model) {
            this.code = model.code;
            this.ecuEntityList = model.ecuEntityList;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * <p>The information about ECUs.</p>
         */
        public Builder ecuEntityList(EcuEntityList ecuEntityList) {
            this.ecuEntityList = ecuEntityList;
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
         * <p>00000000-0000-0000-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEcuByRegionResponseBody build() {
            return new ListEcuByRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEcuByRegionResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcuByRegionResponseBody</p>
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
             * <p>The number of available CPU cores for the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder availableCpu(Integer availableCpu) {
                this.availableCpu = availableCpu;
                return this;
            }

            /**
             * <p>The size of available memory for the ECU. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder availableMem(Integer availableMem) {
                this.availableMem = availableMem;
                return this;
            }

            /**
             * <p>The total number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The timestamp when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1572539283168</p>
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
             * <p>The unique ID of the ECU. To query the ID, you can run the <code>dmidecode</code> command on the ECS instance that corresponds to the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>c96c494c-1b91-4456-bbb3-b5afcd16****</p>
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * <p>The timestamp when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1572867865221</p>
             */
            public Builder heartbeatTime(Long heartbeatTime) {
                this.heartbeatTime = heartbeatTime;
                return this;
            }

            /**
             * <p>The ID of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze82h8f4zcn449y****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The private IP address of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xxx.xxx</p>
             */
            public Builder ipAddr(String ipAddr) {
                this.ipAddr = ipAddr;
                return this;
            }

            /**
             * <p>The total size of memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The name of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>worker-k8s-for</p>
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
             * <p>false</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The ID of the region in which the ECU resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The timestamp when the ECU was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1572867895575</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>edas@aliyun-****.com</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) in which the ECU resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zew8mi6gqbo5wf****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the ECU resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-a</p>
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
     * {@link ListEcuByRegionResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcuByRegionResponseBody</p>
     */
    public static class EcuEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcuEntity")
        private java.util.List<EcuEntity> ecuEntity;

        private EcuEntityList(Builder builder) {
            this.ecuEntity = builder.ecuEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcuEntityList create() {
            return builder().build();
        }

        /**
         * @return ecuEntity
         */
        public java.util.List<EcuEntity> getEcuEntity() {
            return this.ecuEntity;
        }

        public static final class Builder {
            private java.util.List<EcuEntity> ecuEntity; 

            private Builder() {
            } 

            private Builder(EcuEntityList model) {
                this.ecuEntity = model.ecuEntity;
            } 

            /**
             * EcuEntity.
             */
            public Builder ecuEntity(java.util.List<EcuEntity> ecuEntity) {
                this.ecuEntity = ecuEntity;
                return this;
            }

            public EcuEntityList build() {
                return new EcuEntityList(this);
            } 

        } 

    }
}
