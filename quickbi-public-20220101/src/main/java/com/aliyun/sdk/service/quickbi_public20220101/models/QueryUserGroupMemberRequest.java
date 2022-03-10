// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>QueryUserGroupMemberRequest</p>
 */
public class QueryUserGroupMemberRequest extends Request {
    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("UserGroupId")
    @Validation(required = true)
    private String userGroupId;

    private QueryUserGroupMemberRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserGroupMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<QueryUserGroupMemberRequest, Builder> {
        private String keyword; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserGroupMemberRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public QueryUserGroupMemberRequest build() {
            return new QueryUserGroupMemberRequest(this);
        } 

    } 

}
