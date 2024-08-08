// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MemberPointChangeResponseBody} extends {@link TeaModel}
 *
 * <p>MemberPointChangeResponseBody</p>
 */
public class MemberPointChangeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountBalance")
    private String accountBalance;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("LevelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String levelName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private MemberPointChangeResponseBody(Builder builder) {
        this.accountBalance = builder.accountBalance;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.levelName = builder.levelName;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MemberPointChangeResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountBalance
     */
    public String getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return levelName
     */
    public String getLevelName() {
        return this.levelName;
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
        private String accountBalance; 
        private String errorCode; 
        private String errorMessage; 
        private String levelName; 
        private String requestId; 
        private String success; 

        /**
         * AccountBalance.
         */
        public Builder accountBalance(String accountBalance) {
            this.accountBalance = accountBalance;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * LevelName.
         */
        public Builder levelName(String levelName) {
            this.levelName = levelName;
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

        public MemberPointChangeResponseBody build() {
            return new MemberPointChangeResponseBody(this);
        } 

    } 

}
