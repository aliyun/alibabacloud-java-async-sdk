// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trafficfxopen20240815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConvertUrlResponseBody} extends {@link TeaModel}
 *
 * <p>ConvertUrlResponseBody</p>
 */
public class ConvertUrlResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private ConvertUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertUrlResponseBody create() {
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ConvertUrlResponseBody build() {
            return new ConvertUrlResponseBody(this);
        } 

    } 

    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        private Status(Builder builder) {
            this.code = builder.code;
            this.errorMsg = builder.errorMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public static final class Builder {
            private String code; 
            private String errorMsg; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * errorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("authUrl")
        private String authUrl;

        @com.aliyun.core.annotation.NameInMap("status")
        @com.aliyun.core.annotation.Validation(required = true)
        private Status status;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.authUrl = builder.authUrl;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return authUrl
         */
        public String getAuthUrl() {
            return this.authUrl;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appId; 
            private String authUrl; 
            private Status status; 
            private String version; 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * authUrl.
             */
            public Builder authUrl(String authUrl) {
                this.authUrl = authUrl;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
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
