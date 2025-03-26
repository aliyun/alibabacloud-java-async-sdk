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
 * {@link DescribeSnatTableEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnatTableEntriesResponseBody</p>
 */
public class DescribeSnatTableEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnatTableEntries")
    private SnatTableEntries snatTableEntries;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSnatTableEntriesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snatTableEntries = builder.snatTableEntries;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnatTableEntriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return snatTableEntries
     */
    public SnatTableEntries getSnatTableEntries() {
        return this.snatTableEntries;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SnatTableEntries snatTableEntries; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSnatTableEntriesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.snatTableEntries = model.snatTableEntries;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of the returned page.</p>
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
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6D7E89B1-1C5B-412B-8585-4908E222EED5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of SNAT entries.</p>
         */
        public Builder snatTableEntries(SnatTableEntries snatTableEntries) {
            this.snatTableEntries = snatTableEntries;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnatTableEntriesResponseBody build() {
            return new DescribeSnatTableEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnatTableEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnatTableEntriesResponseBody</p>
     */
    public static class SnatTableEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipAffinity")
        private String eipAffinity;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("SnatEntryId")
        private String snatEntryId;

        @com.aliyun.core.annotation.NameInMap("SnatEntryName")
        private String snatEntryName;

        @com.aliyun.core.annotation.NameInMap("SnatIp")
        private String snatIp;

        @com.aliyun.core.annotation.NameInMap("SnatTableId")
        private String snatTableId;

        @com.aliyun.core.annotation.NameInMap("SourceCIDR")
        private String sourceCIDR;

        @com.aliyun.core.annotation.NameInMap("SourceVSwitchId")
        private String sourceVSwitchId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SnatTableEntry(Builder builder) {
            this.eipAffinity = builder.eipAffinity;
            this.natGatewayId = builder.natGatewayId;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.snatEntryId = builder.snatEntryId;
            this.snatEntryName = builder.snatEntryName;
            this.snatIp = builder.snatIp;
            this.snatTableId = builder.snatTableId;
            this.sourceCIDR = builder.sourceCIDR;
            this.sourceVSwitchId = builder.sourceVSwitchId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatTableEntry create() {
            return builder().build();
        }

        /**
         * @return eipAffinity
         */
        public String getEipAffinity() {
            return this.eipAffinity;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return snatEntryId
         */
        public String getSnatEntryId() {
            return this.snatEntryId;
        }

        /**
         * @return snatEntryName
         */
        public String getSnatEntryName() {
            return this.snatEntryName;
        }

        /**
         * @return snatIp
         */
        public String getSnatIp() {
            return this.snatIp;
        }

        /**
         * @return snatTableId
         */
        public String getSnatTableId() {
            return this.snatTableId;
        }

        /**
         * @return sourceCIDR
         */
        public String getSourceCIDR() {
            return this.sourceCIDR;
        }

        /**
         * @return sourceVSwitchId
         */
        public String getSourceVSwitchId() {
            return this.sourceVSwitchId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String eipAffinity; 
            private String natGatewayId; 
            private String networkInterfaceId; 
            private String snatEntryId; 
            private String snatEntryName; 
            private String snatIp; 
            private String snatTableId; 
            private String sourceCIDR; 
            private String sourceVSwitchId; 
            private String status; 

            private Builder() {
            } 

            private Builder(SnatTableEntry model) {
                this.eipAffinity = model.eipAffinity;
                this.natGatewayId = model.natGatewayId;
                this.networkInterfaceId = model.networkInterfaceId;
                this.snatEntryId = model.snatEntryId;
                this.snatEntryName = model.snatEntryName;
                this.snatIp = model.snatIp;
                this.snatTableId = model.snatTableId;
                this.sourceCIDR = model.sourceCIDR;
                this.sourceVSwitchId = model.sourceVSwitchId;
                this.status = model.status;
            } 

            /**
             * EipAffinity.
             */
            public Builder eipAffinity(String eipAffinity) {
                this.eipAffinity = eipAffinity;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway to which the SNAT entry belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-bp1uewa15k4iy5770****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The ID of the SNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>snat-kmd6nv8fy****</p>
             */
            public Builder snatEntryId(String snatEntryId) {
                this.snatEntryId = snatEntryId;
                return this;
            }

            /**
             * <p>The name of the SNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>SnatEntry-1</p>
             */
            public Builder snatEntryName(String snatEntryName) {
                this.snatEntryName = snatEntryName;
                return this;
            }

            /**
             * <ul>
             * <li>When you query SNAT entries of Internet NAT gateways, this parameter indicates the EIP in an SNAT entry.</li>
             * <li>When you query SNAT entries of VPC NAT gateways, this parameter indicates the NAT IP address in an SNAT entry.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>116.22.XX.XX</p>
             */
            public Builder snatIp(String snatIp) {
                this.snatIp = snatIp;
                return this;
            }

            /**
             * <p>The ID of the SNAT table to which the SNAT entry belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>stb-gz3r3odawdgffde****</p>
             */
            public Builder snatTableId(String snatTableId) {
                this.snatTableId = snatTableId;
                return this;
            }

            /**
             * <p>The source CIDR block specified in the SNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>116.22.XX.XX/24</p>
             */
            public Builder sourceCIDR(String sourceCIDR) {
                this.sourceCIDR = sourceCIDR;
                return this;
            }

            /**
             * <ul>
             * <li>When you query SNAT entries of Internet NAT gateways, this parameter indicates the ID of the vSwitch that uses SNAT to access the Internet.</li>
             * <li>When you query SNAT entries of VPC NAT gateways, this parameter indicates the ID of the vSwitch that uses SNAT to access external networks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsw-3xbdsffvfgdfds****</p>
             */
            public Builder sourceVSwitchId(String sourceVSwitchId) {
                this.sourceVSwitchId = sourceVSwitchId;
                return this;
            }

            /**
             * <p>The status of the SNAT entry. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SnatTableEntry build() {
                return new SnatTableEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnatTableEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnatTableEntriesResponseBody</p>
     */
    public static class SnatTableEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnatTableEntry")
        private java.util.List<SnatTableEntry> snatTableEntry;

        private SnatTableEntries(Builder builder) {
            this.snatTableEntry = builder.snatTableEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatTableEntries create() {
            return builder().build();
        }

        /**
         * @return snatTableEntry
         */
        public java.util.List<SnatTableEntry> getSnatTableEntry() {
            return this.snatTableEntry;
        }

        public static final class Builder {
            private java.util.List<SnatTableEntry> snatTableEntry; 

            private Builder() {
            } 

            private Builder(SnatTableEntries model) {
                this.snatTableEntry = model.snatTableEntry;
            } 

            /**
             * SnatTableEntry.
             */
            public Builder snatTableEntry(java.util.List<SnatTableEntry> snatTableEntry) {
                this.snatTableEntry = snatTableEntry;
                return this;
            }

            public SnatTableEntries build() {
                return new SnatTableEntries(this);
            } 

        } 

    }
}
