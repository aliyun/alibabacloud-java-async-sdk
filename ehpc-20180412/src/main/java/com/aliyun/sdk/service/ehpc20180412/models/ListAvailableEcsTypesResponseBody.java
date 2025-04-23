// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListAvailableEcsTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableEcsTypesResponseBody</p>
 */
public class ListAvailableEcsTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
    private InstanceTypeFamilies instanceTypeFamilies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportSpotInstance")
    private Boolean supportSpotInstance;

    private ListAvailableEcsTypesResponseBody(Builder builder) {
        this.instanceTypeFamilies = builder.instanceTypeFamilies;
        this.requestId = builder.requestId;
        this.supportSpotInstance = builder.supportSpotInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableEcsTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceTypeFamilies
     */
    public InstanceTypeFamilies getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportSpotInstance
     */
    public Boolean getSupportSpotInstance() {
        return this.supportSpotInstance;
    }

    public static final class Builder {
        private InstanceTypeFamilies instanceTypeFamilies; 
        private String requestId; 
        private Boolean supportSpotInstance; 

        private Builder() {
        } 

        private Builder(ListAvailableEcsTypesResponseBody model) {
            this.instanceTypeFamilies = model.instanceTypeFamilies;
            this.requestId = model.requestId;
            this.supportSpotInstance = model.supportSpotInstance;
        } 

        /**
         * <p>The instance family to which the instance type belongs.</p>
         */
        public Builder instanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9DD3AF8-1F91-4075-8669-55D10E45****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Specifies whether preemptible instances are supported. Valid values:</p>
         * <ul>
         * <li>false: not supported</li>
         * <li>true: supported</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder supportSpotInstance(Boolean supportSpotInstance) {
            this.supportSpotInstance = supportSpotInstance;
            return this;
        }

        public ListAvailableEcsTypesResponseBody build() {
            return new ListAvailableEcsTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvailableEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableEcsTypesResponseBody</p>
     */
    public static class ZoneIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private java.util.List<String> zoneId;

        private ZoneIds(Builder builder) {
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneIds create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public java.util.List<String> getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<String> zoneId; 

            private Builder() {
            } 

            private Builder(ZoneIds model) {
                this.zoneId = model.zoneId;
            } 

            /**
             * ZoneId.
             */
            public Builder zoneId(java.util.List<String> zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneIds build() {
                return new ZoneIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAvailableEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableEcsTypesResponseBody</p>
     */
    public static class TypesInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("EniQuantity")
        private Integer eniQuantity;

        @com.aliyun.core.annotation.NameInMap("GPUAmount")
        private Integer GPUAmount;

        @com.aliyun.core.annotation.NameInMap("GPUSpec")
        private String GPUSpec;

        @com.aliyun.core.annotation.NameInMap("InstanceBandwidthRx")
        private Integer instanceBandwidthRx;

        @com.aliyun.core.annotation.NameInMap("InstanceBandwidthTx")
        private Integer instanceBandwidthTx;

        @com.aliyun.core.annotation.NameInMap("InstancePpsRx")
        private Integer instancePpsRx;

        @com.aliyun.core.annotation.NameInMap("InstancePpsTx")
        private Integer instancePpsTx;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Integer memorySize;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ZoneIds")
        private ZoneIds zoneIds;

        private TypesInfo(Builder builder) {
            this.cpuCoreCount = builder.cpuCoreCount;
            this.eniQuantity = builder.eniQuantity;
            this.GPUAmount = builder.GPUAmount;
            this.GPUSpec = builder.GPUSpec;
            this.instanceBandwidthRx = builder.instanceBandwidthRx;
            this.instanceBandwidthTx = builder.instanceBandwidthTx;
            this.instancePpsRx = builder.instancePpsRx;
            this.instancePpsTx = builder.instancePpsTx;
            this.instanceTypeId = builder.instanceTypeId;
            this.memorySize = builder.memorySize;
            this.status = builder.status;
            this.zoneIds = builder.zoneIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypesInfo create() {
            return builder().build();
        }

        /**
         * @return cpuCoreCount
         */
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return eniQuantity
         */
        public Integer getEniQuantity() {
            return this.eniQuantity;
        }

        /**
         * @return GPUAmount
         */
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        /**
         * @return instanceBandwidthRx
         */
        public Integer getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        /**
         * @return instanceBandwidthTx
         */
        public Integer getInstanceBandwidthTx() {
            return this.instanceBandwidthTx;
        }

        /**
         * @return instancePpsRx
         */
        public Integer getInstancePpsRx() {
            return this.instancePpsRx;
        }

        /**
         * @return instancePpsTx
         */
        public Integer getInstancePpsTx() {
            return this.instancePpsTx;
        }

        /**
         * @return instanceTypeId
         */
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return zoneIds
         */
        public ZoneIds getZoneIds() {
            return this.zoneIds;
        }

        public static final class Builder {
            private Integer cpuCoreCount; 
            private Integer eniQuantity; 
            private Integer GPUAmount; 
            private String GPUSpec; 
            private Integer instanceBandwidthRx; 
            private Integer instanceBandwidthTx; 
            private Integer instancePpsRx; 
            private Integer instancePpsTx; 
            private String instanceTypeId; 
            private Integer memorySize; 
            private String status; 
            private ZoneIds zoneIds; 

            private Builder() {
            } 

            private Builder(TypesInfo model) {
                this.cpuCoreCount = model.cpuCoreCount;
                this.eniQuantity = model.eniQuantity;
                this.GPUAmount = model.GPUAmount;
                this.GPUSpec = model.GPUSpec;
                this.instanceBandwidthRx = model.instanceBandwidthRx;
                this.instanceBandwidthTx = model.instanceBandwidthTx;
                this.instancePpsRx = model.instancePpsRx;
                this.instancePpsTx = model.instancePpsTx;
                this.instanceTypeId = model.instanceTypeId;
                this.memorySize = model.memorySize;
                this.status = model.status;
                this.zoneIds = model.zoneIds;
            } 

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * <p>The maximum number of elastic network interfaces (ENIs) that can be bound to an ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder eniQuantity(Integer eniQuantity) {
                this.eniQuantity = eniQuantity;
                return this;
            }

            /**
             * <p>The number of GPUs of an ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * <p>The GPU type of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>NVIDIA V100</p>
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * <p>The maximum inbound internal bandwidth. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10240000</p>
             */
            public Builder instanceBandwidthRx(Integer instanceBandwidthRx) {
                this.instanceBandwidthRx = instanceBandwidthRx;
                return this;
            }

            /**
             * <p>The maximum outbound internal bandwidth. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10240000</p>
             */
            public Builder instanceBandwidthTx(Integer instanceBandwidthTx) {
                this.instanceBandwidthTx = instanceBandwidthTx;
                return this;
            }

            /**
             * <p>The inbound packet forwarding rate over the internal network. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>9000000</p>
             */
            public Builder instancePpsRx(Integer instancePpsRx) {
                this.instancePpsRx = instancePpsRx;
                return this;
            }

            /**
             * <p>The outbound packet forwarding rate over the internal network. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>9000000</p>
             */
            public Builder instancePpsTx(Integer instancePpsTx) {
                this.instancePpsTx = instancePpsTx;
                return this;
            }

            /**
             * <p>The ID of the ECS instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n4.xlarge</p>
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * <p>The memory size of the ECS instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The status of the ECS instance. Valid values:</p>
             * <ul>
             * <li>SoldOut</li>
             * <li>Available</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of zone IDs.</p>
             */
            public Builder zoneIds(ZoneIds zoneIds) {
                this.zoneIds = zoneIds;
                return this;
            }

            public TypesInfo build() {
                return new TypesInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAvailableEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableEcsTypesResponseBody</p>
     */
    public static class Types extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TypesInfo")
        private java.util.List<TypesInfo> typesInfo;

        private Types(Builder builder) {
            this.typesInfo = builder.typesInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Types create() {
            return builder().build();
        }

        /**
         * @return typesInfo
         */
        public java.util.List<TypesInfo> getTypesInfo() {
            return this.typesInfo;
        }

        public static final class Builder {
            private java.util.List<TypesInfo> typesInfo; 

            private Builder() {
            } 

            private Builder(Types model) {
                this.typesInfo = model.typesInfo;
            } 

            /**
             * TypesInfo.
             */
            public Builder typesInfo(java.util.List<TypesInfo> typesInfo) {
                this.typesInfo = typesInfo;
                return this;
            }

            public Types build() {
                return new Types(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAvailableEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableEcsTypesResponseBody</p>
     */
    public static class InstanceTypeFamilyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Generation")
        private String generation;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilyId")
        private String instanceTypeFamilyId;

        @com.aliyun.core.annotation.NameInMap("Types")
        private Types types;

        private InstanceTypeFamilyInfo(Builder builder) {
            this.generation = builder.generation;
            this.instanceTypeFamilyId = builder.instanceTypeFamilyId;
            this.types = builder.types;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamilyInfo create() {
            return builder().build();
        }

        /**
         * @return generation
         */
        public String getGeneration() {
            return this.generation;
        }

        /**
         * @return instanceTypeFamilyId
         */
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        /**
         * @return types
         */
        public Types getTypes() {
            return this.types;
        }

        public static final class Builder {
            private String generation; 
            private String instanceTypeFamilyId; 
            private Types types; 

            private Builder() {
            } 

            private Builder(InstanceTypeFamilyInfo model) {
                this.generation = model.generation;
                this.instanceTypeFamilyId = model.instanceTypeFamilyId;
                this.types = model.types;
            } 

            /**
             * <p>The instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-3</p>
             */
            public Builder generation(String generation) {
                this.generation = generation;
                return this;
            }

            /**
             * <p>The ID of the instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n4</p>
             */
            public Builder instanceTypeFamilyId(String instanceTypeFamilyId) {
                this.instanceTypeFamilyId = instanceTypeFamilyId;
                return this;
            }

            /**
             * <p>The list of instance types.</p>
             */
            public Builder types(Types types) {
                this.types = types;
                return this;
            }

            public InstanceTypeFamilyInfo build() {
                return new InstanceTypeFamilyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAvailableEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableEcsTypesResponseBody</p>
     */
    public static class InstanceTypeFamilies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilyInfo")
        private java.util.List<InstanceTypeFamilyInfo> instanceTypeFamilyInfo;

        private InstanceTypeFamilies(Builder builder) {
            this.instanceTypeFamilyInfo = builder.instanceTypeFamilyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamilyInfo
         */
        public java.util.List<InstanceTypeFamilyInfo> getInstanceTypeFamilyInfo() {
            return this.instanceTypeFamilyInfo;
        }

        public static final class Builder {
            private java.util.List<InstanceTypeFamilyInfo> instanceTypeFamilyInfo; 

            private Builder() {
            } 

            private Builder(InstanceTypeFamilies model) {
                this.instanceTypeFamilyInfo = model.instanceTypeFamilyInfo;
            } 

            /**
             * InstanceTypeFamilyInfo.
             */
            public Builder instanceTypeFamilyInfo(java.util.List<InstanceTypeFamilyInfo> instanceTypeFamilyInfo) {
                this.instanceTypeFamilyInfo = instanceTypeFamilyInfo;
                return this;
            }

            public InstanceTypeFamilies build() {
                return new InstanceTypeFamilies(this);
            } 

        } 

    }
}
