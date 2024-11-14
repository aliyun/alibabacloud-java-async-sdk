// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricDataResponseBody</p>
 */
public class DescribeMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeMetricDataResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The disk monitoring data.</p>
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11B55F58-D3A4-4A9B-9596-342420D0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of data entries queried.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMetricDataResponseBody build() {
            return new DescribeMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricDataResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Datapoints")
        private Object datapoints;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private Object labels;

        private DataList(Builder builder) {
            this.datapoints = builder.datapoints;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return datapoints
         */
        public Object getDatapoints() {
            return this.datapoints;
        }

        /**
         * @return labels
         */
        public Object getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private Object datapoints; 
            private Object labels; 

            /**
             * <p>The datapoints that consist of consecutive timestamps in seconds and metric values that were recorded at these time points.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;1699258861&quot;: 1,
             *         &quot;1699259461&quot;: 0,
             *         &quot;1699260061&quot;: 0,
             *         &quot;1699260661&quot;: 0,
             *         &quot;1699261261&quot;: 0,
             *         &quot;1699261861&quot;: 0,
             *         &quot;1699262461&quot;: 0,
             *         &quot;1699263061&quot;: 0,
             *         &quot;1699263661&quot;: 0,
             *         &quot;1699264261&quot;: 0,
             *         &quot;1699264861&quot;: 0
             * }</p>
             */
            public Builder datapoints(Object datapoints) {
                this.datapoints = datapoints;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;DiskId&quot;: &quot;d-1234&quot;}</p>
             */
            public Builder labels(Object labels) {
                this.labels = labels;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
