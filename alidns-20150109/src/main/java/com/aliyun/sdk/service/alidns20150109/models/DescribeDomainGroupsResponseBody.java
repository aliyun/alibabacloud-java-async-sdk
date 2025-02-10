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
 * {@link DescribeDomainGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainGroupsResponseBody</p>
 */
public class DescribeDomainGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainGroups")
    private DomainGroups domainGroups;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDomainGroupsResponseBody(Builder builder) {
        this.domainGroups = builder.domainGroups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainGroups
     */
    public DomainGroups getDomainGroups() {
        return this.domainGroups;
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
        private DomainGroups domainGroups; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The domain name groups.</p>
         */
        public Builder domainGroups(DomainGroups domainGroups) {
            this.domainGroups = domainGroups;
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
         * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
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

        public DescribeDomainGroupsResponseBody build() {
            return new DescribeDomainGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainGroupsResponseBody</p>
     */
    public static class DomainGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainCount")
        private Long domainCount;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private DomainGroup(Builder builder) {
            this.domainCount = builder.domainCount;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainGroup create() {
            return builder().build();
        }

        /**
         * @return domainCount
         */
        public Long getDomainCount() {
            return this.domainCount;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private Long domainCount; 
            private String groupId; 
            private String groupName; 

            /**
             * <p>The number of domain name groups.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder domainCount(Long domainCount) {
                this.domainCount = domainCount;
                return this;
            }

            /**
             * <p>The ID of the domain name group. Valid values:</p>
             * <ul>
             * <li>defaultGroup: the default group</li>
             * <li>If an empty string is returned, it indicates the group that contains all domain names.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2223</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the domain name group.</p>
             * 
             * <strong>example:</strong>
             * <p>MyGroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public DomainGroup build() {
                return new DomainGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainGroupsResponseBody</p>
     */
    public static class DomainGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainGroup")
        private java.util.List<DomainGroup> domainGroup;

        private DomainGroups(Builder builder) {
            this.domainGroup = builder.domainGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainGroups create() {
            return builder().build();
        }

        /**
         * @return domainGroup
         */
        public java.util.List<DomainGroup> getDomainGroup() {
            return this.domainGroup;
        }

        public static final class Builder {
            private java.util.List<DomainGroup> domainGroup; 

            /**
             * DomainGroup.
             */
            public Builder domainGroup(java.util.List<DomainGroup> domainGroup) {
                this.domainGroup = domainGroup;
                return this;
            }

            public DomainGroups build() {
                return new DomainGroups(this);
            } 

        } 

    }
}
