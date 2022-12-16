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
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request fails.
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * - `true`: The request is successful. 
         * - `false`: The request fails.
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
             * The full name of the current cluster image version. The full name is in the X.X.X.X format.
             */
            public Builder currentVersionFullShowName(String currentVersionFullShowName) {
                this.currentVersionFullShowName = currentVersionFullShowName;
                return this;
            }

            /**
             * The URL of change logs for the latest version that can be updated to.
             */
            public Builder maxVersionChangelogUrl(String maxVersionChangelogUrl) {
                this.maxVersionChangelogUrl = maxVersionChangelogUrl;
                return this;
            }

            /**
             * The code of the latest version that can be updated to.
             */
            public Builder maxVersionCode(String maxVersionCode) {
                this.maxVersionCode = maxVersionCode;
                return this;
            }

            /**
             * The full name of the latest version that can be updated to.
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
