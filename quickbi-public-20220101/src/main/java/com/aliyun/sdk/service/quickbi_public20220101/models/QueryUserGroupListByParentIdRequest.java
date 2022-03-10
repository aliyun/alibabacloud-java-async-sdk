// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserGroupListByParentIdRequest} extends {@link RequestModel}
 *
 * <p>QueryUserGroupListByParentIdRequest</p>
 */
public class QueryUserGroupListByParentIdRequest extends Request {
    @Query
    @NameInMap("ParentUserGroupId")
    @Validation(required = true)
    private String parentUserGroupId;

    private QueryUserGroupListByParentIdRequest(Builder builder) {
        super(builder);
        this.parentUserGroupId = builder.parentUserGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserGroupListByParentIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentUserGroupId
     */
    public String getParentUserGroupId() {
        return this.parentUserGroupId;
    }

    public static final class Builder extends Request.Builder<QueryUserGroupListByParentIdRequest, Builder> {
        private String parentUserGroupId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserGroupListByParentIdRequest request) {
            super(request);
            this.parentUserGroupId = request.parentUserGroupId;
        } 

        /**
         * ParentUserGroupId.
         */
        public Builder parentUserGroupId(String parentUserGroupId) {
            this.putQueryParameter("ParentUserGroupId", parentUserGroupId);
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }

        @Override
        public QueryUserGroupListByParentIdRequest build() {
            return new QueryUserGroupListByParentIdRequest(this);
        } 

    } 

}
