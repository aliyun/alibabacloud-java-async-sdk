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
 * {@link ListProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProductsRequest</p>
 */
public class ListProductsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("categoryIds")
    private String categoryIds;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListProductsRequest(Builder builder) {
        super(builder);
        this.categoryIds = builder.categoryIds;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.portalId = builder.portalId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryIds
     */
    public String getCategoryIds() {
        return this.categoryIds;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListProductsRequest, Builder> {
        private String categoryIds; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String portalId; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListProductsRequest request) {
            super(request);
            this.categoryIds = request.categoryIds;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.portalId = request.portalId;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * <p>The product category IDs, which correspond to the Categories property of the API product resource. The members are category IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>category-xxxxxxxx</p>
         */
        public Builder categoryIds(String categoryIds) {
            this.putQueryParameter("categoryIds", categoryIds);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per request.</p>
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
         * <p>The name of the API product, which is the Name property of the API product resource. This is the same field as name in the response list items.</p>
         * 
         * <strong>example:</strong>
         * <p>weather-query-api</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The cursor token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-xxxxxxxx</p>
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
         * <p>The ID of the HiMarket developer portal where the API product is published, which corresponds to the PortalId property of the API product resource. This property is used only for list queries in the product resource definition.</p>
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
         * <p>The status of the API product, which corresponds to the Status property of the API product resource. This is the same field as status in the response list items. Valid values: Pending, Ready, and Published.</p>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the API product, which corresponds to the Type property of the API product resource. This is the same field as type in the response list items. The valid values are not declared in the API definition. Refer to the types displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListProductsRequest build() {
            return new ListProductsRequest(this);
        } 

    } 

}
