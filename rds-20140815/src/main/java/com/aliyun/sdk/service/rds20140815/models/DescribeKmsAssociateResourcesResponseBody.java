// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKmsAssociateResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKmsAssociateResourcesResponseBody</p>
 */
public class DescribeKmsAssociateResourcesResponseBody extends TeaModel {
    @NameInMap("AssociateDBInstances")
    private java.util.List < AssociateDBInstances> associateDBInstances;

    @NameInMap("AssociateStatus")
    private Boolean associateStatus;

    @NameInMap("RequestId")
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
         * AssociateDBInstances.
         */
        public Builder associateDBInstances(java.util.List < AssociateDBInstances> associateDBInstances) {
            this.associateDBInstances = associateDBInstances;
            return this;
        }

        /**
         * AssociateStatus.
         */
        public Builder associateStatus(Boolean associateStatus) {
            this.associateStatus = associateStatus;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("DBInstanceName")
        private String DBInstanceName;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("KeyUsedBy")
        private String keyUsedBy;

        @NameInMap("Status")
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
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
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
             * KeyUsedBy.
             */
            public Builder keyUsedBy(String keyUsedBy) {
                this.keyUsedBy = keyUsedBy;
                return this;
            }

            /**
             * Status.
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
