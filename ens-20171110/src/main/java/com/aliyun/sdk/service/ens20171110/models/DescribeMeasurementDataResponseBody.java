// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeasurementDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeasurementDataResponseBody</p>
 */
public class DescribeMeasurementDataResponseBody extends TeaModel {
    @NameInMap("MeasurementDatas")
    private MeasurementDatas measurementDatas;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeasurementDataResponseBody(Builder builder) {
        this.measurementDatas = builder.measurementDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeasurementDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return measurementDatas
     */
    public MeasurementDatas getMeasurementDatas() {
        return this.measurementDatas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MeasurementDatas measurementDatas; 
        private String requestId; 

        /**
         * The metering data returned.
         */
        public Builder measurementDatas(MeasurementDatas measurementDatas) {
            this.measurementDatas = measurementDatas;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeasurementDataResponseBody build() {
            return new DescribeMeasurementDataResponseBody(this);
        } 

    } 

    public static class BandWidthFeeData extends TeaModel {
        @NameInMap("CostCode")
        private String costCode;

        @NameInMap("CostName")
        private String costName;

        @NameInMap("CostVal")
        private Integer costVal;

        private BandWidthFeeData(Builder builder) {
            this.costCode = builder.costCode;
            this.costName = builder.costName;
            this.costVal = builder.costVal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandWidthFeeData create() {
            return builder().build();
        }

        /**
         * @return costCode
         */
        public String getCostCode() {
            return this.costCode;
        }

        /**
         * @return costName
         */
        public String getCostName() {
            return this.costName;
        }

        /**
         * @return costVal
         */
        public Integer getCostVal() {
            return this.costVal;
        }

        public static final class Builder {
            private String costCode; 
            private String costName; 
            private Integer costVal; 

            /**
             * The code of the bandwidth plan.
             */
            public Builder costCode(String costCode) {
                this.costCode = costCode;
                return this;
            }

            /**
             * The name of the bandwidth plan.
             */
            public Builder costName(String costName) {
                this.costName = costName;
                return this;
            }

            /**
             * The bandwidth consumption. Unit: bit/second.
             */
            public Builder costVal(Integer costVal) {
                this.costVal = costVal;
                return this;
            }

            public BandWidthFeeData build() {
                return new BandWidthFeeData(this);
            } 

        } 

    }
    public static class BandWidthFeeDatas extends TeaModel {
        @NameInMap("BandWidthFeeData")
        private java.util.List < BandWidthFeeData> bandWidthFeeData;

        private BandWidthFeeDatas(Builder builder) {
            this.bandWidthFeeData = builder.bandWidthFeeData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandWidthFeeDatas create() {
            return builder().build();
        }

        /**
         * @return bandWidthFeeData
         */
        public java.util.List < BandWidthFeeData> getBandWidthFeeData() {
            return this.bandWidthFeeData;
        }

        public static final class Builder {
            private java.util.List < BandWidthFeeData> bandWidthFeeData; 

            /**
             * BandWidthFeeData.
             */
            public Builder bandWidthFeeData(java.util.List < BandWidthFeeData> bandWidthFeeData) {
                this.bandWidthFeeData = bandWidthFeeData;
                return this;
            }

            public BandWidthFeeDatas build() {
                return new BandWidthFeeDatas(this);
            } 

        } 

    }
    public static class ResourceFeeData extends TeaModel {
        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("Storage")
        private Integer storage;

        @NameInMap("Vcpu")
        private Integer vcpu;

        private ResourceFeeData(Builder builder) {
            this.memory = builder.memory;
            this.storage = builder.storage;
            this.vcpu = builder.vcpu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceFeeData create() {
            return builder().build();
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        /**
         * @return vcpu
         */
        public Integer getVcpu() {
            return this.vcpu;
        }

        public static final class Builder {
            private Integer memory; 
            private Integer storage; 
            private Integer vcpu; 

            /**
             * The memory size. Unit: GB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The storage capacity. Unit: GB.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * The number of vCPUs.
             */
            public Builder vcpu(Integer vcpu) {
                this.vcpu = vcpu;
                return this;
            }

            public ResourceFeeData build() {
                return new ResourceFeeData(this);
            } 

        } 

    }
    public static class ResourceFeeDataDetail extends TeaModel {
        @NameInMap("CostCode")
        private String costCode;

        @NameInMap("CostName")
        private String costName;

        @NameInMap("CostVal")
        private Integer costVal;

        @NameInMap("ResourceType")
        private String resourceType;

        private ResourceFeeDataDetail(Builder builder) {
            this.costCode = builder.costCode;
            this.costName = builder.costName;
            this.costVal = builder.costVal;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceFeeDataDetail create() {
            return builder().build();
        }

        /**
         * @return costCode
         */
        public String getCostCode() {
            return this.costCode;
        }

        /**
         * @return costName
         */
        public String getCostName() {
            return this.costName;
        }

        /**
         * @return costVal
         */
        public Integer getCostVal() {
            return this.costVal;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String costCode; 
            private String costName; 
            private Integer costVal; 
            private String resourceType; 

            /**
             * The code of the resource.
             */
            public Builder costCode(String costCode) {
                this.costCode = costCode;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder costName(String costName) {
                this.costName = costName;
                return this;
            }

            /**
             * The consumption of the resource.
             * <p>
             * 
             * *   Memory unit: GB.
             * *   CPU unit: vCPU.
             * *   Storage unit: GB.
             */
            public Builder costVal(Integer costVal) {
                this.costVal = costVal;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceFeeDataDetail build() {
                return new ResourceFeeDataDetail(this);
            } 

        } 

    }
    public static class ResourceFeeDataDetails extends TeaModel {
        @NameInMap("ResourceFeeDataDetail")
        private java.util.List < ResourceFeeDataDetail> resourceFeeDataDetail;

        private ResourceFeeDataDetails(Builder builder) {
            this.resourceFeeDataDetail = builder.resourceFeeDataDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceFeeDataDetails create() {
            return builder().build();
        }

        /**
         * @return resourceFeeDataDetail
         */
        public java.util.List < ResourceFeeDataDetail> getResourceFeeDataDetail() {
            return this.resourceFeeDataDetail;
        }

        public static final class Builder {
            private java.util.List < ResourceFeeDataDetail> resourceFeeDataDetail; 

            /**
             * ResourceFeeDataDetail.
             */
            public Builder resourceFeeDataDetail(java.util.List < ResourceFeeDataDetail> resourceFeeDataDetail) {
                this.resourceFeeDataDetail = resourceFeeDataDetail;
                return this;
            }

            public ResourceFeeDataDetails build() {
                return new ResourceFeeDataDetails(this);
            } 

        } 

    }
    public static class MeasurementData extends TeaModel {
        @NameInMap("BandWidthFeeDatas")
        private BandWidthFeeDatas bandWidthFeeDatas;

        @NameInMap("ChargeModel")
        private String chargeModel;

        @NameInMap("CostCycle")
        private String costCycle;

        @NameInMap("CostEndTime")
        private String costEndTime;

        @NameInMap("CostStartTime")
        private String costStartTime;

        @NameInMap("ResourceFeeData")
        private ResourceFeeData resourceFeeData;

        @NameInMap("ResourceFeeDataDetails")
        private ResourceFeeDataDetails resourceFeeDataDetails;

        private MeasurementData(Builder builder) {
            this.bandWidthFeeDatas = builder.bandWidthFeeDatas;
            this.chargeModel = builder.chargeModel;
            this.costCycle = builder.costCycle;
            this.costEndTime = builder.costEndTime;
            this.costStartTime = builder.costStartTime;
            this.resourceFeeData = builder.resourceFeeData;
            this.resourceFeeDataDetails = builder.resourceFeeDataDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeasurementData create() {
            return builder().build();
        }

        /**
         * @return bandWidthFeeDatas
         */
        public BandWidthFeeDatas getBandWidthFeeDatas() {
            return this.bandWidthFeeDatas;
        }

        /**
         * @return chargeModel
         */
        public String getChargeModel() {
            return this.chargeModel;
        }

        /**
         * @return costCycle
         */
        public String getCostCycle() {
            return this.costCycle;
        }

        /**
         * @return costEndTime
         */
        public String getCostEndTime() {
            return this.costEndTime;
        }

        /**
         * @return costStartTime
         */
        public String getCostStartTime() {
            return this.costStartTime;
        }

        /**
         * @return resourceFeeData
         */
        public ResourceFeeData getResourceFeeData() {
            return this.resourceFeeData;
        }

        /**
         * @return resourceFeeDataDetails
         */
        public ResourceFeeDataDetails getResourceFeeDataDetails() {
            return this.resourceFeeDataDetails;
        }

        public static final class Builder {
            private BandWidthFeeDatas bandWidthFeeDatas; 
            private String chargeModel; 
            private String costCycle; 
            private String costEndTime; 
            private String costStartTime; 
            private ResourceFeeData resourceFeeData; 
            private ResourceFeeDataDetails resourceFeeDataDetails; 

            /**
             * The bandwidth data returned.
             */
            public Builder bandWidthFeeDatas(BandWidthFeeDatas bandWidthFeeDatas) {
                this.bandWidthFeeDatas = bandWidthFeeDatas;
                return this;
            }

            /**
             * The metering method. Valid values:
             * <p>
             * 
             * *   ChargeByUnified: unified metering.
             * *   ChargeByGrade: differential metering.
             */
            public Builder chargeModel(String chargeModel) {
                this.chargeModel = chargeModel;
                return this;
            }

            /**
             * The metering cycle.
             */
            public Builder costCycle(String costCycle) {
                this.costCycle = costCycle;
                return this;
            }

            /**
             * The end time of the metering cycle.
             */
            public Builder costEndTime(String costEndTime) {
                this.costEndTime = costEndTime;
                return this;
            }

            /**
             * The start time of the metering cycle.
             */
            public Builder costStartTime(String costStartTime) {
                this.costStartTime = costStartTime;
                return this;
            }

            /**
             * The information about computing resources.
             */
            public Builder resourceFeeData(ResourceFeeData resourceFeeData) {
                this.resourceFeeData = resourceFeeData;
                return this;
            }

            /**
             * Details of the computing resources.
             */
            public Builder resourceFeeDataDetails(ResourceFeeDataDetails resourceFeeDataDetails) {
                this.resourceFeeDataDetails = resourceFeeDataDetails;
                return this;
            }

            public MeasurementData build() {
                return new MeasurementData(this);
            } 

        } 

    }
    public static class MeasurementDatas extends TeaModel {
        @NameInMap("MeasurementData")
        private java.util.List < MeasurementData> measurementData;

        private MeasurementDatas(Builder builder) {
            this.measurementData = builder.measurementData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeasurementDatas create() {
            return builder().build();
        }

        /**
         * @return measurementData
         */
        public java.util.List < MeasurementData> getMeasurementData() {
            return this.measurementData;
        }

        public static final class Builder {
            private java.util.List < MeasurementData> measurementData; 

            /**
             * MeasurementData.
             */
            public Builder measurementData(java.util.List < MeasurementData> measurementData) {
                this.measurementData = measurementData;
                return this;
            }

            public MeasurementDatas build() {
                return new MeasurementDatas(this);
            } 

        } 

    }
}
