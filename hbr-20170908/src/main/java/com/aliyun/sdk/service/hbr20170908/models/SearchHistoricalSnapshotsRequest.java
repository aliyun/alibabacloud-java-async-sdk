// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchHistoricalSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>SearchHistoricalSnapshotsRequest</p>
 */
public class SearchHistoricalSnapshotsRequest extends Request {
    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Query")
    private java.util.Map < String, ? > query;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    private SearchHistoricalSnapshotsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.query = builder.query;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchHistoricalSnapshotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
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
    public java.util.Map < String, ? > getQuery() {
        return this.query;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<SearchHistoricalSnapshotsRequest, Builder> {
        private Integer limit; 
        private String nextToken; 
        private java.util.Map < String, ? > query; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(SearchHistoricalSnapshotsRequest response) {
            super(response);
            this.limit = response.limit;
            this.nextToken = response.nextToken;
            this.query = response.query;
            this.sourceType = response.sourceType;
        } 

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(java.util.Map < String, ? > query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public SearchHistoricalSnapshotsRequest build() {
            return new SearchHistoricalSnapshotsRequest(this);
        } 

    } 

}
