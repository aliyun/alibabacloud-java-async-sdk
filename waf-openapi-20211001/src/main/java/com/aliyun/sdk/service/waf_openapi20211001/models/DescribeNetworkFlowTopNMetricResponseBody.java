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
 * {@link DescribeNetworkFlowTopNMetricResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkFlowTopNMetricResponseBody</p>
 */
public class DescribeNetworkFlowTopNMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkFlowTopNValues")
    private java.util.List<NetworkFlowTopNValues> networkFlowTopNValues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TopNMetaData")
    private TopNMetaData topNMetaData;

    private DescribeNetworkFlowTopNMetricResponseBody(Builder builder) {
        this.networkFlowTopNValues = builder.networkFlowTopNValues;
        this.requestId = builder.requestId;
        this.topNMetaData = builder.topNMetaData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkFlowTopNMetricResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkFlowTopNValues
     */
    public java.util.List<NetworkFlowTopNValues> getNetworkFlowTopNValues() {
        return this.networkFlowTopNValues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topNMetaData
     */
    public TopNMetaData getTopNMetaData() {
        return this.topNMetaData;
    }

    public static final class Builder {
        private java.util.List<NetworkFlowTopNValues> networkFlowTopNValues; 
        private String requestId; 
        private TopNMetaData topNMetaData; 

        private Builder() {
        } 

        private Builder(DescribeNetworkFlowTopNMetricResponseBody model) {
            this.networkFlowTopNValues = model.networkFlowTopNValues;
            this.requestId = model.requestId;
            this.topNMetaData = model.topNMetaData;
        } 

        /**
         * <p>The top statistical data array returned.</p>
         */
        public Builder networkFlowTopNValues(java.util.List<NetworkFlowTopNValues> networkFlowTopNValues) {
            this.networkFlowTopNValues = networkFlowTopNValues;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D827FCFE-90A7-4330-9326-D33C8B4C7726</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The metadata of the returned data.</p>
         */
        public Builder topNMetaData(TopNMetaData topNMetaData) {
            this.topNMetaData = topNMetaData;
            return this;
        }

        public DescribeNetworkFlowTopNMetricResponseBody build() {
            return new DescribeNetworkFlowTopNMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkFlowTopNMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkFlowTopNMetricResponseBody</p>
     */
    public static class NetworkFlowTopNValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private NetworkFlowTopNValues(Builder builder) {
            this.attribute = builder.attribute;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkFlowTopNValues create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String attribute; 
            private String name; 
            private Long value; 

            private Builder() {
            } 

            private Builder(NetworkFlowTopNValues model) {
                this.attribute = model.attribute;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>Returns additional information, such as the country, province, or city to which an IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The value of this field varies depending on the queried Metric.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Counts for top ranking.</p>
             * 
             * <strong>example:</strong>
             * <p>1123</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public NetworkFlowTopNValues build() {
                return new NetworkFlowTopNValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkFlowTopNMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkFlowTopNMetricResponseBody</p>
     */
    public static class DateRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndDate")
        private Long endDate;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private Long startDate;

        private DateRange(Builder builder) {
            this.endDate = builder.endDate;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DateRange create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public Long getEndDate() {
            return this.endDate;
        }

        /**
         * @return startDate
         */
        public Long getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private Long endDate; 
            private Long startDate; 

            private Builder() {
            } 

            private Builder(DateRange model) {
                this.endDate = model.endDate;
                this.startDate = model.startDate;
            } 

            /**
             * <p>The end time of the query range (Unix timestamp, seconds). Same as the EndDate request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888600</p>
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The start time of the query range (Unix timestamp, seconds). Same as the StartDate request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888000</p>
             */
            public Builder startDate(Long startDate) {
                this.startDate = startDate;
                return this;
            }

            public DateRange build() {
                return new DateRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkFlowTopNMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkFlowTopNMetricResponseBody</p>
     */
    public static class TopNMetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateRange")
        private DateRange dateRange;

        @com.aliyun.core.annotation.NameInMap("Units")
        private String units;

        private TopNMetaData(Builder builder) {
            this.dateRange = builder.dateRange;
            this.units = builder.units;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopNMetaData create() {
            return builder().build();
        }

        /**
         * @return dateRange
         */
        public DateRange getDateRange() {
            return this.dateRange;
        }

        /**
         * @return units
         */
        public String getUnits() {
            return this.units;
        }

        public static final class Builder {
            private DateRange dateRange; 
            private String units; 

            private Builder() {
            } 

            private Builder(TopNMetaData model) {
                this.dateRange = model.dateRange;
                this.units = model.units;
            } 

            /**
             * <p>The query time range.</p>
             */
            public Builder dateRange(DateRange dateRange) {
                this.dateRange = dateRange;
                return this;
            }

            /**
             * <p>The unit of the returned data. It is fixed as requests.</p>
             * 
             * <strong>example:</strong>
             * <p>requests</p>
             */
            public Builder units(String units) {
                this.units = units;
                return this;
            }

            public TopNMetaData build() {
                return new TopNMetaData(this);
            } 

        } 

    }
}
