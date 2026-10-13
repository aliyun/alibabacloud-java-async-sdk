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
 * {@link ListHiMarketConsumersRequest} extends {@link RequestModel}
 *
 * <p>ListHiMarketConsumersRequest</p>
 */
public class ListHiMarketConsumersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("developerId")
    private String developerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("portalId")
    private String portalId;

    private ListHiMarketConsumersRequest(Builder builder) {
        super(builder);
        this.developerId = builder.developerId;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.portalId = builder.portalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHiMarketConsumersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return developerId
     */
    public String getDeveloperId() {
        return this.developerId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return portalId
     */
    public String getPortalId() {
        return this.portalId;
    }

    public static final class Builder extends Request.Builder<ListHiMarketConsumersRequest, Builder> {
        private String developerId; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String portalId; 

        private Builder() {
            super();
        } 

        private Builder(ListHiMarketConsumersRequest request) {
            super(request);
            this.developerId = request.developerId;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.portalId = request.portalId;
        } 

        /**
         * <p>The developer ID. This parameter is used to filter consumers by developer.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-xxxxxxxx</p>
         */
        public Builder developerId(String developerId) {
            this.putQueryParameter("developerId", developerId);
            this.developerId = developerId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. The default value and valid values are not specified in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The search keyword for the consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The pagination token. To retrieve the next page, pass the nextToken value returned in the previous response. Do not specify this parameter for the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>token-xxxxxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The portal ID. This parameter is used to filter consumers by portal.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        public Builder portalId(String portalId) {
            this.putQueryParameter("portalId", portalId);
            this.portalId = portalId;
            return this;
        }

        @Override
        public ListHiMarketConsumersRequest build() {
            return new ListHiMarketConsumersRequest(this);
        } 

    } 

}
