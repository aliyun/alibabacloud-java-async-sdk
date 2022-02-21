// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFullNatEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFullNatEntriesResponseBody</p>
 */
public class ListFullNatEntriesResponseBody extends TeaModel {
    @NameInMap("FullNatEntries")
    private java.util.List < FullNatEntries> fullNatEntries;

    @NameInMap("FullNatTableId")
    private String fullNatTableId;

    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListFullNatEntriesResponseBody(Builder builder) {
        this.fullNatEntries = builder.fullNatEntries;
        this.fullNatTableId = builder.fullNatTableId;
        this.maxResults = builder.maxResults;
        this.natGatewayId = builder.natGatewayId;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFullNatEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return fullNatEntries
     */
    public java.util.List < FullNatEntries> getFullNatEntries() {
        return this.fullNatEntries;
    }

    /**
     * @return fullNatTableId
     */
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < FullNatEntries> fullNatEntries; 
        private String fullNatTableId; 
        private Long maxResults; 
        private String natGatewayId; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * FullNatEntries.
         */
        public Builder fullNatEntries(java.util.List < FullNatEntries> fullNatEntries) {
            this.fullNatEntries = fullNatEntries;
            return this;
        }

        /**
         * FullNatTableId.
         */
        public Builder fullNatTableId(String fullNatTableId) {
            this.fullNatTableId = fullNatTableId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFullNatEntriesResponseBody build() {
            return new ListFullNatEntriesResponseBody(this);
        } 

    } 

    public static class FullNatEntries extends TeaModel {
        @NameInMap("AccessIp")
        private String accessIp;

        @NameInMap("AccessPort")
        private String accessPort;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("FullNatEntryDescription")
        private String fullNatEntryDescription;

        @NameInMap("FullNatEntryId")
        private String fullNatEntryId;

        @NameInMap("FullNatEntryName")
        private String fullNatEntryName;

        @NameInMap("FullNatEntryStatus")
        private String fullNatEntryStatus;

        @NameInMap("IpProtocol")
        private String ipProtocol;

        @NameInMap("NatIp")
        private String natIp;

        @NameInMap("NatIpPort")
        private String natIpPort;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("NetworkInterfaceType")
        private String networkInterfaceType;

        private FullNatEntries(Builder builder) {
            this.accessIp = builder.accessIp;
            this.accessPort = builder.accessPort;
            this.creationTime = builder.creationTime;
            this.fullNatEntryDescription = builder.fullNatEntryDescription;
            this.fullNatEntryId = builder.fullNatEntryId;
            this.fullNatEntryName = builder.fullNatEntryName;
            this.fullNatEntryStatus = builder.fullNatEntryStatus;
            this.ipProtocol = builder.ipProtocol;
            this.natIp = builder.natIp;
            this.natIpPort = builder.natIpPort;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.networkInterfaceType = builder.networkInterfaceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullNatEntries create() {
            return builder().build();
        }

        /**
         * @return accessIp
         */
        public String getAccessIp() {
            return this.accessIp;
        }

        /**
         * @return accessPort
         */
        public String getAccessPort() {
            return this.accessPort;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return fullNatEntryDescription
         */
        public String getFullNatEntryDescription() {
            return this.fullNatEntryDescription;
        }

        /**
         * @return fullNatEntryId
         */
        public String getFullNatEntryId() {
            return this.fullNatEntryId;
        }

        /**
         * @return fullNatEntryName
         */
        public String getFullNatEntryName() {
            return this.fullNatEntryName;
        }

        /**
         * @return fullNatEntryStatus
         */
        public String getFullNatEntryStatus() {
            return this.fullNatEntryStatus;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return natIp
         */
        public String getNatIp() {
            return this.natIp;
        }

        /**
         * @return natIpPort
         */
        public String getNatIpPort() {
            return this.natIpPort;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return networkInterfaceType
         */
        public String getNetworkInterfaceType() {
            return this.networkInterfaceType;
        }

        public static final class Builder {
            private String accessIp; 
            private String accessPort; 
            private String creationTime; 
            private String fullNatEntryDescription; 
            private String fullNatEntryId; 
            private String fullNatEntryName; 
            private String fullNatEntryStatus; 
            private String ipProtocol; 
            private String natIp; 
            private String natIpPort; 
            private String networkInterfaceId; 
            private String networkInterfaceType; 

            /**
             * 通过DNAT条目进行公网通信的ECS实例的私网IP地址。
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * DNAT条目中进行端口转发的内部端口，取值范围：1-65535。
             */
            public Builder accessPort(String accessPort) {
                this.accessPort = accessPort;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * FullNatEntryDescription.
             */
            public Builder fullNatEntryDescription(String fullNatEntryDescription) {
                this.fullNatEntryDescription = fullNatEntryDescription;
                return this;
            }

            /**
             * FullNatEntryId.
             */
            public Builder fullNatEntryId(String fullNatEntryId) {
                this.fullNatEntryId = fullNatEntryId;
                return this;
            }

            /**
             * FULLNAT规则的名称。 长度为2~128个字符，必须以大小写字母或中文开头，但不能以http://或https://开头。
             */
            public Builder fullNatEntryName(String fullNatEntryName) {
                this.fullNatEntryName = fullNatEntryName;
                return this;
            }

            /**
             * FullNatEntryStatus.
             */
            public Builder fullNatEntryStatus(String fullNatEntryStatus) {
                this.fullNatEntryStatus = fullNatEntryStatus;
                return this;
            }

            /**
             * 协议类型，取值： • TCP：转发TCP协议的报文。 • UDP：转发UDP协议的报文。
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * DNAT条目中提供公网访问的公网IP地址。
             */
            public Builder natIp(String natIp) {
                this.natIp = natIp;
                return this;
            }

            /**
             * DNAT条目中进行端口转发的外部端口，取值范围：1~65535。
             */
            public Builder natIpPort(String natIpPort) {
                this.natIpPort = natIpPort;
                return this;
            }

            /**
             * 当前VpcNat作为服务资源所加入的eni
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * ENI类型，目前仅支持Endpoint
             */
            public Builder networkInterfaceType(String networkInterfaceType) {
                this.networkInterfaceType = networkInterfaceType;
                return this;
            }

            public FullNatEntries build() {
                return new FullNatEntries(this);
            } 

        } 

    }
}
