// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListNetworkZonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkZonesResponseBody</p>
 */
public class ListNetworkZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkZones")
    private java.util.List<NetworkZones> networkZones;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListNetworkZonesResponseBody(Builder builder) {
        this.networkZones = builder.networkZones;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkZonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkZones
     */
    public java.util.List<NetworkZones> getNetworkZones() {
        return this.networkZones;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<NetworkZones> networkZones; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListNetworkZonesResponseBody model) {
            this.networkZones = model.networkZones;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of network zones.</p>
         */
        public Builder networkZones(java.util.List<NetworkZones> networkZones) {
            this.networkZones = networkZones;
            return this;
        }

        /**
         * <p>The pagination token returned by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The pagination token for the previous page.</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNetworkZonesResponseBody build() {
            return new ListNetworkZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetworkZonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkZonesResponseBody</p>
     */
    public static class NetworkZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ipv4Cidrs")
        private java.util.List<String> ipv4Cidrs;

        @com.aliyun.core.annotation.NameInMap("Ipv6Cidrs")
        private java.util.List<String> ipv6Cidrs;

        @com.aliyun.core.annotation.NameInMap("NetworkZoneId")
        private String networkZoneId;

        @com.aliyun.core.annotation.NameInMap("NetworkZoneName")
        private String networkZoneName;

        @com.aliyun.core.annotation.NameInMap("NetworkZoneType")
        private String networkZoneType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private NetworkZones(Builder builder) {
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.ipv4Cidrs = builder.ipv4Cidrs;
            this.ipv6Cidrs = builder.ipv6Cidrs;
            this.networkZoneId = builder.networkZoneId;
            this.networkZoneName = builder.networkZoneName;
            this.networkZoneType = builder.networkZoneType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkZones create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipv4Cidrs
         */
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        /**
         * @return ipv6Cidrs
         */
        public java.util.List<String> getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        /**
         * @return networkZoneId
         */
        public String getNetworkZoneId() {
            return this.networkZoneId;
        }

        /**
         * @return networkZoneName
         */
        public String getNetworkZoneName() {
            return this.networkZoneName;
        }

        /**
         * @return networkZoneType
         */
        public String getNetworkZoneType() {
            return this.networkZoneType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String description; 
            private String instanceId; 
            private java.util.List<String> ipv4Cidrs; 
            private java.util.List<String> ipv6Cidrs; 
            private String networkZoneId; 
            private String networkZoneName; 
            private String networkZoneType; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(NetworkZones model) {
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.ipv4Cidrs = model.ipv4Cidrs;
                this.ipv6Cidrs = model.ipv6Cidrs;
                this.networkZoneId = model.networkZoneId;
                this.networkZoneName = model.networkZoneName;
                this.networkZoneType = model.networkZoneType;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The network zone description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IPv4 CIDR blocks of the network zone.</p>
             */
            public Builder ipv4Cidrs(java.util.List<String> ipv4Cidrs) {
                this.ipv4Cidrs = ipv4Cidrs;
                return this;
            }

            /**
             * <p>The IPv6 CIDR blocks of the network zone.</p>
             */
            public Builder ipv6Cidrs(java.util.List<String> ipv6Cidrs) {
                this.ipv6Cidrs = ipv6Cidrs;
                return this;
            }

            /**
             * <p>The network zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>network_m223wbvc3sn3uakfnxvhbxxxxx</p>
             */
            public Builder networkZoneId(String networkZoneId) {
                this.networkZoneId = networkZoneId;
                return this;
            }

            /**
             * <p>The network zone name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_name</p>
             */
            public Builder networkZoneName(String networkZoneName) {
                this.networkZoneName = networkZoneName;
                return this;
            }

            /**
             * <p>The network zone type.</p>
             * 
             * <strong>example:</strong>
             * <p>arn:alibaba:idaas:network:zone:classic</p>
             */
            public Builder networkZoneType(String networkZoneType) {
                this.networkZoneType = networkZoneType;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1usdmfqcgoy5ebxxxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetworkZones build() {
                return new NetworkZones(this);
            } 

        } 

    }
}
