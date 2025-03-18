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
 * {@link DescribeForwardTableEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeForwardTableEntriesResponseBody</p>
 */
public class DescribeForwardTableEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardTableEntries")
    private java.util.List<ForwardTableEntries> forwardTableEntries;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardTableEntries
     */
    public java.util.List<ForwardTableEntries> getForwardTableEntries() {
        return this.forwardTableEntries;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ForwardTableEntries> forwardTableEntries; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeForwardTableEntriesResponseBody model) {
            this.forwardTableEntries = model.forwardTableEntries;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details of DNAT entries.</p>
         */
        public Builder forwardTableEntries(java.util.List<ForwardTableEntries> forwardTableEntries) {
            this.forwardTableEntries = forwardTableEntries;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(String totalCount) {
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
    public static class ForwardTableEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private String externalIp;

        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("ForwardEntryId")
        private String forwardEntryId;

        @com.aliyun.core.annotation.NameInMap("ForwardEntryName")
        private String forwardEntryName;

        @com.aliyun.core.annotation.NameInMap("HealthCheckPort")
        private String healthCheckPort;

        @com.aliyun.core.annotation.NameInMap("InternalIp")
        private String internalIp;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("StandbyExternalIp")
        private String standbyExternalIp;

        @com.aliyun.core.annotation.NameInMap("StandbyStatus")
        private String standbyStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ForwardTableEntries(Builder builder) {
            this.externalIp = builder.externalIp;
            this.externalPort = builder.externalPort;
            this.forwardEntryId = builder.forwardEntryId;
            this.forwardEntryName = builder.forwardEntryName;
            this.healthCheckPort = builder.healthCheckPort;
            this.internalIp = builder.internalIp;
            this.internalPort = builder.internalPort;
            this.ipProtocol = builder.ipProtocol;
            this.natGatewayId = builder.natGatewayId;
            this.standbyExternalIp = builder.standbyExternalIp;
            this.standbyStatus = builder.standbyStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardTableEntries create() {
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
         * @return healthCheckPort
         */
        public String getHealthCheckPort() {
            return this.healthCheckPort;
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
         * @return standbyExternalIp
         */
        public String getStandbyExternalIp() {
            return this.standbyExternalIp;
        }

        /**
         * @return standbyStatus
         */
        public String getStandbyStatus() {
            return this.standbyStatus;
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
            private String healthCheckPort; 
            private String internalIp; 
            private String internalPort; 
            private String ipProtocol; 
            private String natGatewayId; 
            private String standbyExternalIp; 
            private String standbyStatus; 
            private String status; 

            private Builder() {
            } 

            private Builder(ForwardTableEntries model) {
                this.externalIp = model.externalIp;
                this.externalPort = model.externalPort;
                this.forwardEntryId = model.forwardEntryId;
                this.forwardEntryName = model.forwardEntryName;
                this.healthCheckPort = model.healthCheckPort;
                this.internalIp = model.internalIp;
                this.internalPort = model.internalPort;
                this.ipProtocol = model.ipProtocol;
                this.natGatewayId = model.natGatewayId;
                this.standbyExternalIp = model.standbyExternalIp;
                this.standbyStatus = model.standbyStatus;
                this.status = model.status;
            } 

            /**
             * <p>The EIP in the DNAT entry. The public IP address is used to access the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>120.XXX.XXX.70</p>
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * <p>The external port or port range that is used in port forwarding.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * <p>The ID of the DNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>fwd-5tf66679oi2uoxcvlg0g2****</p>
             */
            public Builder forwardEntryId(String forwardEntryId) {
                this.forwardEntryId = forwardEntryId;
                return this;
            }

            /**
             * <p>The name of the DNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>test0</p>
             */
            public Builder forwardEntryName(String forwardEntryName) {
                this.forwardEntryName = forwardEntryName;
                return this;
            }

            /**
             * <p>The probe port of DNAT.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder healthCheckPort(String healthCheckPort) {
                this.healthCheckPort = healthCheckPort;
                return this;
            }

            /**
             * <p>The private IP address of the instance that uses the DNAT entry for Internet communication.</p>
             * 
             * <strong>example:</strong>
             * <p>10.XXX.XXX.3</p>
             */
            public Builder internalIp(String internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * <p>The internal port or port range that is used for port forwarding.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong>: forwards TCP packets.</li>
             * <li><strong>UDP</strong>: forwards UDP packets.</li>
             * <li><strong>Any</strong>: forwards all packets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Any</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>nat-5tawjw5j7sgd2deujxuk0****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The secondary EIP that is used to access the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>101.XXX.XXX.7</p>
             */
            public Builder standbyExternalIp(String standbyExternalIp) {
                this.standbyExternalIp = standbyExternalIp;
                return this;
            }

            /**
             * <p>The status of the secondary EIP. Valid values:</p>
             * <ul>
             * <li>Running</li>
             * <li>Stopping</li>
             * <li>Stopped</li>
             * <li>Starting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Stopped</p>
             */
            public Builder standbyStatus(String standbyStatus) {
                this.standbyStatus = standbyStatus;
                return this;
            }

            /**
             * <p>The status of the DNAT entry. Valid values:</p>
             * <ul>
             * <li>Pending: The DNAT entry is being created or modified.</li>
             * <li>Available: The DNAT entry is available.</li>
             * <li>Deleting: The DNAT entry is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ForwardTableEntries build() {
                return new ForwardTableEntries(this);
            } 

        } 

    }
}
