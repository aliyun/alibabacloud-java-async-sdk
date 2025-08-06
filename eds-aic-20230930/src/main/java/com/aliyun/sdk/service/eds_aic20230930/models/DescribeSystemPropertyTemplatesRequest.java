// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeSystemPropertyTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSystemPropertyTemplatesRequest</p>
 */
public class DescribeSystemPropertyTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    private java.util.List<String> templateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private DescribeSystemPropertyTemplatesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.templateIds = builder.templateIds;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemPropertyTemplatesRequest create() {
        return builder().build();
    }

@Override
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
     * @return templateIds
     */
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<DescribeSystemPropertyTemplatesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> templateIds; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSystemPropertyTemplatesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.templateIds = request.templateIds;
            this.templateName = request.templateName;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * TemplateIds.
         */
        public Builder templateIds(java.util.List<String> templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public DescribeSystemPropertyTemplatesRequest build() {
            return new DescribeSystemPropertyTemplatesRequest(this);
        } 

    } 

}
