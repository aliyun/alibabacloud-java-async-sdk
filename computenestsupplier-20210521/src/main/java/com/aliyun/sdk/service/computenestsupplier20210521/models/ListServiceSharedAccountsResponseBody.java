// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceSharedAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceSharedAccountsResponseBody</p>
 */
public class ListServiceSharedAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShareAccount")
    private java.util.List < ShareAccount> shareAccount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListServiceSharedAccountsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.shareAccount = builder.shareAccount;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceSharedAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shareAccount
     */
    public java.util.List < ShareAccount> getShareAccount() {
        return this.shareAccount;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ShareAccount> shareAccount; 
        private Integer totalCount; 

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * ShareAccount.
         */
        public Builder shareAccount(java.util.List < ShareAccount> shareAccount) {
            this.shareAccount = shareAccount;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceSharedAccountsResponseBody build() {
            return new ListServiceSharedAccountsResponseBody(this);
        } 

    } 

    public static class ShareAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private String logo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private String permission;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserAliUid")
        private String userAliUid;

        private ShareAccount(Builder builder) {
            this.createTime = builder.createTime;
            this.logo = builder.logo;
            this.name = builder.name;
            this.permission = builder.permission;
            this.serviceId = builder.serviceId;
            this.updateTime = builder.updateTime;
            this.userAliUid = builder.userAliUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShareAccount create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userAliUid
         */
        public String getUserAliUid() {
            return this.userAliUid;
        }

        public static final class Builder {
            private String createTime; 
            private String logo; 
            private String name; 
            private String permission; 
            private String serviceId; 
            private String updateTime; 
            private String userAliUid; 

            /**
             * The time when the service was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Service logo.
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * The name of the service instance. The value must meet the following requirements:
             * <p>
             * 
             * *   The name cannot exceed 64 characters in length.
             * *   It can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or a letter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The permissions on the service. Valid values:
             * <p>
             * 
             * *   Deployable: Permissions to deploy the service.
             * *   Accessible: Permissions to access the service.
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * The service ID.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The time when the service was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserAliUid.
             */
            public Builder userAliUid(String userAliUid) {
                this.userAliUid = userAliUid;
                return this;
            }

            public ShareAccount build() {
                return new ShareAccount(this);
            } 

        } 

    }
}
