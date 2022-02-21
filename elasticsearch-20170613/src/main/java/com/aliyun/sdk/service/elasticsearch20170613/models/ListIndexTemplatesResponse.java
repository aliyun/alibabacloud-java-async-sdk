// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIndexTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListIndexTemplatesResponse</p>
 */
public class ListIndexTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIndexTemplatesResponseBody body;

    private ListIndexTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIndexTemplatesResponse create() {
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
    public ListIndexTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIndexTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIndexTemplatesResponseBody body);

        @Override
        ListIndexTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIndexTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIndexTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIndexTemplatesResponse response) {
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
        public Builder body(ListIndexTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIndexTemplatesResponse build() {
            return new ListIndexTemplatesResponse(this);
        } 

    } 

}
