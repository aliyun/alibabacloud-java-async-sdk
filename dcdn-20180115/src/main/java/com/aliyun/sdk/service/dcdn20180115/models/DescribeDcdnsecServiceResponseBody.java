// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The time when the renewed service takes effect. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T16:00:00Z</p>
         */
        public Builder changingAffectTime(String changingAffectTime) {
            this.changingAffectTime = changingAffectTime;
            return this;
        }

        /**
         * <p>The new metering method for the renewed DCDN. Valid values:</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay by data transfer</li>
         * <li><strong>PayByBandwidth</strong>: pay by bandwidth</li>
         * <li><strong>PayByBandwidth95</strong>: pay by 95th percentile bandwidth</li>
         * <li><strong>PayByBandwidth_monthavg</strong>: pay by monthly average bandwidth</li>
         * <li><strong>PayByBandwidth_month4th</strong>: pay by fourth peak bandwidth per month</li>
         * <li><strong>PayByBandwidth_monthday95avg</strong>: pay by monthly average 95th percentile bandwidth</li>
         * <li><strong>PayByBandwidth_nighthalf95</strong>: pay by 95th percentile bandwidth (50% off during nighttime)</li>
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
         * <p>The number of accelerated domain names that use DCDN.</p>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        public Builder domainNum(String domainNum) {
            this.domainNum = domainNum;
            return this;
        }

        /**
         * <p>The service expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-26T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The metering method for traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>PayBySecTraffic</p>
         */
        public Builder flowType(String flowType) {
            this.flowType = flowType;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn_dcdnsec_public_cn-123***</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The current metering method. Valid values:</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay by data transfer</li>
         * <li><strong>PayByBandwidth</strong>: pay by bandwidth</li>
         * <li><strong>PayByBandwidth95</strong>: pay by 95th percentile bandwidth</li>
         * <li><strong>PayByBandwidth_monthavg</strong>: pay by monthly average bandwidth</li>
         * <li><strong>PayByBandwidth_month4th</strong>: pay by fourth peak bandwidth per month</li>
         * <li><strong>PayByBandwidth_monthday95avg</strong>: pay by monthly average 95th percentile bandwidth</li>
         * <li><strong>PayByBandwidth_nighthalf95</strong>: pay by 95th percentile bandwidth (50% off during nighttime)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The lock status of DCDN.</p>
         */
        public Builder operationLocks(OperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E20B46E1-9BCD-10E5-AAEF-6D7B737467A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The metering method for requests.</p>
         * 
         * <strong>example:</strong>
         * <p>PayBySecRequest</p>
         */
        public Builder requestType(String requestType) {
            this.requestType = requestType;
            return this;
        }

        /**
         * <p>The service activation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-26T02:52:08Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeDcdnsecServiceResponseBody build() {
            return new DescribeDcdnsecServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnsecServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnsecServiceResponseBody</p>
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
             * <p>The reason why the instance was locked.</p>
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
     * {@link DescribeDcdnsecServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnsecServiceResponseBody</p>
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
             * <p>The reason why the instance was locked.</p>
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
