// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEmailVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEmailVerificationResponseBody</p>
 */
public class QueryEmailVerificationResponseBody extends TeaModel {
    @NameInMap("ConfirmIp")
    private String confirmIp;

    @NameInMap("Email")
    private String email;

    @NameInMap("EmailVerificationNo")
    private String emailVerificationNo;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SendIp")
    private String sendIp;

    @NameInMap("TokenSendTime")
    private String tokenSendTime;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("VerificationStatus")
    private Integer verificationStatus;

    @NameInMap("VerificationTime")
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

        /**
         * ConfirmIp.
         */
        public Builder confirmIp(String confirmIp) {
            this.confirmIp = confirmIp;
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
         * EmailVerificationNo.
         */
        public Builder emailVerificationNo(String emailVerificationNo) {
            this.emailVerificationNo = emailVerificationNo;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
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
         * SendIp.
         */
        public Builder sendIp(String sendIp) {
            this.sendIp = sendIp;
            return this;
        }

        /**
         * TokenSendTime.
         */
        public Builder tokenSendTime(String tokenSendTime) {
            this.tokenSendTime = tokenSendTime;
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
         * VerificationStatus.
         */
        public Builder verificationStatus(Integer verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }

        /**
         * VerificationTime.
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
