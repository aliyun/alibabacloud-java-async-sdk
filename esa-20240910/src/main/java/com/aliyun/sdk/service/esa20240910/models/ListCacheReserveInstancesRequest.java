// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCacheReserveInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListCacheReserveInstancesRequest</p>
 */
public class ListCacheReserveInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListCacheReserveInstancesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCacheReserveInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListCacheReserveInstancesRequest, Builder> {
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String sortOrder; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListCacheReserveInstancesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
            this.status = request.status;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListCacheReserveInstancesRequest build() {
            return new ListCacheReserveInstancesRequest(this);
        } 

    } 

}
