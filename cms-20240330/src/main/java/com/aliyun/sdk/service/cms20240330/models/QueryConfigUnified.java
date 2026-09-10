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
 * {@link QueryConfigUnified} extends {@link TeaModel}
 *
 * <p>QueryConfigUnified</p>
 */
public class QueryConfigUnified extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aggregate")
    private String aggregate;

    @com.aliyun.core.annotation.NameInMap("checkAfterDataComplete")
    @Deprecated
    private Boolean checkAfterDataComplete;

    @com.aliyun.core.annotation.NameInMap("dimensions")
    private java.util.List<java.util.Map<String, String>> dimensions;

    @com.aliyun.core.annotation.NameInMap("durationSecs")
    private Long durationSecs;

    @com.aliyun.core.annotation.NameInMap("enableDataCompleteCheck")
    private Boolean enableDataCompleteCheck;

    @com.aliyun.core.annotation.NameInMap("entityDomain")
    private String entityDomain;

    @com.aliyun.core.annotation.NameInMap("entityFields")
    private java.util.List<EntityFields> entityFields;

    @com.aliyun.core.annotation.NameInMap("entityFilters")
    private java.util.List<EntityFilters> entityFilters;

    @com.aliyun.core.annotation.NameInMap("entityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("expr")
    private String expr;

    @com.aliyun.core.annotation.NameInMap("filterList")
    private java.util.List<FilterList> filterList;

    @com.aliyun.core.annotation.NameInMap("filterValues")
    private java.util.List<PrometheusMetricFilterValue> filterValues;

    @com.aliyun.core.annotation.NameInMap("groupFieldList")
    private java.util.List<String> groupFieldList;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("groupType")
    private String groupType;

    @com.aliyun.core.annotation.NameInMap("joinings")
    private java.util.List<Joinings> joinings;

    @com.aliyun.core.annotation.NameInMap("labelFilters")
    private java.util.List<LabelFilters> labelFilters;

    @com.aliyun.core.annotation.NameInMap("legacyRaw")
    private String legacyRaw;

    @com.aliyun.core.annotation.NameInMap("legacyType")
    private String legacyType;

    @com.aliyun.core.annotation.NameInMap("logSet")
    private String logSet;

    @com.aliyun.core.annotation.NameInMap("measureGroupKey")
    private String measureGroupKey;

    @com.aliyun.core.annotation.NameInMap("measureList")
    private java.util.List<MeasureList> measureList;

    @com.aliyun.core.annotation.NameInMap("metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("metricGroupId")
    private String metricGroupId;

    @com.aliyun.core.annotation.NameInMap("metricId")
    private String metricId;

    @com.aliyun.core.annotation.NameInMap("metricIds")
    @Deprecated
    private java.util.List<String> metricIds;

    @com.aliyun.core.annotation.NameInMap("metricSet")
    private String metricSet;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("offsetSecs")
    private Long offsetSecs;

    @com.aliyun.core.annotation.NameInMap("paramValues")
    private java.util.List<PrometheusMetricParamValue> paramValues;

    @com.aliyun.core.annotation.NameInMap("promQl")
    @Deprecated
    private String promQl;

    @com.aliyun.core.annotation.NameInMap("queries")
    private java.util.List<Queries> queries;

    @com.aliyun.core.annotation.NameInMap("relationType")
    private String relationType;

    @com.aliyun.core.annotation.NameInMap("serviceIdList")
    private java.util.List<String> serviceIdList;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("windowSecs")
    private Long windowSecs;

    private QueryConfigUnified(Builder builder) {
        this.aggregate = builder.aggregate;
        this.checkAfterDataComplete = builder.checkAfterDataComplete;
        this.dimensions = builder.dimensions;
        this.durationSecs = builder.durationSecs;
        this.enableDataCompleteCheck = builder.enableDataCompleteCheck;
        this.entityDomain = builder.entityDomain;
        this.entityFields = builder.entityFields;
        this.entityFilters = builder.entityFilters;
        this.entityType = builder.entityType;
        this.expr = builder.expr;
        this.filterList = builder.filterList;
        this.filterValues = builder.filterValues;
        this.groupFieldList = builder.groupFieldList;
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.joinings = builder.joinings;
        this.labelFilters = builder.labelFilters;
        this.legacyRaw = builder.legacyRaw;
        this.legacyType = builder.legacyType;
        this.logSet = builder.logSet;
        this.measureGroupKey = builder.measureGroupKey;
        this.measureList = builder.measureList;
        this.metric = builder.metric;
        this.metricGroupId = builder.metricGroupId;
        this.metricId = builder.metricId;
        this.metricIds = builder.metricIds;
        this.metricSet = builder.metricSet;
        this.namespace = builder.namespace;
        this.offsetSecs = builder.offsetSecs;
        this.paramValues = builder.paramValues;
        this.promQl = builder.promQl;
        this.queries = builder.queries;
        this.relationType = builder.relationType;
        this.serviceIdList = builder.serviceIdList;
        this.type = builder.type;
        this.windowSecs = builder.windowSecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConfigUnified create() {
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
     * @return durationSecs
     */
    public Long getDurationSecs() {
        return this.durationSecs;
    }

    /**
     * @return enableDataCompleteCheck
     */
    public Boolean getEnableDataCompleteCheck() {
        return this.enableDataCompleteCheck;
    }

    /**
     * @return entityDomain
     */
    public String getEntityDomain() {
        return this.entityDomain;
    }

    /**
     * @return entityFields
     */
    public java.util.List<EntityFields> getEntityFields() {
        return this.entityFields;
    }

    /**
     * @return entityFilters
     */
    public java.util.List<EntityFilters> getEntityFilters() {
        return this.entityFilters;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return expr
     */
    public String getExpr() {
        return this.expr;
    }

    /**
     * @return filterList
     */
    public java.util.List<FilterList> getFilterList() {
        return this.filterList;
    }

    /**
     * @return filterValues
     */
    public java.util.List<PrometheusMetricFilterValue> getFilterValues() {
        return this.filterValues;
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
     * @return joinings
     */
    public java.util.List<Joinings> getJoinings() {
        return this.joinings;
    }

    /**
     * @return labelFilters
     */
    public java.util.List<LabelFilters> getLabelFilters() {
        return this.labelFilters;
    }

    /**
     * @return legacyRaw
     */
    public String getLegacyRaw() {
        return this.legacyRaw;
    }

    /**
     * @return legacyType
     */
    public String getLegacyType() {
        return this.legacyType;
    }

    /**
     * @return logSet
     */
    public String getLogSet() {
        return this.logSet;
    }

    /**
     * @return measureGroupKey
     */
    public String getMeasureGroupKey() {
        return this.measureGroupKey;
    }

    /**
     * @return measureList
     */
    public java.util.List<MeasureList> getMeasureList() {
        return this.measureList;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return metricGroupId
     */
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    /**
     * @return metricId
     */
    public String getMetricId() {
        return this.metricId;
    }

    /**
     * @return metricIds
     */
    public java.util.List<String> getMetricIds() {
        return this.metricIds;
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
     * @return paramValues
     */
    public java.util.List<PrometheusMetricParamValue> getParamValues() {
        return this.paramValues;
    }

    /**
     * @return promQl
     */
    public String getPromQl() {
        return this.promQl;
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
     * @return serviceIdList
     */
    public java.util.List<String> getServiceIdList() {
        return this.serviceIdList;
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
        private Long durationSecs; 
        private Boolean enableDataCompleteCheck; 
        private String entityDomain; 
        private java.util.List<EntityFields> entityFields; 
        private java.util.List<EntityFilters> entityFilters; 
        private String entityType; 
        private String expr; 
        private java.util.List<FilterList> filterList; 
        private java.util.List<PrometheusMetricFilterValue> filterValues; 
        private java.util.List<String> groupFieldList; 
        private String groupId; 
        private String groupType; 
        private java.util.List<Joinings> joinings; 
        private java.util.List<LabelFilters> labelFilters; 
        private String legacyRaw; 
        private String legacyType; 
        private String logSet; 
        private String measureGroupKey; 
        private java.util.List<MeasureList> measureList; 
        private String metric; 
        private String metricGroupId; 
        private String metricId; 
        private java.util.List<String> metricIds; 
        private String metricSet; 
        private String namespace; 
        private Long offsetSecs; 
        private java.util.List<PrometheusMetricParamValue> paramValues; 
        private String promQl; 
        private java.util.List<Queries> queries; 
        private String relationType; 
        private java.util.List<String> serviceIdList; 
        private String type; 
        private Long windowSecs; 

        private Builder() {
        } 

        private Builder(QueryConfigUnified model) {
            this.aggregate = model.aggregate;
            this.checkAfterDataComplete = model.checkAfterDataComplete;
            this.dimensions = model.dimensions;
            this.durationSecs = model.durationSecs;
            this.enableDataCompleteCheck = model.enableDataCompleteCheck;
            this.entityDomain = model.entityDomain;
            this.entityFields = model.entityFields;
            this.entityFilters = model.entityFilters;
            this.entityType = model.entityType;
            this.expr = model.expr;
            this.filterList = model.filterList;
            this.filterValues = model.filterValues;
            this.groupFieldList = model.groupFieldList;
            this.groupId = model.groupId;
            this.groupType = model.groupType;
            this.joinings = model.joinings;
            this.labelFilters = model.labelFilters;
            this.legacyRaw = model.legacyRaw;
            this.legacyType = model.legacyType;
            this.logSet = model.logSet;
            this.measureGroupKey = model.measureGroupKey;
            this.measureList = model.measureList;
            this.metric = model.metric;
            this.metricGroupId = model.metricGroupId;
            this.metricId = model.metricId;
            this.metricIds = model.metricIds;
            this.metricSet = model.metricSet;
            this.namespace = model.namespace;
            this.offsetSecs = model.offsetSecs;
            this.paramValues = model.paramValues;
            this.promQl = model.promQl;
            this.queries = model.queries;
            this.relationType = model.relationType;
            this.serviceIdList = model.serviceIdList;
            this.type = model.type;
            this.windowSecs = model.windowSecs;
        } 

        /**
         * <p>The aggregate functions. Used when type=UMODEL_METRICSET_QUERY / UMODEL_LOGSET_QUERY.</p>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Specifies whether to perform alert detection only after data is complete (originally used when type=PROMETHEUS_MULTI_QUERY). This field overlaps with enableDataCompleteCheck. Using this field on write path returns 400.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder checkAfterDataComplete(Boolean checkAfterDataComplete) {
            this.checkAfterDataComplete = checkAfterDataComplete;
            return this;
        }

        /**
         * <p>The list of dimensions. This parameter is used when type is set to CLOUD_MONITORING_QUERY. Each dimension is a key/value string mapping.</p>
         */
        public Builder dimensions(java.util.List<java.util.Map<String, String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The duration in seconds. Used when type=PROMETHEUS_MULTI_QUERY.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder durationSecs(Long durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }

        /**
         * <p>Indicates whether data integrity check is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDataCompleteCheck(Boolean enableDataCompleteCheck) {
            this.enableDataCompleteCheck = enableDataCompleteCheck;
            return this;
        }

        /**
         * <p>The entity domain.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s</p>
         */
        public Builder entityDomain(String entityDomain) {
            this.entityDomain = entityDomain;
            return this;
        }

        /**
         * <p>The entity fields to include in the response.</p>
         */
        public Builder entityFields(java.util.List<EntityFields> entityFields) {
            this.entityFields = entityFields;
            return this;
        }

        /**
         * <p>The entity filter list.</p>
         */
        public Builder entityFilters(java.util.List<EntityFilters> entityFilters) {
            this.entityFilters = entityFilters;
            return this;
        }

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s.pod</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The query expression or SPL statement. Recommended when type=PROMETHEUS_SINGLE_QUERY. Optional when type=UMODEL_METRICSET_QUERY for custom SPL. Required when type=UMODEL_LOGSET_QUERY, where an SPL query statement must be provided (the business layer enforces this requirement).</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * <p>The APM filter condition list.</p>
         */
        public Builder filterList(java.util.List<FilterList> filterList) {
            this.filterList = filterList;
            return this;
        }

        /**
         * <p>The predefined metric filter value list (type=PROMETHEUS_PREDEFINED_METRIC_QUERY / PROMETHEUS_METRIC_GROUP_QUERY [deprecated]).</p>
         */
        public Builder filterValues(java.util.List<PrometheusMetricFilterValue> filterValues) {
            this.filterValues = filterValues;
            return this;
        }

        /**
         * <p>The list of group fields. This parameter is used when type is set to SLS_MULTI_QUERY and groupType is set to custom.</p>
         */
        public Builder groupFieldList(java.util.List<String> groupFieldList) {
            this.groupFieldList = groupFieldList;
            return this;
        }

        /**
         * <p>The group ID (type=CLOUD_MONITORING_QUERY). Dual semantics: og- prefix = observation group (GROUP_V2. The prefix itself conveys the semantics. relationType is not required. The backend resolves members through the entity store). Numeric only = application group (GROUP_V1 legacy resource group. Requires relationType=GROUP).</p>
         * 
         * <strong>example:</strong>
         * <p>og-845e0a26455f437c</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The grouping policy (used when type=SLS_MULTI_QUERY): none / label / custom.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The join list (used when type=SLS_MULTI_QUERY. Maximum of 2: joinings[0] corresponds to the set operation between query 0 and query 1. joinings[1] corresponds to the set operation between query 1 and query 2).</p>
         */
        public Builder joinings(java.util.List<Joinings> joinings) {
            this.joinings = joinings;
            return this;
        }

        /**
         * <p>The label filter conditions.</p>
         */
        public Builder labelFilters(java.util.List<LabelFilters> labelFilters) {
            this.labelFilters = labelFilters;
            return this;
        }

        /**
         * <p>The original V1 query JSON string returned as a fallback when type=UNKNOWN_QUERY and read path parsing fails. Contains the field values that triggered the failure, such as filter.operator=ABC. When the frontend detects that this field is not empty, display it as read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder legacyRaw(String legacyRaw) {
            this.legacyRaw = legacyRaw;
            return this;
        }

        /**
         * <p>Returned when type=UNKNOWN_QUERY. Indicates that this rule cannot be edited through the new API. Submit a ticket to contact the CloudMonitor product team.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder legacyType(String legacyType) {
            this.legacyType = legacyType;
            return this;
        }

        /**
         * <p>The log set name (type=UMODEL_LOGSET_QUERY).</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name</p>
         */
        public Builder logSet(String logSet) {
            this.logSet = logSet;
            return this;
        }

        /**
         * <p>The measure group key. This parameter is optional when type is set to APM_MULTI_QUERY. It corresponds to alertMetricInput.groupKey in V1.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder measureGroupKey(String measureGroupKey) {
            this.measureGroupKey = measureGroupKey;
            return this;
        }

        /**
         * <p>The APM measure configuration list.</p>
         */
        public Builder measureList(java.util.List<MeasureList> measureList) {
            this.measureList = measureList;
            return this;
        }

        /**
         * <p>The metric name (type=UMODEL_METRICSET_QUERY).</p>
         * 
         * <strong>example:</strong>
         * <p>node_cpu_seconds_total</p>
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * <p>The metric group ID (type=PROMETHEUS_PREDEFINED_METRIC_QUERY / PROMETHEUS_METRIC_GROUP_QUERY [deprecated]).</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder metricGroupId(String metricGroupId) {
            this.metricGroupId = metricGroupId;
            return this;
        }

        /**
         * <p>The predefined metric ID (type=PROMETHEUS_PREDEFINED_METRIC_QUERY).</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder metricId(String metricId) {
            this.metricId = metricId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The predefined metric ID list (originally used with type=PROMETHEUS_METRIC_GROUP_QUERY). This query type is deprecated. Write path returns 400.</p>
         */
        public Builder metricIds(java.util.List<String> metricIds) {
            this.metricIds = metricIds;
            return this;
        }

        /**
         * <p>The metric set name (type=UMODEL_METRICSET_QUERY).</p>
         * 
         * <strong>example:</strong>
         * <p>cms.acs_ecs_dashboard.CPUUtilization</p>
         */
        public Builder metricSet(String metricSet) {
            this.metricSet = metricSet;
            return this;
        }

        /**
         * <p>The CloudMonitor namespace (Alibaba Cloud service name, type=CLOUD_MONITORING_QUERY).</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The query time offset in seconds. Used when type=UMODEL_METRICSET_QUERY / UMODEL_LOGSET_QUERY. Works with windowSecs to implement an offset query over the range [T - windowSecs - offsetSecs, T - offsetSecs]. Valid range: [0, 86400].</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder offsetSecs(Long offsetSecs) {
            this.offsetSecs = offsetSecs;
            return this;
        }

        /**
         * <p>The predefined metric parameter value list (type=PROMETHEUS_PREDEFINED_METRIC_QUERY / PROMETHEUS_METRIC_GROUP_QUERY [deprecated]).</p>
         */
        public Builder paramValues(java.util.List<PrometheusMetricParamValue> paramValues) {
            this.paramValues = paramValues;
            return this;
        }

        /**
         * <p>The Prometheus query statement (type=PROMETHEUS_SINGLE_QUERY).</p>
         * 
         * <strong>example:</strong>
         * <p>avg(rate(node_cpu_seconds_total{mode=&quot;idle&quot;}[5m])) * 100</p>
         */
        public Builder promQl(String promQl) {
            this.promQl = promQl;
            return this;
        }

        /**
         * <p>The subquery list (polymorphic by type): When type=SLS_MULTI_QUERY, each entry is a SlsNamedQueryEntry (timeUnit/start/end/window/expr). When type=PROMETHEUS_MULTI_QUERY, each entry is a PrometheusNamedQueryEntry (name/expr). When type=UMODEL_METRICSET_MULTI_QUERY, each entry is a MetricSetNamedQueryEntry.</p>
         */
        public Builder queries(java.util.List<Queries> queries) {
            this.queries = queries;
            return this;
        }

        /**
         * <p>The resource association type (type=CLOUD_MONITORING_QUERY).</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder relationType(String relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * <p>The service ID list (type=APM_MULTI_QUERY).</p>
         */
        public Builder serviceIdList(java.util.List<String> serviceIdList) {
            this.serviceIdList = serviceIdList;
            return this;
        }

        /**
         * <p>The query type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS_SINGLE_QUERY</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The aggregation time window in seconds. Used when type=UMODEL_METRICSET_QUERY / UMODEL_LOGSET_QUERY. Valid range: [60, 86400].</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder windowSecs(Long windowSecs) {
            this.windowSecs = windowSecs;
            return this;
        }

        public QueryConfigUnified build() {
            return new QueryConfigUnified(this);
        } 

    } 

}
