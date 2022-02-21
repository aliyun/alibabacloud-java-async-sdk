// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupTableResponse} extends {@link TeaModel}
 *
 * <p>SetupTableResponse</p>
 */
public class SetupTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetupTableResponseBody body;

    private SetupTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetupTableResponse create() {
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
    public SetupTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetupTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetupTableResponseBody body);

        @Override
        SetupTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetupTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetupTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetupTableResponse response) {
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
        public Builder body(SetupTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetupTableResponse build() {
            return new SetupTableResponse(this);
        } 

    } 

}
