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

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * DestEntity.
         */
        public Builder destEntity(LineageEntityVO destEntity) {
            this.destEntity = destEntity;
            return this;
        }

        /**
         * Relationship.
         */
        public Builder relationship(RelationshipVO relationship) {
            this.relationship = relationship;
            return this;
        }

        /**
         * SrcEntity.
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
