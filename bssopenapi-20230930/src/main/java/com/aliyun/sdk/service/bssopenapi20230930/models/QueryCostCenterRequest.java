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
 * {@link QueryCostCenterRequest} extends {@link RequestModel}
 *
 * <p>QueryCostCenterRequest</p>
 */
public class QueryCostCenterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ownerAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentCostCenterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long parentCostCenterId;

    private QueryCostCenterRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.nbid = builder.nbid;
        this.ownerAccountId = builder.ownerAccountId;
        this.pageSize = builder.pageSize;
        this.parentCostCenterId = builder.parentCostCenterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostCenterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return ownerAccountId
     */
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentCostCenterId
     */
    public Long getParentCostCenterId() {
        return this.parentCostCenterId;
    }

    public static final class Builder extends Request.Builder<QueryCostCenterRequest, Builder> {
        private Integer currentPage; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String nbid; 
        private Long ownerAccountId; 
        private Integer pageSize; 
        private Long parentCostCenterId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCostCenterRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.nbid = request.nbid;
            this.ownerAccountId = request.ownerAccountId;
            this.pageSize = request.pageSize;
            this.parentCostCenterId = request.parentCostCenterId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EcIdAccountIds.
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            String ecIdAccountIdsShrink = shrink(ecIdAccountIds, "EcIdAccountIds", "json");
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIdsShrink);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1314839403940987</p>
         */
        public Builder ownerAccountId(Long ownerAccountId) {
            this.putQueryParameter("OwnerAccountId", ownerAccountId);
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder parentCostCenterId(Long parentCostCenterId) {
            this.putQueryParameter("ParentCostCenterId", parentCostCenterId);
            this.parentCostCenterId = parentCostCenterId;
            return this;
        }

        @Override
        public QueryCostCenterRequest build() {
            return new QueryCostCenterRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryCostCenterRequest} extends {@link TeaModel}
     *
     * <p>QueryCostCenterRequest</p>
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
             * AccountIds.
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1004064243473974</p>
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
