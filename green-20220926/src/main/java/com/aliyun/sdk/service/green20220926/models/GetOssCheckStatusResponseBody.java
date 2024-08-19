// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssCheckStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssCheckStatusResponseBody</p>
 */
public class GetOssCheckStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bid")
    private String bid;

    @com.aliyun.core.annotation.NameInMap("Buy")
    private Boolean buy;

    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("Indebt")
    private Boolean indebt;

    @com.aliyun.core.annotation.NameInMap("RamStatus")
    private String ramStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsStatus")
    private String slsStatus;

    private GetOssCheckStatusResponseBody(Builder builder) {
        this.bid = builder.bid;
        this.buy = builder.buy;
        this.commodityCode = builder.commodityCode;
        this.indebt = builder.indebt;
        this.ramStatus = builder.ramStatus;
        this.requestId = builder.requestId;
        this.slsStatus = builder.slsStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssCheckStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return buy
     */
    public Boolean getBuy() {
        return this.buy;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return indebt
     */
    public Boolean getIndebt() {
        return this.indebt;
    }

    /**
     * @return ramStatus
     */
    public String getRamStatus() {
        return this.ramStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsStatus
     */
    public String getSlsStatus() {
        return this.slsStatus;
    }

    public static final class Builder {
        private String bid; 
        private Boolean buy; 
        private String commodityCode; 
        private Boolean indebt; 
        private String ramStatus; 
        private String requestId; 
        private String slsStatus; 

        /**
         * Bid。
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * Buy.
         */
        public Builder buy(Boolean buy) {
            this.buy = buy;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * Indebt.
         */
        public Builder indebt(Boolean indebt) {
            this.indebt = indebt;
            return this;
        }

        /**
         * RamStatus.
         */
        public Builder ramStatus(String ramStatus) {
            this.ramStatus = ramStatus;
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
         * SlsStatus.
         */
        public Builder slsStatus(String slsStatus) {
            this.slsStatus = slsStatus;
            return this;
        }

        public GetOssCheckStatusResponseBody build() {
            return new GetOssCheckStatusResponseBody(this);
        } 

    } 

}
