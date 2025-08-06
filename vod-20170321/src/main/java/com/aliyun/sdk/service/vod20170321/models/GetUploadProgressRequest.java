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
 * {@link GetUploadProgressRequest} extends {@link RequestModel}
 *
 * <p>GetUploadProgressRequest</p>
 */
public class GetUploadProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
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
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceModel")
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
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    private String terminalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadAddress")
    private String uploadAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadInfoList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadInfoList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private GetUploadProgressRequest(Builder builder) {
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
        this.source = builder.source;
        this.terminalType = builder.terminalType;
        this.uploadAddress = builder.uploadAddress;
        this.uploadInfoList = builder.uploadInfoList;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadProgressRequest create() {
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    /**
     * @return uploadAddress
     */
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    /**
     * @return uploadInfoList
     */
    public String getUploadInfoList() {
        return this.uploadInfoList;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetUploadProgressRequest, Builder> {
        private String appVersion; 
        private String authInfo; 
        private Long authTimestamp; 
        private String businessType; 
        private String clientId; 
        private String deviceModel; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String source; 
        private String terminalType; 
        private String uploadAddress; 
        private String uploadInfoList; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadProgressRequest request) {
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
            this.source = request.source;
            this.terminalType = request.terminalType;
            this.uploadAddress = request.uploadAddress;
            this.uploadInfoList = request.uploadInfoList;
            this.userId = request.userId;
        } 

        /**
         * AppVersion.
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
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * DeviceModel.
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * TerminalType.
         */
        public Builder terminalType(String terminalType) {
            this.putQueryParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        /**
         * UploadAddress.
         */
        public Builder uploadAddress(String uploadAddress) {
            this.putQueryParameter("UploadAddress", uploadAddress);
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uploadInfoList(String uploadInfoList) {
            this.putQueryParameter("UploadInfoList", uploadInfoList);
            this.uploadInfoList = uploadInfoList;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetUploadProgressRequest build() {
            return new GetUploadProgressRequest(this);
        } 

    } 

}
