// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetNacosConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetNacosConfigResponseBody</p>
 */
public class GetNacosConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private Configuration configuration;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The configuration information.</p>
         */
        public Builder configuration(Configuration configuration) {
            this.configuration = configuration;
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
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B4EAB48C-BB4B-5B8D-B33B-35D69606C5AD</p>
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

        public GetNacosConfigResponseBody build() {
            return new GetNacosConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNacosConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosConfigResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BetaIps")
        private String betaIps;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("EncryptedDataKey")
        private String encryptedDataKey;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The list of IP addresses where the beta release of the configuration is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.XX.XX,2.2.XX.XX</p>
             */
            public Builder betaIps(String betaIps) {
                this.betaIps = betaIps;
                return this;
            }

            /**
             * <p>The content of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>log.level=error</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The ID of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>log.yaml</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The description of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>For testing</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The encryption key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder encryptedDataKey(String encryptedDataKey) {
                this.encryptedDataKey = encryptedDataKey;
                return this;
            }

            /**
             * <p>The name of the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The message digest of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>123rfsdf3</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The tags of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>context</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The format of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
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
