// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnsecServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnsecServiceResponseBody</p>
 */
public class DescribeDcdnsecServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangingAffectTime")
    private String changingAffectTime;

    @com.aliyun.core.annotation.NameInMap("ChangingChargeType")
    private String changingChargeType;

    @com.aliyun.core.annotation.NameInMap("DomainNum")
    private String domainNum;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FlowType")
    private String flowType;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.NameInMap("OperationLocks")
    private OperationLocks operationLocks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestType")
    private String requestType;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private DescribeDcdnsecServiceResponseBody(Builder builder) {
        this.changingAffectTime = builder.changingAffectTime;
        this.changingChargeType = builder.changingChargeType;
        this.domainNum = builder.domainNum;
        this.endTime = builder.endTime;
        this.flowType = builder.flowType;
        this.instanceId = builder.instanceId;
        this.internetChargeType = builder.internetChargeType;
        this.operationLocks = builder.operationLocks;
        this.requestId = builder.requestId;
        this.requestType = builder.requestType;
        this.startTime = builder.startTime;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnsecServiceResponseBody create() {
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
     * @return domainNum
     */
    public String getDomainNum() {
        return this.domainNum;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return flowType
     */
    public String getFlowType() {
        return this.flowType;
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

    /**
     * @return requestType
     */
    public String getRequestType() {
        return this.requestType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String changingAffectTime; 
        private String changingChargeType; 
        private String domainNum; 
        private String endTime; 
        private String flowType; 
        private String instanceId; 
        private String internetChargeType; 
        private OperationLocks operationLocks; 
        private String requestId; 
        private String requestType; 
        private String startTime; 
        private String version; 

        /**
         * The time when the renewed service takes effect. The time is displayed in UTC.
         */
        public Builder changingAffectTime(String changingAffectTime) {
            this.changingAffectTime = changingAffectTime;
            return this;
        }

        /**
         * The new metering method for the renewed DCDN. Valid values:
         * <p>
         * 
         * *   **PayByTraffic**: pay by data transfer
         * *   **PayByBandwidth**: pay by bandwidth
         * *   **PayByBandwidth95**: pay by 95th percentile bandwidth
         * *   **PayByBandwidth_monthavg**: pay by monthly average bandwidth
         * *   **PayByBandwidth_month4th**: pay by fourth peak bandwidth per month
         * *   **PayByBandwidth_monthday95avg**: pay by monthly average 95th percentile bandwidth
         * *   **PayByBandwidth_nighthalf95**: pay by 95th percentile bandwidth (50% off during nighttime)
         */
        public Builder changingChargeType(String changingChargeType) {
            this.changingChargeType = changingChargeType;
            return this;
        }

        /**
         * The number of accelerated domain names that use DCDN.
         */
        public Builder domainNum(String domainNum) {
            this.domainNum = domainNum;
            return this;
        }

        /**
         * The service expiration time.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The metering method for traffic.
         */
        public Builder flowType(String flowType) {
            this.flowType = flowType;
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
         * *   **PayByTraffic**: pay by data transfer
         * *   **PayByBandwidth**: pay by bandwidth
         * *   **PayByBandwidth95**: pay by 95th percentile bandwidth
         * *   **PayByBandwidth_monthavg**: pay by monthly average bandwidth
         * *   **PayByBandwidth_month4th**: pay by fourth peak bandwidth per month
         * *   **PayByBandwidth_monthday95avg**: pay by monthly average 95th percentile bandwidth
         * *   **PayByBandwidth_nighthalf95**: pay by 95th percentile bandwidth (50% off during nighttime)
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The lock status of DCDN.
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

        /**
         * The metering method for requests.
         */
        public Builder requestType(String requestType) {
            this.requestType = requestType;
            return this;
        }

        /**
         * The service activation time.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The version number.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeDcdnsecServiceResponseBody build() {
            return new DescribeDcdnsecServiceResponseBody(this);
        } 

    } 

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
             * The reason why the instance was locked.
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
             * The reason why the instance was locked.
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
