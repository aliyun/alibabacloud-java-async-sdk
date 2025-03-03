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
 * {@link DeleteAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccountRequest</p>
 */
public class DeleteAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbandonableCheckId")
    private java.util.List<String> abandonableCheckId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getAbandonableCheckId() {
        return this.abandonableCheckId;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    public static final class Builder extends Request.Builder<DeleteAccountRequest, Builder> {
        private java.util.List<String> abandonableCheckId; 
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
         * AbandonableCheckId.
         */
        public Builder abandonableCheckId(java.util.List<String> abandonableCheckId) {
            String abandonableCheckIdShrink = shrink(abandonableCheckId, "AbandonableCheckId", "json");
            this.putQueryParameter("AbandonableCheckId", abandonableCheckIdShrink);
            this.abandonableCheckId = abandonableCheckId;
            return this;
        }

        /**
         * <p>The type of the deletion. Valid values:</p>
         * <ul>
         * <li>0: direct deletion. If the member does not have pay-as-you-go resources that are purchased within the previous 30 days, the system directly deletes the member.</li>
         * <li>1: deletion with a silence period. If the member has pay-as-you-go resources that are purchased within the previous 30 days, the member enters a silence period of 45 days. The system starts to delete the member until the silence period ends. For more information about the silence period, see <a href="https://help.aliyun.com/document_detail/446079.html">What is the silence period for member deletion?</a></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>169946124551****</p>
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
