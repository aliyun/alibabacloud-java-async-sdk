// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeUnprotectedPortTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUnprotectedPortTrendResponseBody</p>
 */
public class DescribeUnprotectedPortTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUnprotectedPortTrendResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.interval = builder.interval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUnprotectedPortTrendResponseBody create() {
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
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Integer interval; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUnprotectedPortTrendResponseBody model) {
            this.dataList = model.dataList;
            this.interval = model.interval;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data list.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E599A84E-CD22-5E42-A2A9-01A254AC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUnprotectedPortTrendResponseBody build() {
            return new DescribeUnprotectedPortTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUnprotectedPortTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUnprotectedPortTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private DataList(Builder builder) {
            this.count = builder.count;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
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
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer count; 
            private Long time; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.count = model.count;
                this.time = model.time;
            } 

            /**
             * <p>The number of interceptions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1659405600</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
