// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListResourceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceTypesRequest</p>
 */
public class ListResourceTypesRequest extends Request {
    @Query
    @NameInMap("EntityType")
    private String entityType;


    private ListResourceTypesRequest(Builder builder) {
        super(builder);
        this.entityType = builder.entityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesRequest create() {
        return builder().build();
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String entityType; 

        /**
         * <p>EntityType.</p>
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        public ListResourceTypesRequest build() {
            return new ListResourceTypesRequest(this);
        } 

    } 

}
