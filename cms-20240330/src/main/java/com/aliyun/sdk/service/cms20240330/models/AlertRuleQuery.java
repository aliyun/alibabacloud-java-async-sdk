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
 * {@link AlertRuleQuery} extends {@link TeaModel}
 *
 * <p>AlertRuleQuery</p>
 */
public class AlertRuleQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checkAfterDataComplete")
    private Boolean checkAfterDataComplete;

    @com.aliyun.core.annotation.NameInMap("dimensions")
    private java.util.List<java.util.Map<String, String>> dimensions;

    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("entityFilter")
    private EntityFilter entityFilter;

    @com.aliyun.core.annotation.NameInMap("expr")
    private String expr;

    @com.aliyun.core.annotation.NameInMap("firstJoin")
    private AlertRuleSlsQueryJoin firstJoin;

    @com.aliyun.core.annotation.NameInMap("groupFieldList")
    private java.util.List<String> groupFieldList;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("groupType")
    private String groupType;

    @com.aliyun.core.annotation.NameInMap("metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("metricSet")
    private String metricSet;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("queries")
    private java.util.List<Queries> queries;

    @com.aliyun.core.annotation.NameInMap("relationType")
    private String relationType;

    @com.aliyun.core.annotation.NameInMap("secondJoin")
    private AlertRuleSlsQueryJoin secondJoin;

    @com.aliyun.core.annotation.NameInMap("serviceIds")
    private java.util.List<String> serviceIds;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AlertRuleQuery(Builder builder) {
        this.checkAfterDataComplete = builder.checkAfterDataComplete;
        this.dimensions = builder.dimensions;
        this.domain = builder.domain;
        this.duration = builder.duration;
        this.entityFilter = builder.entityFilter;
        this.expr = builder.expr;
        this.firstJoin = builder.firstJoin;
        this.groupFieldList = builder.groupFieldList;
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.metric = builder.metric;
        this.metricSet = builder.metricSet;
        this.namespace = builder.namespace;
        this.queries = builder.queries;
        this.relationType = builder.relationType;
        this.secondJoin = builder.secondJoin;
        this.serviceIds = builder.serviceIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleQuery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkAfterDataComplete
     */
    public Boolean getCheckAfterDataComplete() {
        return this.checkAfterDataComplete;
    }

    /**
     * @return dimensions
     */
    public java.util.List<java.util.Map<String, String>> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return entityFilter
     */
    public EntityFilter getEntityFilter() {
        return this.entityFilter;
    }

    /**
     * @return expr
     */
    public String getExpr() {
        return this.expr;
    }

    /**
     * @return firstJoin
     */
    public AlertRuleSlsQueryJoin getFirstJoin() {
        return this.firstJoin;
    }

    /**
     * @return groupFieldList
     */
    public java.util.List<String> getGroupFieldList() {
        return this.groupFieldList;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return metricSet
     */
    public String getMetricSet() {
        return this.metricSet;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return queries
     */
    public java.util.List<Queries> getQueries() {
        return this.queries;
    }

    /**
     * @return relationType
     */
    public String getRelationType() {
        return this.relationType;
    }

    /**
     * @return secondJoin
     */
    public AlertRuleSlsQueryJoin getSecondJoin() {
        return this.secondJoin;
    }

    /**
     * @return serviceIds
     */
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean checkAfterDataComplete; 
        private java.util.List<java.util.Map<String, String>> dimensions; 
        private String domain; 
        private Long duration; 
        private EntityFilter entityFilter; 
        private String expr; 
        private AlertRuleSlsQueryJoin firstJoin; 
        private java.util.List<String> groupFieldList; 
        private String groupId; 
        private String groupType; 
        private String metric; 
        private String metricSet; 
        private String namespace; 
        private java.util.List<Queries> queries; 
        private String relationType; 
        private AlertRuleSlsQueryJoin secondJoin; 
        private java.util.List<String> serviceIds; 
        private String type; 

        private Builder() {
        } 

        private Builder(AlertRuleQuery model) {
            this.checkAfterDataComplete = model.checkAfterDataComplete;
            this.dimensions = model.dimensions;
            this.domain = model.domain;
            this.duration = model.duration;
            this.entityFilter = model.entityFilter;
            this.expr = model.expr;
            this.firstJoin = model.firstJoin;
            this.groupFieldList = model.groupFieldList;
            this.groupId = model.groupId;
            this.groupType = model.groupType;
            this.metric = model.metric;
            this.metricSet = model.metricSet;
            this.namespace = model.namespace;
            this.queries = model.queries;
            this.relationType = model.relationType;
            this.secondJoin = model.secondJoin;
            this.serviceIds = model.serviceIds;
            this.type = model.type;
        } 

        /**
         * checkAfterDataComplete.
         */
        public Builder checkAfterDataComplete(Boolean checkAfterDataComplete) {
            this.checkAfterDataComplete = checkAfterDataComplete;
            return this;
        }

        /**
         * dimensions.
         */
        public Builder dimensions(java.util.List<java.util.Map<String, String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * entityFilter.
         */
        public Builder entityFilter(EntityFilter entityFilter) {
            this.entityFilter = entityFilter;
            return this;
        }

        /**
         * expr.
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * firstJoin.
         */
        public Builder firstJoin(AlertRuleSlsQueryJoin firstJoin) {
            this.firstJoin = firstJoin;
            return this;
        }

        /**
         * groupFieldList.
         */
        public Builder groupFieldList(java.util.List<String> groupFieldList) {
            this.groupFieldList = groupFieldList;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * groupType.
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * metric.
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * metricSet.
         */
        public Builder metricSet(String metricSet) {
            this.metricSet = metricSet;
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
         * queries.
         */
        public Builder queries(java.util.List<Queries> queries) {
            this.queries = queries;
            return this;
        }

        /**
         * relationType.
         */
        public Builder relationType(String relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * secondJoin.
         */
        public Builder secondJoin(AlertRuleSlsQueryJoin secondJoin) {
            this.secondJoin = secondJoin;
            return this;
        }

        /**
         * serviceIds.
         */
        public Builder serviceIds(java.util.List<String> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }

        /**
         * <p>查询类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AlertRuleQuery build() {
            return new AlertRuleQuery(this);
        } 

    } 

    /**
     * 
     * {@link AlertRuleQuery} extends {@link TeaModel}
     *
     * <p>AlertRuleQuery</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Filters(Builder builder) {
            this.field = builder.field;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String field; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.field = model.field;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleQuery} extends {@link TeaModel}
     *
     * <p>AlertRuleQuery</p>
     */
    public static class EntityFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("filters")
        private java.util.List<Filters> filters;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private EntityFilter(Builder builder) {
            this.domain = builder.domain;
            this.filters = builder.filters;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityFilter create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return filters
         */
        public java.util.List<Filters> getFilters() {
            return this.filters;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<Filters> filters; 
            private String type; 

            private Builder() {
            } 

            private Builder(EntityFilter model) {
                this.domain = model.domain;
                this.filters = model.filters;
                this.type = model.type;
            } 

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * filters.
             */
            public Builder filters(java.util.List<Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>查询类型</p>
             * <p>This parameter is required.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EntityFilter build() {
                return new EntityFilter(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleQuery} extends {@link TeaModel}
     *
     * <p>AlertRuleQuery</p>
     */
    public static class ApmFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dim")
        private String dim;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ApmFilters(Builder builder) {
            this.dim = builder.dim;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApmFilters create() {
            return builder().build();
        }

        /**
         * @return dim
         */
        public String getDim() {
            return this.dim;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String dim; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(ApmFilters model) {
                this.dim = model.dim;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * dim.
             */
            public Builder dim(String dim) {
                this.dim = dim;
                return this;
            }

            /**
             * <p>查询类型</p>
             * <p>This parameter is required.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ApmFilters build() {
                return new ApmFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleQuery} extends {@link TeaModel}
     *
     * <p>AlertRuleQuery</p>
     */
    public static class Queries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apmAlertMetricId")
        private String apmAlertMetricId;

        @com.aliyun.core.annotation.NameInMap("apmFilters")
        private java.util.List<ApmFilters> apmFilters;

        @com.aliyun.core.annotation.NameInMap("apmGroupBy")
        private java.util.List<String> apmGroupBy;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("end")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("start")
        private Long start;

        @com.aliyun.core.annotation.NameInMap("timeUnit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("window")
        private Long window;

        private Queries(Builder builder) {
            this.apmAlertMetricId = builder.apmAlertMetricId;
            this.apmFilters = builder.apmFilters;
            this.apmGroupBy = builder.apmGroupBy;
            this.duration = builder.duration;
            this.end = builder.end;
            this.expr = builder.expr;
            this.start = builder.start;
            this.timeUnit = builder.timeUnit;
            this.window = builder.window;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queries create() {
            return builder().build();
        }

        /**
         * @return apmAlertMetricId
         */
        public String getApmAlertMetricId() {
            return this.apmAlertMetricId;
        }

        /**
         * @return apmFilters
         */
        public java.util.List<ApmFilters> getApmFilters() {
            return this.apmFilters;
        }

        /**
         * @return apmGroupBy
         */
        public java.util.List<String> getApmGroupBy() {
            return this.apmGroupBy;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return window
         */
        public Long getWindow() {
            return this.window;
        }

        public static final class Builder {
            private String apmAlertMetricId; 
            private java.util.List<ApmFilters> apmFilters; 
            private java.util.List<String> apmGroupBy; 
            private Long duration; 
            private Long end; 
            private String expr; 
            private Long start; 
            private String timeUnit; 
            private Long window; 

            private Builder() {
            } 

            private Builder(Queries model) {
                this.apmAlertMetricId = model.apmAlertMetricId;
                this.apmFilters = model.apmFilters;
                this.apmGroupBy = model.apmGroupBy;
                this.duration = model.duration;
                this.end = model.end;
                this.expr = model.expr;
                this.start = model.start;
                this.timeUnit = model.timeUnit;
                this.window = model.window;
            } 

            /**
             * apmAlertMetricId.
             */
            public Builder apmAlertMetricId(String apmAlertMetricId) {
                this.apmAlertMetricId = apmAlertMetricId;
                return this;
            }

            /**
             * apmFilters.
             */
            public Builder apmFilters(java.util.List<ApmFilters> apmFilters) {
                this.apmFilters = apmFilters;
                return this;
            }

            /**
             * apmGroupBy.
             */
            public Builder apmGroupBy(java.util.List<String> apmGroupBy) {
                this.apmGroupBy = apmGroupBy;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>时间偏移结束时间(相对)，如果指定了start、end，则不指定window。</p>
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * <p>查询表达式</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>sls查询的时间偏移开始时间(相对)，如果指定了start、end，则不指定window。  例如：start=15， timeUnit=minute，表示15分钟前</p>
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * <p>start和end、window的时间单位： day/hour/minute/second</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>整点时间查询区间。  如果指定了window则不指定start、end</p>
             */
            public Builder window(Long window) {
                this.window = window;
                return this;
            }

            public Queries build() {
                return new Queries(this);
            } 

        } 

    }
}
