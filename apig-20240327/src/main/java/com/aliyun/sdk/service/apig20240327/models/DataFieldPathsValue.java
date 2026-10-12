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
 * {@link DataFieldPathsValue} extends {@link TeaModel}
 *
 * <p>DataFieldPathsValue</p>
 */
public class DataFieldPathsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fieldKey")
    private String fieldKey;

    @com.aliyun.core.annotation.NameInMap("jsonPath")
    private String jsonPath;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    private DataFieldPathsValue(Builder builder) {
        this.fieldKey = builder.fieldKey;
        this.jsonPath = builder.jsonPath;
        this.source = builder.source;
        this.category = builder.category;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataFieldPathsValue create() {
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

    public static final class Builder {
        private String fieldKey; 
        private String jsonPath; 
        private String source; 
        private String category; 

        private Builder() {
        } 

        private Builder(DataFieldPathsValue model) {
            this.fieldKey = model.fieldKey;
            this.jsonPath = model.jsonPath;
            this.source = model.source;
            this.category = model.category;
        } 

        /**
         * <p>The identifier key of the template field, such as input_token.</p>
         * 
         * <strong>example:</strong>
         * <p>input_token</p>
         */
        public Builder fieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }

        /**
         * <p>The JSONPath expression of the template field in the request or response message, such as usage.prompt_tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>usage.prompt_tokens</p>
         */
        public Builder jsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
            return this;
        }

        /**
         * <p>The value source of the field, which indicates the part of the message from which the field is read, such as response_body.</p>
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

        public DataFieldPathsValue build() {
            return new DataFieldPathsValue(this);
        } 

    } 

}
