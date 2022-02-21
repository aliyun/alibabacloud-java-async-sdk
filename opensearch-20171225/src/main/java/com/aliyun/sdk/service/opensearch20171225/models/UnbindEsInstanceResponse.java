// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindEsInstanceResponse} extends {@link TeaModel}
 *
 * <p>UnbindEsInstanceResponse</p>
 */
public class UnbindEsInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindEsInstanceResponseBody body;

    private UnbindEsInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindEsInstanceResponse create() {
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
    public UnbindEsInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindEsInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindEsInstanceResponseBody body);

        @Override
        UnbindEsInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindEsInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindEsInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindEsInstanceResponse response) {
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
        public Builder body(UnbindEsInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindEsInstanceResponse build() {
            return new UnbindEsInstanceResponse(this);
        } 

    } 

}
