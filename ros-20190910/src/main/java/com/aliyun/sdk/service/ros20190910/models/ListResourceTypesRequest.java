// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    public static final class Builder extends Request.Builder<ListResourceTypesRequest, Builder> {
        private String entityType; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceTypesRequest request) {
            super(request);
            this.entityType = request.entityType;
        } 

        /**
         * The entity type. Valid values:
         * <p>
         * 
         * *   All: all resource types.
         * *   Resource: resources other than DataSource resources. For more information, see [Resources](~~28863~~).
         * *   DataSource: DataSource resources.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        @Override
        public ListResourceTypesRequest build() {
            return new ListResourceTypesRequest(this);
        } 

    } 

}
