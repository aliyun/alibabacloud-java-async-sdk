// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserConfigsResponseBody</p>
 */
public class DescribeUserConfigsResponseBody extends TeaModel {
    @NameInMap("Configs")
    private Configs configs;

    @NameInMap("RequestId")
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
         * Configs.
         */
        public Builder configs(Configs configs) {
            this.configs = configs;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Enable")
        private String enable;

        @NameInMap("Prefix")
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
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Prefix.
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
        @NameInMap("Enable")
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
             * Enable.
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
        @NameInMap("OssLogConfig")
        private OssLogConfig ossLogConfig;

        @NameInMap("WafConfig")
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
             * OssLogConfig.
             */
            public Builder ossLogConfig(OssLogConfig ossLogConfig) {
                this.ossLogConfig = ossLogConfig;
                return this;
            }

            /**
             * WafConfig.
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
