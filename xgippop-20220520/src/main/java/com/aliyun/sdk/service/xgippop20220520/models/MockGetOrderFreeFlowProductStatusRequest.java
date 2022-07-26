// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MockGetOrderFreeFlowProductStatusRequest} extends {@link RequestModel}
 *
 * <p>MockGetOrderFreeFlowProductStatusRequest</p>
 */
public class MockGetOrderFreeFlowProductStatusRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("CustomerFlowOrderId")
    @Validation(required = true)
    private String customerFlowOrderId;

    private MockGetOrderFreeFlowProductStatusRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.customerFlowOrderId = builder.customerFlowOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MockGetOrderFreeFlowProductStatusRequest create() {
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
     * @return customerFlowOrderId
     */
    public String getCustomerFlowOrderId() {
        return this.customerFlowOrderId;
    }

    public static final class Builder extends Request.Builder<MockGetOrderFreeFlowProductStatusRequest, Builder> {
        private Long aliUid; 
        private String customerFlowOrderId; 

        private Builder() {
            super();
        } 

        private Builder(MockGetOrderFreeFlowProductStatusRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.customerFlowOrderId = request.customerFlowOrderId;
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
         * 在订购接口2.1.9中引擎侧生成的id
         */
        public Builder customerFlowOrderId(String customerFlowOrderId) {
            this.putQueryParameter("CustomerFlowOrderId", customerFlowOrderId);
            this.customerFlowOrderId = customerFlowOrderId;
            return this;
        }

        @Override
        public MockGetOrderFreeFlowProductStatusRequest build() {
            return new MockGetOrderFreeFlowProductStatusRequest(this);
        } 

    } 

}
