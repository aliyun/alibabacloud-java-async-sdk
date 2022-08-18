// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableApplicationApiInvokeResponse} extends {@link TeaModel}
 *
 * <p>EnableApplicationApiInvokeResponse</p>
 */
public class EnableApplicationApiInvokeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableApplicationApiInvokeResponseBody body;

    private EnableApplicationApiInvokeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableApplicationApiInvokeResponse create() {
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
    public EnableApplicationApiInvokeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableApplicationApiInvokeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableApplicationApiInvokeResponseBody body);

        @Override
        EnableApplicationApiInvokeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableApplicationApiInvokeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableApplicationApiInvokeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableApplicationApiInvokeResponse response) {
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
        public Builder body(EnableApplicationApiInvokeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableApplicationApiInvokeResponse build() {
            return new EnableApplicationApiInvokeResponse(this);
        } 

    } 

}
