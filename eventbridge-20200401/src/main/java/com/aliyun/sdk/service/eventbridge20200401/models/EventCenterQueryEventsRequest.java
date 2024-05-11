// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
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
         * Body.
         */
        public Builder body(EventCenterQueryEventsRequestBody body) {
            String bodyShrink = shrink(body, "Body", "json");
            this.putBodyParameter("Body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * BusName.
         */
        public Builder busName(String busName) {
            this.putQueryParameter("BusName", busName);
            this.busName = busName;
            return this;
        }

        /**
         * 本次读取的最大数据量，默认值为100。
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 用来标记当前开始读取的位置。置空表示从头开始。
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
             * Column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * Op.
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
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List < String > values;

        private Filters(Builder builder) {
            this.column = builder.column;
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
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String column; 
            private String op; 
            private java.util.List < String > values; 

            /**
             * Column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * Op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
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
             * Column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(Boolean desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Op.
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
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Breakdowns")
        private java.util.List < String > breakdowns;

        @com.aliyun.core.annotation.NameInMap("Calculations")
        private java.util.List < Calculations> calculations;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("FilterCombination")
        private String filterCombination;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private java.util.List < Filters> filters;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private Integer granularity;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Integer offset;

        @com.aliyun.core.annotation.NameInMap("Orders")
        private java.util.List < Orders> orders;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Integer startTime;

        @com.aliyun.core.annotation.NameInMap("TimeRange")
        private Integer timeRange;

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
        public java.util.List < String > getBreakdowns() {
            return this.breakdowns;
        }

        /**
         * @return calculations
         */
        public java.util.List < Calculations> getCalculations() {
            return this.calculations;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
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
        public java.util.List < Filters> getFilters() {
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
        public java.util.List < Orders> getOrders() {
            return this.orders;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        /**
         * @return timeRange
         */
        public Integer getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private java.util.List < String > breakdowns; 
            private java.util.List < Calculations> calculations; 
            private Integer endTime; 
            private String filterCombination; 
            private java.util.List < Filters> filters; 
            private Integer granularity; 
            private Integer limit; 
            private Integer offset; 
            private java.util.List < Orders> orders; 
            private Integer startTime; 
            private Integer timeRange; 

            /**
             * Breakdowns.
             */
            public Builder breakdowns(java.util.List < String > breakdowns) {
                this.breakdowns = breakdowns;
                return this;
            }

            /**
             * Calculations.
             */
            public Builder calculations(java.util.List < Calculations> calculations) {
                this.calculations = calculations;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FilterCombination.
             */
            public Builder filterCombination(String filterCombination) {
                this.filterCombination = filterCombination;
                return this;
            }

            /**
             * Filters.
             */
            public Builder filters(java.util.List < Filters> filters) {
                this.filters = filters;
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
             * Limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * Offset.
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * Orders.
             */
            public Builder orders(java.util.List < Orders> orders) {
                this.orders = orders;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TimeRange.
             */
            public Builder timeRange(Integer timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
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
             * Parameters.
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * QueryType.
             */
            public Builder queryType(String queryType) {
                this.queryType = queryType;
                return this;
            }

            /**
             * Schema ID。
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
