// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVideosResponse} extends {@link TeaModel}
 *
 * <p>ListVideosResponse</p>
 */
public class ListVideosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVideosResponseBody body;

    private ListVideosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVideosResponse create() {
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
    public ListVideosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVideosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVideosResponseBody body);

        @Override
        ListVideosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVideosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVideosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVideosResponse response) {
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
        public Builder body(ListVideosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVideosResponse build() {
            return new ListVideosResponse(this);
        } 

    } 

}
