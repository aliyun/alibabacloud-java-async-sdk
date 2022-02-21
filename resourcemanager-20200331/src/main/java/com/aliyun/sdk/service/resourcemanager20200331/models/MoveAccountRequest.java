// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveAccountRequest} extends {@link RequestModel}
 *
 * <p>MoveAccountRequest</p>
 */
public class MoveAccountRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("DestinationFolderId")
    @Validation(required = true)
    private String destinationFolderId;

    private MoveAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.destinationFolderId = builder.destinationFolderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return destinationFolderId
     */
    public String getDestinationFolderId() {
        return this.destinationFolderId;
    }

    public static final class Builder extends Request.Builder<MoveAccountRequest, Builder> {
        private String accountId; 
        private String destinationFolderId; 

        private Builder() {
            super();
        } 

        private Builder(MoveAccountRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.destinationFolderId = response.destinationFolderId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * DestinationFolderId.
         */
        public Builder destinationFolderId(String destinationFolderId) {
            this.putQueryParameter("DestinationFolderId", destinationFolderId);
            this.destinationFolderId = destinationFolderId;
            return this;
        }

        @Override
        public MoveAccountRequest build() {
            return new MoveAccountRequest(this);
        } 

    } 

}
