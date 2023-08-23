// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAttemptsResponse} extends {@link TeaModel}
 *
 * <p>ListAttemptsResponse</p>
 */
public class ListAttemptsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAttemptsResponseBody body;

    private ListAttemptsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAttemptsResponse create() {
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
    public ListAttemptsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAttemptsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAttemptsResponseBody body);

        @Override
        ListAttemptsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAttemptsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAttemptsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAttemptsResponse response) {
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
        public Builder body(ListAttemptsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAttemptsResponse build() {
            return new ListAttemptsResponse(this);
        } 

    } 

}
