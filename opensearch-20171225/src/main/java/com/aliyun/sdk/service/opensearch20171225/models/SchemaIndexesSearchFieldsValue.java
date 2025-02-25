// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SchemaIndexesSearchFieldsValue} extends {@link TeaModel}
 *
 * <p>SchemaIndexesSearchFieldsValue</p>
 */
public class SchemaIndexesSearchFieldsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("analyzer")
    private String analyzer;

    @com.aliyun.core.annotation.NameInMap("analyzerType")
    private String analyzerType;

    @com.aliyun.core.annotation.NameInMap("analyzerGeneration")
    private String analyzerGeneration;

    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List < String > fields;

    @com.aliyun.core.annotation.NameInMap("label")
    private String label;

    private SchemaIndexesSearchFieldsValue(Builder builder) {
        this.analyzer = builder.analyzer;
        this.analyzerType = builder.analyzerType;
        this.analyzerGeneration = builder.analyzerGeneration;
        this.fields = builder.fields;
        this.label = builder.label;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchemaIndexesSearchFieldsValue create() {
        return builder().build();
    }

    /**
     * @return analyzer
     */
    public String getAnalyzer() {
        return this.analyzer;
    }

    /**
     * @return analyzerType
     */
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    /**
     * @return analyzerGeneration
     */
    public String getAnalyzerGeneration() {
        return this.analyzerGeneration;
    }

    /**
     * @return fields
     */
    public java.util.List < String > getFields() {
        return this.fields;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    public static final class Builder {
        private String analyzer; 
        private String analyzerType; 
        private String analyzerGeneration; 
        private java.util.List < String > fields; 
        private String label; 

        /**
         * analyzer.
         */
        public Builder analyzer(String analyzer) {
            this.analyzer = analyzer;
            return this;
        }

        /**
         * analyzerType.
         */
        public Builder analyzerType(String analyzerType) {
            this.analyzerType = analyzerType;
            return this;
        }

        /**
         * analyzerGeneration.
         */
        public Builder analyzerGeneration(String analyzerGeneration) {
            this.analyzerGeneration = analyzerGeneration;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(java.util.List < String > fields) {
            this.fields = fields;
            return this;
        }

        /**
         * label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public SchemaIndexesSearchFieldsValue build() {
            return new SchemaIndexesSearchFieldsValue(this);
        } 

    } 

}
