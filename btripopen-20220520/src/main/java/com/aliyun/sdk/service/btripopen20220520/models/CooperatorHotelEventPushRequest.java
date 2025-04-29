// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link CooperatorHotelEventPushRequest} extends {@link RequestModel}
 *
 * <p>CooperatorHotelEventPushRequest</p>
 */
public class CooperatorHotelEventPushRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("change_order_status")
    private Integer changeOrderStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("change_order_status_desc")
    private String changeOrderStatusDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cooperator_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cooperatorOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("event")
    @com.aliyun.core.annotation.Validation(required = true)
    private String event;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("event_desc")
    private String eventDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("event_time")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private CooperatorHotelEventPushRequest(Builder builder) {
        super(builder);
        this.changeOrderStatus = builder.changeOrderStatus;
        this.changeOrderStatusDesc = builder.changeOrderStatusDesc;
        this.cooperatorOrderId = builder.cooperatorOrderId;
        this.event = builder.event;
        this.eventDesc = builder.eventDesc;
        this.eventTime = builder.eventTime;
        this.orderId = builder.orderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CooperatorHotelEventPushRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeOrderStatus
     */
    public Integer getChangeOrderStatus() {
        return this.changeOrderStatus;
    }

    /**
     * @return changeOrderStatusDesc
     */
    public String getChangeOrderStatusDesc() {
        return this.changeOrderStatusDesc;
    }

    /**
     * @return cooperatorOrderId
     */
    public String getCooperatorOrderId() {
        return this.cooperatorOrderId;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return eventDesc
     */
    public String getEventDesc() {
        return this.eventDesc;
    }

    /**
     * @return eventTime
     */
    public String getEventTime() {
        return this.eventTime;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<CooperatorHotelEventPushRequest, Builder> {
        private Integer changeOrderStatus; 
        private String changeOrderStatusDesc; 
        private String cooperatorOrderId; 
        private String event; 
        private String eventDesc; 
        private String eventTime; 
        private String orderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CooperatorHotelEventPushRequest request) {
            super(request);
            this.changeOrderStatus = request.changeOrderStatus;
            this.changeOrderStatusDesc = request.changeOrderStatusDesc;
            this.cooperatorOrderId = request.cooperatorOrderId;
            this.event = request.event;
            this.eventDesc = request.eventDesc;
            this.eventTime = request.eventTime;
            this.orderId = request.orderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * change_order_status.
         */
        public Builder changeOrderStatus(Integer changeOrderStatus) {
            this.putBodyParameter("change_order_status", changeOrderStatus);
            this.changeOrderStatus = changeOrderStatus;
            return this;
        }

        /**
         * change_order_status_desc.
         */
        public Builder changeOrderStatusDesc(String changeOrderStatusDesc) {
            this.putBodyParameter("change_order_status_desc", changeOrderStatusDesc);
            this.changeOrderStatusDesc = changeOrderStatusDesc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>coop_123456</p>
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
         * <p>USER_LEAVE</p>
         */
        public Builder event(String event) {
            this.putBodyParameter("event", event);
            this.event = event;
            return this;
        }

        /**
         * event_desc.
         */
        public Builder eventDesc(String eventDesc) {
            this.putBodyParameter("event_desc", eventDesc);
            this.eventDesc = eventDesc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>204-09-01 10:55:20</p>
         */
        public Builder eventTime(String eventTime) {
            this.putBodyParameter("event_time", eventTime);
            this.eventTime = eventTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
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
        public CooperatorHotelEventPushRequest build() {
            return new CooperatorHotelEventPushRequest(this);
        } 

    } 

}
