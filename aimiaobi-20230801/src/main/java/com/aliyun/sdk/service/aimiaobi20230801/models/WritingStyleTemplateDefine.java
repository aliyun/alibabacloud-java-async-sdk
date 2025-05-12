// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link WritingStyleTemplateDefine} extends {@link TeaModel}
 *
 * <p>WritingStyleTemplateDefine</p>
 */
public class WritingStyleTemplateDefine extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Example")
    private java.util.List<Example> example;

    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List<WritingStyleTemplateField> fields;

    private WritingStyleTemplateDefine(Builder builder) {
        this.example = builder.example;
        this.fields = builder.fields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WritingStyleTemplateDefine create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return example
     */
    public java.util.List<Example> getExample() {
        return this.example;
    }

    /**
     * @return fields
     */
    public java.util.List<WritingStyleTemplateField> getFields() {
        return this.fields;
    }

    public static final class Builder {
        private java.util.List<Example> example; 
        private java.util.List<WritingStyleTemplateField> fields; 

        private Builder() {
        } 

        private Builder(WritingStyleTemplateDefine model) {
            this.example = model.example;
            this.fields = model.fields;
        } 

        /**
         * Example.
         */
        public Builder example(java.util.List<Example> example) {
            this.example = example;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(java.util.List<WritingStyleTemplateField> fields) {
            this.fields = fields;
            return this;
        }

        public WritingStyleTemplateDefine build() {
            return new WritingStyleTemplateDefine(this);
        } 

    } 

    /**
     * 
     * {@link WritingStyleTemplateDefine} extends {@link TeaModel}
     *
     * <p>WritingStyleTemplateDefine</p>
     */
    public static class Example extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Example(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Example create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Example model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Example build() {
                return new Example(this);
            } 

        } 

    }
}
