// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomPersonsResponse} extends {@link TeaModel}
 *
 * <p>ListCustomPersonsResponse</p>
 */
public class ListCustomPersonsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCustomPersonsResponseBody body;

    private ListCustomPersonsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCustomPersonsResponse create() {
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
    public ListCustomPersonsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCustomPersonsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCustomPersonsResponseBody body);

        @Override
        ListCustomPersonsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCustomPersonsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCustomPersonsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCustomPersonsResponse response) {
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
        public Builder body(ListCustomPersonsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCustomPersonsResponse build() {
            return new ListCustomPersonsResponse(this);
        } 

    } 

}
