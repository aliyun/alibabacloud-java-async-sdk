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
         * <p>The list of data source IDs.</p>
         */
        public Builder dataSourceIds(java.util.List<String> dataSourceIds) {
            String dataSourceIdsShrink = shrink(dataSourceIds, "DataSourceIds", "json");
            this.putBodyParameter("DataSourceIds", dataSourceIdsShrink);
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        /**
         * <p>The query filters.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The number of results for each query.</p>
         * <p>Valid values: 10 to 100. Default value: 10.</p>
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
         * <p>The token required to obtain the next page of policy-data source associations.</p>
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
         * <p>The policy ID.</p>
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
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: ECS instance backup.</li>
         * <li><strong>OSS</strong>: OSS backup.</li>
         * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
         * <li><strong>COMMON_NAS</strong>: On-premises NAS backup.</li>
         * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition.</li>
         * <li><strong>File</strong>: On-premises file backup.</li>
         * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup.</li>
         * <li><strong>OTS</strong>: Tablestore backup.</li>
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

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.operator = model.operator;
                this.values = model.values;
            } 

            /**
             * <p>The key in the query filter. Valid values:</p>
             * <ul>
             * <li><strong>PolicyId</strong>: backup policy ID</li>
             * <li><strong>DataSourceId</strong>: ECS instance ID</li>
             * <li><strong>DataSourceType</strong>: data source type</li>
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
             * <p>The matching method. Default value: IN. The matching operation (Operator) supported by the Key and Value in the filter. Valid values:</p>
             * <ul>
             * <li><strong>EQUAL</strong>: equal to</li>
             * <li><strong>NOT_EQUAL</strong>: not equal to</li>
             * <li><strong>GREATER_THAN</strong>: greater than</li>
             * <li><strong>GREATER_THAN_OR_EQUAL</strong>: greater than or equal to</li>
             * <li><strong>LESS_THAN</strong>: less than</li>
             * <li><strong>LESS_THAN_OR_EQUAL</strong>: less than or equal to</li>
             * <li><strong>BETWEEN</strong>: range. The value is a JSON array <code>[lower bound, upper bound]</code>.</li>
             * <li><strong>IN</strong>: in a set. The value is an array.</li>
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
             * <p>The values to match in the query filter.</p>
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
