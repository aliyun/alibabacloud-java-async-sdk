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
         * An array that consists of the details about the global active database clusters that are returned.
         */
        public Builder gadInstances(java.util.List < GadInstances> gadInstances) {
            this.gadInstances = gadInstances;
            return this;
        }

        /**
         * The ID of the request.
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
             * The ID of the node.
             */
            public Builder DBInstanceID(String DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * A JSON array that consists of the details about the Data Transmission Service (DTS) synchronization task.
             * <p>
             * 
             * >  Each unit node uses DTS to synchronize data with the central node. This parameter contains the ID of the DTS synchronization link and the ID of the DTS synchronization request.
             */
            public Builder dtsInstance(String dtsInstance) {
                this.dtsInstance = dtsInstance;
                return this;
            }

            /**
             * The database engine that is run by the node.
             * <p>
             * 
             * >  The value of this parameter is fixed as **mysql**.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version that is run by the node.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The ID of the region where the node resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the node. Valid values:
             * <p>
             * 
             * *   **CENTRAL**: The node is the central node. Each global active database cluster has only one central node. All unit nodes synchronize data from the central node.
             * *   **UNIT**: The node is a unit node. Each global active database cluster can have up to 10 unit nodes. All unit nodes synchronize data from the central node.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The status of the node. Valid values:
             * <p>
             * 
             * *   **activation**: The node is running.
             * *   **creating**: The node is being created.
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
             * The time when the global active database cluster was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The name of the global active database cluster.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * An array that consists of the details about the nodes in the global active database cluster.
             */
            public Builder gadInstanceMembers(java.util.List < GadInstanceMembers> gadInstanceMembers) {
                this.gadInstanceMembers = gadInstanceMembers;
                return this;
            }

            /**
             * The ID of the global active database cluster.
             */
            public Builder gadInstanceName(String gadInstanceName) {
                this.gadInstanceName = gadInstanceName;
                return this;
            }

            /**
             * The time when the most recent modification was made to the global active database cluster. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The database engine that is run by the global active database cluster.
             * <p>
             * 
             * >  The value of this parameter is fixed as **mysql**.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * The status of the global active database cluster. Valid values:
             * <p>
             * 
             * *   **activation**: The global active database cluster is running.
             * *   **creating**: The global active database cluster is being created.
             * *   **replica_adding**: Nodes are being added to the global active database cluster.
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
