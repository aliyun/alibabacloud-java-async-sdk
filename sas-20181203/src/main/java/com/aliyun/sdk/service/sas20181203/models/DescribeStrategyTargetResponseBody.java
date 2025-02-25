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
 * {@link DescribeStrategyTargetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyTargetResponseBody</p>
 */
public class DescribeStrategyTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StrategyTargets")
    private java.util.List<StrategyTargets> strategyTargets;

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
    public java.util.List<StrategyTargets> getStrategyTargets() {
        return this.strategyTargets;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StrategyTargets> strategyTargets; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>001BAB34-D70A-54B0-B1D7-91B76DCDD8E8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the assets to which the baseline check policy is applied.</p>
         */
        public Builder strategyTargets(java.util.List<StrategyTargets> strategyTargets) {
            this.strategyTargets = strategyTargets;
            return this;
        }

        public DescribeStrategyTargetResponseBody build() {
            return new DescribeStrategyTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStrategyTargetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyTargetResponseBody</p>
     */
    public static class StrategyTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindUuidCount")
        private Integer bindUuidCount;

        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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
             * <p>The number of the assets that belong to the asset group.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder bindUuidCount(Integer bindUuidCount) {
                this.bindUuidCount = bindUuidCount;
                return this;
            }

            /**
             * <p>Indicates whether the baseline check policy is applied to the asset group. Valid values:</p>
             * <ul>
             * <li><strong>add</strong>: The baseline check policy is applied to the asset group.</li>
             * <li><strong>del</strong>: the baseline check policy is not applied to the asset group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The ID of the asset group to which the assets belong or the UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>9165712</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The method that is used to add the assets to the baseline check policy. Valid values:</p>
             * <ul>
             * <li><strong>groupId</strong>: the ID of the asset group</li>
             * <li><strong>uuid</strong>: the UUID of the asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>groupId</p>
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
