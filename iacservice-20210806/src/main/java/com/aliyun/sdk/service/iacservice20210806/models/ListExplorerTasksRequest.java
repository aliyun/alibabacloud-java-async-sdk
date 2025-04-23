// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListExplorerTasksRequest} extends {@link RequestModel}
 *
 * <p>ListExplorerTasksRequest</p>
 */
public class ListExplorerTasksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("explorerTaskId")
    private String explorerTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResult")
    private String maxResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("moduleId")
    private String moduleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListExplorerTasksRequest(Builder builder) {
        super(builder);
        this.explorerTaskId = builder.explorerTaskId;
        this.keyword = builder.keyword;
        this.maxResult = builder.maxResult;
        this.moduleId = builder.moduleId;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExplorerTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explorerTaskId
     */
    public String getExplorerTaskId() {
        return this.explorerTaskId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResult
     */
    public String getMaxResult() {
        return this.maxResult;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListExplorerTasksRequest, Builder> {
        private String explorerTaskId; 
        private String keyword; 
        private String maxResult; 
        private String moduleId; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListExplorerTasksRequest request) {
            super(request);
            this.explorerTaskId = request.explorerTaskId;
            this.keyword = request.keyword;
            this.maxResult = request.maxResult;
            this.moduleId = request.moduleId;
            this.nextToken = request.nextToken;
        } 

        /**
         * explorerTaskId.
         */
        public Builder explorerTaskId(String explorerTaskId) {
            this.putPathParameter("explorerTaskId", explorerTaskId);
            this.explorerTaskId = explorerTaskId;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * maxResult.
         */
        public Builder maxResult(String maxResult) {
            this.putQueryParameter("maxResult", maxResult);
            this.maxResult = maxResult;
            return this;
        }

        /**
         * moduleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("moduleId", moduleId);
            this.moduleId = moduleId;
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

        @Override
        public ListExplorerTasksRequest build() {
            return new ListExplorerTasksRequest(this);
        } 

    } 

}
