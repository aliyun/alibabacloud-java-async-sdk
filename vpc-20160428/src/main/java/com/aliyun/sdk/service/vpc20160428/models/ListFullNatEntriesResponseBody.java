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
 * {@link ListFullNatEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFullNatEntriesResponseBody</p>
 */
public class ListFullNatEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FullNatEntries")
    private java.util.List<FullNatEntries> fullNatEntries;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fullNatEntries
     */
    public java.util.List<FullNatEntries> getFullNatEntries() {
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
        private java.util.List<FullNatEntries> fullNatEntries; 
        private String fullNatTableId; 
        private Long maxResults; 
        private String natGatewayId; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListFullNatEntriesResponseBody model) {
            this.fullNatEntries = model.fullNatEntries;
            this.fullNatTableId = model.fullNatTableId;
            this.maxResults = model.maxResults;
            this.natGatewayId = model.natGatewayId;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of queried FULLNAT entries.</p>
         */
        public Builder fullNatEntries(java.util.List<FullNatEntries> fullNatEntries) {
            this.fullNatEntries = fullNatEntries;
            return this;
        }

        /**
         * <p>The ID of the FULLNAT table to which the queried FULLNAT entries belong.</p>
         * 
         * <strong>example:</strong>
         * <p>fullnat-gw8fz23jezpbblf1j****</p>
         */
        public Builder fullNatTableId(String fullNatTableId) {
            this.fullNatTableId = fullNatTableId;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The instance ID of the VPC NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw8054kn57y3hq3bv****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query is to be sent.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token used to start the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F03E41F6-1A74-311F-8D98-124EEE9F37B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of queried FULLNAT entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFullNatEntriesResponseBody build() {
            return new ListFullNatEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFullNatEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFullNatEntriesResponseBody</p>
     */
    public static class FullNatEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessDomain")
        private String accessDomain;

        @com.aliyun.core.annotation.NameInMap("AccessIp")
        private String accessIp;

        @com.aliyun.core.annotation.NameInMap("AccessPort")
        private String accessPort;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DomainResolve")
        private String domainResolve;

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
            this.accessDomain = builder.accessDomain;
            this.accessIp = builder.accessIp;
            this.accessPort = builder.accessPort;
            this.creationTime = builder.creationTime;
            this.domainResolve = builder.domainResolve;
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
         * @return accessDomain
         */
        public String getAccessDomain() {
            return this.accessDomain;
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
         * @return domainResolve
         */
        public String getDomainResolve() {
            return this.domainResolve;
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
            private String accessDomain; 
            private String accessIp; 
            private String accessPort; 
            private String creationTime; 
            private String domainResolve; 
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

            private Builder() {
            } 

            private Builder(FullNatEntries model) {
                this.accessDomain = model.accessDomain;
                this.accessIp = model.accessIp;
                this.accessPort = model.accessPort;
                this.creationTime = model.creationTime;
                this.domainResolve = model.domainResolve;
                this.fullNatEntryDescription = model.fullNatEntryDescription;
                this.fullNatEntryId = model.fullNatEntryId;
                this.fullNatEntryName = model.fullNatEntryName;
                this.fullNatEntryStatus = model.fullNatEntryStatus;
                this.fullNatTableId = model.fullNatTableId;
                this.ipProtocol = model.ipProtocol;
                this.natIp = model.natIp;
                this.natIpPort = model.natIpPort;
                this.networkInterfaceId = model.networkInterfaceId;
                this.networkInterfaceType = model.networkInterfaceType;
            } 

            /**
             * <p>The backend domain name used for FULLNAT address translation in the FULLNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.com</p>
             */
            public Builder accessDomain(String accessDomain) {
                this.accessDomain = accessDomain;
                return this;
            }

            /**
             * <p>The backend IP address used for FULLNAT address translation in the FULLNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * <p>The backend port used for port mapping in the FULLNAT entry. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder accessPort(String accessPort) {
                this.accessPort = accessPort;
                return this;
            }

            /**
             * <p>The time when the FULLNAT entry was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-27T02:44:40Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The IP address resolved from the backend domain name used for address translation in the FULLNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder domainResolve(String domainResolve) {
                this.domainResolve = domainResolve;
                return this;
            }

            /**
             * <p>The description of the FULLNAT entry.</p>
             * <p>The description must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder fullNatEntryDescription(String fullNatEntryDescription) {
                this.fullNatEntryDescription = fullNatEntryDescription;
                return this;
            }

            /**
             * <p>The ID of the FULLNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>fullnat-gw8fz23jezpbblf1j****</p>
             */
            public Builder fullNatEntryId(String fullNatEntryId) {
                this.fullNatEntryId = fullNatEntryId;
                return this;
            }

            /**
             * <p>The name of the FULLNAT entry. </p>
             * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, hyphens (-), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder fullNatEntryName(String fullNatEntryName) {
                this.fullNatEntryName = fullNatEntryName;
                return this;
            }

            /**
             * <p>The status of the FULLNAT entry. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: The entry is being configured.</li>
             * <li><strong>Available</strong>: The entry is available.</li>
             * <li><strong>Deleting</strong>: The entry is being deleted.</li>
             * <li><strong>Deleted</strong>: The entry is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder fullNatEntryStatus(String fullNatEntryStatus) {
                this.fullNatEntryStatus = fullNatEntryStatus;
                return this;
            }

            /**
             * <p>The ID of the FULLNAT table to which the FULLNAT entry belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>fulltb-gw88z7hhlv43rmb26****</p>
             */
            public Builder fullNatTableId(String fullNatTableId) {
                this.fullNatTableId = fullNatTableId;
                return this;
            }

            /**
             * <p>The forwarding protocol type. Valid values: </p>
             * <ul>
             * <li><strong>TCP</strong>: forwards TCP packets. </li>
             * <li><strong>UDP</strong>: forwards UDP packets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The NAT IP address used for address translation in the FULLNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder natIp(String natIp) {
                this.natIp = natIp;
                return this;
            }

            /**
             * <p>The frontend port used for port mapping in the FULLNAT entry. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder natIpPort(String natIpPort) {
                this.natIpPort = natIpPort;
                return this;
            }

            /**
             * <p>The ID of the elastic network interfaces (ENIs), which is a network interface controller (NIC).</p>
             * 
             * <strong>example:</strong>
             * <p>eni-gw80wedm8pq0tpr2****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The type of the elastic network interfaces (ENIs), which is a network interface controller (NIC). Currently, only <strong>Endpoint</strong> (reverse endpoint) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Endpoint</p>
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
