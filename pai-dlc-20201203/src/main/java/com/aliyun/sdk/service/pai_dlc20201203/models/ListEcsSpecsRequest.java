// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListEcsSpecsRequest} extends {@link RequestModel}
 *
 * <p>ListEcsSpecsRequest</p>
 */
public class ListEcsSpecsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private String instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private ListEcsSpecsRequest(Builder builder) {
        super(builder);
        this.acceleratorType = builder.acceleratorType;
        this.instanceTypes = builder.instanceTypes;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcsSpecsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return instanceTypes
     */
    public String getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<ListEcsSpecsRequest, Builder> {
        private String acceleratorType; 
        private String instanceTypes; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceType; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(ListEcsSpecsRequest request) {
            super(request);
            this.acceleratorType = request.acceleratorType;
            this.instanceTypes = request.instanceTypes;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.sortBy = request.sortBy;
        } 

        /**
         * <p>Filter by accelerator type. Valid values:</p>
         * <ul>
         * <li>CPU</li>
         * <li>GPU</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putQueryParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * <p>The instance types to query. Separate the types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large,ecs.g6.xlarge</p>
         */
        public Builder instanceTypes(String instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The sorting order. Valid values:</p>
         * <ul>
         * <li>desc: descending order.</li>
         * <li>asc: ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The number of the page to query. The start value is 1.</p>
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
         * <p>The number of entries returned per page.</p>
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
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li>ECS</li>
         * <li>Lingjun</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The field based on which the results are sorted. Valid values:</p>
         * <ul>
         * <li>CPU</li>
         * <li>GPU</li>
         * <li>Memory</li>
         * <li>GmtCreateTime</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Gpu</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public ListEcsSpecsRequest build() {
            return new ListEcsSpecsRequest(this);
        } 

    } 

}
