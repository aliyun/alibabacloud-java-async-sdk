// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RelationshipVO} extends {@link TeaModel}
 *
 * <p>RelationshipVO</p>
 */
public class RelationshipVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map < String, String > attributes;

    @com.aliyun.core.annotation.NameInMap("RelationshipGuid")
    private String relationshipGuid;

    @com.aliyun.core.annotation.NameInMap("RelationshipType")
    private String relationshipType;

    private RelationshipVO(Builder builder) {
        this.attributes = builder.attributes;
        this.relationshipGuid = builder.relationshipGuid;
        this.relationshipType = builder.relationshipType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RelationshipVO create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.Map < String, String > getAttributes() {
        return this.attributes;
    }

    /**
     * @return relationshipGuid
     */
    public String getRelationshipGuid() {
        return this.relationshipGuid;
    }

    /**
     * @return relationshipType
     */
    public String getRelationshipType() {
        return this.relationshipType;
    }

    public static final class Builder {
        private java.util.Map < String, String > attributes; 
        private String relationshipGuid; 
        private String relationshipType; 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.Map < String, String > attributes) {
            this.attributes = attributes;
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
         * RelationshipType.
         */
        public Builder relationshipType(String relationshipType) {
            this.relationshipType = relationshipType;
            return this;
        }

        public RelationshipVO build() {
            return new RelationshipVO(this);
        } 

    } 

}
