// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ListDedicatedClusterRequest} extends {@link RequestModel}
 *
 * <p>ListDedicatedClusterRequest</p>
 */
public class ListDedicatedClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListDedicatedClusterRequest(Builder builder) {
        super(builder);
        this.orderColumn = builder.orderColumn;
        this.orderDirection = builder.orderDirection;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.params = builder.params;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.state = builder.state;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDedicatedClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
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
     * @return params
     */
    public String getParams() {
        return this.params;
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

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListDedicatedClusterRequest, Builder> {
        private String orderColumn; 
        private String orderDirection; 
        private String ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String params; 
        private String regionId; 
        private String resourceGroupId; 
        private String state; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListDedicatedClusterRequest request) {
            super(request);
            this.orderColumn = request.orderColumn;
            this.orderDirection = request.orderDirection;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.params = request.params;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.state = request.state;
            this.type = request.type;
        } 

        /**
         * <p>The basis on which the retrieved entries are sorted if multiple DTS dedicated clusters are returned. Valid values:</p>
         * <ul>
         * <li><strong>gmtCreated</strong>: the time when a cluster was created.</li>
         * <li><strong>orderCount</strong>: the number of nodes in a cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gmtCreated</p>
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * <p>The order in which you want to sort the retrieved entries. Valid values:</p>
         * <ul>
         * <li>asc: sorts the retrieved entries in ascending order. This is the default value.</li>
         * <li>desc: sorts the retrieved entries in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("OrderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of the page to return. The value of this parameter must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
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
         * <p>The number of clusters to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The content of the query condition.</p>
         * <blockquote>
         * <p> You must set the <strong>Type parameter</strong> to specify the type of the query condition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtspk3f13r731m****</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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
         * <p>rg-acfntftbiobqyky</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The cluster is being initialized.</li>
         * <li><strong>schedule</strong>: The cluster is pending scheduling.</li>
         * <li><strong>running</strong>: The cluster is running.</li>
         * <li><strong>upgrade</strong>: The cluster is being upgraded.</li>
         * <li><strong>downgrade</strong>: The cluster is being downgraded.</li>
         * <li><strong>locked</strong>: The cluster is locked.</li>
         * <li><strong>releasing</strong>: The cluster is being released.</li>
         * <li><strong>released</strong>: The cluster is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>init</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>The type of the query condition. Valid values:</p>
         * <ul>
         * <li><strong>NAME</strong>: the name of the cluster.</li>
         * <li><strong>INSTANCE</strong>: the ID of a cluster instance.</li>
         * <li><strong>DEDICAETEDCLUSTERID</strong>: the ID of a dedicated cluster.</li>
         * </ul>
         * <blockquote>
         * <p> You must specify the query condition by using the <strong>Params</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NAME</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListDedicatedClusterRequest build() {
            return new ListDedicatedClusterRequest(this);
        } 

    } 

}
