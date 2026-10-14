// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeMeasurementDataResponseBody model) {
            this.measurementDatas = model.measurementDatas;
            this.requestId = model.requestId;
        } 

        /**
         * MeasurementDatas.
         */
        public Builder measurementDatas(MeasurementDatas measurementDatas) {
            this.measurementDatas = measurementDatas;
            return this;
        }

        /**
         * <p>The request ID.</p>
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

            private Builder() {
            } 

            private Builder(BandWidthFeeData model) {
                this.costCode = model.costCode;
                this.costName = model.costName;
                this.costVal = model.costVal;
            } 

            /**
             * CostCode.
             */
            public Builder costCode(String costCode) {
                this.costCode = costCode;
                return this;
            }

            /**
             * CostName.
             */
            public Builder costName(String costName) {
                this.costName = costName;
                return this;
            }

            /**
             * CostVal.
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
        private java.util.List<BandWidthFeeData> bandWidthFeeData;

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
        public java.util.List<BandWidthFeeData> getBandWidthFeeData() {
            return this.bandWidthFeeData;
        }

        public static final class Builder {
            private java.util.List<BandWidthFeeData> bandWidthFeeData; 

            private Builder() {
            } 

            private Builder(BandWidthFeeDatas model) {
                this.bandWidthFeeData = model.bandWidthFeeData;
            } 

            /**
             * BandWidthFeeData.
             */
            public Builder bandWidthFeeData(java.util.List<BandWidthFeeData> bandWidthFeeData) {
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

            private Builder() {
            } 

            private Builder(ResourceFeeData model) {
                this.memory = model.memory;
                this.storage = model.storage;
                this.vcpu = model.vcpu;
            } 

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Storage.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * Vcpu.
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

            private Builder() {
            } 

            private Builder(ResourceFeeDataDetail model) {
                this.costCode = model.costCode;
                this.costName = model.costName;
                this.costVal = model.costVal;
                this.resourceType = model.resourceType;
            } 

            /**
             * CostCode.
             */
            public Builder costCode(String costCode) {
                this.costCode = costCode;
                return this;
            }

            /**
             * CostName.
             */
            public Builder costName(String costName) {
                this.costName = costName;
                return this;
            }

            /**
             * CostVal.
             */
            public Builder costVal(Integer costVal) {
                this.costVal = costVal;
                return this;
            }

            /**
             * ResourceType.
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
        private java.util.List<ResourceFeeDataDetail> resourceFeeDataDetail;

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
        public java.util.List<ResourceFeeDataDetail> getResourceFeeDataDetail() {
            return this.resourceFeeDataDetail;
        }

        public static final class Builder {
            private java.util.List<ResourceFeeDataDetail> resourceFeeDataDetail; 

            private Builder() {
            } 

            private Builder(ResourceFeeDataDetails model) {
                this.resourceFeeDataDetail = model.resourceFeeDataDetail;
            } 

            /**
             * ResourceFeeDataDetail.
             */
            public Builder resourceFeeDataDetail(java.util.List<ResourceFeeDataDetail> resourceFeeDataDetail) {
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

            private Builder() {
            } 

            private Builder(MeasurementData model) {
                this.bandWidthFeeDatas = model.bandWidthFeeDatas;
                this.chargeModel = model.chargeModel;
                this.costCycle = model.costCycle;
                this.costEndTime = model.costEndTime;
                this.costStartTime = model.costStartTime;
                this.resourceFeeData = model.resourceFeeData;
                this.resourceFeeDataDetails = model.resourceFeeDataDetails;
            } 

            /**
             * BandWidthFeeDatas.
             */
            public Builder bandWidthFeeDatas(BandWidthFeeDatas bandWidthFeeDatas) {
                this.bandWidthFeeDatas = bandWidthFeeDatas;
                return this;
            }

            /**
             * ChargeModel.
             */
            public Builder chargeModel(String chargeModel) {
                this.chargeModel = chargeModel;
                return this;
            }

            /**
             * CostCycle.
             */
            public Builder costCycle(String costCycle) {
                this.costCycle = costCycle;
                return this;
            }

            /**
             * CostEndTime.
             */
            public Builder costEndTime(String costEndTime) {
                this.costEndTime = costEndTime;
                return this;
            }

            /**
             * CostStartTime.
             */
            public Builder costStartTime(String costStartTime) {
                this.costStartTime = costStartTime;
                return this;
            }

            /**
             * ResourceFeeData.
             */
            public Builder resourceFeeData(ResourceFeeData resourceFeeData) {
                this.resourceFeeData = resourceFeeData;
                return this;
            }

            /**
             * ResourceFeeDataDetails.
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
        private java.util.List<MeasurementData> measurementData;

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
        public java.util.List<MeasurementData> getMeasurementData() {
            return this.measurementData;
        }

        public static final class Builder {
            private java.util.List<MeasurementData> measurementData; 

            private Builder() {
            } 

            private Builder(MeasurementDatas model) {
                this.measurementData = model.measurementData;
            } 

            /**
             * MeasurementData.
             */
            public Builder measurementData(java.util.List<MeasurementData> measurementData) {
                this.measurementData = measurementData;
                return this;
            }

            public MeasurementDatas build() {
                return new MeasurementDatas(this);
            } 

        } 

    }
}
