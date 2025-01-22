// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListLivePackageChannelGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLivePackageChannelGroupsResponseBody</p>
 */
public class ListLivePackageChannelGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LivePackageChannelGroups")
    private java.util.List<LivePackageChannelGroups> livePackageChannelGroups;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListLivePackageChannelGroupsResponseBody(Builder builder) {
        this.livePackageChannelGroups = builder.livePackageChannelGroups;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLivePackageChannelGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return livePackageChannelGroups
     */
    public java.util.List<LivePackageChannelGroups> getLivePackageChannelGroups() {
        return this.livePackageChannelGroups;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<LivePackageChannelGroups> livePackageChannelGroups; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private String sortBy; 
        private Long totalCount; 

        /**
         * LivePackageChannelGroups.
         */
        public Builder livePackageChannelGroups(java.util.List<LivePackageChannelGroups> livePackageChannelGroups) {
            this.livePackageChannelGroups = livePackageChannelGroups;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLivePackageChannelGroupsResponseBody build() {
            return new ListLivePackageChannelGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLivePackageChannelGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLivePackageChannelGroupsResponseBody</p>
     */
    public static class LivePackageChannelGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("OriginDomain")
        private String originDomain;

        private LivePackageChannelGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.groupName = builder.groupName;
            this.lastModified = builder.lastModified;
            this.originDomain = builder.originDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivePackageChannelGroups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return originDomain
         */
        public String getOriginDomain() {
            return this.originDomain;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String groupName; 
            private String lastModified; 
            private String originDomain; 

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>代表资源一级ID的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>testChannelGroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>修改时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-02T12:00:00Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>源站域名</p>
             * 
             * <strong>example:</strong>
             * <p>origin.example.com</p>
             */
            public Builder originDomain(String originDomain) {
                this.originDomain = originDomain;
                return this;
            }

            public LivePackageChannelGroups build() {
                return new LivePackageChannelGroups(this);
            } 

        } 

    }
}
