// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListSavedSearchResponse} extends {@link TeaModel}
 *
 * <p>ListSavedSearchResponse</p>
 */
public class ListSavedSearchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSavedSearchResponseBody body;

    private ListSavedSearchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSavedSearchResponse create() {
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
    public ListSavedSearchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSavedSearchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSavedSearchResponseBody body);

        @Override
        ListSavedSearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSavedSearchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSavedSearchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSavedSearchResponse response) {
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
        public Builder body(ListSavedSearchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSavedSearchResponse build() {
            return new ListSavedSearchResponse(this);
        } 

    } 

}
