// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceAccountRequest</p>
 */
public class CreateResourceAccountRequest extends Request {
    @Query
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Query
    @NameInMap("EnableConsolidatedBilling")
    private Boolean enableConsolidatedBilling;

    @Query
    @NameInMap("ParentFolderId")
    private String parentFolderId;

    @Query
    @NameInMap("PayerAccountId")
    private String payerAccountId;

    private CreateResourceAccountRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.enableConsolidatedBilling = builder.enableConsolidatedBilling;
        this.parentFolderId = builder.parentFolderId;
        this.payerAccountId = builder.payerAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return enableConsolidatedBilling
     */
    public Boolean getEnableConsolidatedBilling() {
        return this.enableConsolidatedBilling;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return payerAccountId
     */
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    public static final class Builder extends Request.Builder<CreateResourceAccountRequest, Builder> {
        private String displayName; 
        private Boolean enableConsolidatedBilling; 
        private String parentFolderId; 
        private String payerAccountId; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceAccountRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.enableConsolidatedBilling = request.enableConsolidatedBilling;
            this.parentFolderId = request.parentFolderId;
            this.payerAccountId = request.payerAccountId;
        } 

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * EnableConsolidatedBilling.
         */
        public Builder enableConsolidatedBilling(Boolean enableConsolidatedBilling) {
            this.putQueryParameter("EnableConsolidatedBilling", enableConsolidatedBilling);
            this.enableConsolidatedBilling = enableConsolidatedBilling;
            return this;
        }

        /**
         * ParentFolderId.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * PayerAccountId.
         */
        public Builder payerAccountId(String payerAccountId) {
            this.putQueryParameter("PayerAccountId", payerAccountId);
            this.payerAccountId = payerAccountId;
            return this;
        }

        @Override
        public CreateResourceAccountRequest build() {
            return new CreateResourceAccountRequest(this);
        } 

    } 

}
