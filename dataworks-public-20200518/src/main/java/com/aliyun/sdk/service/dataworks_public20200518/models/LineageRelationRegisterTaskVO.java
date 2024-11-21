// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link LineageRelationRegisterTaskVO} extends {@link TeaModel}
 *
 * <p>LineageRelationRegisterTaskVO</p>
 */
public class LineageRelationRegisterTaskVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map < String, String > attributes;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("InputEntities")
    private java.util.List < LineageEntityVO > inputEntities;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OutputEntities")
    private java.util.List < LineageEntityVO > outputEntities;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    private LineageRelationRegisterTaskVO(Builder builder) {
        this.attributes = builder.attributes;
        this.createTimestamp = builder.createTimestamp;
        this.inputEntities = builder.inputEntities;
        this.name = builder.name;
        this.outputEntities = builder.outputEntities;
        this.qualifiedName = builder.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageRelationRegisterTaskVO create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.Map < String, String > getAttributes() {
        return this.attributes;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return inputEntities
     */
    public java.util.List < LineageEntityVO > getInputEntities() {
        return this.inputEntities;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputEntities
     */
    public java.util.List < LineageEntityVO > getOutputEntities() {
        return this.outputEntities;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public static final class Builder {
        private java.util.Map < String, String > attributes; 
        private Long createTimestamp; 
        private java.util.List < LineageEntityVO > inputEntities; 
        private String name; 
        private java.util.List < LineageEntityVO > outputEntities; 
        private String qualifiedName; 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.Map < String, String > attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * InputEntities.
         */
        public Builder inputEntities(java.util.List < LineageEntityVO > inputEntities) {
            this.inputEntities = inputEntities;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OutputEntities.
         */
        public Builder outputEntities(java.util.List < LineageEntityVO > outputEntities) {
            this.outputEntities = outputEntities;
            return this;
        }

        /**
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        public LineageRelationRegisterTaskVO build() {
            return new LineageRelationRegisterTaskVO(this);
        } 

    } 

}
