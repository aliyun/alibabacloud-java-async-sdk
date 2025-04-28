// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeSyncAvailableDBClusterListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncAvailableDBClusterListResponseBody</p>
 */
public class DescribeSyncAvailableDBClusterListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncAvailableDBClusters")
    private java.util.List<SyncAvailableDBClusters> syncAvailableDBClusters;

    private DescribeSyncAvailableDBClusterListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.syncAvailableDBClusters = builder.syncAvailableDBClusters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncAvailableDBClusterListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syncAvailableDBClusters
     */
    public java.util.List<SyncAvailableDBClusters> getSyncAvailableDBClusters() {
        return this.syncAvailableDBClusters;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SyncAvailableDBClusters> syncAvailableDBClusters; 

        private Builder() {
        } 

        private Builder(DescribeSyncAvailableDBClusterListResponseBody model) {
            this.requestId = model.requestId;
            this.syncAvailableDBClusters = model.syncAvailableDBClusters;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FBD1DD96-AD1D-516C-9D9A-60BA081F66EE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried instances or clusters.</p>
         */
        public Builder syncAvailableDBClusters(java.util.List<SyncAvailableDBClusters> syncAvailableDBClusters) {
            this.syncAvailableDBClusters = syncAvailableDBClusters;
            return this;
        }

        public DescribeSyncAvailableDBClusterListResponseBody build() {
            return new DescribeSyncAvailableDBClusterListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSyncAvailableDBClusterListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncAvailableDBClusterListResponseBody</p>
     */
    public static class SyncAvailableDBClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Float storageSize;

        @com.aliyun.core.annotation.NameInMap("TableNumber")
        private Integer tableNumber;

        private SyncAvailableDBClusters(Builder builder) {
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBType = builder.DBType;
            this.storageSize = builder.storageSize;
            this.tableNumber = builder.tableNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncAvailableDBClusters create() {
            return builder().build();
        }

        /**
         * @return DBClusterDescription
         */
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return storageSize
         */
        public Float getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return tableNumber
         */
        public Integer getTableNumber() {
            return this.tableNumber;
        }

        public static final class Builder {
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBType; 
            private Float storageSize; 
            private Integer tableNumber; 

            private Builder() {
            } 

            private Builder(SyncAvailableDBClusters model) {
                this.DBClusterDescription = model.DBClusterDescription;
                this.DBClusterId = model.DBClusterId;
                this.DBType = model.DBType;
                this.storageSize = model.storageSize;
                this.tableNumber = model.tableNumber;
            } 

            /**
             * <p>The description of the instance or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>DB1</p>
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * <p>The instance or cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1l3yh04y7us147n</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The database type of the instance or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The storage size.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder storageSize(Float storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The number of tables.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder tableNumber(Integer tableNumber) {
                this.tableNumber = tableNumber;
                return this;
            }

            public SyncAvailableDBClusters build() {
                return new SyncAvailableDBClusters(this);
            } 

        } 

    }
}
