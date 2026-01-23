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
 * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityRuleResponseBody</p>
 */
public class GetQualityRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("QualityRuleInfo")
    private QualityRuleInfo qualityRuleInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.qualityRuleInfo = builder.qualityRuleInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityRuleResponseBody create() {
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
     * @return qualityRuleInfo
     */
    public QualityRuleInfo getQualityRuleInfo() {
        return this.qualityRuleInfo;
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
        private QualityRuleInfo qualityRuleInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityRuleResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.qualityRuleInfo = model.qualityRuleInfo;
            this.requestId = model.requestId;
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
         * QualityRuleInfo.
         */
        public Builder qualityRuleInfo(QualityRuleInfo qualityRuleInfo) {
            this.qualityRuleInfo = qualityRuleInfo;
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

        public GetQualityRuleResponseBody build() {
            return new GetQualityRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
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
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
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
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
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
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
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
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
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
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
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
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
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
             * ScheduleId.
             */
            public Builder scheduleId(Long scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            /**
             * ScheduleName.
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
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
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
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
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
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
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

            public ValidateObject build() {
                return new ValidateObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
     */
    public static class QualityRuleInfo extends TeaModel {
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

        private QualityRuleInfo(Builder builder) {
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

        public static QualityRuleInfo create() {
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

            private Builder(QualityRuleInfo model) {
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
             * AttributeWithValueList.
             */
            public Builder attributeWithValueList(java.util.List<AttributeWithValueList> attributeWithValueList) {
                this.attributeWithValueList = attributeWithValueList;
                return this;
            }

            /**
             * CatalogList.
             */
            public Builder catalogList(java.util.List<String> catalogList) {
                this.catalogList = catalogList;
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
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
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
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ModifierName.
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
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
             * ScheduleBindList.
             */
            public Builder scheduleBindList(java.util.List<ScheduleBindList> scheduleBindList) {
                this.scheduleBindList = scheduleBindList;
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
             * Strength.
             */
            public Builder strength(String strength) {
                this.strength = strength;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateScope.
             */
            public Builder templateScope(String templateScope) {
                this.templateScope = templateScope;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * TestRunRuleTaskId.
             */
            public Builder testRunRuleTaskId(Long testRunRuleTaskId) {
                this.testRunRuleTaskId = testRunRuleTaskId;
                return this;
            }

            /**
             * TestRunRuleTaskStatus.
             */
            public Builder testRunRuleTaskStatus(String testRunRuleTaskStatus) {
                this.testRunRuleTaskStatus = testRunRuleTaskStatus;
                return this;
            }

            /**
             * TestRunRuleValidateResult.
             */
            public Builder testRunRuleValidateResult(Boolean testRunRuleValidateResult) {
                this.testRunRuleValidateResult = testRunRuleValidateResult;
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
             * ValidateObject.
             */
            public Builder validateObject(ValidateObject validateObject) {
                this.validateObject = validateObject;
                return this;
            }

            /**
             * WatchId.
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public QualityRuleInfo build() {
                return new QualityRuleInfo(this);
            } 

        } 

    }
}
