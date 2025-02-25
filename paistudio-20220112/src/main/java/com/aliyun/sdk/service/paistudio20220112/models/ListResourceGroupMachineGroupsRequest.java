// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListResourceGroupMachineGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupMachineGroupsRequest</p>
 */
public class ListResourceGroupMachineGroupsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorID")
    private String creatorID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderInstanceId")
    private String orderInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    private String paymentDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListResourceGroupMachineGroupsRequest(Builder builder) {
        super(builder);
        this.resourceGroupID = builder.resourceGroupID;
        this.creatorID = builder.creatorID;
        this.ecsSpec = builder.ecsSpec;
        this.name = builder.name;
        this.order = builder.order;
        this.orderInstanceId = builder.orderInstanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupMachineGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return creatorID
     */
    public String getCreatorID() {
        return this.creatorID;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderInstanceId
     */
    public String getOrderInstanceId() {
        return this.orderInstanceId;
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
     * @return paymentDuration
     */
    public String getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
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

    public static final class Builder extends Request.Builder<ListResourceGroupMachineGroupsRequest, Builder> {
        private String resourceGroupID; 
        private String creatorID; 
        private String ecsSpec; 
        private String name; 
        private String order; 
        private String orderInstanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private String sortBy; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupMachineGroupsRequest request) {
            super(request);
            this.resourceGroupID = request.resourceGroupID;
            this.creatorID = request.creatorID;
            this.ecsSpec = request.ecsSpec;
            this.name = request.name;
            this.order = request.order;
            this.orderInstanceId = request.orderInstanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paymentDuration = request.paymentDuration;
            this.paymentDurationUnit = request.paymentDurationUnit;
            this.paymentType = request.paymentType;
            this.sortBy = request.sortBy;
            this.status = request.status;
        } 

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putPathParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * CreatorID.
         */
        public Builder creatorID(String creatorID) {
            this.putQueryParameter("CreatorID", creatorID);
            this.creatorID = creatorID;
            return this;
        }

        /**
         * EcsSpec.
         */
        public Builder ecsSpec(String ecsSpec) {
            this.putQueryParameter("EcsSpec", ecsSpec);
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderInstanceId.
         */
        public Builder orderInstanceId(String orderInstanceId) {
            this.putQueryParameter("OrderInstanceId", orderInstanceId);
            this.orderInstanceId = orderInstanceId;
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
         * PaymentDuration.
         */
        public Builder paymentDuration(String paymentDuration) {
            this.putQueryParameter("PaymentDuration", paymentDuration);
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * PaymentDurationUnit.
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.putQueryParameter("PaymentDurationUnit", paymentDurationUnit);
            this.paymentDurationUnit = paymentDurationUnit;
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
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
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
        public ListResourceGroupMachineGroupsRequest build() {
            return new ListResourceGroupMachineGroupsRequest(this);
        } 

    } 

}
