// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenesResponse} extends {@link TeaModel}
 *
 * <p>ListScenesResponse</p>
 */
public class ListScenesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScenesResponseBody body;

    private ListScenesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScenesResponse create() {
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
    public ListScenesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScenesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScenesResponseBody body);

        @Override
        ListScenesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScenesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScenesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScenesResponse response) {
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
        public Builder body(ListScenesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScenesResponse build() {
            return new ListScenesResponse(this);
        } 

    } 

}
