// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVodDomainStagingConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainStagingConfigResponseBody</p>
 */
public class DescribeVodDomainStagingConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigs")
    private java.util.List<DomainConfigs> domainConfigs;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainStagingConfigResponseBody(Builder builder) {
        this.domainConfigs = builder.domainConfigs;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainStagingConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainConfigs
     */
    public java.util.List<DomainConfigs> getDomainConfigs() {
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
        private java.util.List<DomainConfigs> domainConfigs; 
        private String domainName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVodDomainStagingConfigResponseBody model) {
            this.domainConfigs = model.domainConfigs;
            this.domainName = model.domainName;
            this.requestId = model.requestId;
        } 

        /**
         * DomainConfigs.
         */
        public Builder domainConfigs(java.util.List<DomainConfigs> domainConfigs) {
            this.domainConfigs = domainConfigs;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainStagingConfigResponseBody build() {
            return new DescribeVodDomainStagingConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainStagingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainStagingConfigResponseBody</p>
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

            private Builder() {
            } 

            private Builder(FunctionArgs model) {
                this.argName = model.argName;
                this.argValue = model.argValue;
            } 

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

            public FunctionArgs build() {
                return new FunctionArgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainStagingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainStagingConfigResponseBody</p>
     */
    public static class DomainConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("FunctionArgs")
        private java.util.List<FunctionArgs> functionArgs;

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
        public java.util.List<FunctionArgs> getFunctionArgs() {
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
            private java.util.List<FunctionArgs> functionArgs; 
            private String functionName; 
            private String parentId; 
            private String status; 

            private Builder() {
            } 

            private Builder(DomainConfigs model) {
                this.configId = model.configId;
                this.functionArgs = model.functionArgs;
                this.functionName = model.functionName;
                this.parentId = model.parentId;
                this.status = model.status;
            } 

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
            public Builder functionArgs(java.util.List<FunctionArgs> functionArgs) {
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
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Status.
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
