// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBgpNetworksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBgpNetworksResponseBody</p>
 */
public class DescribeBgpNetworksResponseBody extends TeaModel {
    @NameInMap("BgpNetworks")
    private BgpNetworks bgpNetworks;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBgpNetworksResponseBody(Builder builder) {
        this.bgpNetworks = builder.bgpNetworks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBgpNetworksResponseBody create() {
        return builder().build();
    }

    /**
     * @return bgpNetworks
     */
    public BgpNetworks getBgpNetworks() {
        return this.bgpNetworks;
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
        private BgpNetworks bgpNetworks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * BgpNetworks.
         */
        public Builder bgpNetworks(BgpNetworks bgpNetworks) {
            this.bgpNetworks = bgpNetworks;
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

        public DescribeBgpNetworksResponseBody build() {
            return new DescribeBgpNetworksResponseBody(this);
        } 

    } 

    public static class BgpNetwork extends TeaModel {
        @NameInMap("DstCidrBlock")
        private String dstCidrBlock;

        @NameInMap("RouterId")
        private String routerId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        private BgpNetwork(Builder builder) {
            this.dstCidrBlock = builder.dstCidrBlock;
            this.routerId = builder.routerId;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgpNetwork create() {
            return builder().build();
        }

        /**
         * @return dstCidrBlock
         */
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        /**
         * @return routerId
         */
        public String getRouterId() {
            return this.routerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String dstCidrBlock; 
            private String routerId; 
            private String status; 
            private String vpcId; 

            /**
             * DstCidrBlock.
             */
            public Builder dstCidrBlock(String dstCidrBlock) {
                this.dstCidrBlock = dstCidrBlock;
                return this;
            }

            /**
             * RouterId.
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public BgpNetwork build() {
                return new BgpNetwork(this);
            } 

        } 

    }
    public static class BgpNetworks extends TeaModel {
        @NameInMap("BgpNetwork")
        private java.util.List < BgpNetwork> bgpNetwork;

        private BgpNetworks(Builder builder) {
            this.bgpNetwork = builder.bgpNetwork;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgpNetworks create() {
            return builder().build();
        }

        /**
         * @return bgpNetwork
         */
        public java.util.List < BgpNetwork> getBgpNetwork() {
            return this.bgpNetwork;
        }

        public static final class Builder {
            private java.util.List < BgpNetwork> bgpNetwork; 

            /**
             * BgpNetwork.
             */
            public Builder bgpNetwork(java.util.List < BgpNetwork> bgpNetwork) {
                this.bgpNetwork = bgpNetwork;
                return this;
            }

            public BgpNetworks build() {
                return new BgpNetworks(this);
            } 

        } 

    }
}
