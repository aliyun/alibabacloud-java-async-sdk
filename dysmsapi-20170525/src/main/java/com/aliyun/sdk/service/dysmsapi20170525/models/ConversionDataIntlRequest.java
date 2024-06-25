// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConversionDataIntlRequest} extends {@link RequestModel}
 *
 * <p>ConversionDataIntlRequest</p>
 */
public class ConversionDataIntlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversionRate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversionRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportTime")
    private Long reportTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
         * The conversion rate.
         * <p>
         * 
         * > The value of this parameter is a double, and ranges from 0 to 1.
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
         * The time point at which the conversion rate is monitored. The value is a UNIX timestamp. Unit: milliseconds.
         * <p>
         * 
         * > If you do not specify this parameter, the current timestamp is used by default.
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
