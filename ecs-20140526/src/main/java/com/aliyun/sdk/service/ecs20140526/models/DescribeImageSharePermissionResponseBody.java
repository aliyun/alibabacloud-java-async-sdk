// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeImageSharePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageSharePermissionResponseBody</p>
 */
public class DescribeImageSharePermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private Accounts accounts;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShareGroups")
    private ShareGroups shareGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageSharePermissionResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.imageId = builder.imageId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.shareGroups = builder.shareGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSharePermissionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accounts
     */
    public Accounts getAccounts() {
        return this.accounts;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shareGroups
     */
    public ShareGroups getShareGroups() {
        return this.shareGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Accounts accounts; 
        private String imageId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private ShareGroups shareGroups; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeImageSharePermissionResponseBody model) {
            this.accounts = model.accounts;
            this.imageId = model.imageId;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.shareGroups = model.shareGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The Alibaba Cloud accounts.</p>
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>The ID of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1caf3yicx5jlfl****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The shared groups.</p>
         */
        public Builder shareGroups(ShareGroups shareGroups) {
            this.shareGroups = shareGroups;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageSharePermissionResponseBody build() {
            return new DescribeImageSharePermissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageSharePermissionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageSharePermissionResponseBody</p>
     */
    public static class Account extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("SharedTime")
        private String sharedTime;

        private Account(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.sharedTime = builder.sharedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Account create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return sharedTime
         */
        public String getSharedTime() {
            return this.sharedTime;
        }

        public static final class Builder {
            private String aliyunId; 
            private String sharedTime; 

            private Builder() {
            } 

            private Builder(Account model) {
                this.aliyunId = model.aliyunId;
                this.sharedTime = model.sharedTime;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * <p>The time when the image was shared. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01T12:05:00Z</p>
             */
            public Builder sharedTime(String sharedTime) {
                this.sharedTime = sharedTime;
                return this;
            }

            public Account build() {
                return new Account(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageSharePermissionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageSharePermissionResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private java.util.List<Account> account;

        private Accounts(Builder builder) {
            this.account = builder.account;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public java.util.List<Account> getAccount() {
            return this.account;
        }

        public static final class Builder {
            private java.util.List<Account> account; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.account = model.account;
            } 

            /**
             * Account.
             */
            public Builder account(java.util.List<Account> account) {
                this.account = account;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageSharePermissionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageSharePermissionResponseBody</p>
     */
    public static class ShareGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        private ShareGroup(Builder builder) {
            this.group = builder.group;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShareGroup create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        public static final class Builder {
            private String group; 

            private Builder() {
            } 

            private Builder(ShareGroup model) {
                this.group = model.group;
            } 

            /**
             * <p>The shared group.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            public ShareGroup build() {
                return new ShareGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageSharePermissionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageSharePermissionResponseBody</p>
     */
    public static class ShareGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShareGroup")
        private java.util.List<ShareGroup> shareGroup;

        private ShareGroups(Builder builder) {
            this.shareGroup = builder.shareGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShareGroups create() {
            return builder().build();
        }

        /**
         * @return shareGroup
         */
        public java.util.List<ShareGroup> getShareGroup() {
            return this.shareGroup;
        }

        public static final class Builder {
            private java.util.List<ShareGroup> shareGroup; 

            private Builder() {
            } 

            private Builder(ShareGroups model) {
                this.shareGroup = model.shareGroup;
            } 

            /**
             * ShareGroup.
             */
            public Builder shareGroup(java.util.List<ShareGroup> shareGroup) {
                this.shareGroup = shareGroup;
                return this;
            }

            public ShareGroups build() {
                return new ShareGroups(this);
            } 

        } 

    }
}
