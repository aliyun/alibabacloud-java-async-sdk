// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDcdnKvResponse} extends {@link TeaModel}
 *
 * <p>ListDcdnKvResponse</p>
 */
public class ListDcdnKvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDcdnKvResponseBody body;

    private ListDcdnKvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDcdnKvResponse create() {
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
    public ListDcdnKvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDcdnKvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDcdnKvResponseBody body);

        @Override
        ListDcdnKvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDcdnKvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDcdnKvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDcdnKvResponse response) {
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
        public Builder body(ListDcdnKvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDcdnKvResponse build() {
            return new ListDcdnKvResponse(this);
        } 

    } 

}
