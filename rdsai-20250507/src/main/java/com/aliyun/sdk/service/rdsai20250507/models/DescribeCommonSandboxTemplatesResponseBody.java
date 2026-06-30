// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeCommonSandboxTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonSandboxTemplatesResponseBody</p>
 */
public class DescribeCommonSandboxTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private java.util.List<Templates> templates;

    private DescribeCommonSandboxTemplatesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonSandboxTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List<Templates> getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Templates> templates; 

        private Builder() {
        } 

        private Builder(DescribeCommonSandboxTemplatesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.templates = model.templates;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(java.util.List<Templates> templates) {
            this.templates = templates;
            return this;
        }

        public DescribeCommonSandboxTemplatesResponseBody build() {
            return new DescribeCommonSandboxTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommonSandboxTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonSandboxTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultCpu")
        private String defaultCpu;

        @com.aliyun.core.annotation.NameInMap("DefaultMemory")
        private String defaultMemory;

        @com.aliyun.core.annotation.NameInMap("DefaultReplicas")
        private Long defaultReplicas;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Templates(Builder builder) {
            this.defaultCpu = builder.defaultCpu;
            this.defaultMemory = builder.defaultMemory;
            this.defaultReplicas = builder.defaultReplicas;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return defaultCpu
         */
        public String getDefaultCpu() {
            return this.defaultCpu;
        }

        /**
         * @return defaultMemory
         */
        public String getDefaultMemory() {
            return this.defaultMemory;
        }

        /**
         * @return defaultReplicas
         */
        public Long getDefaultReplicas() {
            return this.defaultReplicas;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String defaultCpu; 
            private String defaultMemory; 
            private Long defaultReplicas; 
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.defaultCpu = model.defaultCpu;
                this.defaultMemory = model.defaultMemory;
                this.defaultReplicas = model.defaultReplicas;
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * DefaultCpu.
             */
            public Builder defaultCpu(String defaultCpu) {
                this.defaultCpu = defaultCpu;
                return this;
            }

            /**
             * DefaultMemory.
             */
            public Builder defaultMemory(String defaultMemory) {
                this.defaultMemory = defaultMemory;
                return this;
            }

            /**
             * DefaultReplicas.
             */
            public Builder defaultReplicas(Long defaultReplicas) {
                this.defaultReplicas = defaultReplicas;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
