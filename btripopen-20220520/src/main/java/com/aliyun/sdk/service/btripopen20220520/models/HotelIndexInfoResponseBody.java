// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelIndexInfoResponseBody} extends {@link TeaModel}
 *
 * <p>HotelIndexInfoResponseBody</p>
 */
public class HotelIndexInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private HotelIndexInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelIndexInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public HotelIndexInfoResponseBody build() {
            return new HotelIndexInfoResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hotel_id")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("hotel_status")
        private String hotelStatus;

        private Items(Builder builder) {
            this.hotelId = builder.hotelId;
            this.hotelStatus = builder.hotelStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return hotelStatus
         */
        public String getHotelStatus() {
            return this.hotelStatus;
        }

        public static final class Builder {
            private String hotelId; 
            private String hotelStatus; 

            /**
             * hotel_id.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * hotel_status.
             */
            public Builder hotelStatus(String hotelStatus) {
                this.hotelStatus = hotelStatus;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("page_token")
        private String pageToken;

        private Module(Builder builder) {
            this.items = builder.items;
            this.pageSize = builder.pageSize;
            this.pageToken = builder.pageToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pageToken
         */
        public String getPageToken() {
            return this.pageToken;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer pageSize; 
            private String pageToken; 

            /**
             * items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * page_token.
             */
            public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
