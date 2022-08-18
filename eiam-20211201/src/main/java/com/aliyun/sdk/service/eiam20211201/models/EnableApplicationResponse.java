// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableApplicationResponse} extends {@link TeaModel}
 *
 * <p>EnableApplicationResponse</p>
 */
public class EnableApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableApplicationResponseBody body;

    private EnableApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableApplicationResponse create() {
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
    public EnableApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableApplicationResponseBody body);

        @Override
        EnableApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableApplicationResponse response) {
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
        public Builder body(EnableApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableApplicationResponse build() {
            return new EnableApplicationResponse(this);
        } 

    } 

}
