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
 * {@link ListPermissionsRequest} extends {@link RequestModel}
 *
 * <p>ListPermissionsRequest</p>
 */
public class ListPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("function")
    private String function;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("principal")
    private String principal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("view")
    private String view;

    private ListPermissionsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.function = builder.function;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
        this.principal = builder.principal;
        this.resourceType = builder.resourceType;
        this.table = builder.table;
        this.view = builder.view;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return function
     */
    public String getFunction() {
        return this.function;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return principal
     */
    public String getPrincipal() {
        return this.principal;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return view
     */
    public String getView() {
        return this.view;
    }

    public static final class Builder extends Request.Builder<ListPermissionsRequest, Builder> {
        private String catalogId; 
        private String database; 
        private String function; 
        private Integer maxResults; 
        private String pageToken; 
        private String principal; 
        private String resourceType; 
        private String table; 
        private String view; 

        private Builder() {
            super();
        } 

        private Builder(ListPermissionsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.function = request.function;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.principal = request.principal;
            this.resourceType = request.resourceType;
            this.table = request.table;
            this.view = request.view;
        } 

        /**
         * catalogId.
         */
        public Builder catalogId(String catalogId) {
            this.putPathParameter("catalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * database.
         */
        public Builder database(String database) {
            this.putQueryParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * function.
         */
        public Builder function(String function) {
            this.putQueryParameter("function", function);
            this.function = function;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
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
         * principal.
         */
        public Builder principal(String principal) {
            this.putQueryParameter("principal", principal);
            this.principal = principal;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CATALOG</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * table.
         */
        public Builder table(String table) {
            this.putQueryParameter("table", table);
            this.table = table;
            return this;
        }

        /**
         * view.
         */
        public Builder view(String view) {
            this.putQueryParameter("view", view);
            this.view = view;
            return this;
        }

        @Override
        public ListPermissionsRequest build() {
            return new ListPermissionsRequest(this);
        } 

    } 

}
