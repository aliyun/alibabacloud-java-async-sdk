// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

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
 * {@link ThirdImmediateMsgPushRequest} extends {@link RequestModel}
 *
 * <p>ThirdImmediateMsgPushRequest</p>
 */
public class ThirdImmediateMsgPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeDetail")
    private String changeDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PsgIds")
    private String psgIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficChangeType")
    private String trafficChangeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficChangeTypeDesc")
    private String trafficChangeTypeDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficJourneyIds")
    private String trafficJourneyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficSubOrderIds")
    private String trafficSubOrderIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private ThirdImmediateMsgPushRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.changeDetail = builder.changeDetail;
        this.orderId = builder.orderId;
        this.psgIds = builder.psgIds;
        this.trafficChangeType = builder.trafficChangeType;
        this.trafficChangeTypeDesc = builder.trafficChangeTypeDesc;
        this.trafficJourneyIds = builder.trafficJourneyIds;
        this.trafficSubOrderIds = builder.trafficSubOrderIds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ThirdImmediateMsgPushRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return changeDetail
     */
    public String getChangeDetail() {
        return this.changeDetail;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return psgIds
     */
    public String getPsgIds() {
        return this.psgIds;
    }

    /**
     * @return trafficChangeType
     */
    public String getTrafficChangeType() {
        return this.trafficChangeType;
    }

    /**
     * @return trafficChangeTypeDesc
     */
    public String getTrafficChangeTypeDesc() {
        return this.trafficChangeTypeDesc;
    }

    /**
     * @return trafficJourneyIds
     */
    public String getTrafficJourneyIds() {
        return this.trafficJourneyIds;
    }

    /**
     * @return trafficSubOrderIds
     */
    public String getTrafficSubOrderIds() {
        return this.trafficSubOrderIds;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ThirdImmediateMsgPushRequest, Builder> {
        private String bizType; 
        private String changeDetail; 
        private String orderId; 
        private String psgIds; 
        private String trafficChangeType; 
        private String trafficChangeTypeDesc; 
        private String trafficJourneyIds; 
        private String trafficSubOrderIds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ThirdImmediateMsgPushRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.changeDetail = request.changeDetail;
            this.orderId = request.orderId;
            this.psgIds = request.psgIds;
            this.trafficChangeType = request.trafficChangeType;
            this.trafficChangeTypeDesc = request.trafficChangeTypeDesc;
            this.trafficJourneyIds = request.trafficJourneyIds;
            this.trafficSubOrderIds = request.trafficSubOrderIds;
            this.userId = request.userId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ChangeDetail.
         */
        public Builder changeDetail(String changeDetail) {
            this.putQueryParameter("ChangeDetail", changeDetail);
            this.changeDetail = changeDetail;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * PsgIds.
         */
        public Builder psgIds(String psgIds) {
            this.putQueryParameter("PsgIds", psgIds);
            this.psgIds = psgIds;
            return this;
        }

        /**
         * TrafficChangeType.
         */
        public Builder trafficChangeType(String trafficChangeType) {
            this.putQueryParameter("TrafficChangeType", trafficChangeType);
            this.trafficChangeType = trafficChangeType;
            return this;
        }

        /**
         * TrafficChangeTypeDesc.
         */
        public Builder trafficChangeTypeDesc(String trafficChangeTypeDesc) {
            this.putQueryParameter("TrafficChangeTypeDesc", trafficChangeTypeDesc);
            this.trafficChangeTypeDesc = trafficChangeTypeDesc;
            return this;
        }

        /**
         * TrafficJourneyIds.
         */
        public Builder trafficJourneyIds(String trafficJourneyIds) {
            this.putQueryParameter("TrafficJourneyIds", trafficJourneyIds);
            this.trafficJourneyIds = trafficJourneyIds;
            return this;
        }

        /**
         * TrafficSubOrderIds.
         */
        public Builder trafficSubOrderIds(String trafficSubOrderIds) {
            this.putQueryParameter("TrafficSubOrderIds", trafficSubOrderIds);
            this.trafficSubOrderIds = trafficSubOrderIds;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ThirdImmediateMsgPushRequest build() {
            return new ThirdImmediateMsgPushRequest(this);
        } 

    } 

}
