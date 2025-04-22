// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ListUserGroupsMappingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGroupsMappingsResponseBody</p>
 */
public class ListUserGroupsMappingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserGroupsMappings")
    private java.util.List<UserGroupsMappings> userGroupsMappings;

    private ListUserGroupsMappingsResponseBody(Builder builder) {
        this.hasMore = builder.hasMore;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.userGroupsMappings = builder.userGroupsMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsMappingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
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
     * @return userGroupsMappings
     */
    public java.util.List<UserGroupsMappings> getUserGroupsMappings() {
        return this.userGroupsMappings;
    }

    public static final class Builder {
        private Boolean hasMore; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<UserGroupsMappings> userGroupsMappings; 

        private Builder() {
        } 

        private Builder(ListUserGroupsMappingsResponseBody model) {
            this.hasMore = model.hasMore;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.userGroupsMappings = model.userGroupsMappings;
        } 

        /**
         * HasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * UserGroupsMappings.
         */
        public Builder userGroupsMappings(java.util.List<UserGroupsMappings> userGroupsMappings) {
            this.userGroupsMappings = userGroupsMappings;
            return this;
        }

        public ListUserGroupsMappingsResponseBody build() {
            return new ListUserGroupsMappingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserGroupsMappingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsMappingsResponseBody</p>
     */
    public static class UserGroupsMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupNames")
        private java.util.List<String> groupNames;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private UserGroupsMappings(Builder builder) {
            this.groupNames = builder.groupNames;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroupsMappings create() {
            return builder().build();
        }

        /**
         * @return groupNames
         */
        public java.util.List<String> getGroupNames() {
            return this.groupNames;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private java.util.List<String> groupNames; 
            private String userName; 

            private Builder() {
            } 

            private Builder(UserGroupsMappings model) {
                this.groupNames = model.groupNames;
                this.userName = model.userName;
            } 

            /**
             * GroupNames.
             */
            public Builder groupNames(java.util.List<String> groupNames) {
                this.groupNames = groupNames;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserGroupsMappings build() {
                return new UserGroupsMappings(this);
            } 

        } 

    }
}
