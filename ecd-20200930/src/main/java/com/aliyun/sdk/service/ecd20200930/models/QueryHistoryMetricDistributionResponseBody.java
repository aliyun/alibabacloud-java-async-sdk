// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryHistoryMetricDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHistoryMetricDistributionResponseBody</p>
 */
public class QueryHistoryMetricDistributionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DistributionList")
    private java.util.List<DistributionList> distributionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryHistoryMetricDistributionResponseBody(Builder builder) {
        this.distributionList = builder.distributionList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryMetricDistributionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return distributionList
     */
    public java.util.List<DistributionList> getDistributionList() {
        return this.distributionList;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DistributionList> distributionList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(QueryHistoryMetricDistributionResponseBody model) {
            this.distributionList = model.distributionList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DistributionList.
         */
        public Builder distributionList(java.util.List<DistributionList> distributionList) {
            this.distributionList = distributionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryHistoryMetricDistributionResponseBody build() {
            return new QueryHistoryMetricDistributionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryHistoryMetricDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHistoryMetricDistributionResponseBody</p>
     */
    public static class DistributionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Float max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Float min;

        private DistributionList(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DistributionList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return max
         */
        public Float getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Float getMin() {
            return this.min;
        }

        public static final class Builder {
            private Integer count; 
            private String label; 
            private Float max; 
            private Float min; 

            private Builder() {
            } 

            private Builder(DistributionList model) {
                this.count = model.count;
                this.label = model.label;
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Float max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Float min) {
                this.min = min;
                return this;
            }

            public DistributionList build() {
                return new DistributionList(this);
            } 

        } 

    }
}
