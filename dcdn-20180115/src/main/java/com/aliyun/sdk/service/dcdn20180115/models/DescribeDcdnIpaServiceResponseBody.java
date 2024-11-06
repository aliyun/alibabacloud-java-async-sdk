// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnIpaServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnIpaServiceResponseBody</p>
 */
public class DescribeDcdnIpaServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangingAffectTime")
    private String changingAffectTime;

    @com.aliyun.core.annotation.NameInMap("ChangingChargeType")
    private String changingChargeType;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.NameInMap("OpeningTime")
    private String openingTime;

    @com.aliyun.core.annotation.NameInMap("OperationLocks")
    private OperationLocks operationLocks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnIpaServiceResponseBody(Builder builder) {
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

    public static DescribeDcdnIpaServiceResponseBody create() {
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
         * <p>The time when the change of the billing method starts to take effect. The time is in GMT. This time appears on the frontend only when it is later than the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-31T16:00:00Z</p>
         */
        public Builder changingAffectTime(String changingAffectTime) {
            this.changingAffectTime = changingAffectTime;
            return this;
        }

        /**
         * <p>The new billing method to take effect. Valid values:</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
         * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
         * <li><strong>PayByBandwidth95</strong>: pay-by-95th percentile bandwidth</li>
         * <li><strong>PayByBandwidth_monthavg</strong>: pay-by-monthly average bandwidth</li>
         * <li><strong>PayByBandwidth_month4th</strong>: pay-by-fourth peak bandwidth per month</li>
         * <li><strong>PayByBandwidth_monthday95avg</strong>: pay-by-monthly average 95th percentile bandwidth</li>
         * <li><strong>PayByBandwidth_nighthalf95</strong>: pay-by-95th percentile bandwidth (50% off during nighttime)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        public Builder changingChargeType(String changingChargeType) {
            this.changingChargeType = changingChargeType;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1883927335936173</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
         * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
         * <li><strong>PayByBandwidth95</strong>: pay-by-95th percentile bandwidth</li>
         * <li><strong>PayByBandwidth_monthavg</strong>: pay-by-monthly average bandwidth</li>
         * <li><strong>PayByBandwidth_month4th</strong>: pay-by-fourth peak bandwidth per month</li>
         * <li><strong>PayByBandwidth_monthday95avg</strong>: pay-by-monthly average 95th percentile bandwidth</li>
         * <li><strong>PayByBandwidth_nighthalf95</strong>: pay-by-95th percentile bandwidth (50% off during nighttime)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The time when the DCDN service was activated. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-19T11:16:11Z</p>
         */
        public Builder openingTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }

        /**
         * <p>The lock status of secure DCDN.</p>
         */
        public Builder operationLocks(OperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EF2AEBC2-EDBD-41CF-BF64-7E095D42D6EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnIpaServiceResponseBody build() {
            return new DescribeDcdnIpaServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnIpaServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnIpaServiceResponseBody</p>
     */
    public static class LockReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
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
             * <p>The reason why the instance is locked. For example, a value of <strong>financial</strong> indicates that an overdue payment exists.</p>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
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
    /**
     * 
     * {@link DescribeDcdnIpaServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnIpaServiceResponseBody</p>
     */
    public static class OperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
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
             * <p>The reason why the instance is locked. For example, a value of <strong>financial</strong> indicates that an overdue payment exists.</p>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
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
