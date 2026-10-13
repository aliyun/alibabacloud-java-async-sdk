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
 * {@link ListDevelopersRequest} extends {@link RequestModel}
 *
 * <p>ListDevelopersRequest</p>
 */
public class ListDevelopersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private ListDevelopersRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.portalId = builder.portalId;
        this.status = builder.status;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevelopersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListDevelopersRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String portalId; 
        private String status; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListDevelopersRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.portalId = request.portalId;
            this.status = request.status;
            this.username = request.username;
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
         * <p>The pagination cursor. Pass the nextToken value returned in the previous response to retrieve the next page. Do not pass this parameter for the first query.</p>
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
         * <p>The page number.</p>
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
         * <p>The page size.</p>
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
         * <p>The ID of the portal used to filter developers.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        public Builder portalId(String portalId) {
            this.putQueryParameter("portalId", portalId);
            this.portalId = portalId;
            return this;
        }

        /**
         * <p>The status of the developer used to filter developers. Valid values: PENDING, APPROVED, and REJECTED.</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The logon username of the developer used to filter developers.</p>
         * 
         * <strong>example:</strong>
         * <p>developer-demo</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListDevelopersRequest build() {
            return new ListDevelopersRequest(this);
        } 

    } 

}
