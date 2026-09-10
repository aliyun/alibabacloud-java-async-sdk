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
    @com.aliyun.core.annotation.NameInMap("aggregate")
    private String aggregate;

    @com.aliyun.core.annotation.NameInMap("checkAfterDataComplete")
    private Boolean checkAfterDataComplete;

    @com.aliyun.core.annotation.NameInMap("dimensions")
    private java.util.List<java.util.Map<String, String>> dimensions;

    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("entityFields")
    private java.util.List<EntityFields> entityFields;

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

    @com.aliyun.core.annotation.NameInMap("labelFilters")
    private java.util.List<LabelFilters> labelFilters;

    @com.aliyun.core.annotation.NameInMap("logSet")
    private String logSet;

    @com.aliyun.core.annotation.NameInMap("markTags")
    private java.util.List<MarkTags> markTags;

    @com.aliyun.core.annotation.NameInMap("metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("metricSet")
    private String metricSet;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("offsetSecs")
    private Long offsetSecs;

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

    @com.aliyun.core.annotation.NameInMap("windowSecs")
    private Long windowSecs;

    private AlertRuleQuery(Builder builder) {
        this.aggregate = builder.aggregate;
        this.checkAfterDataComplete = builder.checkAfterDataComplete;
        this.dimensions = builder.dimensions;
        this.domain = builder.domain;
        this.duration = builder.duration;
        this.entityFields = builder.entityFields;
        this.entityFilter = builder.entityFilter;
        this.expr = builder.expr;
        this.firstJoin = builder.firstJoin;
        this.groupFieldList = builder.groupFieldList;
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.labelFilters = builder.labelFilters;
        this.logSet = builder.logSet;
        this.markTags = builder.markTags;
        this.metric = builder.metric;
        this.metricSet = builder.metricSet;
        this.namespace = builder.namespace;
        this.offsetSecs = builder.offsetSecs;
        this.queries = builder.queries;
        this.relationType = builder.relationType;
        this.secondJoin = builder.secondJoin;
        this.serviceIds = builder.serviceIds;
        this.type = builder.type;
        this.windowSecs = builder.windowSecs;
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
     * @return aggregate
     */
    public String getAggregate() {
        return this.aggregate;
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
     * @return entityFields
     */
    public java.util.List<EntityFields> getEntityFields() {
        return this.entityFields;
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
     * @return labelFilters
     */
    public java.util.List<LabelFilters> getLabelFilters() {
        return this.labelFilters;
    }

    /**
     * @return logSet
     */
    public String getLogSet() {
        return this.logSet;
    }

    /**
     * @return markTags
     */
    public java.util.List<MarkTags> getMarkTags() {
        return this.markTags;
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
     * @return offsetSecs
     */
    public Long getOffsetSecs() {
        return this.offsetSecs;
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

    /**
     * @return windowSecs
     */
    public Long getWindowSecs() {
        return this.windowSecs;
    }

    public static final class Builder {
        private String aggregate; 
        private Boolean checkAfterDataComplete; 
        private java.util.List<java.util.Map<String, String>> dimensions; 
        private String domain; 
        private Long duration; 
        private java.util.List<EntityFields> entityFields; 
        private EntityFilter entityFilter; 
        private String expr; 
        private AlertRuleSlsQueryJoin firstJoin; 
        private java.util.List<String> groupFieldList; 
        private String groupId; 
        private String groupType; 
        private java.util.List<LabelFilters> labelFilters; 
        private String logSet; 
        private java.util.List<MarkTags> markTags; 
        private String metric; 
        private String metricSet; 
        private String namespace; 
        private Long offsetSecs; 
        private java.util.List<Queries> queries; 
        private String relationType; 
        private AlertRuleSlsQueryJoin secondJoin; 
        private java.util.List<String> serviceIds; 
        private String type; 
        private Long windowSecs; 

        private Builder() {
        } 

        private Builder(AlertRuleQuery model) {
            this.aggregate = model.aggregate;
            this.checkAfterDataComplete = model.checkAfterDataComplete;
            this.dimensions = model.dimensions;
            this.domain = model.domain;
            this.duration = model.duration;
            this.entityFields = model.entityFields;
            this.entityFilter = model.entityFilter;
            this.expr = model.expr;
            this.firstJoin = model.firstJoin;
            this.groupFieldList = model.groupFieldList;
            this.groupId = model.groupId;
            this.groupType = model.groupType;
            this.labelFilters = model.labelFilters;
            this.logSet = model.logSet;
            this.markTags = model.markTags;
            this.metric = model.metric;
            this.metricSet = model.metricSet;
            this.namespace = model.namespace;
            this.offsetSecs = model.offsetSecs;
            this.queries = model.queries;
            this.relationType = model.relationType;
            this.secondJoin = model.secondJoin;
            this.serviceIds = model.serviceIds;
            this.type = model.type;
            this.windowSecs = model.windowSecs;
        } 

        /**
         * <p>Specified when type=METRIC_SET_QUERY or LOG_SET_QUERY. The aggregation function: AVG, MAX, MIN, SUM, or LAST.</p>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        /**
         * <p>Applicable query type: PROMQL_QUERY.</p>
         * <p>Specifies whether to perform alert detection after data is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder checkAfterDataComplete(Boolean checkAfterDataComplete) {
            this.checkAfterDataComplete = checkAfterDataComplete;
            return this;
        }

        /**
         * <p>Applicable query type: CMS_BASIC_QUERY.  </p>
         * <p>The list of resource filter dimensions.</p>
         */
        public Builder dimensions(java.util.List<java.util.Map<String, String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The domain to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rum</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>Applicable query type: PROMQL_QUERY.</p>
         * <p>The alert data duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The array of entity field filters.</p>
         */
        public Builder entityFields(java.util.List<EntityFields> entityFields) {
            this.entityFields = entityFields;
            return this;
        }

        /**
         * <p>The resource filter used to filter target resources.</p>
         */
        public Builder entityFilter(EntityFilter entityFilter) {
            this.entityFilter = entityFilter;
            return this;
        }

        /**
         * <p>Applicable query type: PROMQL_QUERY.</p>
         * <p>The query expression (PromQL).</p>
         * 
         * <strong>example:</strong>
         * <p>sum(sum(max_over_time(kube_pod_status_phase{phase=~\&quot;Pending\&quot;,job=\&quot;_kube-state-metrics\&quot;}[5m])) by (pod)) &gt; 1000</p>
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.</p>
         * <p>The set join operation configuration for the results of subquery 1 (queries[0]) and subquery 2 (queries[1]).</p>
         */
        public Builder firstJoin(AlertRuleSlsQueryJoin firstJoin) {
            this.firstJoin = firstJoin;
            return this;
        }

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.</p>
         * <p>The list of group field names.</p>
         */
        public Builder groupFieldList(java.util.List<String> groupFieldList) {
            this.groupFieldList = groupFieldList;
            return this;
        }

        /**
         * <p>Applicable query type: CMS_BASIC_QUERY.</p>
         * <p>The associated application group ID. Valid only when relationType=GROUP.</p>
         * 
         * <strong>example:</strong>
         * <p>23423</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.</p>
         * <p>The grouping type. Valid values:</p>
         * <ul>
         * <li>none: no grouping</li>
         * <li>label: automatic label-based grouping</li>
         * <li>custom: custom label-based grouping</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>label</p>
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The array of label filters.</p>
         */
        public Builder labelFilters(java.util.List<LabelFilters> labelFilters) {
            this.labelFilters = labelFilters;
            return this;
        }

        /**
         * <p>Specified when type=LOG_SET_QUERY. The log set name.</p>
         * 
         * <strong>example:</strong>
         * <p>china-log-set</p>
         */
        public Builder logSet(String logSet) {
            this.logSet = logSet;
            return this;
        }

        /**
         * <p>The list of mark tags for the alert rule, used for categorization and retrieval.</p>
         */
        public Builder markTags(java.util.List<MarkTags> markTags) {
            this.markTags = markTags;
            return this;
        }

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * <p>The monitoring metrics set.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_usage</p>
         */
        public Builder metricSet(String metricSet) {
            this.metricSet = metricSet;
            return this;
        }

        /**
         * <p>Applicable query type: CMS_BASIC_QUERY.</p>
         * <p>The namespace of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Specified when type=METRIC_SET_QUERY or LOG_SET_QUERY. The query time offset in seconds. Used together with windowSecs to implement an offset query of [T - windowSecs - offsetSecs, T - offsetSecs]. Valid range: 0 to 86400.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offsetSecs(Long offsetSecs) {
            this.offsetSecs = offsetSecs;
            return this;
        }

        /**
         * <p>Applicable query types: SLS_MULTI_QUERY, APM_MULTI_QUERY.</p>
         * <p>The list of subqueries.</p>
         * <p>For the SLS_MULTI_QUERY query type, a maximum of three subqueries are supported. The number and order of subqueries must match the sub-datasource configurations in datasource.dsList.</p>
         */
        public Builder queries(java.util.List<Queries> queries) {
            this.queries = queries;
            return this;
        }

        /**
         * <p>Applicable query type: CMS_BASIC_QUERY.</p>
         * <p>The resource scope for the rule query. Valid values:</p>
         * <ul>
         * <li>USER: All resources under the user UID.</li>
         * <li>GROUP: Application group.</li>
         * <li>INSTANCE: Specified instance list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder relationType(String relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.</p>
         * <p>The set join operation configuration for the results of subquery 2 (queries[2]) and subquery 3 (queries[3]).</p>
         */
        public Builder secondJoin(AlertRuleSlsQueryJoin secondJoin) {
            this.secondJoin = secondJoin;
            return this;
        }

        /**
         * <p>The list of service IDs.</p>
         */
        public Builder serviceIds(java.util.List<String> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }

        /**
         * <p>The query type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PROMQL_QUERY: PromQL query.</li>
         * <li>SLS_MULTI_QUERY: SLS query.</li>
         * <li>APM_MULTI_QUERY: APM query.</li>
         * <li>CMS_BASIC_QUERY: CloudMonitor Basic monitoring query.</li>
         * </ul>
         * <p>Different query types have different valid fields in the query object. Refer to the &quot;Applicable query type&quot; description in each field for details.</p>
         * <p>The query type must match the datasource type. The mapping is as follows:</p>
         * <ul>
         * <li>Prometheus datasource (PROMETHEUS_DS): PROMQL_QUERY</li>
         * <li>APM datasource (APM_DS): APM_MULTI_QUERY</li>
         * <li>SLS datasource (SLS_MULTI_DS): SLS_MULTI_QUERY</li>
         * <li>CloudMonitor Basic monitoring data datasource (CMS_BASIC_DS): CMS_BASIC_QUERY</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMQL_QUERY</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>Specified when type=METRIC_SET_QUERY or LOG_SET_QUERY. The aggregation time window in seconds. Valid range: 60 to 86400.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder windowSecs(Long windowSecs) {
            this.windowSecs = windowSecs;
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
    public static class EntityFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private EntityFields(Builder builder) {
            this.field = builder.field;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityFields create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String field; 
            private String value; 

            private Builder() {
            } 

            private Builder(EntityFields model) {
                this.field = model.field;
                this.value = model.value;
            } 

            /**
             * <p>The entity field name.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceId</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The field value.</p>
             * 
             * <strong>example:</strong>
             * <p>i-abc123</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EntityFields build() {
                return new EntityFields(this);
            } 

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
             * <p>The field.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceId</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The comparison operator.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The matching value.</p>
             * 
             * <strong>example:</strong>
             * <p>wait_throw</p>
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
             * <p>The resource type domain.</p>
             * 
             * <strong>example:</strong>
             * <p>rum</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The list of filter conditions used to further filter resources.</p>
             */
            public Builder filters(java.util.List<Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>apm</p>
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
    public static class LabelFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private LabelFilters(Builder builder) {
            this.name = builder.name;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelFilters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String name; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(LabelFilters model) {
                this.name = model.name;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The comparison operator that determines how to match the label value.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The label value.</p>
             * 
             * <strong>example:</strong>
             * <p>web</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LabelFilters build() {
                return new LabelFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleQuery} extends {@link TeaModel}
     *
     * <p>AlertRuleQuery</p>
     */
    public static class MarkTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private MarkTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarkTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(MarkTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>region</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MarkTags build() {
                return new MarkTags(this);
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
             * <p>The dimension in the APM metric.</p>
             * 
             * <strong>example:</strong>
             * <p>rpcType</p>
             */
            public Builder dim(String dim) {
                this.dim = dim;
                return this;
            }

            /**
             * <p>The filter operation type. Valid values:</p>
             * <ul>
             * <li>eq: Equal to.</li>
             * <li>neq: Not equal to.</li>
             * <li>match: Regex match.</li>
             * <li>nmatch: Regex not match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value corresponding to the filter operation.</p>
             * 
             * <strong>example:</strong>
             * <p>h3ji7a0y9i@2ac80e27fdfd0a2</p>
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
    public static class QueriesLabelFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private QueriesLabelFilters(Builder builder) {
            this.name = builder.name;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueriesLabelFilters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String name; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(QueriesLabelFilters model) {
                this.name = model.name;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The key (label name) for the label filter.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The label filter operator, such as =, !=, =<del>, or !</del>.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The value for the label filter.</p>
             * 
             * <strong>example:</strong>
             * <p>web-01</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueriesLabelFilters build() {
                return new QueriesLabelFilters(this);
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

        @com.aliyun.core.annotation.NameInMap("labelFilters")
        private java.util.List<QueriesLabelFilters> labelFilters;

        @com.aliyun.core.annotation.NameInMap("metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("metricSet")
        private String metricSet;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("promQl")
        private String promQl;

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
            this.labelFilters = builder.labelFilters;
            this.metric = builder.metric;
            this.metricSet = builder.metricSet;
            this.name = builder.name;
            this.promQl = builder.promQl;
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
         * @return labelFilters
         */
        public java.util.List<QueriesLabelFilters> getLabelFilters() {
            return this.labelFilters;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return promQl
         */
        public String getPromQl() {
            return this.promQl;
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
            private java.util.List<QueriesLabelFilters> labelFilters; 
            private String metric; 
            private String metricSet; 
            private String name; 
            private String promQl; 
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
                this.labelFilters = model.labelFilters;
                this.metric = model.metric;
                this.metricSet = model.metricSet;
                this.name = model.name;
                this.promQl = model.promQl;
                this.start = model.start;
                this.timeUnit = model.timeUnit;
                this.window = model.window;
            } 

            /**
             * <p>Applicable query type: APM_MULTI_QUERY.</p>
             * <p>The ID of the APM predefined metric.</p>
             * 
             * <strong>example:</strong>
             * <p>appstat.jvm.ThreadNewCount</p>
             */
            public Builder apmAlertMetricId(String apmAlertMetricId) {
                this.apmAlertMetricId = apmAlertMetricId;
                return this;
            }

            /**
             * <p>Applicable query type: ARMS_MULTI_QUERY.</p>
             * <p>The dimension filter configuration for APM metrics. Must be used together with apmAlertMetricId.</p>
             */
            public Builder apmFilters(java.util.List<ApmFilters> apmFilters) {
                this.apmFilters = apmFilters;
                return this;
            }

            /**
             * <p>Applicable query type: ARMS_MULTI_QUERY.</p>
             * <p>The list of aggregation dimensions for the query, specifying which dimensions of the metric to aggregate by.</p>
             */
            public Builder apmGroupBy(java.util.List<String> apmGroupBy) {
                this.apmGroupBy = apmGroupBy;
                return this;
            }

            /**
             * <p>Applicable query type: ARMS_MULTI_QUERY.</p>
             * <p>The alert data duration.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Applicable query type: SLS_MULTI_QUERY.</p>
             * <p>The relative time offset end time.</p>
             * <p>If start and end are specified, do not specify window.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * <p>Applicable query types: APM_MULTI_QUERY, SLS_MULTI_QUERY.</p>
             * <p>The query expression.</p>
             * <ul>
             * <li>For APM_MULTI_QUERY, this field is optional and contains the PromQL generated for predefined metrics (used for data preview).</li>
             * <li>For SLS_MULTI_QUERY, this field contains the SQL query statement.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sum by (rpc,acs_arms_service_id,pid,rpcType) (sum_over_time_lorc(arms_app_requests_count_ign_destid_endpoint_parent_ppid_prpc{callKind=~\&quot;http|rpc|custom_entry|server|consumer\&quot;,pid=\&quot;gaddp9ap8q@cb005ffdf44b8ac\&quot;,source=\&quot;apm\&quot;}[1m]))</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>Valid only for METRIC_SET_MULTI_QUERY. The label filter conditions (optional, independent for each query).</p>
             */
            public Builder labelFilters(java.util.List<QueriesLabelFilters> labelFilters) {
                this.labelFilters = labelFilters;
                return this;
            }

            /**
             * <p>Valid only for METRIC_SET_MULTI_QUERY. The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>cpuUsage</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>Valid only for METRIC_SET_MULTI_QUERY. The metric set name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs_metrics</p>
             */
            public Builder metricSet(String metricSet) {
                this.metricSet = metricSet;
                return this;
            }

            /**
             * <p>The subquery name. Uniquely identifies the query within the same alert rule and can be referenced by the expression conditions in triggers.</p>
             * 
             * <strong>example:</strong>
             * <p>cpuUsageQuery</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The PromQL query statement. Used when type=APM_MULTI_QUERY.</p>
             * 
             * <strong>example:</strong>
             * <p>avg(rate(http_requests_total[5m]))</p>
             */
            public Builder promQl(String promQl) {
                this.promQl = promQl;
                return this;
            }

            /**
             * <p>Applicable query type: SLS_MULTI_QUERY.</p>
             * <p>The relative time offset start time for SLS queries.</p>
             * <p>If start and end are specified, do not specify window. Example: start=15, timeUnit=minute indicates 15 minutes ago.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * <p>Applicable query type: SLS_MULTI_QUERY.</p>
             * <p>The time unit for the start, end, and window parameters: day/hour/minute/second.</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>Applicable query type: SLS_MULTI_QUERY.</p>
             * <p>The time frame query interval. If window is specified, do not specify start or end.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
