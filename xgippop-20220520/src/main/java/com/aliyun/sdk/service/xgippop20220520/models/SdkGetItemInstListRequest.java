// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkGetItemInstListRequest} extends {@link RequestModel}
 *
 * <p>SdkGetItemInstListRequest</p>
 */
public class SdkGetItemInstListRequest extends Request {
    @Query
    @NameInMap("ChannelCode")
    private String channelCode;

    @Query
    @NameInMap("Current")
    @Validation(required = true)
    private Integer current;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ItemCode")
    @Validation(required = true)
    private String itemCode;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("OutBizNo")
    private String outBizNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("UId")
    private Long uId;

    private SdkGetItemInstListRequest(Builder builder) {
        super(builder);
        this.channelCode = builder.channelCode;
        this.current = builder.current;
        this.instanceId = builder.instanceId;
        this.itemCode = builder.itemCode;
        this.mobile = builder.mobile;
        this.outBizNo = builder.outBizNo;
        this.pageSize = builder.pageSize;
        this.uId = builder.uId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdkGetItemInstListRequest create() {
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
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return uId
     */
    public Long getUId() {
        return this.uId;
    }

    public static final class Builder extends Request.Builder<SdkGetItemInstListRequest, Builder> {
        private String channelCode; 
        private Integer current; 
        private String instanceId; 
        private String itemCode; 
        private String mobile; 
        private String outBizNo; 
        private Integer pageSize; 
        private Long uId; 

        private Builder() {
            super();
        } 

        private Builder(SdkGetItemInstListRequest request) {
            super(request);
            this.channelCode = request.channelCode;
            this.current = request.current;
            this.instanceId = request.instanceId;
            this.itemCode = request.itemCode;
            this.mobile = request.mobile;
            this.outBizNo = request.outBizNo;
            this.pageSize = request.pageSize;
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
         * 当前页码，从1开始
         */
        public Builder current(Integer current) {
            this.putQueryParameter("Current", current);
            this.current = current;
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
         * 每页多少条
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public SdkGetItemInstListRequest build() {
            return new SdkGetItemInstListRequest(this);
        } 

    } 

}
