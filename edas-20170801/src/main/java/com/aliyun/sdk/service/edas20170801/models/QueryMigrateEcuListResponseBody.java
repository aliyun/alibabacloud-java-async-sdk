// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMigrateEcuListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMigrateEcuListResponseBody</p>
 */
public class QueryMigrateEcuListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("EcuEntityList")
    private EcuEntityList ecuEntityList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryMigrateEcuListResponseBody(Builder builder) {
        this.code = builder.code;
        this.ecuEntityList = builder.ecuEntityList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMigrateEcuListResponseBody create() {
        return builder().build();
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

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about ECUs that can be migrated.
         */
        public Builder ecuEntityList(EcuEntityList ecuEntityList) {
            this.ecuEntityList = ecuEntityList;
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

        public QueryMigrateEcuListResponseBody build() {
            return new QueryMigrateEcuListResponseBody(this);
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
             * The number of available CPUs. Unit: cores.
             */
            public Builder availableCpu(Integer availableCpu) {
                this.availableCpu = availableCpu;
                return this;
            }

            /**
             * The size of available memory. Unit: MB.
             */
            public Builder availableMem(Integer availableMem) {
                this.availableMem = availableMem;
                return this;
            }

            /**
             * The CPU quota set by the system. Unit: cores. The value 0 indicates that no quota is set by the system.
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
             * The unique ID of the ECU. To query the ID, you can run the `dmidecode` command on the ECS instance that corresponds to the ECU.
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
             * The ID of the ECU.
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
             * The total size of memory.
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
             * The ID of the region where the ECU resides.
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
             * The ID of the Alibaba Cloud account to which the ECU belongs.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * VPC ID
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the zone where the ECU resides.
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
    public static class EcuEntityList extends TeaModel {
        @NameInMap("EcuEntity")
        private java.util.List < EcuEntity> ecuEntity;

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
        public java.util.List < EcuEntity> getEcuEntity() {
            return this.ecuEntity;
        }

        public static final class Builder {
            private java.util.List < EcuEntity> ecuEntity; 

            /**
             * EcuEntity.
             */
            public Builder ecuEntity(java.util.List < EcuEntity> ecuEntity) {
                this.ecuEntity = ecuEntity;
                return this;
            }

            public EcuEntityList build() {
                return new EcuEntityList(this);
            } 

        } 

    }
}
