// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSharePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageSharePermissionResponseBody</p>
 */
public class DescribeImageSharePermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("ShareGroups")
    private ShareGroups shareGroups;

    @NameInMap("Accounts")
    private Accounts accounts;

    private DescribeImageSharePermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
        this.shareGroups = builder.shareGroups;
        this.accounts = builder.accounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSharePermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return shareGroups
     */
    public ShareGroups getShareGroups() {
        return this.shareGroups;
    }

    /**
     * @return accounts
     */
    public Accounts getAccounts() {
        return this.accounts;
    }

    public static final class Builder {
        private String requestId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer totalCount; 
        private String imageId; 
        private String regionId; 
        private ShareGroups shareGroups; 
        private Accounts accounts; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number of the query result.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * The total number of records.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The ID of the custom image.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * Mirror respective geographical ID.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * A shared group.
         */
        public Builder shareGroups(ShareGroups shareGroups) {
            this.shareGroups = shareGroups;
            return this;
        }

        /**
         * Registered users of Alibaba Cloud.
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
            return this;
        }

        public DescribeImageSharePermissionResponseBody build() {
            return new DescribeImageSharePermissionResponseBody(this);
        } 

    } 

    public static class ShareGroup extends TeaModel {
        @NameInMap("Group")
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

            /**
             * Sharing grouping.
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
    public static class ShareGroups extends TeaModel {
        @NameInMap("ShareGroup")
        private java.util.List < ShareGroup> shareGroup;

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
        public java.util.List < ShareGroup> getShareGroup() {
            return this.shareGroup;
        }

        public static final class Builder {
            private java.util.List < ShareGroup> shareGroup; 

            /**
             * ShareGroup.
             */
            public Builder shareGroup(java.util.List < ShareGroup> shareGroup) {
                this.shareGroup = shareGroup;
                return this;
            }

            public ShareGroups build() {
                return new ShareGroups(this);
            } 

        } 

    }
    public static class Account extends TeaModel {
        @NameInMap("AliyunId")
        private String aliyunId;

        private Account(Builder builder) {
            this.aliyunId = builder.aliyunId;
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

        public static final class Builder {
            private String aliyunId; 

            /**
             * The ID of the Alibaba cloud account.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            public Account build() {
                return new Account(this);
            } 

        } 

    }
    public static class Accounts extends TeaModel {
        @NameInMap("Account")
        private java.util.List < Account> account;

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
        public java.util.List < Account> getAccount() {
            return this.account;
        }

        public static final class Builder {
            private java.util.List < Account> account; 

            /**
             * Account.
             */
            public Builder account(java.util.List < Account> account) {
                this.account = account;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
