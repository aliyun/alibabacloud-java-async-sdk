// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link LineageRelationRegisterVO} extends {@link TeaModel}
 *
 * <p>LineageRelationRegisterVO</p>
 */
public class LineageRelationRegisterVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("DestEntity")
    private LineageEntityVO destEntity;

    @com.aliyun.core.annotation.NameInMap("Relationship")
    private RelationshipVO relationship;

    @com.aliyun.core.annotation.NameInMap("SrcEntity")
    private LineageEntityVO srcEntity;

    private LineageRelationRegisterVO(Builder builder) {
        this.createTimestamp = builder.createTimestamp;
        this.destEntity = builder.destEntity;
        this.relationship = builder.relationship;
        this.srcEntity = builder.srcEntity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageRelationRegisterVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return destEntity
     */
    public LineageEntityVO getDestEntity() {
        return this.destEntity;
    }

    /**
     * @return relationship
     */
    public RelationshipVO getRelationship() {
        return this.relationship;
    }

    /**
     * @return srcEntity
     */
    public LineageEntityVO getSrcEntity() {
        return this.srcEntity;
    }

    public static final class Builder {
        private Long createTimestamp; 
        private LineageEntityVO destEntity; 
        private RelationshipVO relationship; 
        private LineageEntityVO srcEntity; 

        private Builder() {
        } 

        private Builder(LineageRelationRegisterVO model) {
            this.createTimestamp = model.createTimestamp;
            this.destEntity = model.destEntity;
            this.relationship = model.relationship;
            this.srcEntity = model.srcEntity;
        } 

        /**
         * <p>The time of lineage relation generation</p>
         * 
         * <strong>example:</strong>
         * <p>1684327487964</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The destination entity in lineage relation</p>
         */
        public Builder destEntity(LineageEntityVO destEntity) {
            this.destEntity = destEntity;
            return this;
        }

        /**
         * <p>The relationship between entities</p>
         */
        public Builder relationship(RelationshipVO relationship) {
            this.relationship = relationship;
            return this;
        }

        /**
         * <p>The source entity in lineage relation</p>
         */
        public Builder srcEntity(LineageEntityVO srcEntity) {
            this.srcEntity = srcEntity;
            return this;
        }

        public LineageRelationRegisterVO build() {
            return new LineageRelationRegisterVO(this);
        } 

    } 

}
