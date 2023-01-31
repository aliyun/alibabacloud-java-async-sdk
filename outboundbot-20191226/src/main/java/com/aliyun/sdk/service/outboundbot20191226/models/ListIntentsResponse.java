// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntentsResponse} extends {@link TeaModel}
 *
 * <p>ListIntentsResponse</p>
 */
public class ListIntentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIntentsResponseBody body;

    private ListIntentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIntentsResponse create() {
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
    public ListIntentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIntentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIntentsResponseBody body);

        @Override
        ListIntentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIntentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIntentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIntentsResponse response) {
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
        public Builder body(ListIntentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIntentsResponse build() {
            return new ListIntentsResponse(this);
        } 

    } 

}
