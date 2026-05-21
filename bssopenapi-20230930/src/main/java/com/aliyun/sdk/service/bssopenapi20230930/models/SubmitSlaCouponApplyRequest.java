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
 * {@link SubmitSlaCouponApplyRequest} extends {@link RequestModel}
 *
 * <p>SubmitSlaCouponApplyRequest</p>
 */
public class SubmitSlaCouponApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DamagedIds")
    private java.util.List<String> damagedIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Month")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer month;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    private SubmitSlaCouponApplyRequest(Builder builder) {
        super(builder);
        this.damagedIds = builder.damagedIds;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.month = builder.month;
        this.nbid = builder.nbid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSlaCouponApplyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return damagedIds
     */
    public java.util.List<String> getDamagedIds() {
        return this.damagedIds;
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return month
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    public static final class Builder extends Request.Builder<SubmitSlaCouponApplyRequest, Builder> {
        private java.util.List<String> damagedIds; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private Integer month; 
        private String nbid; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSlaCouponApplyRequest request) {
            super(request);
            this.damagedIds = request.damagedIds;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.month = request.month;
            this.nbid = request.nbid;
        } 

        /**
         * DamagedIds.
         */
        public Builder damagedIds(java.util.List<String> damagedIds) {
            this.putBodyParameter("DamagedIds", damagedIds);
            this.damagedIds = damagedIds;
            return this;
        }

        /**
         * EcIdAccountIds.
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIds);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202603</p>
         */
        public Builder month(Integer month) {
            this.putBodyParameter("Month", month);
            this.month = month;
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
        public SubmitSlaCouponApplyRequest build() {
            return new SubmitSlaCouponApplyRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitSlaCouponApplyRequest} extends {@link TeaModel}
     *
     * <p>SubmitSlaCouponApplyRequest</p>
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
             * AccountIds.
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * EcId.
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
