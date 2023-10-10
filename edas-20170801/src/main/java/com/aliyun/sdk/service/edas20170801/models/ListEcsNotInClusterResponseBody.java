// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEcsNotInClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ListEcsNotInClusterResponseBody</p>
 */
public class ListEcsNotInClusterResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("EcsEntityList")
    private EcsEntityList ecsEntityList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListEcsNotInClusterResponseBody(Builder builder) {
        this.code = builder.code;
        this.ecsEntityList = builder.ecsEntityList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcsNotInClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return ecsEntityList
     */
    public EcsEntityList getEcsEntityList() {
        return this.ecsEntityList;
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
        private EcsEntityList ecsEntityList; 
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
         * The information about ECS instances.
         */
        public Builder ecsEntityList(EcsEntityList ecsEntityList) {
            this.ecsEntityList = ecsEntityList;
            return this;
        }

        /**
         * The message that is returned.
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

        public ListEcsNotInClusterResponseBody build() {
            return new ListEcsNotInClusterResponseBody(this);
        } 

    } 

    public static class EcsEntity extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("Eip")
        private String eip;

        @NameInMap("Expired")
        private Boolean expired;

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

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private EcsEntity(Builder builder) {
            this.cpu = builder.cpu;
            this.eip = builder.eip;
            this.expired = builder.expired;
            this.innerIp = builder.innerIp;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.mem = builder.mem;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
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
            private Integer cpu; 
            private String eip; 
            private Boolean expired; 
            private String innerIp; 
            private String instanceId; 
            private String instanceName; 
            private Integer mem; 
            private String privateIp; 
            private String publicIp; 
            private String regionId; 
            private String status; 
            private String vpcId; 
            private String vpcName; 

            /**
             * The number of CPU cores.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The elastic IP address (EIP) associated with the ECS instance.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * Indicates whether the ECS instance has expired. Valid values:
             * <p>
             * 
             * *   **true**: The ECS instance has expired.
             * *   **false**: The ECS instance has not expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The private IP address of the ECS instance.
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
             * The size of memory. Unit: bytes.
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
             * The public IP address of the ECS instance.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * The ID of the region where the ECS instance is located.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the ECS instance. Valid values:
             * <p>
             * 
             * *   **Pending**: The ECS instance is being created.
             * *   **Running**: The ECS instance is running.
             * *   **Starting**: The ECS instance is being started.
             * *   **Stopping**: The ECS instance is being stopped.
             * *   **Stopped**: The ECS instance is stopped.
             */
            public Builder status(String status) {
                this.status = status;
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
             * The name of the VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public EcsEntity build() {
                return new EcsEntity(this);
            } 

        } 

    }
    public static class EcsEntityList extends TeaModel {
        @NameInMap("EcsEntity")
        private java.util.List < EcsEntity> ecsEntity;

        private EcsEntityList(Builder builder) {
            this.ecsEntity = builder.ecsEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsEntityList create() {
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

            public EcsEntityList build() {
                return new EcsEntityList(this);
            } 

        } 

    }
}
