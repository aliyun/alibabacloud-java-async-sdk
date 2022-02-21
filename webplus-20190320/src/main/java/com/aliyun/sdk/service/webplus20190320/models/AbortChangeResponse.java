// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbortChangeResponse} extends {@link TeaModel}
 *
 * <p>AbortChangeResponse</p>
 */
public class AbortChangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AbortChangeResponseBody body;

    private AbortChangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AbortChangeResponse create() {
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
    public AbortChangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AbortChangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AbortChangeResponseBody body);

        @Override
        AbortChangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AbortChangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AbortChangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AbortChangeResponse response) {
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
        public Builder body(AbortChangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AbortChangeResponse build() {
            return new AbortChangeResponse(this);
        } 

    } 

}
