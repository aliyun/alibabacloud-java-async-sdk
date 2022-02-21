// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupDatabaseResponseBody</p>
 */
public class DescribeBackupDatabaseResponseBody extends TeaModel {
    @NameInMap("DatabaseNames")
    private String databaseNames;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupDatabaseResponseBody(Builder builder) {
        this.databaseNames = builder.databaseNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseNames
     */
    public String getDatabaseNames() {
        return this.databaseNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String databaseNames; 
        private String requestId; 

        /**
         * DatabaseNames.
         */
        public Builder databaseNames(String databaseNames) {
            this.databaseNames = databaseNames;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupDatabaseResponseBody build() {
            return new DescribeBackupDatabaseResponseBody(this);
        } 

    } 

}
