// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
    private java.util.List < SyncAvailableDBClusters> syncAvailableDBClusters;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syncAvailableDBClusters
     */
    public java.util.List < SyncAvailableDBClusters> getSyncAvailableDBClusters() {
        return this.syncAvailableDBClusters;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SyncAvailableDBClusters> syncAvailableDBClusters; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SyncAvailableDBClusters.
         */
        public Builder syncAvailableDBClusters(java.util.List < SyncAvailableDBClusters> syncAvailableDBClusters) {
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

            /**
             * DBClusterDescription.
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * DBType.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Float storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * TableNumber.
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
