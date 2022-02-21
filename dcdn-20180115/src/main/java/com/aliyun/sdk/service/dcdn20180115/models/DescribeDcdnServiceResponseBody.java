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
         * ChangingAffectTime.
         */
        public Builder changingAffectTime(String changingAffectTime) {
            this.changingAffectTime = changingAffectTime;
            return this;
        }

        /**
         * ChangingChargeType.
         */
        public Builder changingChargeType(String changingChargeType) {
            this.changingChargeType = changingChargeType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * OpeningTime.
         */
        public Builder openingTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }

        /**
         * OperationLocks.
         */
        public Builder operationLocks(OperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WebsocketChangingTime.
         */
        public Builder websocketChangingTime(String websocketChangingTime) {
            this.websocketChangingTime = websocketChangingTime;
            return this;
        }

        /**
         * WebsocketChangingType.
         */
        public Builder websocketChangingType(String websocketChangingType) {
            this.websocketChangingType = websocketChangingType;
            return this;
        }

        /**
         * WebsocketType.
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
             * LockReason.
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
             * LockReason.
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
