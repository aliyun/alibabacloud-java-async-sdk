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

        private Builder(DescribeEpnMeasurementDataResponseBody model) {
            this.measurementDatas = model.measurementDatas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The metering data returned.</p>
         */
        public Builder measurementDatas(MeasurementDatas measurementDatas) {
            this.measurementDatas = measurementDatas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A6328C33-6304-5291-8641-0A00A99D0DD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEpnMeasurementDataResponseBody build() {
            return new DescribeEpnMeasurementDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEpnMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEpnMeasurementDataResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BandWidthFeeData model) {
                this.costCode = model.costCode;
                this.costName = model.costName;
                this.costType = model.costType;
                this.costVal = model.costVal;
                this.ispLine = model.ispLine;
            } 

            /**
             * <p>The code of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-cmcc-1</p>
             */
            public Builder costCode(String costCode) {
                this.costCode = costCode;
                return this;
            }

            /**
             * <p>The name of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing, Shanghai, and Guangzhou Mobile</p>
             */
            public Builder costName(String costName) {
                this.costName = costName;
                return this;
            }

            /**
             * <p>Metering method</p>
             * <ul>
             * <li>SpeedUp: bandwidth of intelligent acceleration</li>
             * <li>IntranetConnection: internal bandwidth</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SpeedUp</p>
             */
            public Builder costType(String costType) {
                this.costType = costType;
                return this;
            }

            /**
             * <p>The value of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>16486</p>
             */
            public Builder costVal(Integer costVal) {
                this.costVal = costVal;
                return this;
            }

            /**
             * <p>This parameter is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>This parameter is not currently in use.</p>
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
    /**
     * 
     * {@link DescribeEpnMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEpnMeasurementDataResponseBody</p>
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
     * {@link DescribeEpnMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEpnMeasurementDataResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MeasurementData model) {
                this.bandWidthFeeDatas = model.bandWidthFeeDatas;
                this.chargeModel = model.chargeModel;
                this.costCycle = model.costCycle;
                this.costEndTime = model.costEndTime;
                this.costStartTime = model.costStartTime;
            } 

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

            public MeasurementData build() {
                return new MeasurementData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEpnMeasurementDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEpnMeasurementDataResponseBody</p>
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
