// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkItemAllFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkItemAllFieldsResponseBody</p>
 */
public class ListWorkItemAllFieldsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("fields")
    private java.util.List < Fields> fields;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private ListWorkItemAllFieldsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.fields = builder.fields;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkItemAllFieldsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return fields
     */
    public java.util.List < Fields> getFields() {
        return this.fields;
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
        private String errorCode; 
        private String errorMsg; 
        private java.util.List < Fields> fields; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(java.util.List < Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWorkItemAllFieldsResponseBody build() {
            return new ListWorkItemAllFieldsResponseBody(this);
        } 

    } 

    public static class Options extends TeaModel {
        @NameInMap("displayValue")
        private String displayValue;

        @NameInMap("fieldIdentifier")
        private String fieldIdentifier;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("level")
        private Long level;

        @NameInMap("position")
        private Long position;

        @NameInMap("value")
        private String value;

        @NameInMap("valueEn")
        private String valueEn;

        private Options(Builder builder) {
            this.displayValue = builder.displayValue;
            this.fieldIdentifier = builder.fieldIdentifier;
            this.identifier = builder.identifier;
            this.level = builder.level;
            this.position = builder.position;
            this.value = builder.value;
            this.valueEn = builder.valueEn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return displayValue
         */
        public String getDisplayValue() {
            return this.displayValue;
        }

        /**
         * @return fieldIdentifier
         */
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return position
         */
        public Long getPosition() {
            return this.position;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueEn
         */
        public String getValueEn() {
            return this.valueEn;
        }

        public static final class Builder {
            private String displayValue; 
            private String fieldIdentifier; 
            private String identifier; 
            private Long level; 
            private Long position; 
            private String value; 
            private String valueEn; 

            /**
             * displayValue.
             */
            public Builder displayValue(String displayValue) {
                this.displayValue = displayValue;
                return this;
            }

            /**
             * fieldIdentifier.
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * position.
             */
            public Builder position(Long position) {
                this.position = position;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * valueEn.
             */
            public Builder valueEn(String valueEn) {
                this.valueEn = valueEn;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    public static class Fields extends TeaModel {
        @NameInMap("className")
        private String className;

        @NameInMap("creator")
        private String creator;

        @NameInMap("defaultValue")
        private String defaultValue;

        @NameInMap("description")
        private String description;

        @NameInMap("format")
        private String format;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("gmtModified")
        private Long gmtModified;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("isRequired")
        private Boolean isRequired;

        @NameInMap("isShowWhenCreate")
        private Boolean isShowWhenCreate;

        @NameInMap("isSystemRequired")
        private Boolean isSystemRequired;

        @NameInMap("linkWithService")
        private String linkWithService;

        @NameInMap("modifier")
        private String modifier;

        @NameInMap("name")
        private String name;

        @NameInMap("options")
        private java.util.List < Options> options;

        @NameInMap("resourceType")
        private String resourceType;

        @NameInMap("type")
        private String type;

        private Fields(Builder builder) {
            this.className = builder.className;
            this.creator = builder.creator;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.format = builder.format;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.identifier = builder.identifier;
            this.isRequired = builder.isRequired;
            this.isShowWhenCreate = builder.isShowWhenCreate;
            this.isSystemRequired = builder.isSystemRequired;
            this.linkWithService = builder.linkWithService;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.options = builder.options;
            this.resourceType = builder.resourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
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
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return isShowWhenCreate
         */
        public Boolean getIsShowWhenCreate() {
            return this.isShowWhenCreate;
        }

        /**
         * @return isSystemRequired
         */
        public Boolean getIsSystemRequired() {
            return this.isSystemRequired;
        }

        /**
         * @return linkWithService
         */
        public String getLinkWithService() {
            return this.linkWithService;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return options
         */
        public java.util.List < Options> getOptions() {
            return this.options;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String className; 
            private String creator; 
            private String defaultValue; 
            private String description; 
            private String format; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String identifier; 
            private Boolean isRequired; 
            private Boolean isShowWhenCreate; 
            private Boolean isSystemRequired; 
            private String linkWithService; 
            private String modifier; 
            private String name; 
            private java.util.List < Options> options; 
            private String resourceType; 
            private String type; 

            /**
             * className.
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * defaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * isRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * isShowWhenCreate.
             */
            public Builder isShowWhenCreate(Boolean isShowWhenCreate) {
                this.isShowWhenCreate = isShowWhenCreate;
                return this;
            }

            /**
             * isSystemRequired.
             */
            public Builder isSystemRequired(Boolean isSystemRequired) {
                this.isSystemRequired = isSystemRequired;
                return this;
            }

            /**
             * linkWithService.
             */
            public Builder linkWithService(String linkWithService) {
                this.linkWithService = linkWithService;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * options.
             */
            public Builder options(java.util.List < Options> options) {
                this.options = options;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
