// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindDriverFromEdgeInstanceResponse} extends {@link TeaModel}
 *
 * <p>UnbindDriverFromEdgeInstanceResponse</p>
 */
public class UnbindDriverFromEdgeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindDriverFromEdgeInstanceResponseBody body;

    private UnbindDriverFromEdgeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindDriverFromEdgeInstanceResponse create() {
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
    public UnbindDriverFromEdgeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindDriverFromEdgeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindDriverFromEdgeInstanceResponseBody body);

        @Override
        UnbindDriverFromEdgeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindDriverFromEdgeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindDriverFromEdgeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindDriverFromEdgeInstanceResponse response) {
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
        public Builder body(UnbindDriverFromEdgeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindDriverFromEdgeInstanceResponse build() {
            return new UnbindDriverFromEdgeInstanceResponse(this);
        } 

    } 

}
