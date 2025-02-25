// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link ListVccFlowInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListVccFlowInfosResponseBody</p>
 */
public class ListVccFlowInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVccFlowInfosResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVccFlowInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Response</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>BDBCC783-84CA-5733-8EEA-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVccFlowInfosResponseBody build() {
            return new ListVccFlowInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVccFlowInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListVccFlowInfosResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        @com.aliyun.core.annotation.NameInMap("VccId")
        private String vccId;

        private Data(Builder builder) {
            this.direction = builder.direction;
            this.metricName = builder.metricName;
            this.regionId = builder.regionId;
            this.timestamp = builder.timestamp;
            this.value = builder.value;
            this.vccId = builder.vccId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        /**
         * @return vccId
         */
        public String getVccId() {
            return this.vccId;
        }

        public static final class Builder {
            private String direction; 
            private String metricName; 
            private String regionId; 
            private Long timestamp; 
            private Double value; 
            private String vccId; 

            /**
             * <p>The direction.</p>
             * 
             * <strong>example:</strong>
             * <p>OUT</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The metric. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>passBytesRate</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Time</p>
             * 
             * <strong>example:</strong>
             * <p>1689749749000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>Value</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            /**
             * <p>Lingjun Connection ID</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-cn-zvp2w******</p>
             */
            public Builder vccId(String vccId) {
                this.vccId = vccId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVccFlowInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListVccFlowInfosResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Content(Builder builder) {
            this.data = builder.data;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long total; 

            /**
             * <p>Lingjun Connection Traffic Information</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
