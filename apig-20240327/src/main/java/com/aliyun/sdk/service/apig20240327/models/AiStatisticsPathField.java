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
 * {@link AiStatisticsPathField} extends {@link TeaModel}
 *
 * <p>AiStatisticsPathField</p>
 */
public class AiStatisticsPathField extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("fieldKey")
    private String fieldKey;

    @com.aliyun.core.annotation.NameInMap("io")
    private String io;

    @com.aliyun.core.annotation.NameInMap("jsonPath")
    private String jsonPath;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("recordEnabled")
    private Boolean recordEnabled;

    @com.aliyun.core.annotation.NameInMap("rule")
    private String rule;

    @com.aliyun.core.annotation.NameInMap("sensitive")
    private Boolean sensitive;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private AiStatisticsPathField(Builder builder) {
        this.category = builder.category;
        this.description = builder.description;
        this.fieldKey = builder.fieldKey;
        this.io = builder.io;
        this.jsonPath = builder.jsonPath;
        this.name = builder.name;
        this.recordEnabled = builder.recordEnabled;
        this.rule = builder.rule;
        this.sensitive = builder.sensitive;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiStatisticsPathField create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fieldKey
     */
    public String getFieldKey() {
        return this.fieldKey;
    }

    /**
     * @return io
     */
    public String getIo() {
        return this.io;
    }

    /**
     * @return jsonPath
     */
    public String getJsonPath() {
        return this.jsonPath;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recordEnabled
     */
    public Boolean getRecordEnabled() {
        return this.recordEnabled;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return sensitive
     */
    public Boolean getSensitive() {
        return this.sensitive;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder {
        private String category; 
        private String description; 
        private String fieldKey; 
        private String io; 
        private String jsonPath; 
        private String name; 
        private Boolean recordEnabled; 
        private String rule; 
        private Boolean sensitive; 
        private String source; 

        private Builder() {
        } 

        private Builder(AiStatisticsPathField model) {
            this.category = model.category;
            this.description = model.description;
            this.fieldKey = model.fieldKey;
            this.io = model.io;
            this.jsonPath = model.jsonPath;
            this.name = model.name;
            this.recordEnabled = model.recordEnabled;
            this.rule = model.rule;
            this.sensitive = model.sensitive;
            this.source = model.source;
        } 

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
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
         * fieldKey.
         */
        public Builder fieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }

        /**
         * io.
         */
        public Builder io(String io) {
            this.io = io;
            return this;
        }

        /**
         * jsonPath.
         */
        public Builder jsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
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
         * recordEnabled.
         */
        public Builder recordEnabled(Boolean recordEnabled) {
            this.recordEnabled = recordEnabled;
            return this;
        }

        /**
         * rule.
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * sensitive.
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public AiStatisticsPathField build() {
            return new AiStatisticsPathField(this);
        } 

    } 

}
