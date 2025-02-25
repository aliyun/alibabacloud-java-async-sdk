// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestBackgroundResponseBody} extends {@link TeaModel}
 *
 * <p>RequestBackgroundResponseBody</p>
 */
public class RequestBackgroundResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RequestBackgroundResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestBackgroundResponseBody create() {
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
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

        public RequestBackgroundResponseBody build() {
            return new RequestBackgroundResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BgConfig")
        private java.util.Map < String, ? > bgConfig;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("FileType")
        private String fileType;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Open")
        private Boolean open;

        @NameInMap("ResourceUuid")
        private String resourceUuid;

        @NameInMap("Scope")
        private String scope;

        private Data(Builder builder) {
            this.bgConfig = builder.bgConfig;
            this.downloadUrl = builder.downloadUrl;
            this.fileType = builder.fileType;
            this.mode = builder.mode;
            this.open = builder.open;
            this.resourceUuid = builder.resourceUuid;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bgConfig
         */
        public java.util.Map < String, ? > getBgConfig() {
            return this.bgConfig;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return open
         */
        public Boolean getOpen() {
            return this.open;
        }

        /**
         * @return resourceUuid
         */
        public String getResourceUuid() {
            return this.resourceUuid;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private java.util.Map < String, ? > bgConfig; 
            private String downloadUrl; 
            private String fileType; 
            private String mode; 
            private Boolean open; 
            private String resourceUuid; 
            private String scope; 

            /**
             * BgConfig.
             */
            public Builder bgConfig(java.util.Map < String, ? > bgConfig) {
                this.bgConfig = bgConfig;
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
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Open.
             */
            public Builder open(Boolean open) {
                this.open = open;
                return this;
            }

            /**
             * ResourceUuid.
             */
            public Builder resourceUuid(String resourceUuid) {
                this.resourceUuid = resourceUuid;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
