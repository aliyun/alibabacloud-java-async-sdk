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
 * {@link GetStandardResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandardResponseBody</p>
 */
public class GetStandardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StandardInfo")
    private StandardInfo standardInfo;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStandardResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.standardInfo = builder.standardInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return standardInfo
     */
    public StandardInfo getStandardInfo() {
        return this.standardInfo;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private StandardInfo standardInfo; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetStandardResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.standardInfo = model.standardInfo;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StandardInfo.
         */
        public Builder standardInfo(StandardInfo standardInfo) {
            this.standardInfo = standardInfo;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStandardResponseBody build() {
            return new GetStandardResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class MonitorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("IsCaseSensitive")
        private Boolean isCaseSensitive;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MonitorConfig(Builder builder) {
            this.columnName = builder.columnName;
            this.isCaseSensitive = builder.isCaseSensitive;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorConfig create() {
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

            private Builder(MonitorConfig model) {
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
             * IsCaseSensitive.
             */
            public Builder isCaseSensitive(Boolean isCaseSensitive) {
                this.isCaseSensitive = isCaseSensitive;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MonitorConfig build() {
                return new MonitorConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class StandardReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardId")
        private Long standardId;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * StandardId.
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * Version.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class AttributeFromInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeFrom")
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
             * AttributeFrom.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class RefAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeFromInfo")
        private AttributeFromInfo attributeFromInfo;

        @com.aliyun.core.annotation.NameInMap("AttributeId")
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
             * AttributeFromInfo.
             */
            public Builder attributeFromInfo(AttributeFromInfo attributeFromInfo) {
                this.attributeFromInfo = attributeFromInfo;
                return this;
            }

            /**
             * AttributeId.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class LookupTableReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("LookupTableId")
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
             * LookupTableId.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class MinMaxValueConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncludeMaxValue")
        private Boolean includeMaxValue;

        @com.aliyun.core.annotation.NameInMap("IncludeMinValue")
        private Boolean includeMinValue;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private String maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
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

            public MinMaxValueConfig build() {
                return new MinMaxValueConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class ValueRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataphinAttributeType")
        private String dataphinAttributeType;

        @com.aliyun.core.annotation.NameInMap("LookupTableReference")
        private LookupTableReference lookupTableReference;

        @com.aliyun.core.annotation.NameInMap("MinMaxValueConfig")
        private MinMaxValueConfig minMaxValueConfig;

        @com.aliyun.core.annotation.NameInMap("ValueConstraint")
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
             * ValueConstraint.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class ValueConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Length")
        private Integer length;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValueRange")
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
             * DataType.
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * ValueRange.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class Attribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableMonitorConfig")
        private Boolean enableMonitorConfig;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MonitorConfig")
        private MonitorConfig monitorConfig;

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

        private Attribute(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.enableMonitorConfig = builder.enableMonitorConfig;
            this.id = builder.id;
            this.monitorConfig = builder.monitorConfig;
            this.name = builder.name;
            this.refAttribute = builder.refAttribute;
            this.required = builder.required;
            this.type = builder.type;
            this.valueConfig = builder.valueConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attribute create() {
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
         * @return enableMonitorConfig
         */
        public Boolean getEnableMonitorConfig() {
            return this.enableMonitorConfig;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return monitorConfig
         */
        public MonitorConfig getMonitorConfig() {
            return this.monitorConfig;
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
            private Boolean enableMonitorConfig; 
            private Long id; 
            private MonitorConfig monitorConfig; 
            private String name; 
            private RefAttribute refAttribute; 
            private Boolean required; 
            private String type; 
            private ValueConfig valueConfig; 

            private Builder() {
            } 

            private Builder(Attribute model) {
                this.code = model.code;
                this.description = model.description;
                this.enableMonitorConfig = model.enableMonitorConfig;
                this.id = model.id;
                this.monitorConfig = model.monitorConfig;
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
             * EnableMonitorConfig.
             */
            public Builder enableMonitorConfig(Boolean enableMonitorConfig) {
                this.enableMonitorConfig = enableMonitorConfig;
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
             * MonitorConfig.
             */
            public Builder monitorConfig(MonitorConfig monitorConfig) {
                this.monitorConfig = monitorConfig;
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
             * Type.
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

            public Attribute build() {
                return new Attribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class AttributeWithValueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private Attribute attribute;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AttributeWithValueList(Builder builder) {
            this.attribute = builder.attribute;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeWithValueList create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public Attribute getAttribute() {
            return this.attribute;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Attribute attribute; 
            private String value; 

            private Builder() {
            } 

            private Builder(AttributeWithValueList model) {
                this.attribute = model.attribute;
                this.value = model.value;
            } 

            /**
             * Attribute.
             */
            public Builder attribute(Attribute attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AttributeWithValueList build() {
                return new AttributeWithValueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class Creator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Creator(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Creator model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
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

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class EffectiveTimeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * Type.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class LastModifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private LastModifier(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastModifier create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(LastModifier model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
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

            public LastModifier build() {
                return new LastModifier(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class LookupTableRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeCode")
        private String attributeCode;

        @com.aliyun.core.annotation.NameInMap("AttributeId")
        private Long attributeId;

        @com.aliyun.core.annotation.NameInMap("AttributeName")
        private String attributeName;

        @com.aliyun.core.annotation.NameInMap("LookupTableCode")
        private String lookupTableCode;

        @com.aliyun.core.annotation.NameInMap("LookupTableId")
        private Long lookupTableId;

        private LookupTableRelations(Builder builder) {
            this.attributeCode = builder.attributeCode;
            this.attributeId = builder.attributeId;
            this.attributeName = builder.attributeName;
            this.lookupTableCode = builder.lookupTableCode;
            this.lookupTableId = builder.lookupTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LookupTableRelations create() {
            return builder().build();
        }

        /**
         * @return attributeCode
         */
        public String getAttributeCode() {
            return this.attributeCode;
        }

        /**
         * @return attributeId
         */
        public Long getAttributeId() {
            return this.attributeId;
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return lookupTableCode
         */
        public String getLookupTableCode() {
            return this.lookupTableCode;
        }

        /**
         * @return lookupTableId
         */
        public Long getLookupTableId() {
            return this.lookupTableId;
        }

        public static final class Builder {
            private String attributeCode; 
            private Long attributeId; 
            private String attributeName; 
            private String lookupTableCode; 
            private Long lookupTableId; 

            private Builder() {
            } 

            private Builder(LookupTableRelations model) {
                this.attributeCode = model.attributeCode;
                this.attributeId = model.attributeId;
                this.attributeName = model.attributeName;
                this.lookupTableCode = model.lookupTableCode;
                this.lookupTableId = model.lookupTableId;
            } 

            /**
             * AttributeCode.
             */
            public Builder attributeCode(String attributeCode) {
                this.attributeCode = attributeCode;
                return this;
            }

            /**
             * AttributeId.
             */
            public Builder attributeId(Long attributeId) {
                this.attributeId = attributeId;
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
             * LookupTableCode.
             */
            public Builder lookupTableCode(String lookupTableCode) {
                this.lookupTableCode = lookupTableCode;
                return this;
            }

            /**
             * LookupTableId.
             */
            public Builder lookupTableId(Long lookupTableId) {
                this.lookupTableId = lookupTableId;
                return this;
            }

            public LookupTableRelations build() {
                return new LookupTableRelations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class Owner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Owner(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owner create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Owner model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
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

            public Owner build() {
                return new Owner(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class AttributeMonitorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("IsCaseSensitive")
        private Boolean isCaseSensitive;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * IsCaseSensitive.
             */
            public Builder isCaseSensitive(Boolean isCaseSensitive) {
                this.isCaseSensitive = isCaseSensitive;
                return this;
            }

            /**
             * Type.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class QualityRuleTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * Type.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class RuleConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class RuleValidateConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
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

            public RuleValidateConfigList build() {
                return new RuleValidateConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
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
        private String monitorFrom;

        @com.aliyun.core.annotation.NameInMap("QualityRuleTemplate")
        private QualityRuleTemplate qualityRuleTemplate;

        @com.aliyun.core.annotation.NameInMap("RuleConfigList")
        private java.util.List<RuleConfigList> ruleConfigList;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleSubType")
        private String ruleSubType;

        @com.aliyun.core.annotation.NameInMap("RuleValidateConfigList")
        private java.util.List<RuleValidateConfigList> ruleValidateConfigList;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MonitorFrom.
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
             * RuleName.
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
             * Type.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class StandardGeneralMonitorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardMonitorConfigList")
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
             * StandardMonitorConfigList.
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
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class StandardRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("StandardId")
        private Long standardId;

        @com.aliyun.core.annotation.NameInMap("StandardStage")
        private String standardStage;

        @com.aliyun.core.annotation.NameInMap("StandardStatus")
        private String standardStatus;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private StandardRelations(Builder builder) {
            this.relationType = builder.relationType;
            this.standardId = builder.standardId;
            this.standardStage = builder.standardStage;
            this.standardStatus = builder.standardStatus;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardRelations create() {
            return builder().build();
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        /**
         * @return standardStage
         */
        public String getStandardStage() {
            return this.standardStage;
        }

        /**
         * @return standardStatus
         */
        public String getStandardStatus() {
            return this.standardStatus;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String relationType; 
            private Long standardId; 
            private String standardStage; 
            private String standardStatus; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(StandardRelations model) {
                this.relationType = model.relationType;
                this.standardId = model.standardId;
                this.standardStage = model.standardStage;
                this.standardStatus = model.standardStatus;
                this.version = model.version;
            } 

            /**
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * StandardId.
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * StandardStage.
             */
            public Builder standardStage(String standardStage) {
                this.standardStage = standardStage;
                return this;
            }

            /**
             * StandardStatus.
             */
            public Builder standardStatus(String standardStatus) {
                this.standardStatus = standardStatus;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public StandardRelations build() {
                return new StandardRelations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class StandardSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private StandardSet(Builder builder) {
            this.code = builder.code;
            this.directory = builder.directory;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardSet create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
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

        public static final class Builder {
            private String code; 
            private String directory; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(StandardSet model) {
                this.code = model.code;
                this.directory = model.directory;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
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

            public StandardSet build() {
                return new StandardSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class StandardTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateFrom")
        private String templateFrom;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private StandardTemplate(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.name = builder.name;
            this.templateFrom = builder.templateFrom;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardTemplate create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
         * @return templateFrom
         */
        public String getTemplateFrom() {
            return this.templateFrom;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String code; 
            private Long id; 
            private String name; 
            private String templateFrom; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(StandardTemplate model) {
                this.code = model.code;
                this.id = model.id;
                this.name = model.name;
                this.templateFrom = model.templateFrom;
                this.version = model.version;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * TemplateFrom.
             */
            public Builder templateFrom(String templateFrom) {
                this.templateFrom = templateFrom;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public StandardTemplate build() {
                return new StandardTemplate(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardResponseBody</p>
     */
    public static class StandardInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeWithValueList")
        private java.util.List<AttributeWithValueList> attributeWithValueList;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Creator creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectiveTimeConfig")
        private EffectiveTimeConfig effectiveTimeConfig;

        @com.aliyun.core.annotation.NameInMap("EnglishName")
        private String englishName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private LastModifier lastModifier;

        @com.aliyun.core.annotation.NameInMap("LookupTableRelations")
        private java.util.List<LookupTableRelations> lookupTableRelations;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private Owner owner;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("StandardGeneralMonitorConfig")
        private StandardGeneralMonitorConfig standardGeneralMonitorConfig;

        @com.aliyun.core.annotation.NameInMap("StandardRelations")
        private java.util.List<StandardRelations> standardRelations;

        @com.aliyun.core.annotation.NameInMap("StandardSet")
        private StandardSet standardSet;

        @com.aliyun.core.annotation.NameInMap("StandardTemplate")
        private StandardTemplate standardTemplate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private StandardInfo(Builder builder) {
            this.attributeWithValueList = builder.attributeWithValueList;
            this.code = builder.code;
            this.creator = builder.creator;
            this.description = builder.description;
            this.effectiveTimeConfig = builder.effectiveTimeConfig;
            this.englishName = builder.englishName;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.lookupTableRelations = builder.lookupTableRelations;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.stage = builder.stage;
            this.standardGeneralMonitorConfig = builder.standardGeneralMonitorConfig;
            this.standardRelations = builder.standardRelations;
            this.standardSet = builder.standardSet;
            this.standardTemplate = builder.standardTemplate;
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardInfo create() {
            return builder().build();
        }

        /**
         * @return attributeWithValueList
         */
        public java.util.List<AttributeWithValueList> getAttributeWithValueList() {
            return this.attributeWithValueList;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
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
         * @return englishName
         */
        public String getEnglishName() {
            return this.englishName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastModifier
         */
        public LastModifier getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return lookupTableRelations
         */
        public java.util.List<LookupTableRelations> getLookupTableRelations() {
            return this.lookupTableRelations;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public Owner getOwner() {
            return this.owner;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return standardGeneralMonitorConfig
         */
        public StandardGeneralMonitorConfig getStandardGeneralMonitorConfig() {
            return this.standardGeneralMonitorConfig;
        }

        /**
         * @return standardRelations
         */
        public java.util.List<StandardRelations> getStandardRelations() {
            return this.standardRelations;
        }

        /**
         * @return standardSet
         */
        public StandardSet getStandardSet() {
            return this.standardSet;
        }

        /**
         * @return standardTemplate
         */
        public StandardTemplate getStandardTemplate() {
            return this.standardTemplate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List<AttributeWithValueList> attributeWithValueList; 
            private String code; 
            private Creator creator; 
            private String description; 
            private EffectiveTimeConfig effectiveTimeConfig; 
            private String englishName; 
            private Long id; 
            private LastModifier lastModifier; 
            private java.util.List<LookupTableRelations> lookupTableRelations; 
            private String modifyTime; 
            private String name; 
            private Owner owner; 
            private String stage; 
            private StandardGeneralMonitorConfig standardGeneralMonitorConfig; 
            private java.util.List<StandardRelations> standardRelations; 
            private StandardSet standardSet; 
            private StandardTemplate standardTemplate; 
            private String status; 
            private String type; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(StandardInfo model) {
                this.attributeWithValueList = model.attributeWithValueList;
                this.code = model.code;
                this.creator = model.creator;
                this.description = model.description;
                this.effectiveTimeConfig = model.effectiveTimeConfig;
                this.englishName = model.englishName;
                this.id = model.id;
                this.lastModifier = model.lastModifier;
                this.lookupTableRelations = model.lookupTableRelations;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.stage = model.stage;
                this.standardGeneralMonitorConfig = model.standardGeneralMonitorConfig;
                this.standardRelations = model.standardRelations;
                this.standardSet = model.standardSet;
                this.standardTemplate = model.standardTemplate;
                this.status = model.status;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * AttributeWithValueList.
             */
            public Builder attributeWithValueList(java.util.List<AttributeWithValueList> attributeWithValueList) {
                this.attributeWithValueList = attributeWithValueList;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
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
             * EffectiveTimeConfig.
             */
            public Builder effectiveTimeConfig(EffectiveTimeConfig effectiveTimeConfig) {
                this.effectiveTimeConfig = effectiveTimeConfig;
                return this;
            }

            /**
             * EnglishName.
             */
            public Builder englishName(String englishName) {
                this.englishName = englishName;
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
             * LastModifier.
             */
            public Builder lastModifier(LastModifier lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * LookupTableRelations.
             */
            public Builder lookupTableRelations(java.util.List<LookupTableRelations> lookupTableRelations) {
                this.lookupTableRelations = lookupTableRelations;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
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
             * Owner.
             */
            public Builder owner(Owner owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Stage.
             */
            public Builder stage(String stage) {
                this.stage = stage;
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
             * StandardRelations.
             */
            public Builder standardRelations(java.util.List<StandardRelations> standardRelations) {
                this.standardRelations = standardRelations;
                return this;
            }

            /**
             * StandardSet.
             */
            public Builder standardSet(StandardSet standardSet) {
                this.standardSet = standardSet;
                return this;
            }

            /**
             * StandardTemplate.
             */
            public Builder standardTemplate(StandardTemplate standardTemplate) {
                this.standardTemplate = standardTemplate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public StandardInfo build() {
                return new StandardInfo(this);
            } 

        } 

    }
}
