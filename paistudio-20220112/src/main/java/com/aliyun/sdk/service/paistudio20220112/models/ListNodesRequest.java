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
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
    private String availabilityZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CliqueID")
    private String cliqueID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterByQuotaId")
    private String filterByQuotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterByResourceGroupIds")
    private String filterByResourceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCount")
    private HealthCount healthCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthRate")
    private HealthRate healthRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HyperNode")
    private String hyperNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HyperZone")
    private String hyperZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutMode")
    private String layoutMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineGroupIds")
    private String machineGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private String nodeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeStatuses")
    private String nodeStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeTypes")
    private String nodeTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderInstanceIds")
    private String orderInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderStatuses")
    private String orderStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReasonCodes")
    private String reasonCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private String resourceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.acceleratorType = builder.acceleratorType;
        this.availabilityZone = builder.availabilityZone;
        this.cliqueID = builder.cliqueID;
        this.filterByQuotaId = builder.filterByQuotaId;
        this.filterByResourceGroupIds = builder.filterByResourceGroupIds;
        this.GPUType = builder.GPUType;
        this.healthCount = builder.healthCount;
        this.healthRate = builder.healthRate;
        this.hyperNode = builder.hyperNode;
        this.hyperZone = builder.hyperZone;
        this.layoutMode = builder.layoutMode;
        this.machineGroupIds = builder.machineGroupIds;
        this.nodeNames = builder.nodeNames;
        this.nodeStatuses = builder.nodeStatuses;
        this.nodeTypes = builder.nodeTypes;
        this.order = builder.order;
        this.orderInstanceIds = builder.orderInstanceIds;
        this.orderStatuses = builder.orderStatuses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paymentType = builder.paymentType;
        this.quotaId = builder.quotaId;
        this.reasonCodes = builder.reasonCodes;
        this.resourceGroupIds = builder.resourceGroupIds;
        this.sortBy = builder.sortBy;
        this.verbose = builder.verbose;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesRequest create() {
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
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * @return cliqueID
     */
    public String getCliqueID() {
        return this.cliqueID;
    }

    /**
     * @return filterByQuotaId
     */
    public String getFilterByQuotaId() {
        return this.filterByQuotaId;
    }

    /**
     * @return filterByResourceGroupIds
     */
    public String getFilterByResourceGroupIds() {
        return this.filterByResourceGroupIds;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return healthCount
     */
    public HealthCount getHealthCount() {
        return this.healthCount;
    }

    /**
     * @return healthRate
     */
    public HealthRate getHealthRate() {
        return this.healthRate;
    }

    /**
     * @return hyperNode
     */
    public String getHyperNode() {
        return this.hyperNode;
    }

    /**
     * @return hyperZone
     */
    public String getHyperZone() {
        return this.hyperZone;
    }

    /**
     * @return layoutMode
     */
    public String getLayoutMode() {
        return this.layoutMode;
    }

    /**
     * @return machineGroupIds
     */
    public String getMachineGroupIds() {
        return this.machineGroupIds;
    }

    /**
     * @return nodeNames
     */
    public String getNodeNames() {
        return this.nodeNames;
    }

    /**
     * @return nodeStatuses
     */
    public String getNodeStatuses() {
        return this.nodeStatuses;
    }

    /**
     * @return nodeTypes
     */
    public String getNodeTypes() {
        return this.nodeTypes;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderInstanceIds
     */
    public String getOrderInstanceIds() {
        return this.orderInstanceIds;
    }

    /**
     * @return orderStatuses
     */
    public String getOrderStatuses() {
        return this.orderStatuses;
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
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return reasonCodes
     */
    public String getReasonCodes() {
        return this.reasonCodes;
    }

    /**
     * @return resourceGroupIds
     */
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListNodesRequest, Builder> {
        private String acceleratorType; 
        private String availabilityZone; 
        private String cliqueID; 
        private String filterByQuotaId; 
        private String filterByResourceGroupIds; 
        private String GPUType; 
        private HealthCount healthCount; 
        private HealthRate healthRate; 
        private String hyperNode; 
        private String hyperZone; 
        private String layoutMode; 
        private String machineGroupIds; 
        private String nodeNames; 
        private String nodeStatuses; 
        private String nodeTypes; 
        private String order; 
        private String orderInstanceIds; 
        private String orderStatuses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String paymentType; 
        private String quotaId; 
        private String reasonCodes; 
        private String resourceGroupIds; 
        private String sortBy; 
        private Boolean verbose; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest request) {
            super(request);
            this.acceleratorType = request.acceleratorType;
            this.availabilityZone = request.availabilityZone;
            this.cliqueID = request.cliqueID;
            this.filterByQuotaId = request.filterByQuotaId;
            this.filterByResourceGroupIds = request.filterByResourceGroupIds;
            this.GPUType = request.GPUType;
            this.healthCount = request.healthCount;
            this.healthRate = request.healthRate;
            this.hyperNode = request.hyperNode;
            this.hyperZone = request.hyperZone;
            this.layoutMode = request.layoutMode;
            this.machineGroupIds = request.machineGroupIds;
            this.nodeNames = request.nodeNames;
            this.nodeStatuses = request.nodeStatuses;
            this.nodeTypes = request.nodeTypes;
            this.order = request.order;
            this.orderInstanceIds = request.orderInstanceIds;
            this.orderStatuses = request.orderStatuses;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paymentType = request.paymentType;
            this.quotaId = request.quotaId;
            this.reasonCodes = request.reasonCodes;
            this.resourceGroupIds = request.resourceGroupIds;
            this.sortBy = request.sortBy;
            this.verbose = request.verbose;
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
         * AvailabilityZone.
         */
        public Builder availabilityZone(String availabilityZone) {
            this.putQueryParameter("AvailabilityZone", availabilityZone);
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * CliqueID.
         */
        public Builder cliqueID(String cliqueID) {
            this.putQueryParameter("CliqueID", cliqueID);
            this.cliqueID = cliqueID;
            return this;
        }

        /**
         * FilterByQuotaId.
         */
        public Builder filterByQuotaId(String filterByQuotaId) {
            this.putQueryParameter("FilterByQuotaId", filterByQuotaId);
            this.filterByQuotaId = filterByQuotaId;
            return this;
        }

        /**
         * FilterByResourceGroupIds.
         */
        public Builder filterByResourceGroupIds(String filterByResourceGroupIds) {
            this.putQueryParameter("FilterByResourceGroupIds", filterByResourceGroupIds);
            this.filterByResourceGroupIds = filterByResourceGroupIds;
            return this;
        }

        /**
         * GPUType.
         */
        public Builder GPUType(String GPUType) {
            this.putQueryParameter("GPUType", GPUType);
            this.GPUType = GPUType;
            return this;
        }

        /**
         * HealthCount.
         */
        public Builder healthCount(HealthCount healthCount) {
            String healthCountShrink = shrink(healthCount, "HealthCount", "json");
            this.putQueryParameter("HealthCount", healthCountShrink);
            this.healthCount = healthCount;
            return this;
        }

        /**
         * HealthRate.
         */
        public Builder healthRate(HealthRate healthRate) {
            String healthRateShrink = shrink(healthRate, "HealthRate", "json");
            this.putQueryParameter("HealthRate", healthRateShrink);
            this.healthRate = healthRate;
            return this;
        }

        /**
         * HyperNode.
         */
        public Builder hyperNode(String hyperNode) {
            this.putQueryParameter("HyperNode", hyperNode);
            this.hyperNode = hyperNode;
            return this;
        }

        /**
         * HyperZone.
         */
        public Builder hyperZone(String hyperZone) {
            this.putQueryParameter("HyperZone", hyperZone);
            this.hyperZone = hyperZone;
            return this;
        }

        /**
         * LayoutMode.
         */
        public Builder layoutMode(String layoutMode) {
            this.putQueryParameter("LayoutMode", layoutMode);
            this.layoutMode = layoutMode;
            return this;
        }

        /**
         * MachineGroupIds.
         */
        public Builder machineGroupIds(String machineGroupIds) {
            this.putQueryParameter("MachineGroupIds", machineGroupIds);
            this.machineGroupIds = machineGroupIds;
            return this;
        }

        /**
         * NodeNames.
         */
        public Builder nodeNames(String nodeNames) {
            this.putQueryParameter("NodeNames", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * NodeStatuses.
         */
        public Builder nodeStatuses(String nodeStatuses) {
            this.putQueryParameter("NodeStatuses", nodeStatuses);
            this.nodeStatuses = nodeStatuses;
            return this;
        }

        /**
         * NodeTypes.
         */
        public Builder nodeTypes(String nodeTypes) {
            this.putQueryParameter("NodeTypes", nodeTypes);
            this.nodeTypes = nodeTypes;
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
         * OrderInstanceIds.
         */
        public Builder orderInstanceIds(String orderInstanceIds) {
            this.putQueryParameter("OrderInstanceIds", orderInstanceIds);
            this.orderInstanceIds = orderInstanceIds;
            return this;
        }

        /**
         * OrderStatuses.
         */
        public Builder orderStatuses(String orderStatuses) {
            this.putQueryParameter("OrderStatuses", orderStatuses);
            this.orderStatuses = orderStatuses;
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
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.putQueryParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * ReasonCodes.
         */
        public Builder reasonCodes(String reasonCodes) {
            this.putQueryParameter("ReasonCodes", reasonCodes);
            this.reasonCodes = reasonCodes;
            return this;
        }

        /**
         * ResourceGroupIds.
         */
        public Builder resourceGroupIds(String resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
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
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListNodesRequest build() {
            return new ListNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListNodesRequest} extends {@link TeaModel}
     *
     * <p>ListNodesRequest</p>
     */
    public static class HealthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("value")
        private Integer value;

        private HealthCount(Builder builder) {
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCount create() {
            return builder().build();
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String operation; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(HealthCount model) {
                this.operation = model.operation;
                this.value = model.value;
            } 

            /**
             * operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public HealthCount build() {
                return new HealthCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodesRequest} extends {@link TeaModel}
     *
     * <p>ListNodesRequest</p>
     */
    public static class HealthRate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("value")
        private Integer value;

        private HealthRate(Builder builder) {
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthRate create() {
            return builder().build();
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String operation; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(HealthRate model) {
                this.operation = model.operation;
                this.value = model.value;
            } 

            /**
             * operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public HealthRate build() {
                return new HealthRate(this);
            } 

        } 

    }
}
