// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserConfigsResponseBody</p>
 */
public class DescribeUserConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private Configs configs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public Configs getConfigs() {
        return this.configs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Configs configs; 
        private String requestId; 

        /**
         * The configurations of the specified feature.
         */
        public Builder configs(Configs configs) {
            this.configs = configs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserConfigsResponseBody build() {
            return new DescribeUserConfigsResponseBody(this);
        } 

    } 

    public static class OssLogConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        private OssLogConfig(Builder builder) {
            this.bucket = builder.bucket;
            this.enable = builder.enable;
            this.prefix = builder.prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssLogConfig create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        public static final class Builder {
            private String bucket; 
            private String enable; 
            private String prefix; 

            /**
             * The name of the bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Indicates whether the OSS bucket is enabled.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            public OssLogConfig build() {
                return new OssLogConfig(this);
            } 

        } 

    }
    public static class WafConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        private WafConfig(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WafConfig create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String enable; 

            /**
             * Indicates whether WAF is enabled.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            public WafConfig build() {
                return new WafConfig(this);
            } 

        } 

    }
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssLogConfig")
        private OssLogConfig ossLogConfig;

        @com.aliyun.core.annotation.NameInMap("WafConfig")
        private WafConfig wafConfig;

        private Configs(Builder builder) {
            this.ossLogConfig = builder.ossLogConfig;
            this.wafConfig = builder.wafConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return ossLogConfig
         */
        public OssLogConfig getOssLogConfig() {
            return this.ossLogConfig;
        }

        /**
         * @return wafConfig
         */
        public WafConfig getWafConfig() {
            return this.wafConfig;
        }

        public static final class Builder {
            private OssLogConfig ossLogConfig; 
            private WafConfig wafConfig; 

            /**
             * The configurations of Object Storage Service (OSS).
             */
            public Builder ossLogConfig(OssLogConfig ossLogConfig) {
                this.ossLogConfig = ossLogConfig;
                return this;
            }

            /**
             * The configurations of Web Application Firewall (WAF).
             */
            public Builder wafConfig(WafConfig wafConfig) {
                this.wafConfig = wafConfig;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
