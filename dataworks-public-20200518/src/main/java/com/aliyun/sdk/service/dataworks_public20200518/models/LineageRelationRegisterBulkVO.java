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
 * {@link LineageRelationRegisterBulkVO} extends {@link TeaModel}
 *
 * <p>LineageRelationRegisterBulkVO</p>
 */
public class LineageRelationRegisterBulkVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("DestEntities")
    private java.util.List<LineageEntityVO> destEntities;

    @com.aliyun.core.annotation.NameInMap("Relationship")
    private RelationshipVO relationship;

    @com.aliyun.core.annotation.NameInMap("SrcEntities")
    private java.util.List<LineageEntityVO> srcEntities;

    private LineageRelationRegisterBulkVO(Builder builder) {
        this.createTimestamp = builder.createTimestamp;
        this.destEntities = builder.destEntities;
        this.relationship = builder.relationship;
        this.srcEntities = builder.srcEntities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageRelationRegisterBulkVO create() {
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
     * @return destEntities
     */
    public java.util.List<LineageEntityVO> getDestEntities() {
        return this.destEntities;
    }

    /**
     * @return relationship
     */
    public RelationshipVO getRelationship() {
        return this.relationship;
    }

    /**
     * @return srcEntities
     */
    public java.util.List<LineageEntityVO> getSrcEntities() {
        return this.srcEntities;
    }

    public static final class Builder {
        private Long createTimestamp; 
        private java.util.List<LineageEntityVO> destEntities; 
        private RelationshipVO relationship; 
        private java.util.List<LineageEntityVO> srcEntities; 

        private Builder() {
        } 

        private Builder(LineageRelationRegisterBulkVO model) {
            this.createTimestamp = model.createTimestamp;
            this.destEntities = model.destEntities;
            this.relationship = model.relationship;
            this.srcEntities = model.srcEntities;
        } 

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * DestEntities.
         */
        public Builder destEntities(java.util.List<LineageEntityVO> destEntities) {
            this.destEntities = destEntities;
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
         * SrcEntities.
         */
        public Builder srcEntities(java.util.List<LineageEntityVO> srcEntities) {
            this.srcEntities = srcEntities;
            return this;
        }

        public LineageRelationRegisterBulkVO build() {
            return new LineageRelationRegisterBulkVO(this);
        } 

    } 

}
