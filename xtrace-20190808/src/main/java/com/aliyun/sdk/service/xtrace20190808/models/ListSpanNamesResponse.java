// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpanNamesResponse} extends {@link TeaModel}
 *
 * <p>ListSpanNamesResponse</p>
 */
public class ListSpanNamesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSpanNamesResponseBody body;

    private ListSpanNamesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSpanNamesResponse create() {
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
    public ListSpanNamesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSpanNamesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSpanNamesResponseBody body);

        @Override
        ListSpanNamesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSpanNamesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSpanNamesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSpanNamesResponse response) {
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
        public Builder body(ListSpanNamesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSpanNamesResponse build() {
            return new ListSpanNamesResponse(this);
        } 

    } 

}
