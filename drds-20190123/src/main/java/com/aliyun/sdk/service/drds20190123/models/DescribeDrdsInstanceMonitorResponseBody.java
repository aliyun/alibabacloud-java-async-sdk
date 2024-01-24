// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceMonitorResponseBody</p>
 */
public class DescribeDrdsInstanceMonitorResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDrdsInstanceMonitorResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstanceMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The result set of the query.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDrdsInstanceMonitorResponseBody build() {
            return new DescribeDrdsInstanceMonitorResponseBody(this);
        } 

    } 

    public static class Values extends TeaModel {
        @NameInMap("Date")
        private Long date;

        @NameInMap("Value")
        private String value;

        private Values(Builder builder) {
            this.date = builder.date;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public Long getDate() {
            return this.date;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long date; 
            private String value; 

            /**
             * The point in time when the value of the metric was collected. The value is in the UNIX timestamp format. The timestamp is displayed in UTC. Unit: ms.
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("NodeNum")
        private Integer nodeNum;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Values")
        private java.util.List < Values> values;

        private Data(Builder builder) {
            this.key = builder.key;
            this.nodeNum = builder.nodeNum;
            this.unit = builder.unit;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return nodeNum
         */
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return values
         */
        public java.util.List < Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private Integer nodeNum; 
            private String unit; 
            private java.util.List < Values> values; 

            /**
             * The name of the metric.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The number of nodes.
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * The unit of the metric value.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The details of the monitoring data of the metric.
             */
            public Builder values(java.util.List < Values> values) {
                this.values = values;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
