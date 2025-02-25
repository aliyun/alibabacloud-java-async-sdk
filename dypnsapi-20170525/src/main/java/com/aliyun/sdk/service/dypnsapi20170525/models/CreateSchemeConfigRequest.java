// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSchemeConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateSchemeConfigRequest</p>
 */
public class CreateSchemeConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidPackageName")
    private String androidPackageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidPackageSign")
    private String androidPackageSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("H5Origin")
    private String h5Origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("H5Url")
    private String h5Url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IosBundleId")
    private String iosBundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemeName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The package name. This parameter is required when Platform is set to Android. The name must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (_), and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.android</p>
         */
        public Builder androidPackageName(String androidPackageName) {
            this.putQueryParameter("AndroidPackageName", androidPackageName);
            this.androidPackageName = androidPackageName;
            return this;
        }

        /**
         * <p>The package signature. This parameter is required when Platform is set to Android. The signature must be 32 characters in length and can contain digits and letters.</p>
         * 
         * <strong>example:</strong>
         * <p>dfsfaawklll1*<em><strong>olkweklk</strong></em></p>
         */
        public Builder androidPackageSign(String androidPackageSign) {
            this.putQueryParameter("AndroidPackageSign", androidPackageSign);
            this.androidPackageSign = androidPackageSign;
            return this;
        }

        /**
         * <p>The app name, which can be up to 20 characters in length and can contain letters.</p>
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
         * <p>The reserved field. HTML5 apps are not supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder h5Origin(String h5Origin) {
            this.putQueryParameter("H5Origin", h5Origin);
            this.h5Origin = h5Origin;
            return this;
        }

        /**
         * <p>The reserved field. HTML5 apps are not supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder h5Url(String h5Url) {
            this.putQueryParameter("H5Url", h5Url);
            this.h5Url = h5Url;
            return this;
        }

        /**
         * <p>The bundle ID. This parameter is required when OsType is set to iOS. The bundle ID must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (_), and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.ios</p>
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
         * <p>The app platform.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Android</li>
         * <li>iOS</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Android</p>
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
         * <p>The service name, which can be up to 10 characters in length and can contain letters.</p>
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

        @Override
        public CreateSchemeConfigRequest build() {
            return new CreateSchemeConfigRequest(this);
        } 

    } 

}
