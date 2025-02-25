// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListUsersByRoleResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersByRoleResponseBody</p>
 */
public class ListUsersByRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListUsersByRoleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersByRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0be3e0bb16654558425251398e27a9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUsersByRoleResponseBody build() {
            return new ListUsersByRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUsersByRoleResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersByRoleResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Users(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * <p>The name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN${account_name}</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUsersByRoleResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersByRoleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("users")
        private java.util.List<Users> users;

        private Data(Builder builder) {
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return users
         */
        public java.util.List<Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private java.util.List<Users> users; 

            /**
             * <p>The users.</p>
             */
            public Builder users(java.util.List<Users> users) {
                this.users = users;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
