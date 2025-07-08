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
 * {@link QuerySmsSignDetailBySignIdNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsSignDetailBySignIdNewResponseBody</p>
 */
public class QuerySmsSignDetailBySignIdNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("ApplicationScene")
    private ApplicationScene applicationScene;

    @com.aliyun.core.annotation.NameInMap("AuditInfo")
    private String auditInfo;

    @com.aliyun.core.annotation.NameInMap("AuditRemarkInfo")
    private String auditRemarkInfo;

    @com.aliyun.core.annotation.NameInMap("AuditState")
    private String auditState;

    @com.aliyun.core.annotation.NameInMap("Authorization")
    private String authorization;

    @com.aliyun.core.annotation.NameInMap("AuthorizationEffTime")
    private String authorizationEffTime;

    @com.aliyun.core.annotation.NameInMap("AuthorizationLetter")
    private String authorizationLetter;

    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterAuditPass")
    private Boolean authorizationLetterAuditPass;

    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterId")
    private String authorizationLetterId;

    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterName")
    private String authorizationLetterName;

    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterState")
    private String authorizationLetterState;

    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterStatus")
    private String authorizationLetterStatus;

    @com.aliyun.core.annotation.NameInMap("AuthorizationSignScope")
    private String authorizationSignScope;

    @com.aliyun.core.annotation.NameInMap("EffectSceneType")
    private Integer effectSceneType;

    @com.aliyun.core.annotation.NameInMap("EnableAuthorizationLetter")
    private Boolean enableAuthorizationLetter;

    @com.aliyun.core.annotation.NameInMap("ExtendMessage")
    private String extendMessage;

    @com.aliyun.core.annotation.NameInMap("FileIds")
    private java.util.List<Long> fileIds;

    @com.aliyun.core.annotation.NameInMap("FileUrlList")
    private java.util.List<String> fileUrlList;

    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.NameInMap("GmtCreateStr")
    private String gmtCreateStr;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("IsAuthorizationLetterOCRComplete")
    private Boolean isAuthorizationLetterOCRComplete;

    @com.aliyun.core.annotation.NameInMap("IsAuthorizationLetterOCRDiff")
    private Boolean isAuthorizationLetterOCRDiff;

    @com.aliyun.core.annotation.NameInMap("IsSignScopeOCRDiff")
    private Boolean isSignScopeOCRDiff;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("NeedAuthorized")
    private Boolean needAuthorized;

    @com.aliyun.core.annotation.NameInMap("OpenTag")
    private Boolean openTag;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("OrganizationCode")
    private String organizationCode;

    @com.aliyun.core.annotation.NameInMap("OssKeys")
    private java.util.List<String> ossKeys;

    @com.aliyun.core.annotation.NameInMap("ProxyAuthorization")
    private String proxyAuthorization;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneType")
    private Integer sceneType;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private Integer serviceType;

    @com.aliyun.core.annotation.NameInMap("SignCode")
    private String signCode;

    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.NameInMap("SignScopeOCR")
    private String signScopeOCR;

    @com.aliyun.core.annotation.NameInMap("SignUpgrade")
    private String signUpgrade;

    private QuerySmsSignDetailBySignIdNewResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.applicationScene = builder.applicationScene;
        this.auditInfo = builder.auditInfo;
        this.auditRemarkInfo = builder.auditRemarkInfo;
        this.auditState = builder.auditState;
        this.authorization = builder.authorization;
        this.authorizationEffTime = builder.authorizationEffTime;
        this.authorizationLetter = builder.authorizationLetter;
        this.authorizationLetterAuditPass = builder.authorizationLetterAuditPass;
        this.authorizationLetterId = builder.authorizationLetterId;
        this.authorizationLetterName = builder.authorizationLetterName;
        this.authorizationLetterState = builder.authorizationLetterState;
        this.authorizationLetterStatus = builder.authorizationLetterStatus;
        this.authorizationSignScope = builder.authorizationSignScope;
        this.effectSceneType = builder.effectSceneType;
        this.enableAuthorizationLetter = builder.enableAuthorizationLetter;
        this.extendMessage = builder.extendMessage;
        this.fileIds = builder.fileIds;
        this.fileUrlList = builder.fileUrlList;
        this.from = builder.from;
        this.gmtCreateStr = builder.gmtCreateStr;
        this.id = builder.id;
        this.isAuthorizationLetterOCRComplete = builder.isAuthorizationLetterOCRComplete;
        this.isAuthorizationLetterOCRDiff = builder.isAuthorizationLetterOCRDiff;
        this.isSignScopeOCRDiff = builder.isSignScopeOCRDiff;
        this.list = builder.list;
        this.needAuthorized = builder.needAuthorized;
        this.openTag = builder.openTag;
        this.orderId = builder.orderId;
        this.organizationCode = builder.organizationCode;
        this.ossKeys = builder.ossKeys;
        this.proxyAuthorization = builder.proxyAuthorization;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.sceneType = builder.sceneType;
        this.serviceType = builder.serviceType;
        this.signCode = builder.signCode;
        this.signName = builder.signName;
        this.signScopeOCR = builder.signScopeOCR;
        this.signUpgrade = builder.signUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsSignDetailBySignIdNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return applicationScene
     */
    public ApplicationScene getApplicationScene() {
        return this.applicationScene;
    }

    /**
     * @return auditInfo
     */
    public String getAuditInfo() {
        return this.auditInfo;
    }

    /**
     * @return auditRemarkInfo
     */
    public String getAuditRemarkInfo() {
        return this.auditRemarkInfo;
    }

    /**
     * @return auditState
     */
    public String getAuditState() {
        return this.auditState;
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
    public String getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    /**
     * @return authorizationLetterName
     */
    public String getAuthorizationLetterName() {
        return this.authorizationLetterName;
    }

    /**
     * @return authorizationLetterState
     */
    public String getAuthorizationLetterState() {
        return this.authorizationLetterState;
    }

    /**
     * @return authorizationLetterStatus
     */
    public String getAuthorizationLetterStatus() {
        return this.authorizationLetterStatus;
    }

    /**
     * @return authorizationSignScope
     */
    public String getAuthorizationSignScope() {
        return this.authorizationSignScope;
    }

    /**
     * @return effectSceneType
     */
    public Integer getEffectSceneType() {
        return this.effectSceneType;
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
    public java.util.List<Long> getFileIds() {
        return this.fileIds;
    }

    /**
     * @return fileUrlList
     */
    public java.util.List<String> getFileUrlList() {
        return this.fileUrlList;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return gmtCreateStr
     */
    public String getGmtCreateStr() {
        return this.gmtCreateStr;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return needAuthorized
     */
    public Boolean getNeedAuthorized() {
        return this.needAuthorized;
    }

    /**
     * @return openTag
     */
    public Boolean getOpenTag() {
        return this.openTag;
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
    public java.util.List<String> getOssKeys() {
        return this.ossKeys;
    }

    /**
     * @return proxyAuthorization
     */
    public String getProxyAuthorization() {
        return this.proxyAuthorization;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public String getSignUpgrade() {
        return this.signUpgrade;
    }

    public static final class Builder {
        private String accessToken; 
        private ApplicationScene applicationScene; 
        private String auditInfo; 
        private String auditRemarkInfo; 
        private String auditState; 
        private String authorization; 
        private String authorizationEffTime; 
        private String authorizationLetter; 
        private Boolean authorizationLetterAuditPass; 
        private String authorizationLetterId; 
        private String authorizationLetterName; 
        private String authorizationLetterState; 
        private String authorizationLetterStatus; 
        private String authorizationSignScope; 
        private Integer effectSceneType; 
        private Boolean enableAuthorizationLetter; 
        private String extendMessage; 
        private java.util.List<Long> fileIds; 
        private java.util.List<String> fileUrlList; 
        private String from; 
        private String gmtCreateStr; 
        private String id; 
        private Boolean isAuthorizationLetterOCRComplete; 
        private Boolean isAuthorizationLetterOCRDiff; 
        private Boolean isSignScopeOCRDiff; 
        private java.util.List<List> list; 
        private Boolean needAuthorized; 
        private Boolean openTag; 
        private String orderId; 
        private String organizationCode; 
        private java.util.List<String> ossKeys; 
        private String proxyAuthorization; 
        private String remark; 
        private String requestId; 
        private Integer sceneType; 
        private Integer serviceType; 
        private String signCode; 
        private String signName; 
        private String signScopeOCR; 
        private String signUpgrade; 

        private Builder() {
        } 

        private Builder(QuerySmsSignDetailBySignIdNewResponseBody model) {
            this.accessToken = model.accessToken;
            this.applicationScene = model.applicationScene;
            this.auditInfo = model.auditInfo;
            this.auditRemarkInfo = model.auditRemarkInfo;
            this.auditState = model.auditState;
            this.authorization = model.authorization;
            this.authorizationEffTime = model.authorizationEffTime;
            this.authorizationLetter = model.authorizationLetter;
            this.authorizationLetterAuditPass = model.authorizationLetterAuditPass;
            this.authorizationLetterId = model.authorizationLetterId;
            this.authorizationLetterName = model.authorizationLetterName;
            this.authorizationLetterState = model.authorizationLetterState;
            this.authorizationLetterStatus = model.authorizationLetterStatus;
            this.authorizationSignScope = model.authorizationSignScope;
            this.effectSceneType = model.effectSceneType;
            this.enableAuthorizationLetter = model.enableAuthorizationLetter;
            this.extendMessage = model.extendMessage;
            this.fileIds = model.fileIds;
            this.fileUrlList = model.fileUrlList;
            this.from = model.from;
            this.gmtCreateStr = model.gmtCreateStr;
            this.id = model.id;
            this.isAuthorizationLetterOCRComplete = model.isAuthorizationLetterOCRComplete;
            this.isAuthorizationLetterOCRDiff = model.isAuthorizationLetterOCRDiff;
            this.isSignScopeOCRDiff = model.isSignScopeOCRDiff;
            this.list = model.list;
            this.needAuthorized = model.needAuthorized;
            this.openTag = model.openTag;
            this.orderId = model.orderId;
            this.organizationCode = model.organizationCode;
            this.ossKeys = model.ossKeys;
            this.proxyAuthorization = model.proxyAuthorization;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.sceneType = model.sceneType;
            this.serviceType = model.serviceType;
            this.signCode = model.signCode;
            this.signName = model.signName;
            this.signScopeOCR = model.signScopeOCR;
            this.signUpgrade = model.signUpgrade;
        } 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * ApplicationScene.
         */
        public Builder applicationScene(ApplicationScene applicationScene) {
            this.applicationScene = applicationScene;
            return this;
        }

        /**
         * AuditInfo.
         */
        public Builder auditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * AuditRemarkInfo.
         */
        public Builder auditRemarkInfo(String auditRemarkInfo) {
            this.auditRemarkInfo = auditRemarkInfo;
            return this;
        }

        /**
         * AuditState.
         */
        public Builder auditState(String auditState) {
            this.auditState = auditState;
            return this;
        }

        /**
         * Authorization.
         */
        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * AuthorizationEffTime.
         */
        public Builder authorizationEffTime(String authorizationEffTime) {
            this.authorizationEffTime = authorizationEffTime;
            return this;
        }

        /**
         * AuthorizationLetter.
         */
        public Builder authorizationLetter(String authorizationLetter) {
            this.authorizationLetter = authorizationLetter;
            return this;
        }

        /**
         * AuthorizationLetterAuditPass.
         */
        public Builder authorizationLetterAuditPass(Boolean authorizationLetterAuditPass) {
            this.authorizationLetterAuditPass = authorizationLetterAuditPass;
            return this;
        }

        /**
         * AuthorizationLetterId.
         */
        public Builder authorizationLetterId(String authorizationLetterId) {
            this.authorizationLetterId = authorizationLetterId;
            return this;
        }

        /**
         * AuthorizationLetterName.
         */
        public Builder authorizationLetterName(String authorizationLetterName) {
            this.authorizationLetterName = authorizationLetterName;
            return this;
        }

        /**
         * AuthorizationLetterState.
         */
        public Builder authorizationLetterState(String authorizationLetterState) {
            this.authorizationLetterState = authorizationLetterState;
            return this;
        }

        /**
         * AuthorizationLetterStatus.
         */
        public Builder authorizationLetterStatus(String authorizationLetterStatus) {
            this.authorizationLetterStatus = authorizationLetterStatus;
            return this;
        }

        /**
         * AuthorizationSignScope.
         */
        public Builder authorizationSignScope(String authorizationSignScope) {
            this.authorizationSignScope = authorizationSignScope;
            return this;
        }

        /**
         * EffectSceneType.
         */
        public Builder effectSceneType(Integer effectSceneType) {
            this.effectSceneType = effectSceneType;
            return this;
        }

        /**
         * EnableAuthorizationLetter.
         */
        public Builder enableAuthorizationLetter(Boolean enableAuthorizationLetter) {
            this.enableAuthorizationLetter = enableAuthorizationLetter;
            return this;
        }

        /**
         * ExtendMessage.
         */
        public Builder extendMessage(String extendMessage) {
            this.extendMessage = extendMessage;
            return this;
        }

        /**
         * FileIds.
         */
        public Builder fileIds(java.util.List<Long> fileIds) {
            this.fileIds = fileIds;
            return this;
        }

        /**
         * FileUrlList.
         */
        public Builder fileUrlList(java.util.List<String> fileUrlList) {
            this.fileUrlList = fileUrlList;
            return this;
        }

        /**
         * From.
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * GmtCreateStr.
         */
        public Builder gmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * IsAuthorizationLetterOCRComplete.
         */
        public Builder isAuthorizationLetterOCRComplete(Boolean isAuthorizationLetterOCRComplete) {
            this.isAuthorizationLetterOCRComplete = isAuthorizationLetterOCRComplete;
            return this;
        }

        /**
         * IsAuthorizationLetterOCRDiff.
         */
        public Builder isAuthorizationLetterOCRDiff(Boolean isAuthorizationLetterOCRDiff) {
            this.isAuthorizationLetterOCRDiff = isAuthorizationLetterOCRDiff;
            return this;
        }

        /**
         * IsSignScopeOCRDiff.
         */
        public Builder isSignScopeOCRDiff(Boolean isSignScopeOCRDiff) {
            this.isSignScopeOCRDiff = isSignScopeOCRDiff;
            return this;
        }

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * NeedAuthorized.
         */
        public Builder needAuthorized(Boolean needAuthorized) {
            this.needAuthorized = needAuthorized;
            return this;
        }

        /**
         * OpenTag.
         */
        public Builder openTag(Boolean openTag) {
            this.openTag = openTag;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * OrganizationCode.
         */
        public Builder organizationCode(String organizationCode) {
            this.organizationCode = organizationCode;
            return this;
        }

        /**
         * OssKeys.
         */
        public Builder ossKeys(java.util.List<String> ossKeys) {
            this.ossKeys = ossKeys;
            return this;
        }

        /**
         * ProxyAuthorization.
         */
        public Builder proxyAuthorization(String proxyAuthorization) {
            this.proxyAuthorization = proxyAuthorization;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SceneType.
         */
        public Builder sceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * SignCode.
         */
        public Builder signCode(String signCode) {
            this.signCode = signCode;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.signName = signName;
            return this;
        }

        /**
         * SignScopeOCR.
         */
        public Builder signScopeOCR(String signScopeOCR) {
            this.signScopeOCR = signScopeOCR;
            return this;
        }

        /**
         * SignUpgrade.
         */
        public Builder signUpgrade(String signUpgrade) {
            this.signUpgrade = signUpgrade;
            return this;
        }

        public QuerySmsSignDetailBySignIdNewResponseBody build() {
            return new QuerySmsSignDetailBySignIdNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsSignDetailBySignIdNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignDetailBySignIdNewResponseBody</p>
     */
    public static class ApplicationScene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ApplicationScene(Builder builder) {
            this.content = builder.content;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationScene create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String content; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(ApplicationScene model) {
                this.content = model.content;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ApplicationScene build() {
                return new ApplicationScene(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignDetailBySignIdNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignDetailBySignIdNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditState")
        private String auditState;

        @com.aliyun.core.annotation.NameInMap("SceneType")
        private Integer sceneType;

        private List(Builder builder) {
            this.auditState = builder.auditState;
            this.sceneType = builder.sceneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return auditState
         */
        public String getAuditState() {
            return this.auditState;
        }

        /**
         * @return sceneType
         */
        public Integer getSceneType() {
            return this.sceneType;
        }

        public static final class Builder {
            private String auditState; 
            private Integer sceneType; 

            private Builder() {
            } 

            private Builder(List model) {
                this.auditState = model.auditState;
                this.sceneType = model.sceneType;
            } 

            /**
             * AuditState.
             */
            public Builder auditState(String auditState) {
                this.auditState = auditState;
                return this;
            }

            /**
             * SceneType.
             */
            public Builder sceneType(Integer sceneType) {
                this.sceneType = sceneType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
