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
 * {@link Relationship} extends {@link TeaModel}
 *
 * <p>Relationship</p>
 */
public class Relationship extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map<String, ?> attributes;

    @com.aliyun.core.annotation.NameInMap("DataChannel")
    private String dataChannel;

    @com.aliyun.core.annotation.NameInMap("RelationshipGuid")
    private String relationshipGuid;

    @com.aliyun.core.annotation.NameInMap("RelationshipType")
    private String relationshipType;

    private Relationship(Builder builder) {
        this.attributes = builder.attributes;
        this.dataChannel = builder.dataChannel;
        this.relationshipGuid = builder.relationshipGuid;
        this.relationshipType = builder.relationshipType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Relationship create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

    /**
     * @return dataChannel
     */
    public String getDataChannel() {
        return this.dataChannel;
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
        private java.util.Map<String, ?> attributes; 
        private String dataChannel; 
        private String relationshipGuid; 
        private String relationshipType; 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * DataChannel.
         */
        public Builder dataChannel(String dataChannel) {
            this.dataChannel = dataChannel;
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

        public Relationship build() {
            return new Relationship(this);
        } 

    } 

}
