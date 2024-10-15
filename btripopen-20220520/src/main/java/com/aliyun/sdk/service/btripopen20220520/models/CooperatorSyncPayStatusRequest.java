// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CooperatorSyncPayStatusRequest} extends {@link RequestModel}
 *
 * <p>CooperatorSyncPayStatusRequest</p>
 */
public class CooperatorSyncPayStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cooperator_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cooperatorOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cooperator_pay_no")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cooperatorPayNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pay_status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pay_time")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long payTime;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private CooperatorSyncPayStatusRequest(Builder builder) {
        super(builder);
        this.cooperatorOrderId = builder.cooperatorOrderId;
        this.cooperatorPayNo = builder.cooperatorPayNo;
        this.orderId = builder.orderId;
        this.payStatus = builder.payStatus;
        this.payTime = builder.payTime;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CooperatorSyncPayStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cooperatorOrderId
     */
    public String getCooperatorOrderId() {
        return this.cooperatorOrderId;
    }

    /**
     * @return cooperatorPayNo
     */
    public String getCooperatorPayNo() {
        return this.cooperatorPayNo;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return payStatus
     */
    public String getPayStatus() {
        return this.payStatus;
    }

    /**
     * @return payTime
     */
    public Long getPayTime() {
        return this.payTime;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<CooperatorSyncPayStatusRequest, Builder> {
        private String cooperatorOrderId; 
        private String cooperatorPayNo; 
        private String orderId; 
        private String payStatus; 
        private Long payTime; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CooperatorSyncPayStatusRequest request) {
            super(request);
            this.cooperatorOrderId = request.cooperatorOrderId;
            this.cooperatorPayNo = request.cooperatorPayNo;
            this.orderId = request.orderId;
            this.payStatus = request.payStatus;
            this.payTime = request.payTime;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder cooperatorOrderId(String cooperatorOrderId) {
            this.putBodyParameter("cooperator_order_id", cooperatorOrderId);
            this.cooperatorOrderId = cooperatorOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder cooperatorPayNo(String cooperatorPayNo) {
            this.putBodyParameter("cooperator_pay_no", cooperatorPayNo);
            this.cooperatorPayNo = cooperatorPayNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1017018197205925373</p>
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
         * <p>SUCCESS</p>
         */
        public Builder payStatus(String payStatus) {
            this.putBodyParameter("pay_status", payStatus);
            this.payStatus = payStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1726022215000</p>
         */
        public Builder payTime(Long payTime) {
            this.putBodyParameter("pay_time", payTime);
            this.payTime = payTime;
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
        public CooperatorSyncPayStatusRequest build() {
            return new CooperatorSyncPayStatusRequest(this);
        } 

    } 

}
