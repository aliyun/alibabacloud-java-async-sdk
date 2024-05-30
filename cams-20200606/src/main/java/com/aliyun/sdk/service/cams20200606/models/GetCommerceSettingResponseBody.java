// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommerceSettingResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommerceSettingResponseBody</p>
 */
public class GetCommerceSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCommerceSettingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommerceSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCommerceSettingResponseBody build() {
            return new GetCommerceSettingResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CartEnable")
        private Boolean cartEnable;

        @com.aliyun.core.annotation.NameInMap("CatalogVisible")
        private Boolean catalogVisible;

        private Data(Builder builder) {
            this.cartEnable = builder.cartEnable;
            this.catalogVisible = builder.catalogVisible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cartEnable
         */
        public Boolean getCartEnable() {
            return this.cartEnable;
        }

        /**
         * @return catalogVisible
         */
        public Boolean getCatalogVisible() {
            return this.catalogVisible;
        }

        public static final class Builder {
            private Boolean cartEnable; 
            private Boolean catalogVisible; 

            /**
             * Indicates whether the shopping cart button is displayed.
             */
            public Builder cartEnable(Boolean cartEnable) {
                this.cartEnable = cartEnable;
                return this;
            }

            /**
             * Indicates whether the catalog button is displayed.
             */
            public Builder catalogVisible(Boolean catalogVisible) {
                this.catalogVisible = catalogVisible;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
