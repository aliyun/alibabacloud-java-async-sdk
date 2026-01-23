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
 * {@link UpsertQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>UpsertQualityRuleRequest</p>
 */
public class UpsertQualityRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpsertCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpsertCommand upsertCommand;

    private UpsertQualityRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.upsertCommand = builder.upsertCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertQualityRuleRequest create() {
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
     * @return upsertCommand
     */
    public UpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static final class Builder extends Request.Builder<UpsertQualityRuleRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpsertCommand upsertCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpsertQualityRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.upsertCommand = request.upsertCommand;
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
        public Builder upsertCommand(UpsertCommand upsertCommand) {
            String upsertCommandShrink = shrink(upsertCommand, "UpsertCommand", "json");
            this.putBodyParameter("UpsertCommand", upsertCommandShrink);
            this.upsertCommand = upsertCommand;
            return this;
        }

        @Override
        public UpsertQualityRuleRequest build() {
            return new UpsertQualityRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpsertQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityRuleRequest</p>
     */
    public static class DefaultValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncludeMaxValue")
        private Boolean includeMaxValue;

        @com.aliyun.core.annotation.NameInMap("IncludeMinValue")
        private Boolean includeMinValue;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private String maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        private String minValue;

        @com.aliyun.core.annotation.NameInMap("ValueList")
        private java.util.List<String> valueList;

        private DefaultValue(Builder builder) {
            this.includeMaxValue = builder.includeMaxValue;
            this.includeMinValue = builder.includeMinValue;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.valueList = builder.valueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultValue create() {
            return builder().build();
        }

        /**
         * @return includeMaxValue
         */
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        /**
         * @return includeMinValue
         */
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        /**
         * @return maxValue
         */
        public String getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public String getMinValue() {
            return this.minValue;
        }

        /**
         * @return valueList
         */
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

        public static final class Builder {
            private Boolean includeMaxValue; 
            private Boolean includeMinValue; 
            private String maxValue; 
            private String minValue; 
            private java.util.List<String> valueList; 

            private Builder() {
            } 

            private Builder(DefaultValue model) {
                this.includeMaxValue = model.includeMaxValue;
                this.includeMinValue = model.includeMinValue;
                this.maxValue = model.maxValue;
                this.minValue = model.minValue;
                this.valueList = model.valueList;
            } 

            /**
             * IncludeMaxValue.
             */
            public Builder includeMaxValue(Boolean includeMaxValue) {
                this.includeMaxValue = includeMaxValue;
                return this;
            }

            /**
             * IncludeMinValue.
             */
            public Builder includeMinValue(Boolean includeMinValue) {
                this.includeMinValue = includeMinValue;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * ValueList.
             */
            public Builder valueList(java.util.List<String> valueList) {
                this.valueList = valueList;
                return this;
            }

            public DefaultValue build() {
                return new DefaultValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityRuleRequest</p>
     */
    public static class ValueConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private DefaultValue defaultValue;

        @com.aliyun.core.annotation.NameInMap("Length")
        private Integer length;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValueEnumList")
        private java.util.List<String> valueEnumList;

        private ValueConfig(Builder builder) {
            this.dataType = builder.dataType;
            this.defaultValue = builder.defaultValue;
            this.length = builder.length;
            this.type = builder.type;
            this.valueEnumList = builder.valueEnumList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueConfig create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return defaultValue
         */
        public DefaultValue getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return length
         */
        public Integer getLength() {
            return this.length;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return valueEnumList
         */
        public java.util.List<String> getValueEnumList() {
            return this.valueEnumList;
        }

        public static final class Builder {
            private String dataType; 
            private DefaultValue defaultValue; 
            private Integer length; 
            private String type; 
            private java.util.List<String> valueEnumList; 

            private Builder() {
            } 

            private Builder(ValueConfig model) {
                this.dataType = model.dataType;
                this.defaultValue = model.defaultValue;
                this.length = model.length;
                this.type = model.type;
                this.valueEnumList = model.valueEnumList;
            } 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(DefaultValue defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Length.
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * ValueEnumList.
             */
            public Builder valueEnumList(java.util.List<String> valueEnumList) {
                this.valueEnumList = valueEnumList;
                return this;
            }

            public ValueConfig build() {
                return new ValueConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityRuleRequest</p>
     */
    public static class AttributeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("Searchable")
        private Boolean searchable;

        @com.aliyun.core.annotation.NameInMap("ValueConfig")
        private ValueConfig valueConfig;

        private AttributeInfo(Builder builder) {
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.name = builder.name;
            this.required = builder.required;
            this.searchable = builder.searchable;
            this.valueConfig = builder.valueConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeInfo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
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
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return searchable
         */
        public Boolean getSearchable() {
            return this.searchable;
        }

        /**
         * @return valueConfig
         */
        public ValueConfig getValueConfig() {
            return this.valueConfig;
        }

        public static final class Builder {
            private String description; 
            private Boolean enabled; 
            private Long id; 
            private String name; 
            private Boolean required; 
            private Boolean searchable; 
            private ValueConfig valueConfig; 

            private Builder() {
            } 

            private Builder(AttributeInfo model) {
                this.description = model.description;
                this.enabled = model.enabled;
                this.id = model.id;
                this.name = model.name;
                this.required = model.required;
                this.searchable = model.searchable;
                this.valueConfig = model.valueConfig;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * Searchable.
             */
            public Builder searchable(Boolean searchable) {
                this.searchable = searchable;
                return this;
            }

            /**
             * ValueConfig.
             */
            public Builder valueConfig(ValueConfig valueConfig) {
                this.valueConfig = valueConfig;
                return this;
            }

            public AttributeInfo build() {
                return new AttributeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityRuleRequest</p>
     */
    public static class AttributeValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncludeMaxValue")
        private Boolean includeMaxValue;

        @com.aliyun.core.annotation.NameInMap("IncludeMinValue")
        private Boolean includeMinValue;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private String maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        private String minValue;

        @com.aliyun.core.annotation.NameInMap("ValueList")
        private java.util.List<String> valueList;

        private AttributeValue(Builder builder) {
            this.includeMaxValue = builder.includeMaxValue;
            this.includeMinValue = builder.includeMinValue;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.valueList = builder.valueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeValue create() {
            return builder().build();
        }

        /**
         * @return includeMaxValue
         */
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        /**
         * @return includeMinValue
         */
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        /**
         * @return maxValue
         */
        public String getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public String getMinValue() {
            return this.minValue;
        }

        /**
         * @return valueList
         */
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

        public static final class Builder {
            private Boolean includeMaxValue; 
            private Boolean includeMinValue; 
            private String maxValue; 
            private String minValue; 
            private java.util.List<String> valueList; 

            private Builder() {
            } 

            private Builder(AttributeValue model) {
                this.includeMaxValue = model.includeMaxValue;
                this.includeMinValue = model.includeMinValue;
                this.maxValue = model.maxValue;
                this.minValue = model.minValue;
                this.valueList = model.valueList;
            } 

            /**
             * IncludeMaxValue.
             */
            public Builder includeMaxValue(Boolean includeMaxValue) {
                this.includeMaxValue = includeMaxValue;
                return this;
            }

            /**
             * IncludeMinValue.
             */
            public Builder includeMinValue(Boolean includeMinValue) {
                this.includeMinValue = includeMinValue;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * ValueList.
             */
            public Builder valueList(java.util.List<String> valueList) {
                this.valueList = valueList;
                return this;
            }

            public AttributeValue build() {
                return new AttributeValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityRuleRequest</p>
     */
    public static class AttributeWithValueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeInfo")
        private AttributeInfo attributeInfo;

        @com.aliyun.core.annotation.NameInMap("AttributeValue")
        private AttributeValue attributeValue;

        private AttributeWithValueList(Builder builder) {
            this.attributeInfo = builder.attributeInfo;
            this.attributeValue = builder.attributeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeWithValueList create() {
            return builder().build();
        }

        /**
         * @return attributeInfo
         */
        public AttributeInfo getAttributeInfo() {
            return this.attributeInfo;
        }

        /**
         * @return attributeValue
         */
        public AttributeValue getAttributeValue() {
            return this.attributeValue;
        }

        public static final class Builder {
            private AttributeInfo attributeInfo; 
            private AttributeValue attributeValue; 

            private Builder() {
            } 

            private Builder(AttributeWithValueList model) {
                this.attributeInfo = model.attributeInfo;
                this.attributeValue = model.attributeValue;
            } 

            /**
             * AttributeInfo.
             */
            public Builder attributeInfo(AttributeInfo attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            /**
             * AttributeValue.
             */
            public Builder attributeValue(AttributeValue attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            public AttributeWithValueList build() {
                return new AttributeWithValueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityRuleRequest</p>
     */
    public static class FormPropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private FormPropertyList(Builder builder) {
            this.componentType = builder.componentType;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FormPropertyList create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String componentType; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(FormPropertyList model) {
                this.componentType = model.componentType;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FormPropertyList build() {
                return new FormPropertyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityRuleRequest</p>
     */
    public static class ValidateConditionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ValidateConditionList(Builder builder) {
            this.id = builder.id;
            this.metric = builder.metric;
            this.operator = builder.operator;
            this.parentId = builder.parentId;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidateConditionList create() {
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
            private String operator; 
            private String parentId; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(ValidateConditionList model) {
                this.id = model.id;
                this.metric = model.metric;
                this.operator = model.operator;
                this.parentId = model.parentId;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Id.
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
             * Operator.
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ValidateConditionList build() {
                return new ValidateConditionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityRuleRequest</p>
     */
    public static class UpsertCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeWithValueList")
        private java.util.List<AttributeWithValueList> attributeWithValueList;

        @com.aliyun.core.annotation.NameInMap("CatalogList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> catalogList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableErrorArchive")
        private Boolean enableErrorArchive;

        @com.aliyun.core.annotation.NameInMap("FormPropertyList")
        private java.util.List<FormPropertyList> formPropertyList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Strength")
        @com.aliyun.core.annotation.Validation(required = true)
        private String strength;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("ValidateConditionList")
        private java.util.List<ValidateConditionList> validateConditionList;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long watchId;

        private UpsertCommand(Builder builder) {
            this.attributeWithValueList = builder.attributeWithValueList;
            this.catalogList = builder.catalogList;
            this.description = builder.description;
            this.enableErrorArchive = builder.enableErrorArchive;
            this.formPropertyList = builder.formPropertyList;
            this.id = builder.id;
            this.name = builder.name;
            this.strength = builder.strength;
            this.templateId = builder.templateId;
            this.templateType = builder.templateType;
            this.validateConditionList = builder.validateConditionList;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpsertCommand create() {
            return builder().build();
        }

        /**
         * @return attributeWithValueList
         */
        public java.util.List<AttributeWithValueList> getAttributeWithValueList() {
            return this.attributeWithValueList;
        }

        /**
         * @return catalogList
         */
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableErrorArchive
         */
        public Boolean getEnableErrorArchive() {
            return this.enableErrorArchive;
        }

        /**
         * @return formPropertyList
         */
        public java.util.List<FormPropertyList> getFormPropertyList() {
            return this.formPropertyList;
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
         * @return strength
         */
        public String getStrength() {
            return this.strength;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return validateConditionList
         */
        public java.util.List<ValidateConditionList> getValidateConditionList() {
            return this.validateConditionList;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private java.util.List<AttributeWithValueList> attributeWithValueList; 
            private java.util.List<String> catalogList; 
            private String description; 
            private Boolean enableErrorArchive; 
            private java.util.List<FormPropertyList> formPropertyList; 
            private Long id; 
            private String name; 
            private String strength; 
            private Long templateId; 
            private String templateType; 
            private java.util.List<ValidateConditionList> validateConditionList; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(UpsertCommand model) {
                this.attributeWithValueList = model.attributeWithValueList;
                this.catalogList = model.catalogList;
                this.description = model.description;
                this.enableErrorArchive = model.enableErrorArchive;
                this.formPropertyList = model.formPropertyList;
                this.id = model.id;
                this.name = model.name;
                this.strength = model.strength;
                this.templateId = model.templateId;
                this.templateType = model.templateType;
                this.validateConditionList = model.validateConditionList;
                this.watchId = model.watchId;
            } 

            /**
             * AttributeWithValueList.
             */
            public Builder attributeWithValueList(java.util.List<AttributeWithValueList> attributeWithValueList) {
                this.attributeWithValueList = attributeWithValueList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder catalogList(java.util.List<String> catalogList) {
                this.catalogList = catalogList;
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
             * EnableErrorArchive.
             */
            public Builder enableErrorArchive(Boolean enableErrorArchive) {
                this.enableErrorArchive = enableErrorArchive;
                return this;
            }

            /**
             * FormPropertyList.
             */
            public Builder formPropertyList(java.util.List<FormPropertyList> formPropertyList) {
                this.formPropertyList = formPropertyList;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRONG</p>
             */
            public Builder strength(String strength) {
                this.strength = strength;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FIELD_NULL_VALUE_VALIDATE</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * ValidateConditionList.
             */
            public Builder validateConditionList(java.util.List<ValidateConditionList> validateConditionList) {
                this.validateConditionList = validateConditionList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public UpsertCommand build() {
                return new UpsertCommand(this);
            } 

        } 

    }
}
