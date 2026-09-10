// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ListOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListOrdersRequest</p>
 */
public class ListOrdersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderStatus")
    private String orderStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ListOrdersRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderStatus = builder.orderStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrdersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return orderStatus
     */
    public String getOrderStatus() {
        return this.orderStatus;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListOrdersRequest, Builder> {
        private String category; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productCode; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListOrdersRequest request) {
            super(request);
            this.category = request.category;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderStatus = request.orderStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/183258.html">edition</a> of the cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Cluster Edition</p>
         * </li>
         * <li><p><strong>Basic</strong>: single node</p>
         * </li>
         * <li><p><strong>Archive</strong>: X-Engine</p>
         * </li>
         * <li><p><strong>NormalMultimaster</strong>: Multi-master Cluster Edition</p>
         * </li>
         * <li><p><strong>SENormal</strong>: Standard Edition</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>The single node edition is not supported on PolarDB for PostgreSQL clusters that run PostgreSQL 11.</p>
         * </li>
         * <li><p>The Standard Edition is supported on PolarDB for MySQL clusters that run MySQL 8.0 or 5.7, and on PolarDB for PostgreSQL clusters that run PostgreSQL 14.</p>
         * </li>
         * <li><p>PolarDB for MySQL clusters that run MySQL 8.0 support X-Engine and the Multi-master Cluster Edition.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The ID of the current instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2zed3m89cw***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for the current request. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. If the query results are not returned in a single call, this token is returned. Use this token in a subsequent call to retrieve the remaining results.</p>
         * 
         * <strong>example:</strong>
         * <p>212db86sca4384811e0b5e8707e******</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The status of the order.</p>
         * <ul>
         * <li><p><strong>pending</strong>: The task is waiting to start.</p>
         * </li>
         * <li><p><strong>create</strong>: The order is placed and is being processed.</p>
         * </li>
         * <li><p><strong>fail</strong>: The instance failed to be created.</p>
         * </li>
         * <li><p><strong>cancel</strong>: The order is canceled.</p>
         * </li>
         * <li><p><strong>success</strong>: The instance is created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder orderStatus(String orderStatus) {
            this.putQueryParameter("OrderStatus", orderStatus);
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to view the details of regions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListOrdersRequest build() {
            return new ListOrdersRequest(this);
        } 

    } 

}
