// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HistoryThreeElementsVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>HistoryThreeElementsVerificationResponseBody</p>
 */
public class HistoryThreeElementsVerificationResponseBody extends TeaModel {
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

    private HistoryThreeElementsVerificationResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HistoryThreeElementsVerificationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(HistoryThreeElementsVerificationResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public HistoryThreeElementsVerificationResponseBody build() {
            return new HistoryThreeElementsVerificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HistoryThreeElementsVerificationResponseBody} extends {@link TeaModel}
     *
     * <p>HistoryThreeElementsVerificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsConsistent")
        private Long isConsistent;

        @com.aliyun.core.annotation.NameInMap("RequestCarrier")
        private String requestCarrier;

        private Data(Builder builder) {
            this.isConsistent = builder.isConsistent;
            this.requestCarrier = builder.requestCarrier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isConsistent
         */
        public Long getIsConsistent() {
            return this.isConsistent;
        }

        /**
         * @return requestCarrier
         */
        public String getRequestCarrier() {
            return this.requestCarrier;
        }

        public static final class Builder {
            private Long isConsistent; 
            private String requestCarrier; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.isConsistent = model.isConsistent;
                this.requestCarrier = model.requestCarrier;
            } 

            /**
             * IsConsistent.
             */
            public Builder isConsistent(Long isConsistent) {
                this.isConsistent = isConsistent;
                return this;
            }

            /**
             * RequestCarrier.
             */
            public Builder requestCarrier(String requestCarrier) {
                this.requestCarrier = requestCarrier;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
