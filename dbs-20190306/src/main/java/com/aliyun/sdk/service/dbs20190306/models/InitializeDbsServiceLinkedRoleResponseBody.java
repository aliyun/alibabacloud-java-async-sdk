// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeDbsServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>InitializeDbsServiceLinkedRoleResponseBody</p>
 */
public class InitializeDbsServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private InitializeDbsServiceLinkedRoleResponseBody(Builder builder) {
        this.data = builder.data;
        this.errMessage = builder.errMessage;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeDbsServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private String data; 
        private String errMessage; 
        private String errorCode; 
        private String requestId; 
        private String success; 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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

        public InitializeDbsServiceLinkedRoleResponseBody build() {
            return new InitializeDbsServiceLinkedRoleResponseBody(this);
        } 

    } 

}
