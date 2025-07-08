// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CreateSmsSignNewRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsSignNewRequest</p>
 */
public class CreateSmsSignNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationSceneId")
    private Long applicationSceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplySource")
    private String applySource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Authorization")
    private String authorization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationEffTime")
    private String authorizationEffTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationLetter")
    private String authorizationLetter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterAuditPass")
    private Boolean authorizationLetterAuditPass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterId")
    private Long authorizationLetterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterName")
    private String authorizationLetterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationSignScope")
    private String authorizationSignScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateSignGray")
    private Boolean createSignGray;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAuthorizationLetter")
    private Boolean enableAuthorizationLetter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendMessage")
    private String extendMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIds")
    private String fileIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAuthorizationLetterOCRComplete")
    private Boolean isAuthorizationLetterOCRComplete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAuthorizationLetterOCRDiff")
    private Boolean isAuthorizationLetterOCRDiff;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSignScopeOCRDiff")
    private Boolean isSignScopeOCRDiff;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MoreData")
    private java.util.List<String> moreData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationCode")
    private String organizationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKeys")
    private String ossKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyAuthorization")
    private String proxyAuthorization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    private Long qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationType")
    private Long qualificationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationVersion")
    private Long qualificationVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private Integer sceneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private Integer serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignCode")
    private String signCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignId")
    private String signId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignScopeOCR")
    private String signScopeOCR;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignUpgrade")
    private Boolean signUpgrade;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdParty")
    private Boolean thirdParty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserViewFileName")
    private String userViewFileName;

    private CreateSmsSignNewRequest(Builder builder) {
        super(builder);
        this.applicationSceneId = builder.applicationSceneId;
        this.applySource = builder.applySource;
        this.authorization = builder.authorization;
        this.authorizationEffTime = builder.authorizationEffTime;
        this.authorizationLetter = builder.authorizationLetter;
        this.authorizationLetterAuditPass = builder.authorizationLetterAuditPass;
        this.authorizationLetterId = builder.authorizationLetterId;
        this.authorizationLetterName = builder.authorizationLetterName;
        this.authorizationSignScope = builder.authorizationSignScope;
        this.createSignGray = builder.createSignGray;
        this.enableAuthorizationLetter = builder.enableAuthorizationLetter;
        this.extendMessage = builder.extendMessage;
        this.fileIds = builder.fileIds;
        this.isAuthorizationLetterOCRComplete = builder.isAuthorizationLetterOCRComplete;
        this.isAuthorizationLetterOCRDiff = builder.isAuthorizationLetterOCRDiff;
        this.isSignScopeOCRDiff = builder.isSignScopeOCRDiff;
        this.moreData = builder.moreData;
        this.orderId = builder.orderId;
        this.organizationCode = builder.organizationCode;
        this.ossKeys = builder.ossKeys;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.proxyAuthorization = builder.proxyAuthorization;
        this.qualificationId = builder.qualificationId;
        this.qualificationType = builder.qualificationType;
        this.qualificationVersion = builder.qualificationVersion;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sceneType = builder.sceneType;
        this.serviceType = builder.serviceType;
        this.signCode = builder.signCode;
        this.signId = builder.signId;
        this.signName = builder.signName;
        this.signScopeOCR = builder.signScopeOCR;
        this.signUpgrade = builder.signUpgrade;
        this.thirdParty = builder.thirdParty;
        this.userViewFileName = builder.userViewFileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsSignNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationSceneId
     */
    public Long getApplicationSceneId() {
        return this.applicationSceneId;
    }

    /**
     * @return applySource
     */
    public String getApplySource() {
        return this.applySource;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return authorizationEffTime
     */
    public String getAuthorizationEffTime() {
        return this.authorizationEffTime;
    }

    /**
     * @return authorizationLetter
     */
    public String getAuthorizationLetter() {
        return this.authorizationLetter;
    }

    /**
     * @return authorizationLetterAuditPass
     */
    public Boolean getAuthorizationLetterAuditPass() {
        return this.authorizationLetterAuditPass;
    }

    /**
     * @return authorizationLetterId
     */
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    /**
     * @return authorizationLetterName
     */
    public String getAuthorizationLetterName() {
        return this.authorizationLetterName;
    }

    /**
     * @return authorizationSignScope
     */
    public String getAuthorizationSignScope() {
        return this.authorizationSignScope;
    }

    /**
     * @return createSignGray
     */
    public Boolean getCreateSignGray() {
        return this.createSignGray;
    }

    /**
     * @return enableAuthorizationLetter
     */
    public Boolean getEnableAuthorizationLetter() {
        return this.enableAuthorizationLetter;
    }

    /**
     * @return extendMessage
     */
    public String getExtendMessage() {
        return this.extendMessage;
    }

    /**
     * @return fileIds
     */
    public String getFileIds() {
        return this.fileIds;
    }

    /**
     * @return isAuthorizationLetterOCRComplete
     */
    public Boolean getIsAuthorizationLetterOCRComplete() {
        return this.isAuthorizationLetterOCRComplete;
    }

    /**
     * @return isAuthorizationLetterOCRDiff
     */
    public Boolean getIsAuthorizationLetterOCRDiff() {
        return this.isAuthorizationLetterOCRDiff;
    }

    /**
     * @return isSignScopeOCRDiff
     */
    public Boolean getIsSignScopeOCRDiff() {
        return this.isSignScopeOCRDiff;
    }

    /**
     * @return moreData
     */
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return organizationCode
     */
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    /**
     * @return ossKeys
     */
    public String getOssKeys() {
        return this.ossKeys;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return proxyAuthorization
     */
    public String getProxyAuthorization() {
        return this.proxyAuthorization;
    }

    /**
     * @return qualificationId
     */
    public Long getQualificationId() {
        return this.qualificationId;
    }

    /**
     * @return qualificationType
     */
    public Long getQualificationType() {
        return this.qualificationType;
    }

    /**
     * @return qualificationVersion
     */
    public Long getQualificationVersion() {
        return this.qualificationVersion;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
    public Integer getSceneType() {
        return this.sceneType;
    }

    /**
     * @return serviceType
     */
    public Integer getServiceType() {
        return this.serviceType;
    }

    /**
     * @return signCode
     */
    public String getSignCode() {
        return this.signCode;
    }

    /**
     * @return signId
     */
    public String getSignId() {
        return this.signId;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signScopeOCR
     */
    public String getSignScopeOCR() {
        return this.signScopeOCR;
    }

    /**
     * @return signUpgrade
     */
    public Boolean getSignUpgrade() {
        return this.signUpgrade;
    }

    /**
     * @return thirdParty
     */
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    /**
     * @return userViewFileName
     */
    public String getUserViewFileName() {
        return this.userViewFileName;
    }

    public static final class Builder extends Request.Builder<CreateSmsSignNewRequest, Builder> {
        private Long applicationSceneId; 
        private String applySource; 
        private String authorization; 
        private String authorizationEffTime; 
        private String authorizationLetter; 
        private Boolean authorizationLetterAuditPass; 
        private Long authorizationLetterId; 
        private String authorizationLetterName; 
        private String authorizationSignScope; 
        private Boolean createSignGray; 
        private Boolean enableAuthorizationLetter; 
        private String extendMessage; 
        private String fileIds; 
        private Boolean isAuthorizationLetterOCRComplete; 
        private Boolean isAuthorizationLetterOCRDiff; 
        private Boolean isSignScopeOCRDiff; 
        private java.util.List<String> moreData; 
        private String orderId; 
        private String organizationCode; 
        private String ossKeys; 
        private Long ownerId; 
        private String prodCode; 
        private String proxyAuthorization; 
        private Long qualificationId; 
        private Long qualificationType; 
        private Long qualificationVersion; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer sceneType; 
        private Integer serviceType; 
        private String signCode; 
        private String signId; 
        private String signName; 
        private String signScopeOCR; 
        private Boolean signUpgrade; 
        private Boolean thirdParty; 
        private String userViewFileName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsSignNewRequest request) {
            super(request);
            this.applicationSceneId = request.applicationSceneId;
            this.applySource = request.applySource;
            this.authorization = request.authorization;
            this.authorizationEffTime = request.authorizationEffTime;
            this.authorizationLetter = request.authorizationLetter;
            this.authorizationLetterAuditPass = request.authorizationLetterAuditPass;
            this.authorizationLetterId = request.authorizationLetterId;
            this.authorizationLetterName = request.authorizationLetterName;
            this.authorizationSignScope = request.authorizationSignScope;
            this.createSignGray = request.createSignGray;
            this.enableAuthorizationLetter = request.enableAuthorizationLetter;
            this.extendMessage = request.extendMessage;
            this.fileIds = request.fileIds;
            this.isAuthorizationLetterOCRComplete = request.isAuthorizationLetterOCRComplete;
            this.isAuthorizationLetterOCRDiff = request.isAuthorizationLetterOCRDiff;
            this.isSignScopeOCRDiff = request.isSignScopeOCRDiff;
            this.moreData = request.moreData;
            this.orderId = request.orderId;
            this.organizationCode = request.organizationCode;
            this.ossKeys = request.ossKeys;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.proxyAuthorization = request.proxyAuthorization;
            this.qualificationId = request.qualificationId;
            this.qualificationType = request.qualificationType;
            this.qualificationVersion = request.qualificationVersion;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sceneType = request.sceneType;
            this.serviceType = request.serviceType;
            this.signCode = request.signCode;
            this.signId = request.signId;
            this.signName = request.signName;
            this.signScopeOCR = request.signScopeOCR;
            this.signUpgrade = request.signUpgrade;
            this.thirdParty = request.thirdParty;
            this.userViewFileName = request.userViewFileName;
        } 

        /**
         * ApplicationSceneId.
         */
        public Builder applicationSceneId(Long applicationSceneId) {
            this.putQueryParameter("ApplicationSceneId", applicationSceneId);
            this.applicationSceneId = applicationSceneId;
            return this;
        }

        /**
         * ApplySource.
         */
        public Builder applySource(String applySource) {
            this.putQueryParameter("ApplySource", applySource);
            this.applySource = applySource;
            return this;
        }

        /**
         * Authorization.
         */
        public Builder authorization(String authorization) {
            this.putQueryParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * AuthorizationEffTime.
         */
        public Builder authorizationEffTime(String authorizationEffTime) {
            this.putQueryParameter("AuthorizationEffTime", authorizationEffTime);
            this.authorizationEffTime = authorizationEffTime;
            return this;
        }

        /**
         * AuthorizationLetter.
         */
        public Builder authorizationLetter(String authorizationLetter) {
            this.putQueryParameter("AuthorizationLetter", authorizationLetter);
            this.authorizationLetter = authorizationLetter;
            return this;
        }

        /**
         * AuthorizationLetterAuditPass.
         */
        public Builder authorizationLetterAuditPass(Boolean authorizationLetterAuditPass) {
            this.putQueryParameter("AuthorizationLetterAuditPass", authorizationLetterAuditPass);
            this.authorizationLetterAuditPass = authorizationLetterAuditPass;
            return this;
        }

        /**
         * AuthorizationLetterId.
         */
        public Builder authorizationLetterId(Long authorizationLetterId) {
            this.putQueryParameter("AuthorizationLetterId", authorizationLetterId);
            this.authorizationLetterId = authorizationLetterId;
            return this;
        }

        /**
         * AuthorizationLetterName.
         */
        public Builder authorizationLetterName(String authorizationLetterName) {
            this.putQueryParameter("AuthorizationLetterName", authorizationLetterName);
            this.authorizationLetterName = authorizationLetterName;
            return this;
        }

        /**
         * AuthorizationSignScope.
         */
        public Builder authorizationSignScope(String authorizationSignScope) {
            this.putQueryParameter("AuthorizationSignScope", authorizationSignScope);
            this.authorizationSignScope = authorizationSignScope;
            return this;
        }

        /**
         * CreateSignGray.
         */
        public Builder createSignGray(Boolean createSignGray) {
            this.putQueryParameter("CreateSignGray", createSignGray);
            this.createSignGray = createSignGray;
            return this;
        }

        /**
         * EnableAuthorizationLetter.
         */
        public Builder enableAuthorizationLetter(Boolean enableAuthorizationLetter) {
            this.putQueryParameter("EnableAuthorizationLetter", enableAuthorizationLetter);
            this.enableAuthorizationLetter = enableAuthorizationLetter;
            return this;
        }

        /**
         * ExtendMessage.
         */
        public Builder extendMessage(String extendMessage) {
            this.putQueryParameter("ExtendMessage", extendMessage);
            this.extendMessage = extendMessage;
            return this;
        }

        /**
         * FileIds.
         */
        public Builder fileIds(String fileIds) {
            this.putQueryParameter("FileIds", fileIds);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * IsAuthorizationLetterOCRComplete.
         */
        public Builder isAuthorizationLetterOCRComplete(Boolean isAuthorizationLetterOCRComplete) {
            this.putQueryParameter("IsAuthorizationLetterOCRComplete", isAuthorizationLetterOCRComplete);
            this.isAuthorizationLetterOCRComplete = isAuthorizationLetterOCRComplete;
            return this;
        }

        /**
         * IsAuthorizationLetterOCRDiff.
         */
        public Builder isAuthorizationLetterOCRDiff(Boolean isAuthorizationLetterOCRDiff) {
            this.putQueryParameter("IsAuthorizationLetterOCRDiff", isAuthorizationLetterOCRDiff);
            this.isAuthorizationLetterOCRDiff = isAuthorizationLetterOCRDiff;
            return this;
        }

        /**
         * IsSignScopeOCRDiff.
         */
        public Builder isSignScopeOCRDiff(Boolean isSignScopeOCRDiff) {
            this.putQueryParameter("IsSignScopeOCRDiff", isSignScopeOCRDiff);
            this.isSignScopeOCRDiff = isSignScopeOCRDiff;
            return this;
        }

        /**
         * MoreData.
         */
        public Builder moreData(java.util.List<String> moreData) {
            String moreDataShrink = shrink(moreData, "MoreData", "json");
            this.putQueryParameter("MoreData", moreDataShrink);
            this.moreData = moreData;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * OrganizationCode.
         */
        public Builder organizationCode(String organizationCode) {
            this.putQueryParameter("OrganizationCode", organizationCode);
            this.organizationCode = organizationCode;
            return this;
        }

        /**
         * OssKeys.
         */
        public Builder ossKeys(String ossKeys) {
            this.putQueryParameter("OssKeys", ossKeys);
            this.ossKeys = ossKeys;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * ProxyAuthorization.
         */
        public Builder proxyAuthorization(String proxyAuthorization) {
            this.putQueryParameter("ProxyAuthorization", proxyAuthorization);
            this.proxyAuthorization = proxyAuthorization;
            return this;
        }

        /**
         * QualificationId.
         */
        public Builder qualificationId(Long qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
            return this;
        }

        /**
         * QualificationType.
         */
        public Builder qualificationType(Long qualificationType) {
            this.putQueryParameter("QualificationType", qualificationType);
            this.qualificationType = qualificationType;
            return this;
        }

        /**
         * QualificationVersion.
         */
        public Builder qualificationVersion(Long qualificationVersion) {
            this.putQueryParameter("QualificationVersion", qualificationVersion);
            this.qualificationVersion = qualificationVersion;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
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
        public Builder sceneType(Integer sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(Integer serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * SignCode.
         */
        public Builder signCode(String signCode) {
            this.putQueryParameter("SignCode", signCode);
            this.signCode = signCode;
            return this;
        }

        /**
         * SignId.
         */
        public Builder signId(String signId) {
            this.putQueryParameter("SignId", signId);
            this.signId = signId;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * SignScopeOCR.
         */
        public Builder signScopeOCR(String signScopeOCR) {
            this.putQueryParameter("SignScopeOCR", signScopeOCR);
            this.signScopeOCR = signScopeOCR;
            return this;
        }

        /**
         * SignUpgrade.
         */
        public Builder signUpgrade(Boolean signUpgrade) {
            this.putQueryParameter("SignUpgrade", signUpgrade);
            this.signUpgrade = signUpgrade;
            return this;
        }

        /**
         * ThirdParty.
         */
        public Builder thirdParty(Boolean thirdParty) {
            this.putQueryParameter("ThirdParty", thirdParty);
            this.thirdParty = thirdParty;
            return this;
        }

        /**
         * UserViewFileName.
         */
        public Builder userViewFileName(String userViewFileName) {
            this.putQueryParameter("UserViewFileName", userViewFileName);
            this.userViewFileName = userViewFileName;
            return this;
        }

        @Override
        public CreateSmsSignNewRequest build() {
            return new CreateSmsSignNewRequest(this);
        } 

    } 

}
