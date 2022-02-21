// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateInstancePublicConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateInstancePublicConnectionResponseBody</p>
 */
public class AllocateInstancePublicConnectionResponseBody extends TeaModel {
    @NameInMap("ConnectionString")
    private String connectionString;

    @NameInMap("DbInstanceName")
    private String dbInstanceName;

    @NameInMap("RequestId")
    private String requestId;

    private AllocateInstancePublicConnectionResponseBody(Builder builder) {
        this.connectionString = builder.connectionString;
        this.dbInstanceName = builder.dbInstanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateInstancePublicConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return dbInstanceName
     */
    public String getDbInstanceName() {
        return this.dbInstanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String connectionString; 
        private String dbInstanceName; 
        private String requestId; 

        /**
         * ConnectionString.
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * DbInstanceName.
         */
        public Builder dbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateInstancePublicConnectionResponseBody build() {
            return new AllocateInstancePublicConnectionResponseBody(this);
        } 

    } 

}
