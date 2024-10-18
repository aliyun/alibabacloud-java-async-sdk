// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFusionAuthTokenRequest} extends {@link RequestModel}
 *
 * <p>GetFusionAuthTokenRequest</p>
 */
public class GetFusionAuthTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationSeconds")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long durationSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageName")
    private String packageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageSign")
    private String packageSign;

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
    @com.aliyun.core.annotation.NameInMap("SchemeCode")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The bundle ID of the app. This parameter is required when Platform is set to iOS.</p>
         * 
         * <strong>example:</strong>
         * <p>com.example.test</p>
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
         * <p>The package name of the app. This parameter is required when Platform is set to Android.</p>
         * 
         * <strong>example:</strong>
         * <p>com.example.test</p>
         */
        public Builder packageName(String packageName) {
            this.putQueryParameter("PackageName", packageName);
            this.packageName = packageName;
            return this;
        }

        /**
         * <p>The package signature of the app. This parameter is required when Platform is set to Android.</p>
         * 
         * <strong>example:</strong>
         * <p>47fcc************************278</p>
         */
        public Builder packageSign(String packageSign) {
            this.putQueryParameter("PackageSign", packageSign);
            this.packageSign = packageSign;
            return this;
        }

        /**
         * <p>The platform type. Valid values: Android and iOS.</p>
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
         * <p>The service code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FA1000*************201</p>
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
