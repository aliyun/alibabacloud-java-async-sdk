// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link QueryCostCenterResourceRequest} extends {@link RequestModel}
 *
 * <p>QueryCostCenterResourceRequest</p>
 */
public class QueryCostCenterResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CostCenterId")
    private Long costCenterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
    private Long ownerAccountId;

    private QueryCostCenterResourceRequest(Builder builder) {
        super(builder);
        this.costCenterId = builder.costCenterId;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.maxResults = builder.maxResults;
        this.nbid = builder.nbid;
        this.nextToken = builder.nextToken;
        this.ownerAccountId = builder.ownerAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostCenterResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costCenterId
     */
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerAccountId
     */
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public static final class Builder extends Request.Builder<QueryCostCenterResourceRequest, Builder> {
        private Long costCenterId; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private Integer maxResults; 
        private String nbid; 
        private String nextToken; 
        private Long ownerAccountId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCostCenterResourceRequest request) {
            super(request);
            this.costCenterId = request.costCenterId;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.maxResults = request.maxResults;
            this.nbid = request.nbid;
            this.nextToken = request.nextToken;
            this.ownerAccountId = request.ownerAccountId;
        } 

        /**
         * <p>The ID of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder costCenterId(Long costCenterId) {
            this.putBodyParameter("CostCenterId", costCenterId);
            this.costCenterId = costCenterId;
            return this;
        }

        /**
         * <p>The list of enterprises and accounts. An empty value indicates querying the current account.</p>
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIds);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * <p>The maximum number of records per query.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The first-level marketplace ID. If empty, the marketplace ID of the current user is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2684201000001</p>
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>The token for the next query. An empty NextToken indicates that there are no more results.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESEgoQCg4KCmd</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The owner user ID of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        public Builder ownerAccountId(Long ownerAccountId) {
            this.putBodyParameter("OwnerAccountId", ownerAccountId);
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        @Override
        public QueryCostCenterResourceRequest build() {
            return new QueryCostCenterResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryCostCenterResourceRequest} extends {@link TeaModel}
     *
     * <p>QueryCostCenterResourceRequest</p>
     */
    public static class EcIdAccountIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<Long> accountIds;

        @com.aliyun.core.annotation.NameInMap("EcId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ecId;

        private EcIdAccountIds(Builder builder) {
            this.accountIds = builder.accountIds;
            this.ecId = builder.ecId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcIdAccountIds create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        public static final class Builder {
            private java.util.List<Long> accountIds; 
            private String ecId; 

            private Builder() {
            } 

            private Builder(EcIdAccountIds model) {
                this.accountIds = model.accountIds;
                this.ecId = model.ecId;
            } 

            /**
             * <p>The list of accessed accounts. An empty value indicates that all accounts under the current entity ID are selected.</p>
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * <p>The enterprise entity ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1501603440974415</p>
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            public EcIdAccountIds build() {
                return new EcIdAccountIds(this);
            } 

        } 

    }
}
