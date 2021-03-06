// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventSourcesResponse} extends {@link TeaModel}
 *
 * <p>ListEventSourcesResponse</p>
 */
public class ListEventSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEventSourcesResponseBody body;

    private ListEventSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEventSourcesResponse create() {
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
    public ListEventSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEventSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEventSourcesResponseBody body);

        @Override
        ListEventSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEventSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEventSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEventSourcesResponse response) {
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
        public Builder body(ListEventSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEventSourcesResponse build() {
            return new ListEventSourcesResponse(this);
        } 

    } 

}
