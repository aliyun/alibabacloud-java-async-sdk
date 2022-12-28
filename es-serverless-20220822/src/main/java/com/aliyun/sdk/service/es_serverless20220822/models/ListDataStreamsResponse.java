// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataStreamsResponse} extends {@link TeaModel}
 *
 * <p>ListDataStreamsResponse</p>
 */
public class ListDataStreamsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataStreamsResponseBody body;

    private ListDataStreamsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataStreamsResponse create() {
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
    public ListDataStreamsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataStreamsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataStreamsResponseBody body);

        @Override
        ListDataStreamsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataStreamsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataStreamsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataStreamsResponse response) {
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
        public Builder body(ListDataStreamsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataStreamsResponse build() {
            return new ListDataStreamsResponse(this);
        } 

    } 

}
