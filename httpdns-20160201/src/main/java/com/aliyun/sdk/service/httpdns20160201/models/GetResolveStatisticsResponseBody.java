// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

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
 * {@link GetResolveStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetResolveStatisticsResponseBody</p>
 */
public class GetResolveStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataPoints")
    private DataPoints dataPoints;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResolveStatisticsResponseBody(Builder builder) {
        this.dataPoints = builder.dataPoints;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResolveStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataPoints
     */
    public DataPoints getDataPoints() {
        return this.dataPoints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataPoints dataPoints; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetResolveStatisticsResponseBody model) {
            this.dataPoints = model.dataPoints;
            this.requestId = model.requestId;
        } 

        /**
         * DataPoints.
         */
        public Builder dataPoints(DataPoints dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResolveStatisticsResponseBody build() {
            return new GetResolveStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResolveStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetResolveStatisticsResponseBody</p>
     */
    public static class DataPoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Integer time;

        private DataPoint(Builder builder) {
            this.count = builder.count;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPoint create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer count; 
            private Integer time; 

            private Builder() {
            } 

            private Builder(DataPoint model) {
                this.count = model.count;
                this.time = model.time;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            public DataPoint build() {
                return new DataPoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResolveStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetResolveStatisticsResponseBody</p>
     */
    public static class DataPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataPoint")
        private java.util.List<DataPoint> dataPoint;

        private DataPoints(Builder builder) {
            this.dataPoint = builder.dataPoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPoints create() {
            return builder().build();
        }

        /**
         * @return dataPoint
         */
        public java.util.List<DataPoint> getDataPoint() {
            return this.dataPoint;
        }

        public static final class Builder {
            private java.util.List<DataPoint> dataPoint; 

            private Builder() {
            } 

            private Builder(DataPoints model) {
                this.dataPoint = model.dataPoint;
            } 

            /**
             * DataPoint.
             */
            public Builder dataPoint(java.util.List<DataPoint> dataPoint) {
                this.dataPoint = dataPoint;
                return this;
            }

            public DataPoints build() {
                return new DataPoints(this);
            } 

        } 

    }
}
