// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodPlayerCollectDataDemoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodPlayerCollectDataDemoResponseBody</p>
 */
public class DescribeVodPlayerCollectDataDemoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodPlayerCollectDataDemoResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodPlayerCollectDataDemoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVodPlayerCollectDataDemoResponseBody model) {
            this.dataList = model.dataList;
            this.requestId = model.requestId;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodPlayerCollectDataDemoResponseBody build() {
            return new DescribeVodPlayerCollectDataDemoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodPlayerCollectDataDemoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodPlayerCollectDataDemoResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        @com.aliyun.core.annotation.NameInMap("ValueRatio")
        private Double valueRatio;

        @com.aliyun.core.annotation.NameInMap("ValueRefer")
        private Double valueRefer;

        private DataList(Builder builder) {
            this.metric = builder.metric;
            this.value = builder.value;
            this.valueRatio = builder.valueRatio;
            this.valueRefer = builder.valueRefer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        /**
         * @return valueRatio
         */
        public Double getValueRatio() {
            return this.valueRatio;
        }

        /**
         * @return valueRefer
         */
        public Double getValueRefer() {
            return this.valueRefer;
        }

        public static final class Builder {
            private String metric; 
            private Double value; 
            private Double valueRatio; 
            private Double valueRefer; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.metric = model.metric;
                this.value = model.value;
                this.valueRatio = model.valueRatio;
                this.valueRefer = model.valueRefer;
            } 

            /**
             * Metric.
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            /**
             * ValueRatio.
             */
            public Builder valueRatio(Double valueRatio) {
                this.valueRatio = valueRatio;
                return this;
            }

            /**
             * ValueRefer.
             */
            public Builder valueRefer(Double valueRefer) {
                this.valueRefer = valueRefer;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
