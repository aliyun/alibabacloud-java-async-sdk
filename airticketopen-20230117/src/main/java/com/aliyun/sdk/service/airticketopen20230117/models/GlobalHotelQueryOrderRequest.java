// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link GlobalHotelQueryOrderRequest} extends {@link RequestModel}
 *
 * <p>GlobalHotelQueryOrderRequest</p>
 */
public class GlobalHotelQueryOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalOrderNo")
    private String externalOrderNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderNo")
    private String orderNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private GlobalHotelQueryOrderRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.externalOrderNo = builder.externalOrderNo;
        this.orderNo = builder.orderNo;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalHotelQueryOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return externalOrderNo
     */
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    /**
     * @return orderNo
     */
    public String getOrderNo() {
        return this.orderNo;
    }

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder extends Request.Builder<GlobalHotelQueryOrderRequest, Builder> {
        private Long accountNo; 
        private String externalOrderNo; 
        private String orderNo; 
        private String tracerId; 

        private Builder() {
            super();
        } 

        private Builder(GlobalHotelQueryOrderRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.externalOrderNo = request.externalOrderNo;
            this.orderNo = request.orderNo;
            this.tracerId = request.tracerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * ExternalOrderNo.
         */
        public Builder externalOrderNo(String externalOrderNo) {
            this.putBodyParameter("ExternalOrderNo", externalOrderNo);
            this.externalOrderNo = externalOrderNo;
            return this;
        }

        /**
         * OrderNo.
         */
        public Builder orderNo(String orderNo) {
            this.putBodyParameter("OrderNo", orderNo);
            this.orderNo = orderNo;
            return this;
        }

        /**
         * <p>TracerId</p>
         * 
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        public Builder tracerId(String tracerId) {
            this.putBodyParameter("TracerId", tracerId);
            this.tracerId = tracerId;
            return this;
        }

        @Override
        public GlobalHotelQueryOrderRequest build() {
            return new GlobalHotelQueryOrderRequest(this);
        } 

    } 

}
