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
         * aggregate.
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
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
         * durationSecs.
         */
        public Builder durationSecs(Long durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }

        /**
         * enableDataCompleteCheck.
         */
        public Builder enableDataCompleteCheck(Boolean enableDataCompleteCheck) {
            this.enableDataCompleteCheck = enableDataCompleteCheck;
            return this;
        }

        /**
         * entityDomain.
         */
        public Builder entityDomain(String entityDomain) {
            this.entityDomain = entityDomain;
            return this;
        }

        /**
         * entityFields.
         */
        public Builder entityFields(java.util.List<EntityFields> entityFields) {
            this.entityFields = entityFields;
            return this;
        }

        /**
         * entityFilters.
         */
        public Builder entityFilters(java.util.List<EntityFilters> entityFilters) {
            this.entityFilters = entityFilters;
            return this;
        }

        /**
         * entityType.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
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
         * filterList.
         */
        public Builder filterList(java.util.List<FilterList> filterList) {
            this.filterList = filterList;
            return this;
        }

        /**
         * filterValues.
         */
        public Builder filterValues(java.util.List<PrometheusMetricFilterValue> filterValues) {
            this.filterValues = filterValues;
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
         * joinings.
         */
        public Builder joinings(java.util.List<Joinings> joinings) {
            this.joinings = joinings;
            return this;
        }

        /**
         * labelFilters.
         */
        public Builder labelFilters(java.util.List<LabelFilters> labelFilters) {
            this.labelFilters = labelFilters;
            return this;
        }

        /**
         * legacyRaw.
         */
        public Builder legacyRaw(String legacyRaw) {
            this.legacyRaw = legacyRaw;
            return this;
        }

        /**
         * legacyType.
         */
        public Builder legacyType(String legacyType) {
            this.legacyType = legacyType;
            return this;
        }

        /**
         * logSet.
         */
        public Builder logSet(String logSet) {
            this.logSet = logSet;
            return this;
        }

        /**
         * measureGroupKey.
         */
        public Builder measureGroupKey(String measureGroupKey) {
            this.measureGroupKey = measureGroupKey;
            return this;
        }

        /**
         * measureList.
         */
        public Builder measureList(java.util.List<MeasureList> measureList) {
            this.measureList = measureList;
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
         * metricGroupId.
         */
        public Builder metricGroupId(String metricGroupId) {
            this.metricGroupId = metricGroupId;
            return this;
        }

        /**
         * metricId.
         */
        public Builder metricId(String metricId) {
            this.metricId = metricId;
            return this;
        }

        /**
         * metricIds.
         */
        public Builder metricIds(java.util.List<String> metricIds) {
            this.metricIds = metricIds;
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
         * offsetSecs.
         */
        public Builder offsetSecs(Long offsetSecs) {
            this.offsetSecs = offsetSecs;
            return this;
        }

        /**
         * paramValues.
         */
        public Builder paramValues(java.util.List<PrometheusMetricParamValue> paramValues) {
            this.paramValues = paramValues;
            return this;
        }

        /**
         * promQl.
         */
        public Builder promQl(String promQl) {
            this.promQl = promQl;
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
         * serviceIdList.
         */
        public Builder serviceIdList(java.util.List<String> serviceIdList) {
            this.serviceIdList = serviceIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * windowSecs.
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
