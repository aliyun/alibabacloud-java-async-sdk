// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetIssuesRequest} extends {@link RequestModel}
 *
 * <p>GetIssuesRequest</p>
 */
public class GetIssuesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizModule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizModule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private Filter filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private TimeRange timeRange;

    private GetIssuesRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.bizModule = builder.bizModule;
        this.filter = builder.filter;
        this.name = builder.name;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.os = builder.os;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIssuesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return bizModule
     */
    public String getBizModule() {
        return this.bizModule;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return timeRange
     */
    public TimeRange getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<GetIssuesRequest, Builder> {
        private Long appKey; 
        private String bizModule; 
        private Filter filter; 
        private String name; 
        private String orderBy; 
        private String orderType; 
        private String os; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Integer status; 
        private TimeRange timeRange; 

        private Builder() {
            super();
        } 

        private Builder(GetIssuesRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.bizModule = request.bizModule;
            this.filter = request.filter;
            this.name = request.name;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.os = request.os;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.timeRange = request.timeRange;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>233588686</p>
         */
        public Builder appKey(Long appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>h5Resource</p>
         */
        public Builder bizModule(String bizModule) {
            this.putBodyParameter("BizModule", bizModule);
            this.bizModule = bizModule;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putBodyParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putBodyParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.putBodyParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder timeRange(TimeRange timeRange) {
            this.putBodyParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public GetIssuesRequest build() {
            return new GetIssuesRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetIssuesRequest} extends {@link TeaModel}
     *
     * <p>GetIssuesRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("SubFilters")
        private java.util.List<String> subFilters;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<?> values;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.subFilters = builder.subFilters;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return subFilters
         */
        public java.util.List<String> getSubFilters() {
            return this.subFilters;
        }

        /**
         * @return values
         */
        public java.util.List<?> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private java.util.List<String> subFilters; 
            private java.util.List<?> values; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.key = model.key;
                this.operator = model.operator;
                this.subFilters = model.subFilters;
                this.values = model.values;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * SubFilters.
             */
            public Builder subFilters(java.util.List<String> subFilters) {
                this.subFilters = subFilters;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<?> values) {
                this.values = values;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIssuesRequest} extends {@link TeaModel}
     *
     * <p>GetIssuesRequest</p>
     */
    public static class TimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private Integer granularity;

        @com.aliyun.core.annotation.NameInMap("GranularityUnit")
        private String granularityUnit;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private TimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.granularity = builder.granularity;
            this.granularityUnit = builder.granularityUnit;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return granularity
         */
        public Integer getGranularity() {
            return this.granularity;
        }

        /**
         * @return granularityUnit
         */
        public String getGranularityUnit() {
            return this.granularityUnit;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Integer granularity; 
            private String granularityUnit; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(TimeRange model) {
                this.endTime = model.endTime;
                this.granularity = model.granularity;
                this.granularityUnit = model.granularityUnit;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Granularity.
             */
            public Builder granularity(Integer granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * GranularityUnit.
             */
            public Builder granularityUnit(String granularityUnit) {
                this.granularityUnit = granularityUnit;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimeRange build() {
                return new TimeRange(this);
            } 

        } 

    }
}
