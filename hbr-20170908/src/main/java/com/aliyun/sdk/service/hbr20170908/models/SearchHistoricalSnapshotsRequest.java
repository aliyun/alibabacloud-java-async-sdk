// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link SearchHistoricalSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>SearchHistoricalSnapshotsRequest</p>
 */
public class SearchHistoricalSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

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
    private java.util.List<?> query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private SearchHistoricalSnapshotsRequest(Builder builder) {
        super(builder);
        this.edition = builder.edition;
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
     * @return edition
     */
    public String getEdition() {
        return this.edition;
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
    public java.util.List<?> getQuery() {
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
        private String edition; 
        private Integer limit; 
        private String nextToken; 
        private String order; 
        private java.util.List<?> query; 
        private String sortBy; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(SearchHistoricalSnapshotsRequest request) {
            super(request);
            this.edition = request.edition;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.query = request.query;
            this.sortBy = request.sortBy;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The edition type. Valid values: BASIC and STANDARD. Default value: STANDARD.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        public Builder edition(String edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The maximum number of results to return for this query.
         * If you only want to obtain the row count without actual data, set <code>limit=0</code> to return no rows.</p>
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
         * <p>The token required to retrieve the next page of snapshots.</p>
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
         * <p>The sort order. Default value: ASC.</p>
         * <ul>
         * <li>ASC: ascending order.</li>
         * <li>DESC: descending order.</li>
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
         * <p>The query conditions. Example of Query:</p>
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
         * <li><p>Supported fields:</p>
         * <ul>
         * <li>VaultId: required. The vault ID.</li>
         * <li>InstanceId: required only when SourceType=ECS_FILE. The ECS instance ID.</li>
         * <li>Bucket: required only when SourceType=OSS. The OSS bucket name.</li>
         * <li>FileSystemId: required only when SourceType=NAS. The NAS file system ID.</li>
         * <li>CreateTime: required only when SourceType=NAS. The creation time of the NAS file system.</li>
         * <li>CompleteTime: the time when the snapshot is completed.</li>
         * <li>PlanId: the backup plan ID.</li>
         * </ul>
         * </li>
         * <li><p>Supported operations:</p>
         * <ul>
         * <li>MATCH_TERM: exact match.</li>
         * <li>GREATER_THAN: greater than.</li>
         * <li>GREATER_THAN_OR_EQUAL: greater than or equal to.</li>
         * <li>LESS_THAN: less than.</li>
         * <li>LESS_THAN_OR_EQUAL: less than or equal to.</li>
         * <li>BETWEEN: range. The value is a JSON array <code>[lower bound, upper bound]</code>.</li>
         * <li>IN: in the set. The value is an array.</li>
         * <li>NOT_IN: not in the set. The value is an array.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[   {     &quot;field&quot;: &quot;VaultId&quot;,     &quot;value&quot;: &quot;v-0003rf9m17pap3ltpqx5&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;InstanceId&quot;,     &quot;value&quot;: &quot;i-bp1i20zq2wuzdie9368m&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;PlanId&quot;,     &quot;value&quot;: &quot;plan-0005vkqhpesqgkd1iu4f&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;CompleteTime&quot;,     &quot;value&quot;: 1626769913,     &quot;operation&quot;: &quot;GREATER_THAN_OR_EQUAL&quot;   } ]</p>
         */
        public Builder query(java.util.List<?> query) {
            String queryShrink = shrink(query, "Query", "json");
            this.putQueryParameter("Query", queryShrink);
            this.query = query;
            return this;
        }

        /**
         * <p>The field used for sorting.</p>
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
         * <li><strong>ECS_FILE</strong>: backup snapshots of ECS files.</li>
         * <li><strong>OSS</strong>: backup snapshots of Alibaba Cloud OSS.</li>
         * <li><strong>NAS</strong>: backup snapshots of Alibaba Cloud NAS.</li>
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
