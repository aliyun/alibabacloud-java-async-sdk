// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRDSPerformanceResponseBody</p>
 */
public class DescribeRDSPerformanceResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeRDSPerformanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRDSPerformanceResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Boolean success; 

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

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRDSPerformanceResponseBody build() {
            return new DescribeRDSPerformanceResponseBody(this);
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
             * The time point when the value of the monitoring metric was obtained. The value is in the UNIX timestamp format. The time is displayed in UTC. Unit: ms.
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * The value of the monitoring metric.
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

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("NodeNum")
        private Integer nodeNum;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Values")
        private java.util.List < Values> values;

        private Data(Builder builder) {
            this.key = builder.key;
            this.nodeName = builder.nodeName;
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
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
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
            private String nodeName; 
            private Integer nodeNum; 
            private String unit; 
            private java.util.List < Values> values; 

            /**
             * The name of the monitoring metric.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The name of the node.
             * <p>
             * 
             * >  This parameter is returned only when the storage type of the database is PolarDB for MySQL. If the storage type of the database is ApsaraDB RDS for MySQL, this parameter is not returned.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
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
             * The unit of the monitoring metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The details of the monitoring metric data.
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
