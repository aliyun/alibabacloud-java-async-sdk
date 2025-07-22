// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NatGateways")
    private java.util.List<NatGateways> natGateways;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNatGatewaysResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.natGateways = builder.natGateways;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatGatewaysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return natGateways
     */
    public java.util.List<NatGateways> getNatGateways() {
        return this.natGateways;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private java.util.List<NatGateways> natGateways; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNatGatewaysResponseBody model) {
            this.maxResults = model.maxResults;
            this.natGateways = model.natGateways;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NatGateways.
         */
        public Builder natGateways(java.util.List<NatGateways> natGateways) {
            this.natGateways = natGateways;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
    public static class IpLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("SnatEntryEnabled")
        private String snatEntryEnabled;

        @com.aliyun.core.annotation.NameInMap("UsingStatus")
        private String usingStatus;

        private IpLists(Builder builder) {
            this.allocationId = builder.allocationId;
            this.ipAddress = builder.ipAddress;
            this.privateIpAddress = builder.privateIpAddress;
            this.snatEntryEnabled = builder.snatEntryEnabled;
            this.usingStatus = builder.usingStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpLists create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return snatEntryEnabled
         */
        public String getSnatEntryEnabled() {
            return this.snatEntryEnabled;
        }

        /**
         * @return usingStatus
         */
        public String getUsingStatus() {
            return this.usingStatus;
        }

        public static final class Builder {
            private String allocationId; 
            private String ipAddress; 
            private String privateIpAddress; 
            private String snatEntryEnabled; 
            private String usingStatus; 

            private Builder() {
            } 

            private Builder(IpLists model) {
                this.allocationId = model.allocationId;
                this.ipAddress = model.ipAddress;
                this.privateIpAddress = model.privateIpAddress;
                this.snatEntryEnabled = model.snatEntryEnabled;
                this.usingStatus = model.usingStatus;
            } 

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * SnatEntryEnabled.
             */
            public Builder snatEntryEnabled(String snatEntryEnabled) {
                this.snatEntryEnabled = snatEntryEnabled;
                return this;
            }

            /**
             * UsingStatus.
             */
            public Builder usingStatus(String usingStatus) {
                this.usingStatus = usingStatus;
                return this;
            }

            public IpLists build() {
                return new IpLists(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class NatGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardTableIds")
        private java.util.List<String> forwardTableIds;

        @com.aliyun.core.annotation.NameInMap("IpLists")
        private java.util.List<IpLists> ipLists;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("SnatTableIds")
        private java.util.List<String> snatTableIds;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private NatGateways(Builder builder) {
            this.forwardTableIds = builder.forwardTableIds;
            this.ipLists = builder.ipLists;
            this.name = builder.name;
            this.natGatewayId = builder.natGatewayId;
            this.snatTableIds = builder.snatTableIds;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateways create() {
            return builder().build();
        }

        /**
         * @return forwardTableIds
         */
        public java.util.List<String> getForwardTableIds() {
            return this.forwardTableIds;
        }

        /**
         * @return ipLists
         */
        public java.util.List<IpLists> getIpLists() {
            return this.ipLists;
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
         * @return snatTableIds
         */
        public java.util.List<String> getSnatTableIds() {
            return this.snatTableIds;
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
            private java.util.List<String> forwardTableIds; 
            private java.util.List<IpLists> ipLists; 
            private String name; 
            private String natGatewayId; 
            private java.util.List<String> snatTableIds; 
            private String status; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(NatGateways model) {
                this.forwardTableIds = model.forwardTableIds;
                this.ipLists = model.ipLists;
                this.name = model.name;
                this.natGatewayId = model.natGatewayId;
                this.snatTableIds = model.snatTableIds;
                this.status = model.status;
                this.vpcId = model.vpcId;
            } 

            /**
             * ForwardTableIds.
             */
            public Builder forwardTableIds(java.util.List<String> forwardTableIds) {
                this.forwardTableIds = forwardTableIds;
                return this;
            }

            /**
             * IpLists.
             */
            public Builder ipLists(java.util.List<IpLists> ipLists) {
                this.ipLists = ipLists;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * SnatTableIds.
             */
            public Builder snatTableIds(java.util.List<String> snatTableIds) {
                this.snatTableIds = snatTableIds;
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

            public NatGateways build() {
                return new NatGateways(this);
            } 

        } 

    }
}
