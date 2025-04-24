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
 * {@link DescribeUserSpnSummaryInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserSpnSummaryInfoRequest</p>
 */
public class DescribeUserSpnSummaryInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    private DescribeUserSpnSummaryInfoRequest(Builder builder) {
        super(builder);
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.nbid = builder.nbid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserSpnSummaryInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeUserSpnSummaryInfoRequest, Builder> {
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String nbid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserSpnSummaryInfoRequest request) {
            super(request);
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.nbid = request.nbid;
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

        @Override
        public DescribeUserSpnSummaryInfoRequest build() {
            return new DescribeUserSpnSummaryInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserSpnSummaryInfoRequest} extends {@link TeaModel}
     *
     * <p>DescribeUserSpnSummaryInfoRequest</p>
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
