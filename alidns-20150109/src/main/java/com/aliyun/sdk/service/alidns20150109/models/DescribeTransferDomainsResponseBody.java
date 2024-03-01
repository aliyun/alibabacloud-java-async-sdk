// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransferDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransferDomainsResponseBody</p>
 */
public class DescribeTransferDomainsResponseBody extends TeaModel {
    @NameInMap("DomainTransfers")
    private DomainTransfers domainTransfers;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * The domain names that were transferred between accounts.
         */
        public Builder domainTransfers(DomainTransfers domainTransfers) {
            this.domainTransfers = domainTransfers;
            return this;
        }

        /**
         * The page number. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 20.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTransferDomainsResponseBody build() {
            return new DescribeTransferDomainsResponseBody(this);
        } 

    } 

    public static class DomainTransfer extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("FromUserId")
        private Long fromUserId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("TargetUserId")
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

            /**
             * The time when the domain name was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the domain name was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The user ID from which the domain name was transferred.
             */
            public Builder fromUserId(Long fromUserId) {
                this.fromUserId = fromUserId;
                return this;
            }

            /**
             * The ID of the domain name that was transferred.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The user ID to which the domain name was transferred.
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
    public static class DomainTransfers extends TeaModel {
        @NameInMap("DomainTransfer")
        private java.util.List < DomainTransfer> domainTransfer;

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
        public java.util.List < DomainTransfer> getDomainTransfer() {
            return this.domainTransfer;
        }

        public static final class Builder {
            private java.util.List < DomainTransfer> domainTransfer; 

            /**
             * DomainTransfer.
             */
            public Builder domainTransfer(java.util.List < DomainTransfer> domainTransfer) {
                this.domainTransfer = domainTransfer;
                return this;
            }

            public DomainTransfers build() {
                return new DomainTransfers(this);
            } 

        } 

    }
}
