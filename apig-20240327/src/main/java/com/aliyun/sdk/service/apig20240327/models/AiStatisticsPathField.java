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
         * <p>The secondary business category of the field. Optional. Valid values: conversation (conversation content), config (configuration parameters), tools (tool calling), usage (usage statistics), metadata (metadata), choices (candidate results), identity (identity identifier), cache (cache information), media (multimedia content), logprobs (log probabilities), and custom (custom field). Set custom fields to custom.</p>
         * 
         * <strong>example:</strong>
         * <p>conversation</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The field description.</p>
         * 
         * <strong>example:</strong>
         * <p>The question content entered by the user</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The log key (field name).</p>
         * 
         * <strong>example:</strong>
         * <p>question</p>
         */
        public Builder fieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }

        /**
         * <p>The request or response attribution. The backend normalizes this to request or response based on source.</p>
         * 
         * <strong>example:</strong>
         * <p>request</p>
         */
        public Builder io(String io) {
            this.io = io;
            return this;
        }

        /**
         * <p>The corresponding jsonPath (gjson syntax).</p>
         * 
         * <strong>example:</strong>
         * <p>messages.#.content</p>
         */
        public Builder jsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
            return this;
        }

        /**
         * <p>The annotation for the field key name.</p>
         * 
         * <strong>example:</strong>
         * <p>Question content</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether collection is enabled to create a log record for the corresponding field in AI request logs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder recordEnabled(Boolean recordEnabled) {
            this.recordEnabled = recordEnabled;
            return this;
        }

        /**
         * <p>The aggregation rule for streaming response fields. Valid values: append, first, and replace. append: appends the matched values from each streaming chunk in sequence. first: retains the first matched value. replace: uses the last matched value. When source is response_streaming_body and rule is not specified, first is used by default. This field is not required for non-streaming scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>append</p>
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>Specifies whether the field is sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        /**
         * <p>The source of the field value. Valid values: fixed_value (fixed value), request_body (request body), request_header (request header), response_header (response header), response_body (non-streaming response body), and response_streaming_body (streaming response body).</p>
         * 
         * <strong>example:</strong>
         * <p>request_body</p>
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
