// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link DescribeAccountAuthorityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountAuthorityResponseBody</p>
 */
public class DescribeAccountAuthorityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccountAuthorityResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountAuthorityResponseBody create() {
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

        private Builder(DescribeAccountAuthorityResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountAuthorityResponseBody build() {
            return new DescribeAccountAuthorityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountAuthorityResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountAuthorityResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("AllowDatabases")
        private java.util.List<String> allowDatabases;

        @com.aliyun.core.annotation.NameInMap("AllowDictionaries")
        private java.util.List<String> allowDictionaries;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DdlAuthority")
        private Boolean ddlAuthority;

        @com.aliyun.core.annotation.NameInMap("DmlAuthority")
        private Integer dmlAuthority;

        @com.aliyun.core.annotation.NameInMap("TotalDatabases")
        private java.util.List<String> totalDatabases;

        @com.aliyun.core.annotation.NameInMap("TotalDictionaries")
        private java.util.List<String> totalDictionaries;

        private Data(Builder builder) {
            this.account = builder.account;
            this.allowDatabases = builder.allowDatabases;
            this.allowDictionaries = builder.allowDictionaries;
            this.DBInstanceId = builder.DBInstanceId;
            this.ddlAuthority = builder.ddlAuthority;
            this.dmlAuthority = builder.dmlAuthority;
            this.totalDatabases = builder.totalDatabases;
            this.totalDictionaries = builder.totalDictionaries;
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
         * @return allowDatabases
         */
        public java.util.List<String> getAllowDatabases() {
            return this.allowDatabases;
        }

        /**
         * @return allowDictionaries
         */
        public java.util.List<String> getAllowDictionaries() {
            return this.allowDictionaries;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return ddlAuthority
         */
        public Boolean getDdlAuthority() {
            return this.ddlAuthority;
        }

        /**
         * @return dmlAuthority
         */
        public Integer getDmlAuthority() {
            return this.dmlAuthority;
        }

        /**
         * @return totalDatabases
         */
        public java.util.List<String> getTotalDatabases() {
            return this.totalDatabases;
        }

        /**
         * @return totalDictionaries
         */
        public java.util.List<String> getTotalDictionaries() {
            return this.totalDictionaries;
        }

        public static final class Builder {
            private String account; 
            private java.util.List<String> allowDatabases; 
            private java.util.List<String> allowDictionaries; 
            private String DBInstanceId; 
            private Boolean ddlAuthority; 
            private Integer dmlAuthority; 
            private java.util.List<String> totalDatabases; 
            private java.util.List<String> totalDictionaries; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.account = model.account;
                this.allowDatabases = model.allowDatabases;
                this.allowDictionaries = model.allowDictionaries;
                this.DBInstanceId = model.DBInstanceId;
                this.ddlAuthority = model.ddlAuthority;
                this.dmlAuthority = model.dmlAuthority;
                this.totalDatabases = model.totalDatabases;
                this.totalDictionaries = model.totalDictionaries;
            } 

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The databases on which permissions are granted.</p>
             */
            public Builder allowDatabases(java.util.List<String> allowDatabases) {
                this.allowDatabases = allowDatabases;
                return this;
            }

            /**
             * <p>The dictionaries on which permissions are granted.</p>
             */
            public Builder allowDictionaries(java.util.List<String> allowDictionaries) {
                this.allowDictionaries = allowDictionaries;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-bp100p4q1g9z3****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>Indicates whether the DDL permissions are granted to the database account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The account has the permissions to execute DDL statements.</li>
             * <li><strong>false</strong>: The account does not have the permissions to execute DDL statements.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ddlAuthority(Boolean ddlAuthority) {
                this.ddlAuthority = ddlAuthority;
                return this;
            }

            /**
             * <p>Indicates whether the DML permissions are granted to the database account. Valid values:</p>
             * <ul>
             * <li>0: The account has the permissions to read data from the database, write data to the database, and modify the settings of the database.</li>
             * <li>1: The account only has the permissions to read data from the database.</li>
             * <li>2: The account only has the permissions to read data from the database and modify the settings of the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dmlAuthority(Integer dmlAuthority) {
                this.dmlAuthority = dmlAuthority;
                return this;
            }

            /**
             * <p>All databases.</p>
             */
            public Builder totalDatabases(java.util.List<String> totalDatabases) {
                this.totalDatabases = totalDatabases;
                return this;
            }

            /**
             * <p>The database.</p>
             */
            public Builder totalDictionaries(java.util.List<String> totalDictionaries) {
                this.totalDictionaries = totalDictionaries;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
