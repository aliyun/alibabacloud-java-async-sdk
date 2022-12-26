// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionImageResponse} extends {@link TeaModel}
 *
 * <p>ListInterceptionImageResponse</p>
 */
public class ListInterceptionImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInterceptionImageResponseBody body;

    private ListInterceptionImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInterceptionImageResponse create() {
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
    public ListInterceptionImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInterceptionImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInterceptionImageResponseBody body);

        @Override
        ListInterceptionImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInterceptionImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInterceptionImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInterceptionImageResponse response) {
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
        public Builder body(ListInterceptionImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInterceptionImageResponse build() {
            return new ListInterceptionImageResponse(this);
        } 

    } 

}
