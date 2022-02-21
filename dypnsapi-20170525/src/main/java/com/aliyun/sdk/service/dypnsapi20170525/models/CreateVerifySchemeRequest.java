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
    @NameInMap("BundleId")
    private String bundleId;

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
    @NameInMap("SchemeName")
    @Validation(required = true)
    private String schemeName;

    private CreateVerifySchemeRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.bundleId = builder.bundleId;
        this.osType = builder.osType;
        this.ownerId = builder.ownerId;
        this.packName = builder.packName;
        this.packSign = builder.packSign;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schemeName = builder.schemeName;
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
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
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
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    public static final class Builder extends Request.Builder<CreateVerifySchemeRequest, Builder> {
        private String appName; 
        private String bundleId; 
        private String osType; 
        private Long ownerId; 
        private String packName; 
        private String packSign; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String schemeName; 

        private Builder() {
            super();
        } 

        private Builder(CreateVerifySchemeRequest response) {
            super(response);
            this.appName = response.appName;
            this.bundleId = response.bundleId;
            this.osType = response.osType;
            this.ownerId = response.ownerId;
            this.packName = response.packName;
            this.packSign = response.packSign;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.schemeName = response.schemeName;
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
         * BundleId.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
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
         * SchemeName.
         */
        public Builder schemeName(String schemeName) {
            this.putQueryParameter("SchemeName", schemeName);
            this.schemeName = schemeName;
            return this;
        }

        @Override
        public CreateVerifySchemeRequest build() {
            return new CreateVerifySchemeRequest(this);
        } 

    } 

}
