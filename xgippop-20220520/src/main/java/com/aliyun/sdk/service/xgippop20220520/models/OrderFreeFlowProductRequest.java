// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderFreeFlowProductRequest} extends {@link RequestModel}
 *
 * <p>OrderFreeFlowProductRequest</p>
 */
public class OrderFreeFlowProductRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("CustomerFlowRequestId")
    @Validation(required = true)
    private String customerFlowRequestId;

    @Query
    @NameInMap("FlowProductId")
    @Validation(required = true)
    private String flowProductId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lasting")
    private String lasting;

    @Query
    @NameInMap("MobileNumber")
    @Validation(required = true)
    private String mobileNumber;

    @Query
    @NameInMap("NotifyUrl")
    private String notifyUrl;

    @Query
    @NameInMap("Operator")
    @Validation(required = true)
    private String operator;

    @Query
    @NameInMap("PurchaseOrderId")
    private String purchaseOrderId;

    private OrderFreeFlowProductRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.channelId = builder.channelId;
        this.customerFlowRequestId = builder.customerFlowRequestId;
        this.flowProductId = builder.flowProductId;
        this.instanceId = builder.instanceId;
        this.lasting = builder.lasting;
        this.mobileNumber = builder.mobileNumber;
        this.notifyUrl = builder.notifyUrl;
        this.operator = builder.operator;
        this.purchaseOrderId = builder.purchaseOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderFreeFlowProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return customerFlowRequestId
     */
    public String getCustomerFlowRequestId() {
        return this.customerFlowRequestId;
    }

    /**
     * @return flowProductId
     */
    public String getFlowProductId() {
        return this.flowProductId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lasting
     */
    public String getLasting() {
        return this.lasting;
    }

    /**
     * @return mobileNumber
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return purchaseOrderId
     */
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public static final class Builder extends Request.Builder<OrderFreeFlowProductRequest, Builder> {
        private Long aliUid; 
        private String channelId; 
        private String customerFlowRequestId; 
        private String flowProductId; 
        private String instanceId; 
        private String lasting; 
        private String mobileNumber; 
        private String notifyUrl; 
        private String operator; 
        private String purchaseOrderId; 

        private Builder() {
            super();
        } 

        private Builder(OrderFreeFlowProductRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.channelId = request.channelId;
            this.customerFlowRequestId = request.customerFlowRequestId;
            this.flowProductId = request.flowProductId;
            this.instanceId = request.instanceId;
            this.lasting = request.lasting;
            this.mobileNumber = request.mobileNumber;
            this.notifyUrl = request.notifyUrl;
            this.operator = request.operator;
            this.purchaseOrderId = request.purchaseOrderId;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * 渠道ID
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * 客户侧生成的QoS请求ID，需要保证请求幂等性，确保不同请求间该参数值唯一
         */
        public Builder customerFlowRequestId(String customerFlowRequestId) {
            this.putQueryParameter("CustomerFlowRequestId", customerFlowRequestId);
            this.customerFlowRequestId = customerFlowRequestId;
            return this;
        }

        /**
         * 免流产品ID
         */
        public Builder flowProductId(String flowProductId) {
            this.putQueryParameter("FlowProductId", flowProductId);
            this.flowProductId = flowProductId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 是否包月，true为包月，false为不包月
         */
        public Builder lasting(String lasting) {
            this.putQueryParameter("Lasting", lasting);
            this.lasting = lasting;
            return this;
        }

        /**
         * C端手机号
         */
        public Builder mobileNumber(String mobileNumber) {
            this.putQueryParameter("MobileNumber", mobileNumber);
            this.mobileNumber = mobileNumber;
            return this;
        }

        /**
         * 客户提供的回调通知接口url
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * 取值包括cm（中国移动）/ct（中国电信）/cu（中国联通）
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * 支付订单ID
         */
        public Builder purchaseOrderId(String purchaseOrderId) {
            this.putQueryParameter("PurchaseOrderId", purchaseOrderId);
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }

        @Override
        public OrderFreeFlowProductRequest build() {
            return new OrderFreeFlowProductRequest(this);
        } 

    } 

}
