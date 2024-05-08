// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * ForwardTableEntries.
         */
        public Builder forwardTableEntries(ForwardTableEntries forwardTableEntries) {
            this.forwardTableEntries = forwardTableEntries;
            return this;
        }

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
         * TotalCount.
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
        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private String externalIp;

        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("ForwardEntryId")
        private String forwardEntryId;

        @com.aliyun.core.annotation.NameInMap("ForwardTableId")
        private String forwardTableId;

        @com.aliyun.core.annotation.NameInMap("InternalIp")
        private String internalIp;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ForwardTableEntry(Builder builder) {
            this.externalIp = builder.externalIp;
            this.externalPort = builder.externalPort;
            this.forwardEntryId = builder.forwardEntryId;
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
            private String forwardTableId; 
            private String internalIp; 
            private String internalPort; 
            private String ipProtocol; 
            private String status; 

            /**
             * ExternalIp.
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * ExternalPort.
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * ForwardEntryId.
             */
            public Builder forwardEntryId(String forwardEntryId) {
                this.forwardEntryId = forwardEntryId;
                return this;
            }

            /**
             * ForwardTableId.
             */
            public Builder forwardTableId(String forwardTableId) {
                this.forwardTableId = forwardTableId;
                return this;
            }

            /**
             * InternalIp.
             */
            public Builder internalIp(String internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * InternalPort.
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Status.
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
        @com.aliyun.core.annotation.NameInMap("ForwardTableEntry")
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
