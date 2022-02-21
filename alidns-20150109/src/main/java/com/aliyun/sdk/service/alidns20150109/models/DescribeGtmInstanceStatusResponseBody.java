// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstanceStatusResponseBody</p>
 */
public class DescribeGtmInstanceStatusResponseBody extends TeaModel {
    @NameInMap("AddrNotAvailableNum")
    private Integer addrNotAvailableNum;

    @NameInMap("AddrPoolNotAvailableNum")
    private Integer addrPoolNotAvailableNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("StatusReason")
    private String statusReason;

    @NameInMap("StrategyNotAvailableNum")
    private Integer strategyNotAvailableNum;

    @NameInMap("SwitchToFailoverStrategyNum")
    private Integer switchToFailoverStrategyNum;

    private DescribeGtmInstanceStatusResponseBody(Builder builder) {
        this.addrNotAvailableNum = builder.addrNotAvailableNum;
        this.addrPoolNotAvailableNum = builder.addrPoolNotAvailableNum;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.strategyNotAvailableNum = builder.strategyNotAvailableNum;
        this.switchToFailoverStrategyNum = builder.switchToFailoverStrategyNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return addrNotAvailableNum
     */
    public Integer getAddrNotAvailableNum() {
        return this.addrNotAvailableNum;
    }

    /**
     * @return addrPoolNotAvailableNum
     */
    public Integer getAddrPoolNotAvailableNum() {
        return this.addrPoolNotAvailableNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return strategyNotAvailableNum
     */
    public Integer getStrategyNotAvailableNum() {
        return this.strategyNotAvailableNum;
    }

    /**
     * @return switchToFailoverStrategyNum
     */
    public Integer getSwitchToFailoverStrategyNum() {
        return this.switchToFailoverStrategyNum;
    }

    public static final class Builder {
        private Integer addrNotAvailableNum; 
        private Integer addrPoolNotAvailableNum; 
        private String requestId; 
        private String status; 
        private String statusReason; 
        private Integer strategyNotAvailableNum; 
        private Integer switchToFailoverStrategyNum; 

        /**
         * AddrNotAvailableNum.
         */
        public Builder addrNotAvailableNum(Integer addrNotAvailableNum) {
            this.addrNotAvailableNum = addrNotAvailableNum;
            return this;
        }

        /**
         * AddrPoolNotAvailableNum.
         */
        public Builder addrPoolNotAvailableNum(Integer addrPoolNotAvailableNum) {
            this.addrPoolNotAvailableNum = addrPoolNotAvailableNum;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StatusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * StrategyNotAvailableNum.
         */
        public Builder strategyNotAvailableNum(Integer strategyNotAvailableNum) {
            this.strategyNotAvailableNum = strategyNotAvailableNum;
            return this;
        }

        /**
         * SwitchToFailoverStrategyNum.
         */
        public Builder switchToFailoverStrategyNum(Integer switchToFailoverStrategyNum) {
            this.switchToFailoverStrategyNum = switchToFailoverStrategyNum;
            return this;
        }

        public DescribeGtmInstanceStatusResponseBody build() {
            return new DescribeGtmInstanceStatusResponseBody(this);
        } 

    } 

}
