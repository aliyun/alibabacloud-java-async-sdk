// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
        private java.util.List < String > allowDatabases;

        @com.aliyun.core.annotation.NameInMap("AllowDictionaries")
        private java.util.List < String > allowDictionaries;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DdlAuthority")
        private Boolean ddlAuthority;

        @com.aliyun.core.annotation.NameInMap("DmlAuthority")
        private Integer dmlAuthority;

        @com.aliyun.core.annotation.NameInMap("TotalDatabases")
        private java.util.List < String > totalDatabases;

        @com.aliyun.core.annotation.NameInMap("TotalDictionaries")
        private java.util.List < String > totalDictionaries;

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
        public java.util.List < String > getAllowDatabases() {
            return this.allowDatabases;
        }

        /**
         * @return allowDictionaries
         */
        public java.util.List < String > getAllowDictionaries() {
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
        public java.util.List < String > getTotalDatabases() {
            return this.totalDatabases;
        }

        /**
         * @return totalDictionaries
         */
        public java.util.List < String > getTotalDictionaries() {
            return this.totalDictionaries;
        }

        public static final class Builder {
            private String account; 
            private java.util.List < String > allowDatabases; 
            private java.util.List < String > allowDictionaries; 
            private String DBInstanceId; 
            private Boolean ddlAuthority; 
            private Integer dmlAuthority; 
            private java.util.List < String > totalDatabases; 
            private java.util.List < String > totalDictionaries; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * AllowDatabases.
             */
            public Builder allowDatabases(java.util.List < String > allowDatabases) {
                this.allowDatabases = allowDatabases;
                return this;
            }

            /**
             * AllowDictionaries.
             */
            public Builder allowDictionaries(java.util.List < String > allowDictionaries) {
                this.allowDictionaries = allowDictionaries;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DdlAuthority.
             */
            public Builder ddlAuthority(Boolean ddlAuthority) {
                this.ddlAuthority = ddlAuthority;
                return this;
            }

            /**
             * DmlAuthority.
             */
            public Builder dmlAuthority(Integer dmlAuthority) {
                this.dmlAuthority = dmlAuthority;
                return this;
            }

            /**
             * TotalDatabases.
             */
            public Builder totalDatabases(java.util.List < String > totalDatabases) {
                this.totalDatabases = totalDatabases;
                return this;
            }

            /**
             * TotalDictionaries.
             */
            public Builder totalDictionaries(java.util.List < String > totalDictionaries) {
                this.totalDictionaries = totalDictionaries;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
