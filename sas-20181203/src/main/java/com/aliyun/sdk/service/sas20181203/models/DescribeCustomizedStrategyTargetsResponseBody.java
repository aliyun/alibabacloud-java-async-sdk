// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCustomizedStrategyTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizedStrategyTargetsResponseBody</p>
 */
public class DescribeCustomizedStrategyTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartegyTargets")
    private java.util.List<StartegyTargets> startegyTargets;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<StartegyTargets> getStartegyTargets() {
        return this.startegyTargets;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StartegyTargets> startegyTargets; 

        private Builder() {
        } 

        private Builder(DescribeCustomizedStrategyTargetsResponseBody model) {
            this.requestId = model.requestId;
            this.startegyTargets = model.startegyTargets;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the servers to which custom policies are applied.</p>
         */
        public Builder startegyTargets(java.util.List<StartegyTargets> startegyTargets) {
            this.startegyTargets = startegyTargets;
            return this;
        }

        public DescribeCustomizedStrategyTargetsResponseBody build() {
            return new DescribeCustomizedStrategyTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomizedStrategyTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomizedStrategyTargetsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StartegyTargets model) {
                this.groupId = model.groupId;
                this.strategyId = model.strategyId;
                this.strategyName = model.strategyName;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The ID of the server group.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of server groups.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>14590457</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1884</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The name of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>win</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2701ad2e-0e8f-428c-8812-ebb2686e****</p>
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
