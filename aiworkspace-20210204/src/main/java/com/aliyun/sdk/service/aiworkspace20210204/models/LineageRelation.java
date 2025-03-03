// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link LineageRelation} extends {@link TeaModel}
 *
 * <p>LineageRelation</p>
 */
public class LineageRelation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DestEntityQualifiedName")
    private String destEntityQualifiedName;

    @com.aliyun.core.annotation.NameInMap("RelationshipGuid")
    private String relationshipGuid;

    @com.aliyun.core.annotation.NameInMap("SrcEntityQualifiedName")
    private String srcEntityQualifiedName;

    private LineageRelation(Builder builder) {
        this.destEntityQualifiedName = builder.destEntityQualifiedName;
        this.relationshipGuid = builder.relationshipGuid;
        this.srcEntityQualifiedName = builder.srcEntityQualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageRelation create() {
        return builder().build();
    }

    /**
     * @return destEntityQualifiedName
     */
    public String getDestEntityQualifiedName() {
        return this.destEntityQualifiedName;
    }

    /**
     * @return relationshipGuid
     */
    public String getRelationshipGuid() {
        return this.relationshipGuid;
    }

    /**
     * @return srcEntityQualifiedName
     */
    public String getSrcEntityQualifiedName() {
        return this.srcEntityQualifiedName;
    }

    public static final class Builder {
        private String destEntityQualifiedName; 
        private String relationshipGuid; 
        private String srcEntityQualifiedName; 

        /**
         * DestEntityQualifiedName.
         */
        public Builder destEntityQualifiedName(String destEntityQualifiedName) {
            this.destEntityQualifiedName = destEntityQualifiedName;
            return this;
        }

        /**
         * RelationshipGuid.
         */
        public Builder relationshipGuid(String relationshipGuid) {
            this.relationshipGuid = relationshipGuid;
            return this;
        }

        /**
         * SrcEntityQualifiedName.
         */
        public Builder srcEntityQualifiedName(String srcEntityQualifiedName) {
            this.srcEntityQualifiedName = srcEntityQualifiedName;
            return this;
        }

        public LineageRelation build() {
            return new LineageRelation(this);
        } 

    } 

}
