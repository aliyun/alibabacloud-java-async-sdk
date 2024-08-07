// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageResponseBody</p>
 */
public class GetImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
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
        @com.aliyun.core.annotation.NameInMap("CurrentVersionFullShowName")
        private String currentVersionFullShowName;

        @com.aliyun.core.annotation.NameInMap("MaxVersionChangelogUrl")
        private String maxVersionChangelogUrl;

        @com.aliyun.core.annotation.NameInMap("MaxVersionCode")
        private String maxVersionCode;

        @com.aliyun.core.annotation.NameInMap("MaxVersionFullShowName")
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
             * The full version number of the current instance image. The parameter is in the X.X.X.X format.
             */
            public Builder currentVersionFullShowName(String currentVersionFullShowName) {
                this.currentVersionFullShowName = currentVersionFullShowName;
                return this;
            }

            /**
             * The URL of the changelog for the maximum version to which the current version can be upgraded.
             */
            public Builder maxVersionChangelogUrl(String maxVersionChangelogUrl) {
                this.maxVersionChangelogUrl = maxVersionChangelogUrl;
                return this;
            }

            /**
             * The code of the maximum version to which the current version can be upgraded.
             */
            public Builder maxVersionCode(String maxVersionCode) {
                this.maxVersionCode = maxVersionCode;
                return this;
            }

            /**
             * The full number of the maximum version to which the current version can be upgraded.
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
