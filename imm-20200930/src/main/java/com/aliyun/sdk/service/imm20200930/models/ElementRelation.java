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
 * {@link ElementRelation} extends {@link TeaModel}
 *
 * <p>ElementRelation</p>
 */
public class ElementRelation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ElementRelation(Builder builder) {
        this.objectId = builder.objectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ElementRelation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String objectId; 
        private String type; 

        private Builder() {
        } 

        private Builder(ElementRelation model) {
            this.objectId = model.objectId;
            this.type = model.type;
        } 

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ElementRelation build() {
            return new ElementRelation(this);
        } 

    } 

}
