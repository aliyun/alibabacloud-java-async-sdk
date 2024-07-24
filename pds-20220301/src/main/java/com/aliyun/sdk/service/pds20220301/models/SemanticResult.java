// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SemanticResult} extends {@link TeaModel}
 *
 * <p>SemanticResult</p>
 */
public class SemanticResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("document_contents")
    private java.util.List < DocumentContent > documentContents;

    @com.aliyun.core.annotation.NameInMap("scene_contents")
    private java.util.List < SceneContent > sceneContents;

    @com.aliyun.core.annotation.NameInMap("semantic_similarity")
    private Double semanticSimilarity;

    private SemanticResult(Builder builder) {
        this.documentContents = builder.documentContents;
        this.sceneContents = builder.sceneContents;
        this.semanticSimilarity = builder.semanticSimilarity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SemanticResult create() {
        return builder().build();
    }

    /**
     * @return documentContents
     */
    public java.util.List < DocumentContent > getDocumentContents() {
        return this.documentContents;
    }

    /**
     * @return sceneContents
     */
    public java.util.List < SceneContent > getSceneContents() {
        return this.sceneContents;
    }

    /**
     * @return semanticSimilarity
     */
    public Double getSemanticSimilarity() {
        return this.semanticSimilarity;
    }

    public static final class Builder {
        private java.util.List < DocumentContent > documentContents; 
        private java.util.List < SceneContent > sceneContents; 
        private Double semanticSimilarity; 

        /**
         * document_contents.
         */
        public Builder documentContents(java.util.List < DocumentContent > documentContents) {
            this.documentContents = documentContents;
            return this;
        }

        /**
         * scene_contents.
         */
        public Builder sceneContents(java.util.List < SceneContent > sceneContents) {
            this.sceneContents = sceneContents;
            return this;
        }

        /**
         * semantic_similarity.
         */
        public Builder semanticSimilarity(Double semanticSimilarity) {
            this.semanticSimilarity = semanticSimilarity;
            return this;
        }

        public SemanticResult build() {
            return new SemanticResult(this);
        } 

    } 

}
