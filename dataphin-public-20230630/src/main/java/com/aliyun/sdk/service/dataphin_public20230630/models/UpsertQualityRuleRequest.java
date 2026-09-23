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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpsertCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpsertCommand upsertCommand;

    private UpsertQualityRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
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
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
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
        private String opUserId; 
        private UpsertCommand upsertCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpsertQualityRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The tenant ID.</p>
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
         * <p>The ID of the operator user.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The update command.</p>
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
             * <p>Indicates whether the maximum value is included.</p>
             */
            public Builder includeMaxValue(Boolean includeMaxValue) {
                this.includeMaxValue = includeMaxValue;
                return this;
            }

            /**
             * <p>Indicates whether the minimum value is included.</p>
             */
            public Builder includeMinValue(Boolean includeMinValue) {
                this.includeMinValue = includeMinValue;
                return this;
            }

            /**
             * <p>The maximum value. This parameter applies to range interval properties.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum value. This parameter applies to range interval properties.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>The property value list. This parameter applies to properties whose input method is custom input, single-select dropdown, or multi-select dropdown.</p>
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
             * <p>The property field data type. Valid values:</p>
             * <ul>
             * <li>STRING: text.</li>
             * <li>BIGINT: integer.</li>
             * <li>DOUBLE: floating-point.</li>
             * <li>BOOLEAN: Boolean.</li>
             * <li>DATE: date.</li>
             * <li>DATETIME: datetime.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The property default value.</p>
             */
            public Builder defaultValue(DefaultValue defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The property field length. You can use this parameter to constrain the maximum length of text-type property values.</p>
             * 
             * <strong>example:</strong>
             * <p>986992</p>
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * <p>The property value input method. Valid values:</p>
             * <ul>
             * <li>CUSTOMIZED: custom input.</li>
             * <li>SINGLE_ENUM: single-select dropdown.</li>
             * <li>MULTIPLE_ENUMS: multi-select dropdown.</li>
             * <li>RANGE: range interval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMIZED</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The property option values. This parameter applies only to properties whose input method is single-select dropdown or multi-select dropdown.</p>
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
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the property is enabled.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The property ID.</p>
             * 
             * <strong>example:</strong>
             * <p>711484689131</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>attr01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the property is required.</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>Indicates whether the property is searchable.</p>
             */
            public Builder searchable(Boolean searchable) {
                this.searchable = searchable;
                return this;
            }

            /**
             * <p>The property value configuration details.</p>
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
             * <p>Indicates whether the maximum value is included.</p>
             */
            public Builder includeMaxValue(Boolean includeMaxValue) {
                this.includeMaxValue = includeMaxValue;
                return this;
            }

            /**
             * <p>Indicates whether the minimum value is included.</p>
             */
            public Builder includeMinValue(Boolean includeMinValue) {
                this.includeMinValue = includeMinValue;
                return this;
            }

            /**
             * <p>The maximum value. This parameter applies to range interval properties.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum value. This parameter applies to range interval properties.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>The property value list. This parameter applies to properties whose input method is custom input, single-select dropdown, or multi-select dropdown.</p>
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
             * <p>The property details.</p>
             */
            public Builder attributeInfo(AttributeInfo attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            /**
             * <p>The property value.</p>
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
             * <p>The control type.</p>
             * 
             * <strong>example:</strong>
             * <p>expression</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>col</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The property value.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
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
             * <p>The condition node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>268</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The metric.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>The operator. Valid values:</p>
             * <ul>
             * <li>EQUAL</li>
             * <li>NOT_EQUAL</li>
             * <li>LARGER</li>
             * <li>SMALLER</li>
             * <li>LARGE_OR_EQUAL</li>
             * <li>SMALLER_OR_EQUAL</li>
             * <li>AND</li>
             * <li>OR</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The parent condition node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The condition type. Valid values:</p>
             * <ul>
             * <li>RELATION: relationship.</li>
             * <li>EXPRESSION: expression.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RELATION</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
        @com.aliyun.core.annotation.NameInMap("ArchiveMode")
        private String archiveMode;

        @com.aliyun.core.annotation.NameInMap("ArchiveStoreType")
        private String archiveStoreType;

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
            this.archiveMode = builder.archiveMode;
            this.archiveStoreType = builder.archiveStoreType;
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
         * @return archiveMode
         */
        public String getArchiveMode() {
            return this.archiveMode;
        }

        /**
         * @return archiveStoreType
         */
        public String getArchiveStoreType() {
            return this.archiveStoreType;
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
            private String archiveMode; 
            private String archiveStoreType; 
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
                this.archiveMode = model.archiveMode;
                this.archiveStoreType = model.archiveStoreType;
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
             * <p>The exception archive mode. Valid values:</p>
             * <ul>
             * <li>ONLY_ERROR_FIELD: Archives only the exception fields.</li>
             * <li>FULL_RECORD: Archives the complete record.</li>
             * </ul>
             * <p>Default value: ONLY_ERROR_FIELD.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLY_ERROR_FIELD</p>
             */
            public Builder archiveMode(String archiveMode) {
                this.archiveMode = archiveMode;
                return this;
            }

            /**
             * <p>The exception archive storage type. Valid values:</p>
             * <ul>
             * <li>FILE_SYSTEM: File system.</li>
             * <li>CUSTOM_TABLE: Custom table.</li>
             * </ul>
             * <p>Default value: FILE_SYSTEM.</p>
             * 
             * <strong>example:</strong>
             * <p>FILE_SYSTEM</p>
             */
            public Builder archiveStoreType(String archiveStoreType) {
                this.archiveStoreType = archiveStoreType;
                return this;
            }

            /**
             * <p>The rule business property configuration.</p>
             */
            public Builder attributeWithValueList(java.util.List<AttributeWithValueList> attributeWithValueList) {
                this.attributeWithValueList = attributeWithValueList;
                return this;
            }

            /**
             * <p>The rule catalog. Valid values:</p>
             * <ul>
             * <li>CONSISTENT: consistency.</li>
             * <li>EFFECTIVE: validity.</li>
             * <li>TIMELINESE: timeliness.</li>
             * <li>ACCURATE: accuracy.</li>
             * <li>UNIQUENESS: uniqueness.</li>
             * <li>COMPLETENESS: completeness.</li>
             * <li>STABILITY: stability.</li>
             * <li>CUSTOM: custom.</li>
             * </ul>
             * <p>This parameter is required.</p>
             */
            public Builder catalogList(java.util.List<String> catalogList) {
                this.catalogList = catalogList;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether to enable error archiving.</p>
             */
            public Builder enableErrorArchive(Boolean enableErrorArchive) {
                this.enableErrorArchive = enableErrorArchive;
                return this;
            }

            /**
             * <p>The rule configuration key-value pairs. These are related to the templatetype. Different template types return different form key-value pair configurations.</p>
             */
            public Builder formPropertyList(java.util.List<FormPropertyList> formPropertyList) {
                this.formPropertyList = formPropertyList;
                return this;
            }

            /**
             * <p>The rule ID. If this parameter is not empty, the operation updates the rule. If this parameter is empty, the operation creates a rule.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the quality rule.</p>
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
             * <p>The rule strength. Valid values:</p>
             * <ul>
             * <li>STRONG</li>
             * <li>WEAK</li>
             * </ul>
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
             * <p>The template ID.</p>
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
             * <p>The templatetype. Valid values:</p>
             * <ul>
             * <li>FIELD_NULL_VALUE_VALIDATE: field null value check.</li>
             * <li>FIELD_EMPTY_STRING_VALIDATE: field empty string check.</li>
             * <li>FIELD_UNIQUE_VALIDATE: field uniqueness check.</li>
             * <li>FIELD_GROUP_COUNT_VALIDATE: field unique value count check.</li>
             * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: field duplicate value count check.</li>
             * <li>FUNCTION_TIME_COMPARE: time function comparison.</li>
             * <li>SINGLE_TABLE_TIME_COMPARE: single-table time field comparison.</li>
             * <li>DOUBLE_TABLE_TIME_COMPARE: two-table time field comparison.</li>
             * <li>FIELD_FORMAT_VALIDATE: field format check.</li>
             * <li>FIELD_LENGTH_VALIDATE: field length check.</li>
             * <li>FIELD_VALUE_RANGE_VALIDATE: field value range check.</li>
             * <li>CODE_TABLE_COMPARE: lookup table reference comparison.</li>
             * <li>STANDARD_CODE_TABLE_COMPARE: data standard lookup table reference comparison.</li>
             * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: single-table field value consistency comparison.</li>
             * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: single-table field statistical value consistency comparison.</li>
             * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: single-table field business logic consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: two-table field value consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: two-table field statistical value consistency comparison.</li>
             * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-source two-table field statistical value consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: two-table field business logic consistency comparison.</li>
             * <li>TABLE_STABILITY_VALIDATE: table stability check.</li>
             * <li>TABLE_FLUCTUATION_VALIDATE: table fluctuation check.</li>
             * <li>FIELD_STABILITY_VALIDATE: field stability check.</li>
             * <li>FIELD_FLUCTUATION_VALIDATE: field fluctuation check.</li>
             * <li>CUSTOM_STATISTICAL_VALIDATE: custom statistical metric check.</li>
             * <li>CUSTOM_DATA_DETAILS_VALIDATE: custom data details check.</li>
             * <li>DATASOURCE_AVAILABLE_CHECK: datasource connectivity monitoring.</li>
             * <li>TABLE_SCHEMA_CHECK: table schema change monitoring.</li>
             * <li>REAL_TIME_OFFLINE_COMPARE: real-time and offline comparison.</li>
             * <li>REAL_TIME_STATISTICAL_VALIDATE: real-time statistical value monitoring.</li>
             * <li>REAL_TIME_MULTI_CHAIN_COMPARE: real-time multi-link comparison.</li>
             * </ul>
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
             * <p>The validation conditions.</p>
             */
            public Builder validateConditionList(java.util.List<ValidateConditionList> validateConditionList) {
                this.validateConditionList = validateConditionList;
                return this;
            }

            /**
             * <p>The ID of the associated watch.</p>
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
