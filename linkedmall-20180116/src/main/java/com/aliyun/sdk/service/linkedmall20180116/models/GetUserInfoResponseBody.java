// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GetUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserInfoResponseBody</p>
 */
public class GetUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LoginResult")
    private LoginResult loginResult;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.loginResult = builder.loginResult;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return loginResult
     */
    public LoginResult getLoginResult() {
        return this.loginResult;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private LoginResult loginResult; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LoginResult.
         */
        public Builder loginResult(LoginResult loginResult) {
            this.loginResult = loginResult;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserInfoResponseBody build() {
            return new GetUserInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserInfoResponseBody</p>
     */
    public static class LoginResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("BizUid")
        private String bizUid;

        @com.aliyun.core.annotation.NameInMap("BizUserName")
        private String bizUserName;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private java.util.Map<String, ?> extInfo;

        @com.aliyun.core.annotation.NameInMap("LmUserId")
        private Long lmUserId;

        @com.aliyun.core.annotation.NameInMap("ReturnUrl")
        private String returnUrl;

        @com.aliyun.core.annotation.NameInMap("SubBizId")
        private java.util.List<String> subBizId;

        private LoginResult(Builder builder) {
            this.bizId = builder.bizId;
            this.bizUid = builder.bizUid;
            this.bizUserName = builder.bizUserName;
            this.extInfo = builder.extInfo;
            this.lmUserId = builder.lmUserId;
            this.returnUrl = builder.returnUrl;
            this.subBizId = builder.subBizId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginResult create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizUid
         */
        public String getBizUid() {
            return this.bizUid;
        }

        /**
         * @return bizUserName
         */
        public String getBizUserName() {
            return this.bizUserName;
        }

        /**
         * @return extInfo
         */
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return lmUserId
         */
        public Long getLmUserId() {
            return this.lmUserId;
        }

        /**
         * @return returnUrl
         */
        public String getReturnUrl() {
            return this.returnUrl;
        }

        /**
         * @return subBizId
         */
        public java.util.List<String> getSubBizId() {
            return this.subBizId;
        }

        public static final class Builder {
            private String bizId; 
            private String bizUid; 
            private String bizUserName; 
            private java.util.Map<String, ?> extInfo; 
            private Long lmUserId; 
            private String returnUrl; 
            private java.util.List<String> subBizId; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BizUid.
             */
            public Builder bizUid(String bizUid) {
                this.bizUid = bizUid;
                return this;
            }

            /**
             * BizUserName.
             */
            public Builder bizUserName(String bizUserName) {
                this.bizUserName = bizUserName;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map<String, ?> extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * LmUserId.
             */
            public Builder lmUserId(Long lmUserId) {
                this.lmUserId = lmUserId;
                return this;
            }

            /**
             * ReturnUrl.
             */
            public Builder returnUrl(String returnUrl) {
                this.returnUrl = returnUrl;
                return this;
            }

            /**
             * SubBizId.
             */
            public Builder subBizId(java.util.List<String> subBizId) {
                this.subBizId = subBizId;
                return this;
            }

            public LoginResult build() {
                return new LoginResult(this);
            } 

        } 

    }
}
