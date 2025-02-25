// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVerifySchemeRequest} extends {@link RequestModel}
 *
 * <p>CreateVerifySchemeRequest</p>
 */
public class CreateVerifySchemeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CmApiCode")
    private Long cmApiCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CtApiCode")
    private Long ctApiCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CuApiCode")
    private Long cuApiCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HmAppIdentifier")
    private String hmAppIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HmPackageName")
    private String hmPackageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HmSignName")
    private String hmSignName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpWhiteList")
    private String ipWhiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackName")
    private String packName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackSign")
    private String packSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private String sceneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsSignName")
    private String smsSignName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private CreateVerifySchemeRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.authType = builder.authType;
        this.bundleId = builder.bundleId;
        this.cmApiCode = builder.cmApiCode;
        this.ctApiCode = builder.ctApiCode;
        this.cuApiCode = builder.cuApiCode;
        this.email = builder.email;
        this.hmAppIdentifier = builder.hmAppIdentifier;
        this.hmPackageName = builder.hmPackageName;
        this.hmSignName = builder.hmSignName;
        this.ipWhiteList = builder.ipWhiteList;
        this.origin = builder.origin;
        this.osType = builder.osType;
        this.ownerId = builder.ownerId;
        this.packName = builder.packName;
        this.packSign = builder.packSign;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sceneType = builder.sceneType;
        this.schemeName = builder.schemeName;
        this.smsSignName = builder.smsSignName;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVerifySchemeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return cmApiCode
     */
    public Long getCmApiCode() {
        return this.cmApiCode;
    }

    /**
     * @return ctApiCode
     */
    public Long getCtApiCode() {
        return this.ctApiCode;
    }

    /**
     * @return cuApiCode
     */
    public Long getCuApiCode() {
        return this.cuApiCode;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return hmAppIdentifier
     */
    public String getHmAppIdentifier() {
        return this.hmAppIdentifier;
    }

    /**
     * @return hmPackageName
     */
    public String getHmPackageName() {
        return this.hmPackageName;
    }

    /**
     * @return hmSignName
     */
    public String getHmSignName() {
        return this.hmSignName;
    }

    /**
     * @return ipWhiteList
     */
    public String getIpWhiteList() {
        return this.ipWhiteList;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
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
     * @return packName
     */
    public String getPackName() {
        return this.packName;
    }

    /**
     * @return packSign
     */
    public String getPackSign() {
        return this.packSign;
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
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    /**
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    /**
     * @return smsSignName
     */
    public String getSmsSignName() {
        return this.smsSignName;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateVerifySchemeRequest, Builder> {
        private String appName; 
        private String authType; 
        private String bundleId; 
        private Long cmApiCode; 
        private Long ctApiCode; 
        private Long cuApiCode; 
        private String email; 
        private String hmAppIdentifier; 
        private String hmPackageName; 
        private String hmSignName; 
        private String ipWhiteList; 
        private String origin; 
        private String osType; 
        private Long ownerId; 
        private String packName; 
        private String packSign; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sceneType; 
        private String schemeName; 
        private String smsSignName; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateVerifySchemeRequest request) {
            super(request);
            this.appName = request.appName;
            this.authType = request.authType;
            this.bundleId = request.bundleId;
            this.cmApiCode = request.cmApiCode;
            this.ctApiCode = request.ctApiCode;
            this.cuApiCode = request.cuApiCode;
            this.email = request.email;
            this.hmAppIdentifier = request.hmAppIdentifier;
            this.hmPackageName = request.hmPackageName;
            this.hmSignName = request.hmSignName;
            this.ipWhiteList = request.ipWhiteList;
            this.origin = request.origin;
            this.osType = request.osType;
            this.ownerId = request.ownerId;
            this.packName = request.packName;
            this.packSign = request.packSign;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sceneType = request.sceneType;
            this.schemeName = request.schemeName;
            this.smsSignName = request.smsSignName;
            this.url = request.url;
        } 

        /**
         * <p>The app name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Communications</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The verification type. You can select multiple types only when the phone number verification is supported. Separate multiple types with commas (,).</p>
         * <ul>
         * <li><strong>1</strong>: phone number verification</li>
         * <li><strong>2</strong>: SMS verification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>The bundle ID. This parameter is required when OsType is set to iOS. The bundle ID must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (_), and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * <p>The channel code of China Mobile.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cmApiCode(Long cmApiCode) {
            this.putQueryParameter("CmApiCode", cmApiCode);
            this.cmApiCode = cmApiCode;
            return this;
        }

        /**
         * <p>The channel code of China Telecom.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder ctApiCode(Long ctApiCode) {
            this.putQueryParameter("CtApiCode", ctApiCode);
            this.ctApiCode = ctApiCode;
            return this;
        }

        /**
         * <p>The channel code of China Unicom.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cuApiCode(Long cuApiCode) {
            this.putQueryParameter("CuApiCode", cuApiCode);
            this.cuApiCode = cuApiCode;
            return this;
        }

        /**
         * <p>The email address that receives the key.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@aliyundoc.com">username@aliyundoc.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * HmAppIdentifier.
         */
        public Builder hmAppIdentifier(String hmAppIdentifier) {
            this.putQueryParameter("HmAppIdentifier", hmAppIdentifier);
            this.hmAppIdentifier = hmAppIdentifier;
            return this;
        }

        /**
         * HmPackageName.
         */
        public Builder hmPackageName(String hmPackageName) {
            this.putQueryParameter("HmPackageName", hmPackageName);
            this.hmPackageName = hmPackageName;
            return this;
        }

        /**
         * HmSignName.
         */
        public Builder hmSignName(String hmSignName) {
            this.putQueryParameter("HmSignName", hmSignName);
            this.hmSignName = hmSignName;
            return this;
        }

        /**
         * <p>The IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>139.9.167.181
         * 122.112.210.205
         * 139.9.172.0/24</p>
         */
        public Builder ipWhiteList(String ipWhiteList) {
            this.putQueryParameter("IpWhiteList", ipWhiteList);
            this.ipWhiteList = ipWhiteList;
            return this;
        }

        /**
         * <p>The source URL of the HTML5 app page. We recommend that you specify this parameter as a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://h5.minexiot.com">https://h5.minexiot.com</a></p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The type of the operating system for the terminal. Valid values: iOS and Android.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iOS</p>
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
         * <p>The package name. This parameter is required when OsType is set to Android. The name must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (_), and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun</p>
         */
        public Builder packName(String packName) {
            this.putQueryParameter("PackName", packName);
            this.packName = packName;
            return this;
        }

        /**
         * <p>The package signature. This parameter is required when OsType is set to Android. The signature must be 32 characters in length and can contain digits and letters.</p>
         * 
         * <strong>example:</strong>
         * <p>123aliyun</p>
         */
        public Builder packSign(String packSign) {
            this.putQueryParameter("PackSign", packSign);
            this.packSign = packSign;
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
         * <p>The service type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * <p>The service name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder schemeName(String schemeName) {
            this.putQueryParameter("SchemeName", schemeName);
            this.schemeName = schemeName;
            return this;
        }

        /**
         * <p>The bound SMS signature. This parameter is valid only when AuthType is set to 2. The signature must be approved.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun Test</p>
         */
        public Builder smsSignName(String smsSignName) {
            this.putQueryParameter("SmsSignName", smsSignName);
            this.smsSignName = smsSignName;
            return this;
        }

        /**
         * <p>The URL of the HTML5 app page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://h5.minexiot.com/index.html">https://h5.minexiot.com/index.html</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateVerifySchemeRequest build() {
            return new CreateVerifySchemeRequest(this);
        } 

    } 

}
