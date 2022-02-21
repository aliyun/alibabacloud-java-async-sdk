// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSmsAuthTokensRequest} extends {@link RequestModel}
 *
 * <p>GetSmsAuthTokensRequest</p>
 */
public class GetSmsAuthTokensRequest extends Request {
    @Query
    @NameInMap("BundleId")
    private String bundleId;

    @Query
    @NameInMap("Expire")
    @Validation(required = true, maximum = 43200, minimum = 900)
    private Long expire;

    @Query
    @NameInMap("OsType")
    @Validation(required = true)
    private String osType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PackageName")
    private String packageName;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SceneCode")
    @Validation(required = true)
    private String sceneCode;

    @Query
    @NameInMap("SignName")
    private String signName;

    @Query
    @NameInMap("SmsCodeExpire")
    private Integer smsCodeExpire;

    @Query
    @NameInMap("SmsTemplateCode")
    @Validation(required = true)
    private String smsTemplateCode;

    private GetSmsAuthTokensRequest(Builder builder) {
        super(builder);
        this.bundleId = builder.bundleId;
        this.expire = builder.expire;
        this.osType = builder.osType;
        this.ownerId = builder.ownerId;
        this.packageName = builder.packageName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sceneCode = builder.sceneCode;
        this.signName = builder.signName;
        this.smsCodeExpire = builder.smsCodeExpire;
        this.smsTemplateCode = builder.smsTemplateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsAuthTokensRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
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

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return smsCodeExpire
     */
    public Integer getSmsCodeExpire() {
        return this.smsCodeExpire;
    }

    /**
     * @return smsTemplateCode
     */
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public static final class Builder extends Request.Builder<GetSmsAuthTokensRequest, Builder> {
        private String bundleId; 
        private Long expire; 
        private String osType; 
        private Long ownerId; 
        private String packageName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sceneCode; 
        private String signName; 
        private Integer smsCodeExpire; 
        private String smsTemplateCode; 

        private Builder() {
            super();
        } 

        private Builder(GetSmsAuthTokensRequest response) {
            super(response);
            this.bundleId = response.bundleId;
            this.expire = response.expire;
            this.osType = response.osType;
            this.ownerId = response.ownerId;
            this.packageName = response.packageName;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sceneCode = response.sceneCode;
            this.signName = response.signName;
            this.smsCodeExpire = response.smsCodeExpire;
            this.smsTemplateCode = response.smsTemplateCode;
        } 

        /**
         * BundleId.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(Long expire) {
            this.putQueryParameter("Expire", expire);
            this.expire = expire;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
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
         * PackageName.
         */
        public Builder packageName(String packageName) {
            this.putQueryParameter("PackageName", packageName);
            this.packageName = packageName;
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

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * SmsCodeExpire.
         */
        public Builder smsCodeExpire(Integer smsCodeExpire) {
            this.putQueryParameter("SmsCodeExpire", smsCodeExpire);
            this.smsCodeExpire = smsCodeExpire;
            return this;
        }

        /**
         * SmsTemplateCode.
         */
        public Builder smsTemplateCode(String smsTemplateCode) {
            this.putQueryParameter("SmsTemplateCode", smsTemplateCode);
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }

        @Override
        public GetSmsAuthTokensRequest build() {
            return new GetSmsAuthTokensRequest(this);
        } 

    } 

}
