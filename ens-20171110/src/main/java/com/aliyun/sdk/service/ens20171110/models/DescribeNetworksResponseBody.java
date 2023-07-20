// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworksResponseBody</p>
 */
public class DescribeNetworksResponseBody extends TeaModel {
    @NameInMap("Networks")
    private Networks networks;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNetworksResponseBody(Builder builder) {
        this.networks = builder.networks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworksResponseBody create() {
        return builder().build();
    }

    /**
     * @return networks
     */
    public Networks getNetworks() {
        return this.networks;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Networks networks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Networks.
         */
        public Builder networks(Networks networks) {
            this.networks = networks;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworksResponseBody build() {
            return new DescribeNetworksResponseBody(this);
        } 

    } 

    public static class VSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        private java.util.List < String > vSwitchId;

        private VSwitchIds(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public java.util.List < String > getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List < String > vSwitchId; 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List < String > vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
    public static class Network extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("NetworkAclId")
        private String networkAclId;

        @NameInMap("NetworkId")
        private String networkId;

        @NameInMap("NetworkName")
        private String networkName;

        @NameInMap("RouterTableId")
        private String routerTableId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchIds")
        private VSwitchIds vSwitchIds;

        private Network(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.networkAclId = builder.networkAclId;
            this.networkId = builder.networkId;
            this.networkName = builder.networkName;
            this.routerTableId = builder.routerTableId;
            this.status = builder.status;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
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
         * @return networkAclId
         */
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return networkName
         */
        public String getNetworkName() {
            return this.networkName;
        }

        /**
         * @return routerTableId
         */
        public String getRouterTableId() {
            return this.routerTableId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchIds
         */
        public VSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String createdTime; 
            private String description; 
            private String ensRegionId; 
            private String networkAclId; 
            private String networkId; 
            private String networkName; 
            private String routerTableId; 
            private String status; 
            private VSwitchIds vSwitchIds; 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * NetworkAclId.
             */
            public Builder networkAclId(String networkAclId) {
                this.networkAclId = networkAclId;
                return this;
            }

            /**
             * NetworkId.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * NetworkName.
             */
            public Builder networkName(String networkName) {
                this.networkName = networkName;
                return this;
            }

            /**
             * RouterTableId.
             */
            public Builder routerTableId(String routerTableId) {
                this.routerTableId = routerTableId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(VSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class Networks extends TeaModel {
        @NameInMap("Network")
        private java.util.List < Network> network;

        private Networks(Builder builder) {
            this.network = builder.network;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Networks create() {
            return builder().build();
        }

        /**
         * @return network
         */
        public java.util.List < Network> getNetwork() {
            return this.network;
        }

        public static final class Builder {
            private java.util.List < Network> network; 

            /**
             * Network.
             */
            public Builder network(java.util.List < Network> network) {
                this.network = network;
                return this;
            }

            public Networks build() {
                return new Networks(this);
            } 

        } 

    }
}
