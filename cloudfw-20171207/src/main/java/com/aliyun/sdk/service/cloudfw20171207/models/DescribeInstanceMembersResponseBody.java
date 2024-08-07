// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceMembersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceMembersResponseBody</p>
 */
public class DescribeInstanceMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Members")
    private java.util.List < Members> members;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceMembersResponseBody(Builder builder) {
        this.members = builder.members;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return members
     */
    public java.util.List < Members> getMembers() {
        return this.members;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Members> members; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The information about the member.
         */
        public Builder members(java.util.List < Members> members) {
            this.members = members;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceMembersResponseBody build() {
            return new DescribeInstanceMembersResponseBody(this);
        } 

    } 

    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Integer createTime;

        @com.aliyun.core.annotation.NameInMap("MemberDesc")
        private String memberDesc;

        @com.aliyun.core.annotation.NameInMap("MemberDisplayName")
        private String memberDisplayName;

        @com.aliyun.core.annotation.NameInMap("MemberStatus")
        private String memberStatus;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private Long memberUid;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Integer modifyTime;

        private Members(Builder builder) {
            this.createTime = builder.createTime;
            this.memberDesc = builder.memberDesc;
            this.memberDisplayName = builder.memberDisplayName;
            this.memberStatus = builder.memberStatus;
            this.memberUid = builder.memberUid;
            this.modifyTime = builder.modifyTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Integer getCreateTime() {
            return this.createTime;
        }

        /**
         * @return memberDesc
         */
        public String getMemberDesc() {
            return this.memberDesc;
        }

        /**
         * @return memberDisplayName
         */
        public String getMemberDisplayName() {
            return this.memberDisplayName;
        }

        /**
         * @return memberStatus
         */
        public String getMemberStatus() {
            return this.memberStatus;
        }

        /**
         * @return memberUid
         */
        public Long getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return modifyTime
         */
        public Integer getModifyTime() {
            return this.modifyTime;
        }

        public static final class Builder {
            private Integer createTime; 
            private String memberDesc; 
            private String memberDisplayName; 
            private String memberStatus; 
            private Long memberUid; 
            private Integer modifyTime; 

            /**
             * The time when the member was added to Cloud Firewall. The value is a timestamp. Unit: seconds.
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The remarks of the member.
             */
            public Builder memberDesc(String memberDesc) {
                this.memberDesc = memberDesc;
                return this;
            }

            /**
             * The name of the member.
             */
            public Builder memberDisplayName(String memberDisplayName) {
                this.memberDisplayName = memberDisplayName;
                return this;
            }

            /**
             * The status of the member. Valid values:
             * <p>
             * 
             * *   **normal**
             * *   **deleting**
             */
            public Builder memberStatus(String memberStatus) {
                this.memberStatus = memberStatus;
                return this;
            }

            /**
             * The UID of the member.
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * The time when the member was last modified. The value is a timestamp. Unit: seconds.
             */
            public Builder modifyTime(Integer modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * The total number of the members.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
