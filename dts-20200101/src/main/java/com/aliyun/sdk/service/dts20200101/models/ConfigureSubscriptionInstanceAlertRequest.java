// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSubscriptionInstanceAlertRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSubscriptionInstanceAlertRequest</p>
 */
public class ConfigureSubscriptionInstanceAlertRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("DelayAlertPhone")
    private String delayAlertPhone;

    @Query
    @NameInMap("DelayAlertStatus")
    private String delayAlertStatus;

    @Query
    @NameInMap("DelayOverSeconds")
    private String delayOverSeconds;

    @Query
    @NameInMap("ErrorAlertPhone")
    private String errorAlertPhone;

    @Query
    @NameInMap("ErrorAlertStatus")
    private String errorAlertStatus;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubscriptionInstanceId")
    @Validation(required = true)
    private String subscriptionInstanceId;

    private ConfigureSubscriptionInstanceAlertRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.delayAlertPhone = builder.delayAlertPhone;
        this.delayAlertStatus = builder.delayAlertStatus;
        this.delayOverSeconds = builder.delayOverSeconds;
        this.errorAlertPhone = builder.errorAlertPhone;
        this.errorAlertStatus = builder.errorAlertStatus;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSubscriptionInstanceAlertRequest create() {
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
     * @return delayAlertPhone
     */
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    /**
     * @return delayAlertStatus
     */
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    /**
     * @return delayOverSeconds
     */
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    /**
     * @return errorAlertPhone
     */
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    /**
     * @return errorAlertStatus
     */
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public static final class Builder extends Request.Builder<ConfigureSubscriptionInstanceAlertRequest, Builder> {
        private String accountId; 
        private String delayAlertPhone; 
        private String delayAlertStatus; 
        private String delayOverSeconds; 
        private String errorAlertPhone; 
        private String errorAlertStatus; 
        private String ownerId; 
        private String regionId; 
        private String subscriptionInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSubscriptionInstanceAlertRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.delayAlertPhone = response.delayAlertPhone;
            this.delayAlertStatus = response.delayAlertStatus;
            this.delayOverSeconds = response.delayOverSeconds;
            this.errorAlertPhone = response.errorAlertPhone;
            this.errorAlertStatus = response.errorAlertStatus;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.subscriptionInstanceId = response.subscriptionInstanceId;
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
         * DelayAlertPhone.
         */
        public Builder delayAlertPhone(String delayAlertPhone) {
            this.putQueryParameter("DelayAlertPhone", delayAlertPhone);
            this.delayAlertPhone = delayAlertPhone;
            return this;
        }

        /**
         * DelayAlertStatus.
         */
        public Builder delayAlertStatus(String delayAlertStatus) {
            this.putQueryParameter("DelayAlertStatus", delayAlertStatus);
            this.delayAlertStatus = delayAlertStatus;
            return this;
        }

        /**
         * DelayOverSeconds.
         */
        public Builder delayOverSeconds(String delayOverSeconds) {
            this.putQueryParameter("DelayOverSeconds", delayOverSeconds);
            this.delayOverSeconds = delayOverSeconds;
            return this;
        }

        /**
         * ErrorAlertPhone.
         */
        public Builder errorAlertPhone(String errorAlertPhone) {
            this.putQueryParameter("ErrorAlertPhone", errorAlertPhone);
            this.errorAlertPhone = errorAlertPhone;
            return this;
        }

        /**
         * ErrorAlertStatus.
         */
        public Builder errorAlertStatus(String errorAlertStatus) {
            this.putQueryParameter("ErrorAlertStatus", errorAlertStatus);
            this.errorAlertStatus = errorAlertStatus;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SubscriptionInstanceId.
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        @Override
        public ConfigureSubscriptionInstanceAlertRequest build() {
            return new ConfigureSubscriptionInstanceAlertRequest(this);
        } 

    } 

}
