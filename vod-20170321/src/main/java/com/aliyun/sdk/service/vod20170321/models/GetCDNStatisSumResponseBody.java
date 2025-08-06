// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetCDNStatisSumResponseBody} extends {@link TeaModel}
 *
 * <p>GetCDNStatisSumResponseBody</p>
 */
public class GetCDNStatisSumResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CDNStatisList")
    private CDNStatisList CDNStatisList;

    @com.aliyun.core.annotation.NameInMap("MaxBpsDataValue")
    private Long maxBpsDataValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SumFlowDataValue")
    private Long sumFlowDataValue;

    private GetCDNStatisSumResponseBody(Builder builder) {
        this.CDNStatisList = builder.CDNStatisList;
        this.maxBpsDataValue = builder.maxBpsDataValue;
        this.requestId = builder.requestId;
        this.sumFlowDataValue = builder.sumFlowDataValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCDNStatisSumResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CDNStatisList
     */
    public CDNStatisList getCDNStatisList() {
        return this.CDNStatisList;
    }

    /**
     * @return maxBpsDataValue
     */
    public Long getMaxBpsDataValue() {
        return this.maxBpsDataValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sumFlowDataValue
     */
    public Long getSumFlowDataValue() {
        return this.sumFlowDataValue;
    }

    public static final class Builder {
        private CDNStatisList CDNStatisList; 
        private Long maxBpsDataValue; 
        private String requestId; 
        private Long sumFlowDataValue; 

        private Builder() {
        } 

        private Builder(GetCDNStatisSumResponseBody model) {
            this.CDNStatisList = model.CDNStatisList;
            this.maxBpsDataValue = model.maxBpsDataValue;
            this.requestId = model.requestId;
            this.sumFlowDataValue = model.sumFlowDataValue;
        } 

        /**
         * CDNStatisList.
         */
        public Builder CDNStatisList(CDNStatisList CDNStatisList) {
            this.CDNStatisList = CDNStatisList;
            return this;
        }

        /**
         * MaxBpsDataValue.
         */
        public Builder maxBpsDataValue(Long maxBpsDataValue) {
            this.maxBpsDataValue = maxBpsDataValue;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SumFlowDataValue.
         */
        public Builder sumFlowDataValue(Long sumFlowDataValue) {
            this.sumFlowDataValue = sumFlowDataValue;
            return this;
        }

        public GetCDNStatisSumResponseBody build() {
            return new GetCDNStatisSumResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCDNStatisSumResponseBody} extends {@link TeaModel}
     *
     * <p>GetCDNStatisSumResponseBody</p>
     */
    public static class CDNMetric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BpsDataDomesticValue")
        private Long bpsDataDomesticValue;

        @com.aliyun.core.annotation.NameInMap("BpsDataOverseasValue")
        private Long bpsDataOverseasValue;

        @com.aliyun.core.annotation.NameInMap("BpsDataValue")
        private Long bpsDataValue;

        @com.aliyun.core.annotation.NameInMap("FlowDataDomesticValue")
        private Long flowDataDomesticValue;

        @com.aliyun.core.annotation.NameInMap("FlowDataOverseasValue")
        private Long flowDataOverseasValue;

        @com.aliyun.core.annotation.NameInMap("FlowDataValue")
        private Long flowDataValue;

        @com.aliyun.core.annotation.NameInMap("StatTime")
        private String statTime;

        private CDNMetric(Builder builder) {
            this.bpsDataDomesticValue = builder.bpsDataDomesticValue;
            this.bpsDataOverseasValue = builder.bpsDataOverseasValue;
            this.bpsDataValue = builder.bpsDataValue;
            this.flowDataDomesticValue = builder.flowDataDomesticValue;
            this.flowDataOverseasValue = builder.flowDataOverseasValue;
            this.flowDataValue = builder.flowDataValue;
            this.statTime = builder.statTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CDNMetric create() {
            return builder().build();
        }

        /**
         * @return bpsDataDomesticValue
         */
        public Long getBpsDataDomesticValue() {
            return this.bpsDataDomesticValue;
        }

        /**
         * @return bpsDataOverseasValue
         */
        public Long getBpsDataOverseasValue() {
            return this.bpsDataOverseasValue;
        }

        /**
         * @return bpsDataValue
         */
        public Long getBpsDataValue() {
            return this.bpsDataValue;
        }

        /**
         * @return flowDataDomesticValue
         */
        public Long getFlowDataDomesticValue() {
            return this.flowDataDomesticValue;
        }

        /**
         * @return flowDataOverseasValue
         */
        public Long getFlowDataOverseasValue() {
            return this.flowDataOverseasValue;
        }

        /**
         * @return flowDataValue
         */
        public Long getFlowDataValue() {
            return this.flowDataValue;
        }

        /**
         * @return statTime
         */
        public String getStatTime() {
            return this.statTime;
        }

        public static final class Builder {
            private Long bpsDataDomesticValue; 
            private Long bpsDataOverseasValue; 
            private Long bpsDataValue; 
            private Long flowDataDomesticValue; 
            private Long flowDataOverseasValue; 
            private Long flowDataValue; 
            private String statTime; 

            private Builder() {
            } 

            private Builder(CDNMetric model) {
                this.bpsDataDomesticValue = model.bpsDataDomesticValue;
                this.bpsDataOverseasValue = model.bpsDataOverseasValue;
                this.bpsDataValue = model.bpsDataValue;
                this.flowDataDomesticValue = model.flowDataDomesticValue;
                this.flowDataOverseasValue = model.flowDataOverseasValue;
                this.flowDataValue = model.flowDataValue;
                this.statTime = model.statTime;
            } 

            /**
             * BpsDataDomesticValue.
             */
            public Builder bpsDataDomesticValue(Long bpsDataDomesticValue) {
                this.bpsDataDomesticValue = bpsDataDomesticValue;
                return this;
            }

            /**
             * BpsDataOverseasValue.
             */
            public Builder bpsDataOverseasValue(Long bpsDataOverseasValue) {
                this.bpsDataOverseasValue = bpsDataOverseasValue;
                return this;
            }

            /**
             * BpsDataValue.
             */
            public Builder bpsDataValue(Long bpsDataValue) {
                this.bpsDataValue = bpsDataValue;
                return this;
            }

            /**
             * FlowDataDomesticValue.
             */
            public Builder flowDataDomesticValue(Long flowDataDomesticValue) {
                this.flowDataDomesticValue = flowDataDomesticValue;
                return this;
            }

            /**
             * FlowDataOverseasValue.
             */
            public Builder flowDataOverseasValue(Long flowDataOverseasValue) {
                this.flowDataOverseasValue = flowDataOverseasValue;
                return this;
            }

            /**
             * FlowDataValue.
             */
            public Builder flowDataValue(Long flowDataValue) {
                this.flowDataValue = flowDataValue;
                return this;
            }

            /**
             * StatTime.
             */
            public Builder statTime(String statTime) {
                this.statTime = statTime;
                return this;
            }

            public CDNMetric build() {
                return new CDNMetric(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCDNStatisSumResponseBody} extends {@link TeaModel}
     *
     * <p>GetCDNStatisSumResponseBody</p>
     */
    public static class CDNStatisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CDNMetric")
        private java.util.List<CDNMetric> CDNMetric;

        private CDNStatisList(Builder builder) {
            this.CDNMetric = builder.CDNMetric;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CDNStatisList create() {
            return builder().build();
        }

        /**
         * @return CDNMetric
         */
        public java.util.List<CDNMetric> getCDNMetric() {
            return this.CDNMetric;
        }

        public static final class Builder {
            private java.util.List<CDNMetric> CDNMetric; 

            private Builder() {
            } 

            private Builder(CDNStatisList model) {
                this.CDNMetric = model.CDNMetric;
            } 

            /**
             * CDNMetric.
             */
            public Builder CDNMetric(java.util.List<CDNMetric> CDNMetric) {
                this.CDNMetric = CDNMetric;
                return this;
            }

            public CDNStatisList build() {
                return new CDNStatisList(this);
            } 

        } 

    }
}
