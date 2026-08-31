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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Value.
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
             * AttributeCode.
             */
            public Builder attributeCode(String attributeCode) {
                this.attributeCode = attributeCode;
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
             * AttributeSource.
             */
            public Builder attributeSource(String attributeSource) {
                this.attributeSource = attributeSource;
                return this;
            }

            /**
             * AttributeType.
             */
            public Builder attributeType(String attributeType) {
                this.attributeType = attributeType;
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
             * EditableIn.
             */
            public Builder editableIn(java.util.List<String> editableIn) {
                this.editableIn = editableIn;
                return this;
            }

            /**
             * EnumSourceType.
             */
            public Builder enumSourceType(String enumSourceType) {
                this.enumSourceType = enumSourceType;
                return this;
            }

            /**
             * EnumValues.
             */
            public Builder enumValues(java.util.List<EnumValues> enumValues) {
                this.enumValues = enumValues;
                return this;
            }

            /**
             * InputMode.
             */
            public Builder inputMode(String inputMode) {
                this.inputMode = inputMode;
                return this;
            }

            /**
             * LinkTarget.
             */
            public Builder linkTarget(String linkTarget) {
                this.linkTarget = linkTarget;
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
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * SystemReferenceType.
             */
            public Builder systemReferenceType(String systemReferenceType) {
                this.systemReferenceType = systemReferenceType;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            /**
             * VisibleIn.
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
