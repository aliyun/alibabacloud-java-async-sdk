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
 * {@link ModelRouterGetClientBalanceLogsRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterGetClientBalanceLogsRequest</p>
 */
public class ModelRouterGetClientBalanceLogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("changeType")
    private String changeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    private ModelRouterGetClientBalanceLogsRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.changeType = builder.changeType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterGetClientBalanceLogsRequest create() {
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
     * @return changeType
     */
    public String getChangeType() {
        return this.changeType;
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
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ModelRouterGetClientBalanceLogsRequest, Builder> {
        private Long id; 
        private String changeType; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterGetClientBalanceLogsRequest request) {
            super(request);
            this.id = request.id;
            this.changeType = request.changeType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.size = request.size;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * changeType.
         */
        public Builder changeType(String changeType) {
            this.putQueryParameter("changeType", changeType);
            this.changeType = changeType;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ModelRouterGetClientBalanceLogsRequest build() {
            return new ModelRouterGetClientBalanceLogsRequest(this);
        } 

    } 

}
