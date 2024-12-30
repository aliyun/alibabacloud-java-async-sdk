// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QuerySharesToUserListRequest} extends {@link RequestModel}
 *
 * <p>QuerySharesToUserListRequest</p>
 */
public class QuerySharesToUserListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private QuerySharesToUserListRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySharesToUserListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QuerySharesToUserListRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySharesToUserListRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the user. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>46e53<strong><strong>5ba4b679ee22e2a2927</strong></strong></p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QuerySharesToUserListRequest build() {
            return new QuerySharesToUserListRequest(this);
        } 

    } 

}
