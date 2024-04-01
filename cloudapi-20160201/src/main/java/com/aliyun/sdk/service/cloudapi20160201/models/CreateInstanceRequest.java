// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Query
    @NameInMap("AccountQuantity")
    @Validation(required = true)
    private Long accountQuantity;

    @Query
    @NameInMap("AlarmQuota")
    private Long alarmQuota;

    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("AppId")
    private Long appId;

    @Query
    @NameInMap("BillingType")
    private String billingType;

    @Query
    @NameInMap("CloudMarketInstanceId")
    private String cloudMarketInstanceId;

    @Query
    @NameInMap("ExpiredOn")
    @Validation(required = true)
    private String expiredOn;

    @Query
    @NameInMap("InstanceAttributes")
    private String instanceAttributes;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SkuId")
    @Validation(required = true)
    private String skuId;

    @Query
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.accountQuantity = builder.accountQuantity;
        this.alarmQuota = builder.alarmQuota;
        this.aliUid = builder.aliUid;
        this.appId = builder.appId;
        this.billingType = builder.billingType;
        this.cloudMarketInstanceId = builder.cloudMarketInstanceId;
        this.expiredOn = builder.expiredOn;
        this.instanceAttributes = builder.instanceAttributes;
        this.securityToken = builder.securityToken;
        this.skuId = builder.skuId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountQuantity
     */
    public Long getAccountQuantity() {
        return this.accountQuantity;
    }

    /**
     * @return alarmQuota
     */
    public Long getAlarmQuota() {
        return this.alarmQuota;
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return billingType
     */
    public String getBillingType() {
        return this.billingType;
    }

    /**
     * @return cloudMarketInstanceId
     */
    public String getCloudMarketInstanceId() {
        return this.cloudMarketInstanceId;
    }

    /**
     * @return expiredOn
     */
    public String getExpiredOn() {
        return this.expiredOn;
    }

    /**
     * @return instanceAttributes
     */
    public String getInstanceAttributes() {
        return this.instanceAttributes;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private Long accountQuantity; 
        private Long alarmQuota; 
        private Long aliUid; 
        private Long appId; 
        private String billingType; 
        private String cloudMarketInstanceId; 
        private String expiredOn; 
        private String instanceAttributes; 
        private String securityToken; 
        private String skuId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.accountQuantity = request.accountQuantity;
            this.alarmQuota = request.alarmQuota;
            this.aliUid = request.aliUid;
            this.appId = request.appId;
            this.billingType = request.billingType;
            this.cloudMarketInstanceId = request.cloudMarketInstanceId;
            this.expiredOn = request.expiredOn;
            this.instanceAttributes = request.instanceAttributes;
            this.securityToken = request.securityToken;
            this.skuId = request.skuId;
            this.token = request.token;
        } 

        /**
         * AccountQuantity.
         */
        public Builder accountQuantity(Long accountQuantity) {
            this.putQueryParameter("AccountQuantity", accountQuantity);
            this.accountQuantity = accountQuantity;
            return this;
        }

        /**
         * AlarmQuota.
         */
        public Builder alarmQuota(Long alarmQuota) {
            this.putQueryParameter("AlarmQuota", alarmQuota);
            this.alarmQuota = alarmQuota;
            return this;
        }

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BillingType.
         */
        public Builder billingType(String billingType) {
            this.putQueryParameter("BillingType", billingType);
            this.billingType = billingType;
            return this;
        }

        /**
         * CloudMarketInstanceId.
         */
        public Builder cloudMarketInstanceId(String cloudMarketInstanceId) {
            this.putQueryParameter("CloudMarketInstanceId", cloudMarketInstanceId);
            this.cloudMarketInstanceId = cloudMarketInstanceId;
            return this;
        }

        /**
         * ExpiredOn.
         */
        public Builder expiredOn(String expiredOn) {
            this.putQueryParameter("ExpiredOn", expiredOn);
            this.expiredOn = expiredOn;
            return this;
        }

        /**
         * InstanceAttributes.
         */
        public Builder instanceAttributes(String instanceAttributes) {
            this.putQueryParameter("InstanceAttributes", instanceAttributes);
            this.instanceAttributes = instanceAttributes;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SkuId.
         */
        public Builder skuId(String skuId) {
            this.putQueryParameter("SkuId", skuId);
            this.skuId = skuId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
