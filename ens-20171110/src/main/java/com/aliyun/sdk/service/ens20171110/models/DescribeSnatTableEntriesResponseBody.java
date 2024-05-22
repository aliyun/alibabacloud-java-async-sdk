// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < SnatTableEntries> snatTableEntries;

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
    public java.util.List < SnatTableEntries> getSnatTableEntries() {
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
        private java.util.List < SnatTableEntries> snatTableEntries; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
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
         * Details of SNAT entries.
         */
        public Builder snatTableEntries(java.util.List < SnatTableEntries> snatTableEntries) {
            this.snatTableEntries = snatTableEntries;
            return this;
        }

        /**
         * The number of SNAT entries that are returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnatTableEntriesResponseBody build() {
            return new DescribeSnatTableEntriesResponseBody(this);
        } 

    } 

    public static class SnatTableEntries extends TeaModel {
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
            private String natGatewayId; 
            private String snatEntryId; 
            private String snatEntryName; 
            private String snatIp; 
            private String sourceCIDR; 
            private String standbySnatIp; 
            private String standbyStatus; 
            private String status; 

            /**
             * The ID of the NAT gateway.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * The ID of the SNAT entry.
             */
            public Builder snatEntryId(String snatEntryId) {
                this.snatEntryId = snatEntryId;
                return this;
            }

            /**
             * The name of the SNAT entry.
             */
            public Builder snatEntryName(String snatEntryName) {
                this.snatEntryName = snatEntryName;
                return this;
            }

            /**
             * The EIP specified in the SNAT entry.
             */
            public Builder snatIp(String snatIp) {
                this.snatIp = snatIp;
                return this;
            }

            /**
             * The source CIDR block specified in the SNAT entry.
             */
            public Builder sourceCIDR(String sourceCIDR) {
                this.sourceCIDR = sourceCIDR;
                return this;
            }

            /**
             * The secondary EIP. Multiple EIPs are separated by commas (,).
             */
            public Builder standbySnatIp(String standbySnatIp) {
                this.standbySnatIp = standbySnatIp;
                return this;
            }

            /**
             * The status of the secondary EIP. Valid values:
             * <p>
             * 
             * *   Running
             * *   Stopping
             * *   Stopped
             * *   Starting
             */
            public Builder standbyStatus(String standbyStatus) {
                this.standbyStatus = standbyStatus;
                return this;
            }

            /**
             * The status of the SNAT entry. Valid values:
             * <p>
             * 
             * *   Pending: The SNAT entry is being created or modified.
             * *   Available: The SNAT entry is available.
             * *   Deleting: The SNAT entry is being deleted.
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
