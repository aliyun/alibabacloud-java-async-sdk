// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableMetricsResponseBody</p>
 */
public class DescribeAvailableMetricsResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeAvailableMetricsResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeAvailableMetricsResponseBody build() {
            return new DescribeAvailableMetricsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Dimension")
        private String dimension;

        @NameInMap("GroupKey")
        private String groupKey;

        @NameInMap("GroupKeyType")
        private String groupKeyType;

        @NameInMap("Method")
        private String method;

        @NameInMap("MetricsKey")
        private String metricsKey;

        @NameInMap("MetricsKeyAlias")
        private String metricsKeyAlias;

        @NameInMap("SortRule")
        private Integer sortRule;

        @NameInMap("Unit")
        private String unit;

        private Items(Builder builder) {
            this.description = builder.description;
            this.dimension = builder.dimension;
            this.groupKey = builder.groupKey;
            this.groupKeyType = builder.groupKeyType;
            this.method = builder.method;
            this.metricsKey = builder.metricsKey;
            this.metricsKeyAlias = builder.metricsKeyAlias;
            this.sortRule = builder.sortRule;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return groupKey
         */
        public String getGroupKey() {
            return this.groupKey;
        }

        /**
         * @return groupKeyType
         */
        public String getGroupKeyType() {
            return this.groupKeyType;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return metricsKey
         */
        public String getMetricsKey() {
            return this.metricsKey;
        }

        /**
         * @return metricsKeyAlias
         */
        public String getMetricsKeyAlias() {
            return this.metricsKeyAlias;
        }

        /**
         * @return sortRule
         */
        public Integer getSortRule() {
            return this.sortRule;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String description; 
            private String dimension; 
            private String groupKey; 
            private String groupKeyType; 
            private String method; 
            private String metricsKey; 
            private String metricsKeyAlias; 
            private Integer sortRule; 
            private String unit; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * GroupKey.
             */
            public Builder groupKey(String groupKey) {
                this.groupKey = groupKey;
                return this;
            }

            /**
             * GroupKeyType.
             */
            public Builder groupKeyType(String groupKeyType) {
                this.groupKeyType = groupKeyType;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * MetricsKey.
             */
            public Builder metricsKey(String metricsKey) {
                this.metricsKey = metricsKey;
                return this;
            }

            /**
             * MetricsKeyAlias.
             */
            public Builder metricsKeyAlias(String metricsKeyAlias) {
                this.metricsKeyAlias = metricsKeyAlias;
                return this;
            }

            /**
             * SortRule.
             */
            public Builder sortRule(Integer sortRule) {
                this.sortRule = sortRule;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
