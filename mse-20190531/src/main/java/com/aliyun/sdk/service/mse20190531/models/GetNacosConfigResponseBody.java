// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNacosConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetNacosConfigResponseBody</p>
 */
public class GetNacosConfigResponseBody extends TeaModel {
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

    private GetNacosConfigResponseBody(Builder builder) {
        this.configuration = builder.configuration;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNacosConfigResponseBody create() {
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
         * The configuration information.
         */
        public Builder configuration(Configuration configuration) {
            this.configuration = configuration;
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

        public GetNacosConfigResponseBody build() {
            return new GetNacosConfigResponseBody(this);
        } 

    } 

    public static class Configuration extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("BetaIps")
        private String betaIps;

        @NameInMap("Content")
        private String content;

        @NameInMap("DataId")
        private String dataId;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("EncryptedDataKey")
        private String encryptedDataKey;

        @NameInMap("Group")
        private String group;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Type")
        private String type;

        private Configuration(Builder builder) {
            this.appName = builder.appName;
            this.betaIps = builder.betaIps;
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.desc = builder.desc;
            this.encryptedDataKey = builder.encryptedDataKey;
            this.group = builder.group;
            this.md5 = builder.md5;
            this.tags = builder.tags;
            this.type = builder.type;
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
         * @return betaIps
         */
        public String getBetaIps() {
            return this.betaIps;
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
         * @return desc
         */
        public String getDesc() {
            return this.desc;
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
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String appName; 
            private String betaIps; 
            private String content; 
            private String dataId; 
            private String desc; 
            private String encryptedDataKey; 
            private String group; 
            private String md5; 
            private String tags; 
            private String type; 

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The list of IP addresses where the beta release of the configuration is performed.
             */
            public Builder betaIps(String betaIps) {
                this.betaIps = betaIps;
                return this;
            }

            /**
             * The content of the configuration.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The ID of the configuration.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The description of the configuration.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The encryption key.
             */
            public Builder encryptedDataKey(String encryptedDataKey) {
                this.encryptedDataKey = encryptedDataKey;
                return this;
            }

            /**
             * The name of the configuration group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The message digest of the configuration.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * The tags of the configuration.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The format of the configuration.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
}
