// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainConfigsResponseBody</p>
 */
public class DescribeCdnDomainConfigsResponseBody extends TeaModel {
    @NameInMap("DomainConfigs")
    private DomainConfigs domainConfigs;

    @NameInMap("RequestId")
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
         * DomainConfigs.
         */
        public Builder domainConfigs(DomainConfigs domainConfigs) {
            this.domainConfigs = domainConfigs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnDomainConfigsResponseBody build() {
            return new DescribeCdnDomainConfigsResponseBody(this);
        } 

    } 

    public static class FunctionArg extends TeaModel {
        @NameInMap("ArgName")
        private String argName;

        @NameInMap("ArgValue")
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
             * ArgName.
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * ArgValue.
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
    public static class FunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
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
    public static class DomainConfig extends TeaModel {
        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("FunctionArgs")
        private FunctionArgs functionArgs;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Status")
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
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * FunctionArgs.
             */
            public Builder functionArgs(FunctionArgs functionArgs) {
                this.functionArgs = functionArgs;
                return this;
            }

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * Status.
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
    public static class DomainConfigs extends TeaModel {
        @NameInMap("DomainConfig")
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
