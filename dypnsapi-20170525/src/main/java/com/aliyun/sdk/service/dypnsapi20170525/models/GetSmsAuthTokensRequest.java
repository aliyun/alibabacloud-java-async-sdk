// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSmsAuthTokensRequest} extends {@link RequestModel}
 *
 * <p>GetSmsAuthTokensRequest</p>
 */
public class GetSmsAuthTokensRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expire")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 43200, minimum = 900)
    private Long expire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageName")
    private String packageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsCodeExpire")
    private Integer smsCodeExpire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetSmsAuthTokensRequest request) {
            super(request);
            this.bundleId = request.bundleId;
            this.expire = request.expire;
            this.osType = request.osType;
            this.ownerId = request.ownerId;
            this.packageName = request.packageName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sceneCode = request.sceneCode;
            this.signName = request.signName;
            this.smsCodeExpire = request.smsCodeExpire;
            this.smsTemplateCode = request.smsTemplateCode;
        } 

        /**
         * <p>The ID of the iOS application. This parameter is required if OsType is set to <strong>iOS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12345****</p>
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * <p>The validity period of the token. Unit: seconds. Valid values: 900 to 43200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder expire(Long expire) {
            this.putQueryParameter("Expire", expire);
            this.expire = expire;
            return this;
        }

        /**
         * <p>The type of the operating system. Valid values: <strong>Android</strong> and <strong>iOS</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Android</p>
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
         * <p>The package name. This parameter is required if OsType is set to <strong>Android</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliqin.mytel.test</p>
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
         * <p>The service code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC100000134840112</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>The signature. This parameter is required if OsType is set to <strong>Android</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>47fcc6615485e83b4100433****</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * <p>The validity period of the SMS verification code. Unit: seconds. Default value: 180.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder smsCodeExpire(Integer smsCodeExpire) {
            this.putQueryParameter("SmsCodeExpire", smsCodeExpire);
            this.smsCodeExpire = smsCodeExpire;
            return this;
        }

        /**
         * <p>The code of the text message template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_13987****</p>
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
