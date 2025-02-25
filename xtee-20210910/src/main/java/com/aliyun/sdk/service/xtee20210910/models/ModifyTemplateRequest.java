// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyTemplateRequest</p>
 */
public class ModifyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("inputFields")
    private InputFields inputFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private ModifyTemplateRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.description = builder.description;
        this.eventCode = builder.eventCode;
        this.inputFields = builder.inputFields;
        this.regId = builder.regId;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return inputFields
     */
    public InputFields getInputFields() {
        return this.inputFields;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ModifyTemplateRequest, Builder> {
        private String lang; 
        private String description; 
        private String eventCode; 
        private InputFields inputFields; 
        private String regId; 
        private Long templateId; 
        private String templateType; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTemplateRequest request) {
            super(request);
            this.lang = request.lang;
            this.description = request.description;
            this.eventCode = request.eventCode;
            this.inputFields = request.inputFields;
            this.regId = request.regId;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
            this.version = request.version;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * inputFields.
         */
        public Builder inputFields(InputFields inputFields) {
            this.putQueryParameter("inputFields", inputFields);
            this.inputFields = inputFields;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * templateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * templateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("templateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Integer version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public ModifyTemplateRequest build() {
            return new ModifyTemplateRequest(this);
        } 

    } 

    public static class InputFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("fieldCode")
        private String fieldCode;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private InputFields(Builder builder) {
            this.description = builder.description;
            this.fieldCode = builder.fieldCode;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFields create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fieldCode
         */
        public String getFieldCode() {
            return this.fieldCode;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String fieldCode; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private String title; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * fieldCode.
             */
            public Builder fieldCode(String fieldCode) {
                this.fieldCode = fieldCode;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public InputFields build() {
                return new InputFields(this);
            } 

        } 

    }
}
