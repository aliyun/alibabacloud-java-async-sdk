// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryTransferInByInstanceIdResponseBody model) {
            this.domainName = model.domainName;
            this.email = model.email;
            this.expirationDate = model.expirationDate;
            this.expirationDateLong = model.expirationDateLong;
            this.instanceId = model.instanceId;
            this.modificationDate = model.modificationDate;
            this.modificationDateLong = model.modificationDateLong;
            this.needMailCheck = model.needMailCheck;
            this.progressBarType = model.progressBarType;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultDate = model.resultDate;
            this.resultDateLong = model.resultDateLong;
            this.resultMsg = model.resultMsg;
            this.simpleTransferInStatus = model.simpleTransferInStatus;
            this.status = model.status;
            this.submissionDate = model.submissionDate;
            this.submissionDateLong = model.submissionDateLong;
            this.transferAuthorizationCodeSubmissionDate = model.transferAuthorizationCodeSubmissionDate;
            this.transferAuthorizationCodeSubmissionDateLong = model.transferAuthorizationCodeSubmissionDateLong;
            this.userId = model.userId;
            this.whoisMailStatus = model.whoisMailStatus;
        } 

        /**
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Mailbox to which the domain name transfer-in confirmation email was sent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>The expiration time of the domain name transfer-in.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * <p>The UNIX timestamp indicating when the transfer-in expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        public Builder expirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S20181T0WLI85212</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The update time of the transfer-in information.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        public Builder modificationDate(String modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }

        /**
         * <p>The UNIX timestamp indicating when the transfer-in information was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        public Builder modificationDateLong(Long modificationDateLong) {
            this.modificationDateLong = modificationDateLong;
            return this;
        }

        /**
         * <p>Indicates whether email verification is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needMailCheck(Boolean needMailCheck) {
            this.needMailCheck = needMailCheck;
            return this;
        }

        /**
         * <p>Progress bar chart type for the transfer procedure. Valid values:  </p>
         * <ul>
         * <li><strong>0</strong>: Both email verification and naming review are required;  </li>
         * <li><strong>1</strong>: Email verification is required, but naming review is not;  </li>
         * <li><strong>2</strong>: Naming review is required, but email verification is not;  </li>
         * <li><strong>3</strong>: Neither email verification nor naming review is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder progressBarType(Integer progressBarType) {
            this.progressBarType = progressBarType;
            return this;
        }

        /**
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error code indicating the reason for transfer failure. Valid values:</p>
         * <ul>
         * <li><strong>clientCancelled</strong>: You canceled the domain transfer-in.</li>
         * <li><strong>clientRejected</strong>: The original registrar rejected the domain transfer-in (or you performed a rejection operation through the original registrar).</li>
         * <li><strong>serverCancelled</strong>: The domain name registry canceled the transfer.</li>
         * <li><strong>transferProhibited</strong>: The domain is in a transfer-prohibited status.</li>
         * <li><strong>transferExpired</strong>: You did not complete the required transfer confirmation within the validity period.</li>
         * <li><strong>nameVerificationFailed</strong>: The domain naming review did not pass.</li>
         * <li><strong>transferSubmitted</strong>: Another user has already submitted a transfer request for this domain.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clientCancelled</p>
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * <p>The time when the transfer succeeded or failed.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        public Builder resultDate(String resultDate) {
            this.resultDate = resultDate;
            return this;
        }

        /**
         * <p>The UNIX timestamp indicating when the transfer succeeded or failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        public Builder resultDateLong(Long resultDateLong) {
            this.resultDateLong = resultDateLong;
            return this;
        }

        /**
         * <p>Description of the failure reason when the transfer failed.</p>
         * 
         * <strong>example:</strong>
         * <p>您取消了此次域名转入</p>
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * <p>Transfer status. Valid values:  </p>
         * <ul>
         * <li><strong>INIT</strong>: Transfer-in submitted;  </li>
         * <li><strong>AUTHORIZATION</strong>: Authorization for transfer-in (email verification);  </li>
         * <li><strong>NAME_VERIFICATION</strong>: Naming review;  </li>
         * <li><strong>PASSWORD_VERIFICATION</strong>: Transfer password verification;  </li>
         * <li><strong>PENDING</strong>: Transfer-in in progress;  </li>
         * <li><strong>SUCCESS</strong>: Transfer-in succeeded;  </li>
         * <li><strong>FAIL</strong>: Transfer-in failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder simpleTransferInStatus(String simpleTransferInStatus) {
            this.simpleTransferInStatus = simpleTransferInStatus;
            return this;
        }

        /**
         * <p>Detailed domain name transfer-in status. Valid values:  </p>
         * <ul>
         * <li><strong>10</strong>: Initial status;  </li>
         * <li><strong>11</strong>: Email verification token link has been sent;  </li>
         * <li><strong>19</strong>: Token link has been successfully verified;  </li>
         * <li><strong>20</strong>: Naming review has been submitted;  </li>
         * <li><strong>21</strong>: Naming review failed;  </li>
         * <li><strong>29</strong>: Naming review succeeded;  </li>
         * <li><strong>31</strong>: Transfer password is incorrect;  </li>
         * <li><strong>39</strong>: Transfer-in submission succeeded;  </li>
         * <li><strong>50</strong>: Customer canceled the transfer-in;  </li>
         * <li><strong>51</strong>: Transfer-in failed;  </li>
         * <li><strong>52</strong>: Transfer-in expired;  </li>
         * <li><strong>59</strong>: Transfer-in succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Transfer request submission time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        public Builder submissionDate(String submissionDate) {
            this.submissionDate = submissionDate;
            return this;
        }

        /**
         * <p>UNIX timestamp of the transfer request submission time.</p>
         * 
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        public Builder submissionDateLong(Long submissionDateLong) {
            this.submissionDateLong = submissionDateLong;
            return this;
        }

        /**
         * <p>Time when the transfer password was successfully submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        public Builder transferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
            this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
            return this;
        }

        /**
         * <p>UNIX timestamp of the time when the transfer password was successfully submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        public Builder transferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
            this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
            return this;
        }

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>Indicates whether the registrant\&quot;s mailbox was scraped from WHOIS. When the domain transfer-in is in the authorization (email verification) phase and this field is <strong>false</strong>, it means the registrant\&quot;s mailbox was not obtained via WHOIS scraping, and manual processing is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
