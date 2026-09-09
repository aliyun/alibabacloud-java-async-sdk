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
         * <p>The list of WAF burstable billing records.</p>
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

        @com.aliyun.core.annotation.NameInMap("ExtensionPlugin")
        private Boolean extensionPlugin;

        @com.aliyun.core.annotation.NameInMap("ExtensionPluginRequest")
        private Long extensionPluginRequest;

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
            this.extensionPlugin = builder.extensionPlugin;
            this.extensionPluginRequest = builder.extensionPluginRequest;
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
         * @return extensionPlugin
         */
        public Boolean getExtensionPlugin() {
            return this.extensionPlugin;
        }

        /**
         * @return extensionPluginRequest
         */
        public Long getExtensionPluginRequest() {
            return this.extensionPluginRequest;
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
            private Boolean extensionPlugin; 
            private Long extensionPluginRequest; 
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
                this.extensionPlugin = model.extensionPlugin;
                this.extensionPluginRequest = model.extensionPluginRequest;
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
             * <p>The burstable QPS specification of the WAF instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder elasticQpsSetValue(Long elasticQpsSetValue) {
                this.elasticQpsSetValue = elasticQpsSetValue;
                return this;
            }

            /**
             * <p>The end time of the billing record. The value is a UNIX timestamp (UTC). Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1687591200</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The overuse status of the current period. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Normal.</li>
             * <li><strong>1</strong>: overused.</li>
             * <li><strong>2</strong>: sandboxed.</li>
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
             * <p>Indicates whether the extension plug-in is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The extension plug-in is enabled.</li>
             * <li><strong>false</strong>: The extension plug-in is not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder extensionPlugin(Boolean extensionPlugin) {
                this.extensionPlugin = extensionPlugin;
                return this;
            }

            /**
             * <p>The number of requests processed by the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder extensionPluginRequest(Long extensionPluginRequest) {
                this.extensionPluginRequest = extensionPluginRequest;
                return this;
            }

            /**
             * <p>The maximum QPS during the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder maxQps(Long maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * <p>The unit price for burstable billing. Unit: CNY for the China site and USD for the international site.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The QPS extension specification of the WAF instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The QPS specification included in the WAF instance edition.</p>
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
             * <li><strong>true</strong>: Risk identification is enabled.</li>
             * <li><strong>false</strong>: Risk identification is not enabled.</li>
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
             * <p>The number of times risk identification is used.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder riskTraffic(Long riskTraffic) {
                this.riskTraffic = riskTraffic;
                return this;
            }

            /**
             * <p>The start time of the billing record. The value is a UNIX timestamp (UTC). Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1687822980</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total QPS that is billed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The burstable billing type.</p>
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
