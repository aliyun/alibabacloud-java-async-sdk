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
 * {@link DescribeSnatEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnatEntriesResponseBody</p>
 */
public class DescribeSnatEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnatEntries")
    private SnatEntries snatEntries;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSnatEntriesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snatEntries = builder.snatEntries;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnatEntriesResponseBody create() {
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
     * @return snatEntries
     */
    public SnatEntries getSnatEntries() {
        return this.snatEntries;
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
        private SnatEntries snatEntries; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSnatEntriesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.snatEntries = model.snatEntries;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>674BC3B2-5828-41D5-830E-148EE6CF86C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the SNAT entries.</p>
         */
        public Builder snatEntries(SnatEntries snatEntries) {
            this.snatEntries = snatEntries;
            return this;
        }

        /**
         * <p>The total number of SNAT entries.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnatEntriesResponseBody build() {
            return new DescribeSnatEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnatEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnatEntriesResponseBody</p>
     */
    public static class SnatEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SnatIp")
        private String snatIp;

        private SnatEntry(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.snatIp = builder.snatIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatEntry create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return snatIp
         */
        public String getSnatIp() {
            return this.snatIp;
        }

        public static final class Builder {
            private String cidrBlock; 
            private Long createTime; 
            private String instanceId; 
            private String snatIp; 

            private Builder() {
            } 

            private Builder(SnatEntry model) {
                this.cidrBlock = model.cidrBlock;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.snatIp = model.snatIp;
            } 

            /**
             * <p>The destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.169.10.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The time when the SNAT entry was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1523604565000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the SNAT entry.</p>
             * 
             * <strong>example:</strong>
             * <p>snat-sl7kb9cpgfds*****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p><code>10.10.**.**</code></p>
             */
            public Builder snatIp(String snatIp) {
                this.snatIp = snatIp;
                return this;
            }

            public SnatEntry build() {
                return new SnatEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnatEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnatEntriesResponseBody</p>
     */
    public static class SnatEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnatEntry")
        private java.util.List<SnatEntry> snatEntry;

        private SnatEntries(Builder builder) {
            this.snatEntry = builder.snatEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatEntries create() {
            return builder().build();
        }

        /**
         * @return snatEntry
         */
        public java.util.List<SnatEntry> getSnatEntry() {
            return this.snatEntry;
        }

        public static final class Builder {
            private java.util.List<SnatEntry> snatEntry; 

            private Builder() {
            } 

            private Builder(SnatEntries model) {
                this.snatEntry = model.snatEntry;
            } 

            /**
             * SnatEntry.
             */
            public Builder snatEntry(java.util.List<SnatEntry> snatEntry) {
                this.snatEntry = snatEntry;
                return this;
            }

            public SnatEntries build() {
                return new SnatEntries(this);
            } 

        } 

    }
}
