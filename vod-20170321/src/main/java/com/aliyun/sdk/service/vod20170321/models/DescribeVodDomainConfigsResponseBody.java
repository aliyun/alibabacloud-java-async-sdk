// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVodDomainConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainConfigsResponseBody</p>
 */
public class DescribeVodDomainConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigs")
    private DomainConfigs domainConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainConfigsResponseBody(Builder builder) {
        this.domainConfigs = builder.domainConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainConfigsResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8AA0364-0FDB-4AD5-****-D69FAB8924ED</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainConfigsResponseBody build() {
            return new DescribeVodDomainConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainConfigsResponseBody</p>
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
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>file_type</p>
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>txt</p>
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
     * {@link DescribeVodDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainConfigsResponseBody</p>
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
     * {@link DescribeVodDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainConfigsResponseBody</p>
     */
    public static class DomainConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("FunctionArgs")
        private FunctionArgs functionArgs;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DomainConfig(Builder builder) {
            this.configId = builder.configId;
            this.functionArgs = builder.functionArgs;
            this.functionName = builder.functionName;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String configId; 
            private FunctionArgs functionArgs; 
            private String functionName; 
            private String status; 

            /**
             * <p>The configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5003576</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The feature parameters.</p>
             */
            public Builder functionArgs(FunctionArgs functionArgs) {
                this.functionArgs = functionArgs;
                return this;
            }

            /**
             * <p>The feature name.</p>
             * 
             * <strong>example:</strong>
             * <p>set_req_host_header</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The configuration status. Valid values:</p>
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
     * {@link DescribeVodDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainConfigsResponseBody</p>
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
