// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link GetCustomResourceStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomResourceStatsResponseBody</p>
 */
public class GetCustomResourceStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCustomResourceStatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomResourceStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCustomResourceStatsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetCustomResourceStatsResponseBody build() {
            return new GetCustomResourceStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomResourceStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomResourceStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomResourceCount")
        private Long customResourceCount;

        @com.aliyun.core.annotation.NameInMap("EffectiveCount")
        private Long effectiveCount;

        @com.aliyun.core.annotation.NameInMap("NoCustomResourceCount")
        private Long noCustomResourceCount;

        @com.aliyun.core.annotation.NameInMap("UnEffectiveCount")
        private Long unEffectiveCount;

        private Data(Builder builder) {
            this.customResourceCount = builder.customResourceCount;
            this.effectiveCount = builder.effectiveCount;
            this.noCustomResourceCount = builder.noCustomResourceCount;
            this.unEffectiveCount = builder.unEffectiveCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customResourceCount
         */
        public Long getCustomResourceCount() {
            return this.customResourceCount;
        }

        /**
         * @return effectiveCount
         */
        public Long getEffectiveCount() {
            return this.effectiveCount;
        }

        /**
         * @return noCustomResourceCount
         */
        public Long getNoCustomResourceCount() {
            return this.noCustomResourceCount;
        }

        /**
         * @return unEffectiveCount
         */
        public Long getUnEffectiveCount() {
            return this.unEffectiveCount;
        }

        public static final class Builder {
            private Long customResourceCount; 
            private Long effectiveCount; 
            private Long noCustomResourceCount; 
            private Long unEffectiveCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.customResourceCount = model.customResourceCount;
                this.effectiveCount = model.effectiveCount;
                this.noCustomResourceCount = model.noCustomResourceCount;
                this.unEffectiveCount = model.unEffectiveCount;
            } 

            /**
             * CustomResourceCount.
             */
            public Builder customResourceCount(Long customResourceCount) {
                this.customResourceCount = customResourceCount;
                return this;
            }

            /**
             * EffectiveCount.
             */
            public Builder effectiveCount(Long effectiveCount) {
                this.effectiveCount = effectiveCount;
                return this;
            }

            /**
             * NoCustomResourceCount.
             */
            public Builder noCustomResourceCount(Long noCustomResourceCount) {
                this.noCustomResourceCount = noCustomResourceCount;
                return this;
            }

            /**
             * UnEffectiveCount.
             */
            public Builder unEffectiveCount(Long unEffectiveCount) {
                this.unEffectiveCount = unEffectiveCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
