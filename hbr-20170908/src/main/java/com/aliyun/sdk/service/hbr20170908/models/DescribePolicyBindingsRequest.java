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
 * {@link DescribePolicyBindingsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyBindingsRequest</p>
 */
public class DescribePolicyBindingsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceIds")
    private java.util.List<String> dataSourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private DescribePolicyBindingsRequest(Builder builder) {
        super(builder);
        this.dataSourceIds = builder.dataSourceIds;
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyId = builder.policyId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyBindingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceIds
     */
    public java.util.List<String> getDataSourceIds() {
        return this.dataSourceIds;
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<DescribePolicyBindingsRequest, Builder> {
        private java.util.List<String> dataSourceIds; 
        private java.util.List<Filters> filters; 
        private Integer maxResults; 
        private String nextToken; 
        private String policyId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolicyBindingsRequest request) {
            super(request);
            this.dataSourceIds = request.dataSourceIds;
            this.filters = request.filters;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyId = request.policyId;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>List of data source IDs.</p>
         */
        public Builder dataSourceIds(java.util.List<String> dataSourceIds) {
            String dataSourceIdsShrink = shrink(dataSourceIds, "DataSourceIds", "json");
            this.putBodyParameter("DataSourceIds", dataSourceIdsShrink);
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        /**
         * <p>Query filters.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>Number of results per query.</p>
         * <p>Range: 10~100. Default: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Token required to fetch the next page of policy and data source associations.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************hky</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Data source type. Possible values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: Indicates ECS full machine backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public DescribePolicyBindingsRequest build() {
            return new DescribePolicyBindingsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolicyBindingsRequest} extends {@link TeaModel}
     *
     * <p>DescribePolicyBindingsRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private java.util.List<String> values; 

            /**
             * <p>Key in the query filter. Possible values include:</p>
             * <ul>
             * <li><strong>PolicyId</strong>: Backup policy ID</li>
             * <li><strong>DataSourceId</strong>: ECS instance ID</li>
             * <li><strong>DataSourceType</strong>: Data source type</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DataSourceType</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Matching method. Default is IN. This refers to the matching operation (Operator) supported by the Key and Value in the filter. Possible values include:</p>
             * <ul>
             * <li><strong>EQUAL</strong>: Equal to</li>
             * <li><strong>NOT_EQUAL</strong>: Not equal to</li>
             * <li><strong>GREATER_THAN</strong>: Greater than</li>
             * <li><strong>GREATER_THAN_OR_EQUAL</strong>: Greater than or equal to</li>
             * <li><strong>LESS_THAN</strong>: Less than</li>
             * <li><strong>LESS_THAN_OR_EQUAL</strong>: Less than or equal to</li>
             * <li><strong>BETWEEN</strong>: Range, where value is a JSON array <code>[lower_bound, upper_bound]</code>.</li>
             * <li><strong>IN</strong>: In the set, where value is an array.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>Values to be matched in the query filter.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
