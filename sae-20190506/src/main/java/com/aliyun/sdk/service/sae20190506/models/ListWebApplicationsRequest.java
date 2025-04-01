// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListWebApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListWebApplicationsRequest</p>
 */
public class ListWebApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    private ListWebApplicationsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.namespaceId = builder.namespaceId;
        this.nextToken = builder.nextToken;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebApplicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder extends Request.Builder<ListWebApplicationsRequest, Builder> {
        private Integer limit; 
        private String namespaceId; 
        private String nextToken; 
        private String prefix; 

        private Builder() {
            super();
        } 

        private Builder(ListWebApplicationsRequest request) {
            super(request);
            this.limit = request.limit;
            this.namespaceId = request.namespaceId;
            this.nextToken = request.nextToken;
            this.prefix = request.prefix;
        } 

        /**
         * <p>The number of applications returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNCNhYmM</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The prefix of the application name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-application</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        @Override
        public ListWebApplicationsRequest build() {
            return new ListWebApplicationsRequest(this);
        } 

    } 

}
