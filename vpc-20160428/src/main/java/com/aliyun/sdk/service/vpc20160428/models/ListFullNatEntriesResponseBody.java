// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFullNatEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFullNatEntriesResponseBody</p>
 */
public class ListFullNatEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FullNatEntries")
    private java.util.List < FullNatEntries> fullNatEntries;

    @com.aliyun.core.annotation.NameInMap("FullNatTableId")
    private String fullNatTableId;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The information about the FULLNAT entries that are queried.
         */
        public Builder fullNatEntries(java.util.List < FullNatEntries> fullNatEntries) {
            this.fullNatEntries = fullNatEntries;
            return this;
        }

        /**
         * The ID of the FULLNAT table to which the queried FULLNAT entries belong.
         */
        public Builder fullNatTableId(String fullNatTableId) {
            this.fullNatTableId = fullNatTableId;
            return this;
        }

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The ID of the VPC NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * Indicates whether the token for the next query exists. Valid values:
         * <p>
         * 
         * *   If the value of **NextToken** is empty, no next queries are sent.
         * *   If the value of **NextToken** is returned, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of FULLNAT entries returned.
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
        @com.aliyun.core.annotation.NameInMap("AccessIp")
        private String accessIp;

        @com.aliyun.core.annotation.NameInMap("AccessPort")
        private String accessPort;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("FullNatEntryDescription")
        private String fullNatEntryDescription;

        @com.aliyun.core.annotation.NameInMap("FullNatEntryId")
        private String fullNatEntryId;

        @com.aliyun.core.annotation.NameInMap("FullNatEntryName")
        private String fullNatEntryName;

        @com.aliyun.core.annotation.NameInMap("FullNatEntryStatus")
        private String fullNatEntryStatus;

        @com.aliyun.core.annotation.NameInMap("FullNatTableId")
        private String fullNatTableId;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("NatIp")
        private String natIp;

        @com.aliyun.core.annotation.NameInMap("NatIpPort")
        private String natIpPort;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceType")
        private String networkInterfaceType;

        private FullNatEntries(Builder builder) {
            this.accessIp = builder.accessIp;
            this.accessPort = builder.accessPort;
            this.creationTime = builder.creationTime;
            this.fullNatEntryDescription = builder.fullNatEntryDescription;
            this.fullNatEntryId = builder.fullNatEntryId;
            this.fullNatEntryName = builder.fullNatEntryName;
            this.fullNatEntryStatus = builder.fullNatEntryStatus;
            this.fullNatTableId = builder.fullNatTableId;
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
         * @return fullNatTableId
         */
        public String getFullNatTableId() {
            return this.fullNatTableId;
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
            private String fullNatTableId; 
            private String ipProtocol; 
            private String natIp; 
            private String natIpPort; 
            private String networkInterfaceId; 
            private String networkInterfaceType; 

            /**
             * The backend IP address that is used for FULLNAT address translation in FULLNAT entries.
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * The backend port that is used for port mapping in FULLNAT entries. Valid values: **1** to **65535**.
             */
            public Builder accessPort(String accessPort) {
                this.accessPort = accessPort;
                return this;
            }

            /**
             * The time when the FULLNAT entry was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the FULLNAT entry.
             * <p>
             * 
             * The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.
             */
            public Builder fullNatEntryDescription(String fullNatEntryDescription) {
                this.fullNatEntryDescription = fullNatEntryDescription;
                return this;
            }

            /**
             * The ID of the FULLNAT entry.
             */
            public Builder fullNatEntryId(String fullNatEntryId) {
                this.fullNatEntryId = fullNatEntryId;
                return this;
            }

            /**
             * The name of the FULLNAT entry.
             * <p>
             * 
             * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
             */
            public Builder fullNatEntryName(String fullNatEntryName) {
                this.fullNatEntryName = fullNatEntryName;
                return this;
            }

            /**
             * The status of the FULLNAT entry. Valid values:
             * <p>
             * 
             * *   **Pending**
             * *   **Available**
             * *   **Deleting**
             * *   **Deleted**
             */
            public Builder fullNatEntryStatus(String fullNatEntryStatus) {
                this.fullNatEntryStatus = fullNatEntryStatus;
                return this;
            }

            /**
             * The ID of the FULLNAT table to which the FULLNAT entry belongs.
             */
            public Builder fullNatTableId(String fullNatTableId) {
                this.fullNatTableId = fullNatTableId;
                return this;
            }

            /**
             * The protocol of the packets that are forwarded. Valid values:
             * <p>
             * 
             * *   **TCP**
             * *   **UDP**
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * The NAT IP address that is used for address translation in FULLNAT entries.
             */
            public Builder natIp(String natIp) {
                this.natIp = natIp;
                return this;
            }

            /**
             * The frontend port that is used for port mapping in FULLNAT entries. Valid values: **1** to **65535**.
             */
            public Builder natIpPort(String natIpPort) {
                this.natIpPort = natIpPort;
                return this;
            }

            /**
             * The ID of the elastic network interface (ENI).
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The type of the ENI. The value is set to **Endpoint**, which indicates a reverse endpoint.
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
