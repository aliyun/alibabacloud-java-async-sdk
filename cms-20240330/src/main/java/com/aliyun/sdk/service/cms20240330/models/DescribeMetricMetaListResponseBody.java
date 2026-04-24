// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DescribeMetricMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricMetaListResponseBody</p>
 */
public class DescribeMetricMetaListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private DescribeMetricMetaListResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricMetaListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Resources> resources; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeMetricMetaListResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.totalCount = model.totalCount;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resources.
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMetricMetaListResponseBody build() {
            return new DescribeMetricMetaListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricMetaListResponseBody</p>
     */
    public static class DimensionDescription extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private DimensionDescription(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DimensionDescription create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DimensionDescription model) {
                this.name = model.name;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DimensionDescription build() {
                return new DimensionDescription(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricMetaListResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("dimensionDescription")
        private java.util.List<DimensionDescription> dimensionDescription;

        @com.aliyun.core.annotation.NameInMap("dimensions")
        private java.util.List<String> dimensions;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("metricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("periods")
        private String periods;

        @com.aliyun.core.annotation.NameInMap("statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Resources(Builder builder) {
            this.description = builder.description;
            this.dimensionDescription = builder.dimensionDescription;
            this.dimensions = builder.dimensions;
            this.labels = builder.labels;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.periods = builder.periods;
            this.statistics = builder.statistics;
            this.type = builder.type;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dimensionDescription
         */
        public java.util.List<DimensionDescription> getDimensionDescription() {
            return this.dimensionDescription;
        }

        /**
         * @return dimensions
         */
        public java.util.List<String> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return periods
         */
        public String getPeriods() {
            return this.periods;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<DimensionDescription> dimensionDescription; 
            private java.util.List<String> dimensions; 
            private java.util.Map<String, String> labels; 
            private String metricName; 
            private String namespace; 
            private String periods; 
            private String statistics; 
            private String type; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.description = model.description;
                this.dimensionDescription = model.dimensionDescription;
                this.dimensions = model.dimensions;
                this.labels = model.labels;
                this.metricName = model.metricName;
                this.namespace = model.namespace;
                this.periods = model.periods;
                this.statistics = model.statistics;
                this.type = model.type;
                this.unit = model.unit;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * dimensionDescription.
             */
            public Builder dimensionDescription(java.util.List<DimensionDescription> dimensionDescription) {
                this.dimensionDescription = dimensionDescription;
                return this;
            }

            /**
             * dimensions.
             */
            public Builder dimensions(java.util.List<String> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * labels.
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * metricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * periods.
             */
            public Builder periods(String periods) {
                this.periods = periods;
                return this;
            }

            /**
             * statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
