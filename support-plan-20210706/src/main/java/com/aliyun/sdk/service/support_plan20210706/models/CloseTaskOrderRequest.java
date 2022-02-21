// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseTaskOrderRequest} extends {@link RequestModel}
 *
 * <p>CloseTaskOrderRequest</p>
 */
public class CloseTaskOrderRequest extends Request {
    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private String orderId;

    @Query
    @NameInMap("UserName")
    private String userName;

    private CloseTaskOrderRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseTaskOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CloseTaskOrderRequest, Builder> {
        private String orderId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CloseTaskOrderRequest response) {
            super(response);
            this.orderId = response.orderId;
            this.userName = response.userName;
        } 

        /**
         * 任务单id
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * 操作人姓名
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CloseTaskOrderRequest build() {
            return new CloseTaskOrderRequest(this);
        } 

    } 

}
