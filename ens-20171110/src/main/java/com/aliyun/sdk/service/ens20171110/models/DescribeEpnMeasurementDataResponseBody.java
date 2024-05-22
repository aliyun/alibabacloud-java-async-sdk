// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnMeasurementDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEpnMeasurementDataResponseBody</p>
 */
public class DescribeEpnMeasurementDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MeasurementDatas")
    private MeasurementDatas measurementDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The metering data returned.
         */
        public Builder measurementDatas(MeasurementDatas measurementDatas) {
            this.measurementDatas = measurementDatas;
            return this;
        }

        /**
         * The request ID.
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
        @com.aliyun.core.annotation.NameInMap("CostCode")
        private String costCode;

        @com.aliyun.core.annotation.NameInMap("CostName")
        private String costName;

        @com.aliyun.core.annotation.NameInMap("CostType")
        private String costType;

        @com.aliyun.core.annotation.NameInMap("CostVal")
        private Integer costVal;

        @com.aliyun.core.annotation.NameInMap("IspLine")
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
             * The code of the billable item.
             */
            public Builder costCode(String costCode) {
                this.costCode = costCode;
                return this;
            }

            /**
             * The name of the billable item.
             */
            public Builder costName(String costName) {
                this.costName = costName;
                return this;
            }

            /**
             * Metering method
             * <p>
             * 
             * *   SpeedUp: bandwidth of intelligent acceleration
             * *   IntranetConnection: internal bandwidth
             */
            public Builder costType(String costType) {
                this.costType = costType;
                return this;
            }

            /**
             * The value of the billable item.
             */
            public Builder costVal(Integer costVal) {
                this.costVal = costVal;
                return this;
            }

            /**
             * This parameter is unavailable.
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

            public MeasurementData build() {
                return new MeasurementData(this);
            } 

        } 

    }
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
