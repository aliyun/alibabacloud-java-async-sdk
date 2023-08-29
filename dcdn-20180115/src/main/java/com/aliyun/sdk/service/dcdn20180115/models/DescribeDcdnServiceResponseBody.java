// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnServiceResponseBody</p>
 */
public class DescribeDcdnServiceResponseBody extends TeaModel {
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

    @NameInMap("WebsocketChangingTime")
    private String websocketChangingTime;

    @NameInMap("WebsocketChangingType")
    private String websocketChangingType;

    @NameInMap("WebsocketType")
    private String websocketType;

    private DescribeDcdnServiceResponseBody(Builder builder) {
        this.changingAffectTime = builder.changingAffectTime;
        this.changingChargeType = builder.changingChargeType;
        this.instanceId = builder.instanceId;
        this.internetChargeType = builder.internetChargeType;
        this.openingTime = builder.openingTime;
        this.operationLocks = builder.operationLocks;
        this.requestId = builder.requestId;
        this.websocketChangingTime = builder.websocketChangingTime;
        this.websocketChangingType = builder.websocketChangingType;
        this.websocketType = builder.websocketType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnServiceResponseBody create() {
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

    /**
     * @return websocketChangingTime
     */
    public String getWebsocketChangingTime() {
        return this.websocketChangingTime;
    }

    /**
     * @return websocketChangingType
     */
    public String getWebsocketChangingType() {
        return this.websocketChangingType;
    }

    /**
     * @return websocketType
     */
    public String getWebsocketType() {
        return this.websocketType;
    }

    public static final class Builder {
        private String changingAffectTime; 
        private String changingChargeType; 
        private String instanceId; 
        private String internetChargeType; 
        private String openingTime; 
        private OperationLocks operationLocks; 
        private String requestId; 
        private String websocketChangingTime; 
        private String websocketChangingType; 
        private String websocketType; 

        /**
         * The time when the renewed secure DCDN takes effect. The time is displayed in UTC.
         */
        public Builder changingAffectTime(String changingAffectTime) {
            this.changingAffectTime = changingAffectTime;
            return this;
        }

        /**
         * The new metering method for the renewed secure DCDN. Valid values:
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
         * The time when the DCDN service was activated. The time follows the ISO 8601 standard.
         */
        public Builder openingTime(String openingTime) {
            this.openingTime = openingTime;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the changes of the WebSocket configuration take effect. The value is the same as that of the ChangingAffectTime parameter. This parameter can be displayed in the console only if the specified time is later than the current time.
         */
        public Builder websocketChangingTime(String websocketChangingTime) {
            this.websocketChangingTime = websocketChangingTime;
            return this;
        }

        /**
         * The next effective billing method of WebSocket. Valid values: **websockettraffic** and **websocketbps**. A value of websockettraffic indicates that you are billed based on the traffic volume. A value of websocketbps indicates that you are billed based on the bandwidth.
         */
        public Builder websocketChangingType(String websocketChangingType) {
            this.websocketChangingType = websocketChangingType;
            return this;
        }

        /**
         * The current billing method of WebSocket. Valid values: **websockettraffic** and **websocketbps**. A value of websockettraffic indicates that you are billed based on the traffic volume. A value of websocketbps indicates that you are billed based on the bandwidth.
         */
        public Builder websocketType(String websocketType) {
            this.websocketType = websocketType;
            return this;
        }

        public DescribeDcdnServiceResponseBody build() {
            return new DescribeDcdnServiceResponseBody(this);
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
             * The reason why secure DCDN was locked. For example, a value of financial indicates that an overdue payment exists.
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
             * The reason why secure DCDN was locked. For example, a value of financial indicates that an overdue payment exists.
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
