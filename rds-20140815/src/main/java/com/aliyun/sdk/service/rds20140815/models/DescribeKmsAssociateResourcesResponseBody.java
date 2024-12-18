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
 * {@link DescribeKmsAssociateResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKmsAssociateResourcesResponseBody</p>
 */
public class DescribeKmsAssociateResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssociateDBInstances")
    private java.util.List<AssociateDBInstances> associateDBInstances;

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
    public java.util.List<AssociateDBInstances> getAssociateDBInstances() {
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
        private java.util.List<AssociateDBInstances> associateDBInstances; 
        private Boolean associateStatus; 
        private String requestId; 

        /**
         * <p>The information about the associated ApsaraDB RDS instances.</p>
         */
        public Builder associateDBInstances(java.util.List<AssociateDBInstances> associateDBInstances) {
            this.associateDBInstances = associateDBInstances;
            return this;
        }

        /**
         * <p>Indicates whether an associated RDS instance exists.</p>
         * <ul>
         * <li><strong>true</strong>: Yes</li>
         * <li><strong>false</strong>: No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder associateStatus(Boolean associateStatus) {
            this.associateStatus = associateStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKmsAssociateResourcesResponseBody build() {
            return new DescribeKmsAssociateResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKmsAssociateResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKmsAssociateResourcesResponseBody</p>
     */
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-bp16p6f68130****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The database engine. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong></li>
             * <li><strong>SQLServer</strong></li>
             * <li><strong>PostgreSQL</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostgreSQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The purpose of the key. Valid values:</p>
             * <ul>
             * <li><strong>DiskEncryption</strong>: cloud disk encryption</li>
             * <li><strong>TDE</strong>: transparent data encryption</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DiskEncryption</p>
             */
            public Builder keyUsedBy(String keyUsedBy) {
                this.keyUsedBy = keyUsedBy;
                return this;
            }

            /**
             * <p>The state of the instance. Valid values:</p>
             * <ul>
             * <li><strong>CREATING</strong>: The instance is being created.</li>
             * <li><strong>ACTIVATION</strong>: The instance is running.</li>
             * <li><strong>DELETING</strong>: The instance is being deleted.</li>
             * <li><strong>RESTARTING</strong>: The instance is being restarted.</li>
             * <li><strong>INS_MAINTAINING</strong>: The configuration of the instance is being changed.</li>
             * <li><strong>INS_MAINTAINING</strong>: The instance is being maintained.</li>
             * <li><strong>BACKUP_RECOVERING</strong>: The instance is being restored.</li>
             * <li><strong>NET_MODIFYING</strong>: The network type of the instance is being changed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVATION</p>
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
