// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllNodeResponse} extends {@link TeaModel}
 *
 * <p>ListAllNodeResponse</p>
 */
public class ListAllNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAllNodeResponseBody body;

    private ListAllNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAllNodeResponse create() {
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
    public ListAllNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAllNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAllNodeResponseBody body);

        @Override
        ListAllNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAllNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAllNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAllNodeResponse response) {
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
        public Builder body(ListAllNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAllNodeResponse build() {
            return new ListAllNodeResponse(this);
        } 

    } 

}
