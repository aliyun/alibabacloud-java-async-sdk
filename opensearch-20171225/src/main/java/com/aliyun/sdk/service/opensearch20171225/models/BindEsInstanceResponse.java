// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindEsInstanceResponse} extends {@link TeaModel}
 *
 * <p>BindEsInstanceResponse</p>
 */
public class BindEsInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindEsInstanceResponseBody body;

    private BindEsInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindEsInstanceResponse create() {
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
    public BindEsInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindEsInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindEsInstanceResponseBody body);

        @Override
        BindEsInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindEsInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindEsInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindEsInstanceResponse response) {
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
        public Builder body(BindEsInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindEsInstanceResponse build() {
            return new BindEsInstanceResponse(this);
        } 

    } 

}
