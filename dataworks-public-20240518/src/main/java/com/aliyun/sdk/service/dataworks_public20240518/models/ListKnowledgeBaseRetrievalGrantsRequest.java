// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListKnowledgeBaseRetrievalGrantsRequest} extends {@link RequestModel}
 *
 * <p>ListKnowledgeBaseRetrievalGrantsRequest</p>
 */
public class ListKnowledgeBaseRetrievalGrantsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 4096)
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String principalType;

    private ListKnowledgeBaseRetrievalGrantsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.principalType = builder.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBaseRetrievalGrantsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
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
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    public static final class Builder extends Request.Builder<ListKnowledgeBaseRetrievalGrantsRequest, Builder> {
        private String regionId; 
        private String knowledgeBaseId; 
        private Integer maxResults; 
        private String nextToken; 
        private String principalType; 

        private Builder() {
            super();
        } 

        private Builder(ListKnowledgeBaseRetrievalGrantsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.principalType = request.principalType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The knowledge base ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The number of entries per page. This parameter is optional. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The cursor returned from the previous page. Do not specify this parameter for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The type of the principal that receives the share. This parameter is optional. Default value: USER. Only USER is supported in the initial release.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder principalType(String principalType) {
            this.putBodyParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        @Override
        public ListKnowledgeBaseRetrievalGrantsRequest build() {
            return new ListKnowledgeBaseRetrievalGrantsRequest(this);
        } 

    } 

}
