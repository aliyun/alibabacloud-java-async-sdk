// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigurationResponseBody</p>
 */
public class DescribeConfigurationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Configuration")
    private Configuration configuration;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeConfigurationResponseBody(Builder builder) {
        this.code = builder.code;
        this.configuration = builder.configuration;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return configuration
     */
    public Configuration getConfiguration() {
        return this.configuration;
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

    public static final class Builder {
        private String code; 
        private Configuration configuration; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Configuration.
         */
        public Builder configuration(Configuration configuration) {
            this.configuration = configuration;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigurationResponseBody build() {
            return new DescribeConfigurationResponseBody(this);
        } 

    } 

    public static class Configuration extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("Content")
        private String content;

        @NameInMap("DataId")
        private String dataId;

        @NameInMap("Desc")
        private String desc;

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
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.desc = builder.desc;
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
            private String content; 
            private String dataId; 
            private String desc; 
            private String group; 
            private String md5; 
            private String tags; 
            private String type; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Type.
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
