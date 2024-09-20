// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderDetailRequest} extends {@link RequestModel}
 *
 * <p>OrderDetailRequest</p>
 */
public class OrderDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_num")
    private Long orderNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_order_num")
    private String outOrderNum;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private OrderDetailRequest(Builder builder) {
        super(builder);
        this.orderNum = builder.orderNum;
        this.outOrderNum = builder.outOrderNum;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderNum
     */
    public Long getOrderNum() {
        return this.orderNum;
    }

    /**
     * @return outOrderNum
     */
    public String getOutOrderNum() {
        return this.outOrderNum;
    }

    /**
     * @return xAcsAirticketAccessToken
     */
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    /**
     * @return xAcsAirticketLanguage
     */
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

    public static final class Builder extends Request.Builder<OrderDetailRequest, Builder> {
        private Long orderNum; 
        private String outOrderNum; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(OrderDetailRequest request) {
            super(request);
            this.orderNum = request.orderNum;
            this.outOrderNum = request.outOrderNum;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * order_num.
         */
        public Builder orderNum(Long orderNum) {
            this.putQueryParameter("order_num", orderNum);
            this.orderNum = orderNum;
            return this;
        }

        /**
         * out_order_num.
         */
        public Builder outOrderNum(String outOrderNum) {
            this.putQueryParameter("out_order_num", outOrderNum);
            this.outOrderNum = outOrderNum;
            return this;
        }

        /**
         * access_token
         */
        public Builder xAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
            this.putHeaderParameter("x-acs-airticket-access-token", xAcsAirticketAccessToken);
            this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
            return this;
        }

        /**
         * x-acs-airticket-language.
         */
        public Builder xAcsAirticketLanguage(String xAcsAirticketLanguage) {
            this.putHeaderParameter("x-acs-airticket-language", xAcsAirticketLanguage);
            this.xAcsAirticketLanguage = xAcsAirticketLanguage;
            return this;
        }

        @Override
        public OrderDetailRequest build() {
            return new OrderDetailRequest(this);
        } 

    } 

}
