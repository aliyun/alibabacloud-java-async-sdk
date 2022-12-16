// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVerifySchemeRequest} extends {@link RequestModel}
 *
 * <p>CreateVerifySchemeRequest</p>
 */
public class CreateVerifySchemeRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("BundleId")
    private String bundleId;

    @Query
    @NameInMap("CmApiCode")
    private Long cmApiCode;

    @Query
    @NameInMap("CtApiCode")
    private Long ctApiCode;

    @Query
    @NameInMap("CuApiCode")
    private Long cuApiCode;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("IpWhiteList")
    private String ipWhiteList;

    @Query
    @NameInMap("Origin")
    private String origin;

    @Query
    @NameInMap("OsType")
    @Validation(required = true)
    private String osType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PackName")
    private String packName;

    @Query
    @NameInMap("PackSign")
    private String packSign;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SceneType")
    private String sceneType;

    @Query
    @NameInMap("SchemeName")
    @Validation(required = true)
    private String schemeName;

    @Query
    @NameInMap("SmsSignName")
    private String smsSignName;

    @Query
    @NameInMap("Url")
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
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
         * CmApiCode.
         */
        public Builder cmApiCode(Long cmApiCode) {
            this.putQueryParameter("CmApiCode", cmApiCode);
            this.cmApiCode = cmApiCode;
            return this;
        }

        /**
         * CtApiCode.
         */
        public Builder ctApiCode(Long ctApiCode) {
            this.putQueryParameter("CtApiCode", ctApiCode);
            this.ctApiCode = ctApiCode;
            return this;
        }

        /**
         * CuApiCode.
         */
        public Builder cuApiCode(Long cuApiCode) {
            this.putQueryParameter("CuApiCode", cuApiCode);
            this.cuApiCode = cuApiCode;
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
         * IpWhiteList.
         */
        public Builder ipWhiteList(String ipWhiteList) {
            this.putQueryParameter("IpWhiteList", ipWhiteList);
            this.ipWhiteList = ipWhiteList;
            return this;
        }

        /**
         * Origin.
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
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
         * PackName.
         */
        public Builder packName(String packName) {
            this.putQueryParameter("PackName", packName);
            this.packName = packName;
            return this;
        }

        /**
         * PackSign.
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
         * SceneType.
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * SchemeName.
         */
        public Builder schemeName(String schemeName) {
            this.putQueryParameter("SchemeName", schemeName);
            this.schemeName = schemeName;
            return this;
        }

        /**
         * SmsSignName.
         */
        public Builder smsSignName(String smsSignName) {
            this.putQueryParameter("SmsSignName", smsSignName);
            this.smsSignName = smsSignName;
            return this;
        }

        /**
         * Url.
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
