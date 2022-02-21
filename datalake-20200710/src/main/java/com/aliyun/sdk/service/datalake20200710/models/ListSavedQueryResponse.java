// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSavedQueryResponse} extends {@link TeaModel}
 *
 * <p>ListSavedQueryResponse</p>
 */
public class ListSavedQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSavedQueryResponseBody body;

    private ListSavedQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSavedQueryResponse create() {
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
    public ListSavedQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSavedQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSavedQueryResponseBody body);

        @Override
        ListSavedQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSavedQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSavedQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSavedQueryResponse response) {
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
        public Builder body(ListSavedQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSavedQueryResponse build() {
            return new ListSavedQueryResponse(this);
        } 

    } 

}
