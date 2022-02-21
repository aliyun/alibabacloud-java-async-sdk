// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChangeSetsResponse} extends {@link TeaModel}
 *
 * <p>ListChangeSetsResponse</p>
 */
public class ListChangeSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListChangeSetsResponseBody body;

    private ListChangeSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListChangeSetsResponse create() {
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
    public ListChangeSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListChangeSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListChangeSetsResponseBody body);

        @Override
        ListChangeSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListChangeSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListChangeSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListChangeSetsResponse response) {
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
        public Builder body(ListChangeSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListChangeSetsResponse build() {
            return new ListChangeSetsResponse(this);
        } 

    } 

}
