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
 * {@link QueryEmailVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEmailVerificationResponseBody</p>
 */
public class QueryEmailVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfirmIp")
    private String confirmIp;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("EmailVerificationNo")
    private String emailVerificationNo;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SendIp")
    private String sendIp;

    @com.aliyun.core.annotation.NameInMap("TokenSendTime")
    private String tokenSendTime;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("VerificationStatus")
    private Integer verificationStatus;

    @com.aliyun.core.annotation.NameInMap("VerificationTime")
    private String verificationTime;

    private QueryEmailVerificationResponseBody(Builder builder) {
        this.confirmIp = builder.confirmIp;
        this.email = builder.email;
        this.emailVerificationNo = builder.emailVerificationNo;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.requestId = builder.requestId;
        this.sendIp = builder.sendIp;
        this.tokenSendTime = builder.tokenSendTime;
        this.userId = builder.userId;
        this.verificationStatus = builder.verificationStatus;
        this.verificationTime = builder.verificationTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEmailVerificationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return confirmIp
     */
    public String getConfirmIp() {
        return this.confirmIp;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return emailVerificationNo
     */
    public String getEmailVerificationNo() {
        return this.emailVerificationNo;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sendIp
     */
    public String getSendIp() {
        return this.sendIp;
    }

    /**
     * @return tokenSendTime
     */
    public String getTokenSendTime() {
        return this.tokenSendTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return verificationStatus
     */
    public Integer getVerificationStatus() {
        return this.verificationStatus;
    }

    /**
     * @return verificationTime
     */
    public String getVerificationTime() {
        return this.verificationTime;
    }

    public static final class Builder {
        private String confirmIp; 
        private String email; 
        private String emailVerificationNo; 
        private String gmtCreate; 
        private String gmtModified; 
        private String requestId; 
        private String sendIp; 
        private String tokenSendTime; 
        private String userId; 
        private Integer verificationStatus; 
        private String verificationTime; 

        private Builder() {
        } 

        private Builder(QueryEmailVerificationResponseBody model) {
            this.confirmIp = model.confirmIp;
            this.email = model.email;
            this.emailVerificationNo = model.emailVerificationNo;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.requestId = model.requestId;
            this.sendIp = model.sendIp;
            this.tokenSendTime = model.tokenSendTime;
            this.userId = model.userId;
            this.verificationStatus = model.verificationStatus;
            this.verificationTime = model.verificationTime;
        } 

        /**
         * <p>IP address of the computer that completed the email verification.</p>
         * 
         * <strong>example:</strong>
         * <p>42.<em>.</em>.31</p>
         */
        public Builder confirmIp(String confirmIp) {
            this.confirmIp = confirmIp;
            return this;
        }

        /**
         * <p>The queried Email.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:abc@aliyun.com">abc@aliyun.com</a></p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>Email verification number (by default, a serial number automatically generated by the System).</p>
         * 
         * <strong>example:</strong>
         * <p>72b36ba0572e423bbb3f19640896****</p>
         */
        public Builder emailVerificationNo(String emailVerificationNo) {
            this.emailVerificationNo = emailVerificationNo;
            return this;
        }

        /**
         * <p>Creation Time of the mailbox record in the database.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-19 16:38:07</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>Update Time of the mailbox record in the database.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-19 16:40:38</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>Unique Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FC4F7D02-8A83-4E37-B935-2D48A1B8423E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>IP address from which the user initiated the email verification request.</p>
         * 
         * <strong>example:</strong>
         * <p>42.<em>.</em>.115</p>
         */
        public Builder sendIp(String sendIp) {
            this.sendIp = sendIp;
            return this;
        }

        /**
         * <p>Sending Time of the email verification token.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-19 16:38:07</p>
         */
        public Builder tokenSendTime(String tokenSendTime) {
            this.tokenSendTime = tokenSendTime;
            return this;
        }

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>Email verification status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Waiting for verification.</li>
         * <li><strong>1</strong>: Verification succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder verificationStatus(Integer verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }

        /**
         * <p>Specific time when the email verification was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-19 16:40:38</p>
         */
        public Builder verificationTime(String verificationTime) {
            this.verificationTime = verificationTime;
            return this;
        }

        public QueryEmailVerificationResponseBody build() {
            return new QueryEmailVerificationResponseBody(this);
        } 

    } 

}
