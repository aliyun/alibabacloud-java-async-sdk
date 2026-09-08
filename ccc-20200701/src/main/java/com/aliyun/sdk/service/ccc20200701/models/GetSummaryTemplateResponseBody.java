// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetSummaryTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetSummaryTemplateResponseBody</p>
 */
public class GetSummaryTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSummaryTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSummaryTemplateResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSummaryTemplateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The list of error parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30C7D235-DDCF-4C7F-A462-5E2598252C2B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSummaryTemplateResponseBody build() {
            return new GetSummaryTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSummaryTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetSummaryTemplateResponseBody</p>
     */
    public static class PropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Array")
        private Boolean array;

        @com.aliyun.core.annotation.NameInMap("Attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("DisplayOrder")
        private Integer displayOrder;

        @com.aliyun.core.annotation.NameInMap("EditorType")
        private String editorType;

        @com.aliyun.core.annotation.NameInMap("MaxLength")
        private Integer maxLength;

        @com.aliyun.core.annotation.NameInMap("Maximum")
        private Double maximum;

        @com.aliyun.core.annotation.NameInMap("MinLength")
        private Integer minLength;

        @com.aliyun.core.annotation.NameInMap("Minimum")
        private Double minimum;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("PatternErrorMessage")
        private String patternErrorMessage;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("System")
        private Boolean system;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private PropertyList(Builder builder) {
            this.array = builder.array;
            this.attributes = builder.attributes;
            this.createdTime = builder.createdTime;
            this.creator = builder.creator;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.disabled = builder.disabled;
            this.displayName = builder.displayName;
            this.displayOrder = builder.displayOrder;
            this.editorType = builder.editorType;
            this.maxLength = builder.maxLength;
            this.maximum = builder.maximum;
            this.minLength = builder.minLength;
            this.minimum = builder.minimum;
            this.name = builder.name;
            this.pattern = builder.pattern;
            this.patternErrorMessage = builder.patternErrorMessage;
            this.readOnly = builder.readOnly;
            this.required = builder.required;
            this.system = builder.system;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyList create() {
            return builder().build();
        }

        /**
         * @return array
         */
        public Boolean getArray() {
            return this.array;
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return displayOrder
         */
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        /**
         * @return editorType
         */
        public String getEditorType() {
            return this.editorType;
        }

        /**
         * @return maxLength
         */
        public Integer getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return maximum
         */
        public Double getMaximum() {
            return this.maximum;
        }

        /**
         * @return minLength
         */
        public Integer getMinLength() {
            return this.minLength;
        }

        /**
         * @return minimum
         */
        public Double getMinimum() {
            return this.minimum;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return patternErrorMessage
         */
        public String getPatternErrorMessage() {
            return this.patternErrorMessage;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return system
         */
        public Boolean getSystem() {
            return this.system;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private Boolean array; 
            private String attributes; 
            private Long createdTime; 
            private String creator; 
            private String dataType; 
            private String description; 
            private Boolean disabled; 
            private String displayName; 
            private Integer displayOrder; 
            private String editorType; 
            private Integer maxLength; 
            private Double maximum; 
            private Integer minLength; 
            private Double minimum; 
            private String name; 
            private String pattern; 
            private String patternErrorMessage; 
            private Boolean readOnly; 
            private Boolean required; 
            private Boolean system; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(PropertyList model) {
                this.array = model.array;
                this.attributes = model.attributes;
                this.createdTime = model.createdTime;
                this.creator = model.creator;
                this.dataType = model.dataType;
                this.description = model.description;
                this.disabled = model.disabled;
                this.displayName = model.displayName;
                this.displayOrder = model.displayOrder;
                this.editorType = model.editorType;
                this.maxLength = model.maxLength;
                this.maximum = model.maximum;
                this.minLength = model.minLength;
                this.minimum = model.minimum;
                this.name = model.name;
                this.pattern = model.pattern;
                this.patternErrorMessage = model.patternErrorMessage;
                this.readOnly = model.readOnly;
                this.required = model.required;
                this.system = model.system;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>Indicates whether the field is an array.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder array(Boolean array) {
                this.array = array;
                return this;
            }

            /**
             * <p>The extended properties.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The time when the field was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1717664210000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The user who created the field.</p>
             * 
             * <strong>example:</strong>
             * <p>cretor-xxx@ccc-test</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The data type.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The description of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>Description-xxxx</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the field is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>DisplayName-A</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The display order in the list.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder displayOrder(Integer displayOrder) {
                this.displayOrder = displayOrder;
                return this;
            }

            /**
             * <p>The type of the editor.</p>
             * 
             * <strong>example:</strong>
             * <p>textbox</p>
             */
            public Builder editorType(String editorType) {
                this.editorType = editorType;
                return this;
            }

            /**
             * <p>The maximum length.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder maxLength(Integer maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * <p>The maximum value of the number.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maximum(Double maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * <p>The minimum length.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minLength(Integer minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * <p>The minimum value of the number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minimum(Double minimum) {
                this.minimum = minimum;
                return this;
            }

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>Name-A</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The validation rule that is specified by a regular expression.</p>
             * 
             * <strong>example:</strong>
             * <p>^</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>The error message that is returned when the regular expression fails to pass the validation.</p>
             * 
             * <strong>example:</strong>
             * <p>不是有效的email地址</p>
             */
            public Builder patternErrorMessage(String patternErrorMessage) {
                this.patternErrorMessage = patternErrorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the field is read-only.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>Indicates whether the field is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>Indicates whether the field is a system field.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder system(Boolean system) {
                this.system = system;
                return this;
            }

            /**
             * <p>The time when the field was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1717664210000</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public PropertyList build() {
                return new PropertyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSummaryTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetSummaryTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("Editor")
        private String editor;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PropertyList")
        private java.util.List<PropertyList> propertyList;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Data(Builder builder) {
            this.categoryId = builder.categoryId;
            this.editor = builder.editor;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.propertyList = builder.propertyList;
            this.state = builder.state;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return editor
         */
        public String getEditor() {
            return this.editor;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return propertyList
         */
        public java.util.List<PropertyList> getPropertyList() {
            return this.propertyList;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String categoryId; 
            private String editor; 
            private String instanceId; 
            private String name; 
            private java.util.List<PropertyList> propertyList; 
            private String state; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.categoryId = model.categoryId;
                this.editor = model.editor;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.propertyList = model.propertyList;
                this.state = model.state;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The ID of the summary category.</p>
             * 
             * <strong>example:</strong>
             * <p>8939-4223-86d0-6bd187905cc8</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The user who edited the template.</p>
             * 
             * <strong>example:</strong>
             * <p>editor-xxx@ccc-test</p>
             */
            public Builder editor(String editor) {
                this.editor = editor;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>测试模板</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of template fields.</p>
             */
            public Builder propertyList(java.util.List<PropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            /**
             * <p>The status code.</p>
             * <ul>
             * <li><p>Enabled: The template is enabled.</p>
             * </li>
             * <li><p>Disabled: The template is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>43c2671b-8939-4223-86d0-6bd187905cc8_1717664210492</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
