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
 * {@link DescribeDbInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbInstancesResponseBody</p>
 */
public class DescribeDbInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The details of the instance.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>293275B3-8FC0-4619-A26E-6F062FASD56R</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDbInstancesResponseBody build() {
            return new DescribeDbInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDbInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDbInstancesResponseBody</p>
     */
    public static class ReadOnlyDBInstanceId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceId")
        private java.util.List<String> readOnlyDBInstanceId;

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
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public static final class Builder {
            private java.util.List<String> readOnlyDBInstanceId; 

            /**
             * ReadOnlyDBInstanceId.
             */
            public Builder readOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceId build() {
                return new ReadOnlyDBInstanceId(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDbInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDbInstancesResponseBody</p>
     */
    public static class DBInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowAllCategory")
        private Boolean allowAllCategory;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private Integer DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceId")
        private ReadOnlyDBInstanceId readOnlyDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The description of the storage instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The ID of the storage instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-****************</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>Storage layer instance status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: creating</li>
             * <li><strong>1</strong>: In use</li>
             * <li><strong>3</strong>: Deleting</li>
             * <li><strong>5</strong>: restarting</li>
             * <li><strong>6</strong>: upgrading /Downgrading</li>
             * <li><strong>7</strong>: Recovering</li>
             * <li><strong>8</strong>: switching the Internet and intranet</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder DBInstanceStatus(Integer DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The storage layer instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * <p>The engine of the storage instance.</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The version of the engine for the storage instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The network type of the storage layer. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: VPC</li>
             * <li>**CLASSIC **: Classic Network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * <p>The details about a read-only storage instance.</p>
             */
            public Builder readOnlyDBInstanceId(ReadOnlyDBInstanceId readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            /**
             * <p>The ID of the region where the storage instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the zone where the storage instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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
    /**
     * 
     * {@link DescribeDbInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDbInstancesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstance")
        private java.util.List<DBInstance> DBInstance;

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
        public java.util.List<DBInstance> getDBInstance() {
            return this.DBInstance;
        }

        public static final class Builder {
            private java.util.List<DBInstance> DBInstance; 

            /**
             * DBInstance.
             */
            public Builder DBInstance(java.util.List<DBInstance> DBInstance) {
                this.DBInstance = DBInstance;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
