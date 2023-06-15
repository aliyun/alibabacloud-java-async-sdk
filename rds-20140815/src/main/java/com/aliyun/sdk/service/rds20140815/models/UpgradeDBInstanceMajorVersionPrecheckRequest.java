// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBInstanceMajorVersionPrecheckRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceMajorVersionPrecheckRequest</p>
 */
public class UpgradeDBInstanceMajorVersionPrecheckRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TargetMajorVersion")
    @Validation(required = true)
    private String targetMajorVersion;

    private UpgradeDBInstanceMajorVersionPrecheckRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetMajorVersion = builder.targetMajorVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceMajorVersionPrecheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return targetMajorVersion
     */
    public String getTargetMajorVersion() {
        return this.targetMajorVersion;
    }

    public static final class Builder extends Request.Builder<UpgradeDBInstanceMajorVersionPrecheckRequest, Builder> {
        private String DBInstanceId; 
        private Long resourceOwnerId; 
        private String targetMajorVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceMajorVersionPrecheckRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetMajorVersion = request.targetMajorVersion;
        } 

        /**
         * The ID of the instance.
         * <p>
         * 
         * The instance must meet the following requirements:
         * 
         * *   The instance runs PostgreSQL 12, PostgreSQL 11, PostgreSQL 10, or PostgreSQL 9.4.
         * *   The instance runs RDS High-availability Edition or RDS Basic Edition.
         * *   The instance resides in a virtual private cloud (VPC). If the instance resides in the classic network, you must migrate the instance to a VPC before you call this operation. For more information about how to view or change the network type of an instance, see [Change the network type of an ApsaraDB RDS for PostgreSQL instance](~~96761~~).
         * *   The instance cannot be a read-only instance and cannot be created in a dedicated cluster.
         * *   The ID of the instance does not start with `pg-cn`.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The new major engine version of the instance. The new major engine version must be later than the original major engine version.
         * <p>
         * 
         * For example, if the original major engine version is PostgreSQL 9.4, the new major engine version can be PostgreSQL 10, PostgreSQL 11, PostgreSQL 12, or PostgreSQL 13.
         */
        public Builder targetMajorVersion(String targetMajorVersion) {
            this.putQueryParameter("TargetMajorVersion", targetMajorVersion);
            this.targetMajorVersion = targetMajorVersion;
            return this;
        }

        @Override
        public UpgradeDBInstanceMajorVersionPrecheckRequest build() {
            return new UpgradeDBInstanceMajorVersionPrecheckRequest(this);
        } 

    } 

}
