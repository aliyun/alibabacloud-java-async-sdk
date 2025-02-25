// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainStagingConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainStagingConfigResponseBody</p>
 */
public class DescribeDcdnDomainStagingConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigs")
    private java.util.List < DomainConfigs> domainConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainStagingConfigResponseBody(Builder builder) {
        this.domainConfigs = builder.domainConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainStagingConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainConfigs
     */
    public java.util.List < DomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainConfigs> domainConfigs; 
        private String requestId; 

        /**
         * <p>The configurations of accelerated domain names returned.</p>
         */
        public Builder domainConfigs(java.util.List < DomainConfigs> domainConfigs) {
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

        public DescribeDcdnDomainStagingConfigResponseBody build() {
            return new DescribeDcdnDomainStagingConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainStagingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainStagingConfigResponseBody</p>
     */
    public static class FunctionArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArgName")
        private String argName;

        @com.aliyun.core.annotation.NameInMap("ArgValue")
        private String argValue;

        private FunctionArgs(Builder builder) {
            this.argName = builder.argName;
            this.argValue = builder.argValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionArgs create() {
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
             * <p>The name of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>auth_type</p>
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * <p>The value of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>req_auth</p>
             */
            public Builder argValue(String argValue) {
                this.argValue = argValue;
                return this;
            }

            public FunctionArgs build() {
                return new FunctionArgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDomainStagingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainStagingConfigResponseBody</p>
     */
    public static class DomainConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("FunctionArgs")
        private java.util.List < FunctionArgs> functionArgs;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DomainConfigs(Builder builder) {
            this.configId = builder.configId;
            this.functionArgs = builder.functionArgs;
            this.functionName = builder.functionName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfigs create() {
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
        public java.util.List < FunctionArgs> getFunctionArgs() {
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
            private java.util.List < FunctionArgs> functionArgs; 
            private String functionName; 
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
             * <p>The following table describes the features.</p>
             */
            public Builder functionArgs(java.util.List < FunctionArgs> functionArgs) {
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
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>success: The configuration is successful.</li>
             * <li>testing: The configuration is under testing.</li>
             * <li>failed: The task failed.</li>
             * <li>configuring: The feature is being configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DomainConfigs build() {
                return new DomainConfigs(this);
            } 

        } 

    }
}
