// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotelOrderDetailResponseBody</p>
 */
public class GetHotelOrderDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private GetHotelOrderDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public GetHotelOrderDetailResponseBody build() {
            return new GetHotelOrderDetailResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ApplyAmt")
        private Long applyAmt;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("ItemUrl")
        private String itemUrl;

        @NameInMap("Name")
        private String name;

        @NameInMap("Quantity")
        private Long quantity;

        private Result(Builder builder) {
            this.applyAmt = builder.applyAmt;
            this.gmtCreate = builder.gmtCreate;
            this.itemUrl = builder.itemUrl;
            this.name = builder.name;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return applyAmt
         */
        public Long getApplyAmt() {
            return this.applyAmt;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return itemUrl
         */
        public String getItemUrl() {
            return this.itemUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private Long applyAmt; 
            private Long gmtCreate; 
            private String itemUrl; 
            private String name; 
            private Long quantity; 

            /**
             * ApplyAmt.
             */
            public Builder applyAmt(Long applyAmt) {
                this.applyAmt = applyAmt;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ItemUrl.
             */
            public Builder itemUrl(String itemUrl) {
                this.itemUrl = itemUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
