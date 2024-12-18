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
 * {@link DescribeForwardTableEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeForwardTableEntriesResponseBody</p>
 */
public class DescribeForwardTableEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardTableEntries")
    private ForwardTableEntries forwardTableEntries;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The details of DNAT entries.</p>
         */
        public Builder forwardTableEntries(ForwardTableEntries forwardTableEntries) {
            this.forwardTableEntries = forwardTableEntries;
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
         * <p>A6C4A8B1-7561-4509-949C-20DEB40D71E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeForwardTableEntriesResponseBody build() {
            return new DescribeForwardTableEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeForwardTableEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeForwardTableEntriesResponseBody</p>
     */
    public static class ForwardTableEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private String externalIp;

        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("ForwardEntryId")
        private String forwardEntryId;

        @com.aliyun.core.annotation.NameInMap("ForwardEntryName")
        private String forwardEntryName;

        @com.aliyun.core.annotation.NameInMap("ForwardTableId")
        private String forwardTableId;

        @com.aliyun.core.annotation.NameInMap("InternalIp")
        private String internalIp;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
            this.natGatewayId = builder.natGatewayId;
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
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
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
            private String natGatewayId; 
            private String status; 

            /**
             * <ul>
             * <li>The EIPs that can be accessed over the Internet when you query DNAT entries of Internet NAT gateways.</li>
             * <li>The NAT IP addresses that can be accessed by external networks when you query DNAT entries of VPC NAT gateways.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>139.79.XX.XX</p>
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * <ul>
             * <li>The external port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.</li>
             * <li>The port that is used when the NAT IP address can be accessed by external networks when you query DNAT entries of VPC NAT gateways.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * <p>The ID of the DNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>fwd-119smw5tk****</p>
             */
            public Builder forwardEntryId(String forwardEntryId) {
                this.forwardEntryId = forwardEntryId;
                return this;
            }

            /**
             * <p>The name of the DNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>ForwardEntry-1</p>
             */
            public Builder forwardEntryName(String forwardEntryName) {
                this.forwardEntryName = forwardEntryName;
                return this;
            }

            /**
             * <p>The ID of the DNAT table to which the DNAT entry belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ftb-11tc6xgmv****</p>
             */
            public Builder forwardTableId(String forwardTableId) {
                this.forwardTableId = forwardTableId;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * <ul>
             * <li>The private IP address of the ECS instance that uses DNAT entries to communicate with the Internet when you query DNAT entries of Internet NAT gateways.</li>
             * <li>The private IP address that uses DNAT entries when you query DNAT entries of VPC NAT gateways.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder internalIp(String internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * <ul>
             * <li>The internal port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.</li>
             * <li>The destination ECS instance port to be mapped when you query DNAT entries of VPC NAT gateways.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong></li>
             * <li><strong>Any</strong></li>
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
             * <p>The ID of the NAT gateway to which the DNAT entry belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-bp1uewa15k4iy5770****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The status of the DNAT entry. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
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
    /**
     * 
     * {@link DescribeForwardTableEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeForwardTableEntriesResponseBody</p>
     */
    public static class ForwardTableEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardTableEntry")
        private java.util.List<ForwardTableEntry> forwardTableEntry;

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
        public java.util.List<ForwardTableEntry> getForwardTableEntry() {
            return this.forwardTableEntry;
        }

        public static final class Builder {
            private java.util.List<ForwardTableEntry> forwardTableEntry; 

            /**
             * ForwardTableEntry.
             */
            public Builder forwardTableEntry(java.util.List<ForwardTableEntry> forwardTableEntry) {
                this.forwardTableEntry = forwardTableEntry;
                return this;
            }

            public ForwardTableEntries build() {
                return new ForwardTableEntries(this);
            } 

        } 

    }
}
