// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GoodsShippingNoticeCreateCmd} extends {@link TeaModel}
 *
 * <p>GoodsShippingNoticeCreateCmd</p>
 */
public class GoodsShippingNoticeCreateCmd extends TeaModel {
    @NameInMap("cpCode")
    @Validation(required = true)
    private String cpCode;

    @NameInMap("disputeId")
    @Validation(required = true)
    private String disputeId;

    @NameInMap("logisticsNo")
    @Validation(required = true)
    private String logisticsNo;

    private GoodsShippingNoticeCreateCmd(Builder builder) {
        this.cpCode = builder.cpCode;
        this.disputeId = builder.disputeId;
        this.logisticsNo = builder.logisticsNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GoodsShippingNoticeCreateCmd create() {
        return builder().build();
    }

    /**
     * @return cpCode
     */
    public String getCpCode() {
        return this.cpCode;
    }

    /**
     * @return disputeId
     */
    public String getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return logisticsNo
     */
    public String getLogisticsNo() {
        return this.logisticsNo;
    }

    public static final class Builder {
        private String cpCode; 
        private String disputeId; 
        private String logisticsNo; 

        /**
         * cpCode.
         */
        public Builder cpCode(String cpCode) {
            this.cpCode = cpCode;
            return this;
        }

        /**
         * disputeId.
         */
        public Builder disputeId(String disputeId) {
            this.disputeId = disputeId;
            return this;
        }

        /**
         * logisticsNo.
         */
        public Builder logisticsNo(String logisticsNo) {
            this.logisticsNo = logisticsNo;
            return this;
        }

        public GoodsShippingNoticeCreateCmd build() {
            return new GoodsShippingNoticeCreateCmd(this);
        } 

    } 

}
