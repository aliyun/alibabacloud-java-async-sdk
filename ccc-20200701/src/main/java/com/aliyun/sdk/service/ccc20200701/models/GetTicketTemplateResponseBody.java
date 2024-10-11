// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTicketTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTicketTemplateResponseBody</p>
 */
public class GetTicketTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List < String > params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTicketTemplateResponseBody(Builder builder) {
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

    public static GetTicketTemplateResponseBody create() {
        return builder().build();
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
    public java.util.List < String > getParams() {
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
        private java.util.List < String > params; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Params.
         */
        public Builder params(java.util.List < String > params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTicketTemplateResponseBody build() {
            return new GetTicketTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTicketTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketTemplateResponseBody</p>
     */
    public static class TicketFields extends TeaModel {
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

        private TicketFields(Builder builder) {
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

        public static TicketFields create() {
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

            /**
             * Array.
             */
            public Builder array(Boolean array) {
                this.array = array;
                return this;
            }

            /**
             * Attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
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
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
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
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * DisplayOrder.
             */
            public Builder displayOrder(Integer displayOrder) {
                this.displayOrder = displayOrder;
                return this;
            }

            /**
             * EditorType.
             */
            public Builder editorType(String editorType) {
                this.editorType = editorType;
                return this;
            }

            /**
             * MaxLength.
             */
            public Builder maxLength(Integer maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * Maximum.
             */
            public Builder maximum(Double maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * MinLength.
             */
            public Builder minLength(Integer minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * Minimum.
             */
            public Builder minimum(Double minimum) {
                this.minimum = minimum;
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
             * Pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * PatternErrorMessage.
             */
            public Builder patternErrorMessage(String patternErrorMessage) {
                this.patternErrorMessage = patternErrorMessage;
                return this;
            }

            /**
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
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
             * System.
             */
            public Builder system(Boolean system) {
                this.system = system;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public TicketFields build() {
                return new TicketFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTicketTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketTemplateResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ProcessDefinition")
        private String processDefinition;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TicketFields")
        private java.util.List < TicketFields> ticketFields;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private Data(Builder builder) {
            this.categoryId = builder.categoryId;
            this.editor = builder.editor;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.processDefinition = builder.processDefinition;
            this.state = builder.state;
            this.templateId = builder.templateId;
            this.ticketFields = builder.ticketFields;
            this.updatedTime = builder.updatedTime;
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
         * @return processDefinition
         */
        public String getProcessDefinition() {
            return this.processDefinition;
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

        /**
         * @return ticketFields
         */
        public java.util.List < TicketFields> getTicketFields() {
            return this.ticketFields;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String categoryId; 
            private String editor; 
            private String instanceId; 
            private String name; 
            private String processDefinition; 
            private String state; 
            private String templateId; 
            private java.util.List < TicketFields> ticketFields; 
            private Long updatedTime; 

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * Editor.
             */
            public Builder editor(String editor) {
                this.editor = editor;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * ProcessDefinition.
             */
            public Builder processDefinition(String processDefinition) {
                this.processDefinition = processDefinition;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TicketFields.
             */
            public Builder ticketFields(java.util.List < TicketFields> ticketFields) {
                this.ticketFields = ticketFields;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
