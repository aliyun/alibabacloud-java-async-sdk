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
 * {@link ListWebCustomDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListWebCustomDomainsRequest</p>
 */
public class ListWebCustomDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

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

    private ListWebCustomDomainsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.limit = builder.limit;
        this.namespaceId = builder.namespaceId;
        this.nextToken = builder.nextToken;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebCustomDomainsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
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

    public static final class Builder extends Request.Builder<ListWebCustomDomainsRequest, Builder> {
        private String applicationId; 
        private Integer limit; 
        private String namespaceId; 
        private String nextToken; 
        private String prefix; 

        private Builder() {
            super();
        } 

        private Builder(ListWebCustomDomainsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.limit = request.limit;
            this.namespaceId = request.namespaceId;
            this.nextToken = request.nextToken;
            this.prefix = request.prefix;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7e41aff0-9eca-45c9-ac48-675e09******</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The number of custom domain names returned.</p>
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
         * <p>cn-hangzhou</p>
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
         * <p>A2RN</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The prefix of the custom domain name that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>remoteresult</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        @Override
        public ListWebCustomDomainsRequest build() {
            return new ListWebCustomDomainsRequest(this);
        } 

    } 

}
