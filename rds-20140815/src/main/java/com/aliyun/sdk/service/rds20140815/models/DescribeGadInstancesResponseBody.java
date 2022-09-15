// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGadInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGadInstancesResponseBody</p>
 */
public class DescribeGadInstancesResponseBody extends TeaModel {
    @NameInMap("GadInstances")
    private java.util.List < GadInstances> gadInstances;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGadInstancesResponseBody(Builder builder) {
        this.gadInstances = builder.gadInstances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGadInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return gadInstances
     */
    public java.util.List < GadInstances> getGadInstances() {
        return this.gadInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < GadInstances> gadInstances; 
        private String requestId; 

        /**
         * GadInstances.
         */
        public Builder gadInstances(java.util.List < GadInstances> gadInstances) {
            this.gadInstances = gadInstances;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGadInstancesResponseBody build() {
            return new DescribeGadInstancesResponseBody(this);
        } 

    } 

    public static class GadInstanceMembers extends TeaModel {
        @NameInMap("DBInstanceID")
        private String DBInstanceID;

        @NameInMap("DtsInstance")
        private String dtsInstance;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Role")
        private String role;

        @NameInMap("Status")
        private String status;

        private GadInstanceMembers(Builder builder) {
            this.DBInstanceID = builder.DBInstanceID;
            this.dtsInstance = builder.dtsInstance;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GadInstanceMembers create() {
            return builder().build();
        }

        /**
         * @return DBInstanceID
         */
        public String getDBInstanceID() {
            return this.DBInstanceID;
        }

        /**
         * @return dtsInstance
         */
        public String getDtsInstance() {
            return this.dtsInstance;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String DBInstanceID; 
            private String dtsInstance; 
            private String engine; 
            private String engineVersion; 
            private String regionId; 
            private String resourceGroupId; 
            private String role; 
            private String status; 

            /**
             * DBInstanceID.
             */
            public Builder DBInstanceID(String DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * DtsInstance.
             */
            public Builder dtsInstance(String dtsInstance) {
                this.dtsInstance = dtsInstance;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public GadInstanceMembers build() {
                return new GadInstanceMembers(this);
            } 

        } 

    }
    public static class GadInstances extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("GadInstanceMembers")
        private java.util.List < GadInstanceMembers> gadInstanceMembers;

        @NameInMap("GadInstanceName")
        private String gadInstanceName;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("Service")
        private String service;

        @NameInMap("Status")
        private String status;

        private GadInstances(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.gadInstanceMembers = builder.gadInstanceMembers;
            this.gadInstanceName = builder.gadInstanceName;
            this.modificationTime = builder.modificationTime;
            this.service = builder.service;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GadInstances create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gadInstanceMembers
         */
        public java.util.List < GadInstanceMembers> getGadInstanceMembers() {
            return this.gadInstanceMembers;
        }

        /**
         * @return gadInstanceName
         */
        public String getGadInstanceName() {
            return this.gadInstanceName;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private java.util.List < GadInstanceMembers> gadInstanceMembers; 
            private String gadInstanceName; 
            private String modificationTime; 
            private String service; 
            private String status; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GadInstanceMembers.
             */
            public Builder gadInstanceMembers(java.util.List < GadInstanceMembers> gadInstanceMembers) {
                this.gadInstanceMembers = gadInstanceMembers;
                return this;
            }

            /**
             * GadInstanceName.
             */
            public Builder gadInstanceName(String gadInstanceName) {
                this.gadInstanceName = gadInstanceName;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public GadInstances build() {
                return new GadInstances(this);
            } 

        } 

    }
}
