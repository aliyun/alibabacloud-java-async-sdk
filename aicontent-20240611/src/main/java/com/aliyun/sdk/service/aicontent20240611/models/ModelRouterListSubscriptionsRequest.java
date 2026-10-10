// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterListSubscriptionsRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterListSubscriptionsRequest</p>
 */
public class ModelRouterListSubscriptionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("balanceType")
    private String balanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ModelRouterListSubscriptionsRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.balanceType = builder.balanceType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterListSubscriptionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return balanceType
     */
    public String getBalanceType() {
        return this.balanceType;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModelRouterListSubscriptionsRequest, Builder> {
        private Long id; 
        private String balanceType; 
        private Integer maxResults; 
        private String nextToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterListSubscriptionsRequest request) {
            super(request);
            this.id = request.id;
            this.balanceType = request.balanceType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
        } 

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Filters by balance type (permanent/monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>permanent</p>
         */
        public Builder balanceType(String balanceType) {
            this.putQueryParameter("balanceType", balanceType);
            this.balanceType = balanceType;
            return this;
        }

        /**
         * <p>The maximum number of results to return per page.</p>
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
         * <p>The pagination token. Do not specify this parameter for the first query. For subsequent queries, specify the value returned from the previous query. Set to &quot;&quot; when no more data is available. Set to &quot;5&quot; when there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;5&quot; or &quot;&quot;</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Filters by status (active/stopped).</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModelRouterListSubscriptionsRequest build() {
            return new ModelRouterListSubscriptionsRequest(this);
        } 

    } 

}
