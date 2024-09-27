// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGtmInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstanceStatusResponseBody</p>
 */
public class DescribeGtmInstanceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddrNotAvailableNum")
    private Integer addrNotAvailableNum;

    @com.aliyun.core.annotation.NameInMap("AddrPoolNotAvailableNum")
    private Integer addrPoolNotAvailableNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("StrategyNotAvailableNum")
    private Integer strategyNotAvailableNum;

    @com.aliyun.core.annotation.NameInMap("SwitchToFailoverStrategyNum")
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
         * <p>The number of unavailable addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder addrNotAvailableNum(Integer addrNotAvailableNum) {
            this.addrNotAvailableNum = addrNotAvailableNum;
            return this;
        }

        /**
         * <p>The number of unavailable address pools.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder addrPoolNotAvailableNum(Integer addrPoolNotAvailableNum) {
            this.addrPoolNotAvailableNum = addrPoolNotAvailableNum;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the instance. Valid values:</p>
         * <ul>
         * <li>ALLOW: The operation on the instance is allowed.</li>
         * <li>DENY: The operation on the instance is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALLOW</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The reasons why the instance is in the current state. Valid values:</p>
         * <ul>
         * <li>INSTANCE_OPERATE_BLACK_LIST: The operation on the instance is not allowed.</li>
         * <li>BETA_INSTANCE: The instance is in public preview.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;BETA_INSTANCE&quot;]</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>The number of unavailable access policies.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder strategyNotAvailableNum(Integer strategyNotAvailableNum) {
            this.strategyNotAvailableNum = strategyNotAvailableNum;
            return this;
        }

        /**
         * <p>The number of access policies switched to the secondary address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
