// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeGadInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGadInstancesResponseBody</p>
 */
public class DescribeGadInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GadInstances")
    private java.util.List<GadInstances> gadInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gadInstances
     */
    public java.util.List<GadInstances> getGadInstances() {
        return this.gadInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<GadInstances> gadInstances; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGadInstancesResponseBody model) {
            this.gadInstances = model.gadInstances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the global active database cluster.</p>
         */
        public Builder gadInstances(java.util.List<GadInstances> gadInstances) {
            this.gadInstances = gadInstances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76AF0609-4195-5DFC-BC78-3AD76FF872BB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGadInstancesResponseBody build() {
            return new DescribeGadInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGadInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstancesResponseBody</p>
     */
    public static class GadInstanceMembers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceID")
        private String DBInstanceID;

        @com.aliyun.core.annotation.NameInMap("DtsInstance")
        private String dtsInstance;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(GadInstanceMembers model) {
                this.DBInstanceID = model.DBInstanceID;
                this.dtsInstance = model.dtsInstance;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.role = model.role;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1npi2j8********</p>
             */
            public Builder DBInstanceID(String DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * <p>A JSON array that consists of the details about the Data Transmission Service (DTS) synchronization task.</p>
             * <blockquote>
             * <p> Each unit node (secondary node) synchronizes data from the central node (primary node) by using DTS. This parameter contains the synchronization link ID and request ID of DTS.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtsInstanceId&quot;:&quot;dtsm9t107c********&quot;,&quot;dtsRequestId&quot;:&quot;190F0C6C-4BE6-5676-989B-DBDE6D34CD9C&quot;}</p>
             */
            public Builder dtsInstance(String dtsInstance) {
                this.dtsInstance = dtsInstance;
                return this;
            }

            /**
             * <p>The database engine that is run by the node.</p>
             * <blockquote>
             * <p> The value of this parameter is fixed as <strong>mysql</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version that is run by the node.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The ID of the region where the node resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmy*****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>CENTRAL</strong>: The node is a central node. Each global active database cluster has only one central node. All unit nodes synchronize data from the central node.</li>
             * <li><strong>UNIT</strong>: The node is a unit node. Each global active database cluster can have up to 10 unit nodes. All unit nodes synchronize data from the central node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CENTRAL</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li><strong>activation</strong>: The node is running.</li>
             * <li><strong>creating</strong>: The node is being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>activation</p>
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
    /**
     * 
     * {@link DescribeGadInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstancesResponseBody</p>
     */
    public static class GadInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GadInstanceMembers")
        private java.util.List<GadInstanceMembers> gadInstanceMembers;

        @com.aliyun.core.annotation.NameInMap("GadInstanceName")
        private String gadInstanceName;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<GadInstanceMembers> getGadInstanceMembers() {
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
            private java.util.List<GadInstanceMembers> gadInstanceMembers; 
            private String gadInstanceName; 
            private String modificationTime; 
            private String service; 
            private String status; 

            private Builder() {
            } 

            private Builder(GadInstances model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.gadInstanceMembers = model.gadInstanceMembers;
                this.gadInstanceName = model.gadInstanceName;
                this.modificationTime = model.modificationTime;
                this.service = model.service;
                this.status = model.status;
            } 

            /**
             * <p>The time when the global active database cluster was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-21T02:57:08Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>GadTest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The information about each node in the cluster.</p>
             */
            public Builder gadInstanceMembers(java.util.List<GadInstanceMembers> gadInstanceMembers) {
                this.gadInstanceMembers = gadInstanceMembers;
                return this;
            }

            /**
             * <p>The ID of the global active database cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>gad-rm-bp1npi2j8********</p>
             */
            public Builder gadInstanceName(String gadInstanceName) {
                this.gadInstanceName = gadInstanceName;
                return this;
            }

            /**
             * <p>The time when the most recent modification was made to the global active database cluster. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-21T03:01:20Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The database engine that is run by the global active database cluster.</p>
             * <blockquote>
             * <p> The value of this parameter is fixed as <strong>mysql</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>activation</strong>: The cluster is running.</li>
             * <li><strong>creating</strong>: The cluster is being created.</li>
             * <li><strong>replica_adding</strong>: Nodes are being added to the cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>activation</p>
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
