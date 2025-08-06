// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssumeSlsRoleV2Request} extends {@link RequestModel}
 *
 * <p>AssumeSlsRoleV2Request</p>
 */
public class AssumeSlsRoleV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String terminalType;

    private AssumeSlsRoleV2Request(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.authInfo = builder.authInfo;
        this.authTimestamp = builder.authTimestamp;
        this.businessType = builder.businessType;
        this.clientId = builder.clientId;
        this.deviceModel = builder.deviceModel;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.terminalType = builder.terminalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeSlsRoleV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return authInfo
     */
    public String getAuthInfo() {
        return this.authInfo;
    }

    /**
     * @return authTimestamp
     */
    public Long getAuthTimestamp() {
        return this.authTimestamp;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return deviceModel
     */
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    public static final class Builder extends Request.Builder<AssumeSlsRoleV2Request, Builder> {
        private String appVersion; 
        private String authInfo; 
        private Long authTimestamp; 
        private String businessType; 
        private String clientId; 
        private String deviceModel; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String terminalType; 

        private Builder() {
            super();
        } 

        private Builder(AssumeSlsRoleV2Request request) {
            super(request);
            this.appVersion = request.appVersion;
            this.authInfo = request.authInfo;
            this.authTimestamp = request.authTimestamp;
            this.businessType = request.businessType;
            this.clientId = request.clientId;
            this.deviceModel = request.deviceModel;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.terminalType = request.terminalType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authInfo(String authInfo) {
            this.putQueryParameter("AuthInfo", authInfo);
            this.authInfo = authInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authTimestamp(Long authTimestamp) {
            this.putQueryParameter("AuthTimestamp", authTimestamp);
            this.authTimestamp = authTimestamp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deviceModel(String deviceModel) {
            this.putQueryParameter("DeviceModel", deviceModel);
            this.deviceModel = deviceModel;
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
         * <p>This parameter is required.</p>
         */
        public Builder terminalType(String terminalType) {
            this.putQueryParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        @Override
        public AssumeSlsRoleV2Request build() {
            return new AssumeSlsRoleV2Request(this);
        } 

    } 

}
