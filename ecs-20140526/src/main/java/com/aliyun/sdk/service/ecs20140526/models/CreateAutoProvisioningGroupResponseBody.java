// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAutoProvisioningGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAutoProvisioningGroupResponseBody</p>
 */
public class CreateAutoProvisioningGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupId")
    private String autoProvisioningGroupId;

    @com.aliyun.core.annotation.NameInMap("LaunchResults")
    private LaunchResults launchResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the auto provisioning group.</p>
         * 
         * <strong>example:</strong>
         * <p>apg-sn54avj8htgvtyh8****</p>
         */
        public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }

        /**
         * <p>The instances created by the auto provisioning group. The values of the parameters in this array are returned only when AutoProvisioningGroupType is set to <code>instant</code>.</p>
         */
        public Builder launchResults(LaunchResults launchResults) {
            this.launchResults = launchResults;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>745CEC9F-0DD7-4451-9FE7-8B752F39****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAutoProvisioningGroupResponseBody build() {
            return new CreateAutoProvisioningGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAutoProvisioningGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupResponseBody</p>
     */
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

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
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List<String> instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAutoProvisioningGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupResponseBody</p>
     */
    public static class LaunchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private InstanceIds instanceIds;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The number of created instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The error code returned when the instance cannot be created.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when the instance cannot be created.</p>
             * 
             * <strong>example:</strong>
             * <p>Specific parameter is not valid.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The IDs of created instances.</p>
             */
            public Builder instanceIds(InstanceIds instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The instance type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The bidding policy for the pay-as-you-go instance. Valid values:</p>
             * <ul>
             * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
             * <li>SpotWithPriceLimit: The instance is a preemptible instance for which you specify the maximum hourly price.</li>
             * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The zone ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
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
    /**
     * 
     * {@link CreateAutoProvisioningGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAutoProvisioningGroupResponseBody</p>
     */
    public static class LaunchResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LaunchResult")
        private java.util.List<LaunchResult> launchResult;

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
        public java.util.List<LaunchResult> getLaunchResult() {
            return this.launchResult;
        }

        public static final class Builder {
            private java.util.List<LaunchResult> launchResult; 

            /**
             * LaunchResult.
             */
            public Builder launchResult(java.util.List<LaunchResult> launchResult) {
                this.launchResult = launchResult;
                return this;
            }

            public LaunchResults build() {
                return new LaunchResults(this);
            } 

        } 

    }
}
