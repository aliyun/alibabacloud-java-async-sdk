// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInstanceMembersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceMembersResponseBody</p>
 */
public class DescribeInstanceMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Members")
    private java.util.List<Members> members;

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
    public java.util.List<Members> getMembers() {
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
        private java.util.List<Members> members; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The information about the member.</p>
         */
        public Builder members(java.util.List<Members> members) {
            this.members = members;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A531AE1A-FBA2-48B6-BAB8-84D02BD409EE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceMembersResponseBody build() {
            return new DescribeInstanceMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceMembersResponseBody</p>
     */
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
             * <p>The time when the member was added to Cloud Firewall. The value is a timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615189819</p>
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The remarks of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>renewal</p>
             */
            public Builder memberDesc(String memberDesc) {
                this.memberDesc = memberDesc;
                return this;
            }

            /**
             * <p>The name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudfirewall_2</p>
             */
            public Builder memberDisplayName(String memberDisplayName) {
                this.memberDisplayName = memberDisplayName;
                return this;
            }

            /**
             * <p>The status of the member. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder memberStatus(String memberStatus) {
                this.memberStatus = memberStatus;
                return this;
            }

            /**
             * <p>The UID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>258039427902****</p>
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The time when the member was last modified. The value is a timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615189819</p>
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
    /**
     * 
     * {@link DescribeInstanceMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceMembersResponseBody</p>
     */
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
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of the members.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
