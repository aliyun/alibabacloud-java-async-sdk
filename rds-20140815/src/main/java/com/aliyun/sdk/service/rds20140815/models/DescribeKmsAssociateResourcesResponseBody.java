// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKmsAssociateResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKmsAssociateResourcesResponseBody</p>
 */
public class DescribeKmsAssociateResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssociateDBInstances")
    private java.util.List < AssociateDBInstances> associateDBInstances;

    @com.aliyun.core.annotation.NameInMap("AssociateStatus")
    private Boolean associateStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeKmsAssociateResourcesResponseBody(Builder builder) {
        this.associateDBInstances = builder.associateDBInstances;
        this.associateStatus = builder.associateStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKmsAssociateResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return associateDBInstances
     */
    public java.util.List < AssociateDBInstances> getAssociateDBInstances() {
        return this.associateDBInstances;
    }

    /**
     * @return associateStatus
     */
    public Boolean getAssociateStatus() {
        return this.associateStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AssociateDBInstances> associateDBInstances; 
        private Boolean associateStatus; 
        private String requestId; 

        /**
         * The information about the associated ApsaraDB RDS instance.
         */
        public Builder associateDBInstances(java.util.List < AssociateDBInstances> associateDBInstances) {
            this.associateDBInstances = associateDBInstances;
            return this;
        }

        /**
         * Indicates whether an associated RDS instance exists.
         * <p>
         * 
         * - **true**: Yes
         * - **false**: No
         */
        public Builder associateStatus(Boolean associateStatus) {
            this.associateStatus = associateStatus;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKmsAssociateResourcesResponseBody build() {
            return new DescribeKmsAssociateResourcesResponseBody(this);
        } 

    } 

    public static class AssociateDBInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("KeyUsedBy")
        private String keyUsedBy;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AssociateDBInstances(Builder builder) {
            this.DBInstanceName = builder.DBInstanceName;
            this.engine = builder.engine;
            this.keyUsedBy = builder.keyUsedBy;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociateDBInstances create() {
            return builder().build();
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return keyUsedBy
         */
        public String getKeyUsedBy() {
            return this.keyUsedBy;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String DBInstanceName; 
            private String engine; 
            private String keyUsedBy; 
            private String status; 

            /**
             * The instance ID.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * The database engine. Valid values:
             * <p>
             * 
             * *   **MySQL**
             * *   **SQLServer**
             * *   **PostgreSQL**
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The way in which the key is used. Return values:
             * <p>
             * 
             * *   **DiskEncryption**: cloud disk encryption
             * *   **TDE**: transparent data encryption
             */
            public Builder keyUsedBy(String keyUsedBy) {
                this.keyUsedBy = keyUsedBy;
                return this;
            }

            /**
             * The state of the instance. Valid values:
             * <p>
             * 
             * *   **CREATING**: The instance is being created.
             * *   **ACTIVATION**: The instance is running.
             * *   **DELETING**: The instance is being deleted.
             * *   **RESTARTING**: The instance is being restarted.
             * *   **INS_MAINTAINING**: The configuration of the instance is being changed.
             * *   **INS_MAINTAINING**: The instance is being maintained.
             * *   **BACKUP_RECOVERING**: The instance is being restored.
             * *   **NET_MODIFYING**: The network type of the instance is being changed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AssociateDBInstances build() {
                return new AssociateDBInstances(this);
            } 

        } 

    }
}
