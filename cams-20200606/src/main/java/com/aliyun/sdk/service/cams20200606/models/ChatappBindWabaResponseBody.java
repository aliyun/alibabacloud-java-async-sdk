// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappBindWabaResponseBody} extends {@link TeaModel}
 *
 * <p>ChatappBindWabaResponseBody</p>
 */
public class ChatappBindWabaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ChatappBindWabaResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappBindWabaResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The HTTP status code returned.
         * <p>
         * 
         * *   A value of OK indicates that the call is successful.
         * *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ChatappBindWabaResponseBody build() {
            return new ChatappBindWabaResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustSpaceId")
        private String custSpaceId;

        @com.aliyun.core.annotation.NameInMap("WabaId")
        private String wabaId;

        private Data(Builder builder) {
            this.custSpaceId = builder.custSpaceId;
            this.wabaId = builder.wabaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return custSpaceId
         */
        public String getCustSpaceId() {
            return this.custSpaceId;
        }

        /**
         * @return wabaId
         */
        public String getWabaId() {
            return this.wabaId;
        }

        public static final class Builder {
            private String custSpaceId; 
            private String wabaId; 

            /**
             * The space ID of the user.
             */
            public Builder custSpaceId(String custSpaceId) {
                this.custSpaceId = custSpaceId;
                return this;
            }

            /**
             * The ID of the WhatsApp Business account.
             */
            public Builder wabaId(String wabaId) {
                this.wabaId = wabaId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
