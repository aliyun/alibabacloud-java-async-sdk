// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCatalogsResponse} extends {@link TeaModel}
 *
 * <p>ListCatalogsResponse</p>
 */
public class ListCatalogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCatalogsResponseBody body;

    private ListCatalogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCatalogsResponse create() {
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
    public ListCatalogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCatalogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCatalogsResponseBody body);

        @Override
        ListCatalogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCatalogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCatalogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCatalogsResponse response) {
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
        public Builder body(ListCatalogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCatalogsResponse build() {
            return new ListCatalogsResponse(this);
        } 

    } 

}
