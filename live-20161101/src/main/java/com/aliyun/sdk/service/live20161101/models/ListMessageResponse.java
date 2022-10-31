// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageResponse} extends {@link TeaModel}
 *
 * <p>ListMessageResponse</p>
 */
public class ListMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMessageResponseBody body;

    private ListMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMessageResponse create() {
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
    public ListMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMessageResponseBody body);

        @Override
        ListMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMessageResponse response) {
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
        public Builder body(ListMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMessageResponse build() {
            return new ListMessageResponse(this);
        } 

    } 

}
