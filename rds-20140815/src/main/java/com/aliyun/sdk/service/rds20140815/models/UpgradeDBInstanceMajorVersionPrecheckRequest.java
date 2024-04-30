// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBInstanceMajorVersionPrecheckRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceMajorVersionPrecheckRequest</p>
 */
public class UpgradeDBInstanceMajorVersionPrecheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetMajorVersion")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The ID of the instance. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.
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
