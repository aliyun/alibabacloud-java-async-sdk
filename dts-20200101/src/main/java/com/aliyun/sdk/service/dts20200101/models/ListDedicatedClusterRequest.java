// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDedicatedClusterRequest} extends {@link RequestModel}
 *
 * <p>ListDedicatedClusterRequest</p>
 */
public class ListDedicatedClusterRequest extends Request {
    @Query
    @NameInMap("OrderColumn")
    private String orderColumn;

    @Query
    @NameInMap("OrderDirection")
    private String orderDirection;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("Type")
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
         * The basis on which the retrieved entries are sorted if multiple DTS dedicated clusters are returned. Valid values:
         * <p>
         * 
         * *   **gmtCreated**: the time when a cluster was created.
         * *   **orderCount**: the number of nodes in a cluster.
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * The order in which you want to sort the retrieved entries. Valid values:
         * <p>
         * 
         * *   asc: sorts the retrieved entries in ascending order. This is the default value.
         * *   desc: sorts the retrieved entries in descending order.
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
         * The number of the page to return. The value of this parameter must be an integer that is greater than 0. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of clusters to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The content of the query condition.
         * <p>
         * 
         * >  You must set the **Type parameter** to specify the type of the query condition.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The status of the cluster. Valid values:
         * <p>
         * 
         * *   **init**: The cluster is being initialized.
         * *   **schedule**: The cluster is pending scheduling.
         * *   **running**: The cluster is running.
         * *   **upgrade**: The cluster is being upgraded.
         * *   **downgrade**: The cluster is being downgraded.
         * *   **locked**: The cluster is locked.
         * *   **releasing**: The cluster is being released.
         * *   **released**: The cluster is released.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * The type of the query condition. Valid values:
         * <p>
         * 
         * *   **NAME**: the name of the cluster.
         * *   **INSTANCE**: the ID of a cluster instance.
         * *   **DEDICAETEDCLUSTERID**: the ID of a dedicated cluster.
         * 
         * >  You must specify the query condition by using the **Params** parameter.
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
