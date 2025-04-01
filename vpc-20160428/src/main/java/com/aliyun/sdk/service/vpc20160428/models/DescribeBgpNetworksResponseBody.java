// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeBgpNetworksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBgpNetworksResponseBody</p>
 */
public class DescribeBgpNetworksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BgpNetworks")
    private BgpNetworks bgpNetworks;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBgpNetworksResponseBody model) {
            this.bgpNetworks = model.bgpNetworks;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>BGP networks.</p>
         */
        public Builder bgpNetworks(BgpNetworks bgpNetworks) {
            this.bgpNetworks = bgpNetworks;
            return this;
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6F513A15-669F-419D-B511-08A85292059B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of advertised BGP networks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBgpNetworksResponseBody build() {
            return new DescribeBgpNetworksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBgpNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBgpNetworksResponseBody</p>
     */
    public static class BgpNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstCidrBlock")
        private String dstCidrBlock;

        @com.aliyun.core.annotation.NameInMap("RouterId")
        private String routerId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(BgpNetwork model) {
                this.dstCidrBlock = model.dstCidrBlock;
                this.routerId = model.routerId;
                this.status = model.status;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The CIDR block of the advertised BGP network.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.XX.XX/24</p>
             */
            public Builder dstCidrBlock(String dstCidrBlock) {
                this.dstCidrBlock = dstCidrBlock;
                return this;
            }

            /**
             * <p>The ID of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-bp1lhl0taikrteen8****</p>
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
                return this;
            }

            /**
             * <p>The status of the advertised BGP network.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) in which the master instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1qpo0kug3a2*****</p>
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
    /**
     * 
     * {@link DescribeBgpNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBgpNetworksResponseBody</p>
     */
    public static class BgpNetworks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgpNetwork")
        private java.util.List<BgpNetwork> bgpNetwork;

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
        public java.util.List<BgpNetwork> getBgpNetwork() {
            return this.bgpNetwork;
        }

        public static final class Builder {
            private java.util.List<BgpNetwork> bgpNetwork; 

            private Builder() {
            } 

            private Builder(BgpNetworks model) {
                this.bgpNetwork = model.bgpNetwork;
            } 

            /**
             * BgpNetwork.
             */
            public Builder bgpNetwork(java.util.List<BgpNetwork> bgpNetwork) {
                this.bgpNetwork = bgpNetwork;
                return this;
            }

            public BgpNetworks build() {
                return new BgpNetworks(this);
            } 

        } 

    }
}
