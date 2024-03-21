// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlipayUrlRequest} extends {@link RequestModel}
 *
 * <p>GetAlipayUrlRequest</p>
 */
public class GetAlipayUrlRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

    @Query
    @NameInMap("ReturnUrl")
    private String returnUrl;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private GetAlipayUrlRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.orderId = builder.orderId;
        this.returnUrl = builder.returnUrl;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlipayUrlRequest create() {
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
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return returnUrl
     */
    public String getReturnUrl() {
        return this.returnUrl;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetAlipayUrlRequest, Builder> {
        private String bizType; 
        private Long orderId; 
        private String returnUrl; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetAlipayUrlRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.orderId = request.orderId;
            this.returnUrl = request.returnUrl;
            this.type = request.type;
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
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * ReturnUrl.
         */
        public Builder returnUrl(String returnUrl) {
            this.putQueryParameter("ReturnUrl", returnUrl);
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetAlipayUrlRequest build() {
            return new GetAlipayUrlRequest(this);
        } 

    } 

}
