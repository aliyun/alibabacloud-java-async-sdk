// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListTemplateVersionsRequest</p>
 */
public class ListTemplateVersionsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 10000, minimum = 1)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private ListTemplateVersionsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ListTemplateVersionsRequest, Builder> {
        private Long maxResults; 
        private String nextToken; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(ListTemplateVersionsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.templateId = request.templateId;
        } 

        /**
         * The maximum number of results to be returned in a single call when the NextToken parameter is used for the query.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 50.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The query token. Set the value to the NextToken value that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the template. This parameter applies to shared and private templates.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ListTemplateVersionsRequest build() {
            return new ListTemplateVersionsRequest(this);
        } 

    } 

}
