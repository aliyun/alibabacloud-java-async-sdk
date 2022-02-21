// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstanceStatusResponseBody</p>
 */
public class DescribeDnsGtmInstanceStatusResponseBody extends TeaModel {
    @NameInMap("AddrAvailableNum")
    private Integer addrAvailableNum;

    @NameInMap("AddrNotAvailableNum")
    private Integer addrNotAvailableNum;

    @NameInMap("AddrPoolGroupNotAvailableNum")
    private Integer addrPoolGroupNotAvailableNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StrategyNotAvailableNum")
    private Integer strategyNotAvailableNum;

    @NameInMap("SwitchToFailoverStrategyNum")
    private Integer switchToFailoverStrategyNum;

    private DescribeDnsGtmInstanceStatusResponseBody(Builder builder) {
        this.addrAvailableNum = builder.addrAvailableNum;
        this.addrNotAvailableNum = builder.addrNotAvailableNum;
        this.addrPoolGroupNotAvailableNum = builder.addrPoolGroupNotAvailableNum;
        this.requestId = builder.requestId;
        this.strategyNotAvailableNum = builder.strategyNotAvailableNum;
        this.switchToFailoverStrategyNum = builder.switchToFailoverStrategyNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return addrAvailableNum
     */
    public Integer getAddrAvailableNum() {
        return this.addrAvailableNum;
    }

    /**
     * @return addrNotAvailableNum
     */
    public Integer getAddrNotAvailableNum() {
        return this.addrNotAvailableNum;
    }

    /**
     * @return addrPoolGroupNotAvailableNum
     */
    public Integer getAddrPoolGroupNotAvailableNum() {
        return this.addrPoolGroupNotAvailableNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Integer addrAvailableNum; 
        private Integer addrNotAvailableNum; 
        private Integer addrPoolGroupNotAvailableNum; 
        private String requestId; 
        private Integer strategyNotAvailableNum; 
        private Integer switchToFailoverStrategyNum; 

        /**
         * AddrAvailableNum.
         */
        public Builder addrAvailableNum(Integer addrAvailableNum) {
            this.addrAvailableNum = addrAvailableNum;
            return this;
        }

        /**
         * AddrNotAvailableNum.
         */
        public Builder addrNotAvailableNum(Integer addrNotAvailableNum) {
            this.addrNotAvailableNum = addrNotAvailableNum;
            return this;
        }

        /**
         * AddrPoolGroupNotAvailableNum.
         */
        public Builder addrPoolGroupNotAvailableNum(Integer addrPoolGroupNotAvailableNum) {
            this.addrPoolGroupNotAvailableNum = addrPoolGroupNotAvailableNum;
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

        public DescribeDnsGtmInstanceStatusResponseBody build() {
            return new DescribeDnsGtmInstanceStatusResponseBody(this);
        } 

    } 

}
