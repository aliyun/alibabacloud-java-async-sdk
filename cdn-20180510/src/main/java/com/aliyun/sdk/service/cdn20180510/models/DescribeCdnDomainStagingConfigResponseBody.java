// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnDomainStagingConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainStagingConfigResponseBody</p>
 */
public class DescribeCdnDomainStagingConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigs")
    private java.util.List < DomainConfigs> domainConfigs;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnDomainStagingConfigResponseBody(Builder builder) {
        this.domainConfigs = builder.domainConfigs;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainStagingConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainConfigs
     */
    public java.util.List < DomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainConfigs> domainConfigs; 
        private String domainName; 
        private String requestId; 

        /**
         * <p>The domain name configurations.</p>
         */
        public Builder domainConfigs(java.util.List < DomainConfigs> domainConfigs) {
            this.domainConfigs = domainConfigs;
            return this;
        }

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C80705BF-0F76-41FA-BAD1-5B59296A4E59</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnDomainStagingConfigResponseBody build() {
            return new DescribeCdnDomainStagingConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnDomainStagingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainStagingConfigResponseBody</p>
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
             * <p>The configuration name.</p>
             * 
             * <strong>example:</strong>
             * <p>auth_type</p>
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * <p>The configuration value.</p>
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
     * {@link DescribeCdnDomainStagingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainStagingConfigResponseBody</p>
     */
    public static class DomainConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

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
            private java.util.List < FunctionArgs> functionArgs; 
            private String functionName; 
            private String parentId; 
            private String status; 

            /**
             * <p>The configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6xx5</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The description of each feature.</p>
             */
            public Builder functionArgs(java.util.List < FunctionArgs> functionArgs) {
                this.functionArgs = functionArgs;
                return this;
            }

            /**
             * <p>The feature name.</p>
             * 
             * <strong>example:</strong>
             * <p>aliauth</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The rule condition ID. This parameter is optional. To create a rule condition, you can configure the <strong>condition</strong> feature that is described in the <a href="https://help.aliyun.com/document_detail/388460.html">Parameters for configuring features for domain names</a> topic. A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. Each rule condition has a <a href="https://help.aliyun.com/document_detail/388994.html">ConfigId</a>. You can reference ConfigId instead of ParentId in other features. This way, you can combine rule conditions and features for flexible configurations. For more information, see <a href="https://help.aliyun.com/document_detail/90915.html">BatchSetCdnDomainConfig</a> or ParentId configuration example in this topic.</p>
             * 
             * <strong>example:</strong>
             * <p>222728944812032</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The configuration status. Valid values:</p>
             * <ul>
             * <li><strong>testing</strong></li>
             * <li><strong>configuring</strong></li>
             * <li><strong>success</strong></li>
             * <li><strong>failed</strong></li>
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
