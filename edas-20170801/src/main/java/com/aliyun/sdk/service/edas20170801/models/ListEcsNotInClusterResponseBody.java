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
 * {@link ListEcsNotInClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ListEcsNotInClusterResponseBody</p>
 */
public class ListEcsNotInClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("EcsEntityList")
    private EcsEntityList ecsEntityList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder() {
        } 

        private Builder(ListEcsNotInClusterResponseBody model) {
            this.code = model.code;
            this.ecsEntityList = model.ecsEntityList;
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
         * <p>The information about ECS instances.</p>
         */
        public Builder ecsEntityList(EcsEntityList ecsEntityList) {
            this.ecsEntityList = ecsEntityList;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
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

        public ListEcsNotInClusterResponseBody build() {
            return new ListEcsNotInClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEcsNotInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsNotInClusterResponseBody</p>
     */
    public static class EcsEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
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

            private Builder() {
            } 

            private Builder(EcsEntity model) {
                this.cpu = model.cpu;
                this.eip = model.eip;
                this.expired = model.expired;
                this.innerIp = model.innerIp;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.mem = model.mem;
                this.privateIp = model.privateIp;
                this.publicIp = model.publicIp;
                this.regionId = model.regionId;
                this.status = model.status;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The elastic IP address (EIP) associated with the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>139.30.xxx.xx</p>
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * <p>Indicates whether the ECS instance has expired. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The ECS instance has expired.</li>
             * <li><strong>false</strong>: The ECS instance has not expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The private IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.20.113</p>
             */
            public Builder innerIp(String innerIp) {
                this.innerIp = innerIp;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze7s2v0b***********</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>worker-k8s-for-cs-c9dfa009a5e7c4faab2010b87cae4****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The size of memory. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The private IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.<em>.</em>*</p>
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * <p>The public IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>131.30.xxx.xx</p>
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * <p>The ID of the region where the ECS instance is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the ECS instance. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: The ECS instance is being created.</li>
             * <li><strong>Running</strong>: The ECS instance is running.</li>
             * <li><strong>Starting</strong>: The ECS instance is being started.</li>
             * <li><strong>Stopping</strong>: The ECS instance is being stopped.</li>
             * <li><strong>Stopped</strong>: The ECS instance is stopped.</li>
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
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zef6ob8mrlzv8x3q****</p>
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

            public EcsEntity build() {
                return new EcsEntity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEcsNotInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsNotInClusterResponseBody</p>
     */
    public static class EcsEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsEntity")
        private java.util.List<EcsEntity> ecsEntity;

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
        public java.util.List<EcsEntity> getEcsEntity() {
            return this.ecsEntity;
        }

        public static final class Builder {
            private java.util.List<EcsEntity> ecsEntity; 

            private Builder() {
            } 

            private Builder(EcsEntityList model) {
                this.ecsEntity = model.ecsEntity;
            } 

            /**
             * EcsEntity.
             */
            public Builder ecsEntity(java.util.List<EcsEntity> ecsEntity) {
                this.ecsEntity = ecsEntity;
                return this;
            }

            public EcsEntityList build() {
                return new EcsEntityList(this);
            } 

        } 

    }
}
