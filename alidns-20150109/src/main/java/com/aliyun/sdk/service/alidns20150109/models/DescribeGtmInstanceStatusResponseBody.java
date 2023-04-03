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
         * The number of unavailable addresses.
         */
        public Builder addrNotAvailableNum(Integer addrNotAvailableNum) {
            this.addrNotAvailableNum = addrNotAvailableNum;
            return this;
        }

        /**
         * The number of unavailable address pools.
         */
        public Builder addrPoolNotAvailableNum(Integer addrPoolNotAvailableNum) {
            this.addrPoolNotAvailableNum = addrPoolNotAvailableNum;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the instance. Valid values:
         * <p>
         * 
         * *   ALLOW: Operations on the instance are allowed.
         * *   DENY: Operations on the instance are not allowed.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * List of reasons for an instance status. Valid values:
         * <p>
         * 
         * *   INSTANCE_OPERATE_BLACK_LIST: The instance is in the blacklist.
         * *   BETA_INSTANCE: The instance is in public preview.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * The number of access policies that are unavailable in the active address pool.
         */
        public Builder strategyNotAvailableNum(Integer strategyNotAvailableNum) {
            this.strategyNotAvailableNum = strategyNotAvailableNum;
            return this;
        }

        /**
         * The number of access policies that fail over to the secondary address pool.
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
