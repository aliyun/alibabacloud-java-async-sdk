// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetCheckPointResponse} extends {@link TeaModel}
 *
 * <p>GetCheckPointResponse</p>
 */
public class GetCheckPointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < GetCheckPointResponseBody> body;

    private GetCheckPointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetCheckPointResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List < GetCheckPointResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCheckPointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List < GetCheckPointResponseBody> body);

        @Override
        GetCheckPointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCheckPointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.List < GetCheckPointResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCheckPointResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List < GetCheckPointResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCheckPointResponse build() {
            return new GetCheckPointResponse(this);
        } 

    } 

    public static class GetCheckPointResponseBody extends TeaModel {
        @NameInMap("shard")
        private Integer shard;

        @NameInMap("checkpoint")
        private String checkpoint;

        @NameInMap("updateTime")
        private Long updateTime;

        @NameInMap("consumer")
        private String consumer;

        private GetCheckPointResponseBody(Builder builder) {
            this.shard = builder.shard;
            this.checkpoint = builder.checkpoint;
            this.updateTime = builder.updateTime;
            this.consumer = builder.consumer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetCheckPointResponseBody create() {
            return builder().build();
        }

        /**
         * @return shard
         */
        public Integer getShard() {
            return this.shard;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return consumer
         */
        public String getConsumer() {
            return this.consumer;
        }

        public static final class Builder {
            private Integer shard; 
            private String checkpoint; 
            private Long updateTime; 
            private String consumer; 

            /**
             * Shard ID。
             */
            public Builder shard(Integer shard) {
                this.shard = shard;
                return this;
            }

            /**
             * checkpoint.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * consumer.
             */
            public Builder consumer(String consumer) {
                this.consumer = consumer;
                return this;
            }

            public GetCheckPointResponseBody build() {
                return new GetCheckPointResponseBody(this);
            } 

        } 

    }
}
