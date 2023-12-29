// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFusionAuthTokenRequest} extends {@link RequestModel}
 *
 * <p>GetFusionAuthTokenRequest</p>
 */
public class GetFusionAuthTokenRequest extends Request {
    @Query
    @NameInMap("BundleId")
    private String bundleId;

    @Query
    @NameInMap("DurationSeconds")
    @Validation(required = true)
    private Long durationSeconds;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PackageName")
    private String packageName;

    @Query
    @NameInMap("PackageSign")
    private String packageSign;

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
    @NameInMap("SchemeCode")
    @Validation(required = true)
    private String schemeCode;

    private GetFusionAuthTokenRequest(Builder builder) {
        super(builder);
        this.bundleId = builder.bundleId;
        this.durationSeconds = builder.durationSeconds;
        this.ownerId = builder.ownerId;
        this.packageName = builder.packageName;
        this.packageSign = builder.packageSign;
        this.platform = builder.platform;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schemeCode = builder.schemeCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFusionAuthTokenRequest create() {
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
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
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
     * @return packageSign
     */
    public String getPackageSign() {
        return this.packageSign;
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
     * @return schemeCode
     */
    public String getSchemeCode() {
        return this.schemeCode;
    }

    public static final class Builder extends Request.Builder<GetFusionAuthTokenRequest, Builder> {
        private String bundleId; 
        private Long durationSeconds; 
        private Long ownerId; 
        private String packageName; 
        private String packageSign; 
        private String platform; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String schemeCode; 

        private Builder() {
            super();
        } 

        private Builder(GetFusionAuthTokenRequest request) {
            super(request);
            this.bundleId = request.bundleId;
            this.durationSeconds = request.durationSeconds;
            this.ownerId = request.ownerId;
            this.packageName = request.packageName;
            this.packageSign = request.packageSign;
            this.platform = request.platform;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.schemeCode = request.schemeCode;
        } 

        /**
         * The bundle ID of the app. This parameter is required when Platform is set to iOS.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * The validity period of the token. Unit: seconds. Valid values: 900 to 43200.
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
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
         * The package name of the app. This parameter is required when Platform is set to Android.
         */
        public Builder packageName(String packageName) {
            this.putQueryParameter("PackageName", packageName);
            this.packageName = packageName;
            return this;
        }

        /**
         * The package signature of the app. This parameter is required when Platform is set to Android.
         */
        public Builder packageSign(String packageSign) {
            this.putQueryParameter("PackageSign", packageSign);
            this.packageSign = packageSign;
            return this;
        }

        /**
         * The platform type. Valid values: Android and iOS.
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
         * The service code.
         */
        public Builder schemeCode(String schemeCode) {
            this.putQueryParameter("SchemeCode", schemeCode);
            this.schemeCode = schemeCode;
            return this;
        }

        @Override
        public GetFusionAuthTokenRequest build() {
            return new GetFusionAuthTokenRequest(this);
        } 

    } 

}
