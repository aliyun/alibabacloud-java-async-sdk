// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEmrAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListEmrAvailableResourceResponseBody</p>
 */
public class ListEmrAvailableResourceResponseBody extends TeaModel {
    @NameInMap("EmrZoneInfoList")
    private EmrZoneInfoList emrZoneInfoList;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    private ListEmrAvailableResourceResponseBody(Builder builder) {
        this.emrZoneInfoList = builder.emrZoneInfoList;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEmrAvailableResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return emrZoneInfoList
     */
    public EmrZoneInfoList getEmrZoneInfoList() {
        return this.emrZoneInfoList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EmrZoneInfoList emrZoneInfoList; 
        private String regionId; 
        private String requestId; 

        /**
         * EmrZoneInfoList.
         */
        public Builder emrZoneInfoList(EmrZoneInfoList emrZoneInfoList) {
            this.emrZoneInfoList = emrZoneInfoList;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEmrAvailableResourceResponseBody build() {
            return new ListEmrAvailableResourceResponseBody(this);
        } 

    } 

    public static class EmrInstanceType extends TeaModel {
        @NameInMap("BaselineCredit")
        private Integer baselineCredit;

        @NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @NameInMap("EniQuantity")
        private Integer eniQuantity;

        @NameInMap("GPUAmount")
        private Integer GPUAmount;

        @NameInMap("GPUSpec")
        private String GPUSpec;

        @NameInMap("InitialCredit")
        private Integer initialCredit;

        @NameInMap("InstanceBandwidthRx")
        private Integer instanceBandwidthRx;

        @NameInMap("InstanceBandwidthTx")
        private Integer instanceBandwidthTx;

        @NameInMap("InstancePpsRx")
        private Long instancePpsRx;

        @NameInMap("InstancePpsTx")
        private Long instancePpsTx;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("LocalStorageAmount")
        private Integer localStorageAmount;

        @NameInMap("LocalStorageCapacity")
        private Long localStorageCapacity;

        @NameInMap("LocalStorageCategory")
        private String localStorageCategory;

        @NameInMap("MemorySize")
        private Integer memorySize;

        private EmrInstanceType(Builder builder) {
            this.baselineCredit = builder.baselineCredit;
            this.cpuCoreCount = builder.cpuCoreCount;
            this.eniQuantity = builder.eniQuantity;
            this.GPUAmount = builder.GPUAmount;
            this.GPUSpec = builder.GPUSpec;
            this.initialCredit = builder.initialCredit;
            this.instanceBandwidthRx = builder.instanceBandwidthRx;
            this.instanceBandwidthTx = builder.instanceBandwidthTx;
            this.instancePpsRx = builder.instancePpsRx;
            this.instancePpsTx = builder.instancePpsTx;
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.localStorageAmount = builder.localStorageAmount;
            this.localStorageCapacity = builder.localStorageCapacity;
            this.localStorageCategory = builder.localStorageCategory;
            this.memorySize = builder.memorySize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmrInstanceType create() {
            return builder().build();
        }

        /**
         * @return baselineCredit
         */
        public Integer getBaselineCredit() {
            return this.baselineCredit;
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
         * @return initialCredit
         */
        public Integer getInitialCredit() {
            return this.initialCredit;
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
        public Long getInstancePpsRx() {
            return this.instancePpsRx;
        }

        /**
         * @return instancePpsTx
         */
        public Long getInstancePpsTx() {
            return this.instancePpsTx;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return localStorageAmount
         */
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        /**
         * @return localStorageCapacity
         */
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        /**
         * @return localStorageCategory
         */
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public static final class Builder {
            private Integer baselineCredit; 
            private Integer cpuCoreCount; 
            private Integer eniQuantity; 
            private Integer GPUAmount; 
            private String GPUSpec; 
            private Integer initialCredit; 
            private Integer instanceBandwidthRx; 
            private Integer instanceBandwidthTx; 
            private Long instancePpsRx; 
            private Long instancePpsTx; 
            private String instanceType; 
            private String instanceTypeFamily; 
            private Integer localStorageAmount; 
            private Long localStorageCapacity; 
            private String localStorageCategory; 
            private Integer memorySize; 

            /**
             * BaselineCredit.
             */
            public Builder baselineCredit(Integer baselineCredit) {
                this.baselineCredit = baselineCredit;
                return this;
            }

            /**
             * CpuCoreCount.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * EniQuantity.
             */
            public Builder eniQuantity(Integer eniQuantity) {
                this.eniQuantity = eniQuantity;
                return this;
            }

            /**
             * GPUAmount.
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * GPUSpec.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * InitialCredit.
             */
            public Builder initialCredit(Integer initialCredit) {
                this.initialCredit = initialCredit;
                return this;
            }

            /**
             * InstanceBandwidthRx.
             */
            public Builder instanceBandwidthRx(Integer instanceBandwidthRx) {
                this.instanceBandwidthRx = instanceBandwidthRx;
                return this;
            }

            /**
             * InstanceBandwidthTx.
             */
            public Builder instanceBandwidthTx(Integer instanceBandwidthTx) {
                this.instanceBandwidthTx = instanceBandwidthTx;
                return this;
            }

            /**
             * InstancePpsRx.
             */
            public Builder instancePpsRx(Long instancePpsRx) {
                this.instancePpsRx = instancePpsRx;
                return this;
            }

            /**
             * InstancePpsTx.
             */
            public Builder instancePpsTx(Long instancePpsTx) {
                this.instancePpsTx = instancePpsTx;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * LocalStorageAmount.
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * LocalStorageCapacity.
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * LocalStorageCategory.
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            public EmrInstanceType build() {
                return new EmrInstanceType(this);
            } 

        } 

    }
    public static class SupportNodeTypeList extends TeaModel {
        @NameInMap("SupportNodeType")
        private java.util.List < String > supportNodeType;

        private SupportNodeTypeList(Builder builder) {
            this.supportNodeType = builder.supportNodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportNodeTypeList create() {
            return builder().build();
        }

        /**
         * @return supportNodeType
         */
        public java.util.List < String > getSupportNodeType() {
            return this.supportNodeType;
        }

        public static final class Builder {
            private java.util.List < String > supportNodeType; 

            /**
             * SupportNodeType.
             */
            public Builder supportNodeType(java.util.List < String > supportNodeType) {
                this.supportNodeType = supportNodeType;
                return this;
            }

            public SupportNodeTypeList build() {
                return new SupportNodeTypeList(this);
            } 

        } 

    }
    public static class SupportedResource extends TeaModel {
        @NameInMap("EmrInstanceType")
        private EmrInstanceType emrInstanceType;

        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
        private Integer min;

        @NameInMap("SupportNodeTypeList")
        private SupportNodeTypeList supportNodeTypeList;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private String value;

        private SupportedResource(Builder builder) {
            this.emrInstanceType = builder.emrInstanceType;
            this.max = builder.max;
            this.min = builder.min;
            this.supportNodeTypeList = builder.supportNodeTypeList;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResource create() {
            return builder().build();
        }

        /**
         * @return emrInstanceType
         */
        public EmrInstanceType getEmrInstanceType() {
            return this.emrInstanceType;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return supportNodeTypeList
         */
        public SupportNodeTypeList getSupportNodeTypeList() {
            return this.supportNodeTypeList;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private EmrInstanceType emrInstanceType; 
            private Integer max; 
            private Integer min; 
            private SupportNodeTypeList supportNodeTypeList; 
            private String unit; 
            private String value; 

            /**
             * EmrInstanceType.
             */
            public Builder emrInstanceType(EmrInstanceType emrInstanceType) {
                this.emrInstanceType = emrInstanceType;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * SupportNodeTypeList.
             */
            public Builder supportNodeTypeList(SupportNodeTypeList supportNodeTypeList) {
                this.supportNodeTypeList = supportNodeTypeList;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SupportedResource build() {
                return new SupportedResource(this);
            } 

        } 

    }
    public static class SupportedResourceList extends TeaModel {
        @NameInMap("SupportedResource")
        private java.util.List < SupportedResource> supportedResource;

        private SupportedResourceList(Builder builder) {
            this.supportedResource = builder.supportedResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResourceList create() {
            return builder().build();
        }

        /**
         * @return supportedResource
         */
        public java.util.List < SupportedResource> getSupportedResource() {
            return this.supportedResource;
        }

        public static final class Builder {
            private java.util.List < SupportedResource> supportedResource; 

            /**
             * SupportedResource.
             */
            public Builder supportedResource(java.util.List < SupportedResource> supportedResource) {
                this.supportedResource = supportedResource;
                return this;
            }

            public SupportedResourceList build() {
                return new SupportedResourceList(this);
            } 

        } 

    }
    public static class EmrResourceInfo extends TeaModel {
        @NameInMap("SupportedResourceList")
        private SupportedResourceList supportedResourceList;

        @NameInMap("Type")
        private String type;

        private EmrResourceInfo(Builder builder) {
            this.supportedResourceList = builder.supportedResourceList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmrResourceInfo create() {
            return builder().build();
        }

        /**
         * @return supportedResourceList
         */
        public SupportedResourceList getSupportedResourceList() {
            return this.supportedResourceList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private SupportedResourceList supportedResourceList; 
            private String type; 

            /**
             * SupportedResourceList.
             */
            public Builder supportedResourceList(SupportedResourceList supportedResourceList) {
                this.supportedResourceList = supportedResourceList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EmrResourceInfo build() {
                return new EmrResourceInfo(this);
            } 

        } 

    }
    public static class EmrResourceInfoList extends TeaModel {
        @NameInMap("EmrResourceInfo")
        private java.util.List < EmrResourceInfo> emrResourceInfo;

        private EmrResourceInfoList(Builder builder) {
            this.emrResourceInfo = builder.emrResourceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmrResourceInfoList create() {
            return builder().build();
        }

        /**
         * @return emrResourceInfo
         */
        public java.util.List < EmrResourceInfo> getEmrResourceInfo() {
            return this.emrResourceInfo;
        }

        public static final class Builder {
            private java.util.List < EmrResourceInfo> emrResourceInfo; 

            /**
             * EmrResourceInfo.
             */
            public Builder emrResourceInfo(java.util.List < EmrResourceInfo> emrResourceInfo) {
                this.emrResourceInfo = emrResourceInfo;
                return this;
            }

            public EmrResourceInfoList build() {
                return new EmrResourceInfoList(this);
            } 

        } 

    }
    public static class EmrZoneInfo extends TeaModel {
        @NameInMap("EmrResourceInfoList")
        private EmrResourceInfoList emrResourceInfoList;

        @NameInMap("ZoneId")
        private String zoneId;

        private EmrZoneInfo(Builder builder) {
            this.emrResourceInfoList = builder.emrResourceInfoList;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmrZoneInfo create() {
            return builder().build();
        }

        /**
         * @return emrResourceInfoList
         */
        public EmrResourceInfoList getEmrResourceInfoList() {
            return this.emrResourceInfoList;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private EmrResourceInfoList emrResourceInfoList; 
            private String zoneId; 

            /**
             * EmrResourceInfoList.
             */
            public Builder emrResourceInfoList(EmrResourceInfoList emrResourceInfoList) {
                this.emrResourceInfoList = emrResourceInfoList;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public EmrZoneInfo build() {
                return new EmrZoneInfo(this);
            } 

        } 

    }
    public static class EmrZoneInfoList extends TeaModel {
        @NameInMap("EmrZoneInfo")
        private java.util.List < EmrZoneInfo> emrZoneInfo;

        private EmrZoneInfoList(Builder builder) {
            this.emrZoneInfo = builder.emrZoneInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmrZoneInfoList create() {
            return builder().build();
        }

        /**
         * @return emrZoneInfo
         */
        public java.util.List < EmrZoneInfo> getEmrZoneInfo() {
            return this.emrZoneInfo;
        }

        public static final class Builder {
            private java.util.List < EmrZoneInfo> emrZoneInfo; 

            /**
             * EmrZoneInfo.
             */
            public Builder emrZoneInfo(java.util.List < EmrZoneInfo> emrZoneInfo) {
                this.emrZoneInfo = emrZoneInfo;
                return this;
            }

            public EmrZoneInfoList build() {
                return new EmrZoneInfoList(this);
            } 

        } 

    }
}
