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
 * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandardTemplateResponseBody</p>
 */
public class GetStandardTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TemplateInfo")
    private TemplateInfo templateInfo;

    private GetStandardTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.templateInfo = builder.templateInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardTemplateResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return templateInfo
     */
    public TemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TemplateInfo templateInfo; 

        private Builder() {
        } 

        private Builder(GetStandardTemplateResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.templateInfo = model.templateInfo;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
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
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The template details.</p>
         */
        public Builder templateInfo(TemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }

        public GetStandardTemplateResponseBody build() {
            return new GetStandardTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The field to check.</p>
             * 
             * <strong>example:</strong>
             * <p>column1</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>Indicates whether the check is case-sensitive.</p>
             */
            public Builder isCaseSensitive(Boolean isCaseSensitive) {
                this.isCaseSensitive = isCaseSensitive;
                return this;
            }

            /**
             * <p>The monitoring method. Valid values:</p>
             * <ul>
             * <li>METADATA: metadata monitoring.</li>
             * <li>QUALITY: data quality monitoring.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>METADATA</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The standard ID.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * <p>The version number.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The attribute source. Valid values:</p>
             * <ul>
             * <li>SYSTEM: system attribute.</li>
             * <li>CUSTOM: custom attribute.</li>
             * <li>STANDARD: standard.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder attributeFrom(String attributeFrom) {
                this.attributeFrom = attributeFrom;
                return this;
            }

            /**
             * <p>The corresponding standard. This parameter takes effect when the attribute source is set to STANDARD.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The attribute source.</p>
             */
            public Builder attributeFromInfo(AttributeFromInfo attributeFromInfo) {
                this.attributeFromInfo = attributeFromInfo;
                return this;
            }

            /**
             * <p>The attribute ID.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The referenced lookup table field.</p>
             * 
             * <strong>example:</strong>
             * <p>col1</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The lookup table ID.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The maximum value.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum value.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The value range. This parameter takes effect when the value source is set to DATAPHIN_ATTRIBUTE. Valid values:</p>
             * <ul>
             * <li>BIZ_UNIT: data domain.</li>
             * <li>PROJECT: project.</li>
             * <li>USER: user.</li>
             * <li>USER_GROUP: user group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATAPHIN_ATTRIBUTE</p>
             */
            public Builder dataphinAttributeType(String dataphinAttributeType) {
                this.dataphinAttributeType = dataphinAttributeType;
                return this;
            }

            /**
             * <p>The value range. This parameter takes effect when the value source is set to LOOKUP_TABLE.</p>
             */
            public Builder lookupTableReference(LookupTableReference lookupTableReference) {
                this.lookupTableReference = lookupTableReference;
                return this;
            }

            /**
             * <p>The value range. This parameter takes effect when the value source is set to MIN_MAX.</p>
             */
            public Builder minMaxValueConfig(MinMaxValueConfig minMaxValueConfig) {
                this.minMaxValueConfig = minMaxValueConfig;
                return this;
            }

            /**
             * <p>The value source. Valid values:</p>
             * <ul>
             * <li>NONE: no constraint.</li>
             * <li>LIST: obtained from a list.</li>
             * <li>LOOKUP_TABLE: lookup table.</li>
             * <li>MIN_MAX: value between the minimum and maximum.</li>
             * <li>DATAPHIN_ATTRIBUTE: Dataphin system property.</li>
             * <li>BUILT_IN_DATA_TYPES: built-in data types.</li>
             * <li>BUILT_IN_DATA_CLASSIFICATION: built-in data categorization.</li>
             * <li>BUILT_IN_DATA_LEVEL: built-in data security classification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder valueConstraint(String valueConstraint) {
                this.valueConstraint = valueConstraint;
                return this;
            }

            /**
             * <p>The value range. This parameter takes effect when the value source is set to LIST.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The data type of the attribute value. Valid values:</p>
             * <ul>
             * <li>STRING: string.</li>
             * <li>BIGINT: numeric.</li>
             * <li>DOUBLE: floating-point.</li>
             * <li>DATE: date, accurate to the day.</li>
             * <li>DATETIME: date, accurate to the millisecond.</li>
             * <li>BOOLEAN: Boolean.</li>
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
             * <p>The default value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The length of the attribute value. If this parameter is left empty or set to -1, the length is not limited. Typically, only string types have a length limit for attribute values.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * <p>The attribute value type. Valid values:</p>
             * <ul>
             * <li>CUSTOMIZED: custom input.</li>
             * <li>SINGLE_ENUM: single enumeration value.</li>
             * <li>MULTIPLE_ENUMS: multiple enumeration values.</li>
             * <li>RANGE: range value.</li>
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
             * <p>The value range.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
     */
    public static class AttributeList extends TeaModel {
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

        private AttributeList(Builder builder) {
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

            private Builder(AttributeList model) {
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
             * <p>The attribute code.</p>
             * 
             * <strong>example:</strong>
             * <p>test_attr</p>
             */
            public Builder code(String code) {
                this.code = code;
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
             * <p>Indicates whether monitoring configuration is enabled.</p>
             */
            public Builder enableMonitorConfig(Boolean enableMonitorConfig) {
                this.enableMonitorConfig = enableMonitorConfig;
                return this;
            }

            /**
             * <p>The attribute ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1011</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The monitoring configuration.</p>
             */
            public Builder monitorConfig(MonitorConfig monitorConfig) {
                this.monitorConfig = monitorConfig;
                return this;
            }

            /**
             * <p>The attribute name.</p>
             * 
             * <strong>example:</strong>
             * <p>attr1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The referenced attribute information.</p>
             */
            public Builder refAttribute(RefAttribute refAttribute) {
                this.refAttribute = refAttribute;
                return this;
            }

            /**
             * <p>Indicates whether the attribute is required.</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The attribute type. Valid values:</p>
             * <ul>
             * <li>BIZ_ATTRIBUTE: business attribute.</li>
             * <li>TECH_ATTRIBUTE: technical attribute.</li>
             * <li>MANAGEMENT_ATTRIBUTE: management attribute.</li>
             * <li>QUALITY_ATTRIBUTE: quality attribute.</li>
             * <li>MASTER_DATA_ATTRIBUTE: master data attribute.</li>
             * <li>LIFECYCLE_ATTRIBUTE: lifecycle attribute.</li>
             * <li>SECURITY_ATTRIBUTE: security attribute.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BIZ_ATTRIBUTE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value configuration.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
     */
    public static class AttributesConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeList")
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
             * <p>The list of attributes.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
     */
    public static class AutoIncrementSequenceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Digit")
        private Integer digit;

        @com.aliyun.core.annotation.NameInMap("NeedPaddingZero")
        private Boolean needPaddingZero;

        @com.aliyun.core.annotation.NameInMap("StartValue")
        private Long startValue;

        @com.aliyun.core.annotation.NameInMap("Step")
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
             * <p>The number of digits.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder digit(Integer digit) {
                this.digit = digit;
                return this;
            }

            /**
             * <p>Indicates whether zero-padding is required.</p>
             */
            public Builder needPaddingZero(Boolean needPaddingZero) {
                this.needPaddingZero = needPaddingZero;
                return this;
            }

            /**
             * <p>The start value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder startValue(Long startValue) {
                this.startValue = startValue;
                return this;
            }

            /**
             * <p>The step size.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
     */
    public static class CodeRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoIncrementSequenceConfig")
        private AutoIncrementSequenceConfig autoIncrementSequenceConfig;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The auto-increment sequence configuration.</p>
             */
            public Builder autoIncrementSequenceConfig(AutoIncrementSequenceConfig autoIncrementSequenceConfig) {
                this.autoIncrementSequenceConfig = autoIncrementSequenceConfig;
                return this;
            }

            /**
             * <p>The position index of the code rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The code rule type. Valid values:</p>
             * <ul>
             * <li>FIXED_STRING: fixed string.</li>
             * <li>AUTO_INCREMENT: auto-increment sequence.</li>
             * <li>STANDARD_SET_CODE: standard set code.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FIXED_STRING</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The format or value of the code rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
     */
    public static class AutoConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeRuleList")
        private java.util.List<CodeRuleList> codeRuleList;

        @com.aliyun.core.annotation.NameInMap("NeedStrongValidate")
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
             * <p>The standard code rules.</p>
             */
            public Builder codeRuleList(java.util.List<CodeRuleList> codeRuleList) {
                this.codeRuleList = codeRuleList;
                return this;
            }

            /**
             * <p>Indicates whether strong validation is required.</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
     */
    public static class CodeRuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoConfig")
        private AutoConfig autoConfig;

        @com.aliyun.core.annotation.NameInMap("GenerateType")
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
             * <p>The auto-generation configuration for the standard code rule. This parameter takes effect when the generation method is set to AUTO_GENERATE.</p>
             */
            public Builder autoConfig(AutoConfig autoConfig) {
                this.autoConfig = autoConfig;
                return this;
            }

            /**
             * <p>The standard code generation method. Valid values:</p>
             * <ul>
             * <li>CUSTOMIZED: custom.</li>
             * <li>AUTO_GENERATE: automatically generated based on the standard code rule.</li>
             * </ul>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300000913</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>susan</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
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
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300000913</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>susan</p>
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
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
     */
    public static class MaintainerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private MaintainerList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintainerList create() {
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

            private Builder(MaintainerList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300000913</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>susan</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MaintainerList build() {
                return new MaintainerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateResponseBody</p>
     */
    public static class TemplateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributesConfig")
        private AttributesConfig attributesConfig;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CodeRuleConfig")
        private CodeRuleConfig codeRuleConfig;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Creator creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private LastModifier lastModifier;

        @com.aliyun.core.annotation.NameInMap("MaintainerList")
        private java.util.List<MaintainerList> maintainerList;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateFrom")
        private String templateFrom;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private TemplateInfo(Builder builder) {
            this.attributesConfig = builder.attributesConfig;
            this.code = builder.code;
            this.codeRuleConfig = builder.codeRuleConfig;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.maintainerList = builder.maintainerList;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.templateFrom = builder.templateFrom;
            this.uniqueId = builder.uniqueId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateInfo create() {
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return maintainerList
         */
        public java.util.List<MaintainerList> getMaintainerList() {
            return this.maintainerList;
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
         * @return templateFrom
         */
        public String getTemplateFrom() {
            return this.templateFrom;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private AttributesConfig attributesConfig; 
            private String code; 
            private CodeRuleConfig codeRuleConfig; 
            private String createTime; 
            private Creator creator; 
            private String description; 
            private Long id; 
            private LastModifier lastModifier; 
            private java.util.List<MaintainerList> maintainerList; 
            private String modifyTime; 
            private String name; 
            private String templateFrom; 
            private String uniqueId; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(TemplateInfo model) {
                this.attributesConfig = model.attributesConfig;
                this.code = model.code;
                this.codeRuleConfig = model.codeRuleConfig;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.id = model.id;
                this.lastModifier = model.lastModifier;
                this.maintainerList = model.maintainerList;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.templateFrom = model.templateFrom;
                this.uniqueId = model.uniqueId;
                this.version = model.version;
            } 

            /**
             * <p>The attribute configuration.</p>
             */
            public Builder attributesConfig(AttributesConfig attributesConfig) {
                this.attributesConfig = attributesConfig;
                return this;
            }

            /**
             * <p>The code of the standard template. This value is globally unique and cannot be modified when references exist.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The auto-generation rule configuration for the standard code.</p>
             */
            public Builder codeRuleConfig(CodeRuleConfig codeRuleConfig) {
                this.codeRuleConfig = codeRuleConfig;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator.</p>
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The description of the standard template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The standard template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The last modifier.</p>
             */
            public Builder lastModifier(LastModifier lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * <p>The list of maintainers.</p>
             */
            public Builder maintainerList(java.util.List<MaintainerList> maintainerList) {
                this.maintainerList = maintainerList;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the standard template.</p>
             * 
             * <strong>example:</strong>
             * <p>测试模板</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source of the standard template. Valid values:</p>
             * <ul>
             * <li>CUSTOM: custom standard template.</li>
             * <li>SYSTEM: system built-in standard template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder templateFrom(String templateFrom) {
                this.templateFrom = templateFrom;
                return this;
            }

            /**
             * <p>uniqueId</p>
             * 
             * <strong>example:</strong>
             * <p>1101</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public TemplateInfo build() {
                return new TemplateInfo(this);
            } 

        } 

    }
}
