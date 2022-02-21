// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorNersResponse} extends {@link TeaModel}
 *
 * <p>ListQueryProcessorNersResponse</p>
 */
public class ListQueryProcessorNersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQueryProcessorNersResponseBody body;

    private ListQueryProcessorNersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQueryProcessorNersResponse create() {
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
    public ListQueryProcessorNersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQueryProcessorNersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQueryProcessorNersResponseBody body);

        @Override
        ListQueryProcessorNersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQueryProcessorNersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQueryProcessorNersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQueryProcessorNersResponse response) {
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
        public Builder body(ListQueryProcessorNersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQueryProcessorNersResponse build() {
            return new ListQueryProcessorNersResponse(this);
        } 

    } 

}
