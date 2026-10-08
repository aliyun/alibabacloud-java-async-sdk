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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeMode")
    private String upgradeMode;

    private UpgradeDBInstanceMajorVersionPrecheckRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetMajorVersion = builder.targetMajorVersion;
        this.upgradeMode = builder.upgradeMode;
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

    /**
     * @return upgradeMode
     */
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    public static final class Builder extends Request.Builder<UpgradeDBInstanceMajorVersionPrecheckRequest, Builder> {
        private String DBInstanceId; 
        private Long resourceOwnerId; 
        private String targetMajorVersion; 
        private String upgradeMode; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceMajorVersionPrecheckRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetMajorVersion = request.targetMajorVersion;
            this.upgradeMode = request.upgradeMode;
        } 

        /**
         * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1c808s731l****</p>
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
         * <p>The major engine version of the target instance. The version must be later than the current major engine version of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17.0</p>
         */
        public Builder targetMajorVersion(String targetMajorVersion) {
            this.putQueryParameter("TargetMajorVersion", targetMajorVersion);
            this.targetMajorVersion = targetMajorVersion;
            return this;
        }

        /**
         * <p>The upgrade mode. Valid values:</p>
         * <ul>
         * <li><strong>zeroDownTimeUpgrade</strong>: zero-downtime upgrade.</li>
         * <li><strong>inPlaceUpgrade</strong>: in-place upgrade.</li>
         * <li><strong>greenBlueDeployment</strong>: blue-green deployment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zeroDownTimeUpgrade</p>
         */
        public Builder upgradeMode(String upgradeMode) {
            this.putQueryParameter("UpgradeMode", upgradeMode);
            this.upgradeMode = upgradeMode;
            return this;
        }

        @Override
        public UpgradeDBInstanceMajorVersionPrecheckRequest build() {
            return new UpgradeDBInstanceMajorVersionPrecheckRequest(this);
        } 

    } 

}
