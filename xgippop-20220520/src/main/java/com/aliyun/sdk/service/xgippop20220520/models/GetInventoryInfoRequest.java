// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInventoryInfoRequest} extends {@link RequestModel}
 *
 * <p>GetInventoryInfoRequest</p>
 */
public class GetInventoryInfoRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ItemCode")
    private String itemCode;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("UId")
    private Long uId;

    private GetInventoryInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.itemCode = builder.itemCode;
        this.mobile = builder.mobile;
        this.uId = builder.uId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventoryInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return uId
     */
    public Long getUId() {
        return this.uId;
    }

    public static final class Builder extends Request.Builder<GetInventoryInfoRequest, Builder> {
        private String instanceId; 
        private String itemCode; 
        private String mobile; 
        private Long uId; 

        private Builder() {
            super();
        } 

        private Builder(GetInventoryInfoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.itemCode = request.itemCode;
            this.mobile = request.mobile;
            this.uId = request.uId;
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
         * UId.
         */
        public Builder uId(Long uId) {
            this.putQueryParameter("UId", uId);
            this.uId = uId;
            return this;
        }

        @Override
        public GetInventoryInfoRequest build() {
            return new GetInventoryInfoRequest(this);
        } 

    } 

}
