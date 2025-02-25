// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link PrecheckForConsolidatedBillingAccountRequest} extends {@link RequestModel}
 *
 * <p>PrecheckForConsolidatedBillingAccountRequest</p>
 */
public class PrecheckForConsolidatedBillingAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the management account or member to be used as a main financial account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111***089</p>
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
