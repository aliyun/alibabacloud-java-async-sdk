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
 * {@link QueryHistoryAvgMetricListRequest} extends {@link RequestModel}
 *
 * <p>QueryHistoryAvgMetricListRequest</p>
 */
public class QueryHistoryAvgMetricListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDate")
    private String dataDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Range")
    private Range range;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    private QueryHistoryAvgMetricListRequest(Builder builder) {
        super(builder);
        this.dataDate = builder.dataDate;
        this.desktopId = builder.desktopId;
        this.metricName = builder.metricName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.range = builder.range;
        this.resourceRegionId = builder.resourceRegionId;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryAvgMetricListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDate
     */
    public String getDataDate() {
        return this.dataDate;
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return range
     */
    public Range getRange() {
        return this.range;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<QueryHistoryAvgMetricListRequest, Builder> {
        private String dataDate; 
        private java.util.List<String> desktopId; 
        private String metricName; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Range range; 
        private String resourceRegionId; 
        private String sortType; 

        private Builder() {
            super();
        } 

        private Builder(QueryHistoryAvgMetricListRequest request) {
            super(request);
            this.dataDate = request.dataDate;
            this.desktopId = request.desktopId;
            this.metricName = request.metricName;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.range = request.range;
            this.resourceRegionId = request.resourceRegionId;
            this.sortType = request.sortType;
        } 

        /**
         * DataDate.
         */
        public Builder dataDate(String dataDate) {
            this.putQueryParameter("DataDate", dataDate);
            this.dataDate = dataDate;
            return this;
        }

        /**
         * DesktopId.
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Range.
         */
        public Builder range(Range range) {
            String rangeShrink = shrink(range, "Range", "json");
            this.putQueryParameter("Range", rangeShrink);
            this.range = range;
            return this;
        }

        /**
         * ResourceRegionId.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * SortType.
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        @Override
        public QueryHistoryAvgMetricListRequest build() {
            return new QueryHistoryAvgMetricListRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryHistoryAvgMetricListRequest} extends {@link TeaModel}
     *
     * <p>QueryHistoryAvgMetricListRequest</p>
     */
    public static class Range extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncludeMax")
        private Boolean includeMax;

        @com.aliyun.core.annotation.NameInMap("IncludeMin")
        private Boolean includeMin;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Float max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Float min;

        private Range(Builder builder) {
            this.includeMax = builder.includeMax;
            this.includeMin = builder.includeMin;
            this.label = builder.label;
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Range create() {
            return builder().build();
        }

        /**
         * @return includeMax
         */
        public Boolean getIncludeMax() {
            return this.includeMax;
        }

        /**
         * @return includeMin
         */
        public Boolean getIncludeMin() {
            return this.includeMin;
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
            private Boolean includeMax; 
            private Boolean includeMin; 
            private String label; 
            private Float max; 
            private Float min; 

            private Builder() {
            } 

            private Builder(Range model) {
                this.includeMax = model.includeMax;
                this.includeMin = model.includeMin;
                this.label = model.label;
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * IncludeMax.
             */
            public Builder includeMax(Boolean includeMax) {
                this.includeMax = includeMax;
                return this;
            }

            /**
             * IncludeMin.
             */
            public Builder includeMin(Boolean includeMin) {
                this.includeMin = includeMin;
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

            public Range build() {
                return new Range(this);
            } 

        } 

    }
}
