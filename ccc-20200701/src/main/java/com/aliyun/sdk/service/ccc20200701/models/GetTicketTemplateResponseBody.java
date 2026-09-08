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
    private java.util.List<String> params;

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

        private Builder(GetTicketTemplateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>List of error parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BF268B34-09C2-43FD-BAC4-5D31EA633111</p>
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

            private Builder() {
            } 

            private Builder(TicketFields model) {
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
             * <p>Whether the field is an array.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder array(Boolean array) {
                this.array = array;
                return this;
            }

            /**
             * <p>Extension attributes.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1717664210000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Creator.</p>
             * 
             * <strong>example:</strong>
             * <p>creator@cccV2-kmz</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Data type.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>姓名描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Whether the field is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>Display name.</p>
             * 
             * <strong>example:</strong>
             * <p>姓名</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Display order in lists.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder displayOrder(Integer displayOrder) {
                this.displayOrder = displayOrder;
                return this;
            }

            /**
             * <p>Editor type.</p>
             * 
             * <strong>example:</strong>
             * <p>textbox</p>
             */
            public Builder editorType(String editorType) {
                this.editorType = editorType;
                return this;
            }

            /**
             * <p>Maximum length.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder maxLength(Integer maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * <p>Numeric maximum value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maximum(Double maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * <p>Minimum length.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minLength(Integer minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * <p>Numeric minimum value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minimum(Double minimum) {
                this.minimum = minimum;
                return this;
            }

            /**
             * <p>Name.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Regular expression validation rule.</p>
             * 
             * <strong>example:</strong>
             * <p>^</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>Error message for regular expression validation.</p>
             * 
             * <strong>example:</strong>
             * <p>不是有效的email地址</p>
             */
            public Builder patternErrorMessage(String patternErrorMessage) {
                this.patternErrorMessage = patternErrorMessage;
                return this;
            }

            /**
             * <p>Whether the field is read-only.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>Whether the field is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>Whether the field is a system field.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder system(Boolean system) {
                this.system = system;
                return this;
            }

            /**
             * <p>Update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1717664210000</p>
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
        private java.util.List<TicketFields> ticketFields;

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
        public java.util.List<TicketFields> getTicketFields() {
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
            private java.util.List<TicketFields> ticketFields; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.categoryId = model.categoryId;
                this.editor = model.editor;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.processDefinition = model.processDefinition;
                this.state = model.state;
                this.templateId = model.templateId;
                this.ticketFields = model.ticketFields;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>Ticket category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>43c2671b-****-4223-86d0-6bd187905cc8</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>Template editor.</p>
             * 
             * <strong>example:</strong>
             * <p>editor-xxx@ccc-test</p>
             */
            public Builder editor(String editor) {
                this.editor = editor;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Template name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试模板。</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Workflow information.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;id\&quot;:\&quot;TICKET_START\&quot;,\&quot;name\&quot;:\&quot;开始\&quot;,\&quot;nodeIndex\&quot;:0,\&quot;properties\&quot;:{\&quot;position\&quot;:{\&quot;x\&quot;:250,\&quot;y\&quot;:200}},\&quot;type\&quot;:\&quot;TICKET_START\&quot;,\&quot;events\&quot;:[{\&quot;edgeId\&quot;:\&quot;8bd07339\&quot;,\&quot;sourceAnchor\&quot;:0,\&quot;next\&quot;:\&quot;APPROVAL__JNBSSREc\&quot;,\&quot;targetAnchor\&quot;:0}]},{\&quot;id\&quot;:\&quot;TICKET_FINISH\&quot;,\&quot;name\&quot;:\&quot;结束\&quot;,\&quot;nodeIndex\&quot;:9999,\&quot;properties\&quot;:{\&quot;position\&quot;:{\&quot;x\&quot;:767,\&quot;y\&quot;:206}},\&quot;type\&quot;:\&quot;TICKET_FINISH\&quot;,\&quot;events\&quot;:[]},{\&quot;id\&quot;:\&quot;APPROVAL__JNBSSREc\&quot;,\&quot;name\&quot;:\&quot;流程节点\&quot;,\&quot;nodeIndex\&quot;:1,\&quot;properties\&quot;:{\&quot;skillGroupId\&quot;:\&quot;chat001@cccV2-kmz\&quot;,\&quot;position\&quot;:{\&quot;x\&quot;:537,\&quot;y\&quot;:164.5}},\&quot;type\&quot;:\&quot;APPROVAL\&quot;,\&quot;events\&quot;:[{\&quot;edgeId\&quot;:\&quot;74031613\&quot;,\&quot;sourceAnchor\&quot;:1,\&quot;next\&quot;:\&quot;TICKET_FINISH\&quot;,\&quot;targetAnchor\&quot;:0}]}]</p>
             */
            public Builder processDefinition(String processDefinition) {
                this.processDefinition = processDefinition;
                return this;
            }

            /**
             * <p>Status code.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4ca2e2-c8d19b82c-d7ce393ac8197d3ab</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>List of template fields.</p>
             */
            public Builder ticketFields(java.util.List<TicketFields> ticketFields) {
                this.ticketFields = ticketFields;
                return this;
            }

            /**
             * <p>Last modified time.</p>
             * 
             * <strong>example:</strong>
             * <p>1717664210000</p>
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
