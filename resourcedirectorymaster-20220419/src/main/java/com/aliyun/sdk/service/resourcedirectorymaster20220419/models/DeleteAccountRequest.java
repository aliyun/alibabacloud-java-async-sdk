// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccountRequest</p>
 */
public class DeleteAccountRequest extends Request {
    @Query
    @NameInMap("AbandonableCheckId")
    private java.util.List < String > abandonableCheckId;

    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    private DeleteAccountRequest(Builder builder) {
        super(builder);
        this.abandonableCheckId = builder.abandonableCheckId;
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abandonableCheckId
     */
    public java.util.List < String > getAbandonableCheckId() {
        return this.abandonableCheckId;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    public static final class Builder extends Request.Builder<DeleteAccountRequest, Builder> {
        private java.util.List < String > abandonableCheckId; 
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccountRequest request) {
            super(request);
            this.abandonableCheckId = request.abandonableCheckId;
            this.accountId = request.accountId;
        } 

        /**
         * The IDs of the check items that you can choose to ignore for the member deletion.
         * <p>
         * 
         * You can obtain the IDs from the response of the [GetAccountDeletionCheckResult](~~GetAccountDeletionCheckResult~~) operation.
         */
        public Builder abandonableCheckId(java.util.List < String > abandonableCheckId) {
            String abandonableCheckIdShrink = shrink(abandonableCheckId, "AbandonableCheckId", "json");
            this.putQueryParameter("AbandonableCheckId", abandonableCheckIdShrink);
            this.abandonableCheckId = abandonableCheckId;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the member that you want to delete.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public DeleteAccountRequest build() {
            return new DeleteAccountRequest(this);
        } 

    } 

}
