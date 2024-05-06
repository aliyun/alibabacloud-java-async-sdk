// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIPv6TranslatorEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIPv6TranslatorEntriesResponseBody</p>
 */
public class DescribeIPv6TranslatorEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorEntries")
    private Ipv6TranslatorEntries ipv6TranslatorEntries;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIPv6TranslatorEntriesResponseBody(Builder builder) {
        this.ipv6TranslatorEntries = builder.ipv6TranslatorEntries;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPv6TranslatorEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6TranslatorEntries
     */
    public Ipv6TranslatorEntries getIpv6TranslatorEntries() {
        return this.ipv6TranslatorEntries;
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
        private Ipv6TranslatorEntries ipv6TranslatorEntries; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The IPv6 mapping entries that are queried.
         */
        public Builder ipv6TranslatorEntries(Ipv6TranslatorEntries ipv6TranslatorEntries) {
            this.ipv6TranslatorEntries = ipv6TranslatorEntries;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIPv6TranslatorEntriesResponseBody build() {
            return new DescribeIPv6TranslatorEntriesResponseBody(this);
        } 

    } 

    public static class Ipv6TranslatorEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private String aclStatus;

        @com.aliyun.core.annotation.NameInMap("AclType")
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("AllocateIpv6Addr")
        private String allocateIpv6Addr;

        @com.aliyun.core.annotation.NameInMap("AllocateIpv6Port")
        private Integer allocateIpv6Port;

        @com.aliyun.core.annotation.NameInMap("BackendIpv4Addr")
        private String backendIpv4Addr;

        @com.aliyun.core.annotation.NameInMap("BackendIpv4Port")
        private String backendIpv4Port;

        @com.aliyun.core.annotation.NameInMap("EntryBandwidth")
        private String entryBandwidth;

        @com.aliyun.core.annotation.NameInMap("EntryDescription")
        private String entryDescription;

        @com.aliyun.core.annotation.NameInMap("EntryName")
        private String entryName;

        @com.aliyun.core.annotation.NameInMap("EntryStatus")
        private String entryStatus;

        @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorEntryId")
        private String ipv6TranslatorEntryId;

        @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorId")
        private String ipv6TranslatorId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TransProtocol")
        private String transProtocol;

        private Ipv6TranslatorEntry(Builder builder) {
            this.aclId = builder.aclId;
            this.aclStatus = builder.aclStatus;
            this.aclType = builder.aclType;
            this.allocateIpv6Addr = builder.allocateIpv6Addr;
            this.allocateIpv6Port = builder.allocateIpv6Port;
            this.backendIpv4Addr = builder.backendIpv4Addr;
            this.backendIpv4Port = builder.backendIpv4Port;
            this.entryBandwidth = builder.entryBandwidth;
            this.entryDescription = builder.entryDescription;
            this.entryName = builder.entryName;
            this.entryStatus = builder.entryStatus;
            this.ipv6TranslatorEntryId = builder.ipv6TranslatorEntryId;
            this.ipv6TranslatorId = builder.ipv6TranslatorId;
            this.regionId = builder.regionId;
            this.transProtocol = builder.transProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6TranslatorEntry create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return aclStatus
         */
        public String getAclStatus() {
            return this.aclStatus;
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return allocateIpv6Addr
         */
        public String getAllocateIpv6Addr() {
            return this.allocateIpv6Addr;
        }

        /**
         * @return allocateIpv6Port
         */
        public Integer getAllocateIpv6Port() {
            return this.allocateIpv6Port;
        }

        /**
         * @return backendIpv4Addr
         */
        public String getBackendIpv4Addr() {
            return this.backendIpv4Addr;
        }

        /**
         * @return backendIpv4Port
         */
        public String getBackendIpv4Port() {
            return this.backendIpv4Port;
        }

        /**
         * @return entryBandwidth
         */
        public String getEntryBandwidth() {
            return this.entryBandwidth;
        }

        /**
         * @return entryDescription
         */
        public String getEntryDescription() {
            return this.entryDescription;
        }

        /**
         * @return entryName
         */
        public String getEntryName() {
            return this.entryName;
        }

        /**
         * @return entryStatus
         */
        public String getEntryStatus() {
            return this.entryStatus;
        }

        /**
         * @return ipv6TranslatorEntryId
         */
        public String getIpv6TranslatorEntryId() {
            return this.ipv6TranslatorEntryId;
        }

        /**
         * @return ipv6TranslatorId
         */
        public String getIpv6TranslatorId() {
            return this.ipv6TranslatorId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return transProtocol
         */
        public String getTransProtocol() {
            return this.transProtocol;
        }

        public static final class Builder {
            private String aclId; 
            private String aclStatus; 
            private String aclType; 
            private String allocateIpv6Addr; 
            private Integer allocateIpv6Port; 
            private String backendIpv4Addr; 
            private String backendIpv4Port; 
            private String entryBandwidth; 
            private String entryDescription; 
            private String entryName; 
            private String entryStatus; 
            private String ipv6TranslatorEntryId; 
            private String ipv6TranslatorId; 
            private String regionId; 
            private String transProtocol; 

            /**
             * The ID of the associated ACL.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * Indicates whether ACLs are enabled.
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * The ACL type.
             * <p>
             * 
             * *   **white**: a whitelist. IPv6 addresses in the ACL are allowed to access backend services.
             * *   **black**: a blacklist. IPv6 addresses in the ACL are not allowed to access backend services.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * The IPv6 address allocated to the IPv6 Translation Service instance.
             */
            public Builder allocateIpv6Addr(String allocateIpv6Addr) {
                this.allocateIpv6Addr = allocateIpv6Addr;
                return this;
            }

            /**
             * The port used by the IPv6 address allocated to the IPv6 Translation Service instance.
             */
            public Builder allocateIpv6Port(Integer allocateIpv6Port) {
                this.allocateIpv6Port = allocateIpv6Port;
                return this;
            }

            /**
             * The public IP address of the backend IPv4 server.
             */
            public Builder backendIpv4Addr(String backendIpv4Addr) {
                this.backendIpv4Addr = backendIpv4Addr;
                return this;
            }

            /**
             * The public IPv4 port used by the IPv4 server that needs to provide IPv6 access.
             */
            public Builder backendIpv4Port(String backendIpv4Port) {
                this.backendIpv4Port = backendIpv4Port;
                return this;
            }

            /**
             * The bandwidth specified in the IPv6 mapping entry.
             */
            public Builder entryBandwidth(String entryBandwidth) {
                this.entryBandwidth = entryBandwidth;
                return this;
            }

            /**
             * The description of the IPv6 mapping entry.
             */
            public Builder entryDescription(String entryDescription) {
                this.entryDescription = entryDescription;
                return this;
            }

            /**
             * The name of the IPv6 mapping entry.
             */
            public Builder entryName(String entryName) {
                this.entryName = entryName;
                return this;
            }

            /**
             * The status of the IPv6 mapping entry.
             */
            public Builder entryStatus(String entryStatus) {
                this.entryStatus = entryStatus;
                return this;
            }

            /**
             * The ID of the IPv6 mapping entry.
             */
            public Builder ipv6TranslatorEntryId(String ipv6TranslatorEntryId) {
                this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
                return this;
            }

            /**
             * The ID of the IPv6 Translation Service instance to which the IPv6 mapping entry belongs.
             */
            public Builder ipv6TranslatorId(String ipv6TranslatorId) {
                this.ipv6TranslatorId = ipv6TranslatorId;
                return this;
            }

            /**
             * The region of the IPv6 Translation Service instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The protocol.
             */
            public Builder transProtocol(String transProtocol) {
                this.transProtocol = transProtocol;
                return this;
            }

            public Ipv6TranslatorEntry build() {
                return new Ipv6TranslatorEntry(this);
            } 

        } 

    }
    public static class Ipv6TranslatorEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorEntry")
        private java.util.List < Ipv6TranslatorEntry> ipv6TranslatorEntry;

        private Ipv6TranslatorEntries(Builder builder) {
            this.ipv6TranslatorEntry = builder.ipv6TranslatorEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6TranslatorEntries create() {
            return builder().build();
        }

        /**
         * @return ipv6TranslatorEntry
         */
        public java.util.List < Ipv6TranslatorEntry> getIpv6TranslatorEntry() {
            return this.ipv6TranslatorEntry;
        }

        public static final class Builder {
            private java.util.List < Ipv6TranslatorEntry> ipv6TranslatorEntry; 

            /**
             * Ipv6TranslatorEntry.
             */
            public Builder ipv6TranslatorEntry(java.util.List < Ipv6TranslatorEntry> ipv6TranslatorEntry) {
                this.ipv6TranslatorEntry = ipv6TranslatorEntry;
                return this;
            }

            public Ipv6TranslatorEntries build() {
                return new Ipv6TranslatorEntries(this);
            } 

        } 

    }
}
