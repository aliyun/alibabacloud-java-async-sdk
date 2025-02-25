// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsAdmin")
    @Deprecated
    private Boolean isAdmin;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private ListUsersResponseBody(Builder builder) {
        this.isAdmin = builder.isAdmin;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return this.isAdmin;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Boolean isAdmin; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Users> users; 

        /**
         * IsAdmin.
         */
        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * <p>本次请求所返回的最大记录条数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>本次请求条件下的数据总量。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>用户列表。</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KeytabHex")
        private String keytabHex;

        @com.aliyun.core.annotation.NameInMap("LdapUrl")
        private String ldapUrl;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Users(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.keytabHex = builder.keytabHex;
            this.ldapUrl = builder.ldapUrl;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return keytabHex
         */
        public String getKeytabHex() {
            return this.keytabHex;
        }

        /**
         * @return ldapUrl
         */
        public String getLdapUrl() {
            return this.ldapUrl;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String keytabHex; 
            private String ldapUrl; 
            private String userId; 
            private String userName; 

            /**
             * <p>创建时间。</p>
             * 
             * <strong>example:</strong>
             * <p>1509338726362</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>备注。</p>
             * 
             * <strong>example:</strong>
             * <p>添加test用户</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Keytab内容Base64编码。</p>
             * 
             * <strong>example:</strong>
             * <p>DBEDASDF==</p>
             */
            public Builder keytabHex(String keytabHex) {
                this.keytabHex = keytabHex;
                return this;
            }

            /**
             * <p>LDAP链接。
             * ldap://emr-header-1.cluster-50018****:10389</p>
             * 
             * <strong>example:</strong>
             * <p>ldap://master-1-1.c-c6ce2d16d118****.cn-hangzhou.emr.aliyuncs.com:10389</p>
             */
            public Builder ldapUrl(String ldapUrl) {
                this.ldapUrl = ldapUrl;
                return this;
            }

            /**
             * <p>用户ID。</p>
             * 
             * <strong>example:</strong>
             * <p>125046002175****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>用户名称。
             * test</p>
             * 
             * <strong>example:</strong>
             * <p>yun****</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
