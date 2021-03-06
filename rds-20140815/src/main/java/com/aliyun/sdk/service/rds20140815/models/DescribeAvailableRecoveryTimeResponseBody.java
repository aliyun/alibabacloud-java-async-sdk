// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableRecoveryTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableRecoveryTimeResponseBody</p>
 */
public class DescribeAvailableRecoveryTimeResponseBody extends TeaModel {
    @NameInMap("CrossBackupId")
    private Integer crossBackupId;

    @NameInMap("RecoveryBeginTime")
    private String recoveryBeginTime;

    @NameInMap("RecoveryEndTime")
    private String recoveryEndTime;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableRecoveryTimeResponseBody(Builder builder) {
        this.crossBackupId = builder.crossBackupId;
        this.recoveryBeginTime = builder.recoveryBeginTime;
        this.recoveryEndTime = builder.recoveryEndTime;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableRecoveryTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return crossBackupId
     */
    public Integer getCrossBackupId() {
        return this.crossBackupId;
    }

    /**
     * @return recoveryBeginTime
     */
    public String getRecoveryBeginTime() {
        return this.recoveryBeginTime;
    }

    /**
     * @return recoveryEndTime
     */
    public String getRecoveryEndTime() {
        return this.recoveryEndTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer crossBackupId; 
        private String recoveryBeginTime; 
        private String recoveryEndTime; 
        private String regionId; 
        private String requestId; 

        /**
         * CrossBackupId.
         */
        public Builder crossBackupId(Integer crossBackupId) {
            this.crossBackupId = crossBackupId;
            return this;
        }

        /**
         * RecoveryBeginTime.
         */
        public Builder recoveryBeginTime(String recoveryBeginTime) {
            this.recoveryBeginTime = recoveryBeginTime;
            return this;
        }

        /**
         * RecoveryEndTime.
         */
        public Builder recoveryEndTime(String recoveryEndTime) {
            this.recoveryEndTime = recoveryEndTime;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableRecoveryTimeResponseBody build() {
            return new DescribeAvailableRecoveryTimeResponseBody(this);
        } 

    } 

}
