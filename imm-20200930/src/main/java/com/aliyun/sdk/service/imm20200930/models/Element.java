// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Element} extends {@link TeaModel}
 *
 * <p>Element</p>
 */
public class Element extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElementContents")
    private java.util.List<ElementContent> elementContents;

    @com.aliyun.core.annotation.NameInMap("ElementRelations")
    private java.util.List<ElementRelation> elementRelations;

    @com.aliyun.core.annotation.NameInMap("ElementType")
    private String elementType;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("SemanticSimilarity")
    private Float semanticSimilarity;

    private Element(Builder builder) {
        this.elementContents = builder.elementContents;
        this.elementRelations = builder.elementRelations;
        this.elementType = builder.elementType;
        this.objectId = builder.objectId;
        this.semanticSimilarity = builder.semanticSimilarity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Element create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elementContents
     */
    public java.util.List<ElementContent> getElementContents() {
        return this.elementContents;
    }

    /**
     * @return elementRelations
     */
    public java.util.List<ElementRelation> getElementRelations() {
        return this.elementRelations;
    }

    /**
     * @return elementType
     */
    public String getElementType() {
        return this.elementType;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return semanticSimilarity
     */
    public Float getSemanticSimilarity() {
        return this.semanticSimilarity;
    }

    public static final class Builder {
        private java.util.List<ElementContent> elementContents; 
        private java.util.List<ElementRelation> elementRelations; 
        private String elementType; 
        private String objectId; 
        private Float semanticSimilarity; 

        private Builder() {
        } 

        private Builder(Element model) {
            this.elementContents = model.elementContents;
            this.elementRelations = model.elementRelations;
            this.elementType = model.elementType;
            this.objectId = model.objectId;
            this.semanticSimilarity = model.semanticSimilarity;
        } 

        /**
         * ElementContents.
         */
        public Builder elementContents(java.util.List<ElementContent> elementContents) {
            this.elementContents = elementContents;
            return this;
        }

        /**
         * ElementRelations.
         */
        public Builder elementRelations(java.util.List<ElementRelation> elementRelations) {
            this.elementRelations = elementRelations;
            return this;
        }

        /**
         * ElementType.
         */
        public Builder elementType(String elementType) {
            this.elementType = elementType;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * SemanticSimilarity.
         */
        public Builder semanticSimilarity(Float semanticSimilarity) {
            this.semanticSimilarity = semanticSimilarity;
            return this;
        }

        public Element build() {
            return new Element(this);
        } 

    } 

}
