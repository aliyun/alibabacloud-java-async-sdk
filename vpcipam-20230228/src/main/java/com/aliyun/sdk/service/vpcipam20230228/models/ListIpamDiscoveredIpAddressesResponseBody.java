// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link ListIpamDiscoveredIpAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamDiscoveredIpAddressesResponseBody</p>
 */
public class ListIpamDiscoveredIpAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("IpamDiscoveredIpAddresses")
    private java.util.List<IpamDiscoveredIpAddresses> ipamDiscoveredIpAddresses;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListIpamDiscoveredIpAddressesResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamDiscoveredIpAddresses = builder.ipamDiscoveredIpAddresses;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamDiscoveredIpAddressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ipamDiscoveredIpAddresses
     */
    public java.util.List<IpamDiscoveredIpAddresses> getIpamDiscoveredIpAddresses() {
        return this.ipamDiscoveredIpAddresses;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<IpamDiscoveredIpAddresses> ipamDiscoveredIpAddresses; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListIpamDiscoveredIpAddressesResponseBody model) {
            this.count = model.count;
            this.ipamDiscoveredIpAddresses = model.ipamDiscoveredIpAddresses;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * IpamDiscoveredIpAddresses.
         */
        public Builder ipamDiscoveredIpAddresses(java.util.List<IpamDiscoveredIpAddresses> ipamDiscoveredIpAddresses) {
            this.ipamDiscoveredIpAddresses = ipamDiscoveredIpAddresses;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpamDiscoveredIpAddressesResponseBody build() {
            return new ListIpamDiscoveredIpAddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamDiscoveredIpAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamDiscoveredIpAddressesResponseBody</p>
     */
    public static class IpamDiscoveredIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceServiceType")
        private String resourceServiceType;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private IpamDiscoveredIpAddresses(Builder builder) {
            this.ipAddress = builder.ipAddress;
            this.ipVersion = builder.ipVersion;
            this.resourceId = builder.resourceId;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceServiceType = builder.resourceServiceType;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamDiscoveredIpAddresses create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return resourceServiceType
         */
        public String getResourceServiceType() {
            return this.resourceServiceType;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String ipAddress; 
            private String ipVersion; 
            private String resourceId; 
            private String resourceRegionId; 
            private String resourceServiceType; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(IpamDiscoveredIpAddresses model) {
                this.ipAddress = model.ipAddress;
                this.ipVersion = model.ipVersion;
                this.resourceId = model.resourceId;
                this.resourceRegionId = model.resourceRegionId;
                this.resourceServiceType = model.resourceServiceType;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceRegionId.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * ResourceServiceType.
             */
            public Builder resourceServiceType(String resourceServiceType) {
                this.resourceServiceType = resourceServiceType;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public IpamDiscoveredIpAddresses build() {
                return new IpamDiscoveredIpAddresses(this);
            } 

        } 

    }
}
