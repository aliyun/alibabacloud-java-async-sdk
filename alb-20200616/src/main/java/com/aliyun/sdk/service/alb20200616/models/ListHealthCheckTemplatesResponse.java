// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHealthCheckTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListHealthCheckTemplatesResponse</p>
 */
public class ListHealthCheckTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHealthCheckTemplatesResponseBody body;

    private ListHealthCheckTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHealthCheckTemplatesResponse create() {
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
    public ListHealthCheckTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHealthCheckTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHealthCheckTemplatesResponseBody body);

        @Override
        ListHealthCheckTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHealthCheckTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHealthCheckTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHealthCheckTemplatesResponse response) {
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
        public Builder body(ListHealthCheckTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHealthCheckTemplatesResponse build() {
            return new ListHealthCheckTemplatesResponse(this);
        } 

    } 

}
