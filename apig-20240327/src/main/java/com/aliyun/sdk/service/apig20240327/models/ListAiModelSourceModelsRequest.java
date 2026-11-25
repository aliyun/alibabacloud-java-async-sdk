// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListAiModelSourceModelsRequest} extends {@link RequestModel}
 *
 * <p>ListAiModelSourceModelsRequest</p>
 */
public class ListAiModelSourceModelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelSourceId")
    private String modelSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListAiModelSourceModelsRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.modelSourceId = builder.modelSourceId;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAiModelSourceModelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return modelSourceId
     */
    public String getModelSourceId() {
        return this.modelSourceId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListAiModelSourceModelsRequest, Builder> {
        private String gatewayId; 
        private String keyword; 
        private Integer maxResults; 
        private String modelSourceId; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListAiModelSourceModelsRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.modelSourceId = request.modelSourceId;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The ID of the AI gateway instance to which the resource belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d00000000000000000000</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The search keyword used to match resources by name or identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>beta</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of results to return per page. Valid values: 1 to 100. This parameter is required. Token-based pagination does not use pageNumber or pageSize.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The ID of the model source. Use the modelSourceId returned by CreateAiModelSource.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-d00000000000000000000</p>
         */
        public Builder modelSourceId(String modelSourceId) {
            this.putQueryParameter("modelSourceId", modelSourceId);
            this.modelSourceId = modelSourceId;
            return this;
        }

        /**
         * <p>The pagination token returned from the previous page. Omit this parameter for the first page. The token is empty or omitted for the last page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListAiModelSourceModelsRequest build() {
            return new ListAiModelSourceModelsRequest(this);
        } 

    } 

}
