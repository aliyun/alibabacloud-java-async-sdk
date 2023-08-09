// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoProvisioningGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAutoProvisioningGroupResponseBody</p>
 */
public class CreateAutoProvisioningGroupResponseBody extends TeaModel {
    @NameInMap("AutoProvisioningGroupId")
    private String autoProvisioningGroupId;

    @NameInMap("LaunchResults")
    private LaunchResults launchResults;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAutoProvisioningGroupResponseBody(Builder builder) {
        this.autoProvisioningGroupId = builder.autoProvisioningGroupId;
        this.launchResults = builder.launchResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoProvisioningGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoProvisioningGroupId
     */
    public String getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    /**
     * @return launchResults
     */
    public LaunchResults getLaunchResults() {
        return this.launchResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String autoProvisioningGroupId; 
        private LaunchResults launchResults; 
        private String requestId; 

        /**
         * The ID of the auto provisioning group.
         */
        public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }

        /**
         * Details about the instances created by the auto provisioning group. The values of the parameters in this array are returned only when the AutoProvisioningGroupType parameter is set to `instant`.
         */
        public Builder launchResults(LaunchResults launchResults) {
            this.launchResults = launchResults;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAutoProvisioningGroupResponseBody build() {
            return new CreateAutoProvisioningGroupResponseBody(this);
        } 

    } 

    public static class InstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        private java.util.List < String > instanceId;

        private InstanceIds(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List < String > getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List < String > instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List < String > instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
    public static class LaunchResult extends TeaModel {
        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("InstanceIds")
        private InstanceIds instanceIds;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("ZoneId")
        private String zoneId;

        private LaunchResult(Builder builder) {
            this.amount = builder.amount;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.instanceIds = builder.instanceIds;
            this.instanceType = builder.instanceType;
            this.spotStrategy = builder.spotStrategy;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchResult create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return instanceIds
         */
        public InstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer amount; 
            private String errorCode; 
            private String errorMsg; 
            private InstanceIds instanceIds; 
            private String instanceType; 
            private String spotStrategy; 
            private String zoneId; 

            /**
             * The number of instances. Valid values: 1 to 100000.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * The error code returned when the instance cannot be created.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned when the instance cannot be created.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The IDs of created instances.
             */
            public Builder instanceIds(InstanceIds instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The bidding policy for the pay-as-you-go instance. Valid values:
             * <p>
             * 
             * *   NoSpot: The instance is created as a regular pay-as-you-go instance.
             * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The zone ID of the instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public LaunchResult build() {
                return new LaunchResult(this);
            } 

        } 

    }
    public static class LaunchResults extends TeaModel {
        @NameInMap("LaunchResult")
        private java.util.List < LaunchResult> launchResult;

        private LaunchResults(Builder builder) {
            this.launchResult = builder.launchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchResults create() {
            return builder().build();
        }

        /**
         * @return launchResult
         */
        public java.util.List < LaunchResult> getLaunchResult() {
            return this.launchResult;
        }

        public static final class Builder {
            private java.util.List < LaunchResult> launchResult; 

            /**
             * LaunchResult.
             */
            public Builder launchResult(java.util.List < LaunchResult> launchResult) {
                this.launchResult = launchResult;
                return this;
            }

            public LaunchResults build() {
                return new LaunchResults(this);
            } 

        } 

    }
}
