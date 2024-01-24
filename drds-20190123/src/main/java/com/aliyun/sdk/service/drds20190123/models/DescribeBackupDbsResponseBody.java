// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupDbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupDbsResponseBody</p>
 */
public class DescribeBackupDbsResponseBody extends TeaModel {
    @NameInMap("DbNames")
    private DbNames dbNames;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The details about a database.
         */
        public Builder dbNames(DbNames dbNames) {
            this.dbNames = dbNames;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of request.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupDbsResponseBody build() {
            return new DescribeBackupDbsResponseBody(this);
        } 

    } 

    public static class DbNames extends TeaModel {
        @NameInMap("dbName")
        private java.util.List < String > dbName;

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
        public java.util.List < String > getDbName() {
            return this.dbName;
        }

        public static final class Builder {
            private java.util.List < String > dbName; 

            /**
             * dbName.
             */
            public Builder dbName(java.util.List < String > dbName) {
                this.dbName = dbName;
                return this;
            }

            public DbNames build() {
                return new DbNames(this);
            } 

        } 

    }
}
