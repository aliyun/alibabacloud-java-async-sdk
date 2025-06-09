// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetCheckPointResponse} extends {@link TeaModel}
 *
 * <p>GetCheckPointResponse</p>
 */
public class GetCheckPointResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<GetCheckPointResponseBody> body;

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
    public java.util.Map<String, String> getHeaders() {
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
    public java.util.List<GetCheckPointResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCheckPointResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<GetCheckPointResponseBody> body);

        @Override
        GetCheckPointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCheckPointResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<GetCheckPointResponseBody> body; 

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
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(java.util.List<GetCheckPointResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCheckPointResponse build() {
            return new GetCheckPointResponse(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckPointResponse} extends {@link TeaModel}
     *
     * <p>GetCheckPointResponse</p>
     */
    public static class GetCheckPointResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("shard")
        private Integer shard;

        @com.aliyun.core.annotation.NameInMap("checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("consumer")
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

            private Builder() {
            } 

            private Builder(GetCheckPointResponseBody model) {
                this.shard = model.shard;
                this.checkpoint = model.checkpoint;
                this.updateTime = model.updateTime;
                this.consumer = model.consumer;
            } 

            /**
             * <p>The shard ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder shard(Integer shard) {
                this.shard = shard;
                return this;
            }

            /**
             * <p>The value of the checkpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>MTUyNDE1NTM3OTM3MzkwODQ5Ng==</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The time when the checkpoint was last updated. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1524224984800922</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The consumer at the checkpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer_1</p>
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
