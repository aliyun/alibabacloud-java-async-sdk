// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnServiceResponseBody</p>
 */
public class DescribeCdnServiceResponseBody extends TeaModel {
    @NameInMap("ChangingAffectTime")
    private String changingAffectTime;

    @NameInMap("ChangingChargeType")
    private String changingChargeType;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @NameInMap("OpeningTime")
    private String openingTime;

    @NameInMap("OperationLocks")
    private OperationLocks operationLocks;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCdnServiceResponseBody(Builder builder) {
        this.changingAffectTime = builder.changingAffectTime;
        this.changingChargeType = builder.changingChargeType;
        this.instanceId = builder.instanceId;
        this.internetChargeType = builder.internetChargeType;
        this.openingTime = builder.openingTime;
        this.operationLocks = builder.operationLocks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return changingAffectTime
     */
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    /**
     * @return changingChargeType
     */
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return openingTime
     */
    public String getOpeningTime() {
        return this.openingTime;
    }

    /**
     * @return operationLocks
     */
    public OperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String changingAffectTime; 
        private String changingChargeType; 
        private String instanceId; 
        private String internetChargeType; 
        private String openingTime; 
        private OperationLocks operationLocks; 
        private String requestId; 

        /**
         * The time when the metering method for the next cycle takes effect. The time is displayed in GMT.
         */
        public Builder changingAffectTime(String changingAffectTime) {
            this.changingAffectTime = changingAffectTime;
            return this;
        }

        /**
         * The metering method for the next cycle. Valid values:
         * <p>
         * 
         * *   **PayByTraffic**: pay-by-data-transfer
         * *   **PayByBandwidth**: pay-by-bandwidth
         */
        public Builder changingChargeType(String changingChargeType) {
            this.changingChargeType = changingChargeType;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The current metering method. Valid values:
         * <p>
         * 
         * *   **PayByTraffic**: pay-by-data-transfer
         * *   **PayByBandwidth**: pay-by-bandwidth
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The time when the service was activated. The time follows the ISO 8601 standard.
         */
        public Builder openingTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }

        /**
         * The lock status.
         */
        public Builder operationLocks(OperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnServiceResponseBody build() {
            return new DescribeCdnServiceResponseBody(this);
        } 

    } 

    public static class LockReason extends TeaModel {
        @NameInMap("LockReason")
        private String lockReason;

        private LockReason(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockReason create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            /**
             * The reason why the service is locked. A value of financial indicates that the service is locked due to overdue payments.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public LockReason build() {
                return new LockReason(this);
            } 

        } 

    }
    public static class OperationLocks extends TeaModel {
        @NameInMap("LockReason")
        private java.util.List < LockReason> lockReason;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public java.util.List < LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List < LockReason> lockReason; 

            /**
             * The reason why the service is locked. A value of financial indicates that the service is locked due to overdue payments.
             */
            public Builder lockReason(java.util.List < LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
}
