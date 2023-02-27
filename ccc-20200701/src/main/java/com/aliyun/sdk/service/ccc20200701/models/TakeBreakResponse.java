// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TakeBreakResponse} extends {@link TeaModel}
 *
 * <p>TakeBreakResponse</p>
 */
public class TakeBreakResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TakeBreakResponseBody body;

    private TakeBreakResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TakeBreakResponse create() {
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
    public TakeBreakResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TakeBreakResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TakeBreakResponseBody body);

        @Override
        TakeBreakResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TakeBreakResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TakeBreakResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TakeBreakResponse response) {
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
        public Builder body(TakeBreakResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TakeBreakResponse build() {
            return new TakeBreakResponse(this);
        } 

    } 

}
