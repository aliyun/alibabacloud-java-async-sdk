// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DataPathConfigsFieldPathsValue} extends {@link TeaModel}
 *
 * <p>DataPathConfigsFieldPathsValue</p>
 */
public class DataPathConfigsFieldPathsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fieldKey")
    private String fieldKey;

    @com.aliyun.core.annotation.NameInMap("jsonPath")
    private String jsonPath;

    @com.aliyun.core.annotation.NameInMap("rule")
    private String rule;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("io")
    private String io;

    @com.aliyun.core.annotation.NameInMap("sensitive")
    private Boolean sensitive;

    @com.aliyun.core.annotation.NameInMap("recordEnabled")
    private Boolean recordEnabled;

    @com.aliyun.core.annotation.NameInMap("toggleAllowed")
    private Boolean toggleAllowed;

    @com.aliyun.core.annotation.NameInMap("jsonPathRewriteAllowed")
    private Boolean jsonPathRewriteAllowed;

    @com.aliyun.core.annotation.NameInMap("fromTemplate")
    private Boolean fromTemplate;

    private DataPathConfigsFieldPathsValue(Builder builder) {
        this.fieldKey = builder.fieldKey;
        this.jsonPath = builder.jsonPath;
        this.rule = builder.rule;
        this.name = builder.name;
        this.description = builder.description;
        this.source = builder.source;
        this.category = builder.category;
        this.io = builder.io;
        this.sensitive = builder.sensitive;
        this.recordEnabled = builder.recordEnabled;
        this.toggleAllowed = builder.toggleAllowed;
        this.jsonPathRewriteAllowed = builder.jsonPathRewriteAllowed;
        this.fromTemplate = builder.fromTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataPathConfigsFieldPathsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fieldKey
     */
    public String getFieldKey() {
        return this.fieldKey;
    }

    /**
     * @return jsonPath
     */
    public String getJsonPath() {
        return this.jsonPath;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return io
     */
    public String getIo() {
        return this.io;
    }

    /**
     * @return sensitive
     */
    public Boolean getSensitive() {
        return this.sensitive;
    }

    /**
     * @return recordEnabled
     */
    public Boolean getRecordEnabled() {
        return this.recordEnabled;
    }

    /**
     * @return toggleAllowed
     */
    public Boolean getToggleAllowed() {
        return this.toggleAllowed;
    }

    /**
     * @return jsonPathRewriteAllowed
     */
    public Boolean getJsonPathRewriteAllowed() {
        return this.jsonPathRewriteAllowed;
    }

    /**
     * @return fromTemplate
     */
    public Boolean getFromTemplate() {
        return this.fromTemplate;
    }

    public static final class Builder {
        private String fieldKey; 
        private String jsonPath; 
        private String rule; 
        private String name; 
        private String description; 
        private String source; 
        private String category; 
        private String io; 
        private Boolean sensitive; 
        private Boolean recordEnabled; 
        private Boolean toggleAllowed; 
        private Boolean jsonPathRewriteAllowed; 
        private Boolean fromTemplate; 

        private Builder() {
        } 

        private Builder(DataPathConfigsFieldPathsValue model) {
            this.fieldKey = model.fieldKey;
            this.jsonPath = model.jsonPath;
            this.rule = model.rule;
            this.name = model.name;
            this.description = model.description;
            this.source = model.source;
            this.category = model.category;
            this.io = model.io;
            this.sensitive = model.sensitive;
            this.recordEnabled = model.recordEnabled;
            this.toggleAllowed = model.toggleAllowed;
            this.jsonPathRewriteAllowed = model.jsonPathRewriteAllowed;
            this.fromTemplate = model.fromTemplate;
        } 

        /**
         * <p>The identity key of the field, which is unique within the same request path, such as input_token.</p>
         * 
         * <strong>example:</strong>
         * <p>input_token</p>
         */
        public Builder fieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }

        /**
         * <p>The JSONPath expression of the field in the request or response message, such as usage.prompt_tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>usage.prompt_tokens</p>
         */
        public Builder jsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
            return this;
        }

        /**
         * <p>The value extraction rule for the field.</p>
         * 
         * <strong>example:</strong>
         * <p>first</p>
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>The display name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>Input token</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The description of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>Input token statistics</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The source of the field value, indicating which part of the message the field is read from, such as response_body.</p>
         * 
         * <strong>example:</strong>
         * <p>response_body</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The statistical category to which the field belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The message direction to which the field belongs, indicating whether it is extracted from the request or the response.</p>
         * 
         * <strong>example:</strong>
         * <p>response</p>
         */
        public Builder io(String io) {
            this.io = io;
            return this;
        }

        /**
         * <p>Indicates whether the field contains sensitive information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        /**
         * <p>Indicates whether collection is enabled for the field.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder recordEnabled(Boolean recordEnabled) {
            this.recordEnabled = recordEnabled;
            return this;
        }

        /**
         * <p>Indicates whether the collection status of the field can be toggled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder toggleAllowed(Boolean toggleAllowed) {
            this.toggleAllowed = toggleAllowed;
            return this;
        }

        /**
         * <p>Indicates whether the JSONPath of the field can be rewritten.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder jsonPathRewriteAllowed(Boolean jsonPathRewriteAllowed) {
            this.jsonPathRewriteAllowed = jsonPathRewriteAllowed;
            return this;
        }

        /**
         * <p>Indicates whether the field configuration is derived from a field template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fromTemplate(Boolean fromTemplate) {
            this.fromTemplate = fromTemplate;
            return this;
        }

        public DataPathConfigsFieldPathsValue build() {
            return new DataPathConfigsFieldPathsValue(this);
        } 

    } 

}
