// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeAccountMaskingPrivilegeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountMaskingPrivilegeResponseBody</p>
 */
public class DescribeAccountMaskingPrivilegeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccountMaskingPrivilegeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountMaskingPrivilegeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAccountMaskingPrivilegeResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0073A98-52F1-3075-8256-394**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountMaskingPrivilegeResponseBody build() {
            return new DescribeAccountMaskingPrivilegeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountMaskingPrivilegeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountMaskingPrivilegeResponseBody</p>
     */
    public static class UserPrivilege extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Privilege")
        private String privilege;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private UserPrivilege(Builder builder) {
            this.expireTime = builder.expireTime;
            this.privilege = builder.privilege;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPrivilege create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return privilege
         */
        public String getPrivilege() {
            return this.privilege;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String expireTime; 
            private String privilege; 
            private String userName; 

            private Builder() {
            } 

            private Builder(UserPrivilege model) {
                this.expireTime = model.expireTime;
                this.privilege = model.privilege;
                this.userName = model.userName;
            } 

            /**
             * <p>The permission expiration time in UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-22T02:01:20Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The permission type. The value restrictedAccess indicates restricted access (data masking required).</p>
             * 
             * <strong>example:</strong>
             * <p>restrictedAccess</p>
             */
            public Builder privilege(String privilege) {
                this.privilege = privilege;
                return this;
            }

            /**
             * <p>The account name.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserPrivilege build() {
                return new UserPrivilege(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountMaskingPrivilegeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountMaskingPrivilegeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserPrivilege")
        private java.util.List<UserPrivilege> userPrivilege;

        private Data(Builder builder) {
            this.userPrivilege = builder.userPrivilege;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return userPrivilege
         */
        public java.util.List<UserPrivilege> getUserPrivilege() {
            return this.userPrivilege;
        }

        public static final class Builder {
            private java.util.List<UserPrivilege> userPrivilege; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.userPrivilege = model.userPrivilege;
            } 

            /**
             * <p>The list of user encryption or data masking permissions.</p>
             */
            public Builder userPrivilege(java.util.List<UserPrivilege> userPrivilege) {
                this.userPrivilege = userPrivilege;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
