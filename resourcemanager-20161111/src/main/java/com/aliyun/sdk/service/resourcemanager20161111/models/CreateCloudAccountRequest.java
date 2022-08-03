// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudAccountRequest</p>
 */
public class CreateCloudAccountRequest extends Request {
    @Query
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Query
    @NameInMap("Email")
    @Validation(required = true)
    private String email;

    @Query
    @NameInMap("EnableConsolidatedBilling")
    private Boolean enableConsolidatedBilling;

    @Query
    @NameInMap("ParentFolderId")
    private String parentFolderId;

    @Query
    @NameInMap("PayerAccountId")
    private String payerAccountId;

    private CreateCloudAccountRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.enableConsolidatedBilling = builder.enableConsolidatedBilling;
        this.parentFolderId = builder.parentFolderId;
        this.payerAccountId = builder.payerAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudAccountRequest create() {
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
     * @return email
     */
    public String getEmail() {
        return this.email;
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

    public static final class Builder extends Request.Builder<CreateCloudAccountRequest, Builder> {
        private String displayName; 
        private String email; 
        private Boolean enableConsolidatedBilling; 
        private String parentFolderId; 
        private String payerAccountId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudAccountRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.email = request.email;
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
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
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
        public CreateCloudAccountRequest build() {
            return new CreateCloudAccountRequest(this);
        } 

    } 

}
