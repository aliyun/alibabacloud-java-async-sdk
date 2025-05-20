// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link ListRoleUsersRequest} extends {@link RequestModel}
 *
 * <p>ListRoleUsersRequest</p>
 */
public class ListRoleUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rolePrincipal")
    private String rolePrincipal;

    private ListRoleUsersRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
        this.rolePrincipal = builder.rolePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoleUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return rolePrincipal
     */
    public String getRolePrincipal() {
        return this.rolePrincipal;
    }

    public static final class Builder extends Request.Builder<ListRoleUsersRequest, Builder> {
        private String maxResults; 
        private String pageToken; 
        private String rolePrincipal; 

        private Builder() {
            super();
        } 

        private Builder(ListRoleUsersRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.rolePrincipal = request.rolePrincipal;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * pageToken.
         */
        public Builder pageToken(String pageToken) {
            this.putQueryParameter("pageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * rolePrincipal.
         */
        public Builder rolePrincipal(String rolePrincipal) {
            this.putQueryParameter("rolePrincipal", rolePrincipal);
            this.rolePrincipal = rolePrincipal;
            return this;
        }

        @Override
        public ListRoleUsersRequest build() {
            return new ListRoleUsersRequest(this);
        } 

    } 

}
