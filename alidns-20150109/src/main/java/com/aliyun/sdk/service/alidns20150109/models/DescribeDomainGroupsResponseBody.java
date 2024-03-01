// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainGroupsResponseBody</p>
 */
public class DescribeDomainGroupsResponseBody extends TeaModel {
    @NameInMap("DomainGroups")
    private DomainGroups domainGroups;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The domain name groups.
         */
        public Builder domainGroups(DomainGroups domainGroups) {
            this.domainGroups = domainGroups;
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
         * The number of entries per page. Valid values: **1 to 100**. Default value: **20**.
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

        public DescribeDomainGroupsResponseBody build() {
            return new DescribeDomainGroupsResponseBody(this);
        } 

    } 

    public static class DomainGroup extends TeaModel {
        @NameInMap("DomainCount")
        private Long domainCount;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
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
             * The number of domain name groups.
             */
            public Builder domainCount(Long domainCount) {
                this.domainCount = domainCount;
                return this;
            }

            /**
             * The ID of the domain name group. Valid values:
             * <p>
             * 
             * *   defaultGroup: the default group
             * *   If an empty string is returned, it indicates the group that contains all domain names.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the domain name group.
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
    public static class DomainGroups extends TeaModel {
        @NameInMap("DomainGroup")
        private java.util.List < DomainGroup> domainGroup;

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
        public java.util.List < DomainGroup> getDomainGroup() {
            return this.domainGroup;
        }

        public static final class Builder {
            private java.util.List < DomainGroup> domainGroup; 

            /**
             * DomainGroup.
             */
            public Builder domainGroup(java.util.List < DomainGroup> domainGroup) {
                this.domainGroup = domainGroup;
                return this;
            }

            public DomainGroups build() {
                return new DomainGroups(this);
            } 

        } 

    }
}
