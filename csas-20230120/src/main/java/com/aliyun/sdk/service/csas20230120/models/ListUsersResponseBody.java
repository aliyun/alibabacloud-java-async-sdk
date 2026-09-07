// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private String totalNum;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private ListUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public String getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private String totalNum; 
        private java.util.List<Users> users; 

        private Builder() {
        } 

        private Builder(ListUsersResponseBody model) {
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.users = model.users;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FEF5CFA-14CC-5DE5-BD1F-AFFE0996E71D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(String totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>An array of user objects.</p>
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
        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("FullDepartment")
        private java.util.List<String> fullDepartment;

        @com.aliyun.core.annotation.NameInMap("IdpName")
        private String idpName;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Users(Builder builder) {
            this.department = builder.department;
            this.email = builder.email;
            this.fullDepartment = builder.fullDepartment;
            this.idpName = builder.idpName;
            this.phone = builder.phone;
            this.saseUserId = builder.saseUserId;
            this.status = builder.status;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return fullDepartment
         */
        public java.util.List<String> getFullDepartment() {
            return this.fullDepartment;
        }

        /**
         * @return idpName
         */
        public String getIdpName() {
            return this.idpName;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String department; 
            private String email; 
            private java.util.List<String> fullDepartment; 
            private String idpName; 
            private String phone; 
            private String saseUserId; 
            private String status; 
            private String username; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.department = model.department;
                this.email = model.email;
                this.fullDepartment = model.fullDepartment;
                this.idpName = model.idpName;
                this.phone = model.phone;
                this.saseUserId = model.saseUserId;
                this.status = model.status;
                this.username = model.username;
            } 

            /**
             * <p>The user\&quot;s department.</p>
             * 
             * <strong>example:</strong>
             * <p>测试部</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>The user\&quot;s email address.</p>
             * 
             * <strong>example:</strong>
             * <p>a***@example.net</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>A list of full department paths.</p>
             */
            public Builder fullDepartment(java.util.List<String> fullDepartment) {
                this.fullDepartment = fullDepartment;
                return this;
            }

            /**
             * <p>The name of the Identity Provider (IdP).</p>
             * 
             * <strong>example:</strong>
             * <p>飞书</p>
             */
            public Builder idpName(String idpName) {
                this.idpName = idpName;
                return this;
            }

            /**
             * <p>The user\&quot;s phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>The user status.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>王先生</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
