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
 * {@link GetSavingPlanUserDeductRuleRequest} extends {@link RequestModel}
 *
 * <p>GetSavingPlanUserDeductRuleRequest</p>
 */
public class GetSavingPlanUserDeductRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpnInstanceCode")
    private String spnInstanceCode;

    private GetSavingPlanUserDeductRuleRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.nbid = builder.nbid;
        this.pageSize = builder.pageSize;
        this.spnInstanceCode = builder.spnInstanceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSavingPlanUserDeductRuleRequest create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return spnInstanceCode
     */
    public String getSpnInstanceCode() {
        return this.spnInstanceCode;
    }

    public static final class Builder extends Request.Builder<GetSavingPlanUserDeductRuleRequest, Builder> {
        private Integer currentPage; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String nbid; 
        private Integer pageSize; 
        private String spnInstanceCode; 

        private Builder() {
            super();
        } 

        private Builder(GetSavingPlanUserDeductRuleRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.nbid = request.nbid;
            this.pageSize = request.pageSize;
            this.spnInstanceCode = request.spnInstanceCode;
        } 

        /**
         * CurrentPage.
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SpnInstanceCode.
         */
        public Builder spnInstanceCode(String spnInstanceCode) {
            this.putQueryParameter("SpnInstanceCode", spnInstanceCode);
            this.spnInstanceCode = spnInstanceCode;
            return this;
        }

        @Override
        public GetSavingPlanUserDeductRuleRequest build() {
            return new GetSavingPlanUserDeductRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetSavingPlanUserDeductRuleRequest} extends {@link TeaModel}
     *
     * <p>GetSavingPlanUserDeductRuleRequest</p>
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
