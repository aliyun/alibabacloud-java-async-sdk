// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnDomainConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainConfigsResponseBody</p>
 */
public class DescribeCdnDomainConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigs")
    private DomainConfigs domainConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnDomainConfigsResponseBody(Builder builder) {
        this.domainConfigs = builder.domainConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainConfigs
     */
    public DomainConfigs getDomainConfigs() {
        return this.domainConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainConfigs domainConfigs; 
        private String requestId; 

        /**
         * <p>The configurations of the domain name.</p>
         */
        public Builder domainConfigs(DomainConfigs domainConfigs) {
            this.domainConfigs = domainConfigs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C80705BF-0F76-41FA-BAD1-5B59296A4E59</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnDomainConfigsResponseBody build() {
            return new DescribeCdnDomainConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainConfigsResponseBody</p>
     */
    public static class FunctionArg extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArgName")
        private String argName;

        @com.aliyun.core.annotation.NameInMap("ArgValue")
        private String argValue;

        private FunctionArg(Builder builder) {
            this.argName = builder.argName;
            this.argValue = builder.argValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionArg create() {
            return builder().build();
        }

        /**
         * @return argName
         */
        public String getArgName() {
            return this.argName;
        }

        /**
         * @return argValue
         */
        public String getArgValue() {
            return this.argValue;
        }

        public static final class Builder {
            private String argName; 
            private String argValue; 

            /**
             * <p>The parameter name, which is the configuration item of <strong>functionName</strong>. You can configure multiple configuration items.</p>
             * 
             * <strong>example:</strong>
             * <p>auth_type</p>
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * <p>The parameter value, which is the value of the configuration item of <strong>functionName</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>req_auth</p>
             */
            public Builder argValue(String argValue) {
                this.argValue = argValue;
                return this;
            }

            public FunctionArg build() {
                return new FunctionArg(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainConfigsResponseBody</p>
     */
    public static class FunctionArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionArg")
        private java.util.List < FunctionArg> functionArg;

        private FunctionArgs(Builder builder) {
            this.functionArg = builder.functionArg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionArgs create() {
            return builder().build();
        }

        /**
         * @return functionArg
         */
        public java.util.List < FunctionArg> getFunctionArg() {
            return this.functionArg;
        }

        public static final class Builder {
            private java.util.List < FunctionArg> functionArg; 

            /**
             * FunctionArg.
             */
            public Builder functionArg(java.util.List < FunctionArg> functionArg) {
                this.functionArg = functionArg;
                return this;
            }

            public FunctionArgs build() {
                return new FunctionArgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainConfigsResponseBody</p>
     */
    public static class DomainConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("FunctionArgs")
        private FunctionArgs functionArgs;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DomainConfig(Builder builder) {
            this.configId = builder.configId;
            this.functionArgs = builder.functionArgs;
            this.functionName = builder.functionName;
            this.parentId = builder.parentId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfig create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return functionArgs
         */
        public FunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String configId; 
            private FunctionArgs functionArgs; 
            private String functionName; 
            private String parentId; 
            private String status; 

            /**
             * <p>The ID of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>6295</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The configuration of each feature.</p>
             */
            public Builder functionArgs(FunctionArgs functionArgs) {
                this.functionArgs = functionArgs;
                return this;
            }

            /**
             * <p>The name of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>aliauth</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The ID of the rule condition. This parameter is optional.</p>
             * <p>To create a rule condition, you can configure the <strong>condition</strong> feature that is described in the <a href="https://help.aliyun.com/document_detail/388460.html">Parameters for configuring features for domain names</a> topic. A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. Each rule condition has a <a href="https://help.aliyun.com/document_detail/388994.html">ConfigId</a>. You can use ConfigId as ParentId that is referenced by other features. This way, you can combine rule conditions and features for flexible configurations.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/90915.html">BatchSetCdnDomainConfig</a> or ParentId configuration example in this topic.</p>
             * 
             * <strong>example:</strong>
             * <p>222728944812032</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The status of the configuration. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>testing</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>configuring</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DomainConfig build() {
                return new DomainConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainConfigsResponseBody</p>
     */
    public static class DomainConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainConfig")
        private java.util.List < DomainConfig> domainConfig;

        private DomainConfigs(Builder builder) {
            this.domainConfig = builder.domainConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfigs create() {
            return builder().build();
        }

        /**
         * @return domainConfig
         */
        public java.util.List < DomainConfig> getDomainConfig() {
            return this.domainConfig;
        }

        public static final class Builder {
            private java.util.List < DomainConfig> domainConfig; 

            /**
             * DomainConfig.
             */
            public Builder domainConfig(java.util.List < DomainConfig> domainConfig) {
                this.domainConfig = domainConfig;
                return this;
            }

            public DomainConfigs build() {
                return new DomainConfigs(this);
            } 

        } 

    }
}
