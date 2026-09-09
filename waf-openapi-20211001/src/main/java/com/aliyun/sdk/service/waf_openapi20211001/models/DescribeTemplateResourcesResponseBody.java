// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeTemplateResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplateResourcesResponseBody</p>
 */
public class DescribeTemplateResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<String> resources;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTemplateResourcesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.templateId = builder.templateId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateResourcesResponseBody create() {
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
     * @return resources
     */
    public java.util.List<String> getResources() {
        return this.resources;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<String> resources; 
        private Long templateId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTemplateResourcesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.templateId = model.templateId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 500. Default value: 500.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token (Token) for the next page. If a next page exists, this field contains a value.</p>
         * <blockquote>
         * <p>If this parameter has a return value, a next page exists. Use the returned <strong>NextToken</strong> as a request parameter to retrieve the next page of data. Repeat until no value is returned, which indicates that all data has been retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAABLQv******37sHZaHk4=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7BC9373-3960-53B0-8968-2B13454AE18F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of bound protected object names, protected object group names, or protected asset IDs.</p>
         */
        public Builder resources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The ID of the protection template.</p>
         * 
         * <strong>example:</strong>
         * <p>168465</p>
         */
        public Builder templateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTemplateResourcesResponseBody build() {
            return new DescribeTemplateResourcesResponseBody(this);
        } 

    } 

}
