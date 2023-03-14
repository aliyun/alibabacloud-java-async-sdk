// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLayer7CustomPortsResponse} extends {@link TeaModel}
 *
 * <p>ListLayer7CustomPortsResponse</p>
 */
public class ListLayer7CustomPortsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLayer7CustomPortsResponseBody body;

    private ListLayer7CustomPortsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLayer7CustomPortsResponse create() {
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
    public ListLayer7CustomPortsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLayer7CustomPortsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLayer7CustomPortsResponseBody body);

        @Override
        ListLayer7CustomPortsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLayer7CustomPortsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLayer7CustomPortsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLayer7CustomPortsResponse response) {
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
        public Builder body(ListLayer7CustomPortsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLayer7CustomPortsResponse build() {
            return new ListLayer7CustomPortsResponse(this);
        } 

    } 

}
