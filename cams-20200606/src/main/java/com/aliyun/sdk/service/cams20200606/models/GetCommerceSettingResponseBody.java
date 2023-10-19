// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommerceSettingResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommerceSettingResponseBody</p>
 */
public class GetCommerceSettingResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Id of the request
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
        @NameInMap("CartEnable")
        private Boolean cartEnable;

        @NameInMap("CatalogVisible")
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
             * CartEnable.
             */
            public Builder cartEnable(Boolean cartEnable) {
                this.cartEnable = cartEnable;
                return this;
            }

            /**
             * CatalogVisible.
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
