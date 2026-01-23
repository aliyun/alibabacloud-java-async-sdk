// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpdateStandardRequest} extends {@link RequestModel}
 *
 * <p>UpdateStandardRequest</p>
 */
public class UpdateStandardRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateStandardRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStandardRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateStandardRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStandardRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateCommand = request.updateCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateStandardRequest build() {
            return new UpdateStandardRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class EffectiveTimeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private EffectiveTimeConfig(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveTimeConfig create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(EffectiveTimeConfig model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.type = model.type;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TIME_PERIOD</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EffectiveTimeConfig build() {
                return new EffectiveTimeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class AttributeMonitorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("IsCaseSensitive")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isCaseSensitive;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private AttributeMonitorConfig(Builder builder) {
            this.columnName = builder.columnName;
            this.isCaseSensitive = builder.isCaseSensitive;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeMonitorConfig create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return isCaseSensitive
         */
        public Boolean getIsCaseSensitive() {
            return this.isCaseSensitive;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String columnName; 
            private Boolean isCaseSensitive; 
            private String type; 

            private Builder() {
            } 

            private Builder(AttributeMonitorConfig model) {
                this.columnName = model.columnName;
                this.isCaseSensitive = model.isCaseSensitive;
                this.type = model.type;
            } 

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder isCaseSensitive(Boolean isCaseSensitive) {
                this.isCaseSensitive = isCaseSensitive;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>METADATA</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AttributeMonitorConfig build() {
                return new AttributeMonitorConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class QualityRuleTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private QualityRuleTemplate(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityRuleTemplate create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(QualityRuleTemplate model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMIZED</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMIZED</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public QualityRuleTemplate build() {
                return new QualityRuleTemplate(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class RuleConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private RuleConfigList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConfigList create() {
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

            private Builder(RuleConfigList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuleConfigList build() {
                return new RuleConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class RuleValidateConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operator;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RuleValidateConfigList(Builder builder) {
            this.id = builder.id;
            this.metric = builder.metric;
            this.metricName = builder.metricName;
            this.operator = builder.operator;
            this.parentId = builder.parentId;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleValidateConfigList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
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
            private String id; 
            private String metric; 
            private String metricName; 
            private String operator; 
            private String parentId; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(RuleValidateConfigList model) {
                this.id = model.id;
                this.metric = model.metric;
                this.metricName = model.metricName;
                this.operator = model.operator;
                this.parentId = model.parentId;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Metric.
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RELATION</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuleValidateConfigList build() {
                return new RuleValidateConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class StandardMonitorConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeId")
        private Long attributeId;

        @com.aliyun.core.annotation.NameInMap("AttributeMonitorConfig")
        private AttributeMonitorConfig attributeMonitorConfig;

        @com.aliyun.core.annotation.NameInMap("AttributeName")
        private String attributeName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MonitorFrom")
        @com.aliyun.core.annotation.Validation(required = true)
        private String monitorFrom;

        @com.aliyun.core.annotation.NameInMap("QualityRuleTemplate")
        private QualityRuleTemplate qualityRuleTemplate;

        @com.aliyun.core.annotation.NameInMap("RuleConfigList")
        private java.util.List<RuleConfigList> ruleConfigList;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleSubType")
        private String ruleSubType;

        @com.aliyun.core.annotation.NameInMap("RuleValidateConfigList")
        private java.util.List<RuleValidateConfigList> ruleValidateConfigList;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private StandardMonitorConfigList(Builder builder) {
            this.attributeId = builder.attributeId;
            this.attributeMonitorConfig = builder.attributeMonitorConfig;
            this.attributeName = builder.attributeName;
            this.description = builder.description;
            this.id = builder.id;
            this.monitorFrom = builder.monitorFrom;
            this.qualityRuleTemplate = builder.qualityRuleTemplate;
            this.ruleConfigList = builder.ruleConfigList;
            this.ruleName = builder.ruleName;
            this.ruleSubType = builder.ruleSubType;
            this.ruleValidateConfigList = builder.ruleValidateConfigList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardMonitorConfigList create() {
            return builder().build();
        }

        /**
         * @return attributeId
         */
        public Long getAttributeId() {
            return this.attributeId;
        }

        /**
         * @return attributeMonitorConfig
         */
        public AttributeMonitorConfig getAttributeMonitorConfig() {
            return this.attributeMonitorConfig;
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return monitorFrom
         */
        public String getMonitorFrom() {
            return this.monitorFrom;
        }

        /**
         * @return qualityRuleTemplate
         */
        public QualityRuleTemplate getQualityRuleTemplate() {
            return this.qualityRuleTemplate;
        }

        /**
         * @return ruleConfigList
         */
        public java.util.List<RuleConfigList> getRuleConfigList() {
            return this.ruleConfigList;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleSubType
         */
        public String getRuleSubType() {
            return this.ruleSubType;
        }

        /**
         * @return ruleValidateConfigList
         */
        public java.util.List<RuleValidateConfigList> getRuleValidateConfigList() {
            return this.ruleValidateConfigList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long attributeId; 
            private AttributeMonitorConfig attributeMonitorConfig; 
            private String attributeName; 
            private String description; 
            private Long id; 
            private String monitorFrom; 
            private QualityRuleTemplate qualityRuleTemplate; 
            private java.util.List<RuleConfigList> ruleConfigList; 
            private String ruleName; 
            private String ruleSubType; 
            private java.util.List<RuleValidateConfigList> ruleValidateConfigList; 
            private String type; 

            private Builder() {
            } 

            private Builder(StandardMonitorConfigList model) {
                this.attributeId = model.attributeId;
                this.attributeMonitorConfig = model.attributeMonitorConfig;
                this.attributeName = model.attributeName;
                this.description = model.description;
                this.id = model.id;
                this.monitorFrom = model.monitorFrom;
                this.qualityRuleTemplate = model.qualityRuleTemplate;
                this.ruleConfigList = model.ruleConfigList;
                this.ruleName = model.ruleName;
                this.ruleSubType = model.ruleSubType;
                this.ruleValidateConfigList = model.ruleValidateConfigList;
                this.type = model.type;
            } 

            /**
             * AttributeId.
             */
            public Builder attributeId(Long attributeId) {
                this.attributeId = attributeId;
                return this;
            }

            /**
             * AttributeMonitorConfig.
             */
            public Builder attributeMonitorConfig(AttributeMonitorConfig attributeMonitorConfig) {
                this.attributeMonitorConfig = attributeMonitorConfig;
                return this;
            }

            /**
             * AttributeName.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BY_SYSTEM_ATTRIBUTE</p>
             */
            public Builder monitorFrom(String monitorFrom) {
                this.monitorFrom = monitorFrom;
                return this;
            }

            /**
             * QualityRuleTemplate.
             */
            public Builder qualityRuleTemplate(QualityRuleTemplate qualityRuleTemplate) {
                this.qualityRuleTemplate = qualityRuleTemplate;
                return this;
            }

            /**
             * RuleConfigList.
             */
            public Builder ruleConfigList(java.util.List<RuleConfigList> ruleConfigList) {
                this.ruleConfigList = ruleConfigList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleSubType.
             */
            public Builder ruleSubType(String ruleSubType) {
                this.ruleSubType = ruleSubType;
                return this;
            }

            /**
             * RuleValidateConfigList.
             */
            public Builder ruleValidateConfigList(java.util.List<RuleValidateConfigList> ruleValidateConfigList) {
                this.ruleValidateConfigList = ruleValidateConfigList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>METADATA</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StandardMonitorConfigList build() {
                return new StandardMonitorConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class StandardGeneralMonitorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardMonitorConfigList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<StandardMonitorConfigList> standardMonitorConfigList;

        private StandardGeneralMonitorConfig(Builder builder) {
            this.standardMonitorConfigList = builder.standardMonitorConfigList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardGeneralMonitorConfig create() {
            return builder().build();
        }

        /**
         * @return standardMonitorConfigList
         */
        public java.util.List<StandardMonitorConfigList> getStandardMonitorConfigList() {
            return this.standardMonitorConfigList;
        }

        public static final class Builder {
            private java.util.List<StandardMonitorConfigList> standardMonitorConfigList; 

            private Builder() {
            } 

            private Builder(StandardGeneralMonitorConfig model) {
                this.standardMonitorConfigList = model.standardMonitorConfigList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder standardMonitorConfigList(java.util.List<StandardMonitorConfigList> standardMonitorConfigList) {
                this.standardMonitorConfigList = standardMonitorConfigList;
                return this;
            }

            public StandardGeneralMonitorConfig build() {
                return new StandardGeneralMonitorConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class StandardSetReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        private StandardSetReference(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardSetReference create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private Long id; 

            private Builder() {
            } 

            private Builder(StandardSetReference model) {
                this.id = model.id;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public StandardSetReference build() {
                return new StandardSetReference(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class AttributeValueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeId")
        private Long attributeId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AttributeValueList(Builder builder) {
            this.attributeId = builder.attributeId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeValueList create() {
            return builder().build();
        }

        /**
         * @return attributeId
         */
        public Long getAttributeId() {
            return this.attributeId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long attributeId; 
            private String value; 

            private Builder() {
            } 

            private Builder(AttributeValueList model) {
                this.attributeId = model.attributeId;
                this.value = model.value;
            } 

            /**
             * AttributeId.
             */
            public Builder attributeId(Long attributeId) {
                this.attributeId = attributeId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AttributeValueList build() {
                return new AttributeValueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class StandardTemplateReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeValueList")
        private java.util.List<AttributeValueList> attributeValueList;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private StandardTemplateReference(Builder builder) {
            this.attributeValueList = builder.attributeValueList;
            this.id = builder.id;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardTemplateReference create() {
            return builder().build();
        }

        /**
         * @return attributeValueList
         */
        public java.util.List<AttributeValueList> getAttributeValueList() {
            return this.attributeValueList;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List<AttributeValueList> attributeValueList; 
            private Long id; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(StandardTemplateReference model) {
                this.attributeValueList = model.attributeValueList;
                this.id = model.id;
                this.version = model.version;
            } 

            /**
             * AttributeValueList.
             */
            public Builder attributeValueList(java.util.List<AttributeValueList> attributeValueList) {
                this.attributeValueList = attributeValueList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public StandardTemplateReference build() {
                return new StandardTemplateReference(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectiveTimeConfig")
        private EffectiveTimeConfig effectiveTimeConfig;

        @com.aliyun.core.annotation.NameInMap("NeedGenerateStandardCode")
        private Boolean needGenerateStandardCode;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("StandardGeneralMonitorConfig")
        private StandardGeneralMonitorConfig standardGeneralMonitorConfig;

        @com.aliyun.core.annotation.NameInMap("StandardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long standardId;

        @com.aliyun.core.annotation.NameInMap("StandardSetReference")
        @com.aliyun.core.annotation.Validation(required = true)
        private StandardSetReference standardSetReference;

        @com.aliyun.core.annotation.NameInMap("StandardStatus")
        @com.aliyun.core.annotation.Validation(required = true)
        private String standardStatus;

        @com.aliyun.core.annotation.NameInMap("StandardTemplateReference")
        @com.aliyun.core.annotation.Validation(required = true)
        private StandardTemplateReference standardTemplateReference;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private UpdateCommand(Builder builder) {
            this.description = builder.description;
            this.effectiveTimeConfig = builder.effectiveTimeConfig;
            this.needGenerateStandardCode = builder.needGenerateStandardCode;
            this.owner = builder.owner;
            this.standardGeneralMonitorConfig = builder.standardGeneralMonitorConfig;
            this.standardId = builder.standardId;
            this.standardSetReference = builder.standardSetReference;
            this.standardStatus = builder.standardStatus;
            this.standardTemplateReference = builder.standardTemplateReference;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectiveTimeConfig
         */
        public EffectiveTimeConfig getEffectiveTimeConfig() {
            return this.effectiveTimeConfig;
        }

        /**
         * @return needGenerateStandardCode
         */
        public Boolean getNeedGenerateStandardCode() {
            return this.needGenerateStandardCode;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return standardGeneralMonitorConfig
         */
        public StandardGeneralMonitorConfig getStandardGeneralMonitorConfig() {
            return this.standardGeneralMonitorConfig;
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        /**
         * @return standardSetReference
         */
        public StandardSetReference getStandardSetReference() {
            return this.standardSetReference;
        }

        /**
         * @return standardStatus
         */
        public String getStandardStatus() {
            return this.standardStatus;
        }

        /**
         * @return standardTemplateReference
         */
        public StandardTemplateReference getStandardTemplateReference() {
            return this.standardTemplateReference;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String description; 
            private EffectiveTimeConfig effectiveTimeConfig; 
            private Boolean needGenerateStandardCode; 
            private String owner; 
            private StandardGeneralMonitorConfig standardGeneralMonitorConfig; 
            private Long standardId; 
            private StandardSetReference standardSetReference; 
            private String standardStatus; 
            private StandardTemplateReference standardTemplateReference; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.description = model.description;
                this.effectiveTimeConfig = model.effectiveTimeConfig;
                this.needGenerateStandardCode = model.needGenerateStandardCode;
                this.owner = model.owner;
                this.standardGeneralMonitorConfig = model.standardGeneralMonitorConfig;
                this.standardId = model.standardId;
                this.standardSetReference = model.standardSetReference;
                this.standardStatus = model.standardStatus;
                this.standardTemplateReference = model.standardTemplateReference;
                this.version = model.version;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EffectiveTimeConfig.
             */
            public Builder effectiveTimeConfig(EffectiveTimeConfig effectiveTimeConfig) {
                this.effectiveTimeConfig = effectiveTimeConfig;
                return this;
            }

            /**
             * NeedGenerateStandardCode.
             */
            public Builder needGenerateStandardCode(Boolean needGenerateStandardCode) {
                this.needGenerateStandardCode = needGenerateStandardCode;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * StandardGeneralMonitorConfig.
             */
            public Builder standardGeneralMonitorConfig(StandardGeneralMonitorConfig standardGeneralMonitorConfig) {
                this.standardGeneralMonitorConfig = standardGeneralMonitorConfig;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder standardSetReference(StandardSetReference standardSetReference) {
                this.standardSetReference = standardSetReference;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>draft</p>
             */
            public Builder standardStatus(String standardStatus) {
                this.standardStatus = standardStatus;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder standardTemplateReference(StandardTemplateReference standardTemplateReference) {
                this.standardTemplateReference = standardTemplateReference;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
