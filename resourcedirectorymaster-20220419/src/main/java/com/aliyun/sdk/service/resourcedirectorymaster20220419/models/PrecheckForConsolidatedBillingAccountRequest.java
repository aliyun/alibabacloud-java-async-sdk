// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrecheckForConsolidatedBillingAccountRequest} extends {@link RequestModel}
 *
 * <p>PrecheckForConsolidatedBillingAccountRequest</p>
 */
public class PrecheckForConsolidatedBillingAccountRequest extends Request {
    @Query
    @NameInMap("BillingAccountId")
    @Validation(required = true)
    private String billingAccountId;

    private PrecheckForConsolidatedBillingAccountRequest(Builder builder) {
        super(builder);
        this.billingAccountId = builder.billingAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckForConsolidatedBillingAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingAccountId
     */
    public String getBillingAccountId() {
        return this.billingAccountId;
    }

    public static final class Builder extends Request.Builder<PrecheckForConsolidatedBillingAccountRequest, Builder> {
        private String billingAccountId; 

        private Builder() {
            super();
        } 

        private Builder(PrecheckForConsolidatedBillingAccountRequest request) {
            super(request);
            this.billingAccountId = request.billingAccountId;
        } 

        /**
         * BillingAccountId.
         */
        public Builder billingAccountId(String billingAccountId) {
            this.putQueryParameter("BillingAccountId", billingAccountId);
            this.billingAccountId = billingAccountId;
            return this;
        }

        @Override
        public PrecheckForConsolidatedBillingAccountRequest build() {
            return new PrecheckForConsolidatedBillingAccountRequest(this);
        } 

    } 

}
