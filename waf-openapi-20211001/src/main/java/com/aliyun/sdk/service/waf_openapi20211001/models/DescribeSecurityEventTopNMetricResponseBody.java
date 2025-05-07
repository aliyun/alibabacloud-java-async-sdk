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
 * {@link DescribeSecurityEventTopNMetricResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventTopNMetricResponseBody</p>
 */
public class DescribeSecurityEventTopNMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEventTopNValues")
    private java.util.List<SecurityEventTopNValues> securityEventTopNValues;

    @com.aliyun.core.annotation.NameInMap("TopNMetaData")
    private TopNMetaData topNMetaData;

    private DescribeSecurityEventTopNMetricResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventTopNValues = builder.securityEventTopNValues;
        this.topNMetaData = builder.topNMetaData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventTopNMetricResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEventTopNValues
     */
    public java.util.List<SecurityEventTopNValues> getSecurityEventTopNValues() {
        return this.securityEventTopNValues;
    }

    /**
     * @return topNMetaData
     */
    public TopNMetaData getTopNMetaData() {
        return this.topNMetaData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SecurityEventTopNValues> securityEventTopNValues; 
        private TopNMetaData topNMetaData; 

        private Builder() {
        } 

        private Builder(DescribeSecurityEventTopNMetricResponseBody model) {
            this.requestId = model.requestId;
            this.securityEventTopNValues = model.securityEventTopNValues;
            this.topNMetaData = model.topNMetaData;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D827FCFE-90A7-4330-9326-*****B4C7726</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The top N data entries returned.</p>
         */
        public Builder securityEventTopNValues(java.util.List<SecurityEventTopNValues> securityEventTopNValues) {
            this.securityEventTopNValues = securityEventTopNValues;
            return this;
        }

        /**
         * <p>The metadata of the data entries returned.</p>
         */
        public Builder topNMetaData(TopNMetaData topNMetaData) {
            this.topNMetaData = topNMetaData;
            return this;
        }

        public DescribeSecurityEventTopNMetricResponseBody build() {
            return new DescribeSecurityEventTopNMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityEventTopNMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTopNMetricResponseBody</p>
     */
    public static class SecurityEventTopNValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private SecurityEventTopNValues(Builder builder) {
            this.attribute = builder.attribute;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventTopNValues create() {
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

            private Builder(SecurityEventTopNValues model) {
                this.attribute = model.attribute;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The additional information, such as the protection module for a protection rule whose ID is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_base</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The field value, which varies based on the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The count for the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public SecurityEventTopNValues build() {
                return new SecurityEventTopNValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityEventTopNMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTopNMetricResponseBody</p>
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
             * <p>The end of the time range to query. The value is a Unix timestamp. Unit: seconds. This value is the same as the value of EndDate in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888600</p>
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. The value is a Unix timestamp. Unit: seconds. This value is the same as the value of StartDate in the request parameters.</p>
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
     * {@link DescribeSecurityEventTopNMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTopNMetricResponseBody</p>
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
             * <p>The time range that is used for the query.</p>
             */
            public Builder dateRange(DateRange dateRange) {
                this.dateRange = dateRange;
                return this;
            }

            /**
             * <p>The unit of the statistics returned. It is fixed as requests.</p>
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
