// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchHistoricalSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>SearchHistoricalSnapshotsRequest</p>
 */
public class SearchHistoricalSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private java.util.List < ? > query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
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
         * <p>The maximum number of rows that you want the current query to return. To query only the number of matched rows without the need to return specific data, you can set the Limit parameter to <code>0</code>. Then, the operation returns only the number of matched rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The token that is required to obtain the next page of backup snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ordering mode. Valid values:</p>
         * <ul>
         * <li>ASC (default): ascending order</li>
         * <li>DESC: descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The query conditions. Example:</p>
         * <pre><code>[
         *   {
         *     &quot;field&quot;: &quot;VaultId&quot;,
         *     &quot;value&quot;: &quot;v-0003rf9m*****qx5&quot;,
         *     &quot;operation&quot;: &quot;MATCH_TERM&quot;
         *   },
         *   {
         *     &quot;field&quot;: &quot;InstanceId&quot;,
         *     &quot;value&quot;: &quot;i-bp1i20zq2*****e9368m&quot;,
         *     &quot;operation&quot;: &quot;MATCH_TERM&quot;
         *   },
         *   {
         *     &quot;field&quot;: &quot;PlanId&quot;,
         *     &quot;value&quot;: &quot;plan-0005vk*****gkd1iu4f&quot;,
         *     &quot;operation&quot;: &quot;MATCH_TERM&quot;
         *   },
         *   {
         *     &quot;field&quot;: &quot;CompleteTime&quot;,
         *     &quot;value&quot;: &quot;1626769913&quot;,
         *     &quot;operation&quot;: &quot;GREATER_THAN_OR_EQUAL&quot;
         *   }
         * ]
         * </code></pre>
         * <ul>
         * <li><p>The following fields are supported:</p>
         * <ul>
         * <li>VaultId: specifies the ID of the backup vault. This field is required.</li>
         * <li>InstanceId: specifies the ID of the Elastic Compute Service (ECS) instance. If the SourceType parameter is set to ECS_FILE, this field is required.</li>
         * <li>Bucket: specifies the name of the Object Storage Service (OSS) bucket. If the SourceType parameter is set to OSS, this field is required.</li>
         * <li>FileSystemId: specifies the ID of the Apsara File Storage NAS (NAS) file system. If the SourceType parameter is set to NAS, this field is required.</li>
         * <li>CreateTime: specifies the time when the NAS file system was created. If the SourceType parameter is set to NAS, this field is required.</li>
         * <li>CompleteTime: specifies the time when the backup snapshot was completed.</li>
         * <li>PlanId: the ID of a backup plan.</li>
         * </ul>
         * </li>
         * <li><p>The following operations are supported:</p>
         * <ul>
         * <li>MATCH_TERM: exact match.</li>
         * <li>GREATER_THAN: greater than.</li>
         * <li>GREATER_THAN_OR_EQUAL: greater than or equal to.</li>
         * <li>LESS_THAN: less than.</li>
         * <li>LESS_THAN_OR_EQUAL: less than or equal to.</li>
         * <li>BETWEEN: specifies a JSON array as a range. The results must fall within the range in the <code>[Minimum value,Maximum value]</code> format.</li>
         * <li>IN: specifies an array as a collection. The results must fall within the collection.</li>
         * <li>NOT_IN: specifies an array as a collection. The results cannot fall within the collection.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[   {     &quot;field&quot;: &quot;VaultId&quot;,     &quot;value&quot;: &quot;v-0003rf9m17pap3ltpqx5&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;InstanceId&quot;,     &quot;value&quot;: &quot;i-bp1i20zq2wuzdie9368m&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;PlanId&quot;,     &quot;value&quot;: &quot;plan-0005vkqhpesqgkd1iu4f&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;CompleteTime&quot;,     &quot;value&quot;: 1626769913,     &quot;operation&quot;: &quot;GREATER_THAN_OR_EQUAL&quot;   } ]</p>
         */
        public Builder query(java.util.List < ? > query) {
            String queryShrink = shrink(query, "Query", "json");
            this.putQueryParameter("Query", queryShrink);
            this.query = query;
            return this;
        }

        /**
         * <p>The field that is used to sort data.</p>
         * 
         * <strong>example:</strong>
         * <p>CreatedTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: backup snapshots for Elastic Compute Service (ECS) files</li>
         * <li><strong>OSS</strong>: backup snapshots for Object Storage Service (OSS) buckets</li>
         * <li><strong>NAS</strong>: backup snapshots for Apsara File Storage NAS file systems</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
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
