// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindPersonResponse} extends {@link TeaModel}
 *
 * <p>BindPersonResponse</p>
 */
public class BindPersonResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindPersonResponseBody body;

    private BindPersonResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindPersonResponse create() {
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
    public BindPersonResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindPersonResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindPersonResponseBody body);

        @Override
        BindPersonResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindPersonResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindPersonResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindPersonResponse response) {
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
        public Builder body(BindPersonResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindPersonResponse build() {
            return new BindPersonResponse(this);
        } 

    } 

}
