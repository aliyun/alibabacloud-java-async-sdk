// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelsResponse} extends {@link TeaModel}
 *
 * <p>ListHotelsResponse</p>
 */
public class ListHotelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotelsResponseBody body;

    private ListHotelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotelsResponse create() {
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
    public ListHotelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotelsResponseBody body);

        @Override
        ListHotelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotelsResponse response) {
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
        public Builder body(ListHotelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotelsResponse build() {
            return new ListHotelsResponse(this);
        } 

    } 

}
