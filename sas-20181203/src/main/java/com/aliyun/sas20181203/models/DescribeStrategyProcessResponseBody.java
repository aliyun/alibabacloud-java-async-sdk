// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeStrategyProcessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyProcessResponseBody</p>
 */
public class DescribeStrategyProcessResponseBody extends TeaModel {
    @NameInMap("ExecStatus")
    private Integer execStatus;

    @NameInMap("PassRate")
    private String passRate;

    @NameInMap("ProcessRate")
    private Integer processRate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StrategyId")
    private Long strategyId;


    private DescribeStrategyProcessResponseBody(Builder builder) {
        this.execStatus = builder.execStatus;
        this.passRate = builder.passRate;
        this.processRate = builder.processRate;
        this.requestId = builder.requestId;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStrategyProcessResponseBody create() {
        return builder().build();
    }

    /**
     * @return execStatus
     */
    public Integer getExecStatus() {
        return this.execStatus;
    }

    /**
     * @return passRate
     */
    public String getPassRate() {
        return this.passRate;
    }

    /**
     * @return processRate
     */
    public Integer getProcessRate() {
        return this.processRate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder {
        private Integer execStatus; 
        private String passRate; 
        private Integer processRate; 
        private String requestId; 
        private Long strategyId; 

        /**
         * <p>ExecStatus.</p>
         */
        public Builder execStatus(Integer execStatus) {
            this.execStatus = execStatus;
            return this;
        }

        /**
         * <p>PassRate.</p>
         */
        public Builder passRate(String passRate) {
            this.passRate = passRate;
            return this;
        }

        /**
         * <p>ProcessRate.</p>
         */
        public Builder processRate(Integer processRate) {
            this.processRate = processRate;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>StrategyId.</p>
         */
        public Builder strategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        public DescribeStrategyProcessResponseBody build() {
            return new DescribeStrategyProcessResponseBody(this);
        } 

    } 

}
