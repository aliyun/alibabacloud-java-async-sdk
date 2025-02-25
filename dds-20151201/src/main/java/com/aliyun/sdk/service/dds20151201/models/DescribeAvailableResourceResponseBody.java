// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportedDBTypes")
    private SupportedDBTypes supportedDBTypes;

    private DescribeAvailableResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supportedDBTypes = builder.supportedDBTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportedDBTypes
     */
    public SupportedDBTypes getSupportedDBTypes() {
        return this.supportedDBTypes;
    }

    public static final class Builder {
        private String requestId; 
        private SupportedDBTypes supportedDBTypes; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>344EE51D-8850-4935-B68B-58A8F4DCE3BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The supported database types.</p>
         */
        public Builder supportedDBTypes(SupportedDBTypes supportedDBTypes) {
            this.supportedDBTypes = supportedDBTypes;
            return this;
        }

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class DBInstanceStorageRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        private DBInstanceStorageRange(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceStorageRange create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 
            private Integer step; 

            /**
             * <p>The maximum storage capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16000</p>
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum storage capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * <p>The step size for adjusting the storage capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public DBInstanceStorageRange build() {
                return new DBInstanceStorageRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class AvailableResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceStorageRange")
        private DBInstanceStorageRange DBInstanceStorageRange;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceClassRemark")
        private String instanceClassRemark;

        private AvailableResource(Builder builder) {
            this.DBInstanceStorageRange = builder.DBInstanceStorageRange;
            this.instanceClass = builder.instanceClass;
            this.instanceClassRemark = builder.instanceClassRemark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResource create() {
            return builder().build();
        }

        /**
         * @return DBInstanceStorageRange
         */
        public DBInstanceStorageRange getDBInstanceStorageRange() {
            return this.DBInstanceStorageRange;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceClassRemark
         */
        public String getInstanceClassRemark() {
            return this.instanceClassRemark;
        }

        public static final class Builder {
            private DBInstanceStorageRange DBInstanceStorageRange; 
            private String instanceClass; 
            private String instanceClassRemark; 

            /**
             * <p>The storage capacity range of the instance.</p>
             */
            public Builder DBInstanceStorageRange(DBInstanceStorageRange DBInstanceStorageRange) {
                this.DBInstanceStorageRange = DBInstanceStorageRange;
                return this;
            }

            /**
             * <p>The instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>mdb.shard.2x.xlarge.d</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4 cores, 8 GB (Dedicated) (Current instance type: mdb.shard.2x.xlarge.d (4 cores, 8 GB (Dedicated cloud-disk), maximum connections: 3000, maximum IOPS: min{1800 + 50 × Storage capacity, 21000}))</p>
             */
            public Builder instanceClassRemark(String instanceClassRemark) {
                this.instanceClassRemark = instanceClassRemark;
                return this;
            }

            public AvailableResource build() {
                return new AvailableResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class AvailableResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableResource")
        private java.util.List<AvailableResource> availableResource;

        private AvailableResources(Builder builder) {
            this.availableResource = builder.availableResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResources create() {
            return builder().build();
        }

        /**
         * @return availableResource
         */
        public java.util.List<AvailableResource> getAvailableResource() {
            return this.availableResource;
        }

        public static final class Builder {
            private java.util.List<AvailableResource> availableResource; 

            /**
             * AvailableResource.
             */
            public Builder availableResource(java.util.List<AvailableResource> availableResource) {
                this.availableResource = availableResource;
                return this;
            }

            public AvailableResources build() {
                return new AvailableResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedNodeType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableResources")
        private AvailableResources availableResources;

        @com.aliyun.core.annotation.NameInMap("NetworkTypes")
        private String networkTypes;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        private SupportedNodeType(Builder builder) {
            this.availableResources = builder.availableResources;
            this.networkTypes = builder.networkTypes;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedNodeType create() {
            return builder().build();
        }

        /**
         * @return availableResources
         */
        public AvailableResources getAvailableResources() {
            return this.availableResources;
        }

        /**
         * @return networkTypes
         */
        public String getNetworkTypes() {
            return this.networkTypes;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private AvailableResources availableResources; 
            private String networkTypes; 
            private String nodeType; 

            /**
             * <p>The details of the available resources.</p>
             */
            public Builder availableResources(AvailableResources availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * <p>The network type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkTypes(String networkTypes) {
                this.networkTypes = networkTypes;
                return this;
            }

            /**
             * <p>The number of nodes in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public SupportedNodeType build() {
                return new SupportedNodeType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedNodeTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedNodeType")
        private java.util.List<SupportedNodeType> supportedNodeType;

        private SupportedNodeTypes(Builder builder) {
            this.supportedNodeType = builder.supportedNodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedNodeTypes create() {
            return builder().build();
        }

        /**
         * @return supportedNodeType
         */
        public java.util.List<SupportedNodeType> getSupportedNodeType() {
            return this.supportedNodeType;
        }

        public static final class Builder {
            private java.util.List<SupportedNodeType> supportedNodeType; 

            /**
             * SupportedNodeType.
             */
            public Builder supportedNodeType(java.util.List<SupportedNodeType> supportedNodeType) {
                this.supportedNodeType = supportedNodeType;
                return this;
            }

            public SupportedNodeTypes build() {
                return new SupportedNodeTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedEngine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("SupportedNodeTypes")
        private SupportedNodeTypes supportedNodeTypes;

        private SupportedEngine(Builder builder) {
            this.engine = builder.engine;
            this.supportedNodeTypes = builder.supportedNodeTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngine create() {
            return builder().build();
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return supportedNodeTypes
         */
        public SupportedNodeTypes getSupportedNodeTypes() {
            return this.supportedNodeTypes;
        }

        public static final class Builder {
            private String engine; 
            private SupportedNodeTypes supportedNodeTypes; 

            /**
             * <p>The storage engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>WiredTiger</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The supported instance types.</p>
             */
            public Builder supportedNodeTypes(SupportedNodeTypes supportedNodeTypes) {
                this.supportedNodeTypes = supportedNodeTypes;
                return this;
            }

            public SupportedEngine build() {
                return new SupportedEngine(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedEngines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedEngine")
        private java.util.List<SupportedEngine> supportedEngine;

        private SupportedEngines(Builder builder) {
            this.supportedEngine = builder.supportedEngine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngines create() {
            return builder().build();
        }

        /**
         * @return supportedEngine
         */
        public java.util.List<SupportedEngine> getSupportedEngine() {
            return this.supportedEngine;
        }

        public static final class Builder {
            private java.util.List<SupportedEngine> supportedEngine; 

            /**
             * SupportedEngine.
             */
            public Builder supportedEngine(java.util.List<SupportedEngine> supportedEngine) {
                this.supportedEngine = supportedEngine;
                return this;
            }

            public SupportedEngines build() {
                return new SupportedEngines(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedEngineVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedEngines")
        private SupportedEngines supportedEngines;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SupportedEngineVersion(Builder builder) {
            this.supportedEngines = builder.supportedEngines;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngineVersion create() {
            return builder().build();
        }

        /**
         * @return supportedEngines
         */
        public SupportedEngines getSupportedEngines() {
            return this.supportedEngines;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private SupportedEngines supportedEngines; 
            private String version; 

            /**
             * <p>The supported storage engines.</p>
             */
            public Builder supportedEngines(SupportedEngines supportedEngines) {
                this.supportedEngines = supportedEngines;
                return this;
            }

            /**
             * <p>The database engine version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SupportedEngineVersion build() {
                return new SupportedEngineVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedEngineVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedEngineVersion")
        private java.util.List<SupportedEngineVersion> supportedEngineVersion;

        private SupportedEngineVersions(Builder builder) {
            this.supportedEngineVersion = builder.supportedEngineVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngineVersions create() {
            return builder().build();
        }

        /**
         * @return supportedEngineVersion
         */
        public java.util.List<SupportedEngineVersion> getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

        public static final class Builder {
            private java.util.List<SupportedEngineVersion> supportedEngineVersion; 

            /**
             * SupportedEngineVersion.
             */
            public Builder supportedEngineVersion(java.util.List<SupportedEngineVersion> supportedEngineVersion) {
                this.supportedEngineVersion = supportedEngineVersion;
                return this;
            }

            public SupportedEngineVersions build() {
                return new SupportedEngineVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class AvailableZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SupportedEngineVersions")
        private SupportedEngineVersions supportedEngineVersions;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private AvailableZone(Builder builder) {
            this.regionId = builder.regionId;
            this.supportedEngineVersions = builder.supportedEngineVersions;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZone create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return supportedEngineVersions
         */
        public SupportedEngineVersions getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String regionId; 
            private SupportedEngineVersions supportedEngineVersions; 
            private String zoneId; 

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The supported storage engine versions.</p>
             */
            public Builder supportedEngineVersions(SupportedEngineVersions supportedEngineVersions) {
                this.supportedEngineVersions = supportedEngineVersions;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AvailableZone build() {
                return new AvailableZone(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableZone")
        private java.util.List<AvailableZone> availableZone;

        private AvailableZones(Builder builder) {
            this.availableZone = builder.availableZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZones create() {
            return builder().build();
        }

        /**
         * @return availableZone
         */
        public java.util.List<AvailableZone> getAvailableZone() {
            return this.availableZone;
        }

        public static final class Builder {
            private java.util.List<AvailableZone> availableZone; 

            /**
             * AvailableZone.
             */
            public Builder availableZone(java.util.List<AvailableZone> availableZone) {
                this.availableZone = availableZone;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedDBType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableZones")
        private AvailableZones availableZones;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        private SupportedDBType(Builder builder) {
            this.availableZones = builder.availableZones;
            this.dbType = builder.dbType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedDBType create() {
            return builder().build();
        }

        /**
         * @return availableZones
         */
        public AvailableZones getAvailableZones() {
            return this.availableZones;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        public static final class Builder {
            private AvailableZones availableZones; 
            private String dbType; 

            /**
             * <p>The available zones.</p>
             */
            public Builder availableZones(AvailableZones availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * <p>The architecture of the instance. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: replica set instance</li>
             * <li><strong>sharding</strong>: sharded cluster instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sharding</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            public SupportedDBType build() {
                return new SupportedDBType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedDBTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedDBType")
        private java.util.List<SupportedDBType> supportedDBType;

        private SupportedDBTypes(Builder builder) {
            this.supportedDBType = builder.supportedDBType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedDBTypes create() {
            return builder().build();
        }

        /**
         * @return supportedDBType
         */
        public java.util.List<SupportedDBType> getSupportedDBType() {
            return this.supportedDBType;
        }

        public static final class Builder {
            private java.util.List<SupportedDBType> supportedDBType; 

            /**
             * SupportedDBType.
             */
            public Builder supportedDBType(java.util.List<SupportedDBType> supportedDBType) {
                this.supportedDBType = supportedDBType;
                return this;
            }

            public SupportedDBTypes build() {
                return new SupportedDBTypes(this);
            } 

        } 

    }
}
