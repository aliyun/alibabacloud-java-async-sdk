// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePictureRequest} extends {@link RequestModel}
 *
 * <p>DeletePictureRequest</p>
 */
public class DeletePictureRequest extends Request {
    @Query
    @NameInMap("DeletePicAfterQuery")
    private String deletePicAfterQuery;

    @Query
    @NameInMap("TransactionId")
    private String transactionId;

    private DeletePictureRequest(Builder builder) {
        super(builder);
        this.deletePicAfterQuery = builder.deletePicAfterQuery;
        this.transactionId = builder.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePictureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletePicAfterQuery
     */
    public String getDeletePicAfterQuery() {
        return this.deletePicAfterQuery;
    }

    /**
     * @return transactionId
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    public static final class Builder extends Request.Builder<DeletePictureRequest, Builder> {
        private String deletePicAfterQuery; 
        private String transactionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePictureRequest request) {
            super(request);
            this.deletePicAfterQuery = request.deletePicAfterQuery;
            this.transactionId = request.transactionId;
        } 

        /**
         * DeletePicAfterQuery.
         */
        public Builder deletePicAfterQuery(String deletePicAfterQuery) {
            this.putQueryParameter("DeletePicAfterQuery", deletePicAfterQuery);
            this.deletePicAfterQuery = deletePicAfterQuery;
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
        public DeletePictureRequest build() {
            return new DeletePictureRequest(this);
        } 

    } 

}
