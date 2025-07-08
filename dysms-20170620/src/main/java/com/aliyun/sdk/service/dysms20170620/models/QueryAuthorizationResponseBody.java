// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuthorizationResponseBody</p>
 */
public class QueryAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private QueryAuthorizationResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthorizationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(QueryAuthorizationResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public QueryAuthorizationResponseBody build() {
            return new QueryAuthorizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAuthorizationResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private Long aliyunUid;

        @com.aliyun.core.annotation.NameInMap("AuthorizeCode")
        private String authorizeCode;

        @com.aliyun.core.annotation.NameInMap("AuthorizeStatus")
        private Boolean authorizeStatus;

        @com.aliyun.core.annotation.NameInMap("AuthorizeTime")
        private String authorizeTime;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("UnAuthorizeTime")
        private String unAuthorizeTime;

        private Result(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.authorizeCode = builder.authorizeCode;
            this.authorizeStatus = builder.authorizeStatus;
            this.authorizeTime = builder.authorizeTime;
            this.productCode = builder.productCode;
            this.unAuthorizeTime = builder.unAuthorizeTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return authorizeCode
         */
        public String getAuthorizeCode() {
            return this.authorizeCode;
        }

        /**
         * @return authorizeStatus
         */
        public Boolean getAuthorizeStatus() {
            return this.authorizeStatus;
        }

        /**
         * @return authorizeTime
         */
        public String getAuthorizeTime() {
            return this.authorizeTime;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return unAuthorizeTime
         */
        public String getUnAuthorizeTime() {
            return this.unAuthorizeTime;
        }

        public static final class Builder {
            private Long aliyunUid; 
            private String authorizeCode; 
            private Boolean authorizeStatus; 
            private String authorizeTime; 
            private String productCode; 
            private String unAuthorizeTime; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.aliyunUid = model.aliyunUid;
                this.authorizeCode = model.authorizeCode;
                this.authorizeStatus = model.authorizeStatus;
                this.authorizeTime = model.authorizeTime;
                this.productCode = model.productCode;
                this.unAuthorizeTime = model.unAuthorizeTime;
            } 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(Long aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * AuthorizeCode.
             */
            public Builder authorizeCode(String authorizeCode) {
                this.authorizeCode = authorizeCode;
                return this;
            }

            /**
             * AuthorizeStatus.
             */
            public Builder authorizeStatus(Boolean authorizeStatus) {
                this.authorizeStatus = authorizeStatus;
                return this;
            }

            /**
             * AuthorizeTime.
             */
            public Builder authorizeTime(String authorizeTime) {
                this.authorizeTime = authorizeTime;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * UnAuthorizeTime.
             */
            public Builder unAuthorizeTime(String unAuthorizeTime) {
                this.unAuthorizeTime = unAuthorizeTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
