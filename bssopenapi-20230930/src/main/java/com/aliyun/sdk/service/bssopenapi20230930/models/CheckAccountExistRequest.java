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
 * {@link CheckAccountExistRequest} extends {@link RequestModel}
 *
 * <p>CheckAccountExistRequest</p>
 */
public class CheckAccountExistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToUserType")
    private Integer toUserType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransferAccount")
    private String transferAccount;

    private CheckAccountExistRequest(Builder builder) {
        super(builder);
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.nbid = builder.nbid;
        this.toUserType = builder.toUserType;
        this.transferAccount = builder.transferAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAccountExistRequest create() {
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

    /**
     * @return toUserType
     */
    public Integer getToUserType() {
        return this.toUserType;
    }

    /**
     * @return transferAccount
     */
    public String getTransferAccount() {
        return this.transferAccount;
    }

    public static final class Builder extends Request.Builder<CheckAccountExistRequest, Builder> {
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String nbid; 
        private Integer toUserType; 
        private String transferAccount; 

        private Builder() {
            super();
        } 

        private Builder(CheckAccountExistRequest request) {
            super(request);
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.nbid = request.nbid;
            this.toUserType = request.toUserType;
            this.transferAccount = request.transferAccount;
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
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * ToUserType.
         */
        public Builder toUserType(Integer toUserType) {
            this.putBodyParameter("ToUserType", toUserType);
            this.toUserType = toUserType;
            return this;
        }

        /**
         * TransferAccount.
         */
        public Builder transferAccount(String transferAccount) {
            this.putBodyParameter("TransferAccount", transferAccount);
            this.transferAccount = transferAccount;
            return this;
        }

        @Override
        public CheckAccountExistRequest build() {
            return new CheckAccountExistRequest(this);
        } 

    } 

    /**
     * 
     * {@link CheckAccountExistRequest} extends {@link TeaModel}
     *
     * <p>CheckAccountExistRequest</p>
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
