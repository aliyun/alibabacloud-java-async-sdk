// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterResponseBody</p>
 */
public class ModifyDBClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBCluster")
    private DBCluster DBCluster;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDBClusterResponseBody(Builder builder) {
        this.DBCluster = builder.DBCluster;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBCluster
     */
    public DBCluster getDBCluster() {
        return this.DBCluster;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBCluster DBCluster; 
        private String requestId; 

        /**
         * The information about the cluster.
         */
        public Builder DBCluster(DBCluster DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDBClusterResponseBody build() {
            return new ModifyDBClusterResponseBody(this);
        } 

    } 

    public static class DBCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dbClusterId")
        private String dbClusterId;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private String orderId;

        private DBCluster(Builder builder) {
            this.dbClusterId = builder.dbClusterId;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBCluster create() {
            return builder().build();
        }

        /**
         * @return dbClusterId
         */
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String dbClusterId; 
            private String orderId; 

            /**
             * The cluster ID.
             */
            public Builder dbClusterId(String dbClusterId) {
                this.dbClusterId = dbClusterId;
                return this;
            }

            /**
             * The order ID.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public DBCluster build() {
                return new DBCluster(this);
            } 

        } 

    }
}
