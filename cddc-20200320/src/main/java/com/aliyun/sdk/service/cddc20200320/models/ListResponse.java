// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResponse} extends {@link TeaModel}
 *
 * <p>ListResponse</p>
 */
public class ListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResponseBody body;

    private ListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResponse create() {
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
    public ListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResponseBody body);

        @Override
        ListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResponse response) {
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
        public Builder body(ListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResponse build() {
            return new ListResponse(this);
        } 

    } 

}
