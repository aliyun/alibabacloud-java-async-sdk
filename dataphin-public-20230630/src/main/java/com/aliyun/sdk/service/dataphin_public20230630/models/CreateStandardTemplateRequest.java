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
 * {@link CreateStandardTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateStandardTemplateRequest</p>
 */
public class CreateStandardTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private CreateStandardTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStandardTemplateRequest create() {
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
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<CreateStandardTemplateRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateStandardTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
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
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
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

        @Override
        public CreateStandardTemplateRequest build() {
            return new CreateStandardTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class StandardReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long standardId;

        @com.aliyun.core.annotation.NameInMap("Version")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer version;

        private StandardReference(Builder builder) {
            this.standardId = builder.standardId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardReference create() {
            return builder().build();
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long standardId; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(StandardReference model) {
                this.standardId = model.standardId;
                this.version = model.version;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public StandardReference build() {
                return new StandardReference(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class AttributeFromInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeFrom")
        @com.aliyun.core.annotation.Validation(required = true)
        private String attributeFrom;

        @com.aliyun.core.annotation.NameInMap("StandardReference")
        private StandardReference standardReference;

        private AttributeFromInfo(Builder builder) {
            this.attributeFrom = builder.attributeFrom;
            this.standardReference = builder.standardReference;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeFromInfo create() {
            return builder().build();
        }

        /**
         * @return attributeFrom
         */
        public String getAttributeFrom() {
            return this.attributeFrom;
        }

        /**
         * @return standardReference
         */
        public StandardReference getStandardReference() {
            return this.standardReference;
        }

        public static final class Builder {
            private String attributeFrom; 
            private StandardReference standardReference; 

            private Builder() {
            } 

            private Builder(AttributeFromInfo model) {
                this.attributeFrom = model.attributeFrom;
                this.standardReference = model.standardReference;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder attributeFrom(String attributeFrom) {
                this.attributeFrom = attributeFrom;
                return this;
            }

            /**
             * StandardReference.
             */
            public Builder standardReference(StandardReference standardReference) {
                this.standardReference = standardReference;
                return this;
            }

            public AttributeFromInfo build() {
                return new AttributeFromInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class RefAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeFromInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private AttributeFromInfo attributeFromInfo;

        @com.aliyun.core.annotation.NameInMap("AttributeId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long attributeId;

        private RefAttribute(Builder builder) {
            this.attributeFromInfo = builder.attributeFromInfo;
            this.attributeId = builder.attributeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefAttribute create() {
            return builder().build();
        }

        /**
         * @return attributeFromInfo
         */
        public AttributeFromInfo getAttributeFromInfo() {
            return this.attributeFromInfo;
        }

        /**
         * @return attributeId
         */
        public Long getAttributeId() {
            return this.attributeId;
        }

        public static final class Builder {
            private AttributeFromInfo attributeFromInfo; 
            private Long attributeId; 

            private Builder() {
            } 

            private Builder(RefAttribute model) {
                this.attributeFromInfo = model.attributeFromInfo;
                this.attributeId = model.attributeId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder attributeFromInfo(AttributeFromInfo attributeFromInfo) {
                this.attributeFromInfo = attributeFromInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder attributeId(Long attributeId) {
                this.attributeId = attributeId;
                return this;
            }

            public RefAttribute build() {
                return new RefAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class LookupTableReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("LookupTableId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long lookupTableId;

        private LookupTableReference(Builder builder) {
            this.column = builder.column;
            this.lookupTableId = builder.lookupTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LookupTableReference create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return lookupTableId
         */
        public Long getLookupTableId() {
            return this.lookupTableId;
        }

        public static final class Builder {
            private String column; 
            private Long lookupTableId; 

            private Builder() {
            } 

            private Builder(LookupTableReference model) {
                this.column = model.column;
                this.lookupTableId = model.lookupTableId;
            } 

            /**
             * Column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder lookupTableId(Long lookupTableId) {
                this.lookupTableId = lookupTableId;
                return this;
            }

            public LookupTableReference build() {
                return new LookupTableReference(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class MinMaxValueConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncludeMaxValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean includeMaxValue;

        @com.aliyun.core.annotation.NameInMap("IncludeMinValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean includeMinValue;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String minValue;

        private MinMaxValueConfig(Builder builder) {
            this.includeMaxValue = builder.includeMaxValue;
            this.includeMinValue = builder.includeMinValue;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MinMaxValueConfig create() {
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

        public static final class Builder {
            private Boolean includeMaxValue; 
            private Boolean includeMinValue; 
            private String maxValue; 
            private String minValue; 

            private Builder() {
            } 

            private Builder(MinMaxValueConfig model) {
                this.includeMaxValue = model.includeMaxValue;
                this.includeMinValue = model.includeMinValue;
                this.maxValue = model.maxValue;
                this.minValue = model.minValue;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder includeMaxValue(Boolean includeMaxValue) {
                this.includeMaxValue = includeMaxValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder includeMinValue(Boolean includeMinValue) {
                this.includeMinValue = includeMinValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            public MinMaxValueConfig build() {
                return new MinMaxValueConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class ValueRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataphinAttributeType")
        private String dataphinAttributeType;

        @com.aliyun.core.annotation.NameInMap("LookupTableReference")
        private LookupTableReference lookupTableReference;

        @com.aliyun.core.annotation.NameInMap("MinMaxValueConfig")
        private MinMaxValueConfig minMaxValueConfig;

        @com.aliyun.core.annotation.NameInMap("ValueConstraint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String valueConstraint;

        @com.aliyun.core.annotation.NameInMap("ValueList")
        private java.util.List<String> valueList;

        private ValueRange(Builder builder) {
            this.dataphinAttributeType = builder.dataphinAttributeType;
            this.lookupTableReference = builder.lookupTableReference;
            this.minMaxValueConfig = builder.minMaxValueConfig;
            this.valueConstraint = builder.valueConstraint;
            this.valueList = builder.valueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueRange create() {
            return builder().build();
        }

        /**
         * @return dataphinAttributeType
         */
        public String getDataphinAttributeType() {
            return this.dataphinAttributeType;
        }

        /**
         * @return lookupTableReference
         */
        public LookupTableReference getLookupTableReference() {
            return this.lookupTableReference;
        }

        /**
         * @return minMaxValueConfig
         */
        public MinMaxValueConfig getMinMaxValueConfig() {
            return this.minMaxValueConfig;
        }

        /**
         * @return valueConstraint
         */
        public String getValueConstraint() {
            return this.valueConstraint;
        }

        /**
         * @return valueList
         */
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

        public static final class Builder {
            private String dataphinAttributeType; 
            private LookupTableReference lookupTableReference; 
            private MinMaxValueConfig minMaxValueConfig; 
            private String valueConstraint; 
            private java.util.List<String> valueList; 

            private Builder() {
            } 

            private Builder(ValueRange model) {
                this.dataphinAttributeType = model.dataphinAttributeType;
                this.lookupTableReference = model.lookupTableReference;
                this.minMaxValueConfig = model.minMaxValueConfig;
                this.valueConstraint = model.valueConstraint;
                this.valueList = model.valueList;
            } 

            /**
             * DataphinAttributeType.
             */
            public Builder dataphinAttributeType(String dataphinAttributeType) {
                this.dataphinAttributeType = dataphinAttributeType;
                return this;
            }

            /**
             * LookupTableReference.
             */
            public Builder lookupTableReference(LookupTableReference lookupTableReference) {
                this.lookupTableReference = lookupTableReference;
                return this;
            }

            /**
             * MinMaxValueConfig.
             */
            public Builder minMaxValueConfig(MinMaxValueConfig minMaxValueConfig) {
                this.minMaxValueConfig = minMaxValueConfig;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder valueConstraint(String valueConstraint) {
                this.valueConstraint = valueConstraint;
                return this;
            }

            /**
             * ValueList.
             */
            public Builder valueList(java.util.List<String> valueList) {
                this.valueList = valueList;
                return this;
            }

            public ValueRange build() {
                return new ValueRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class ValueConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Length")
        private Integer length;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValueRange")
        @com.aliyun.core.annotation.Validation(required = true)
        private ValueRange valueRange;

        private ValueConfig(Builder builder) {
            this.dataType = builder.dataType;
            this.defaultValue = builder.defaultValue;
            this.length = builder.length;
            this.type = builder.type;
            this.valueRange = builder.valueRange;
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
        public String getDefaultValue() {
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
         * @return valueRange
         */
        public ValueRange getValueRange() {
            return this.valueRange;
        }

        public static final class Builder {
            private String dataType; 
            private String defaultValue; 
            private Integer length; 
            private String type; 
            private ValueRange valueRange; 

            private Builder() {
            } 

            private Builder(ValueConfig model) {
                this.dataType = model.dataType;
                this.defaultValue = model.defaultValue;
                this.length = model.length;
                this.type = model.type;
                this.valueRange = model.valueRange;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMIZED</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder valueRange(ValueRange valueRange) {
                this.valueRange = valueRange;
                return this;
            }

            public ValueConfig build() {
                return new ValueConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class AttributeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RefAttribute")
        private RefAttribute refAttribute;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValueConfig")
        private ValueConfig valueConfig;

        private AttributeList(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.name = builder.name;
            this.refAttribute = builder.refAttribute;
            this.required = builder.required;
            this.type = builder.type;
            this.valueConfig = builder.valueConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return refAttribute
         */
        public RefAttribute getRefAttribute() {
            return this.refAttribute;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return valueConfig
         */
        public ValueConfig getValueConfig() {
            return this.valueConfig;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private String name; 
            private RefAttribute refAttribute; 
            private Boolean required; 
            private String type; 
            private ValueConfig valueConfig; 

            private Builder() {
            } 

            private Builder(AttributeList model) {
                this.code = model.code;
                this.description = model.description;
                this.name = model.name;
                this.refAttribute = model.refAttribute;
                this.required = model.required;
                this.type = model.type;
                this.valueConfig = model.valueConfig;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RefAttribute.
             */
            public Builder refAttribute(RefAttribute refAttribute) {
                this.refAttribute = refAttribute;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMIZED</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * ValueConfig.
             */
            public Builder valueConfig(ValueConfig valueConfig) {
                this.valueConfig = valueConfig;
                return this;
            }

            public AttributeList build() {
                return new AttributeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class AttributesConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<AttributeList> attributeList;

        private AttributesConfig(Builder builder) {
            this.attributeList = builder.attributeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributesConfig create() {
            return builder().build();
        }

        /**
         * @return attributeList
         */
        public java.util.List<AttributeList> getAttributeList() {
            return this.attributeList;
        }

        public static final class Builder {
            private java.util.List<AttributeList> attributeList; 

            private Builder() {
            } 

            private Builder(AttributesConfig model) {
                this.attributeList = model.attributeList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder attributeList(java.util.List<AttributeList> attributeList) {
                this.attributeList = attributeList;
                return this;
            }

            public AttributesConfig build() {
                return new AttributesConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class AutoIncrementSequenceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Digit")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer digit;

        @com.aliyun.core.annotation.NameInMap("NeedPaddingZero")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean needPaddingZero;

        @com.aliyun.core.annotation.NameInMap("StartValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long startValue;

        @com.aliyun.core.annotation.NameInMap("Step")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer step;

        private AutoIncrementSequenceConfig(Builder builder) {
            this.digit = builder.digit;
            this.needPaddingZero = builder.needPaddingZero;
            this.startValue = builder.startValue;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoIncrementSequenceConfig create() {
            return builder().build();
        }

        /**
         * @return digit
         */
        public Integer getDigit() {
            return this.digit;
        }

        /**
         * @return needPaddingZero
         */
        public Boolean getNeedPaddingZero() {
            return this.needPaddingZero;
        }

        /**
         * @return startValue
         */
        public Long getStartValue() {
            return this.startValue;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer digit; 
            private Boolean needPaddingZero; 
            private Long startValue; 
            private Integer step; 

            private Builder() {
            } 

            private Builder(AutoIncrementSequenceConfig model) {
                this.digit = model.digit;
                this.needPaddingZero = model.needPaddingZero;
                this.startValue = model.startValue;
                this.step = model.step;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder digit(Integer digit) {
                this.digit = digit;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder needPaddingZero(Boolean needPaddingZero) {
                this.needPaddingZero = needPaddingZero;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder startValue(Long startValue) {
                this.startValue = startValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public AutoIncrementSequenceConfig build() {
                return new AutoIncrementSequenceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class CodeRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoIncrementSequenceConfig")
        private AutoIncrementSequenceConfig autoIncrementSequenceConfig;

        @com.aliyun.core.annotation.NameInMap("Index")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CodeRuleList(Builder builder) {
            this.autoIncrementSequenceConfig = builder.autoIncrementSequenceConfig;
            this.index = builder.index;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeRuleList create() {
            return builder().build();
        }

        /**
         * @return autoIncrementSequenceConfig
         */
        public AutoIncrementSequenceConfig getAutoIncrementSequenceConfig() {
            return this.autoIncrementSequenceConfig;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
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
            private AutoIncrementSequenceConfig autoIncrementSequenceConfig; 
            private Integer index; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(CodeRuleList model) {
                this.autoIncrementSequenceConfig = model.autoIncrementSequenceConfig;
                this.index = model.index;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * AutoIncrementSequenceConfig.
             */
            public Builder autoIncrementSequenceConfig(AutoIncrementSequenceConfig autoIncrementSequenceConfig) {
                this.autoIncrementSequenceConfig = autoIncrementSequenceConfig;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FIXED_STRING</p>
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

            public CodeRuleList build() {
                return new CodeRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class AutoConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeRuleList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<CodeRuleList> codeRuleList;

        @com.aliyun.core.annotation.NameInMap("NeedStrongValidate")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean needStrongValidate;

        private AutoConfig(Builder builder) {
            this.codeRuleList = builder.codeRuleList;
            this.needStrongValidate = builder.needStrongValidate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoConfig create() {
            return builder().build();
        }

        /**
         * @return codeRuleList
         */
        public java.util.List<CodeRuleList> getCodeRuleList() {
            return this.codeRuleList;
        }

        /**
         * @return needStrongValidate
         */
        public Boolean getNeedStrongValidate() {
            return this.needStrongValidate;
        }

        public static final class Builder {
            private java.util.List<CodeRuleList> codeRuleList; 
            private Boolean needStrongValidate; 

            private Builder() {
            } 

            private Builder(AutoConfig model) {
                this.codeRuleList = model.codeRuleList;
                this.needStrongValidate = model.needStrongValidate;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder codeRuleList(java.util.List<CodeRuleList> codeRuleList) {
                this.codeRuleList = codeRuleList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder needStrongValidate(Boolean needStrongValidate) {
                this.needStrongValidate = needStrongValidate;
                return this;
            }

            public AutoConfig build() {
                return new AutoConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class CodeRuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoConfig")
        private AutoConfig autoConfig;

        @com.aliyun.core.annotation.NameInMap("GenerateType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String generateType;

        private CodeRuleConfig(Builder builder) {
            this.autoConfig = builder.autoConfig;
            this.generateType = builder.generateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeRuleConfig create() {
            return builder().build();
        }

        /**
         * @return autoConfig
         */
        public AutoConfig getAutoConfig() {
            return this.autoConfig;
        }

        /**
         * @return generateType
         */
        public String getGenerateType() {
            return this.generateType;
        }

        public static final class Builder {
            private AutoConfig autoConfig; 
            private String generateType; 

            private Builder() {
            } 

            private Builder(CodeRuleConfig model) {
                this.autoConfig = model.autoConfig;
                this.generateType = model.generateType;
            } 

            /**
             * AutoConfig.
             */
            public Builder autoConfig(AutoConfig autoConfig) {
                this.autoConfig = autoConfig;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMIZED</p>
             */
            public Builder generateType(String generateType) {
                this.generateType = generateType;
                return this;
            }

            public CodeRuleConfig build() {
                return new CodeRuleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class PublishInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        private PublishInfo(Builder builder) {
            this.comment = builder.comment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishInfo create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        public static final class Builder {
            private String comment; 

            private Builder() {
            } 

            private Builder(PublishInfo model) {
                this.comment = model.comment;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            public PublishInfo build() {
                return new PublishInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardTemplateRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributesConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private AttributesConfig attributesConfig;

        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("CodeRuleConfig")
        private CodeRuleConfig codeRuleConfig;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MaintainerList")
        private java.util.List<String> maintainerList;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("PublishInfo")
        private PublishInfo publishInfo;

        private CreateCommand(Builder builder) {
            this.attributesConfig = builder.attributesConfig;
            this.code = builder.code;
            this.codeRuleConfig = builder.codeRuleConfig;
            this.description = builder.description;
            this.maintainerList = builder.maintainerList;
            this.name = builder.name;
            this.publishInfo = builder.publishInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return attributesConfig
         */
        public AttributesConfig getAttributesConfig() {
            return this.attributesConfig;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return codeRuleConfig
         */
        public CodeRuleConfig getCodeRuleConfig() {
            return this.codeRuleConfig;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return maintainerList
         */
        public java.util.List<String> getMaintainerList() {
            return this.maintainerList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publishInfo
         */
        public PublishInfo getPublishInfo() {
            return this.publishInfo;
        }

        public static final class Builder {
            private AttributesConfig attributesConfig; 
            private String code; 
            private CodeRuleConfig codeRuleConfig; 
            private String description; 
            private java.util.List<String> maintainerList; 
            private String name; 
            private PublishInfo publishInfo; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.attributesConfig = model.attributesConfig;
                this.code = model.code;
                this.codeRuleConfig = model.codeRuleConfig;
                this.description = model.description;
                this.maintainerList = model.maintainerList;
                this.name = model.name;
                this.publishInfo = model.publishInfo;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder attributesConfig(AttributesConfig attributesConfig) {
                this.attributesConfig = attributesConfig;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CodeRuleConfig.
             */
            public Builder codeRuleConfig(CodeRuleConfig codeRuleConfig) {
                this.codeRuleConfig = codeRuleConfig;
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
             * MaintainerList.
             */
            public Builder maintainerList(java.util.List<String> maintainerList) {
                this.maintainerList = maintainerList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>测试模板</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PublishInfo.
             */
            public Builder publishInfo(PublishInfo publishInfo) {
                this.publishInfo = publishInfo;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
