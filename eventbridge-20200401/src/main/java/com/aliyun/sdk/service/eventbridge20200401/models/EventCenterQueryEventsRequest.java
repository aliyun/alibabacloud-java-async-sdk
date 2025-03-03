// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link EventCenterQueryEventsRequest} extends {@link RequestModel}
 *
 * <p>EventCenterQueryEventsRequest</p>
 */
public class EventCenterQueryEventsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Body")
    @com.aliyun.core.annotation.Validation(required = true)
    private EventCenterQueryEventsRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusName")
    private String busName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 10000)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private EventCenterQueryEventsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.busName = builder.busName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventCenterQueryEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public EventCenterQueryEventsRequestBody getBody() {
        return this.body;
    }

    /**
     * @return busName
     */
    public String getBusName() {
        return this.busName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<EventCenterQueryEventsRequest, Builder> {
        private EventCenterQueryEventsRequestBody body; 
        private String busName; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(EventCenterQueryEventsRequest request) {
            super(request);
            this.body = request.body;
            this.busName = request.busName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The parameters in the request body.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(EventCenterQueryEventsRequestBody body) {
            String bodyShrink = shrink(body, "Body", "json");
            this.putBodyParameter("Body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder busName(String busName) {
            this.putQueryParameter("BusName", busName);
            this.busName = busName;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 0 to 10000. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>用来标记当前开始读取的位置。置空表示从头开始。</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public EventCenterQueryEventsRequest build() {
            return new EventCenterQueryEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link EventCenterQueryEventsRequest} extends {@link TeaModel}
     *
     * <p>EventCenterQueryEventsRequest</p>
     */
    public static class Calculations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        private Calculations(Builder builder) {
            this.column = builder.column;
            this.op = builder.op;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Calculations create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        public static final class Builder {
            private String column; 
            private String op; 

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>source</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>COUNT_DISTINCT</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            public Calculations build() {
                return new Calculations(this);
            } 

        } 

    }
    /**
     * 
     * {@link EventCenterQueryEventsRequest} extends {@link TeaModel}
     *
     * <p>EventCenterQueryEventsRequest</p>
     */
    public static class NestedFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private NestedFilters(Builder builder) {
            this.column = builder.column;
            this.op = builder.op;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NestedFilters create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String column; 
            private String op; 
            private java.util.List<String> values; 

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>source</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>COUNT_DISTINCT</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public NestedFilters build() {
                return new NestedFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link EventCenterQueryEventsRequest} extends {@link TeaModel}
     *
     * <p>EventCenterQueryEventsRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("NestedFilterCombination")
        private String nestedFilterCombination;

        @com.aliyun.core.annotation.NameInMap("NestedFilters")
        private java.util.List<NestedFilters> nestedFilters;

        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Filters(Builder builder) {
            this.column = builder.column;
            this.nestedFilterCombination = builder.nestedFilterCombination;
            this.nestedFilters = builder.nestedFilters;
            this.op = builder.op;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return nestedFilterCombination
         */
        public String getNestedFilterCombination() {
            return this.nestedFilterCombination;
        }

        /**
         * @return nestedFilters
         */
        public java.util.List<NestedFilters> getNestedFilters() {
            return this.nestedFilters;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String column; 
            private String nestedFilterCombination; 
            private java.util.List<NestedFilters> nestedFilters; 
            private String op; 
            private java.util.List<String> values; 

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>source</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * NestedFilterCombination.
             */
            public Builder nestedFilterCombination(String nestedFilterCombination) {
                this.nestedFilterCombination = nestedFilterCombination;
                return this;
            }

            /**
             * NestedFilters.
             */
            public Builder nestedFilters(java.util.List<NestedFilters> nestedFilters) {
                this.nestedFilters = nestedFilters;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>The values that are used together with the operator.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link EventCenterQueryEventsRequest} extends {@link TeaModel}
     *
     * <p>EventCenterQueryEventsRequest</p>
     */
    public static class Orders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private Boolean desc;

        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        private Orders(Builder builder) {
            this.column = builder.column;
            this.desc = builder.desc;
            this.op = builder.op;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orders create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return desc
         */
        public Boolean getDesc() {
            return this.desc;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        public static final class Builder {
            private String column; 
            private Boolean desc; 
            private String op; 

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>source</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>Specifies whether to sort the query results in descending order.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder desc(Boolean desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>AVG</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            public Orders build() {
                return new Orders(this);
            } 

        } 

    }
    /**
     * 
     * {@link EventCenterQueryEventsRequest} extends {@link TeaModel}
     *
     * <p>EventCenterQueryEventsRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Breakdowns")
        private java.util.List<String> breakdowns;

        @com.aliyun.core.annotation.NameInMap("Calculations")
        private java.util.List<Calculations> calculations;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FilterCombination")
        private String filterCombination;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private java.util.List<Filters> filters;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private Integer granularity;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Integer offset;

        @com.aliyun.core.annotation.NameInMap("Orders")
        private java.util.List<Orders> orders;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TimeRange")
        private Long timeRange;

        private Parameters(Builder builder) {
            this.breakdowns = builder.breakdowns;
            this.calculations = builder.calculations;
            this.endTime = builder.endTime;
            this.filterCombination = builder.filterCombination;
            this.filters = builder.filters;
            this.granularity = builder.granularity;
            this.limit = builder.limit;
            this.offset = builder.offset;
            this.orders = builder.orders;
            this.startTime = builder.startTime;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return breakdowns
         */
        public java.util.List<String> getBreakdowns() {
            return this.breakdowns;
        }

        /**
         * @return calculations
         */
        public java.util.List<Calculations> getCalculations() {
            return this.calculations;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return filterCombination
         */
        public String getFilterCombination() {
            return this.filterCombination;
        }

        /**
         * @return filters
         */
        public java.util.List<Filters> getFilters() {
            return this.filters;
        }

        /**
         * @return granularity
         */
        public Integer getGranularity() {
            return this.granularity;
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        /**
         * @return orders
         */
        public java.util.List<Orders> getOrders() {
            return this.orders;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return timeRange
         */
        public Long getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private java.util.List<String> breakdowns; 
            private java.util.List<Calculations> calculations; 
            private Long endTime; 
            private String filterCombination; 
            private java.util.List<Filters> filters; 
            private Integer granularity; 
            private Integer limit; 
            private Integer offset; 
            private java.util.List<Orders> orders; 
            private Long startTime; 
            private Long timeRange; 

            /**
             * <p>Specifies whether to further split the data set based on the column name.</p>
             */
            public Builder breakdowns(java.util.List<String> breakdowns) {
                this.breakdowns = breakdowns;
                return this;
            }

            /**
             * <p>The operator that is used to calculate the specified column.</p>
             */
            public Builder calculations(java.util.List<Calculations> calculations) {
                this.calculations = calculations;
                return this;
            }

            /**
             * <p>The timestamp that specifies the end of the time range to query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1687861201814</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The logic used to filter the combination of conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder filterCombination(String filterCombination) {
                this.filterCombination = filterCombination;
                return this;
            }

            /**
             * <p>The filter conditions.</p>
             */
            public Builder filters(java.util.List<Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>The minimum time unit for querying time series data. Minimum value: 1. Unit: seconds. The value of this parameter is a recommended value. The actual value returned shall prevail.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder granularity(Integer granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>The maximum number of events to query. Valid values: 1 to 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The offset of the start position for this query. The offset starts from 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The order of the query results. This parameter is valid only if you set QueryType to table.</p>
             */
            public Builder orders(java.util.List<Orders> orders) {
                this.orders = orders;
                return this;
            }

            /**
             * <p>The timestamp that specifies the beginning of the time range to query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1687860901814</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time range during which events are queried. Unit: milliseconds. Minimum value: 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder timeRange(Long timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link EventCenterQueryEventsRequest} extends {@link TeaModel}
     *
     * <p>EventCenterQueryEventsRequest</p>
     */
    public static class EventCenterQueryEventsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        @com.aliyun.core.annotation.Validation(required = true)
        private Parameters parameters;

        @com.aliyun.core.annotation.NameInMap("QueryType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String queryType;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String schemaId;

        private EventCenterQueryEventsRequestBody(Builder builder) {
            this.parameters = builder.parameters;
            this.queryType = builder.queryType;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventCenterQueryEventsRequestBody create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public Parameters getParameters() {
            return this.parameters;
        }

        /**
         * @return queryType
         */
        public String getQueryType() {
            return this.queryType;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private Parameters parameters; 
            private String queryType; 
            private String schemaId; 

            /**
             * <p>The query parameters.</p>
             * <p>This parameter is required.</p>
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The query type. Valid values:</p>
             * <ul>
             * <li><strong>timeseries</strong>: queries time series data.</li>
             * <li><strong>table</strong>: queries table data.</li>
             * <li><strong>timeseries_and_table</strong>: queries time series data and table data at the same time.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>timeseries_and_table</p>
             */
            public Builder queryType(String queryType) {
                this.queryType = queryType;
                return this;
            }

            /**
             * <p>The schema ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs:GeneralSchema</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public EventCenterQueryEventsRequestBody build() {
                return new EventCenterQueryEventsRequestBody(this);
            } 

        } 

    }
}
