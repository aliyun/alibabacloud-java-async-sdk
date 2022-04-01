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
         * AutoProvisioningGroupId.
         */
        public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }

        /**
         * LaunchResults.
         */
        public Builder launchResults(LaunchResults launchResults) {
            this.launchResults = launchResults;
            return this;
        }

        /**
         * RequestId.
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
            private String errorCode; 
            private String errorMsg; 
            private InstanceIds instanceIds; 
            private String instanceType; 
            private String spotStrategy; 
            private String zoneId; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * InstanceIds.
             */
            public Builder instanceIds(InstanceIds instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * ZoneId.
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
