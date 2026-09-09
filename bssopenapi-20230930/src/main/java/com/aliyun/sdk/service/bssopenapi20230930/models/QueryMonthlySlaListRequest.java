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
 * {@link QueryMonthlySlaListRequest} extends {@link RequestModel}
 *
 * <p>QueryMonthlySlaListRequest</p>
 */
public class QueryMonthlySlaListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Months")
    private java.util.List<Integer> months;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PayStatuses")
    private java.util.List<Integer> payStatuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCodes")
    private java.util.List<String> productCodes;

    private QueryMonthlySlaListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.instanceIds = builder.instanceIds;
        this.months = builder.months;
        this.nbid = builder.nbid;
        this.pageSize = builder.pageSize;
        this.payStatuses = builder.payStatuses;
        this.productCodes = builder.productCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthlySlaListRequest create() {
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
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return months
     */
    public java.util.List<Integer> getMonths() {
        return this.months;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return payStatuses
     */
    public java.util.List<Integer> getPayStatuses() {
        return this.payStatuses;
    }

    /**
     * @return productCodes
     */
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

    public static final class Builder extends Request.Builder<QueryMonthlySlaListRequest, Builder> {
        private Integer currentPage; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private java.util.List<String> instanceIds; 
        private java.util.List<Integer> months; 
        private String nbid; 
        private Integer pageSize; 
        private java.util.List<Integer> payStatuses; 
        private java.util.List<String> productCodes; 

        private Builder() {
            super();
        } 

        private Builder(QueryMonthlySlaListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.instanceIds = request.instanceIds;
            this.months = request.months;
            this.nbid = request.nbid;
            this.pageSize = request.pageSize;
            this.payStatuses = request.payStatuses;
            this.productCodes = request.productCodes;
        } 

        /**
         * <p>The current page number. Default value: 1.</p>
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
         * <p>The enterprise and account list. If this parameter is empty, the current account is queried.</p>
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIds);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * <p>Optional. Filter by instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;instance_1&quot;,&quot;instance_2&quot;]</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>Optional. List of months in yyyyMM format.</p>
         * 
         * <strong>example:</strong>
         * <p>[202602,202603]</p>
         */
        public Builder months(java.util.List<Integer> months) {
            this.putBodyParameter("Months", months);
            this.months = months;
            return this;
        }

        /**
         * <p>The primary marketplace ID. If this parameter is empty, the marketplace ID of the current user is used by default.</p>
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
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Optional. Filter by compensation status. Valid values: 0 and 1.</p>
         */
        public Builder payStatuses(java.util.List<Integer> payStatuses) {
            this.putBodyParameter("PayStatuses", payStatuses);
            this.payStatuses = payStatuses;
            return this;
        }

        /**
         * <p>Optional. Filter by product code.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ecs&quot;,&quot;oss&quot;]</p>
         */
        public Builder productCodes(java.util.List<String> productCodes) {
            this.putBodyParameter("ProductCodes", productCodes);
            this.productCodes = productCodes;
            return this;
        }

        @Override
        public QueryMonthlySlaListRequest build() {
            return new QueryMonthlySlaListRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryMonthlySlaListRequest} extends {@link TeaModel}
     *
     * <p>QueryMonthlySlaListRequest</p>
     */
    public static class EcIdAccountIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<Long> accountIds;

        @com.aliyun.core.annotation.NameInMap("EcId")
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
             * <p>The list of accounts to access. If this parameter is empty, all accounts under the current entity ID are selected.</p>
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * <p>The enterprise entity ID.</p>
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
