// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetConversationsRequest} extends {@link RequestModel}
 *
 * <p>GetConversationsRequest</p>
 */
public class GetConversationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastId")
    private String lastId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pinned")
    private String pinned;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private GetConversationsRequest(Builder builder) {
        super(builder);
        this.lastId = builder.lastId;
        this.limit = builder.limit;
        this.pinned = builder.pinned;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConversationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lastId
     */
    public String getLastId() {
        return this.lastId;
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return pinned
     */
    public String getPinned() {
        return this.pinned;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<GetConversationsRequest, Builder> {
        private String lastId; 
        private String limit; 
        private String pinned; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(GetConversationsRequest request) {
            super(request);
            this.lastId = request.lastId;
            this.limit = request.limit;
            this.pinned = request.pinned;
            this.sortBy = request.sortBy;
        } 

        /**
         * LastId.
         */
        public Builder lastId(String lastId) {
            this.putQueryParameter("LastId", lastId);
            this.lastId = lastId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Pinned.
         */
        public Builder pinned(String pinned) {
            this.putQueryParameter("Pinned", pinned);
            this.pinned = pinned;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public GetConversationsRequest build() {
            return new GetConversationsRequest(this);
        } 

    } 

}
