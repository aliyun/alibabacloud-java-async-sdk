// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetHistogramsResponse} extends {@link TeaModel}
 *
 * <p>GetHistogramsResponse</p>
 */
public class GetHistogramsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < GetHistogramsResponseBody> body;

    private GetHistogramsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHistogramsResponse create() {
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
     * @return body
     */
    public java.util.List < GetHistogramsResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHistogramsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < GetHistogramsResponseBody> body);

        @Override
        GetHistogramsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHistogramsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < GetHistogramsResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHistogramsResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(java.util.List < GetHistogramsResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHistogramsResponse build() {
            return new GetHistogramsResponse(this);
        } 

    } 

    public static class GetHistogramsResponseBody extends TeaModel {
        @NameInMap("from")
        private Long from;

        @NameInMap("to")
        private Long to;

        @NameInMap("count")
        private Long count;

        @NameInMap("progress")
        private String progress;

        private GetHistogramsResponseBody(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
            this.count = builder.count;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetHistogramsResponseBody create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Long getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Long getTo() {
            return this.to;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private Long from; 
            private Long to; 
            private Long count; 
            private String progress; 

            /**
             * from.
             */
            public Builder from(Long from) {
                this.from = from;
                return this;
            }

            /**
             * to.
             */
            public Builder to(Long to) {
                this.to = to;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public GetHistogramsResponseBody build() {
                return new GetHistogramsResponseBody(this);
            } 

        } 

    }
}
