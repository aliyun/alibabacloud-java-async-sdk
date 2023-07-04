// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConversionDataIntlRequest} extends {@link RequestModel}
 *
 * <p>ConversionDataIntlRequest</p>
 */
public class ConversionDataIntlRequest extends Request {
    @Query
    @NameInMap("ConversionRate")
    @Validation(required = true)
    private String conversionRate;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReportTime")
    private Long reportTime;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ConversionDataIntlRequest(Builder builder) {
        super(builder);
        this.conversionRate = builder.conversionRate;
        this.ownerId = builder.ownerId;
        this.reportTime = builder.reportTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConversionDataIntlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversionRate
     */
    public String getConversionRate() {
        return this.conversionRate;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return reportTime
     */
    public Long getReportTime() {
        return this.reportTime;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ConversionDataIntlRequest, Builder> {
        private String conversionRate; 
        private Long ownerId; 
        private Long reportTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ConversionDataIntlRequest request) {
            super(request);
            this.conversionRate = request.conversionRate;
            this.ownerId = request.ownerId;
            this.reportTime = request.reportTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * ConversionRate.
         */
        public Builder conversionRate(String conversionRate) {
            this.putQueryParameter("ConversionRate", conversionRate);
            this.conversionRate = conversionRate;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ReportTime.
         */
        public Builder reportTime(Long reportTime) {
            this.putQueryParameter("ReportTime", reportTime);
            this.reportTime = reportTime;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ConversionDataIntlRequest build() {
            return new ConversionDataIntlRequest(this);
        } 

    } 

}
