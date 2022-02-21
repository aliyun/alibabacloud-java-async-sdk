// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnMeasurementDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEpnMeasurementDataResponseBody</p>
 */
public class DescribeEpnMeasurementDataResponseBody extends TeaModel {
    @NameInMap("MeasurementDatas")
    private MeasurementDatas measurementDatas;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEpnMeasurementDataResponseBody(Builder builder) {
        this.measurementDatas = builder.measurementDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnMeasurementDataResponseBody create() {
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
         * MeasurementDatas.
         */
        public Builder measurementDatas(MeasurementDatas measurementDatas) {
            this.measurementDatas = measurementDatas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEpnMeasurementDataResponseBody build() {
            return new DescribeEpnMeasurementDataResponseBody(this);
        } 

    } 

    public static class BandWidthFeeData extends TeaModel {
        @NameInMap("CostCode")
        private String costCode;

        @NameInMap("CostName")
        private String costName;

        @NameInMap("CostType")
        private String costType;

        @NameInMap("CostVal")
        private Integer costVal;

        @NameInMap("IspLine")
        private String ispLine;

        private BandWidthFeeData(Builder builder) {
            this.costCode = builder.costCode;
            this.costName = builder.costName;
            this.costType = builder.costType;
            this.costVal = builder.costVal;
            this.ispLine = builder.ispLine;
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
         * @return costType
         */
        public String getCostType() {
            return this.costType;
        }

        /**
         * @return costVal
         */
        public Integer getCostVal() {
            return this.costVal;
        }

        /**
         * @return ispLine
         */
        public String getIspLine() {
            return this.ispLine;
        }

        public static final class Builder {
            private String costCode; 
            private String costName; 
            private String costType; 
            private Integer costVal; 
            private String ispLine; 

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
             * CostType.
             */
            public Builder costType(String costType) {
                this.costType = costType;
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
             * IspLine.
             */
            public Builder ispLine(String ispLine) {
                this.ispLine = ispLine;
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

        private MeasurementData(Builder builder) {
            this.bandWidthFeeDatas = builder.bandWidthFeeDatas;
            this.chargeModel = builder.chargeModel;
            this.costCycle = builder.costCycle;
            this.costEndTime = builder.costEndTime;
            this.costStartTime = builder.costStartTime;
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

        public static final class Builder {
            private BandWidthFeeDatas bandWidthFeeDatas; 
            private String chargeModel; 
            private String costCycle; 
            private String costEndTime; 
            private String costStartTime; 

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
