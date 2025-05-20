// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link ListRoleUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoleUsersResponseBody</p>
 */
public class ListRoleUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("users")
    private java.util.List<User> users;

    private ListRoleUsersResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoleUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return users
     */
    public java.util.List<User> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<User> users; 

        private Builder() {
        } 

        private Builder(ListRoleUsersResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.users = model.users;
        } 

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * users.
         */
        public Builder users(java.util.List<User> users) {
            this.users = users;
            return this;
        }

        public ListRoleUsersResponseBody build() {
            return new ListRoleUsersResponseBody(this);
        } 

    } 

}
