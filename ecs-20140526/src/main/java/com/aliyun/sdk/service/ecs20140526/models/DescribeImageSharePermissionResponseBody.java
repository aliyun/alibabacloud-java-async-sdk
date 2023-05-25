// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("Accounts")
    private Accounts accounts;

    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShareGroups")
    private ShareGroups shareGroups;

    @NameInMap("TotalCount")
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

        /**
         * The Alibaba Cloud accounts.
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the image.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The shared groups.
         */
        public Builder shareGroups(ShareGroups shareGroups) {
            this.shareGroups = shareGroups;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageSharePermissionResponseBody build() {
            return new DescribeImageSharePermissionResponseBody(this);
        } 

    } 

    public static class Account extends TeaModel {
        @NameInMap("AliyunId")
        private String aliyunId;

        @NameInMap("SharedTime")
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

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * SharedTime.
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
             * The shared group.
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
}
