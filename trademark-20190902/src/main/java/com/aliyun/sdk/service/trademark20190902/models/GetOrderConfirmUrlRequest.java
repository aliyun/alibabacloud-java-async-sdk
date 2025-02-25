// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderConfirmUrlRequest} extends {@link RequestModel}
 *
 * <p>GetOrderConfirmUrlRequest</p>
 */
public class GetOrderConfirmUrlRequest extends Request {
    @Query
    @NameInMap("Items")
    private java.util.List < Items> items;

    @Query
    @NameInMap("OutTraceCode")
    private String outTraceCode;

    @Query
    @NameInMap("OutTraceType")
    private String outTraceType;

    private GetOrderConfirmUrlRequest(Builder builder) {
        super(builder);
        this.items = builder.items;
        this.outTraceCode = builder.outTraceCode;
        this.outTraceType = builder.outTraceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderConfirmUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return outTraceCode
     */
    public String getOutTraceCode() {
        return this.outTraceCode;
    }

    /**
     * @return outTraceType
     */
    public String getOutTraceType() {
        return this.outTraceType;
    }

    public static final class Builder extends Request.Builder<GetOrderConfirmUrlRequest, Builder> {
        private java.util.List < Items> items; 
        private String outTraceCode; 
        private String outTraceType; 

        private Builder() {
            super();
        } 

        private Builder(GetOrderConfirmUrlRequest request) {
            super(request);
            this.items = request.items;
            this.outTraceCode = request.outTraceCode;
            this.outTraceType = request.outTraceType;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.putQueryParameter("Items", items);
            this.items = items;
            return this;
        }

        /**
         * OutTraceCode.
         */
        public Builder outTraceCode(String outTraceCode) {
            this.putQueryParameter("OutTraceCode", outTraceCode);
            this.outTraceCode = outTraceCode;
            return this;
        }

        /**
         * OutTraceType.
         */
        public Builder outTraceType(String outTraceType) {
            this.putQueryParameter("OutTraceType", outTraceType);
            this.outTraceType = outTraceType;
            return this;
        }

        @Override
        public GetOrderConfirmUrlRequest build() {
            return new GetOrderConfirmUrlRequest(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("ItemCode")
        private String itemCode;

        @NameInMap("Quantity")
        private Long quantity;

        private Items(Builder builder) {
            this.itemCode = builder.itemCode;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return itemCode
         */
        public String getItemCode() {
            return this.itemCode;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private String itemCode; 
            private Long quantity; 

            /**
             * ItemCode.
             */
            public Builder itemCode(String itemCode) {
                this.itemCode = itemCode;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
