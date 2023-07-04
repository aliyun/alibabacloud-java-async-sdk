// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeForwardTableEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeForwardTableEntriesResponseBody</p>
 */
public class DescribeForwardTableEntriesResponseBody extends TeaModel {
    @NameInMap("ForwardTableEntries")
    private ForwardTableEntries forwardTableEntries;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeForwardTableEntriesResponseBody(Builder builder) {
        this.forwardTableEntries = builder.forwardTableEntries;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeForwardTableEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return forwardTableEntries
     */
    public ForwardTableEntries getForwardTableEntries() {
        return this.forwardTableEntries;
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
        private ForwardTableEntries forwardTableEntries; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of DNAT entries.
         */
        public Builder forwardTableEntries(ForwardTableEntries forwardTableEntries) {
            this.forwardTableEntries = forwardTableEntries;
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
         * The ID of the request.
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

        public DescribeForwardTableEntriesResponseBody build() {
            return new DescribeForwardTableEntriesResponseBody(this);
        } 

    } 

    public static class ForwardTableEntry extends TeaModel {
        @NameInMap("ExternalIp")
        private String externalIp;

        @NameInMap("ExternalPort")
        private String externalPort;

        @NameInMap("ForwardEntryId")
        private String forwardEntryId;

        @NameInMap("ForwardEntryName")
        private String forwardEntryName;

        @NameInMap("ForwardTableId")
        private String forwardTableId;

        @NameInMap("InternalIp")
        private String internalIp;

        @NameInMap("InternalPort")
        private String internalPort;

        @NameInMap("IpProtocol")
        private String ipProtocol;

        @NameInMap("Status")
        private String status;

        private ForwardTableEntry(Builder builder) {
            this.externalIp = builder.externalIp;
            this.externalPort = builder.externalPort;
            this.forwardEntryId = builder.forwardEntryId;
            this.forwardEntryName = builder.forwardEntryName;
            this.forwardTableId = builder.forwardTableId;
            this.internalIp = builder.internalIp;
            this.internalPort = builder.internalPort;
            this.ipProtocol = builder.ipProtocol;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardTableEntry create() {
            return builder().build();
        }

        /**
         * @return externalIp
         */
        public String getExternalIp() {
            return this.externalIp;
        }

        /**
         * @return externalPort
         */
        public String getExternalPort() {
            return this.externalPort;
        }

        /**
         * @return forwardEntryId
         */
        public String getForwardEntryId() {
            return this.forwardEntryId;
        }

        /**
         * @return forwardEntryName
         */
        public String getForwardEntryName() {
            return this.forwardEntryName;
        }

        /**
         * @return forwardTableId
         */
        public String getForwardTableId() {
            return this.forwardTableId;
        }

        /**
         * @return internalIp
         */
        public String getInternalIp() {
            return this.internalIp;
        }

        /**
         * @return internalPort
         */
        public String getInternalPort() {
            return this.internalPort;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String externalIp; 
            private String externalPort; 
            private String forwardEntryId; 
            private String forwardEntryName; 
            private String forwardTableId; 
            private String internalIp; 
            private String internalPort; 
            private String ipProtocol; 
            private String status; 

            /**
             * *   The EIPs that can be accessed over the Internet when you query DNAT entries of Internet NAT gateways.
             * <p>
             * *   The NAT IP addresses that can be accessed by external networks when you query DNAT entries of VPC NAT gateways.
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * *   The external port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.
             * <p>
             * *   The port that is used when the NAT IP address can be accessed by external networks when you query DNAT entries of VPC NAT gateways.
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * The ID of the DNAT entry.
             */
            public Builder forwardEntryId(String forwardEntryId) {
                this.forwardEntryId = forwardEntryId;
                return this;
            }

            /**
             * The name of the DNAT entry.
             */
            public Builder forwardEntryName(String forwardEntryName) {
                this.forwardEntryName = forwardEntryName;
                return this;
            }

            /**
             * The ID of the DNAT table to which the DNAT entry belongs.
             */
            public Builder forwardTableId(String forwardTableId) {
                this.forwardTableId = forwardTableId;
                return this;
            }

            /**
             * The private IP address.
             * <p>
             * 
             * *   The private IP address of the ECS instance that uses DNAT entries to communicate with the Internet when you query DNAT entries of Internet NAT gateways.
             * *   The private IP address that uses DNAT entries when you query DNAT entries of VPC NAT gateways.
             */
            public Builder internalIp(String internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * *   The internal port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.
             * <p>
             * *   The destination ECS instance port to be mapped when you query DNAT entries of VPC NAT gateways.
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            /**
             * The protocol. Valid values:
             * <p>
             * 
             * *   **TCP**: The NAT gateway forwards TCP packets.
             * *   **UDP**: The NAT gateway forwards UDP packets.
             * *   **Any**: The NAT gateway forwards packets of all protocols.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * The status of the DNAT entry. Valid values:
             * <p>
             * 
             * *   **Pending**: being created or modified
             * *   **Available**: available
             * *   **Deleting**: being deleted
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ForwardTableEntry build() {
                return new ForwardTableEntry(this);
            } 

        } 

    }
    public static class ForwardTableEntries extends TeaModel {
        @NameInMap("ForwardTableEntry")
        private java.util.List < ForwardTableEntry> forwardTableEntry;

        private ForwardTableEntries(Builder builder) {
            this.forwardTableEntry = builder.forwardTableEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardTableEntries create() {
            return builder().build();
        }

        /**
         * @return forwardTableEntry
         */
        public java.util.List < ForwardTableEntry> getForwardTableEntry() {
            return this.forwardTableEntry;
        }

        public static final class Builder {
            private java.util.List < ForwardTableEntry> forwardTableEntry; 

            /**
             * ForwardTableEntry.
             */
            public Builder forwardTableEntry(java.util.List < ForwardTableEntry> forwardTableEntry) {
                this.forwardTableEntry = forwardTableEntry;
                return this;
            }

            public ForwardTableEntries build() {
                return new ForwardTableEntries(this);
            } 

        } 

    }
}
