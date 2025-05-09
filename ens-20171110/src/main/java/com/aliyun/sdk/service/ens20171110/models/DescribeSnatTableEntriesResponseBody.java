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
    private java.util.List<SnatTableEntries> snatTableEntries;

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
    public java.util.List<SnatTableEntries> getSnatTableEntries() {
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
        private java.util.List<SnatTableEntries> snatTableEntries; 
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
         * <p>The details of the SNAT entries.</p>
         */
        public Builder snatTableEntries(java.util.List<SnatTableEntries> snatTableEntries) {
            this.snatTableEntries = snatTableEntries;
            return this;
        }

        /**
         * <p>The number of SNAT entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
    public static class SnatTableEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipAffinity")
        private Boolean eipAffinity;

        @com.aliyun.core.annotation.NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @com.aliyun.core.annotation.NameInMap("IspAffinity")
        private Boolean ispAffinity;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("SnatEntryId")
        private String snatEntryId;

        @com.aliyun.core.annotation.NameInMap("SnatEntryName")
        private String snatEntryName;

        @com.aliyun.core.annotation.NameInMap("SnatIp")
        private String snatIp;

        @com.aliyun.core.annotation.NameInMap("SourceCIDR")
        private String sourceCIDR;

        @com.aliyun.core.annotation.NameInMap("StandbySnatIp")
        private String standbySnatIp;

        @com.aliyun.core.annotation.NameInMap("StandbyStatus")
        private String standbyStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SnatTableEntries(Builder builder) {
            this.eipAffinity = builder.eipAffinity;
            this.idleTimeout = builder.idleTimeout;
            this.ispAffinity = builder.ispAffinity;
            this.natGatewayId = builder.natGatewayId;
            this.snatEntryId = builder.snatEntryId;
            this.snatEntryName = builder.snatEntryName;
            this.snatIp = builder.snatIp;
            this.sourceCIDR = builder.sourceCIDR;
            this.standbySnatIp = builder.standbySnatIp;
            this.standbyStatus = builder.standbyStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatTableEntries create() {
            return builder().build();
        }

        /**
         * @return eipAffinity
         */
        public Boolean getEipAffinity() {
            return this.eipAffinity;
        }

        /**
         * @return idleTimeout
         */
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        /**
         * @return ispAffinity
         */
        public Boolean getIspAffinity() {
            return this.ispAffinity;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
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
         * @return sourceCIDR
         */
        public String getSourceCIDR() {
            return this.sourceCIDR;
        }

        /**
         * @return standbySnatIp
         */
        public String getStandbySnatIp() {
            return this.standbySnatIp;
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
            private Boolean eipAffinity; 
            private Integer idleTimeout; 
            private Boolean ispAffinity; 
            private String natGatewayId; 
            private String snatEntryId; 
            private String snatEntryName; 
            private String snatIp; 
            private String sourceCIDR; 
            private String standbySnatIp; 
            private String standbyStatus; 
            private String status; 

            private Builder() {
            } 

            private Builder(SnatTableEntries model) {
                this.eipAffinity = model.eipAffinity;
                this.idleTimeout = model.idleTimeout;
                this.ispAffinity = model.ispAffinity;
                this.natGatewayId = model.natGatewayId;
                this.snatEntryId = model.snatEntryId;
                this.snatEntryName = model.snatEntryName;
                this.snatIp = model.snatIp;
                this.sourceCIDR = model.sourceCIDR;
                this.standbySnatIp = model.standbySnatIp;
                this.standbyStatus = model.standbyStatus;
                this.status = model.status;
            } 

            /**
             * <p>Specifies whether to enable EIP affinity. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * <p>**</p>
             * <p><strong>Description</strong> After you enable EIP affinity, if multiple EIPs are associated with an SNAT entry, each client uses one EIP to access the Internet. If EIP affinity is disabled, each client uses a random EIP to access the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder eipAffinity(Boolean eipAffinity) {
                this.eipAffinity = eipAffinity;
                return this;
            }

            /**
             * <p>The timeout period for idle connections. Valid values: <strong>1</strong> to <strong>86400</strong>. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * <p>Whether to enable operator affinity. Value taking:</p>
             * <ul>
             * <li><p>false:Do not open.</p>
             * </li>
             * <li><p>true:Open.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ispAffinity(Boolean ispAffinity) {
                this.ispAffinity = ispAffinity;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The ID of the SNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>snat-5tfjp3537mi6iokl59g5c****</p>
             */
            public Builder snatEntryId(String snatEntryId) {
                this.snatEntryId = snatEntryId;
                return this;
            }

            /**
             * <p>The name of the SNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>test0</p>
             */
            public Builder snatEntryName(String snatEntryName) {
                this.snatEntryName = snatEntryName;
                return this;
            }

            /**
             * <p>The EIP specified in the SNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>120.XXX.XXX.71</p>
             */
            public Builder snatIp(String snatIp) {
                this.snatIp = snatIp;
                return this;
            }

            /**
             * <p>The source CIDR block specified in the SNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.13/32</p>
             */
            public Builder sourceCIDR(String sourceCIDR) {
                this.sourceCIDR = sourceCIDR;
                return this;
            }

            /**
             * <p>The secondary EIP. Multiple EIPs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>101.XXX.XXX.7</p>
             */
            public Builder standbySnatIp(String standbySnatIp) {
                this.standbySnatIp = standbySnatIp;
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
             * <p>The status of the SNAT entry. Valid values:</p>
             * <ul>
             * <li>Pending: The SNAT entry is being created or modified.</li>
             * <li>Available: The SNAT entry is available.</li>
             * <li>Deleting: The SNAT entry is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SnatTableEntries build() {
                return new SnatTableEntries(this);
            } 

        } 

    }
}
