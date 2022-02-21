// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMixResponse} extends {@link TeaModel}
 *
 * <p>ListMixResponse</p>
 */
public class ListMixResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMixResponseBody body;

    private ListMixResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMixResponse create() {
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
    public ListMixResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMixResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMixResponseBody body);

        @Override
        ListMixResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMixResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMixResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMixResponse response) {
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
        public Builder body(ListMixResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMixResponse build() {
            return new ListMixResponse(this);
        } 

    } 

}
