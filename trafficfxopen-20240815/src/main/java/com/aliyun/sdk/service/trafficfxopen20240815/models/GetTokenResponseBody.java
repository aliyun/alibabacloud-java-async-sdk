// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trafficfxopen20240815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetTokenResponseBody</p>
 */
public class GetTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorData")
    private ErrorData errorData;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetTokenResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorData
     */
    public ErrorData getErrorData() {
        return this.errorData;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private ErrorData errorData; 
        private String errorMsg; 
        private String requestId; 
        private Integer status; 
        private Boolean success; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorData.
         */
        public Builder errorData(ErrorData errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTokenResponseBody build() {
            return new GetTokenResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("generateTime")
        private String generateTime;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        private Data(Builder builder) {
            this.expireTime = builder.expireTime;
            this.generateTime = builder.generateTime;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return generateTime
         */
        public String getGenerateTime() {
            return this.generateTime;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String expireTime; 
            private String generateTime; 
            private String token; 

            /**
             * expireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * generateTime.
             */
            public Builder generateTime(String generateTime) {
                this.generateTime = generateTime;
                return this;
            }

            /**
             * token
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ErrorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rawErrorCode")
        private String rawErrorCode;

        @com.aliyun.core.annotation.NameInMap("rawErrorMsg")
        private String rawErrorMsg;

        private ErrorData(Builder builder) {
            this.rawErrorCode = builder.rawErrorCode;
            this.rawErrorMsg = builder.rawErrorMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorData create() {
            return builder().build();
        }

        /**
         * @return rawErrorCode
         */
        public String getRawErrorCode() {
            return this.rawErrorCode;
        }

        /**
         * @return rawErrorMsg
         */
        public String getRawErrorMsg() {
            return this.rawErrorMsg;
        }

        public static final class Builder {
            private String rawErrorCode; 
            private String rawErrorMsg; 

            /**
             * rawErrorCode.
             */
            public Builder rawErrorCode(String rawErrorCode) {
                this.rawErrorCode = rawErrorCode;
                return this;
            }

            /**
             * rawErrorMsg.
             */
            public Builder rawErrorMsg(String rawErrorMsg) {
                this.rawErrorMsg = rawErrorMsg;
                return this;
            }

            public ErrorData build() {
                return new ErrorData(this);
            } 

        } 

    }
}
