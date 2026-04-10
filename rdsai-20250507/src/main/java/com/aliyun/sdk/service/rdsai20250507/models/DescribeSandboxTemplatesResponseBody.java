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
 * {@link DescribeSandboxTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSandboxTemplatesResponseBody</p>
 */
public class DescribeSandboxTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SandboxTemplates")
    private java.util.List<SandboxTemplates> sandboxTemplates;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSandboxTemplatesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sandboxTemplates = builder.sandboxTemplates;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSandboxTemplatesResponseBody create() {
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sandboxTemplates
     */
    public java.util.List<SandboxTemplates> getSandboxTemplates() {
        return this.sandboxTemplates;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<SandboxTemplates> sandboxTemplates; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSandboxTemplatesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sandboxTemplates = model.sandboxTemplates;
            this.totalCount = model.totalCount;
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
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SandboxTemplates.
         */
        public Builder sandboxTemplates(java.util.List<SandboxTemplates> sandboxTemplates) {
            this.sandboxTemplates = sandboxTemplates;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSandboxTemplatesResponseBody build() {
            return new DescribeSandboxTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSandboxTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSandboxTemplatesResponseBody</p>
     */
    public static class SandboxTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultCpu")
        private String defaultCpu;

        @com.aliyun.core.annotation.NameInMap("DefaultMemory")
        private String defaultMemory;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableVpcAccess")
        private String enableVpcAccess;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private SandboxTemplates(Builder builder) {
            this.defaultCpu = builder.defaultCpu;
            this.defaultMemory = builder.defaultMemory;
            this.description = builder.description;
            this.enableVpcAccess = builder.enableVpcAccess;
            this.name = builder.name;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SandboxTemplates create() {
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableVpcAccess
         */
        public String getEnableVpcAccess() {
            return this.enableVpcAccess;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String defaultCpu; 
            private String defaultMemory; 
            private String description; 
            private String enableVpcAccess; 
            private String name; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(SandboxTemplates model) {
                this.defaultCpu = model.defaultCpu;
                this.defaultMemory = model.defaultMemory;
                this.description = model.description;
                this.enableVpcAccess = model.enableVpcAccess;
                this.name = model.name;
                this.templateId = model.templateId;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnableVpcAccess.
             */
            public Builder enableVpcAccess(String enableVpcAccess) {
                this.enableVpcAccess = enableVpcAccess;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public SandboxTemplates build() {
                return new SandboxTemplates(this);
            } 

        } 

    }
}
