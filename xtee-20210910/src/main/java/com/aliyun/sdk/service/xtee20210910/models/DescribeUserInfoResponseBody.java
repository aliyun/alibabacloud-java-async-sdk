// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserInfoResponseBody</p>
 */
public class DescribeUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DescribeUserInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private ResultObject resultObject; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeUserInfoResponseBody build() {
            return new DescribeUserInfoResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("subId")
        private String subId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private ResultObject(Builder builder) {
            this.clientIp = builder.clientIp;
            this.subId = builder.subId;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return subId
         */
        public String getSubId() {
            return this.subId;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String clientIp; 
            private String subId; 
            private Long userId; 
            private String userName; 

            /**
             * clientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * subId.
             */
            public Builder subId(String subId) {
                this.subId = subId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * userName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
