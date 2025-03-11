// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsInstanceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceMonitorResponseBody</p>
 */
public class DescribeDrdsInstanceMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        /**
         * <p>The result set of the query.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2F7F8080-9132-4279-85D0-B7E5C4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDrdsInstanceMonitorResponseBody build() {
            return new DescribeDrdsInstanceMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsInstanceMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstanceMonitorResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private Long date;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The point in time when the value of the metric was collected. The value is in the UNIX timestamp format. The timestamp is displayed in UTC. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1603163400000</p>
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1.40</p>
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
    /**
     * 
     * {@link DescribeDrdsInstanceMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstanceMonitorResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Values> values;

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
        public java.util.List<Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private Integer nodeNum; 
            private String unit; 
            private java.util.List<Values> values; 

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * <p>The unit of the metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The details of the monitoring data of the metric.</p>
             */
            public Builder values(java.util.List<Values> values) {
                this.values = values;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
