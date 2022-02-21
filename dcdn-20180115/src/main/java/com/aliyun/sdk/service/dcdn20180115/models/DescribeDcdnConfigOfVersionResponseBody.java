// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnConfigOfVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnConfigOfVersionResponseBody</p>
 */
public class DescribeDcdnConfigOfVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VersionConfigs")
    private VersionConfigs versionConfigs;

    private DescribeDcdnConfigOfVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionConfigs = builder.versionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnConfigOfVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versionConfigs
     */
    public VersionConfigs getVersionConfigs() {
        return this.versionConfigs;
    }

    public static final class Builder {
        private String requestId; 
        private VersionConfigs versionConfigs; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VersionConfigs.
         */
        public Builder versionConfigs(VersionConfigs versionConfigs) {
            this.versionConfigs = versionConfigs;
            return this;
        }

        public DescribeDcdnConfigOfVersionResponseBody build() {
            return new DescribeDcdnConfigOfVersionResponseBody(this);
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
    public static class VersionConfig extends TeaModel {
        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("FunctionArgs")
        private FunctionArgs functionArgs;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Status")
        private String status;

        private VersionConfig(Builder builder) {
            this.configId = builder.configId;
            this.functionArgs = builder.functionArgs;
            this.functionName = builder.functionName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionConfig create() {
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

            public VersionConfig build() {
                return new VersionConfig(this);
            } 

        } 

    }
    public static class VersionConfigs extends TeaModel {
        @NameInMap("VersionConfig")
        private java.util.List < VersionConfig> versionConfig;

        private VersionConfigs(Builder builder) {
            this.versionConfig = builder.versionConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionConfigs create() {
            return builder().build();
        }

        /**
         * @return versionConfig
         */
        public java.util.List < VersionConfig> getVersionConfig() {
            return this.versionConfig;
        }

        public static final class Builder {
            private java.util.List < VersionConfig> versionConfig; 

            /**
             * VersionConfig.
             */
            public Builder versionConfig(java.util.List < VersionConfig> versionConfig) {
                this.versionConfig = versionConfig;
                return this;
            }

            public VersionConfigs build() {
                return new VersionConfigs(this);
            } 

        } 

    }
}
