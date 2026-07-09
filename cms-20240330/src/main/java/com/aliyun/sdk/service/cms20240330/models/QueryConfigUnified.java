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

    @com.aliyun.core.annotation.NameInMap("dimensions")
    private java.util.List<java.util.Map<String, String>> dimensions;

    @com.aliyun.core.annotation.NameInMap("enableDataCompleteCheck")
    private Boolean enableDataCompleteCheck;

    @com.aliyun.core.annotation.NameInMap("entityDomain")
    private String entityDomain;

    @com.aliyun.core.annotation.NameInMap("entityFields")
    private java.util.List<UmodelEntityField> entityFields;

    @com.aliyun.core.annotation.NameInMap("entityFilters")
    private java.util.List<UmodelEntityFilter> entityFilters;

    @com.aliyun.core.annotation.NameInMap("entityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("expr")
    private String expr;

    @com.aliyun.core.annotation.NameInMap("filterList")
    private java.util.List<ApmFilterConfig> filterList;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("labelFilters")
    private java.util.List<UmodelLabelFilter> labelFilters;

    @com.aliyun.core.annotation.NameInMap("legacyRaw")
    private String legacyRaw;

    @com.aliyun.core.annotation.NameInMap("legacyType")
    private String legacyType;

    @com.aliyun.core.annotation.NameInMap("logSet")
    private String logSet;

    @com.aliyun.core.annotation.NameInMap("measureList")
    private java.util.List<ApmMeasureConfig> measureList;

    @com.aliyun.core.annotation.NameInMap("metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("metricSet")
    private String metricSet;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("offsetSecs")
    private Long offsetSecs;

    @com.aliyun.core.annotation.NameInMap("promQl")
    @Deprecated
    private String promQl;

    @com.aliyun.core.annotation.NameInMap("queries")
    private java.util.List<MetricSetNamedQueryEntry> queries;

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
        this.dimensions = builder.dimensions;
        this.enableDataCompleteCheck = builder.enableDataCompleteCheck;
        this.entityDomain = builder.entityDomain;
        this.entityFields = builder.entityFields;
        this.entityFilters = builder.entityFilters;
        this.entityType = builder.entityType;
        this.expr = builder.expr;
        this.filterList = builder.filterList;
        this.groupId = builder.groupId;
        this.labelFilters = builder.labelFilters;
        this.legacyRaw = builder.legacyRaw;
        this.legacyType = builder.legacyType;
        this.logSet = builder.logSet;
        this.measureList = builder.measureList;
        this.metric = builder.metric;
        this.metricSet = builder.metricSet;
        this.namespace = builder.namespace;
        this.offsetSecs = builder.offsetSecs;
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
     * @return dimensions
     */
    public java.util.List<java.util.Map<String, String>> getDimensions() {
        return this.dimensions;
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
    public java.util.List<UmodelEntityField> getEntityFields() {
        return this.entityFields;
    }

    /**
     * @return entityFilters
     */
    public java.util.List<UmodelEntityFilter> getEntityFilters() {
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
    public java.util.List<ApmFilterConfig> getFilterList() {
        return this.filterList;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return labelFilters
     */
    public java.util.List<UmodelLabelFilter> getLabelFilters() {
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
     * @return measureList
     */
    public java.util.List<ApmMeasureConfig> getMeasureList() {
        return this.measureList;
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
     * @return promQl
     */
    public String getPromQl() {
        return this.promQl;
    }

    /**
     * @return queries
     */
    public java.util.List<MetricSetNamedQueryEntry> getQueries() {
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
        private java.util.List<java.util.Map<String, String>> dimensions; 
        private Boolean enableDataCompleteCheck; 
        private String entityDomain; 
        private java.util.List<UmodelEntityField> entityFields; 
        private java.util.List<UmodelEntityFilter> entityFilters; 
        private String entityType; 
        private String expr; 
        private java.util.List<ApmFilterConfig> filterList; 
        private String groupId; 
        private java.util.List<UmodelLabelFilter> labelFilters; 
        private String legacyRaw; 
        private String legacyType; 
        private String logSet; 
        private java.util.List<ApmMeasureConfig> measureList; 
        private String metric; 
        private String metricSet; 
        private String namespace; 
        private Long offsetSecs; 
        private String promQl; 
        private java.util.List<MetricSetNamedQueryEntry> queries; 
        private String relationType; 
        private java.util.List<String> serviceIdList; 
        private String type; 
        private Long windowSecs; 

        private Builder() {
        } 

        private Builder(QueryConfigUnified model) {
            this.aggregate = model.aggregate;
            this.dimensions = model.dimensions;
            this.enableDataCompleteCheck = model.enableDataCompleteCheck;
            this.entityDomain = model.entityDomain;
            this.entityFields = model.entityFields;
            this.entityFilters = model.entityFilters;
            this.entityType = model.entityType;
            this.expr = model.expr;
            this.filterList = model.filterList;
            this.groupId = model.groupId;
            this.labelFilters = model.labelFilters;
            this.legacyRaw = model.legacyRaw;
            this.legacyType = model.legacyType;
            this.logSet = model.logSet;
            this.measureList = model.measureList;
            this.metric = model.metric;
            this.metricSet = model.metricSet;
            this.namespace = model.namespace;
            this.offsetSecs = model.offsetSecs;
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
         * dimensions.
         */
        public Builder dimensions(java.util.List<java.util.Map<String, String>> dimensions) {
            this.dimensions = dimensions;
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
        public Builder entityFields(java.util.List<UmodelEntityField> entityFields) {
            this.entityFields = entityFields;
            return this;
        }

        /**
         * entityFilters.
         */
        public Builder entityFilters(java.util.List<UmodelEntityFilter> entityFilters) {
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
        public Builder filterList(java.util.List<ApmFilterConfig> filterList) {
            this.filterList = filterList;
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
         * labelFilters.
         */
        public Builder labelFilters(java.util.List<UmodelLabelFilter> labelFilters) {
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
         * measureList.
         */
        public Builder measureList(java.util.List<ApmMeasureConfig> measureList) {
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
         * promQl.
         */
        public Builder promQl(String promQl) {
            this.promQl = promQl;
            return this;
        }

        /**
         * queries.
         */
        public Builder queries(java.util.List<MetricSetNamedQueryEntry> queries) {
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
