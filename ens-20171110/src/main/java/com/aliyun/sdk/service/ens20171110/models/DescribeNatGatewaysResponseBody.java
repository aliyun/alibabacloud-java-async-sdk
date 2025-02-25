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
 * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatGatewaysResponseBody</p>
 */
public class DescribeNatGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatGateways")
    private java.util.List<NatGateways> natGateways;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNatGatewaysResponseBody(Builder builder) {
        this.natGateways = builder.natGateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatGatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return natGateways
     */
    public java.util.List<NatGateways> getNatGateways() {
        return this.natGateways;
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
        private java.util.List<NatGateways> natGateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>Details about the NAT gateways.</p>
         */
        public Builder natGateways(java.util.List<NatGateways> natGateways) {
            this.natGateways = natGateways;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2818A8F4-5E2B-5611-8732-5ACF7B677059</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of NAT gateways that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNatGatewaysResponseBody build() {
            return new DescribeNatGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class NatGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private NatGateways(Builder builder) {
            this.creationTime = builder.creationTime;
            this.ensRegionId = builder.ensRegionId;
            this.name = builder.name;
            this.natGatewayId = builder.natGatewayId;
            this.networkId = builder.networkId;
            this.spec = builder.spec;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateways create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String creationTime; 
            private String ensRegionId; 
            private String name; 
            private String natGatewayId; 
            private String networkId; 
            private String spec; 
            private String vSwitchId; 

            /**
             * <p>The time when the NAT gateway was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-22T07:03:32Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-xiangyang-5</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The name of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>test0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The ID of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5s2ml1olj0kzaws9n1yrj****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>The type of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>enat.default</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-5szpp1os9m55myirbflfw****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NatGateways build() {
                return new NatGateways(this);
            } 

        } 

    }
}
