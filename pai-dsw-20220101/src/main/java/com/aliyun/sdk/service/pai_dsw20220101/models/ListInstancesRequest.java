// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @Query
    @NameInMap("AcceleratorType")
    private String acceleratorType;

    @Query
    @NameInMap("Accessibility")
    private String accessibility;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("PaymentType")
    private String paymentType;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.acceleratorType = builder.acceleratorType;
        this.accessibility = builder.accessibility;
        this.instanceName = builder.instanceName;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paymentType = builder.paymentType;
        this.resourceId = builder.resourceId;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String acceleratorType; 
        private String accessibility; 
        private String instanceName; 
        private String order; 
        private Long pageNumber; 
        private Long pageSize; 
        private String paymentType; 
        private String resourceId; 
        private String sortBy; 
        private String status; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.acceleratorType = request.acceleratorType;
            this.accessibility = request.accessibility;
            this.instanceName = request.instanceName;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paymentType = request.paymentType;
            this.resourceId = request.resourceId;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putQueryParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * 实例名称
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 排列顺序
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * 页码
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页数量大小
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 排序字段
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * 实例状态
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * 工作空间Id
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
