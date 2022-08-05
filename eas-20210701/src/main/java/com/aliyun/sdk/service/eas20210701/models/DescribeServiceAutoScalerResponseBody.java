// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceAutoScalerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceAutoScalerResponseBody</p>
 */
public class DescribeServiceAutoScalerResponseBody extends TeaModel {
    @NameInMap("Behavior")
    private java.util.Map < String, ? > behavior;

    @NameInMap("CurrentValues")
    private java.util.Map < String, ? > currentValues;

    @NameInMap("MaxReplica")
    private Integer maxReplica;

    @NameInMap("MinReplica")
    private Integer minReplica;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("Strategies")
    private java.util.Map < String, ? > strategies;

    private DescribeServiceAutoScalerResponseBody(Builder builder) {
        this.behavior = builder.behavior;
        this.currentValues = builder.currentValues;
        this.maxReplica = builder.maxReplica;
        this.minReplica = builder.minReplica;
        this.requestId = builder.requestId;
        this.serviceName = builder.serviceName;
        this.strategies = builder.strategies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceAutoScalerResponseBody create() {
        return builder().build();
    }

    /**
     * @return behavior
     */
    public java.util.Map < String, ? > getBehavior() {
        return this.behavior;
    }

    /**
     * @return currentValues
     */
    public java.util.Map < String, ? > getCurrentValues() {
        return this.currentValues;
    }

    /**
     * @return maxReplica
     */
    public Integer getMaxReplica() {
        return this.maxReplica;
    }

    /**
     * @return minReplica
     */
    public Integer getMinReplica() {
        return this.minReplica;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return strategies
     */
    public java.util.Map < String, ? > getStrategies() {
        return this.strategies;
    }

    public static final class Builder {
        private java.util.Map < String, ? > behavior; 
        private java.util.Map < String, ? > currentValues; 
        private Integer maxReplica; 
        private Integer minReplica; 
        private String requestId; 
        private String serviceName; 
        private java.util.Map < String, ? > strategies; 

        /**
         * Behavior.
         */
        public Builder behavior(java.util.Map < String, ? > behavior) {
            this.behavior = behavior;
            return this;
        }

        /**
         * CurrentValues.
         */
        public Builder currentValues(java.util.Map < String, ? > currentValues) {
            this.currentValues = currentValues;
            return this;
        }

        /**
         * 服务最大实例数
         */
        public Builder maxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }

        /**
         * 服务最小实例数
         */
        public Builder minReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务名字
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 扩缩控制器控制策略
         */
        public Builder strategies(java.util.Map < String, ? > strategies) {
            this.strategies = strategies;
            return this;
        }

        public DescribeServiceAutoScalerResponseBody build() {
            return new DescribeServiceAutoScalerResponseBody(this);
        } 

    } 

}
