// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeAccountListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountListResponseBody</p>
 */
public class DescribeAccountListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAccountListResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeAccountListResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data struct.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. &quot;success&quot; is returned if the request is successful. Otherwise, the corresponding error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAccountListResponseBody build() {
            return new DescribeAccountListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountDescription")
        private String accountDescription;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        private Data(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountName = builder.accountName;
            this.accountPrivilege = builder.accountPrivilege;
            this.accountType = builder.accountType;
            this.DBInstanceName = builder.DBInstanceName;
            this.DBName = builder.DBName;
            this.gmtCreated = builder.gmtCreated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountDescription
         */
        public String getAccountDescription() {
            return this.accountDescription;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountPrivilege
         */
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public static final class Builder {
            private String accountDescription; 
            private String accountName; 
            private String accountPrivilege; 
            private String accountType; 
            private String DBInstanceName; 
            private String DBName; 
            private String gmtCreated; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountDescription = model.accountDescription;
                this.accountName = model.accountName;
                this.accountPrivilege = model.accountPrivilege;
                this.accountType = model.accountType;
                this.DBInstanceName = model.DBInstanceName;
                this.DBName = model.DBName;
                this.gmtCreated = model.gmtCreated;
            } 

            /**
             * <p>The description of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>testaccount desc</p>
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * <p>The name of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>testAccount</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The permissions granted to the account.</p>
             * 
             * <strong>example:</strong>
             * <p>ReadWrite</p>
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * <p>The type of the account.</p>
             * <ul>
             * <li>Before three-role mode is enabled: 0 indicates a standard account, and 1 indicates a privileged user account.</li>
             * <li>After three-role mode is enabled: 0 indicates a standard account, 2 indicates a system administrator account, 3 indicates a security administrator account, and 4 indicates an audit administrator account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-*********</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The database to which the account is granted permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The time when the account was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2012-06-08T15:00Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
