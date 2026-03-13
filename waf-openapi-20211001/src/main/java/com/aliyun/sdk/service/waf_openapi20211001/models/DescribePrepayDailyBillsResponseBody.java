// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribePrepayDailyBillsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrepayDailyBillsResponseBody</p>
 */
public class DescribePrepayDailyBillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bills")
    private java.util.List<Bills> bills;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePrepayDailyBillsResponseBody(Builder builder) {
        this.bills = builder.bills;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrepayDailyBillsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bills
     */
    public java.util.List<Bills> getBills() {
        return this.bills;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Bills> bills; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribePrepayDailyBillsResponseBody model) {
            this.bills = model.bills;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The bills of the burstable QPS (pay-as-you-go) feature.</p>
         */
        public Builder bills(java.util.List<Bills> bills) {
            this.bills = bills;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC10C9EA-A367-52D5-<em><strong>-</strong></em></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePrepayDailyBillsResponseBody build() {
            return new DescribePrepayDailyBillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePrepayDailyBillsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrepayDailyBillsResponseBody</p>
     */
    public static class Bills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticQpsSetValue")
        private Long elasticQpsSetValue;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ExceedStatus")
        private Integer exceedStatus;

        @com.aliyun.core.annotation.NameInMap("MaxQps")
        private Long maxQps;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Float price;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private Long qps;

        @com.aliyun.core.annotation.NameInMap("QpsVersion")
        private Long qpsVersion;

        @com.aliyun.core.annotation.NameInMap("RiskControl")
        private Boolean riskControl;

        @com.aliyun.core.annotation.NameInMap("RiskTraffic")
        private Long riskTraffic;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Type")
        private java.util.List<String> type;

        private Bills(Builder builder) {
            this.elasticQpsSetValue = builder.elasticQpsSetValue;
            this.endTime = builder.endTime;
            this.exceedStatus = builder.exceedStatus;
            this.maxQps = builder.maxQps;
            this.price = builder.price;
            this.qps = builder.qps;
            this.qpsVersion = builder.qpsVersion;
            this.riskControl = builder.riskControl;
            this.riskTraffic = builder.riskTraffic;
            this.startTime = builder.startTime;
            this.total = builder.total;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bills create() {
            return builder().build();
        }

        /**
         * @return elasticQpsSetValue
         */
        public Long getElasticQpsSetValue() {
            return this.elasticQpsSetValue;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return exceedStatus
         */
        public Integer getExceedStatus() {
            return this.exceedStatus;
        }

        /**
         * @return maxQps
         */
        public Long getMaxQps() {
            return this.maxQps;
        }

        /**
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return qps
         */
        public Long getQps() {
            return this.qps;
        }

        /**
         * @return qpsVersion
         */
        public Long getQpsVersion() {
            return this.qpsVersion;
        }

        /**
         * @return riskControl
         */
        public Boolean getRiskControl() {
            return this.riskControl;
        }

        /**
         * @return riskTraffic
         */
        public Long getRiskTraffic() {
            return this.riskTraffic;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return type
         */
        public java.util.List<String> getType() {
            return this.type;
        }

        public static final class Builder {
            private Long elasticQpsSetValue; 
            private Long endTime; 
            private Integer exceedStatus; 
            private Long maxQps; 
            private Float price; 
            private Long qps; 
            private Long qpsVersion; 
            private Boolean riskControl; 
            private Long riskTraffic; 
            private Long startTime; 
            private Long total; 
            private java.util.List<String> type; 

            private Builder() {
            } 

            private Builder(Bills model) {
                this.elasticQpsSetValue = model.elasticQpsSetValue;
                this.endTime = model.endTime;
                this.exceedStatus = model.exceedStatus;
                this.maxQps = model.maxQps;
                this.price = model.price;
                this.qps = model.qps;
                this.qpsVersion = model.qpsVersion;
                this.riskControl = model.riskControl;
                this.riskTraffic = model.riskTraffic;
                this.startTime = model.startTime;
                this.total = model.total;
                this.type = model.type;
            } 

            /**
             * <p>The burstable QPS of the WAF instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder elasticQpsSetValue(Long elasticQpsSetValue) {
                this.elasticQpsSetValue = elasticQpsSetValue;
                return this;
            }

            /**
             * <p>The billing end time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1687591200</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The status of QPS usage within the current period of time. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: normal.</li>
             * <li><strong>1</strong>: excess.</li>
             * <li><strong>2</strong>: sandbox.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exceedStatus(Integer exceedStatus) {
                this.exceedStatus = exceedStatus;
                return this;
            }

            /**
             * <p>The peak QPS within the current period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder maxQps(Long maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * <p>The unit price in the bill. The price is measured in CNY for bills at the China site (aliyun.com) and in USD for bills at the international site (alibabacloud.com).</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The extended QPS of the WAF instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The default QPS of the WAF instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder qpsVersion(Long qpsVersion) {
                this.qpsVersion = qpsVersion;
                return this;
            }

            /**
             * <p>Indicates whether risk identification is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder riskControl(Boolean riskControl) {
                this.riskControl = riskControl;
                return this;
            }

            /**
             * <p>The number of times that risk identification is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder riskTraffic(Long riskTraffic) {
                this.riskTraffic = riskTraffic;
                return this;
            }

            /**
             * <p>The billing start time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1687822980</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The actual QPS in total.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The billing types.</p>
             */
            public Builder type(java.util.List<String> type) {
                this.type = type;
                return this;
            }

            public Bills build() {
                return new Bills(this);
            } 

        } 

    }
}
