// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageResponseBody</p>
 */
public class GetImageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetImageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageResponseBody create() {
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
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetImageResponseBody build() {
            return new GetImageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CurrentVersionFullShowName")
        private String currentVersionFullShowName;

        @NameInMap("MaxVersionChangelogUrl")
        private String maxVersionChangelogUrl;

        @NameInMap("MaxVersionCode")
        private String maxVersionCode;

        @NameInMap("MaxVersionFullShowName")
        private String maxVersionFullShowName;

        private Data(Builder builder) {
            this.currentVersionFullShowName = builder.currentVersionFullShowName;
            this.maxVersionChangelogUrl = builder.maxVersionChangelogUrl;
            this.maxVersionCode = builder.maxVersionCode;
            this.maxVersionFullShowName = builder.maxVersionFullShowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentVersionFullShowName
         */
        public String getCurrentVersionFullShowName() {
            return this.currentVersionFullShowName;
        }

        /**
         * @return maxVersionChangelogUrl
         */
        public String getMaxVersionChangelogUrl() {
            return this.maxVersionChangelogUrl;
        }

        /**
         * @return maxVersionCode
         */
        public String getMaxVersionCode() {
            return this.maxVersionCode;
        }

        /**
         * @return maxVersionFullShowName
         */
        public String getMaxVersionFullShowName() {
            return this.maxVersionFullShowName;
        }

        public static final class Builder {
            private String currentVersionFullShowName; 
            private String maxVersionChangelogUrl; 
            private String maxVersionCode; 
            private String maxVersionFullShowName; 

            /**
             * 当前集群镜像版本的4位全名
             */
            public Builder currentVersionFullShowName(String currentVersionFullShowName) {
                this.currentVersionFullShowName = currentVersionFullShowName;
                return this;
            }

            /**
             * 可升级的最大版本变更日志url
             */
            public Builder maxVersionChangelogUrl(String maxVersionChangelogUrl) {
                this.maxVersionChangelogUrl = maxVersionChangelogUrl;
                return this;
            }

            /**
             * 可升级的增量版本Code
             */
            public Builder maxVersionCode(String maxVersionCode) {
                this.maxVersionCode = maxVersionCode;
                return this;
            }

            /**
             * 可升级的增量版本全名
             */
            public Builder maxVersionFullShowName(String maxVersionFullShowName) {
                this.maxVersionFullShowName = maxVersionFullShowName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
