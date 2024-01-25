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
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("Query")
    private java.util.List < ? > query;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    private SearchHistoricalSnapshotsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.query = builder.query;
        this.sortBy = builder.sortBy;
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
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return query
     */
    public java.util.List < ? > getQuery() {
        return this.query;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
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
        private String order; 
        private java.util.List < ? > query; 
        private String sortBy; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(SearchHistoricalSnapshotsRequest request) {
            super(request);
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.query = request.query;
            this.sortBy = request.sortBy;
            this.sourceType = request.sourceType;
        } 

        /**
         * The maximum number of rows that you want the current query to return. To query only the number of matched rows without the need to return specific data, you can set the Limit parameter to `0`. Then, the operation returns only the number of matched rows.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The token that is required to obtain the next page of backup snapshots.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The query conditions. Example:
         * <p>
         * 
         *     [
         *       {
         *         "field": "VaultId",
         *         "value": "v-0003rf9m*****qx5",
         *         "operation": "MATCH_TERM"
         *       },
         *       {
         *         "field": "InstanceId",
         *         "value": "i-bp1i20zq2*****e9368m",
         *         "operation": "MATCH_TERM"
         *       },
         *       {
         *         "field": "PlanId",
         *         "value": "plan-0005vk*****gkd1iu4f",
         *         "operation": "MATCH_TERM"
         *       },
         *       {
         *         "field": "CompleteTime",
         *         "value": 1626769913,
         *         "operation": "GREATER_THAN_OR_EQUAL"
         *       }
         *     ]
         * 
         * *   The following fields are supported:
         * 
         *     *   VaultId: specifies the ID of the backup vault. This field is required.
         *     *   InstanceId: specifies the ID of the ECS instance. If the SourceType parameter is set to ECS_FILE, this field is required.
         *     *   Bucket: specifies the ID of the OSS bucket. If the SourceType parameter is set to OSS, this field is required.
         *     *   FileSystemId: specifies the ID of the NAS file system. If the SourceType parameter is set to NAS, this field is required.
         *     *   CreateTime: specifies the time when the NAS file system was created. If the SourceType parameter is set to NAS, this field is required.
         *     *   CompleteTime: specifies the time when the backup snapshot was completed.
         *     *   PlanId: the ID of a backup plan.
         * 
         * *   The following operations are supported:
         * 
         *     *   MATCH_TERM: exact match.
         *     *   GREATER_THAN: greater than.
         *     *   GREATER_THAN_OR_EQUAL: greater than or equal to.
         *     *   LESS_THAN: less than.
         *     *   LESS_THAN_OR_EQUAL: less than or equal to.
         *     *   BETWEEN: specifies a JSON array as a range. The results must fall within the range in the `[Minimum value,Maximum value]` format.
         *     *   IN: specifies an array as a collection. The results must fall within the collection.
         *     *   NOT_IN: specifies an array as a collection. The results cannot fall within the collection.
         */
        public Builder query(java.util.List < ? > query) {
            String queryShrink = shrink(query, "Query", "json");
            this.putQueryParameter("Query", queryShrink);
            this.query = query;
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

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: backup snapshots for Elastic Compute Service (ECS) files
         * *   **OSS**: backup snapshots for Object Storage Service (OSS) buckets
         * *   **NAS**: backup snapshots for Apsara File Storage NAS file systems
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
