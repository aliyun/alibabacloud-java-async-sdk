// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryTransferOutInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTransferOutInfoResponseBody</p>
 */
public class QueryTransferOutInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("ExpirationDate")
    private String expirationDate;

    @com.aliyun.core.annotation.NameInMap("PendingRequestDate")
    private String pendingRequestDate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("TransferAuthorizationCodeSendDate")
    private String transferAuthorizationCodeSendDate;

    private QueryTransferOutInfoResponseBody(Builder builder) {
        this.email = builder.email;
        this.expirationDate = builder.expirationDate;
        this.pendingRequestDate = builder.pendingRequestDate;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.status = builder.status;
        this.transferAuthorizationCodeSendDate = builder.transferAuthorizationCodeSendDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTransferOutInfoResponseBody create() {
        return builder().build();
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
     * @return pendingRequestDate
     */
    public String getPendingRequestDate() {
        return this.pendingRequestDate;
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
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return transferAuthorizationCodeSendDate
     */
    public String getTransferAuthorizationCodeSendDate() {
        return this.transferAuthorizationCodeSendDate;
    }

    public static final class Builder {
        private String email; 
        private String expirationDate; 
        private String pendingRequestDate; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Integer status; 
        private String transferAuthorizationCodeSendDate; 

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
         * PendingRequestDate.
         */
        public Builder pendingRequestDate(String pendingRequestDate) {
            this.pendingRequestDate = pendingRequestDate;
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
         * ResultMsg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
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
         * TransferAuthorizationCodeSendDate.
         */
        public Builder transferAuthorizationCodeSendDate(String transferAuthorizationCodeSendDate) {
            this.transferAuthorizationCodeSendDate = transferAuthorizationCodeSendDate;
            return this;
        }

        public QueryTransferOutInfoResponseBody build() {
            return new QueryTransferOutInfoResponseBody(this);
        } 

    } 

}
