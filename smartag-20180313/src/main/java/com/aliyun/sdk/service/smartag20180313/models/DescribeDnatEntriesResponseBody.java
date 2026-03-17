// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeDnatEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnatEntriesResponseBody</p>
 */
public class DescribeDnatEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DnatEntries")
    private DnatEntries dnatEntries;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDnatEntriesResponseBody(Builder builder) {
        this.dnatEntries = builder.dnatEntries;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnatEntriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnatEntries
     */
    public DnatEntries getDnatEntries() {
        return this.dnatEntries;
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
        private DnatEntries dnatEntries; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDnatEntriesResponseBody model) {
            this.dnatEntries = model.dnatEntries;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of DNAT entries.</p>
         */
        public Builder dnatEntries(DnatEntries dnatEntries) {
            this.dnatEntries = dnatEntries;
            return this;
        }

        /**
         * <p>The page number of the returned page. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: <strong>10</strong>. Maximum value: <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>635640CA-2335-4856-A9CB-1CB5C444DC5A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDnatEntriesResponseBody build() {
            return new DescribeDnatEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnatEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnatEntriesResponseBody</p>
     */
    public static class DnatEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnatEntryId")
        private String dnatEntryId;

        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private String externalIp;

        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("InternalIp")
        private String internalIp;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("SagId")
        private String sagId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DnatEntry(Builder builder) {
            this.dnatEntryId = builder.dnatEntryId;
            this.externalIp = builder.externalIp;
            this.externalPort = builder.externalPort;
            this.internalIp = builder.internalIp;
            this.internalPort = builder.internalPort;
            this.ipProtocol = builder.ipProtocol;
            this.sagId = builder.sagId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnatEntry create() {
            return builder().build();
        }

        /**
         * @return dnatEntryId
         */
        public String getDnatEntryId() {
            return this.dnatEntryId;
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
         * @return sagId
         */
        public String getSagId() {
            return this.sagId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String dnatEntryId; 
            private String externalIp; 
            private String externalPort; 
            private String internalIp; 
            private String internalPort; 
            private String ipProtocol; 
            private String sagId; 
            private String type; 

            private Builder() {
            } 

            private Builder(DnatEntry model) {
                this.dnatEntryId = model.dnatEntryId;
                this.externalIp = model.externalIp;
                this.externalPort = model.externalPort;
                this.internalIp = model.internalIp;
                this.internalPort = model.internalPort;
                this.ipProtocol = model.ipProtocol;
                this.sagId = model.sagId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the DNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>fwd-kxe4fq3xuzczze****</p>
             */
            public Builder dnatEntryId(String dnatEntryId) {
                this.dnatEntryId = dnatEntryId;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p><code>10.10.**.**</code></p>
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * <p>The public port.</p>
             * <p>Valid values: <strong>1 to 65535</strong> and <strong>any</strong>. The value any indicates all ports.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * <p>The destination private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder internalIp(String internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * <p>The destination private port.</p>
             * <p>Valid values: <strong>1 to 65535</strong> and <strong>any</strong>. The value any indicates all ports.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            /**
             * <p>The protocol used in DNAT. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong>.</li>
             * <li><strong>udp</strong>.</li>
             * <li><strong>any</strong>: all protocols.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-jfh********</p>
             */
            public Builder sagId(String sagId) {
                this.sagId = sagId;
                return this;
            }

            /**
             * <p>The type of the DNAT entry. Valid values:</p>
             * <ul>
             * <li><strong>Intranet</strong>: the IP address was translated to a specific internal IP address. This is the default value.</li>
             * <li><strong>Internet</strong>: the IP address was translated to a specific public IP address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Intranet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DnatEntry build() {
                return new DnatEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnatEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnatEntriesResponseBody</p>
     */
    public static class DnatEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnatEntry")
        private java.util.List<DnatEntry> dnatEntry;

        private DnatEntries(Builder builder) {
            this.dnatEntry = builder.dnatEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnatEntries create() {
            return builder().build();
        }

        /**
         * @return dnatEntry
         */
        public java.util.List<DnatEntry> getDnatEntry() {
            return this.dnatEntry;
        }

        public static final class Builder {
            private java.util.List<DnatEntry> dnatEntry; 

            private Builder() {
            } 

            private Builder(DnatEntries model) {
                this.dnatEntry = model.dnatEntry;
            } 

            /**
             * DnatEntry.
             */
            public Builder dnatEntry(java.util.List<DnatEntry> dnatEntry) {
                this.dnatEntry = dnatEntry;
                return this;
            }

            public DnatEntries build() {
                return new DnatEntries(this);
            } 

        } 

    }
}
