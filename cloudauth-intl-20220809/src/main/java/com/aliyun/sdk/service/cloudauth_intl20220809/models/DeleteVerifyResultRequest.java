// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVerifyResultRequest} extends {@link RequestModel}
 *
 * <p>DeleteVerifyResultRequest</p>
 */
public class DeleteVerifyResultRequest extends Request {
    @Query
    @NameInMap("DeleteAfterQuery")
    private String deleteAfterQuery;

    @Query
    @NameInMap("DeleteType")
    private String deleteType;

    @Query
    @NameInMap("TransactionId")
    private String transactionId;

    private DeleteVerifyResultRequest(Builder builder) {
        super(builder);
        this.deleteAfterQuery = builder.deleteAfterQuery;
        this.deleteType = builder.deleteType;
        this.transactionId = builder.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVerifyResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteAfterQuery
     */
    public String getDeleteAfterQuery() {
        return this.deleteAfterQuery;
    }

    /**
     * @return deleteType
     */
    public String getDeleteType() {
        return this.deleteType;
    }

    /**
     * @return transactionId
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    public static final class Builder extends Request.Builder<DeleteVerifyResultRequest, Builder> {
        private String deleteAfterQuery; 
        private String deleteType; 
        private String transactionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVerifyResultRequest request) {
            super(request);
            this.deleteAfterQuery = request.deleteAfterQuery;
            this.deleteType = request.deleteType;
            this.transactionId = request.transactionId;
        } 

        /**
         * DeleteAfterQuery.
         */
        public Builder deleteAfterQuery(String deleteAfterQuery) {
            this.putQueryParameter("DeleteAfterQuery", deleteAfterQuery);
            this.deleteAfterQuery = deleteAfterQuery;
            return this;
        }

        /**
         * DeleteType.
         */
        public Builder deleteType(String deleteType) {
            this.putQueryParameter("DeleteType", deleteType);
            this.deleteType = deleteType;
            return this;
        }

        /**
         * TransactionId.
         */
        public Builder transactionId(String transactionId) {
            this.putQueryParameter("TransactionId", transactionId);
            this.transactionId = transactionId;
            return this;
        }

        @Override
        public DeleteVerifyResultRequest build() {
            return new DeleteVerifyResultRequest(this);
        } 

    } 

}
