// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportedDBTypes")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SupportedDBTypes.
         */
        public Builder supportedDBTypes(SupportedDBTypes supportedDBTypes) {
            this.supportedDBTypes = supportedDBTypes;
            return this;
        }

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    public static class AvailableResource extends TeaModel {
        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceClassRemark")
        private String instanceClassRemark;

        private AvailableResource(Builder builder) {
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
            private String instanceClass; 
            private String instanceClassRemark; 

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * InstanceClassRemark.
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
    public static class AvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        private java.util.List < AvailableResource> availableResource;

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
        public java.util.List < AvailableResource> getAvailableResource() {
            return this.availableResource;
        }

        public static final class Builder {
            private java.util.List < AvailableResource> availableResource; 

            /**
             * AvailableResource.
             */
            public Builder availableResource(java.util.List < AvailableResource> availableResource) {
                this.availableResource = availableResource;
                return this;
            }

            public AvailableResources build() {
                return new AvailableResources(this);
            } 

        } 

    }
    public static class SupportedNodeType extends TeaModel {
        @NameInMap("AvailableResources")
        private AvailableResources availableResources;

        @NameInMap("NetworkTypes")
        private String networkTypes;

        @NameInMap("NodeType")
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
             * AvailableResources.
             */
            public Builder availableResources(AvailableResources availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * NetworkTypes.
             */
            public Builder networkTypes(String networkTypes) {
                this.networkTypes = networkTypes;
                return this;
            }

            /**
             * NodeType.
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
    public static class SupportedNodeTypes extends TeaModel {
        @NameInMap("SupportedNodeType")
        private java.util.List < SupportedNodeType> supportedNodeType;

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
        public java.util.List < SupportedNodeType> getSupportedNodeType() {
            return this.supportedNodeType;
        }

        public static final class Builder {
            private java.util.List < SupportedNodeType> supportedNodeType; 

            /**
             * SupportedNodeType.
             */
            public Builder supportedNodeType(java.util.List < SupportedNodeType> supportedNodeType) {
                this.supportedNodeType = supportedNodeType;
                return this;
            }

            public SupportedNodeTypes build() {
                return new SupportedNodeTypes(this);
            } 

        } 

    }
    public static class SupportedEngine extends TeaModel {
        @NameInMap("Engine")
        private String engine;

        @NameInMap("SupportedNodeTypes")
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
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * SupportedNodeTypes.
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
    public static class SupportedEngines extends TeaModel {
        @NameInMap("SupportedEngine")
        private java.util.List < SupportedEngine> supportedEngine;

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
        public java.util.List < SupportedEngine> getSupportedEngine() {
            return this.supportedEngine;
        }

        public static final class Builder {
            private java.util.List < SupportedEngine> supportedEngine; 

            /**
             * SupportedEngine.
             */
            public Builder supportedEngine(java.util.List < SupportedEngine> supportedEngine) {
                this.supportedEngine = supportedEngine;
                return this;
            }

            public SupportedEngines build() {
                return new SupportedEngines(this);
            } 

        } 

    }
    public static class SupportedEngineVersion extends TeaModel {
        @NameInMap("SupportedEngines")
        private SupportedEngines supportedEngines;

        @NameInMap("Version")
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
             * SupportedEngines.
             */
            public Builder supportedEngines(SupportedEngines supportedEngines) {
                this.supportedEngines = supportedEngines;
                return this;
            }

            /**
             * Version.
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
    public static class SupportedEngineVersions extends TeaModel {
        @NameInMap("SupportedEngineVersion")
        private java.util.List < SupportedEngineVersion> supportedEngineVersion;

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
        public java.util.List < SupportedEngineVersion> getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

        public static final class Builder {
            private java.util.List < SupportedEngineVersion> supportedEngineVersion; 

            /**
             * SupportedEngineVersion.
             */
            public Builder supportedEngineVersion(java.util.List < SupportedEngineVersion> supportedEngineVersion) {
                this.supportedEngineVersion = supportedEngineVersion;
                return this;
            }

            public SupportedEngineVersions build() {
                return new SupportedEngineVersions(this);
            } 

        } 

    }
    public static class AvailableZone extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SupportedEngineVersions")
        private SupportedEngineVersions supportedEngineVersions;

        @NameInMap("ZoneId")
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SupportedEngineVersions.
             */
            public Builder supportedEngineVersions(SupportedEngineVersions supportedEngineVersions) {
                this.supportedEngineVersions = supportedEngineVersions;
                return this;
            }

            /**
             * ZoneId.
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
    public static class AvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        private java.util.List < AvailableZone> availableZone;

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
        public java.util.List < AvailableZone> getAvailableZone() {
            return this.availableZone;
        }

        public static final class Builder {
            private java.util.List < AvailableZone> availableZone; 

            /**
             * AvailableZone.
             */
            public Builder availableZone(java.util.List < AvailableZone> availableZone) {
                this.availableZone = availableZone;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
    public static class SupportedDBType extends TeaModel {
        @NameInMap("AvailableZones")
        private AvailableZones availableZones;

        @NameInMap("DbType")
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
             * AvailableZones.
             */
            public Builder availableZones(AvailableZones availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            /**
             * DbType.
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
    public static class SupportedDBTypes extends TeaModel {
        @NameInMap("SupportedDBType")
        private java.util.List < SupportedDBType> supportedDBType;

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
        public java.util.List < SupportedDBType> getSupportedDBType() {
            return this.supportedDBType;
        }

        public static final class Builder {
            private java.util.List < SupportedDBType> supportedDBType; 

            /**
             * SupportedDBType.
             */
            public Builder supportedDBType(java.util.List < SupportedDBType> supportedDBType) {
                this.supportedDBType = supportedDBType;
                return this;
            }

            public SupportedDBTypes build() {
                return new SupportedDBTypes(this);
            } 

        } 

    }
}
