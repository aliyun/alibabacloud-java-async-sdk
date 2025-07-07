// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateLivyComputeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLivyComputeResponseBody</p>
 */
public class CreateLivyComputeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateLivyComputeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLivyComputeResponseBody create() {
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

        private Builder(CreateLivyComputeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLivyComputeResponseBody build() {
            return new CreateLivyComputeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateLivyComputeResponseBody} extends {@link TeaModel}
     *
     * <p>CreateLivyComputeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("livyComputeId")
        private String livyComputeId;

        private Data(Builder builder) {
            this.livyComputeId = builder.livyComputeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return livyComputeId
         */
        public String getLivyComputeId() {
            return this.livyComputeId;
        }

        public static final class Builder {
            private String livyComputeId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.livyComputeId = model.livyComputeId;
            } 

            /**
             * livyComputeId.
             */
            public Builder livyComputeId(String livyComputeId) {
                this.livyComputeId = livyComputeId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
