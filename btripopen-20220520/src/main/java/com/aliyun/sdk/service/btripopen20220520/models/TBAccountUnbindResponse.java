// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TBAccountUnbindResponse} extends {@link TeaModel}
 *
 * <p>TBAccountUnbindResponse</p>
 */
public class TBAccountUnbindResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TBAccountUnbindResponseBody body;

    private TBAccountUnbindResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TBAccountUnbindResponse create() {
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
    public TBAccountUnbindResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TBAccountUnbindResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TBAccountUnbindResponseBody body);

        @Override
        TBAccountUnbindResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TBAccountUnbindResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TBAccountUnbindResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TBAccountUnbindResponse response) {
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
        public Builder body(TBAccountUnbindResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TBAccountUnbindResponse build() {
            return new TBAccountUnbindResponse(this);
        } 

    } 

}
