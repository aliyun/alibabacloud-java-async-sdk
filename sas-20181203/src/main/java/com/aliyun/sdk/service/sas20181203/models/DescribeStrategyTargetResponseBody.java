// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyTargetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyTargetResponseBody</p>
 */
public class DescribeStrategyTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StrategyTargets")
    private java.util.List < StrategyTargets> strategyTargets;

    private DescribeStrategyTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategyTargets = builder.strategyTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStrategyTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategyTargets
     */
    public java.util.List < StrategyTargets> getStrategyTargets() {
        return this.strategyTargets;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StrategyTargets> strategyTargets; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StrategyTargets.
         */
        public Builder strategyTargets(java.util.List < StrategyTargets> strategyTargets) {
            this.strategyTargets = strategyTargets;
            return this;
        }

        public DescribeStrategyTargetResponseBody build() {
            return new DescribeStrategyTargetResponseBody(this);
        } 

    } 

    public static class StrategyTargets extends TeaModel {
        @NameInMap("BindUuidCount")
        private Integer bindUuidCount;

        @NameInMap("Flag")
        private String flag;

        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        private StrategyTargets(Builder builder) {
            this.bindUuidCount = builder.bindUuidCount;
            this.flag = builder.flag;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StrategyTargets create() {
            return builder().build();
        }

        /**
         * @return bindUuidCount
         */
        public Integer getBindUuidCount() {
            return this.bindUuidCount;
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private Integer bindUuidCount; 
            private String flag; 
            private String target; 
            private String targetType; 

            /**
             * BindUuidCount.
             */
            public Builder bindUuidCount(Integer bindUuidCount) {
                this.bindUuidCount = bindUuidCount;
                return this;
            }

            /**
             * Flag.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public StrategyTargets build() {
                return new StrategyTargets(this);
            } 

        } 

    }
}
