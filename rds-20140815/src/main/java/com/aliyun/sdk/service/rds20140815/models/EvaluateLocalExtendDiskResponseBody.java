// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EvaluateLocalExtendDiskResponseBody} extends {@link TeaModel}
 *
 * <p>EvaluateLocalExtendDiskResponseBody</p>
 */
public class EvaluateLocalExtendDiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Available")
    private String available;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DBInstanceTransType")
    private String DBInstanceTransType;

    @com.aliyun.core.annotation.NameInMap("LocalUpgradeDiskLimit")
    private Long localUpgradeDiskLimit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether the instance is available. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder available(String available) {
            this.available = available;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1375i66nd******</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The data transfer type supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder DBInstanceTransType(String DBInstanceTransType) {
            this.DBInstanceTransType = DBInstanceTransType;
            return this;
        }

        /**
         * <p>The maximum value of the local disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder localUpgradeDiskLimit(Long localUpgradeDiskLimit) {
            this.localUpgradeDiskLimit = localUpgradeDiskLimit;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A4C4D26F-E5CE-5A28-8C54-46A6FB318223</p>
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
