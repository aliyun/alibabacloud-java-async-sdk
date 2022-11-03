// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkChargeFlowRequest} extends {@link RequestModel}
 *
 * <p>SdkChargeFlowRequest</p>
 */
public class SdkChargeFlowRequest extends Request {
    @Query
    @NameInMap("ChannelCode")
    @Validation(required = true)
    private String channelCode;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ItemCode")
    private String itemCode;

    @Query
    @NameInMap("Mobile")
    @Validation(required = true)
    private String mobile;

    @Query
    @NameInMap("OutBizNo")
    @Validation(required = true)
    private String outBizNo;

    @Query
    @NameInMap("UId")
    private Long uId;

    private SdkChargeFlowRequest(Builder builder) {
        super(builder);
        this.channelCode = builder.channelCode;
        this.instanceId = builder.instanceId;
        this.itemCode = builder.itemCode;
        this.mobile = builder.mobile;
        this.outBizNo = builder.outBizNo;
        this.uId = builder.uId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdkChargeFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelCode
     */
    public String getChannelCode() {
        return this.channelCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemCode
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return outBizNo
     */
    public String getOutBizNo() {
        return this.outBizNo;
    }

    /**
     * @return uId
     */
    public Long getUId() {
        return this.uId;
    }

    public static final class Builder extends Request.Builder<SdkChargeFlowRequest, Builder> {
        private String channelCode; 
        private String instanceId; 
        private String itemCode; 
        private String mobile; 
        private String outBizNo; 
        private Long uId; 

        private Builder() {
            super();
        } 

        private Builder(SdkChargeFlowRequest request) {
            super(request);
            this.channelCode = request.channelCode;
            this.instanceId = request.instanceId;
            this.itemCode = request.itemCode;
            this.mobile = request.mobile;
            this.outBizNo = request.outBizNo;
            this.uId = request.uId;
        } 

        /**
         * 渠道code
         */
        public Builder channelCode(String channelCode) {
            this.putQueryParameter("ChannelCode", channelCode);
            this.channelCode = channelCode;
            return this;
        }

        /**
         * 实例编号
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 商品code
         */
        public Builder itemCode(String itemCode) {
            this.putQueryParameter("ItemCode", itemCode);
            this.itemCode = itemCode;
            return this;
        }

        /**
         * 流量充值号码
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * 外部订单编号
         */
        public Builder outBizNo(String outBizNo) {
            this.putQueryParameter("OutBizNo", outBizNo);
            this.outBizNo = outBizNo;
            return this;
        }

        /**
         * UId.
         */
        public Builder uId(Long uId) {
            this.putQueryParameter("UId", uId);
            this.uId = uId;
            return this;
        }

        @Override
        public SdkChargeFlowRequest build() {
            return new SdkChargeFlowRequest(this);
        } 

    } 

}
