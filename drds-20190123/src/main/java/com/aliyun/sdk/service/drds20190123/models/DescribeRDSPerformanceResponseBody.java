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
 * {@link DescribeRDSPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRDSPerformanceResponseBody</p>
 */
public class DescribeRDSPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String requestId; 
        private Boolean success; 

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
         * <p>DB53EC68-463C-4187-8D2B-C2AD8C******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRDSPerformanceResponseBody build() {
            return new DescribeRDSPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRDSPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRDSPerformanceResponseBody</p>
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
             * <p>The time point when the value of the monitoring metric was obtained. The value is in the UNIX timestamp format. The time is displayed in UTC. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1603209660000</p>
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The value of the monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.58</p>
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
     * {@link DescribeRDSPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRDSPerformanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Values> values;

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
        public java.util.List<Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String nodeName; 
            private Integer nodeNum; 
            private String unit; 
            private java.util.List<Values> values; 

            /**
             * <p>The name of the monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>cpuusage</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * <blockquote>
             * <p> This parameter is returned only when the storage type of the database is PolarDB for MySQL. If the storage type of the database is ApsaraDB RDS for MySQL, this parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pi-*************</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
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
             * <p>The unit of the monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The details of the monitoring metric data.</p>
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
