// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
    private java.util.List<ShareAccount> shareAccount;

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
    public java.util.List<ShareAccount> getShareAccount() {
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
        private java.util.List<ShareAccount> shareAccount; 
        private Integer totalCount; 

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CA3AE512-6D30-549A-B52D-B9042CA8D515</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Service shared account information.</p>
         */
        public Builder shareAccount(java.util.List<ShareAccount> shareAccount) {
            this.shareAccount = shareAccount;
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

        public ListServiceSharedAccountsResponseBody build() {
            return new ListServiceSharedAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceSharedAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceSharedAccountsResponseBody</p>
     */
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
             * <p>The time when the service was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-28T02:47:46.000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Service logo.</p>
             * 
             * <strong>example:</strong>
             * <p>logo</p>
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * <p>The name of the service instance. The value must meet the following requirements:</p>
             * <ul>
             * <li>The name cannot exceed 64 characters in length.</li>
             * <li>It can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or a letter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The permissions on the service. Valid values:</p>
             * <ul>
             * <li>Deployable: Permissions to deploy the service.</li>
             * <li>Accessible: Permissions to access the service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deployable</p>
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>service-e10349089de34exxxxxx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The time when the service was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-13T02:16:03.756Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The user aliUid.</p>
             * 
             * <strong>example:</strong>
             * <p>127383705xxxxxx</p>
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
