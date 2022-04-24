// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPermissionListRequest} extends {@link RequestModel}
 *
 * <p>QueryPermissionListRequest</p>
 */
public class QueryPermissionListRequest extends Request {
    @Query
    @NameInMap("RelationId")
    @Validation(required = true)
    private Long relationId;

    private QueryPermissionListRequest(Builder builder) {
        super(builder);
        this.relationId = builder.relationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPermissionListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relationId
     */
    public Long getRelationId() {
        return this.relationId;
    }

    public static final class Builder extends Request.Builder<QueryPermissionListRequest, Builder> {
        private Long relationId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPermissionListRequest request) {
            super(request);
            this.relationId = request.relationId;
        } 

        /**
         * RelationId.
         */
        public Builder relationId(Long relationId) {
            this.putQueryParameter("RelationId", relationId);
            this.relationId = relationId;
            return this;
        }

        @Override
        public QueryPermissionListRequest build() {
            return new QueryPermissionListRequest(this);
        } 

    } 

}
