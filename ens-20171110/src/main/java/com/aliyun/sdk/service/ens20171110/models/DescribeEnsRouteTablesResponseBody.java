// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsRouteTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsRouteTablesResponseBody</p>
 */
public class DescribeEnsRouteTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteTables")
    private java.util.List<RouteTables> routeTables;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEnsRouteTablesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.routeTables = builder.routeTables;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRouteTablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeTables
     */
    public java.util.List<RouteTables> getRouteTables() {
        return this.routeTables;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<RouteTables> routeTables; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeEnsRouteTablesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.routeTables = model.routeTables;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC51ACB0-460D-5CA0-BA2D-E1F3B5547AE9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the route tables.</p>
         */
        public Builder routeTables(java.util.List<RouteTables> routeTables) {
            this.routeTables = routeTables;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEnsRouteTablesResponseBody build() {
            return new DescribeEnsRouteTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsRouteTablesResponseBody</p>
     */
    public static class RouteTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociateType")
        private String associateType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("IsDefaultGatewayRouteTable")
        private Boolean isDefaultGatewayRouteTable;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("RouteTableName")
        private String routeTableName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private RouteTables(Builder builder) {
            this.associateType = builder.associateType;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.isDefaultGatewayRouteTable = builder.isDefaultGatewayRouteTable;
            this.networkId = builder.networkId;
            this.routeTableId = builder.routeTableId;
            this.routeTableName = builder.routeTableName;
            this.status = builder.status;
            this.type = builder.type;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTables create() {
            return builder().build();
        }

        /**
         * @return associateType
         */
        public String getAssociateType() {
            return this.associateType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return isDefaultGatewayRouteTable
         */
        public Boolean getIsDefaultGatewayRouteTable() {
            return this.isDefaultGatewayRouteTable;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return routeTableName
         */
        public String getRouteTableName() {
            return this.routeTableName;
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

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String associateType; 
            private String creationTime; 
            private String description; 
            private String ensRegionId; 
            private Boolean isDefaultGatewayRouteTable; 
            private String networkId; 
            private String routeTableId; 
            private String routeTableName; 
            private String status; 
            private String type; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(RouteTables model) {
                this.associateType = model.associateType;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.ensRegionId = model.ensRegionId;
                this.isDefaultGatewayRouteTable = model.isDefaultGatewayRouteTable;
                this.networkId = model.networkId;
                this.routeTableId = model.routeTableId;
                this.routeTableName = model.routeTableName;
                this.status = model.status;
                this.type = model.type;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The type of the route table. Valid values:</p>
             * <ul>
             * <li><strong>VSwitch</strong> (default): vSwitch route table</li>
             * <li><strong>Gateway</strong>: gateway route table</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VSwitch</p>
             */
            public Builder associateType(String associateType) {
                this.associateType = associateType;
                return this;
            }

            /**
             * <p>The time when the route table was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-08T08:35:18Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the network.</p>
             * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-15</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>Is the gateway routing table the default.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefaultGatewayRouteTable(Boolean isDefaultGatewayRouteTable) {
                this.isDefaultGatewayRouteTable = isDefaultGatewayRouteTable;
                return this;
            }

            /**
             * <p>The ID of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5v9lufsezl4g****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>rt-5xde2bit9****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>The name of the route table that you want to query.</p>
             * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>test-tf-vtb7</p>
             */
            public Builder routeTableName(String routeTableName) {
                this.routeTableName = routeTableName;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>Available: The route table is available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the route table. Examples:</p>
             * <ul>
             * <li>Custom: custom route table.</li>
             * <li>System: system route table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The vSwitches that are associated with the route table.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public RouteTables build() {
                return new RouteTables(this);
            } 

        } 

    }
}
