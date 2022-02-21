// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnatTableEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnatTableEntriesResponseBody</p>
 */
public class DescribeSnatTableEntriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnatTableEntries")
    private SnatTableEntries snatTableEntries;

    @NameInMap("TotalCount")
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

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnatTableEntries.
         */
        public Builder snatTableEntries(SnatTableEntries snatTableEntries) {
            this.snatTableEntries = snatTableEntries;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnatTableEntriesResponseBody build() {
            return new DescribeSnatTableEntriesResponseBody(this);
        } 

    } 

    public static class SnatTableEntry extends TeaModel {
        @NameInMap("SnatEntryId")
        private String snatEntryId;

        @NameInMap("SnatEntryName")
        private String snatEntryName;

        @NameInMap("SnatIp")
        private String snatIp;

        @NameInMap("SnatTableId")
        private String snatTableId;

        @NameInMap("SourceCIDR")
        private String sourceCIDR;

        @NameInMap("SourceVSwitchId")
        private String sourceVSwitchId;

        @NameInMap("Status")
        private String status;

        private SnatTableEntry(Builder builder) {
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
            private String snatEntryId; 
            private String snatEntryName; 
            private String snatIp; 
            private String snatTableId; 
            private String sourceCIDR; 
            private String sourceVSwitchId; 
            private String status; 

            /**
             * SnatEntryId.
             */
            public Builder snatEntryId(String snatEntryId) {
                this.snatEntryId = snatEntryId;
                return this;
            }

            /**
             * SnatEntryName.
             */
            public Builder snatEntryName(String snatEntryName) {
                this.snatEntryName = snatEntryName;
                return this;
            }

            /**
             * SnatIp.
             */
            public Builder snatIp(String snatIp) {
                this.snatIp = snatIp;
                return this;
            }

            /**
             * SnatTableId.
             */
            public Builder snatTableId(String snatTableId) {
                this.snatTableId = snatTableId;
                return this;
            }

            /**
             * SourceCIDR.
             */
            public Builder sourceCIDR(String sourceCIDR) {
                this.sourceCIDR = sourceCIDR;
                return this;
            }

            /**
             * SourceVSwitchId.
             */
            public Builder sourceVSwitchId(String sourceVSwitchId) {
                this.sourceVSwitchId = sourceVSwitchId;
                return this;
            }

            /**
             * Status.
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
    public static class SnatTableEntries extends TeaModel {
        @NameInMap("SnatTableEntry")
        private java.util.List < SnatTableEntry> snatTableEntry;

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
        public java.util.List < SnatTableEntry> getSnatTableEntry() {
            return this.snatTableEntry;
        }

        public static final class Builder {
            private java.util.List < SnatTableEntry> snatTableEntry; 

            /**
             * SnatTableEntry.
             */
            public Builder snatTableEntry(java.util.List < SnatTableEntry> snatTableEntry) {
                this.snatTableEntry = snatTableEntry;
                return this;
            }

            public SnatTableEntries build() {
                return new SnatTableEntries(this);
            } 

        } 

    }
}
