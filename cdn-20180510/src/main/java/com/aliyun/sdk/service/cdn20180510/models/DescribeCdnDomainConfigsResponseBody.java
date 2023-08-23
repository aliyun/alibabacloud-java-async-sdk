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
         * The configurations of the domain name.
         */
        public Builder domainConfigs(DomainConfigs domainConfigs) {
            this.domainConfigs = domainConfigs;
            return this;
        }

        /**
         * The ID of the request.
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
             * The parameter name, which is the configuration item of **functionName**. You can configure multiple configuration items.
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * The parameter value, which is the value of the configuration item of **functionName**.
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

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("Status")
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
             * The ID of the configuration.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * The configuration of each feature.
             */
            public Builder functionArgs(FunctionArgs functionArgs) {
                this.functionArgs = functionArgs;
                return this;
            }

            /**
             * The name of the feature.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The ID of the rule condition. This parameter is optional.
             * <p>
             * 
             * To create a rule condition, you can configure the **condition** feature that is described in the [Parameters for configuring features for domain names](~~388460~~) topic. A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. Each rule condition has a [ConfigId](~~388994~~). You can use ConfigId as ParentId that is referenced by other features. This way, you can combine rule conditions and features for flexible configurations.
             * 
             * For more information, see [BatchSetCdnDomainConfig](~~90915~~) or ParentId configuration example in this topic.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The status of the configuration. Valid values:
             * <p>
             * 
             * *   **success**
             * *   **testing**
             * *   **failed**
             * *   **configuring**
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
