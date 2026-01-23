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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TemplateInfo.
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
             * AttributeList.
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
             * Digit.
             */
            public Builder digit(Integer digit) {
                this.digit = digit;
                return this;
            }

            /**
             * NeedPaddingZero.
             */
            public Builder needPaddingZero(Boolean needPaddingZero) {
                this.needPaddingZero = needPaddingZero;
                return this;
            }

            /**
             * StartValue.
             */
            public Builder startValue(Long startValue) {
                this.startValue = startValue;
                return this;
            }

            /**
             * Step.
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
             * AutoIncrementSequenceConfig.
             */
            public Builder autoIncrementSequenceConfig(AutoIncrementSequenceConfig autoIncrementSequenceConfig) {
                this.autoIncrementSequenceConfig = autoIncrementSequenceConfig;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * CodeRuleList.
             */
            public Builder codeRuleList(java.util.List<CodeRuleList> codeRuleList) {
                this.codeRuleList = codeRuleList;
                return this;
            }

            /**
             * NeedStrongValidate.
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
             * AutoConfig.
             */
            public Builder autoConfig(AutoConfig autoConfig) {
                this.autoConfig = autoConfig;
                return this;
            }

            /**
             * GenerateType.
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
             * AttributesConfig.
             */
            public Builder attributesConfig(AttributesConfig attributesConfig) {
                this.attributesConfig = attributesConfig;
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
             * CodeRuleConfig.
             */
            public Builder codeRuleConfig(CodeRuleConfig codeRuleConfig) {
                this.codeRuleConfig = codeRuleConfig;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * MaintainerList.
             */
            public Builder maintainerList(java.util.List<MaintainerList> maintainerList) {
                this.maintainerList = maintainerList;
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
             * TemplateFrom.
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
             * Version.
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
