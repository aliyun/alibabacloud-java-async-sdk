// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableEcsTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableEcsTypesResponseBody</p>
 */
public class ListAvailableEcsTypesResponseBody extends TeaModel {
    @NameInMap("InstanceTypeFamilies")
    private InstanceTypeFamilies instanceTypeFamilies;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportSpotInstance")
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

        /**
         * The instance family to which the instance type belongs.
         */
        public Builder instanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
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
         * Specifies whether preemptible instances are supported. Valid values:
         * <p>
         * 
         * *   false: not supported
         * *   true: supported
         */
        public Builder supportSpotInstance(Boolean supportSpotInstance) {
            this.supportSpotInstance = supportSpotInstance;
            return this;
        }

        public ListAvailableEcsTypesResponseBody build() {
            return new ListAvailableEcsTypesResponseBody(this);
        } 

    } 

    public static class ZoneIds extends TeaModel {
        @NameInMap("ZoneId")
        private java.util.List < String > zoneId;

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
        public java.util.List < String > getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List < String > zoneId; 

            /**
             * ZoneId.
             */
            public Builder zoneId(java.util.List < String > zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneIds build() {
                return new ZoneIds(this);
            } 

        } 

    }
    public static class TypesInfo extends TeaModel {
        @NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @NameInMap("EniQuantity")
        private Integer eniQuantity;

        @NameInMap("GPUAmount")
        private Integer GPUAmount;

        @NameInMap("GPUSpec")
        private String GPUSpec;

        @NameInMap("InstanceBandwidthRx")
        private Integer instanceBandwidthRx;

        @NameInMap("InstanceBandwidthTx")
        private Integer instanceBandwidthTx;

        @NameInMap("InstancePpsRx")
        private Integer instancePpsRx;

        @NameInMap("InstancePpsTx")
        private Integer instancePpsTx;

        @NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @NameInMap("MemorySize")
        private Integer memorySize;

        @NameInMap("Status")
        private String status;

        @NameInMap("ZoneIds")
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

            /**
             * The number of vCPUs.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * The maximum number of elastic network interfaces (ENIs) that can be bound to an ECS instance.
             */
            public Builder eniQuantity(Integer eniQuantity) {
                this.eniQuantity = eniQuantity;
                return this;
            }

            /**
             * The number of GPUs of an ECS instance.
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * The GPU type of the ECS instance.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * The maximum inbound internal bandwidth. Unit: Kbit/s.
             */
            public Builder instanceBandwidthRx(Integer instanceBandwidthRx) {
                this.instanceBandwidthRx = instanceBandwidthRx;
                return this;
            }

            /**
             * The maximum outbound internal bandwidth. Unit: Kbit/s.
             */
            public Builder instanceBandwidthTx(Integer instanceBandwidthTx) {
                this.instanceBandwidthTx = instanceBandwidthTx;
                return this;
            }

            /**
             * The inbound packet forwarding rate over the internal network. Unit: pps
             */
            public Builder instancePpsRx(Integer instancePpsRx) {
                this.instancePpsRx = instancePpsRx;
                return this;
            }

            /**
             * The outbound packet forwarding rate over the internal network. Unit: pps
             */
            public Builder instancePpsTx(Integer instancePpsTx) {
                this.instancePpsTx = instancePpsTx;
                return this;
            }

            /**
             * The ID of the ECS instance type.
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * The memory size of the ECS instance. Unit: GiB
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * The status of the ECS instance. Valid values:
             * <p>
             * 
             * *   SoldOut
             * *   Available
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The list of zone IDs.
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
    public static class Types extends TeaModel {
        @NameInMap("TypesInfo")
        private java.util.List < TypesInfo> typesInfo;

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
        public java.util.List < TypesInfo> getTypesInfo() {
            return this.typesInfo;
        }

        public static final class Builder {
            private java.util.List < TypesInfo> typesInfo; 

            /**
             * TypesInfo.
             */
            public Builder typesInfo(java.util.List < TypesInfo> typesInfo) {
                this.typesInfo = typesInfo;
                return this;
            }

            public Types build() {
                return new Types(this);
            } 

        } 

    }
    public static class InstanceTypeFamilyInfo extends TeaModel {
        @NameInMap("Generation")
        private String generation;

        @NameInMap("InstanceTypeFamilyId")
        private String instanceTypeFamilyId;

        @NameInMap("Types")
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

            /**
             * The instance family.
             */
            public Builder generation(String generation) {
                this.generation = generation;
                return this;
            }

            /**
             * The ID of the instance family. For more information, see [Instance families](~~25378~~).
             */
            public Builder instanceTypeFamilyId(String instanceTypeFamilyId) {
                this.instanceTypeFamilyId = instanceTypeFamilyId;
                return this;
            }

            /**
             * The list of instance types.
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
    public static class InstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamilyInfo")
        private java.util.List < InstanceTypeFamilyInfo> instanceTypeFamilyInfo;

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
        public java.util.List < InstanceTypeFamilyInfo> getInstanceTypeFamilyInfo() {
            return this.instanceTypeFamilyInfo;
        }

        public static final class Builder {
            private java.util.List < InstanceTypeFamilyInfo> instanceTypeFamilyInfo; 

            /**
             * InstanceTypeFamilyInfo.
             */
            public Builder instanceTypeFamilyInfo(java.util.List < InstanceTypeFamilyInfo> instanceTypeFamilyInfo) {
                this.instanceTypeFamilyInfo = instanceTypeFamilyInfo;
                return this;
            }

            public InstanceTypeFamilies build() {
                return new InstanceTypeFamilies(this);
            } 

        } 

    }
}
