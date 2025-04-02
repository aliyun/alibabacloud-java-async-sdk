// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetImageResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.httpCode = model.httpCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25EA0A83-9007-4E87-808C-637BE1A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetImageResponseBody build() {
            return new GetImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentVersionFullShowName = model.currentVersionFullShowName;
                this.maxVersionChangelogUrl = model.maxVersionChangelogUrl;
                this.maxVersionCode = model.maxVersionCode;
                this.maxVersionFullShowName = model.maxVersionFullShowName;
            } 

            /**
             * <p>The full version number of the current instance image. The parameter is in the X.X.X.X format.</p>
             * 
             * <strong>example:</strong>
             * <p>3.5.5.0</p>
             */
            public Builder currentVersionFullShowName(String currentVersionFullShowName) {
                this.currentVersionFullShowName = currentVersionFullShowName;
                return this;
            }

            /**
             * <p>The URL of the changelog for the maximum version to which the current version can be upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx">https://xxxxx</a></p>
             */
            public Builder maxVersionChangelogUrl(String maxVersionChangelogUrl) {
                this.maxVersionChangelogUrl = maxVersionChangelogUrl;
                return this;
            }

            /**
             * <p>The code of the maximum version to which the current version can be upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>ZooKeeper_3_6_3</p>
             */
            public Builder maxVersionCode(String maxVersionCode) {
                this.maxVersionCode = maxVersionCode;
                return this;
            }

            /**
             * <p>The full number of the maximum version to which the current version can be upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>3.6.3.0</p>
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
