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
 * {@link ListUserRolesRequest} extends {@link RequestModel}
 *
 * <p>ListUserRolesRequest</p>
 */
public class ListUserRolesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userPrincipal")
    private String userPrincipal;

    private ListUserRolesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
        this.userPrincipal = builder.userPrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserRolesRequest create() {
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
     * @return userPrincipal
     */
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

    public static final class Builder extends Request.Builder<ListUserRolesRequest, Builder> {
        private String maxResults; 
        private String pageToken; 
        private String userPrincipal; 

        private Builder() {
            super();
        } 

        private Builder(ListUserRolesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.userPrincipal = request.userPrincipal;
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
         * userPrincipal.
         */
        public Builder userPrincipal(String userPrincipal) {
            this.putQueryParameter("userPrincipal", userPrincipal);
            this.userPrincipal = userPrincipal;
            return this;
        }

        @Override
        public ListUserRolesRequest build() {
            return new ListUserRolesRequest(this);
        } 

    } 

}
