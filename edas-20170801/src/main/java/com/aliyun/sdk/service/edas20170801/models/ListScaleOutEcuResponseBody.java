// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScaleOutEcuResponseBody} extends {@link TeaModel}
 *
 * <p>ListScaleOutEcuResponseBody</p>
 */
public class ListScaleOutEcuResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("EcuInfoList")
    private EcuInfoList ecuInfoList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListScaleOutEcuResponseBody(Builder builder) {
        this.code = builder.code;
        this.ecuInfoList = builder.ecuInfoList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScaleOutEcuResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return ecuInfoList
     */
    public EcuInfoList getEcuInfoList() {
        return this.ecuInfoList;
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
        private EcuInfoList ecuInfoList; 
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
         * The ECUs.
         */
        public Builder ecuInfoList(EcuInfoList ecuInfoList) {
            this.ecuInfoList = ecuInfoList;
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

        public ListScaleOutEcuResponseBody build() {
            return new ListScaleOutEcuResponseBody(this);
        } 

    } 

    public static class EcuInfo extends TeaModel {
        @NameInMap("AvailableCpu")
        private Integer availableCpu;

        @NameInMap("AvailableMem")
        private Integer availableMem;

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

        private EcuInfo(Builder builder) {
            this.availableCpu = builder.availableCpu;
            this.availableMem = builder.availableMem;
            this.createTime = builder.createTime;
            this.dockerEnv = builder.dockerEnv;
            this.ecuId = builder.ecuId;
            this.heartbeatTime = builder.heartbeatTime;
            this.instanceId = builder.instanceId;
            this.ipAddr = builder.ipAddr;
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

        public static EcuInfo create() {
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
            private Long createTime; 
            private Boolean dockerEnv; 
            private String ecuId; 
            private Long heartbeatTime; 
            private String instanceId; 
            private String ipAddr; 
            private String name; 
            private Boolean online; 
            private String regionId; 
            private Long updateTime; 
            private String userId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The number of available CPU cores for the ECU.
             */
            public Builder availableCpu(Integer availableCpu) {
                this.availableCpu = availableCpu;
                return this;
            }

            /**
             * The size of available memory for the ECU. Unit: MB.
             */
            public Builder availableMem(Integer availableMem) {
                this.availableMem = availableMem;
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
             * The name of the ECU.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the ECU is online. If the ECU is online, its corresponding ECS instance is managed in EDAS. Valid values:
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
             * The ID of the region where the ECU is located.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the ECU was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
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
             * The ID of the virtual private cloud (VPC) where the ECU is located.
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

            public EcuInfo build() {
                return new EcuInfo(this);
            } 

        } 

    }
    public static class EcuInfoList extends TeaModel {
        @NameInMap("EcuInfo")
        private java.util.List < EcuInfo> ecuInfo;

        private EcuInfoList(Builder builder) {
            this.ecuInfo = builder.ecuInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcuInfoList create() {
            return builder().build();
        }

        /**
         * @return ecuInfo
         */
        public java.util.List < EcuInfo> getEcuInfo() {
            return this.ecuInfo;
        }

        public static final class Builder {
            private java.util.List < EcuInfo> ecuInfo; 

            /**
             * EcuInfo.
             */
            public Builder ecuInfo(java.util.List < EcuInfo> ecuInfo) {
                this.ecuInfo = ecuInfo;
                return this;
            }

            public EcuInfoList build() {
                return new EcuInfoList(this);
            } 

        } 

    }
}
