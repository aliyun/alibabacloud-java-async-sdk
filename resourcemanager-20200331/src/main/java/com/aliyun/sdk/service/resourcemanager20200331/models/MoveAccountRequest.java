// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link MoveAccountRequest} extends {@link RequestModel}
 *
 * <p>MoveAccountRequest</p>
 */
public class MoveAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationFolderId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(MoveAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.destinationFolderId = request.destinationFolderId;
        } 

        /**
         * <p>The ID of the account you want to move.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The ID of the destination folder.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-bVaRIG****</p>
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
