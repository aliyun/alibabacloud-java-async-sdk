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
         * Indicates whether the instance is available. Valid values: true and false.
         */
        public Builder available(String available) {
            this.available = available;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The data transfer type supported by the instance.
         */
        public Builder DBInstanceTransType(String DBInstanceTransType) {
            this.DBInstanceTransType = DBInstanceTransType;
            return this;
        }

        /**
         * The maximum value of the local disk. Unit: GB.
         */
        public Builder localUpgradeDiskLimit(Long localUpgradeDiskLimit) {
            this.localUpgradeDiskLimit = localUpgradeDiskLimit;
            return this;
        }

        /**
         * The request ID.
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
