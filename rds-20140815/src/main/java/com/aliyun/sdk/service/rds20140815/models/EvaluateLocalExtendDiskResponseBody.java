// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateLocalExtendDiskResponseBody} extends {@link TeaModel}
 *
 * <p>EvaluateLocalExtendDiskResponseBody</p>
 */
public class EvaluateLocalExtendDiskResponseBody extends TeaModel {
    @NameInMap("Available")
    private String available;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("DBInstanceTransType")
    private String DBInstanceTransType;

    @NameInMap("LocalUpgradeDiskLimit")
    private Long localUpgradeDiskLimit;

    @NameInMap("RequestId")
    private String requestId;

    private EvaluateLocalExtendDiskResponseBody(Builder builder) {
        this.available = builder.available;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceTransType = builder.DBInstanceTransType;
        this.localUpgradeDiskLimit = builder.localUpgradeDiskLimit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateLocalExtendDiskResponseBody create() {
        return builder().build();
    }

    /**
     * @return available
     */
    public String getAvailable() {
        return this.available;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceTransType
     */
    public String getDBInstanceTransType() {
        return this.DBInstanceTransType;
    }

    /**
     * @return localUpgradeDiskLimit
     */
    public Long getLocalUpgradeDiskLimit() {
        return this.localUpgradeDiskLimit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String available; 
        private String DBInstanceId; 
        private String DBInstanceTransType; 
        private Long localUpgradeDiskLimit; 
        private String requestId; 

        /**
         * Specifies whether to query the virtual IP addresses of only healthy CDN POPs. Valid values:
         * <p>
         * 
         * *   **on**: healthy CDN edge nodes.
         * *   **off**: all CDN edge nodes.
         */
        public Builder available(String available) {
            this.available = available;
            return this;
        }

        /**
         * The ID of the RDS instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The data migration method of the instance. This parameter is available only for instances that are created in dedicated clusters. Valid values:
         * <p>
         * 
         * *   **0** (default): The system preferentially upgrades or downgrades the instance without a migration. If the resources on the host on which the instance resides are insufficient, the system migrates the instance to another suitable host.
         * *   **1**: The system upgrades or downgrades the instance without a migration. If the upgrade or downgrade is not supported, the system reports an error.
         * *   **2**: The system migrates the data of the instance from the host on which the instance resides to another host. You must also specify **DedicatedHostGroupId**, **TargetDedicatedHostIdForMaster**, and **TargetDedicatedHostIdForSlave**. If you set DBInstanceTransType to 2, you cannot migrate the data of the instance to the host on which the instance resides. If you migrate the data of the instance to the host on which the instance resides, the migration fails.
         */
        public Builder DBInstanceTransType(String DBInstanceTransType) {
            this.DBInstanceTransType = DBInstanceTransType;
            return this;
        }

        /**
         * Local Disk Restrictions.
         */
        public Builder localUpgradeDiskLimit(Long localUpgradeDiskLimit) {
            this.localUpgradeDiskLimit = localUpgradeDiskLimit;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EvaluateLocalExtendDiskResponseBody build() {
            return new EvaluateLocalExtendDiskResponseBody(this);
        } 

    } 

}
