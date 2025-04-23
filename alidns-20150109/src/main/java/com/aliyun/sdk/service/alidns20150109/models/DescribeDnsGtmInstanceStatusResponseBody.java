// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeDnsGtmInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstanceStatusResponseBody</p>
 */
public class DescribeDnsGtmInstanceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddrAvailableNum")
    private Integer addrAvailableNum;

    @com.aliyun.core.annotation.NameInMap("AddrNotAvailableNum")
    private Integer addrNotAvailableNum;

    @com.aliyun.core.annotation.NameInMap("AddrPoolGroupNotAvailableNum")
    private Integer addrPoolGroupNotAvailableNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StrategyNotAvailableNum")
    private Integer strategyNotAvailableNum;

    @com.aliyun.core.annotation.NameInMap("SwitchToFailoverStrategyNum")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDnsGtmInstanceStatusResponseBody model) {
            this.addrAvailableNum = model.addrAvailableNum;
            this.addrNotAvailableNum = model.addrNotAvailableNum;
            this.addrPoolGroupNotAvailableNum = model.addrPoolGroupNotAvailableNum;
            this.requestId = model.requestId;
            this.strategyNotAvailableNum = model.strategyNotAvailableNum;
            this.switchToFailoverStrategyNum = model.switchToFailoverStrategyNum;
        } 

        /**
         * <p>The number of available addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder addrAvailableNum(Integer addrAvailableNum) {
            this.addrAvailableNum = addrAvailableNum;
            return this;
        }

        /**
         * <p>The number of unavailable addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder addrNotAvailableNum(Integer addrNotAvailableNum) {
            this.addrNotAvailableNum = addrNotAvailableNum;
            return this;
        }

        /**
         * <p>The number of unavailable address pool groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder addrPoolGroupNotAvailableNum(Integer addrPoolGroupNotAvailableNum) {
            this.addrPoolGroupNotAvailableNum = addrPoolGroupNotAvailableNum;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of access policies that are unavailable in the current active address pool group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder strategyNotAvailableNum(Integer strategyNotAvailableNum) {
            this.strategyNotAvailableNum = strategyNotAvailableNum;
            return this;
        }

        /**
         * <p>The number of access policies switched to the secondary address pool group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
