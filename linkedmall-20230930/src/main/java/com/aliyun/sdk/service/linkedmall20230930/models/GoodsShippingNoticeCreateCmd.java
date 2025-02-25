// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link GoodsShippingNoticeCreateCmd} extends {@link TeaModel}
 *
 * <p>GoodsShippingNoticeCreateCmd</p>
 */
public class GoodsShippingNoticeCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cpCode;

    @com.aliyun.core.annotation.NameInMap("disputeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disputeId;

    @com.aliyun.core.annotation.NameInMap("logisticsNo")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OTHER-其他 POST-中国邮政 EMS-EMS EYB-EMS快递包裹 POSTB-邮政快递包裹 STO-申通快递 YTO-圆通快递 YUNDA-韵达快递 ZJS-宅急送 FEDEX-联邦快递 DBKD-德邦物流 SHQ-华强物流 TN-特能 TAOBAO-淘宝物流 ZTO-中通快递 HTKY-百世快递 TTKDEX-天天快递 SF-顺丰速运 ZTKY-中铁物流 QFKD-全峰快递 JT-极兔物流</p>
         */
        public Builder cpCode(String cpCode) {
            this.cpCode = cpCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6693****4352</p>
         */
        public Builder disputeId(String disputeId) {
            this.disputeId = disputeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SF145****4351</p>
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
