// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link EmbeddingTransformParameters} extends {@link TeaModel}
 *
 * <p>EmbeddingTransformParameters</p>
 */
public class EmbeddingTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("EmbeddingData")
    private EmbeddingData embeddingData;

    @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
    private String embeddingModel;

    private EmbeddingTransformParameters(Builder builder) {
        this.apiKey = builder.apiKey;
        this.embeddingData = builder.embeddingData;
        this.embeddingModel = builder.embeddingModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EmbeddingTransformParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return embeddingData
     */
    public EmbeddingData getEmbeddingData() {
        return this.embeddingData;
    }

    /**
     * @return embeddingModel
     */
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public static final class Builder {
        private String apiKey; 
        private EmbeddingData embeddingData; 
        private String embeddingModel; 

        private Builder() {
        } 

        private Builder(EmbeddingTransformParameters model) {
            this.apiKey = model.apiKey;
            this.embeddingData = model.embeddingData;
            this.embeddingModel = model.embeddingModel;
        } 

        /**
         * <p>The API key used to call the Model Studio embedding model service.</p>
         * 
         * <strong>example:</strong>
         * <p>Q37sQ****</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The input data to be vectorized and its transformation method.</p>
         */
        public Builder embeddingData(EmbeddingData embeddingData) {
            this.embeddingData = embeddingData;
            return this;
        }

        /**
         * <p>The name of the model used to generate embeddings.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v3</p>
         */
        public Builder embeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }

        public EmbeddingTransformParameters build() {
            return new EmbeddingTransformParameters(this);
        } 

    } 

    /**
     * 
     * {@link EmbeddingTransformParameters} extends {@link TeaModel}
     *
     * <p>EmbeddingTransformParameters</p>
     */
    public static class EmbeddingData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EmbeddingData(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmbeddingData create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(EmbeddingData model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The method used to generate the input data. JSONPATH indicates that data is extracted from the event by using JSONPath.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template used to build the input data. This parameter is used only when Form is set to TEMPLATE.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The source content of the input data. If Form is set to JSONPATH, specify a JSONPath expression.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.message</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EmbeddingData build() {
                return new EmbeddingData(this);
            } 

        } 

    }
}
