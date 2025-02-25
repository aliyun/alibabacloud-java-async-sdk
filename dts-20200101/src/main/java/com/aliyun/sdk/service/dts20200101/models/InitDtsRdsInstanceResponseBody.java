// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link InitDtsRdsInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>InitDtsRdsInstanceResponseBody</p>
 */
public class InitDtsRdsInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdminAccount")
    private String adminAccount;

    @com.aliyun.core.annotation.NameInMap("AdminPassword")
    private String adminPassword;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The built-in account that is used by DTS to connect to the node.</p>
         * 
         * <strong>example:</strong>
         * <p>rdsdt_dtsacct</p>
         */
        public Builder adminAccount(String adminAccount) {
            this.adminAccount = adminAccount;
            return this;
        }

        /**
         * <p>The password of the built-in account.</p>
         * 
         * <strong>example:</strong>
         * <p>1jecpqrtc****</p>
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7796ECE0-9C17-5E4D-9CE6-B7EC825A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
