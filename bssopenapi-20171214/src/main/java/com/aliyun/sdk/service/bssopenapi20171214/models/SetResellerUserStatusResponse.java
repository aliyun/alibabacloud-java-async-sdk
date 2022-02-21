// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetResellerUserStatusResponse} extends {@link TeaModel}
 *
 * <p>SetResellerUserStatusResponse</p>
 */
public class SetResellerUserStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetResellerUserStatusResponseBody body;

    private SetResellerUserStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetResellerUserStatusResponse create() {
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
    public SetResellerUserStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetResellerUserStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetResellerUserStatusResponseBody body);

        @Override
        SetResellerUserStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetResellerUserStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetResellerUserStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetResellerUserStatusResponse response) {
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
        public Builder body(SetResellerUserStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetResellerUserStatusResponse build() {
            return new SetResellerUserStatusResponse(this);
        } 

    } 

}
