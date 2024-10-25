// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMeasurementDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeasurementDataResponseBody</p>
 */
public class DescribeMeasurementDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MeasurementDatas")
    private MeasurementDatas measurementDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The metering data returned.</p>
         */
        public Builder measurementDatas(MeasurementDatas measurementDatas) {
            this.measurementDatas = measurementDatas;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeasurementDataResponseBody build() {
            return new DescribeMeasurementDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeasurementDataResponseBody</p>
     */
    public static class BandWidthFeeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostCode")
        private String costCode;

        @com.aliyun.core.annotation.NameInMap("CostName")
        private String costName;

        @com.aliyun.core.annotation.NameInMap("CostVal")
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
             * <p>The code of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-cmcc-1</p>
             */
            public Builder costCode(String costCode) {
                this.costCode = costCode;
                return this;
            }

            /**
             * <p>The name of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing, Shanghai, and Guangzhou Mobile</p>
             */
            public Builder costName(String costName) {
                this.costName = costName;
                return this;
            }

            /**
             * <p>The bandwidth consumption. Unit: bit/second.</p>
             * 
             * <strong>example:</strong>
             * <p>16486</p>
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
    /**
     * 
     * {@link DescribeMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeasurementDataResponseBody</p>
     */
    public static class BandWidthFeeDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidthFeeData")
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
    /**
     * 
     * {@link DescribeMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeasurementDataResponseBody</p>
     */
    public static class ResourceFeeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private Integer storage;

        @com.aliyun.core.annotation.NameInMap("Vcpu")
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
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The storage capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
    /**
     * 
     * {@link DescribeMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeasurementDataResponseBody</p>
     */
    public static class ResourceFeeDataDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostCode")
        private String costCode;

        @com.aliyun.core.annotation.NameInMap("CostName")
        private String costName;

        @com.aliyun.core.annotation.NameInMap("CostVal")
        private Integer costVal;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
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
             * <p>The code of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vCPU</p>
             */
            public Builder costCode(String costCode) {
                this.costCode = costCode;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vCPU</p>
             */
            public Builder costName(String costName) {
                this.costName = costName;
                return this;
            }

            /**
             * <p>The consumption of the resource.</p>
             * <ul>
             * <li>Memory unit: GB.</li>
             * <li>CPU unit: vCPU.</li>
             * <li>Storage unit: GB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder costVal(Integer costVal) {
                this.costVal = costVal;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vCPU</p>
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
    /**
     * 
     * {@link DescribeMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeasurementDataResponseBody</p>
     */
    public static class ResourceFeeDataDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceFeeDataDetail")
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
    /**
     * 
     * {@link DescribeMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeasurementDataResponseBody</p>
     */
    public static class MeasurementData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidthFeeDatas")
        private BandWidthFeeDatas bandWidthFeeDatas;

        @com.aliyun.core.annotation.NameInMap("ChargeModel")
        private String chargeModel;

        @com.aliyun.core.annotation.NameInMap("CostCycle")
        private String costCycle;

        @com.aliyun.core.annotation.NameInMap("CostEndTime")
        private String costEndTime;

        @com.aliyun.core.annotation.NameInMap("CostStartTime")
        private String costStartTime;

        @com.aliyun.core.annotation.NameInMap("ResourceFeeData")
        private ResourceFeeData resourceFeeData;

        @com.aliyun.core.annotation.NameInMap("ResourceFeeDataDetails")
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
             * <p>The bandwidth data returned.</p>
             */
            public Builder bandWidthFeeDatas(BandWidthFeeDatas bandWidthFeeDatas) {
                this.bandWidthFeeDatas = bandWidthFeeDatas;
                return this;
            }

            /**
             * <p>The metering method. Valid values:</p>
             * <ul>
             * <li>ChargeByUnified: unified metering.</li>
             * <li>ChargeByGrade: differential metering.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ChargeByGrade</p>
             */
            public Builder chargeModel(String chargeModel) {
                this.chargeModel = chargeModel;
                return this;
            }

            /**
             * <p>The metering cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30</p>
             */
            public Builder costCycle(String costCycle) {
                this.costCycle = costCycle;
                return this;
            }

            /**
             * <p>The end time of the metering cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-30T16:00:00Z</p>
             */
            public Builder costEndTime(String costEndTime) {
                this.costEndTime = costEndTime;
                return this;
            }

            /**
             * <p>The start time of the metering cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-29T16:00:00Z</p>
             */
            public Builder costStartTime(String costStartTime) {
                this.costStartTime = costStartTime;
                return this;
            }

            /**
             * <p>The information about computing resources.</p>
             */
            public Builder resourceFeeData(ResourceFeeData resourceFeeData) {
                this.resourceFeeData = resourceFeeData;
                return this;
            }

            /**
             * <p>Details of the computing resources.</p>
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
    /**
     * 
     * {@link DescribeMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeasurementDataResponseBody</p>
     */
    public static class MeasurementDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MeasurementData")
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
