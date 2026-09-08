// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListOneMetaSqlTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListOneMetaSqlTemplatesRequest</p>
 */
public class ListOneMetaSqlTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableVectorSearch")
    private Boolean enableVectorSearch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private ListOneMetaSqlTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogUuid = builder.catalogUuid;
        this.databaseUuid = builder.databaseUuid;
        this.enableVectorSearch = builder.enableVectorSearch;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.query = builder.query;
        this.tag = builder.tag;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOneMetaSqlTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    /**
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    /**
     * @return enableVectorSearch
     */
    public Boolean getEnableVectorSearch() {
        return this.enableVectorSearch;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ListOneMetaSqlTemplatesRequest, Builder> {
        private String regionId; 
        private String catalogUuid; 
        private String databaseUuid; 
        private Boolean enableVectorSearch; 
        private Integer maxResults; 
        private String nextToken; 
        private String query; 
        private String tag; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ListOneMetaSqlTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogUuid = request.catalogUuid;
            this.databaseUuid = request.databaseUuid;
            this.enableVectorSearch = request.enableVectorSearch;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.query = request.query;
            this.tag = request.tag;
            this.uuids = request.uuids;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The UUID of the associated catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-OfjcNc2z***</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.putQueryParameter("CatalogUuid", catalogUuid);
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * <p>The UUID of the associated database.</p>
         * 
         * <strong>example:</strong>
         * <p>md-HZ-fp9K7r***</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.putQueryParameter("DatabaseUuid", databaseUuid);
            this.databaseUuid = databaseUuid;
            return this;
        }

        /**
         * <p>Specifies whether to use semantic search.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableVectorSearch(Boolean enableVectorSearch) {
            this.putQueryParameter("EnableVectorSearch", enableVectorSearch);
            this.enableVectorSearch = enableVectorSearch;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>f056501ada12****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The search keyword.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sale</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The SQL template tag.</p>
         * 
         * <strong>example:</strong>
         * <p>new_sales</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The UUIDs of knowledge instances. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>86c5c290052147c***,56c5c2900dasqw***</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ListOneMetaSqlTemplatesRequest build() {
            return new ListOneMetaSqlTemplatesRequest(this);
        } 

    } 

}
