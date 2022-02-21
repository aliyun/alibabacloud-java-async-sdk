// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsSuperAccountInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsSuperAccountInstancesResponseBody</p>
 */
public class DescribeRdsSuperAccountInstancesResponseBody extends TeaModel {
    @NameInMap("DbInstances")
    private DbInstances dbInstances;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRdsSuperAccountInstancesResponseBody(Builder builder) {
        this.dbInstances = builder.dbInstances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsSuperAccountInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbInstances
     */
    public DbInstances getDbInstances() {
        return this.dbInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DbInstances dbInstances; 
        private String requestId; 

        /**
         * DbInstances.
         */
        public Builder dbInstances(DbInstances dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRdsSuperAccountInstancesResponseBody build() {
            return new DescribeRdsSuperAccountInstancesResponseBody(this);
        } 

    } 

    public static class DbInstances extends TeaModel {
        @NameInMap("DbInstance")
        private java.util.List < String > dbInstance;

        private DbInstances(Builder builder) {
            this.dbInstance = builder.dbInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbInstances create() {
            return builder().build();
        }

        /**
         * @return dbInstance
         */
        public java.util.List < String > getDbInstance() {
            return this.dbInstance;
        }

        public static final class Builder {
            private java.util.List < String > dbInstance; 

            /**
             * DbInstance.
             */
            public Builder dbInstance(java.util.List < String > dbInstance) {
                this.dbInstance = dbInstance;
                return this;
            }

            public DbInstances build() {
                return new DbInstances(this);
            } 

        } 

    }
}
