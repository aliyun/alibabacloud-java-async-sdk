// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbInstancesResponseBody</p>
 */
public class DescribeDbInstancesResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDbInstancesResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        /**
         * The details of the instance.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDbInstancesResponseBody build() {
            return new DescribeDbInstancesResponseBody(this);
        } 

    } 

    public static class ReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        private java.util.List < String > readOnlyDBInstanceId;

        private ReadOnlyDBInstanceId(Builder builder) {
            this.readOnlyDBInstanceId = builder.readOnlyDBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyDBInstanceId create() {
            return builder().build();
        }

        /**
         * @return readOnlyDBInstanceId
         */
        public java.util.List < String > getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > readOnlyDBInstanceId; 

            /**
             * ReadOnlyDBInstanceId.
             */
            public Builder readOnlyDBInstanceId(java.util.List < String > readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceId build() {
                return new ReadOnlyDBInstanceId(this);
            } 

        } 

    }
    public static class DBInstance extends TeaModel {
        @NameInMap("AllowAllCategory")
        private Boolean allowAllCategory;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        private Integer DBInstanceStatus;

        @NameInMap("DBInstanceType")
        private String DBInstanceType;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @NameInMap("ReadOnlyDBInstanceId")
        private ReadOnlyDBInstanceId readOnlyDBInstanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.allowAllCategory = builder.allowAllCategory;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceType = builder.DBInstanceType;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.readOnlyDBInstanceId = builder.readOnlyDBInstanceId;
            this.regionId = builder.regionId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstance create() {
            return builder().build();
        }

        /**
         * @return allowAllCategory
         */
        public Boolean getAllowAllCategory() {
            return this.allowAllCategory;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceStatus
         */
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        /**
         * @return readOnlyDBInstanceId
         */
        public ReadOnlyDBInstanceId getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean allowAllCategory; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private Integer DBInstanceStatus; 
            private String DBInstanceType; 
            private String engine; 
            private String engineVersion; 
            private String instanceNetworkType; 
            private ReadOnlyDBInstanceId readOnlyDBInstanceId; 
            private String regionId; 
            private String zoneId; 

            /**
             * AllowAllCategory.
             */
            public Builder allowAllCategory(Boolean allowAllCategory) {
                this.allowAllCategory = allowAllCategory;
                return this;
            }

            /**
             * The description of the storage instance.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * The ID of the storage instance.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * Storage layer instance status. Valid values:
             * <p>
             * 
             * *   **0**: creating
             * *   **1**: In use
             * *   **3**: Deleting
             * *   **5**: restarting
             * *   **6**: upgrading /Downgrading
             * *   **7**: Recovering
             * *   **8**: switching the Internet and intranet
             */
            public Builder DBInstanceStatus(Integer DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The storage layer instance type.
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * The engine of the storage instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The version of the engine for the storage instance.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The network type of the storage layer. Valid values:
             * <p>
             * 
             * *   **VPC**: VPC
             * *   **CLASSIC **: Classic Network
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * The details about a read-only storage instance.
             */
            public Builder readOnlyDBInstanceId(ReadOnlyDBInstanceId readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            /**
             * The ID of the region where the storage instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the zone where the storage instance resides.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBInstance build() {
                return new DBInstance(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("DBInstance")
        private java.util.List < DBInstance> DBInstance;

        private Items(Builder builder) {
            this.DBInstance = builder.DBInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBInstance
         */
        public java.util.List < DBInstance> getDBInstance() {
            return this.DBInstance;
        }

        public static final class Builder {
            private java.util.List < DBInstance> DBInstance; 

            /**
             * DBInstance.
             */
            public Builder DBInstance(java.util.List < DBInstance> DBInstance) {
                this.DBInstance = DBInstance;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
