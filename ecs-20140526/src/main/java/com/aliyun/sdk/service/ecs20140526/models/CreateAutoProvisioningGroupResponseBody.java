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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("LaunchResults")
    private LaunchResults launchResults;

    private CreateAutoProvisioningGroupResponseBody(Builder builder) {
        this.autoProvisioningGroupId = builder.autoProvisioningGroupId;
        this.requestId = builder.requestId;
        this.launchResults = builder.launchResults;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return launchResults
     */
    public LaunchResults getLaunchResults() {
        return this.launchResults;
    }

    public static final class Builder {
        private String autoProvisioningGroupId; 
        private String requestId; 
        private LaunchResults launchResults; 

        /**
         * The ID of the auto provisioning group.
         */
        public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
            this.autoProvisioningGroupId = autoProvisioningGroupId;
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
         * A collection of instances created by the auto provisioning group. This set value is returned only when the delivery type of the auto provisioning Group is one-time synchronous delivery ("instant").
         */
        public Builder launchResults(LaunchResults launchResults) {
            this.launchResults = launchResults;
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
        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("InstanceIds")
        private InstanceIds instanceIds;

        private LaunchResult(Builder builder) {
            this.zoneId = builder.zoneId;
            this.errorMsg = builder.errorMsg;
            this.instanceType = builder.instanceType;
            this.errorCode = builder.errorCode;
            this.spotStrategy = builder.spotStrategy;
            this.instanceIds = builder.instanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchResult create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return instanceIds
         */
        public InstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        public static final class Builder {
            private String zoneId; 
            private String errorMsg; 
            private String instanceType; 
            private String errorCode; 
            private String spotStrategy; 
            private InstanceIds instanceIds; 

            /**
             * The ID of the zone to which the instance belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The error message returned when the instance fails to be created.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
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
             * The error code returned when the instance fails to be created.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The preemptible policy of the pay-as-you-go instance. Possible values:
             * <p>
             * -NoSpot: a pay-as-you-go instance.
             * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
             * -SpotAsPriceGo: The system automatically bids based on the actual market price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * InstanceIds.
             */
            public Builder instanceIds(InstanceIds instanceIds) {
                this.instanceIds = instanceIds;
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
