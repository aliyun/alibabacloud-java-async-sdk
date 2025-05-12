// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetInstantScoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstantScoreResponseBody</p>
 */
public class GetInstantScoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetInstantScoreResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstantScoreResponseBody create() {
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

        private Builder() {
        } 

        private Builder(GetInstantScoreResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>集群ID</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstantScoreResponseBody build() {
            return new GetInstantScoreResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstantScoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstantScoreResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("error")
        private Float error;

        @com.aliyun.core.annotation.NameInMap("latency")
        private Float latency;

        @com.aliyun.core.annotation.NameInMap("load")
        private Float load;

        @com.aliyun.core.annotation.NameInMap("saturation")
        private Float saturation;

        @com.aliyun.core.annotation.NameInMap("total")
        private Float total;

        private Data(Builder builder) {
            this.error = builder.error;
            this.latency = builder.latency;
            this.load = builder.load;
            this.saturation = builder.saturation;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Float getError() {
            return this.error;
        }

        /**
         * @return latency
         */
        public Float getLatency() {
            return this.latency;
        }

        /**
         * @return load
         */
        public Float getLoad() {
            return this.load;
        }

        /**
         * @return saturation
         */
        public Float getSaturation() {
            return this.saturation;
        }

        /**
         * @return total
         */
        public Float getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Float error; 
            private Float latency; 
            private Float load; 
            private Float saturation; 
            private Float total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.error = model.error;
                this.latency = model.latency;
                this.load = model.load;
                this.saturation = model.saturation;
                this.total = model.total;
            } 

            /**
             * error.
             */
            public Builder error(Float error) {
                this.error = error;
                return this;
            }

            /**
             * latency.
             */
            public Builder latency(Float latency) {
                this.latency = latency;
                return this;
            }

            /**
             * load.
             */
            public Builder load(Float load) {
                this.load = load;
                return this;
            }

            /**
             * saturation.
             */
            public Builder saturation(Float saturation) {
                this.saturation = saturation;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Float total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
