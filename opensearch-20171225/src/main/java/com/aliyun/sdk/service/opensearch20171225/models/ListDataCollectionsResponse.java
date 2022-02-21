// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataCollectionsResponse} extends {@link TeaModel}
 *
 * <p>ListDataCollectionsResponse</p>
 */
public class ListDataCollectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataCollectionsResponseBody body;

    private ListDataCollectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataCollectionsResponse create() {
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
    public ListDataCollectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataCollectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataCollectionsResponseBody body);

        @Override
        ListDataCollectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataCollectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataCollectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataCollectionsResponse response) {
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
        public Builder body(ListDataCollectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataCollectionsResponse build() {
            return new ListDataCollectionsResponse(this);
        } 

    } 

}
