// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestPasterResponseBody} extends {@link TeaModel}
 *
 * <p>RequestPasterResponseBody</p>
 */
public class RequestPasterResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RequestPasterResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestPasterResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RequestPasterResponseBody build() {
            return new RequestPasterResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Configs")
        private java.util.Map < String, ? > configs;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("ResourceUuid")
        private String resourceUuid;

        private Data(Builder builder) {
            this.configs = builder.configs;
            this.downloadUrl = builder.downloadUrl;
            this.resourceUuid = builder.resourceUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configs
         */
        public java.util.Map < String, ? > getConfigs() {
            return this.configs;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return resourceUuid
         */
        public String getResourceUuid() {
            return this.resourceUuid;
        }

        public static final class Builder {
            private java.util.Map < String, ? > configs; 
            private String downloadUrl; 
            private String resourceUuid; 

            /**
             * Configs.
             */
            public Builder configs(java.util.Map < String, ? > configs) {
                this.configs = configs;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * ResourceUuid.
             */
            public Builder resourceUuid(String resourceUuid) {
                this.resourceUuid = resourceUuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
