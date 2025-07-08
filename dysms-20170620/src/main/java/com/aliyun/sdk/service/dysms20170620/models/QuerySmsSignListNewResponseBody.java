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
 * {@link QuerySmsSignListNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsSignListNewResponseBody</p>
 */
public class QuerySmsSignListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmsSign")
    private SmsSign smsSign;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QuerySmsSignListNewResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.smsSign = builder.smsSign;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsSignListNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smsSign
     */
    public SmsSign getSmsSign() {
        return this.smsSign;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private SmsSign smsSign; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QuerySmsSignListNewResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.smsSign = model.smsSign;
            this.total = model.total;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * SmsSign.
         */
        public Builder smsSign(SmsSign smsSign) {
            this.smsSign = smsSign;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QuerySmsSignListNewResponseBody build() {
            return new QuerySmsSignListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsSignListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignListNewResponseBody</p>
     */
    public static class FileIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private java.util.List<Long> fileId;

        private FileIds(Builder builder) {
            this.fileId = builder.fileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileIds create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public java.util.List<Long> getFileId() {
            return this.fileId;
        }

        public static final class Builder {
            private java.util.List<Long> fileId; 

            private Builder() {
            } 

            private Builder(FileIds model) {
                this.fileId = model.fileId;
            } 

            /**
             * FileId.
             */
            public Builder fileId(java.util.List<Long> fileId) {
                this.fileId = fileId;
                return this;
            }

            public FileIds build() {
                return new FileIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignListNewResponseBody</p>
     */
    public static class FileUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private java.util.List<String> fileUrl;

        private FileUrlList(Builder builder) {
            this.fileUrl = builder.fileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileUrlList create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public java.util.List<String> getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private java.util.List<String> fileUrl; 

            private Builder() {
            } 

            private Builder(FileUrlList model) {
                this.fileUrl = model.fileUrl;
            } 

            /**
             * FileUrl.
             */
            public Builder fileUrl(java.util.List<String> fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public FileUrlList build() {
                return new FileUrlList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignListNewResponseBody</p>
     */
    public static class SignSceneDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditState")
        private String auditState;

        @com.aliyun.core.annotation.NameInMap("SceneType")
        private Integer sceneType;

        private SignSceneDetail(Builder builder) {
            this.auditState = builder.auditState;
            this.sceneType = builder.sceneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignSceneDetail create() {
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

            private Builder(SignSceneDetail model) {
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

            public SignSceneDetail build() {
                return new SignSceneDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignListNewResponseBody</p>
     */
    public static class SignSceneDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SignSceneDetail")
        private java.util.List<SignSceneDetail> signSceneDetail;

        private SignSceneDetailList(Builder builder) {
            this.signSceneDetail = builder.signSceneDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignSceneDetailList create() {
            return builder().build();
        }

        /**
         * @return signSceneDetail
         */
        public java.util.List<SignSceneDetail> getSignSceneDetail() {
            return this.signSceneDetail;
        }

        public static final class Builder {
            private java.util.List<SignSceneDetail> signSceneDetail; 

            private Builder() {
            } 

            private Builder(SignSceneDetailList model) {
                this.signSceneDetail = model.signSceneDetail;
            } 

            /**
             * SignSceneDetail.
             */
            public Builder signSceneDetail(java.util.List<SignSceneDetail> signSceneDetail) {
                this.signSceneDetail = signSceneDetail;
                return this;
            }

            public SignSceneDetailList build() {
                return new SignSceneDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignListNewResponseBody</p>
     */
    public static class SmsSignSmsSign extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregatedRegisterStatus")
        private Integer aggregatedRegisterStatus;

        @com.aliyun.core.annotation.NameInMap("ApplySource")
        private String applySource;

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
        private Long authorizationLetterId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationLetterName")
        private String authorizationLetterName;

        @com.aliyun.core.annotation.NameInMap("AuthorizationLetterStatus")
        private String authorizationLetterStatus;

        @com.aliyun.core.annotation.NameInMap("AuthorizationSignScope")
        private String authorizationSignScope;

        @com.aliyun.core.annotation.NameInMap("CanRegister")
        private Boolean canRegister;

        @com.aliyun.core.annotation.NameInMap("EnableAuthorizationLetter")
        private Boolean enableAuthorizationLetter;

        @com.aliyun.core.annotation.NameInMap("ExtendMessage")
        private String extendMessage;

        @com.aliyun.core.annotation.NameInMap("FileIds")
        private FileIds fileIds;

        @com.aliyun.core.annotation.NameInMap("FileUrlList")
        private FileUrlList fileUrlList;

        @com.aliyun.core.annotation.NameInMap("GmtCreateStr")
        private String gmtCreateStr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsAuthorizationLetterOCRComplete")
        private Boolean isAuthorizationLetterOCRComplete;

        @com.aliyun.core.annotation.NameInMap("IsAuthorizationLetterOCRDiff")
        private Boolean isAuthorizationLetterOCRDiff;

        @com.aliyun.core.annotation.NameInMap("IsDefaultSign")
        private Boolean isDefaultSign;

        @com.aliyun.core.annotation.NameInMap("IsSignScopeOCRDiff")
        private Boolean isSignScopeOCRDiff;

        @com.aliyun.core.annotation.NameInMap("MobileRegisterStatus")
        private Integer mobileRegisterStatus;

        @com.aliyun.core.annotation.NameInMap("OperateDateStr")
        private String operateDateStr;

        @com.aliyun.core.annotation.NameInMap("OrderCount")
        private Long orderCount;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrganizationCode")
        private String organizationCode;

        @com.aliyun.core.annotation.NameInMap("ProxyAuthorization")
        private String proxyAuthorization;

        @com.aliyun.core.annotation.NameInMap("QualificationId")
        private Long qualificationId;

        @com.aliyun.core.annotation.NameInMap("QualificationName")
        private String qualificationName;

        @com.aliyun.core.annotation.NameInMap("QualificationState")
        private String qualificationState;

        @com.aliyun.core.annotation.NameInMap("QualificationVersion")
        private Long qualificationVersion;

        @com.aliyun.core.annotation.NameInMap("QualificationWorkOrderId")
        private Long qualificationWorkOrderId;

        @com.aliyun.core.annotation.NameInMap("RegisterResult")
        private Integer registerResult;

        @com.aliyun.core.annotation.NameInMap("RegisterTime")
        private Long registerTime;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResultReason")
        private String resultReason;

        @com.aliyun.core.annotation.NameInMap("SceneType")
        private Integer sceneType;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private Integer serviceType;

        @com.aliyun.core.annotation.NameInMap("SignCode")
        private String signCode;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("SignSceneDetailList")
        private SignSceneDetailList signSceneDetailList;

        @com.aliyun.core.annotation.NameInMap("SignScopeOCR")
        private String signScopeOCR;

        @com.aliyun.core.annotation.NameInMap("SignSource")
        private String signSource;

        @com.aliyun.core.annotation.NameInMap("SignType")
        private Integer signType;

        @com.aliyun.core.annotation.NameInMap("TelecomRegisterStatus")
        private Integer telecomRegisterStatus;

        @com.aliyun.core.annotation.NameInMap("UnicomRegisterStatus")
        private Integer unicomRegisterStatus;

        private SmsSignSmsSign(Builder builder) {
            this.aggregatedRegisterStatus = builder.aggregatedRegisterStatus;
            this.applySource = builder.applySource;
            this.auditInfo = builder.auditInfo;
            this.auditRemarkInfo = builder.auditRemarkInfo;
            this.auditState = builder.auditState;
            this.authorization = builder.authorization;
            this.authorizationEffTime = builder.authorizationEffTime;
            this.authorizationLetter = builder.authorizationLetter;
            this.authorizationLetterAuditPass = builder.authorizationLetterAuditPass;
            this.authorizationLetterId = builder.authorizationLetterId;
            this.authorizationLetterName = builder.authorizationLetterName;
            this.authorizationLetterStatus = builder.authorizationLetterStatus;
            this.authorizationSignScope = builder.authorizationSignScope;
            this.canRegister = builder.canRegister;
            this.enableAuthorizationLetter = builder.enableAuthorizationLetter;
            this.extendMessage = builder.extendMessage;
            this.fileIds = builder.fileIds;
            this.fileUrlList = builder.fileUrlList;
            this.gmtCreateStr = builder.gmtCreateStr;
            this.id = builder.id;
            this.isAuthorizationLetterOCRComplete = builder.isAuthorizationLetterOCRComplete;
            this.isAuthorizationLetterOCRDiff = builder.isAuthorizationLetterOCRDiff;
            this.isDefaultSign = builder.isDefaultSign;
            this.isSignScopeOCRDiff = builder.isSignScopeOCRDiff;
            this.mobileRegisterStatus = builder.mobileRegisterStatus;
            this.operateDateStr = builder.operateDateStr;
            this.orderCount = builder.orderCount;
            this.orderId = builder.orderId;
            this.organizationCode = builder.organizationCode;
            this.proxyAuthorization = builder.proxyAuthorization;
            this.qualificationId = builder.qualificationId;
            this.qualificationName = builder.qualificationName;
            this.qualificationState = builder.qualificationState;
            this.qualificationVersion = builder.qualificationVersion;
            this.qualificationWorkOrderId = builder.qualificationWorkOrderId;
            this.registerResult = builder.registerResult;
            this.registerTime = builder.registerTime;
            this.remark = builder.remark;
            this.resultReason = builder.resultReason;
            this.sceneType = builder.sceneType;
            this.serviceType = builder.serviceType;
            this.signCode = builder.signCode;
            this.signName = builder.signName;
            this.signSceneDetailList = builder.signSceneDetailList;
            this.signScopeOCR = builder.signScopeOCR;
            this.signSource = builder.signSource;
            this.signType = builder.signType;
            this.telecomRegisterStatus = builder.telecomRegisterStatus;
            this.unicomRegisterStatus = builder.unicomRegisterStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsSignSmsSign create() {
            return builder().build();
        }

        /**
         * @return aggregatedRegisterStatus
         */
        public Integer getAggregatedRegisterStatus() {
            return this.aggregatedRegisterStatus;
        }

        /**
         * @return applySource
         */
        public String getApplySource() {
            return this.applySource;
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
         * @return canRegister
         */
        public Boolean getCanRegister() {
            return this.canRegister;
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
        public FileIds getFileIds() {
            return this.fileIds;
        }

        /**
         * @return fileUrlList
         */
        public FileUrlList getFileUrlList() {
            return this.fileUrlList;
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
         * @return isDefaultSign
         */
        public Boolean getIsDefaultSign() {
            return this.isDefaultSign;
        }

        /**
         * @return isSignScopeOCRDiff
         */
        public Boolean getIsSignScopeOCRDiff() {
            return this.isSignScopeOCRDiff;
        }

        /**
         * @return mobileRegisterStatus
         */
        public Integer getMobileRegisterStatus() {
            return this.mobileRegisterStatus;
        }

        /**
         * @return operateDateStr
         */
        public String getOperateDateStr() {
            return this.operateDateStr;
        }

        /**
         * @return orderCount
         */
        public Long getOrderCount() {
            return this.orderCount;
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
         * @return qualificationName
         */
        public String getQualificationName() {
            return this.qualificationName;
        }

        /**
         * @return qualificationState
         */
        public String getQualificationState() {
            return this.qualificationState;
        }

        /**
         * @return qualificationVersion
         */
        public Long getQualificationVersion() {
            return this.qualificationVersion;
        }

        /**
         * @return qualificationWorkOrderId
         */
        public Long getQualificationWorkOrderId() {
            return this.qualificationWorkOrderId;
        }

        /**
         * @return registerResult
         */
        public Integer getRegisterResult() {
            return this.registerResult;
        }

        /**
         * @return registerTime
         */
        public Long getRegisterTime() {
            return this.registerTime;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resultReason
         */
        public String getResultReason() {
            return this.resultReason;
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
         * @return signSceneDetailList
         */
        public SignSceneDetailList getSignSceneDetailList() {
            return this.signSceneDetailList;
        }

        /**
         * @return signScopeOCR
         */
        public String getSignScopeOCR() {
            return this.signScopeOCR;
        }

        /**
         * @return signSource
         */
        public String getSignSource() {
            return this.signSource;
        }

        /**
         * @return signType
         */
        public Integer getSignType() {
            return this.signType;
        }

        /**
         * @return telecomRegisterStatus
         */
        public Integer getTelecomRegisterStatus() {
            return this.telecomRegisterStatus;
        }

        /**
         * @return unicomRegisterStatus
         */
        public Integer getUnicomRegisterStatus() {
            return this.unicomRegisterStatus;
        }

        public static final class Builder {
            private Integer aggregatedRegisterStatus; 
            private String applySource; 
            private String auditInfo; 
            private String auditRemarkInfo; 
            private String auditState; 
            private String authorization; 
            private String authorizationEffTime; 
            private String authorizationLetter; 
            private Boolean authorizationLetterAuditPass; 
            private Long authorizationLetterId; 
            private String authorizationLetterName; 
            private String authorizationLetterStatus; 
            private String authorizationSignScope; 
            private Boolean canRegister; 
            private Boolean enableAuthorizationLetter; 
            private String extendMessage; 
            private FileIds fileIds; 
            private FileUrlList fileUrlList; 
            private String gmtCreateStr; 
            private String id; 
            private Boolean isAuthorizationLetterOCRComplete; 
            private Boolean isAuthorizationLetterOCRDiff; 
            private Boolean isDefaultSign; 
            private Boolean isSignScopeOCRDiff; 
            private Integer mobileRegisterStatus; 
            private String operateDateStr; 
            private Long orderCount; 
            private String orderId; 
            private String organizationCode; 
            private String proxyAuthorization; 
            private Long qualificationId; 
            private String qualificationName; 
            private String qualificationState; 
            private Long qualificationVersion; 
            private Long qualificationWorkOrderId; 
            private Integer registerResult; 
            private Long registerTime; 
            private String remark; 
            private String resultReason; 
            private Integer sceneType; 
            private Integer serviceType; 
            private String signCode; 
            private String signName; 
            private SignSceneDetailList signSceneDetailList; 
            private String signScopeOCR; 
            private String signSource; 
            private Integer signType; 
            private Integer telecomRegisterStatus; 
            private Integer unicomRegisterStatus; 

            private Builder() {
            } 

            private Builder(SmsSignSmsSign model) {
                this.aggregatedRegisterStatus = model.aggregatedRegisterStatus;
                this.applySource = model.applySource;
                this.auditInfo = model.auditInfo;
                this.auditRemarkInfo = model.auditRemarkInfo;
                this.auditState = model.auditState;
                this.authorization = model.authorization;
                this.authorizationEffTime = model.authorizationEffTime;
                this.authorizationLetter = model.authorizationLetter;
                this.authorizationLetterAuditPass = model.authorizationLetterAuditPass;
                this.authorizationLetterId = model.authorizationLetterId;
                this.authorizationLetterName = model.authorizationLetterName;
                this.authorizationLetterStatus = model.authorizationLetterStatus;
                this.authorizationSignScope = model.authorizationSignScope;
                this.canRegister = model.canRegister;
                this.enableAuthorizationLetter = model.enableAuthorizationLetter;
                this.extendMessage = model.extendMessage;
                this.fileIds = model.fileIds;
                this.fileUrlList = model.fileUrlList;
                this.gmtCreateStr = model.gmtCreateStr;
                this.id = model.id;
                this.isAuthorizationLetterOCRComplete = model.isAuthorizationLetterOCRComplete;
                this.isAuthorizationLetterOCRDiff = model.isAuthorizationLetterOCRDiff;
                this.isDefaultSign = model.isDefaultSign;
                this.isSignScopeOCRDiff = model.isSignScopeOCRDiff;
                this.mobileRegisterStatus = model.mobileRegisterStatus;
                this.operateDateStr = model.operateDateStr;
                this.orderCount = model.orderCount;
                this.orderId = model.orderId;
                this.organizationCode = model.organizationCode;
                this.proxyAuthorization = model.proxyAuthorization;
                this.qualificationId = model.qualificationId;
                this.qualificationName = model.qualificationName;
                this.qualificationState = model.qualificationState;
                this.qualificationVersion = model.qualificationVersion;
                this.qualificationWorkOrderId = model.qualificationWorkOrderId;
                this.registerResult = model.registerResult;
                this.registerTime = model.registerTime;
                this.remark = model.remark;
                this.resultReason = model.resultReason;
                this.sceneType = model.sceneType;
                this.serviceType = model.serviceType;
                this.signCode = model.signCode;
                this.signName = model.signName;
                this.signSceneDetailList = model.signSceneDetailList;
                this.signScopeOCR = model.signScopeOCR;
                this.signSource = model.signSource;
                this.signType = model.signType;
                this.telecomRegisterStatus = model.telecomRegisterStatus;
                this.unicomRegisterStatus = model.unicomRegisterStatus;
            } 

            /**
             * AggregatedRegisterStatus.
             */
            public Builder aggregatedRegisterStatus(Integer aggregatedRegisterStatus) {
                this.aggregatedRegisterStatus = aggregatedRegisterStatus;
                return this;
            }

            /**
             * ApplySource.
             */
            public Builder applySource(String applySource) {
                this.applySource = applySource;
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
            public Builder authorizationLetterId(Long authorizationLetterId) {
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
             * CanRegister.
             */
            public Builder canRegister(Boolean canRegister) {
                this.canRegister = canRegister;
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
            public Builder fileIds(FileIds fileIds) {
                this.fileIds = fileIds;
                return this;
            }

            /**
             * FileUrlList.
             */
            public Builder fileUrlList(FileUrlList fileUrlList) {
                this.fileUrlList = fileUrlList;
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
             * IsDefaultSign.
             */
            public Builder isDefaultSign(Boolean isDefaultSign) {
                this.isDefaultSign = isDefaultSign;
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
             * MobileRegisterStatus.
             */
            public Builder mobileRegisterStatus(Integer mobileRegisterStatus) {
                this.mobileRegisterStatus = mobileRegisterStatus;
                return this;
            }

            /**
             * OperateDateStr.
             */
            public Builder operateDateStr(String operateDateStr) {
                this.operateDateStr = operateDateStr;
                return this;
            }

            /**
             * OrderCount.
             */
            public Builder orderCount(Long orderCount) {
                this.orderCount = orderCount;
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
             * ProxyAuthorization.
             */
            public Builder proxyAuthorization(String proxyAuthorization) {
                this.proxyAuthorization = proxyAuthorization;
                return this;
            }

            /**
             * QualificationId.
             */
            public Builder qualificationId(Long qualificationId) {
                this.qualificationId = qualificationId;
                return this;
            }

            /**
             * QualificationName.
             */
            public Builder qualificationName(String qualificationName) {
                this.qualificationName = qualificationName;
                return this;
            }

            /**
             * QualificationState.
             */
            public Builder qualificationState(String qualificationState) {
                this.qualificationState = qualificationState;
                return this;
            }

            /**
             * QualificationVersion.
             */
            public Builder qualificationVersion(Long qualificationVersion) {
                this.qualificationVersion = qualificationVersion;
                return this;
            }

            /**
             * QualificationWorkOrderId.
             */
            public Builder qualificationWorkOrderId(Long qualificationWorkOrderId) {
                this.qualificationWorkOrderId = qualificationWorkOrderId;
                return this;
            }

            /**
             * RegisterResult.
             */
            public Builder registerResult(Integer registerResult) {
                this.registerResult = registerResult;
                return this;
            }

            /**
             * RegisterTime.
             */
            public Builder registerTime(Long registerTime) {
                this.registerTime = registerTime;
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
             * ResultReason.
             */
            public Builder resultReason(String resultReason) {
                this.resultReason = resultReason;
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
             * SignSceneDetailList.
             */
            public Builder signSceneDetailList(SignSceneDetailList signSceneDetailList) {
                this.signSceneDetailList = signSceneDetailList;
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
             * SignSource.
             */
            public Builder signSource(String signSource) {
                this.signSource = signSource;
                return this;
            }

            /**
             * SignType.
             */
            public Builder signType(Integer signType) {
                this.signType = signType;
                return this;
            }

            /**
             * TelecomRegisterStatus.
             */
            public Builder telecomRegisterStatus(Integer telecomRegisterStatus) {
                this.telecomRegisterStatus = telecomRegisterStatus;
                return this;
            }

            /**
             * UnicomRegisterStatus.
             */
            public Builder unicomRegisterStatus(Integer unicomRegisterStatus) {
                this.unicomRegisterStatus = unicomRegisterStatus;
                return this;
            }

            public SmsSignSmsSign build() {
                return new SmsSignSmsSign(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignListNewResponseBody</p>
     */
    public static class SmsSign extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmsSign")
        private java.util.List<SmsSignSmsSign> smsSign;

        private SmsSign(Builder builder) {
            this.smsSign = builder.smsSign;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsSign create() {
            return builder().build();
        }

        /**
         * @return smsSign
         */
        public java.util.List<SmsSignSmsSign> getSmsSign() {
            return this.smsSign;
        }

        public static final class Builder {
            private java.util.List<SmsSignSmsSign> smsSign; 

            private Builder() {
            } 

            private Builder(SmsSign model) {
                this.smsSign = model.smsSign;
            } 

            /**
             * SmsSign.
             */
            public Builder smsSign(java.util.List<SmsSignSmsSign> smsSign) {
                this.smsSign = smsSign;
                return this;
            }

            public SmsSign build() {
                return new SmsSign(this);
            } 

        } 

    }
}
