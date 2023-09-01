// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNacosHistoryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetNacosHistoryConfigResponseBody</p>
 */
public class GetNacosHistoryConfigResponseBody extends TeaModel {
    @NameInMap("Configuration")
    private Configuration configuration;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetNacosHistoryConfigResponseBody(Builder builder) {
        this.configuration = builder.configuration;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNacosHistoryConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return configuration
     */
    public Configuration getConfiguration() {
        return this.configuration;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private Configuration configuration; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The name of the application.
         */
        public Builder configuration(Configuration configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The request was successfully processed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The configuration information.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * mse-200-105
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetNacosHistoryConfigResponseBody build() {
            return new GetNacosHistoryConfigResponseBody(this);
        } 

    } 

    public static class Configuration extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("Content")
        private String content;

        @NameInMap("DataId")
        private String dataId;

        @NameInMap("EncryptedDataKey")
        private String encryptedDataKey;

        @NameInMap("Group")
        private String group;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("OpType")
        private String opType;

        private Configuration(Builder builder) {
            this.appName = builder.appName;
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.encryptedDataKey = builder.encryptedDataKey;
            this.group = builder.group;
            this.md5 = builder.md5;
            this.opType = builder.opType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return encryptedDataKey
         */
        public String getEncryptedDataKey() {
            return this.encryptedDataKey;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        public static final class Builder {
            private String appName; 
            private String content; 
            private String dataId; 
            private String encryptedDataKey; 
            private String group; 
            private String md5; 
            private String opType; 

            /**
             * The MD5 value of the configuration.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The name of the configuration group.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The content of the configuration.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The error code returned if the request failed.
             */
            public Builder encryptedDataKey(String encryptedDataKey) {
                this.encryptedDataKey = encryptedDataKey;
                return this;
            }

            /**
             * The configuration type.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The ID of the configuration.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * The encryption key.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
}
