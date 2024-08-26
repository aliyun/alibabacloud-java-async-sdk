// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTransferInByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTransferInByInstanceIdResponseBody</p>
 */
public class QueryTransferInByInstanceIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("ExpirationDate")
    private String expirationDate;

    @com.aliyun.core.annotation.NameInMap("ExpirationDateLong")
    private Long expirationDateLong;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("ModificationDate")
    private String modificationDate;

    @com.aliyun.core.annotation.NameInMap("ModificationDateLong")
    private Long modificationDateLong;

    @com.aliyun.core.annotation.NameInMap("NeedMailCheck")
    private Boolean needMailCheck;

    @com.aliyun.core.annotation.NameInMap("ProgressBarType")
    private Integer progressBarType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultDate")
    private String resultDate;

    @com.aliyun.core.annotation.NameInMap("ResultDateLong")
    private Long resultDateLong;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("SimpleTransferInStatus")
    private String simpleTransferInStatus;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("SubmissionDate")
    private String submissionDate;

    @com.aliyun.core.annotation.NameInMap("SubmissionDateLong")
    private Long submissionDateLong;

    @com.aliyun.core.annotation.NameInMap("TransferAuthorizationCodeSubmissionDate")
    private String transferAuthorizationCodeSubmissionDate;

    @com.aliyun.core.annotation.NameInMap("TransferAuthorizationCodeSubmissionDateLong")
    private Long transferAuthorizationCodeSubmissionDateLong;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WhoisMailStatus")
    private Boolean whoisMailStatus;

    private QueryTransferInByInstanceIdResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.email = builder.email;
        this.expirationDate = builder.expirationDate;
        this.expirationDateLong = builder.expirationDateLong;
        this.instanceId = builder.instanceId;
        this.modificationDate = builder.modificationDate;
        this.modificationDateLong = builder.modificationDateLong;
        this.needMailCheck = builder.needMailCheck;
        this.progressBarType = builder.progressBarType;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultDate = builder.resultDate;
        this.resultDateLong = builder.resultDateLong;
        this.resultMsg = builder.resultMsg;
        this.simpleTransferInStatus = builder.simpleTransferInStatus;
        this.status = builder.status;
        this.submissionDate = builder.submissionDate;
        this.submissionDateLong = builder.submissionDateLong;
        this.transferAuthorizationCodeSubmissionDate = builder.transferAuthorizationCodeSubmissionDate;
        this.transferAuthorizationCodeSubmissionDateLong = builder.transferAuthorizationCodeSubmissionDateLong;
        this.userId = builder.userId;
        this.whoisMailStatus = builder.whoisMailStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTransferInByInstanceIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return expirationDate
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * @return expirationDateLong
     */
    public Long getExpirationDateLong() {
        return this.expirationDateLong;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modificationDate
     */
    public String getModificationDate() {
        return this.modificationDate;
    }

    /**
     * @return modificationDateLong
     */
    public Long getModificationDateLong() {
        return this.modificationDateLong;
    }

    /**
     * @return needMailCheck
     */
    public Boolean getNeedMailCheck() {
        return this.needMailCheck;
    }

    /**
     * @return progressBarType
     */
    public Integer getProgressBarType() {
        return this.progressBarType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultDate
     */
    public String getResultDate() {
        return this.resultDate;
    }

    /**
     * @return resultDateLong
     */
    public Long getResultDateLong() {
        return this.resultDateLong;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return simpleTransferInStatus
     */
    public String getSimpleTransferInStatus() {
        return this.simpleTransferInStatus;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return submissionDate
     */
    public String getSubmissionDate() {
        return this.submissionDate;
    }

    /**
     * @return submissionDateLong
     */
    public Long getSubmissionDateLong() {
        return this.submissionDateLong;
    }

    /**
     * @return transferAuthorizationCodeSubmissionDate
     */
    public String getTransferAuthorizationCodeSubmissionDate() {
        return this.transferAuthorizationCodeSubmissionDate;
    }

    /**
     * @return transferAuthorizationCodeSubmissionDateLong
     */
    public Long getTransferAuthorizationCodeSubmissionDateLong() {
        return this.transferAuthorizationCodeSubmissionDateLong;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return whoisMailStatus
     */
    public Boolean getWhoisMailStatus() {
        return this.whoisMailStatus;
    }

    public static final class Builder {
        private String domainName; 
        private String email; 
        private String expirationDate; 
        private Long expirationDateLong; 
        private String instanceId; 
        private String modificationDate; 
        private Long modificationDateLong; 
        private Boolean needMailCheck; 
        private Integer progressBarType; 
        private String requestId; 
        private String resultCode; 
        private String resultDate; 
        private Long resultDateLong; 
        private String resultMsg; 
        private String simpleTransferInStatus; 
        private Integer status; 
        private String submissionDate; 
        private Long submissionDateLong; 
        private String transferAuthorizationCodeSubmissionDate; 
        private Long transferAuthorizationCodeSubmissionDateLong; 
        private String userId; 
        private Boolean whoisMailStatus; 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * ExpirationDate.
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * ExpirationDateLong.
         */
        public Builder expirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ModificationDate.
         */
        public Builder modificationDate(String modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }

        /**
         * ModificationDateLong.
         */
        public Builder modificationDateLong(Long modificationDateLong) {
            this.modificationDateLong = modificationDateLong;
            return this;
        }

        /**
         * NeedMailCheck.
         */
        public Builder needMailCheck(Boolean needMailCheck) {
            this.needMailCheck = needMailCheck;
            return this;
        }

        /**
         * ProgressBarType.
         */
        public Builder progressBarType(Integer progressBarType) {
            this.progressBarType = progressBarType;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultDate.
         */
        public Builder resultDate(String resultDate) {
            this.resultDate = resultDate;
            return this;
        }

        /**
         * ResultDateLong.
         */
        public Builder resultDateLong(Long resultDateLong) {
            this.resultDateLong = resultDateLong;
            return this;
        }

        /**
         * ResultMsg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * SimpleTransferInStatus.
         */
        public Builder simpleTransferInStatus(String simpleTransferInStatus) {
            this.simpleTransferInStatus = simpleTransferInStatus;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * SubmissionDate.
         */
        public Builder submissionDate(String submissionDate) {
            this.submissionDate = submissionDate;
            return this;
        }

        /**
         * SubmissionDateLong.
         */
        public Builder submissionDateLong(Long submissionDateLong) {
            this.submissionDateLong = submissionDateLong;
            return this;
        }

        /**
         * TransferAuthorizationCodeSubmissionDate.
         */
        public Builder transferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
            this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
            return this;
        }

        /**
         * TransferAuthorizationCodeSubmissionDateLong.
         */
        public Builder transferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
            this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * WhoisMailStatus.
         */
        public Builder whoisMailStatus(Boolean whoisMailStatus) {
            this.whoisMailStatus = whoisMailStatus;
            return this;
        }

        public QueryTransferInByInstanceIdResponseBody build() {
            return new QueryTransferInByInstanceIdResponseBody(this);
        } 

    } 

}
