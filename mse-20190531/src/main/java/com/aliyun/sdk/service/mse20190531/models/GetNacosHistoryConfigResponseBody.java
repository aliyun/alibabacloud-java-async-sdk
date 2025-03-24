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
 * {@link GetNacosHistoryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetNacosHistoryConfigResponseBody</p>
 */
public class GetNacosHistoryConfigResponseBody extends TeaModel {
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
         * <p>NoPermission</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>69AD2AA7-DB47-449B-941B-B14409DF****</p>
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

        public GetNacosHistoryConfigResponseBody build() {
            return new GetNacosHistoryConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNacosHistoryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosHistoryConfigResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("EncryptedDataKey")
        private String encryptedDataKey;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("OpType")
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
             * <p>The content of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The ID of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>test.yaml</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The encryption key.</p>
             * 
             * <strong>example:</strong>
             * <p>23fds****</p>
             */
            public Builder encryptedDataKey(String encryptedDataKey) {
                this.encryptedDataKey = encryptedDataKey;
                return this;
            }

            /**
             * <p>The name of the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The MD5 value of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>23sdf32f****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The configuration type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
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
