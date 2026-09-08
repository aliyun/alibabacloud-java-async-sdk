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
    @com.aliyun.core.annotation.NameInMap("DiskPL")
    private String diskPL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineGroupIDs")
    private String machineGroupIDs;

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
        this.diskPL = builder.diskPL;
        this.ecsSpec = builder.ecsSpec;
        this.machineGroupIDs = builder.machineGroupIDs;
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
     * @return diskPL
     */
    public String getDiskPL() {
        return this.diskPL;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return machineGroupIDs
     */
    public String getMachineGroupIDs() {
        return this.machineGroupIDs;
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
        private String diskPL; 
        private String ecsSpec; 
        private String machineGroupIDs; 
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
            this.diskPL = request.diskPL;
            this.ecsSpec = request.ecsSpec;
            this.machineGroupIDs = request.machineGroupIDs;
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
         * <p>The globally unique ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rgf0zhfqn1d4ity2</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putPathParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The ID of the user who created the machine group.</p>
         * 
         * <strong>example:</strong>
         * <p>1612285282502326</p>
         */
        public Builder creatorID(String creatorID) {
            this.putQueryParameter("CreatorID", creatorID);
            this.creatorID = creatorID;
            return this;
        }

        /**
         * DiskPL.
         */
        public Builder diskPL(String diskPL) {
            this.putQueryParameter("DiskPL", diskPL);
            this.diskPL = diskPL;
            return this;
        }

        /**
         * <p>The ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        public Builder ecsSpec(String ecsSpec) {
            this.putQueryParameter("EcsSpec", ecsSpec);
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * <p>The machine group IDs. Separate multiple IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>mg105ecqwfe49hwb</p>
         */
        public Builder machineGroupIDs(String machineGroupIDs) {
            this.putQueryParameter("MachineGroupIDs", machineGroupIDs);
            this.machineGroupIDs = machineGroupIDs;
            return this;
        }

        /**
         * <p>The name of the machine group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sort order.</p>
         * <ul>
         * <li><p><code>Asc</code>: Sorts the results in ascending order.</p>
         * </li>
         * <li><p><code>Desc</code>: Sorts the results in descending order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The ID of the purchase order.</p>
         * 
         * <strong>example:</strong>
         * <p>236553689400333</p>
         */
        public Builder orderInstanceId(String orderInstanceId) {
            this.putQueryParameter("OrderInstanceId", orderInstanceId);
            this.orderInstanceId = orderInstanceId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
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
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The payment duration. If <code>PaymentDurationUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder paymentDuration(String paymentDuration) {
            this.putQueryParameter("PaymentDuration", paymentDuration);
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * <p>The billing duration unit of the machine group.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.putQueryParameter("PaymentDurationUnit", paymentDurationUnit);
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * <p>The payment type.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The field to sort by.</p>
         * 
         * <strong>example:</strong>
         * <p>GmtCreatedTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The instance status. <code>Creating</code>: The instance is being created. <code>Ready</code>: The instance is running. <code>Expiring</code>: The instance is expiring. <code>Expired</code>: The instance has expired. <code>Stopping</code>: The instance is being stopped. <code>Stopped</code>: The instance is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
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
