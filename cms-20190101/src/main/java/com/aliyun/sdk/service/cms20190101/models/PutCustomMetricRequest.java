// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutCustomMetricRequest} extends {@link RequestModel}
 *
 * <p>PutCustomMetricRequest</p>
 */
public class PutCustomMetricRequest extends Request {
    @Query
    @NameInMap("MetricList")
    @Validation(required = true)
    private java.util.List < MetricList> metricList;

    private PutCustomMetricRequest(Builder builder) {
        super(builder);
        this.metricList = builder.metricList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutCustomMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricList
     */
    public java.util.List < MetricList> getMetricList() {
        return this.metricList;
    }

    public static final class Builder extends Request.Builder<PutCustomMetricRequest, Builder> {
        private java.util.List < MetricList> metricList; 

        private Builder() {
            super();
        } 

        private Builder(PutCustomMetricRequest request) {
            super(request);
            this.metricList = request.metricList;
        } 

        /**
         * MetricList.
         */
        public Builder metricList(java.util.List < MetricList> metricList) {
            this.putQueryParameter("MetricList", metricList);
            this.metricList = metricList;
            return this;
        }

        @Override
        public PutCustomMetricRequest build() {
            return new PutCustomMetricRequest(this);
        } 

    } 

    public static class MetricList extends TeaModel {
        @NameInMap("Dimensions")
        @Validation(required = true)
        private String dimensions;

        @NameInMap("GroupId")
        @Validation(required = true)
        private String groupId;

        @NameInMap("MetricName")
        @Validation(required = true)
        private String metricName;

        @NameInMap("Period")
        private String period;

        @NameInMap("Time")
        private String time;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        @NameInMap("Values")
        @Validation(required = true)
        private String values;

        private MetricList(Builder builder) {
            this.dimensions = builder.dimensions;
            this.groupId = builder.groupId;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.time = builder.time;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricList create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String dimensions; 
            private String groupId; 
            private String metricName; 
            private String period; 
            private String time; 
            private String type; 
            private String values; 

            /**
             * The operation that you want to perform. Set the value to **PutCustomMetric**.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The HTTP status code.
             * <p>
             * 
             * >  The status code 200 indicates that the call was successful.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The type of the reported data. Valid values of N: 1 to 21. Valid values:
             * <p>
             * 
             * *   0: reports raw data
             * *   1: reports aggregate data
             * 
             * >  We recommend that you report aggregate data in both the aggregation periods of 60s and 300s. Otherwise, you cannot query monitoring data in a time span that is more than seven days.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The aggregation period. Valid values of N: 1 to 21. Unit: seconds. Valid values: 60 and 300.
             * <p>
             * 
             * >  If the MetricList.N.Type parameter is set to 1, the MetricList.N.Period parameter is required.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The collection of metric values. Valid values of N: 1 to 21.
             * <p>
             * 
             * >  If the MetricList.N.Type parameter is set to 0, the keys in this parameter must be set to the specified value. CloudMonitor aggregates raw data in each aggregation period to generate multiple statistical values, such as the maximum value, the count, and the total value.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The timestamp when the metric data is generated. Valid values of N: 1 to 21. The timestamp can be in one of the following formats:
             * <p>
             * 
             * *   The UTC timestamp that is in the YYYY-MM-DDThh:mm:ssZ format. Example: 20171012T132456.888+0800.
             * *   The UNIX timestamp of the LONG type. Example: 1508136760000.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public MetricList build() {
                return new MetricList(this);
            } 

        } 

    }
}
