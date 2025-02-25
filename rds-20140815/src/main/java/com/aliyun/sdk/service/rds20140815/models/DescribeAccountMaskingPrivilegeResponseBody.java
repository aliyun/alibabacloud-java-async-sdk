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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Privilege.
             */
            public Builder privilege(String privilege) {
                this.privilege = privilege;
                return this;
            }

            /**
             * UserName.
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

            /**
             * UserPrivilege.
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
