// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCouponResponseBody} extends {@link TeaModel}
 *
 * <p>SendCouponResponseBody</p>
 */
public class SendCouponResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ContextMap")
    private java.util.Map < String, ? > contextMap;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private SendCouponResponseBody(Builder builder) {
        this.code = builder.code;
        this.contextMap = builder.contextMap;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCouponResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contextMap
     */
    public java.util.Map < String, ? > getContextMap() {
        return this.contextMap;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map < String, ? > contextMap; 
        private Integer count; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ContextMap.
         */
        public Builder contextMap(java.util.Map < String, ? > contextMap) {
            this.contextMap = contextMap;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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
         * RequestId.
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SendCouponResponseBody build() {
            return new SendCouponResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Amount")
        private Double amount;

        @NameInMap("Uid")
        private Long uid;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("YouhuiId")
        private Long youhuiId;

        private Data(Builder builder) {
            this.amount = builder.amount;
            this.uid = builder.uid;
            this.userId = builder.userId;
            this.youhuiId = builder.youhuiId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return youhuiId
         */
        public Long getYouhuiId() {
            return this.youhuiId;
        }

        public static final class Builder {
            private Double amount; 
            private Long uid; 
            private Long userId; 
            private Long youhuiId; 

            /**
             * Amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * YouhuiId.
             */
            public Builder youhuiId(Long youhuiId) {
                this.youhuiId = youhuiId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
