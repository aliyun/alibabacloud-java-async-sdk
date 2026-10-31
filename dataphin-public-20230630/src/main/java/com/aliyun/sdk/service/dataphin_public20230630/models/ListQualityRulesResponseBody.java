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
 * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQualityRulesResponseBody</p>
 */
public class ListQualityRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListQualityRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityRulesResponseBody create() {
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
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListQualityRulesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>The backend exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The paged query result.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
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
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQualityRulesResponseBody build() {
            return new ListQualityRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
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
             * <p>Specifies whether the maximum value is included.</p>
             */
            public Builder includeMaxValue(Boolean includeMaxValue) {
                this.includeMaxValue = includeMaxValue;
                return this;
            }

            /**
             * <p>Specifies whether the minimum value is included.</p>
             */
            public Builder includeMinValue(Boolean includeMinValue) {
                this.includeMinValue = includeMinValue;
                return this;
            }

            /**
             * <p>The maximum value. This parameter applies to range attributes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum value. This parameter applies to range attributes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>The attribute value list. This parameter applies to attributes whose input method is custom input, single-select drop-down list, or multi-select drop-down list.</p>
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
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
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
             * <p>The attribute field type. Valid values: STRING (text), BIGINT (integer), DOUBLE (floating-point number), BOOLEAN (boolean), DATE (date), and DATETIME (datetime).</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The default value of the attribute.</p>
             */
            public Builder defaultValue(DefaultValue defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The attribute field length. You can use this parameter to constrain the maximum length of text attribute values.</p>
             * 
             * <strong>example:</strong>
             * <p>6997283</p>
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * <p>The attribute value input method. Valid values: CUSTOMIZED (custom input), SINGLE_ENUM (single-select drop-down list), MULTIPLE_ENUMS (multi-select drop-down list), and RANGE (range).</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMIZED</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The attribute option values. This parameter applies only to attributes whose input method is a single-select or multi-select drop-down list.</p>
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
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
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
             * <p>Specifies whether the attribute is enabled.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The attribute ID.</p>
             * 
             * <strong>example:</strong>
             * <p>-168890138815</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The attribute name.</p>
             * 
             * <strong>example:</strong>
             * <p>attr01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the attribute is required.</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>Specifies whether the attribute is searchable.</p>
             */
            public Builder searchable(Boolean searchable) {
                this.searchable = searchable;
                return this;
            }

            /**
             * <p>The attribute value configuration details.</p>
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
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
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
             * <p>Specifies whether the maximum value is included.</p>
             */
            public Builder includeMaxValue(Boolean includeMaxValue) {
                this.includeMaxValue = includeMaxValue;
                return this;
            }

            /**
             * <p>Specifies whether the minimum value is included.</p>
             */
            public Builder includeMinValue(Boolean includeMinValue) {
                this.includeMinValue = includeMinValue;
                return this;
            }

            /**
             * <p>The maximum value. This parameter applies to range attributes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum value. This parameter applies to range attributes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>The attribute value list. This parameter applies to attributes whose input method is custom input, single-select drop-down list, or multi-select drop-down list.</p>
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
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
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
             * <p>The attribute details.</p>
             */
            public Builder attributeInfo(AttributeInfo attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            /**
             * <p>The attribute value.</p>
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
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
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
             * <p>The component type.</p>
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
             * <p>The attribute value.</p>
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
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
     */
    public static class ScheduleBindList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScheduleId")
        private Long scheduleId;

        @com.aliyun.core.annotation.NameInMap("ScheduleName")
        private String scheduleName;

        private ScheduleBindList(Builder builder) {
            this.scheduleId = builder.scheduleId;
            this.scheduleName = builder.scheduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleBindList create() {
            return builder().build();
        }

        /**
         * @return scheduleId
         */
        public Long getScheduleId() {
            return this.scheduleId;
        }

        /**
         * @return scheduleName
         */
        public String getScheduleName() {
            return this.scheduleName;
        }

        public static final class Builder {
            private Long scheduleId; 
            private String scheduleName; 

            private Builder() {
            } 

            private Builder(ScheduleBindList model) {
                this.scheduleId = model.scheduleId;
                this.scheduleName = model.scheduleName;
            } 

            /**
             * <p>The ID of the schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scheduleId(Long scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            /**
             * <p>The name of the schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder scheduleName(String scheduleName) {
                this.scheduleName = scheduleName;
                return this;
            }

            public ScheduleBindList build() {
                return new ScheduleBindList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
     */
    public static class ValidateConditionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ValidateConditionList(Builder builder) {
            this.id = builder.id;
            this.metric = builder.metric;
            this.metricName = builder.metricName;
            this.operator = builder.operator;
            this.operatorName = builder.operatorName;
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
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
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
            private String operatorName; 
            private String parentId; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(ValidateConditionList model) {
                this.id = model.id;
                this.metric = model.metric;
                this.metricName = model.metricName;
                this.operator = model.operator;
                this.operatorName = model.operatorName;
                this.parentId = model.parentId;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The ID of the condition node.</p>
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
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The operator. Valid values:</p>
             * <ul>
             * <li>EQUAL: Equal to.</li>
             * <li>NOT_EQUAL: Not equal to.</li>
             * <li>LARGER: Greater than.</li>
             * <li>SMALLER: Less than.</li>
             * <li>LARGE_OR_EQUAL: Greater than or equal to.</li>
             * <li>SMALLER_OR_EQUAL: Less than or equal to.</li>
             * <li>AND: AND.</li>
             * <li>OR: OR.</li>
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
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The ID of the parent condition node.</p>
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
             * <li>RELATION: Relation.</li>
             * <li>EXPRESSION: Expression.</li>
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
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
     */
    public static class ValidateObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ValidateObject(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidateObject create() {
            return builder().build();
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
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(ValidateObject model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The name of the validation object.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The validation object type. Valid values:</p>
             * <ul>
             * <li>UNKNOWN: Unknown.</li>
             * <li>TABLE: Table.</li>
             * <li>COLUMN: Column.</li>
             * <li>DATASOURCE: Data source.</li>
             * <li>DATASOURCE_TABLE: Data source table.</li>
             * <li>REALTIME: Real-time.</li>
             * <li>INDEX: Index.</li>
             * <li>CHAIN: Chain.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ValidateObject build() {
                return new ValidateObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
     */
    public static class QualityRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeWithValueList")
        private java.util.List<AttributeWithValueList> attributeWithValueList;

        @com.aliyun.core.annotation.NameInMap("CatalogList")
        private java.util.List<String> catalogList;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableErrorArchive")
        private Boolean enableErrorArchive;

        @com.aliyun.core.annotation.NameInMap("FormPropertyList")
        private java.util.List<FormPropertyList> formPropertyList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierName")
        private String modifierName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScheduleBindList")
        private java.util.List<ScheduleBindList> scheduleBindList;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Strength")
        private String strength;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateScope")
        private String templateScope;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("TestRunRuleTaskId")
        private Long testRunRuleTaskId;

        @com.aliyun.core.annotation.NameInMap("TestRunRuleTaskStatus")
        private String testRunRuleTaskStatus;

        @com.aliyun.core.annotation.NameInMap("TestRunRuleValidateResult")
        private Boolean testRunRuleValidateResult;

        @com.aliyun.core.annotation.NameInMap("ValidateConditionList")
        private java.util.List<ValidateConditionList> validateConditionList;

        @com.aliyun.core.annotation.NameInMap("ValidateObject")
        private ValidateObject validateObject;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        private Long watchId;

        private QualityRuleList(Builder builder) {
            this.attributeWithValueList = builder.attributeWithValueList;
            this.catalogList = builder.catalogList;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.enableErrorArchive = builder.enableErrorArchive;
            this.formPropertyList = builder.formPropertyList;
            this.id = builder.id;
            this.modifier = builder.modifier;
            this.modifierName = builder.modifierName;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.scheduleBindList = builder.scheduleBindList;
            this.sql = builder.sql;
            this.status = builder.status;
            this.strength = builder.strength;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateScope = builder.templateScope;
            this.templateType = builder.templateType;
            this.testRunRuleTaskId = builder.testRunRuleTaskId;
            this.testRunRuleTaskStatus = builder.testRunRuleTaskStatus;
            this.testRunRuleValidateResult = builder.testRunRuleValidateResult;
            this.validateConditionList = builder.validateConditionList;
            this.validateObject = builder.validateObject;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityRuleList create() {
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
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
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifierName
         */
        public String getModifierName() {
            return this.modifierName;
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
         * @return scheduleBindList
         */
        public java.util.List<ScheduleBindList> getScheduleBindList() {
            return this.scheduleBindList;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateScope
         */
        public String getTemplateScope() {
            return this.templateScope;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return testRunRuleTaskId
         */
        public Long getTestRunRuleTaskId() {
            return this.testRunRuleTaskId;
        }

        /**
         * @return testRunRuleTaskStatus
         */
        public String getTestRunRuleTaskStatus() {
            return this.testRunRuleTaskStatus;
        }

        /**
         * @return testRunRuleValidateResult
         */
        public Boolean getTestRunRuleValidateResult() {
            return this.testRunRuleValidateResult;
        }

        /**
         * @return validateConditionList
         */
        public java.util.List<ValidateConditionList> getValidateConditionList() {
            return this.validateConditionList;
        }

        /**
         * @return validateObject
         */
        public ValidateObject getValidateObject() {
            return this.validateObject;
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
            private String createTime; 
            private String creator; 
            private String creatorName; 
            private String description; 
            private Boolean enableErrorArchive; 
            private java.util.List<FormPropertyList> formPropertyList; 
            private Long id; 
            private String modifier; 
            private String modifierName; 
            private String modifyTime; 
            private String name; 
            private java.util.List<ScheduleBindList> scheduleBindList; 
            private String sql; 
            private String status; 
            private String strength; 
            private Long templateId; 
            private String templateName; 
            private String templateScope; 
            private String templateType; 
            private Long testRunRuleTaskId; 
            private String testRunRuleTaskStatus; 
            private Boolean testRunRuleValidateResult; 
            private java.util.List<ValidateConditionList> validateConditionList; 
            private ValidateObject validateObject; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(QualityRuleList model) {
                this.attributeWithValueList = model.attributeWithValueList;
                this.catalogList = model.catalogList;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.enableErrorArchive = model.enableErrorArchive;
                this.formPropertyList = model.formPropertyList;
                this.id = model.id;
                this.modifier = model.modifier;
                this.modifierName = model.modifierName;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.scheduleBindList = model.scheduleBindList;
                this.sql = model.sql;
                this.status = model.status;
                this.strength = model.strength;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateScope = model.templateScope;
                this.templateType = model.templateType;
                this.testRunRuleTaskId = model.testRunRuleTaskId;
                this.testRunRuleTaskStatus = model.testRunRuleTaskStatus;
                this.testRunRuleValidateResult = model.testRunRuleValidateResult;
                this.validateConditionList = model.validateConditionList;
                this.validateObject = model.validateObject;
                this.watchId = model.watchId;
            } 

            /**
             * <p>The business attribute configuration of the rule.</p>
             */
            public Builder attributeWithValueList(java.util.List<AttributeWithValueList> attributeWithValueList) {
                this.attributeWithValueList = attributeWithValueList;
                return this;
            }

            /**
             * <p>The rule category. Valid values: CONSISTENT (consistency), EFFECTIVE (validity), TIMELINESE (timeliness), ACCURATE (accuracy), UNIQUENESS (uniqueness), COMPLETENESS (completeness), STABILITY (stability), and CUSTOM (custom).</p>
             */
            public Builder catalogList(java.util.List<String> catalogList) {
                this.catalogList = catalogList;
                return this;
            }

            /**
             * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
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
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The creator name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
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
             * <p>Specifies whether error archiving is enabled.</p>
             */
            public Builder enableErrorArchive(Boolean enableErrorArchive) {
                this.enableErrorArchive = enableErrorArchive;
                return this;
            }

            /**
             * <p>The rule configuration key-value pairs. Different template types return different form key-value pair configurations.</p>
             */
            public Builder formPropertyList(java.util.List<FormPropertyList> formPropertyList) {
                this.formPropertyList = formPropertyList;
                return this;
            }

            /**
             * <p>The ID of the quality rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the user who last modified the quality rule.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The name of the user who last modified the quality rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * <p>The modification time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the quality rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of schedules bound to the rule.</p>
             */
            public Builder scheduleBindList(java.util.List<ScheduleBindList> scheduleBindList) {
                this.scheduleBindList = scheduleBindList;
                return this;
            }

            /**
             * <p>The SQL preview text of the saved rule. The text may contain multiple SQL statements. If preview is not supported or generation fails, null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>select count(*) from test_table;</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The status of the quality rule. Valid values:</p>
             * <ul>
             * <li>ENABLE: Enabled.</li>
             * <li>DISABLE: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The strength of the rule. Valid values:</p>
             * <ul>
             * <li>STRONG: Strong rule.</li>
             * <li>WEAK: Weak rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STRONG</p>
             */
            public Builder strength(String strength) {
                this.strength = strength;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The template type group. Valid values:</p>
             * <ul>
             * <li>SYSTEM: System preset template.</li>
             * <li>CUSTOM: Custom template.</li>
             * <li>TEMPLATE: Union of SYSTEM and CUSTOM.</li>
             * <li>CUSTOM_SQL: Custom SQL template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder templateScope(String templateScope) {
                this.templateScope = templateScope;
                return this;
            }

            /**
             * <p>The template type. Valid values:</p>
             * <ul>
             * <li>FIELD_NULL_VALUE_VALIDATE: Field null value check.</li>
             * <li>FIELD_EMPTY_STRING_VALIDATE: Field empty character string check.</li>
             * <li>FIELD_UNIQUE_VALIDATE: Field uniqueness check.</li>
             * <li>FIELD_GROUP_COUNT_VALIDATE: Field unique value count check.</li>
             * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: Field duplicate value count check.</li>
             * <li>FUNCTION_TIME_COMPARE: Time function comparison.</li>
             * <li>SINGLE_TABLE_TIME_COMPARE: Non-partitioned table time field comparison.</li>
             * <li>DOUBLE_TABLE_TIME_COMPARE: Two-table time field comparison.</li>
             * <li>FIELD_FORMAT_VALIDATE: Field format check.</li>
             * <li>FIELD_LENGTH_VALIDATE: Field length check.</li>
             * <li>FIELD_VALUE_RANGE_VALIDATE: Field value range check.</li>
             * <li>CODE_TABLE_COMPARE: Lookup table reference comparison.</li>
             * <li>STANDARD_CODE_TABLE_COMPARE: Data standard lookup table reference comparison.</li>
             * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: Non-partitioned table field value consistency comparison.</li>
             * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: Non-partitioned table field statistical value consistency comparison.</li>
             * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: Non-partitioned table field business logic consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: Two-table field value consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Two-table field statistical value consistency comparison.</li>
             * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Cross-source two-table field statistical value consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: Two-table field business logic consistency comparison.</li>
             * <li>TABLE_STABILITY_VALIDATE: Table stability check.</li>
             * <li>TABLE_FLUCTUATION_VALIDATE: Table fluctuation check.</li>
             * <li>FIELD_STABILITY_VALIDATE: Field stability check.</li>
             * <li>FIELD_FLUCTUATION_VALIDATE: Field fluctuation check.</li>
             * <li>CUSTOM_STATISTICAL_VALIDATE: Custom statistical metric check.</li>
             * <li>CUSTOM_DATA_DETAILS_VALIDATE: Custom data details check.</li>
             * <li>DATASOURCE_AVAILABLE_CHECK: Data source connectivity check.</li>
             * <li>TABLE_SCHEMA_CHECK: Table schema change check.</li>
             * <li>REAL_TIME_OFFLINE_COMPARE: Real-time and offline comparison.</li>
             * <li>REAL_TIME_STATISTICAL_VALIDATE: Real-time statistical value check.</li>
             * <li>REAL_TIME_MULTI_CHAIN_COMPARE: Real-time multi-link comparison.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FIELD_NULL_VALUE_VALIDATE</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The ID of the last test run task.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder testRunRuleTaskId(Long testRunRuleTaskId) {
                this.testRunRuleTaskId = testRunRuleTaskId;
                return this;
            }

            /**
             * <p>The status of the last test run task. Valid values:</p>
             * <ul>
             * <li>NOT_RUN: Not run.</li>
             * <li>WAITING: Waiting.</li>
             * <li>RUNNING: Running.</li>
             * <li>SUCCESS: Succeeded.</li>
             * <li>FAILED: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder testRunRuleTaskStatus(String testRunRuleTaskStatus) {
                this.testRunRuleTaskStatus = testRunRuleTaskStatus;
                return this;
            }

            /**
             * <p>Indicates whether the test run validation passed.</p>
             */
            public Builder testRunRuleValidateResult(Boolean testRunRuleValidateResult) {
                this.testRunRuleValidateResult = testRunRuleValidateResult;
                return this;
            }

            /**
             * <p>The list of validation conditions.</p>
             */
            public Builder validateConditionList(java.util.List<ValidateConditionList> validateConditionList) {
                this.validateConditionList = validateConditionList;
                return this;
            }

            /**
             * <p>The validation object.</p>
             */
            public Builder validateObject(ValidateObject validateObject) {
                this.validateObject = validateObject;
                return this;
            }

            /**
             * <p>The ID of the quality watchtask to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public QualityRuleList build() {
                return new QualityRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRulesResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QualityRuleList")
        private java.util.List<QualityRuleList> qualityRuleList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.qualityRuleList = builder.qualityRuleList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return qualityRuleList
         */
        public java.util.List<QualityRuleList> getQualityRuleList() {
            return this.qualityRuleList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<QualityRuleList> qualityRuleList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.qualityRuleList = model.qualityRuleList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The paged quality rule task list.</p>
             */
            public Builder qualityRuleList(java.util.List<QualityRuleList> qualityRuleList) {
                this.qualityRuleList = qualityRuleList;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
