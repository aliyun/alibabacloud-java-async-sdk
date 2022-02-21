// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkipPreCheckResponse} extends {@link TeaModel}
 *
 * <p>SkipPreCheckResponse</p>
 */
public class SkipPreCheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SkipPreCheckResponseBody body;

    private SkipPreCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SkipPreCheckResponse create() {
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
    public SkipPreCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SkipPreCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SkipPreCheckResponseBody body);

        @Override
        SkipPreCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SkipPreCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SkipPreCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SkipPreCheckResponse response) {
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
        public Builder body(SkipPreCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SkipPreCheckResponse build() {
            return new SkipPreCheckResponse(this);
        } 

    } 

}
