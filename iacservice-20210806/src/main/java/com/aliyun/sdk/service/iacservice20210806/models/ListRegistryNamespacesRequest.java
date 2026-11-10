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
 * {@link ListRegistryNamespacesRequest} extends {@link RequestModel}
 *
 * <p>ListRegistryNamespacesRequest</p>
 */
public class ListRegistryNamespacesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListRegistryNamespacesRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegistryNamespacesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListRegistryNamespacesRequest, Builder> {
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListRegistryNamespacesRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.type = request.type;
        } 

        /**
         * <p>The search keyword. Fuzzy match is supported for workspace names.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The number of entries per page for a paging query. Maximum value: 100. Default value: 20.</p>
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
         * <p>The query token. Set the value to the NextToken value returned from the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>hg7nXVngyM6tQtvCagmtY=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The workspace type. Valid values:</p>
         * <ul>
         * <li>system: public workspace</li>
         * <li>self: custom workspace</li>
         * <li>shared: shared workspace</li>
         * <li>community: community workspace
         * By default, all types are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>self</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListRegistryNamespacesRequest build() {
            return new ListRegistryNamespacesRequest(this);
        } 

    } 

}
