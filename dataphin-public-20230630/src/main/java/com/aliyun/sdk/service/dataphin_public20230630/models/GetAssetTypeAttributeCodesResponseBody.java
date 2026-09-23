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
 * {@link GetAssetTypeAttributeCodesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetTypeAttributeCodesResponseBody</p>
 */
public class GetAssetTypeAttributeCodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAssetTypeAttributeCodesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetTypeAttributeCodesResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAssetTypeAttributeCodesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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
         * <p>The list of property definitions.</p>
         */
        public Builder data(java.util.List<Data> data) {
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

        public GetAssetTypeAttributeCodesResponseBody build() {
            return new GetAssetTypeAttributeCodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetTypeAttributeCodesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetTypeAttributeCodesResponseBody</p>
     */
    public static class EnumValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EnumValues(Builder builder) {
            this.displayName = builder.displayName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnumValues create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String displayName; 
            private String value; 

            private Builder() {
            } 

            private Builder(EnumValues model) {
                this.displayName = model.displayName;
                this.value = model.value;
            } 

            /**
             * <p>The display name of the option.</p>
             * 
             * <strong>example:</strong>
             * <p>Core</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The option value.</p>
             * 
             * <strong>example:</strong>
             * <p>L1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EnumValues build() {
                return new EnumValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAssetTypeAttributeCodesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetTypeAttributeCodesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeCode")
        private String attributeCode;

        @com.aliyun.core.annotation.NameInMap("AttributeName")
        private String attributeName;

        @com.aliyun.core.annotation.NameInMap("AttributeSource")
        private String attributeSource;

        @com.aliyun.core.annotation.NameInMap("AttributeType")
        private String attributeType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EditableIn")
        private java.util.List<String> editableIn;

        @com.aliyun.core.annotation.NameInMap("EnumSourceType")
        private String enumSourceType;

        @com.aliyun.core.annotation.NameInMap("EnumValues")
        private java.util.List<EnumValues> enumValues;

        @com.aliyun.core.annotation.NameInMap("InputMode")
        private String inputMode;

        @com.aliyun.core.annotation.NameInMap("LinkTarget")
        private String linkTarget;

        @com.aliyun.core.annotation.NameInMap("MaxLength")
        private Integer maxLength;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("SystemReferenceType")
        private String systemReferenceType;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        @com.aliyun.core.annotation.NameInMap("VisibleIn")
        private java.util.List<String> visibleIn;

        private Data(Builder builder) {
            this.attributeCode = builder.attributeCode;
            this.attributeName = builder.attributeName;
            this.attributeSource = builder.attributeSource;
            this.attributeType = builder.attributeType;
            this.description = builder.description;
            this.editableIn = builder.editableIn;
            this.enumSourceType = builder.enumSourceType;
            this.enumValues = builder.enumValues;
            this.inputMode = builder.inputMode;
            this.linkTarget = builder.linkTarget;
            this.maxLength = builder.maxLength;
            this.required = builder.required;
            this.systemReferenceType = builder.systemReferenceType;
            this.valueType = builder.valueType;
            this.visibleIn = builder.visibleIn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attributeCode
         */
        public String getAttributeCode() {
            return this.attributeCode;
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributeSource
         */
        public String getAttributeSource() {
            return this.attributeSource;
        }

        /**
         * @return attributeType
         */
        public String getAttributeType() {
            return this.attributeType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return editableIn
         */
        public java.util.List<String> getEditableIn() {
            return this.editableIn;
        }

        /**
         * @return enumSourceType
         */
        public String getEnumSourceType() {
            return this.enumSourceType;
        }

        /**
         * @return enumValues
         */
        public java.util.List<EnumValues> getEnumValues() {
            return this.enumValues;
        }

        /**
         * @return inputMode
         */
        public String getInputMode() {
            return this.inputMode;
        }

        /**
         * @return linkTarget
         */
        public String getLinkTarget() {
            return this.linkTarget;
        }

        /**
         * @return maxLength
         */
        public Integer getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return systemReferenceType
         */
        public String getSystemReferenceType() {
            return this.systemReferenceType;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        /**
         * @return visibleIn
         */
        public java.util.List<String> getVisibleIn() {
            return this.visibleIn;
        }

        public static final class Builder {
            private String attributeCode; 
            private String attributeName; 
            private String attributeSource; 
            private String attributeType; 
            private String description; 
            private java.util.List<String> editableIn; 
            private String enumSourceType; 
            private java.util.List<EnumValues> enumValues; 
            private String inputMode; 
            private String linkTarget; 
            private Integer maxLength; 
            private Boolean required; 
            private String systemReferenceType; 
            private String valueType; 
            private java.util.List<String> visibleIn; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.attributeCode = model.attributeCode;
                this.attributeName = model.attributeName;
                this.attributeSource = model.attributeSource;
                this.attributeType = model.attributeType;
                this.description = model.description;
                this.editableIn = model.editableIn;
                this.enumSourceType = model.enumSourceType;
                this.enumValues = model.enumValues;
                this.inputMode = model.inputMode;
                this.linkTarget = model.linkTarget;
                this.maxLength = model.maxLength;
                this.required = model.required;
                this.systemReferenceType = model.systemReferenceType;
                this.valueType = model.valueType;
                this.visibleIn = model.visibleIn;
            } 

            /**
             * <p>The property code (unique identifier).</p>
             * 
             * <strong>example:</strong>
             * <p>data_level</p>
             */
            public Builder attributeCode(String attributeCode) {
                this.attributeCode = attributeCode;
                return this;
            }

            /**
             * <p>The property name (display name).</p>
             * 
             * <strong>example:</strong>
             * <p>Data level</p>
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * <p>The property source. Valid values:</p>
             * <ul>
             * <li>SYSTEM: system preset.</li>
             * <li>CUSTOM: custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder attributeSource(String attributeSource) {
                this.attributeSource = attributeSource;
                return this;
            }

            /**
             * <p>The property type. Valid values:</p>
             * <ul>
             * <li>MANAGEMENT: management property.</li>
             * <li>TECHNICAL: technical property.</li>
             * <li>BUSINESS: business property.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MANAGEMENT</p>
             */
            public Builder attributeType(String attributeType) {
                this.attributeType = attributeType;
                return this;
            }

            /**
             * <p>The property description.</p>
             * 
             * <strong>example:</strong>
             * <p>Data asset level classification</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The location where the property can be edited. Valid values:</p>
             * <ul>
             * <li>ASSET: asset catalog.</li>
             * <li>DEVELOPMENT: development.</li>
             * </ul>
             */
            public Builder editableIn(java.util.List<String> editableIn) {
                this.editableIn = editableIn;
                return this;
            }

            /**
             * <p>The source of dropdown options. Valid values:</p>
             * <ul>
             * <li>MANUAL: manual input.</li>
             * <li>SYSTEM_REFERENCE: reference to a system property.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MANUAL</p>
             */
            public Builder enumSourceType(String enumSourceType) {
                this.enumSourceType = enumSourceType;
                return this;
            }

            /**
             * <p>The list of dropdown options. This parameter has a value only when EnumSourceType is set to MANUAL.</p>
             */
            public Builder enumValues(java.util.List<EnumValues> enumValues) {
                this.enumValues = enumValues;
                return this;
            }

            /**
             * <p>The input mode. Valid values:</p>
             * <ul>
             * <li>CUSTOM_INPUT: custom input.</li>
             * <li>DROPDOWN_SINGLE: single-select dropdown.</li>
             * <li>DROPDOWN_MULTI: multi-select dropdown.</li>
             * <li>HYPERLINK: hyperlink.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DROPDOWN_SINGLE</p>
             */
            public Builder inputMode(String inputMode) {
                this.inputMode = inputMode;
                return this;
            }

            /**
             * <p>The hyperlink navigation method. This parameter has a value only when InputMode is set to HYPERLINK. Valid values:</p>
             * <ul>
             * <li>CURRENT_PAGE: opens in the current page.</li>
             * <li>NEW_PAGE: opens in a new page.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NEW_PAGE</p>
             */
            public Builder linkTarget(String linkTarget) {
                this.linkTarget = linkTarget;
                return this;
            }

            /**
             * <p>The maximum length. This parameter is valid only when ValueType is set to STRING.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxLength(Integer maxLength) {
                this.maxLength = maxLength;
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
             * <p>The type of the referenced system property. This parameter has a value only when EnumSourceType is set to SYSTEM_REFERENCE.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder systemReferenceType(String systemReferenceType) {
                this.systemReferenceType = systemReferenceType;
                return this;
            }

            /**
             * <p>The data type of the property value.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            /**
             * <p>The location where the property is visible. Valid values:</p>
             * <ul>
             * <li>ASSET: asset catalog.</li>
             * <li>DEVELOPMENT: development.</li>
             * </ul>
             */
            public Builder visibleIn(java.util.List<String> visibleIn) {
                this.visibleIn = visibleIn;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
