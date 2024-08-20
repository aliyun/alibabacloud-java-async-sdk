// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDDomainConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRDDomainConfigResponseBody</p>
 */
public class DescribeRDDomainConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigs")
    private java.util.List < DomainConfigs> domainConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRDDomainConfigResponseBody(Builder builder) {
        this.domainConfigs = builder.domainConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRDDomainConfigResponseBody create() {
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
         * The configuration of the domain name.
         */
        public Builder domainConfigs(java.util.List < DomainConfigs> domainConfigs) {
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

        public DescribeRDDomainConfigResponseBody build() {
            return new DescribeRDDomainConfigResponseBody(this);
        } 

    } 

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
             * The name of the configuration.
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * The value of the configuration.
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
    public static class DomainConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("FunctionArgs")
        private java.util.List < FunctionArgs> functionArgs;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DomainConfigs(Builder builder) {
            this.configId = builder.configId;
            this.functionArgs = builder.functionArgs;
            this.functionName = builder.functionName;
            this.parentId = builder.parentId;
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
        public Long getConfigId() {
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
            private Long configId; 
            private java.util.List < FunctionArgs> functionArgs; 
            private String functionName; 
            private String parentId; 
            private String status; 

            /**
             * The ID of the configuration.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * The configurations of the features.
             */
            public Builder functionArgs(java.util.List < FunctionArgs> functionArgs) {
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
             * The ID of the advanced condition configuration.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The status. Valid values:
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

            public DomainConfigs build() {
                return new DomainConfigs(this);
            } 

        } 

    }
}
