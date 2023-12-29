// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchemeConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateSchemeConfigRequest</p>
 */
public class CreateSchemeConfigRequest extends Request {
    @Query
    @NameInMap("AndroidPackageName")
    private String androidPackageName;

    @Query
    @NameInMap("AndroidPackageSign")
    private String androidPackageSign;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("H5Origin")
    private String h5Origin;

    @Query
    @NameInMap("H5Url")
    private String h5Url;

    @Query
    @NameInMap("IosBundleId")
    private String iosBundleId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Platform")
    @Validation(required = true)
    private String platform;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SchemeName")
    @Validation(required = true)
    private String schemeName;

    private CreateSchemeConfigRequest(Builder builder) {
        super(builder);
        this.androidPackageName = builder.androidPackageName;
        this.androidPackageSign = builder.androidPackageSign;
        this.appName = builder.appName;
        this.h5Origin = builder.h5Origin;
        this.h5Url = builder.h5Url;
        this.iosBundleId = builder.iosBundleId;
        this.ownerId = builder.ownerId;
        this.platform = builder.platform;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schemeName = builder.schemeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSchemeConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidPackageName
     */
    public String getAndroidPackageName() {
        return this.androidPackageName;
    }

    /**
     * @return androidPackageSign
     */
    public String getAndroidPackageSign() {
        return this.androidPackageSign;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return h5Origin
     */
    public String getH5Origin() {
        return this.h5Origin;
    }

    /**
     * @return h5Url
     */
    public String getH5Url() {
        return this.h5Url;
    }

    /**
     * @return iosBundleId
     */
    public String getIosBundleId() {
        return this.iosBundleId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
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
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    public static final class Builder extends Request.Builder<CreateSchemeConfigRequest, Builder> {
        private String androidPackageName; 
        private String androidPackageSign; 
        private String appName; 
        private String h5Origin; 
        private String h5Url; 
        private String iosBundleId; 
        private Long ownerId; 
        private String platform; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String schemeName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSchemeConfigRequest request) {
            super(request);
            this.androidPackageName = request.androidPackageName;
            this.androidPackageSign = request.androidPackageSign;
            this.appName = request.appName;
            this.h5Origin = request.h5Origin;
            this.h5Url = request.h5Url;
            this.iosBundleId = request.iosBundleId;
            this.ownerId = request.ownerId;
            this.platform = request.platform;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.schemeName = request.schemeName;
        } 

        /**
         * The package name. This parameter is required when Platform is set to Android. The name must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (\_), and periods (.).
         */
        public Builder androidPackageName(String androidPackageName) {
            this.putQueryParameter("AndroidPackageName", androidPackageName);
            this.androidPackageName = androidPackageName;
            return this;
        }

        /**
         * The package signature. This parameter is required when Platform is set to Android. The signature must be 32 characters in length and can contain digits and letters.
         */
        public Builder androidPackageSign(String androidPackageSign) {
            this.putQueryParameter("AndroidPackageSign", androidPackageSign);
            this.androidPackageSign = androidPackageSign;
            return this;
        }

        /**
         * The app name, which can be up to 20 characters in length and can contain letters.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The reserved field. HTML5 apps are not supported.
         */
        public Builder h5Origin(String h5Origin) {
            this.putQueryParameter("H5Origin", h5Origin);
            this.h5Origin = h5Origin;
            return this;
        }

        /**
         * The reserved field. HTML5 apps are not supported.
         */
        public Builder h5Url(String h5Url) {
            this.putQueryParameter("H5Url", h5Url);
            this.h5Url = h5Url;
            return this;
        }

        /**
         * The bundle ID. This parameter is required when OsType is set to iOS. The bundle ID must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (\_), and periods (.).
         */
        public Builder iosBundleId(String iosBundleId) {
            this.putQueryParameter("IosBundleId", iosBundleId);
            this.iosBundleId = iosBundleId;
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
         * The app platform.
         * <p>
         * 
         * Valid values:
         * 
         * *   Android
         * *   iOS
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
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
         * The service name, which can be up to 10 characters in length and can contain letters.
         */
        public Builder schemeName(String schemeName) {
            this.putQueryParameter("SchemeName", schemeName);
            this.schemeName = schemeName;
            return this;
        }

        @Override
        public CreateSchemeConfigRequest build() {
            return new CreateSchemeConfigRequest(this);
        } 

    } 

}
