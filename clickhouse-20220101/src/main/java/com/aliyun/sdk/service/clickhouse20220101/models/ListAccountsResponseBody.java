// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountsResponseBody</p>
 */
public class ListAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccountsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        public ListAccountsResponseBody build() {
            return new ListAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccountsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("PasswordSha256Hex")
        private String passwordSha256Hex;

        @com.aliyun.core.annotation.NameInMap("PrivilegeDescription")
        private String privilegeDescription;

        @com.aliyun.core.annotation.NameInMap("PrivilegeType")
        private String privilegeType;

        private Data(Builder builder) {
            this.account = builder.account;
            this.comment = builder.comment;
            this.passwordSha256Hex = builder.passwordSha256Hex;
            this.privilegeDescription = builder.privilegeDescription;
            this.privilegeType = builder.privilegeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return passwordSha256Hex
         */
        public String getPasswordSha256Hex() {
            return this.passwordSha256Hex;
        }

        /**
         * @return privilegeDescription
         */
        public String getPrivilegeDescription() {
            return this.privilegeDescription;
        }

        /**
         * @return privilegeType
         */
        public String getPrivilegeType() {
            return this.privilegeType;
        }

        public static final class Builder {
            private String account; 
            private String comment; 
            private String passwordSha256Hex; 
            private String privilegeDescription; 
            private String privilegeType; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * PasswordSha256Hex.
             */
            public Builder passwordSha256Hex(String passwordSha256Hex) {
                this.passwordSha256Hex = passwordSha256Hex;
                return this;
            }

            /**
             * PrivilegeDescription.
             */
            public Builder privilegeDescription(String privilegeDescription) {
                this.privilegeDescription = privilegeDescription;
                return this;
            }

            /**
             * PrivilegeType.
             */
            public Builder privilegeType(String privilegeType) {
                this.privilegeType = privilegeType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
