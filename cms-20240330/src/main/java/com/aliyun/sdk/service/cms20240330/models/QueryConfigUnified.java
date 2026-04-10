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

    @com.aliyun.core.annotation.NameInMap("filterList")
    private java.util.List<ApmFilterConfig> filterList;

    @com.aliyun.core.annotation.NameInMap("labelFilters")
    private java.util.List<UmodelLabelFilter> labelFilters;

    @com.aliyun.core.annotation.NameInMap("measureList")
    private java.util.List<ApmMeasureConfig> measureList;

    @com.aliyun.core.annotation.NameInMap("metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("metricSet")
    private String metricSet;

    @com.aliyun.core.annotation.NameInMap("promQl")
    private String promQl;

    @com.aliyun.core.annotation.NameInMap("serviceIdList")
    private java.util.List<String> serviceIdList;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private QueryConfigUnified(Builder builder) {
        this.enableDataCompleteCheck = builder.enableDataCompleteCheck;
        this.entityDomain = builder.entityDomain;
        this.entityFields = builder.entityFields;
        this.entityFilters = builder.entityFilters;
        this.entityType = builder.entityType;
        this.filterList = builder.filterList;
        this.labelFilters = builder.labelFilters;
        this.measureList = builder.measureList;
        this.metric = builder.metric;
        this.metricSet = builder.metricSet;
        this.promQl = builder.promQl;
        this.serviceIdList = builder.serviceIdList;
        this.type = builder.type;
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
     * @return filterList
     */
    public java.util.List<ApmFilterConfig> getFilterList() {
        return this.filterList;
    }

    /**
     * @return labelFilters
     */
    public java.util.List<UmodelLabelFilter> getLabelFilters() {
        return this.labelFilters;
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
     * @return promQl
     */
    public String getPromQl() {
        return this.promQl;
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

    public static final class Builder {
        private Boolean enableDataCompleteCheck; 
        private String entityDomain; 
        private java.util.List<UmodelEntityField> entityFields; 
        private java.util.List<UmodelEntityFilter> entityFilters; 
        private String entityType; 
        private java.util.List<ApmFilterConfig> filterList; 
        private java.util.List<UmodelLabelFilter> labelFilters; 
        private java.util.List<ApmMeasureConfig> measureList; 
        private String metric; 
        private String metricSet; 
        private String promQl; 
        private java.util.List<String> serviceIdList; 
        private String type; 

        private Builder() {
        } 

        private Builder(QueryConfigUnified model) {
            this.enableDataCompleteCheck = model.enableDataCompleteCheck;
            this.entityDomain = model.entityDomain;
            this.entityFields = model.entityFields;
            this.entityFilters = model.entityFilters;
            this.entityType = model.entityType;
            this.filterList = model.filterList;
            this.labelFilters = model.labelFilters;
            this.measureList = model.measureList;
            this.metric = model.metric;
            this.metricSet = model.metricSet;
            this.promQl = model.promQl;
            this.serviceIdList = model.serviceIdList;
            this.type = model.type;
        } 

        /**
         * <p>是否启用数据完整性检查</p>
         */
        public Builder enableDataCompleteCheck(Boolean enableDataCompleteCheck) {
            this.enableDataCompleteCheck = enableDataCompleteCheck;
            return this;
        }

        /**
         * <p>实体所属域</p>
         */
        public Builder entityDomain(String entityDomain) {
            this.entityDomain = entityDomain;
            return this;
        }

        /**
         * <p>需要附带返回的实体字段</p>
         */
        public Builder entityFields(java.util.List<UmodelEntityField> entityFields) {
            this.entityFields = entityFields;
            return this;
        }

        /**
         * <p>实体过滤列表</p>
         */
        public Builder entityFilters(java.util.List<UmodelEntityFilter> entityFilters) {
            this.entityFilters = entityFilters;
            return this;
        }

        /**
         * <p>实体类型</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>APM 过滤条件列表</p>
         */
        public Builder filterList(java.util.List<ApmFilterConfig> filterList) {
            this.filterList = filterList;
            return this;
        }

        /**
         * <p>标签过滤条件</p>
         */
        public Builder labelFilters(java.util.List<UmodelLabelFilter> labelFilters) {
            this.labelFilters = labelFilters;
            return this;
        }

        /**
         * <p>APM 度量配置列表</p>
         */
        public Builder measureList(java.util.List<ApmMeasureConfig> measureList) {
            this.measureList = measureList;
            return this;
        }

        /**
         * <p>指标名称（type=UMODEL_METRICSET_QUERY）</p>
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * <p>指标集名称（type=UMODEL_METRICSET_QUERY）</p>
         */
        public Builder metricSet(String metricSet) {
            this.metricSet = metricSet;
            return this;
        }

        /**
         * <p>Prometheus 查询语句（type=PROMETHEUS_SINGLE_QUERY）</p>
         */
        public Builder promQl(String promQl) {
            this.promQl = promQl;
            return this;
        }

        /**
         * <p>服务 ID 列表（type=APM_MULTI_QUERY）</p>
         */
        public Builder serviceIdList(java.util.List<String> serviceIdList) {
            this.serviceIdList = serviceIdList;
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

        public QueryConfigUnified build() {
            return new QueryConfigUnified(this);
        } 

    } 

}
