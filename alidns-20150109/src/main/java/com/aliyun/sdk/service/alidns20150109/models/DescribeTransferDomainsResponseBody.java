// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeTransferDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransferDomainsResponseBody</p>
 */
public class DescribeTransferDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainTransfers")
    private DomainTransfers domainTransfers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeTransferDomainsResponseBody(Builder builder) {
        this.domainTransfers = builder.domainTransfers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransferDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainTransfers
     */
    public DomainTransfers getDomainTransfers() {
        return this.domainTransfers;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DomainTransfers domainTransfers; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTransferDomainsResponseBody model) {
            this.domainTransfers = model.domainTransfers;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The domain names that were transferred between accounts.</p>
         */
        public Builder domainTransfers(DomainTransfers domainTransfers) {
            this.domainTransfers = domainTransfers;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTransferDomainsResponseBody build() {
            return new DescribeTransferDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransferDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransferDomainsResponseBody</p>
     */
    public static class DomainTransfer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("FromUserId")
        private Long fromUserId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("TargetUserId")
        private Long targetUserId;

        private DomainTransfer(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.domainName = builder.domainName;
            this.fromUserId = builder.fromUserId;
            this.id = builder.id;
            this.targetUserId = builder.targetUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTransfer create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return fromUserId
         */
        public Long getFromUserId() {
            return this.fromUserId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return targetUserId
         */
        public Long getTargetUserId() {
            return this.targetUserId;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private String domainName; 
            private Long fromUserId; 
            private Long id; 
            private Long targetUserId; 

            private Builder() {
            } 

            private Builder(DomainTransfer model) {
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.domainName = model.domainName;
                this.fromUserId = model.fromUserId;
                this.id = model.id;
                this.targetUserId = model.targetUserId;
            } 

            /**
             * <p>The time when the domain name was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-30T07:16Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the domain name was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1572419764000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The user ID from which the domain name was transferred.</p>
             * 
             * <strong>example:</strong>
             * <p>2222</p>
             */
            public Builder fromUserId(Long fromUserId) {
                this.fromUserId = fromUserId;
                return this;
            }

            /**
             * <p>The ID of the domain name that was transferred.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The user ID to which the domain name was transferred.</p>
             * 
             * <strong>example:</strong>
             * <p>111111</p>
             */
            public Builder targetUserId(Long targetUserId) {
                this.targetUserId = targetUserId;
                return this;
            }

            public DomainTransfer build() {
                return new DomainTransfer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTransferDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransferDomainsResponseBody</p>
     */
    public static class DomainTransfers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainTransfer")
        private java.util.List<DomainTransfer> domainTransfer;

        private DomainTransfers(Builder builder) {
            this.domainTransfer = builder.domainTransfer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTransfers create() {
            return builder().build();
        }

        /**
         * @return domainTransfer
         */
        public java.util.List<DomainTransfer> getDomainTransfer() {
            return this.domainTransfer;
        }

        public static final class Builder {
            private java.util.List<DomainTransfer> domainTransfer; 

            private Builder() {
            } 

            private Builder(DomainTransfers model) {
                this.domainTransfer = model.domainTransfer;
            } 

            /**
             * DomainTransfer.
             */
            public Builder domainTransfer(java.util.List<DomainTransfer> domainTransfer) {
                this.domainTransfer = domainTransfer;
                return this;
            }

            public DomainTransfers build() {
                return new DomainTransfers(this);
            } 

        } 

    }
}
