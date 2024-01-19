// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderIdByPayIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderIdByPayIdResponseBody</p>
 */
public class QueryOrderIdByPayIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LmOrderIds")
    private LmOrderIds lmOrderIds;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryOrderIdByPayIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.lmOrderIds = builder.lmOrderIds;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderIdByPayIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return lmOrderIds
     */
    public LmOrderIds getLmOrderIds() {
        return this.lmOrderIds;
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
        private LmOrderIds lmOrderIds; 
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
         * LmOrderIds.
         */
        public Builder lmOrderIds(LmOrderIds lmOrderIds) {
            this.lmOrderIds = lmOrderIds;
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

        public QueryOrderIdByPayIdResponseBody build() {
            return new QueryOrderIdByPayIdResponseBody(this);
        } 

    } 

    public static class LmOrderIdsLmOrderIds extends TeaModel {
        @NameInMap("LmOrderId")
        private Long lmOrderId;

        private LmOrderIdsLmOrderIds(Builder builder) {
            this.lmOrderId = builder.lmOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderIdsLmOrderIds create() {
            return builder().build();
        }

        /**
         * @return lmOrderId
         */
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public static final class Builder {
            private Long lmOrderId; 

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(Long lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            public LmOrderIdsLmOrderIds build() {
                return new LmOrderIdsLmOrderIds(this);
            } 

        } 

    }
    public static class LmOrderIds extends TeaModel {
        @NameInMap("LmOrderIds")
        private java.util.List < LmOrderIdsLmOrderIds> lmOrderIds;

        private LmOrderIds(Builder builder) {
            this.lmOrderIds = builder.lmOrderIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderIds create() {
            return builder().build();
        }

        /**
         * @return lmOrderIds
         */
        public java.util.List < LmOrderIdsLmOrderIds> getLmOrderIds() {
            return this.lmOrderIds;
        }

        public static final class Builder {
            private java.util.List < LmOrderIdsLmOrderIds> lmOrderIds; 

            /**
             * LmOrderIds.
             */
            public Builder lmOrderIds(java.util.List < LmOrderIdsLmOrderIds> lmOrderIds) {
                this.lmOrderIds = lmOrderIds;
                return this;
            }

            public LmOrderIds build() {
                return new LmOrderIds(this);
            } 

        } 

    }
}
