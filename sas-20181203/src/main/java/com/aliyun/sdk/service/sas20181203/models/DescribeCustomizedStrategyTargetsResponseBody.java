// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizedStrategyTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizedStrategyTargetsResponseBody</p>
 */
public class DescribeCustomizedStrategyTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartegyTargets")
    private java.util.List < StartegyTargets> startegyTargets;

    private DescribeCustomizedStrategyTargetsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.startegyTargets = builder.startegyTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizedStrategyTargetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startegyTargets
     */
    public java.util.List < StartegyTargets> getStartegyTargets() {
        return this.startegyTargets;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StartegyTargets> startegyTargets; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the servers to which custom policies are applied.
         */
        public Builder startegyTargets(java.util.List < StartegyTargets> startegyTargets) {
            this.startegyTargets = startegyTargets;
            return this;
        }

        public DescribeCustomizedStrategyTargetsResponseBody build() {
            return new DescribeCustomizedStrategyTargetsResponseBody(this);
        } 

    } 

    public static class StartegyTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private StartegyTargets(Builder builder) {
            this.groupId = builder.groupId;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartegyTargets create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long groupId; 
            private Long strategyId; 
            private String strategyName; 
            private String uuid; 

            /**
             * The ID of the server group.
             * <p>
             * 
             * >  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the baseline check policy.
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * The name of the baseline check policy.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * The UUID of the server.
             * <p>
             * 
             * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public StartegyTargets build() {
                return new StartegyTargets(this);
            } 

        } 

    }
}
