// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TrainOrderChangeConfirmRequest} extends {@link RequestModel}
 *
 * <p>TrainOrderChangeConfirmRequest</p>
 */
public class TrainOrderChangeConfirmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("change_apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String changeApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("change_settle_amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long changeSettleAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_change_apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outChangeApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outOrderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainOrderChangeConfirmRequest(Builder builder) {
        super(builder);
        this.changeApplyId = builder.changeApplyId;
        this.changeSettleAmount = builder.changeSettleAmount;
        this.orderId = builder.orderId;
        this.outChangeApplyId = builder.outChangeApplyId;
        this.outOrderId = builder.outOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainOrderChangeConfirmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeApplyId
     */
    public String getChangeApplyId() {
        return this.changeApplyId;
    }

    /**
     * @return changeSettleAmount
     */
    public Long getChangeSettleAmount() {
        return this.changeSettleAmount;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return outChangeApplyId
     */
    public String getOutChangeApplyId() {
        return this.outChangeApplyId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainOrderChangeConfirmRequest, Builder> {
        private String changeApplyId; 
        private Long changeSettleAmount; 
        private String orderId; 
        private String outChangeApplyId; 
        private String outOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainOrderChangeConfirmRequest request) {
            super(request);
            this.changeApplyId = request.changeApplyId;
            this.changeSettleAmount = request.changeSettleAmount;
            this.orderId = request.orderId;
            this.outChangeApplyId = request.outChangeApplyId;
            this.outOrderId = request.outOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder changeApplyId(String changeApplyId) {
            this.putBodyParameter("change_apply_id", changeApplyId);
            this.changeApplyId = changeApplyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder changeSettleAmount(Long changeSettleAmount) {
            this.putBodyParameter("change_settle_amount", changeSettleAmount);
            this.changeSettleAmount = changeSettleAmount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002145190081005400</p>
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder outChangeApplyId(String outChangeApplyId) {
            this.putBodyParameter("out_change_apply_id", outChangeApplyId);
            this.outChangeApplyId = outChangeApplyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TrainOrderChangeConfirmRequest build() {
            return new TrainOrderChangeConfirmRequest(this);
        } 

    } 

}
