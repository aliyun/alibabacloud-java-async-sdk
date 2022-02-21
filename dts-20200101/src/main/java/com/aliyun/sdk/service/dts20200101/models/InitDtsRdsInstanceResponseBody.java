// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitDtsRdsInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>InitDtsRdsInstanceResponseBody</p>
 */
public class InitDtsRdsInstanceResponseBody extends TeaModel {
    @NameInMap("AdminAccount")
    private String adminAccount;

    @NameInMap("AdminPassword")
    private String adminPassword;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private InitDtsRdsInstanceResponseBody(Builder builder) {
        this.adminAccount = builder.adminAccount;
        this.adminPassword = builder.adminPassword;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitDtsRdsInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return adminAccount
     */
    public String getAdminAccount() {
        return this.adminAccount;
    }

    /**
     * @return adminPassword
     */
    public String getAdminPassword() {
        return this.adminPassword;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String adminAccount; 
        private String adminPassword; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String requestId; 
        private String success; 

        /**
         * AdminAccount.
         */
        public Builder adminAccount(String adminAccount) {
            this.adminAccount = adminAccount;
            return this;
        }

        /**
         * AdminPassword.
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public InitDtsRdsInstanceResponseBody build() {
            return new InitDtsRdsInstanceResponseBody(this);
        } 

    } 

}
