// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamAuthCheckingResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamAuthCheckingResponse</p>
 */
public class DescribeLiveStreamAuthCheckingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveStreamAuthCheckingResponseBody body;

    private DescribeLiveStreamAuthCheckingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveStreamAuthCheckingResponse create() {
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
    public DescribeLiveStreamAuthCheckingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveStreamAuthCheckingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveStreamAuthCheckingResponseBody body);

        @Override
        DescribeLiveStreamAuthCheckingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveStreamAuthCheckingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveStreamAuthCheckingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveStreamAuthCheckingResponse response) {
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
        public Builder body(DescribeLiveStreamAuthCheckingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveStreamAuthCheckingResponse build() {
            return new DescribeLiveStreamAuthCheckingResponse(this);
        } 

    } 

}
