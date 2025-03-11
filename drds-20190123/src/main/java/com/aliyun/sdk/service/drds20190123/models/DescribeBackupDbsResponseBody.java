// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeBackupDbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupDbsResponseBody</p>
 */
public class DescribeBackupDbsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbNames")
    private DbNames dbNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeBackupDbsResponseBody(Builder builder) {
        this.dbNames = builder.dbNames;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupDbsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbNames
     */
    public DbNames getDbNames() {
        return this.dbNames;
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
        private DbNames dbNames; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details about a database.</p>
         */
        public Builder dbNames(DbNames dbNames) {
            this.dbNames = dbNames;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>842DFA7F-B09B-42A2-B115-E684AE******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupDbsResponseBody build() {
            return new DescribeBackupDbsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupDbsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupDbsResponseBody</p>
     */
    public static class DbNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dbName")
        private java.util.List<String> dbName;

        private DbNames(Builder builder) {
            this.dbName = builder.dbName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbNames create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public java.util.List<String> getDbName() {
            return this.dbName;
        }

        public static final class Builder {
            private java.util.List<String> dbName; 

            /**
             * dbName.
             */
            public Builder dbName(java.util.List<String> dbName) {
                this.dbName = dbName;
                return this;
            }

            public DbNames build() {
                return new DbNames(this);
            } 

        } 

    }
}
