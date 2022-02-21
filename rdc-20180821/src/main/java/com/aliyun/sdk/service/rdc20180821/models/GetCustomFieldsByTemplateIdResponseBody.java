// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomFieldsByTemplateIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomFieldsByTemplateIdResponseBody</p>
 */
public class GetCustomFieldsByTemplateIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCustomFieldsByTemplateIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomFieldsByTemplateIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
        private Integer code; 
        private java.util.List < Data> data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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

        public GetCustomFieldsByTemplateIdResponseBody build() {
            return new GetCustomFieldsByTemplateIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreatedAt")
        private Long createdAt;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("Dynamic")
        private Boolean dynamic;

        @NameInMap("Editable")
        private Boolean editable;

        @NameInMap("FieldFormat")
        private String fieldFormat;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("IsDelete")
        private Boolean isDelete;

        @NameInMap("IsRemember")
        private Boolean isRemember;

        @NameInMap("IsRequired")
        private Boolean isRequired;

        @NameInMap("MaxLength")
        private Integer maxLength;

        @NameInMap("MinLength")
        private Integer minLength;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameI18N")
        private String nameI18N;

        @NameInMap("Other")
        private String other;

        @NameInMap("PossibleValues")
        private String possibleValues;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdatedAt")
        private Long updatedAt;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.dynamic = builder.dynamic;
            this.editable = builder.editable;
            this.fieldFormat = builder.fieldFormat;
            this.id = builder.id;
            this.isDelete = builder.isDelete;
            this.isRemember = builder.isRemember;
            this.isRequired = builder.isRequired;
            this.maxLength = builder.maxLength;
            this.minLength = builder.minLength;
            this.name = builder.name;
            this.nameI18N = builder.nameI18N;
            this.other = builder.other;
            this.possibleValues = builder.possibleValues;
            this.type = builder.type;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dynamic
         */
        public Boolean getDynamic() {
            return this.dynamic;
        }

        /**
         * @return editable
         */
        public Boolean getEditable() {
            return this.editable;
        }

        /**
         * @return fieldFormat
         */
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return isDelete
         */
        public Boolean getIsDelete() {
            return this.isDelete;
        }

        /**
         * @return isRemember
         */
        public Boolean getIsRemember() {
            return this.isRemember;
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return maxLength
         */
        public Integer getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return minLength
         */
        public Integer getMinLength() {
            return this.minLength;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameI18N
         */
        public String getNameI18N() {
            return this.nameI18N;
        }

        /**
         * @return other
         */
        public String getOther() {
            return this.other;
        }

        /**
         * @return possibleValues
         */
        public String getPossibleValues() {
            return this.possibleValues;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Long createdAt; 
            private String defaultValue; 
            private String description; 
            private Boolean dynamic; 
            private Boolean editable; 
            private String fieldFormat; 
            private Integer id; 
            private Boolean isDelete; 
            private Boolean isRemember; 
            private Boolean isRequired; 
            private Integer maxLength; 
            private Integer minLength; 
            private String name; 
            private String nameI18N; 
            private String other; 
            private String possibleValues; 
            private String type; 
            private Long updatedAt; 

            /**
             * CreatedAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Dynamic.
             */
            public Builder dynamic(Boolean dynamic) {
                this.dynamic = dynamic;
                return this;
            }

            /**
             * Editable.
             */
            public Builder editable(Boolean editable) {
                this.editable = editable;
                return this;
            }

            /**
             * FieldFormat.
             */
            public Builder fieldFormat(String fieldFormat) {
                this.fieldFormat = fieldFormat;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * IsDelete.
             */
            public Builder isDelete(Boolean isDelete) {
                this.isDelete = isDelete;
                return this;
            }

            /**
             * IsRemember.
             */
            public Builder isRemember(Boolean isRemember) {
                this.isRemember = isRemember;
                return this;
            }

            /**
             * IsRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
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
             * MinLength.
             */
            public Builder minLength(Integer minLength) {
                this.minLength = minLength;
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
             * NameI18N.
             */
            public Builder nameI18N(String nameI18N) {
                this.nameI18N = nameI18N;
                return this;
            }

            /**
             * Other.
             */
            public Builder other(String other) {
                this.other = other;
                return this;
            }

            /**
             * PossibleValues.
             */
            public Builder possibleValues(String possibleValues) {
                this.possibleValues = possibleValues;
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
             * UpdatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
