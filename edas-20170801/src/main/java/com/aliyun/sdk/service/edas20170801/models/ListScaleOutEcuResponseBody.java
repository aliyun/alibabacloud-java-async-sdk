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
 * {@link ListScaleOutEcuResponseBody} extends {@link TeaModel}
 *
 * <p>ListScaleOutEcuResponseBody</p>
 */
public class ListScaleOutEcuResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("EcuInfoList")
    private EcuInfoList ecuInfoList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder() {
        } 

        private Builder(ListScaleOutEcuResponseBody model) {
            this.code = model.code;
            this.ecuInfoList = model.ecuInfoList;
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
         * <p>The ECUs.</p>
         */
        public Builder ecuInfoList(EcuInfoList ecuInfoList) {
            this.ecuInfoList = ecuInfoList;
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
         * <p>AF860D6C-ACE3-4429-9D54-3BD15A******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListScaleOutEcuResponseBody build() {
            return new ListScaleOutEcuResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScaleOutEcuResponseBody} extends {@link TeaModel}
     *
     * <p>ListScaleOutEcuResponseBody</p>
     */
    public static class EcuInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableCpu")
        private Integer availableCpu;

        @com.aliyun.core.annotation.NameInMap("AvailableMem")
        private Integer availableMem;

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

            private Builder() {
            } 

            private Builder(EcuInfo model) {
                this.availableCpu = model.availableCpu;
                this.availableMem = model.availableMem;
                this.createTime = model.createTime;
                this.dockerEnv = model.dockerEnv;
                this.ecuId = model.ecuId;
                this.heartbeatTime = model.heartbeatTime;
                this.instanceId = model.instanceId;
                this.ipAddr = model.ipAddr;
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
             * <p>2</p>
             */
            public Builder availableCpu(Integer availableCpu) {
                this.availableCpu = availableCpu;
                return this;
            }

            /**
             * <p>The size of available memory for the ECU. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder availableMem(Integer availableMem) {
                this.availableMem = availableMem;
                return this;
            }

            /**
             * <p>The time when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573281040819</p>
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
             * <p>false</p>
             */
            public Builder dockerEnv(Boolean dockerEnv) {
                this.dockerEnv = dockerEnv;
                return this;
            }

            /**
             * <p>The unique ID of the ECU. To query the ID, you can run the <code>dmidecode</code> command on the ECS instance that corresponds to the ECU.</p>
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
             * <p>The ID of the ECU.</p>
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
             * <p>192.168.XX.XX</p>
             */
            public Builder ipAddr(String ipAddr) {
                this.ipAddr = ipAddr;
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
             * <p>Indicates whether the ECU is online. If the ECU is online, its corresponding ECS instance is managed in EDAS. Valid values:</p>
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
             * <p>The ID of the region where the ECU is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the ECU was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573281040827</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the ECU belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1172<strong><strong>6608</strong></strong></p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) where the ECU is located.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zef6ob8**********</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone where the ECU resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-h</p>
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
    /**
     * 
     * {@link ListScaleOutEcuResponseBody} extends {@link TeaModel}
     *
     * <p>ListScaleOutEcuResponseBody</p>
     */
    public static class EcuInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcuInfo")
        private java.util.List<EcuInfo> ecuInfo;

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
        public java.util.List<EcuInfo> getEcuInfo() {
            return this.ecuInfo;
        }

        public static final class Builder {
            private java.util.List<EcuInfo> ecuInfo; 

            private Builder() {
            } 

            private Builder(EcuInfoList model) {
                this.ecuInfo = model.ecuInfo;
            } 

            /**
             * EcuInfo.
             */
            public Builder ecuInfo(java.util.List<EcuInfo> ecuInfo) {
                this.ecuInfo = ecuInfo;
                return this;
            }

            public EcuInfoList build() {
                return new EcuInfoList(this);
            } 

        } 

    }
}
