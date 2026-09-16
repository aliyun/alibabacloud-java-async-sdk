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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetConversationsRequest(Builder builder) {
        super(builder);
        this.lastId = builder.lastId;
        this.limit = builder.limit;
        this.pinned = builder.pinned;
        this.sortBy = builder.sortBy;
        this.workspaceId = builder.workspaceId;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetConversationsRequest, Builder> {
        private String lastId; 
        private String limit; 
        private String pinned; 
        private String sortBy; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetConversationsRequest request) {
            super(request);
            this.lastId = request.lastId;
            this.limit = request.limit;
            this.pinned = request.pinned;
            this.sortBy = request.sortBy;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The ID of the last conversation record.</p>
         * 
         * <strong>example:</strong>
         * <p>77be60cd-237b-4ca9-9c46-48b663cb****</p>
         */
        public Builder lastId(String lastId) {
            this.putQueryParameter("LastId", lastId);
            this.lastId = lastId;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pinned bookmark flag for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder pinned(String pinned) {
            this.putQueryParameter("Pinned", pinned);
            this.pinned = pinned;
            return this;
        }

        /**
         * <p>The sorting criterion.</p>
         * 
         * <strong>example:</strong>
         * <p>CreatedAt</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The ContextDB workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetConversationsRequest build() {
            return new GetConversationsRequest(this);
        } 

    } 

}
