// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link AiModel} extends {@link TeaModel}
 *
 * <p>AiModel</p>
 */
public class AiModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("inputSchema")
    private Schema inputSchema;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("options")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, String> options;

    @com.aliyun.core.annotation.NameInMap("outputSchema")
    private Schema outputSchema;

    private AiModel(Builder builder) {
        this.comment = builder.comment;
        this.inputSchema = builder.inputSchema;
        this.name = builder.name;
        this.options = builder.options;
        this.outputSchema = builder.outputSchema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return inputSchema
     */
    public Schema getInputSchema() {
        return this.inputSchema;
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
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * @return outputSchema
     */
    public Schema getOutputSchema() {
        return this.outputSchema;
    }

    public static final class Builder {
        private String comment; 
        private Schema inputSchema; 
        private String name; 
        private java.util.Map<String, String> options; 
        private Schema outputSchema; 

        private Builder() {
        } 

        private Builder(AiModel model) {
            this.comment = model.comment;
            this.inputSchema = model.inputSchema;
            this.name = model.name;
            this.options = model.options;
            this.outputSchema = model.outputSchema;
        } 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * inputSchema.
         */
        public Builder inputSchema(Schema inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder options(java.util.Map<String, String> options) {
            this.options = options;
            return this;
        }

        /**
         * outputSchema.
         */
        public Builder outputSchema(Schema outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }

        public AiModel build() {
            return new AiModel(this);
        } 

    } 

}
