// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorsResponse} extends {@link TeaModel}
 *
 * <p>ListQueryProcessorsResponse</p>
 */
public class ListQueryProcessorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQueryProcessorsResponseBody body;

    private ListQueryProcessorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQueryProcessorsResponse create() {
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
    public ListQueryProcessorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQueryProcessorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQueryProcessorsResponseBody body);

        @Override
        ListQueryProcessorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQueryProcessorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQueryProcessorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQueryProcessorsResponse response) {
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
        public Builder body(ListQueryProcessorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQueryProcessorsResponse build() {
            return new ListQueryProcessorsResponse(this);
        } 

    } 

}
